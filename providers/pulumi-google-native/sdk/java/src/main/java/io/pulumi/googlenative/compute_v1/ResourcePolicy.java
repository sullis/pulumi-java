// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.ResourcePolicyArgs;
import io.pulumi.googlenative.compute_v1.outputs.ResourcePolicyGroupPlacementPolicyResponse;
import io.pulumi.googlenative.compute_v1.outputs.ResourcePolicyInstanceSchedulePolicyResponse;
import io.pulumi.googlenative.compute_v1.outputs.ResourcePolicyResourceStatusResponse;
import io.pulumi.googlenative.compute_v1.outputs.ResourcePolicySnapshotSchedulePolicyResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new resource policy.
 * 
 */
@ResourceType(type="google-native:compute/v1:ResourcePolicy")
public class ResourcePolicy extends io.pulumi.resources.CustomResource {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Resource policy for instances for placement configuration.
     * 
     */
    @OutputExport(name="groupPlacementPolicy", type=ResourcePolicyGroupPlacementPolicyResponse.class, parameters={})
    private Output<ResourcePolicyGroupPlacementPolicyResponse> groupPlacementPolicy;

    /**
     * @return Resource policy for instances for placement configuration.
     * 
     */
    public Output<ResourcePolicyGroupPlacementPolicyResponse> getGroupPlacementPolicy() {
        return this.groupPlacementPolicy;
    }
    /**
     * Resource policy for scheduling instance operations.
     * 
     */
    @OutputExport(name="instanceSchedulePolicy", type=ResourcePolicyInstanceSchedulePolicyResponse.class, parameters={})
    private Output<ResourcePolicyInstanceSchedulePolicyResponse> instanceSchedulePolicy;

    /**
     * @return Resource policy for scheduling instance operations.
     * 
     */
    public Output<ResourcePolicyInstanceSchedulePolicyResponse> getInstanceSchedulePolicy() {
        return this.instanceSchedulePolicy;
    }
    /**
     * Type of the resource. Always compute#resource_policies for resource policies.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#resource_policies for resource policies.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The system status of the resource policy.
     * 
     */
    @OutputExport(name="resourceStatus", type=ResourcePolicyResourceStatusResponse.class, parameters={})
    private Output<ResourcePolicyResourceStatusResponse> resourceStatus;

    /**
     * @return The system status of the resource policy.
     * 
     */
    public Output<ResourcePolicyResourceStatusResponse> getResourceStatus() {
        return this.resourceStatus;
    }
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined fully-qualified URL for this resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Resource policy for persistent disks for creating snapshots.
     * 
     */
    @OutputExport(name="snapshotSchedulePolicy", type=ResourcePolicySnapshotSchedulePolicyResponse.class, parameters={})
    private Output<ResourcePolicySnapshotSchedulePolicyResponse> snapshotSchedulePolicy;

    /**
     * @return Resource policy for persistent disks for creating snapshots.
     * 
     */
    public Output<ResourcePolicySnapshotSchedulePolicyResponse> getSnapshotSchedulePolicy() {
        return this.snapshotSchedulePolicy;
    }
    /**
     * The status of resource policy creation.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of resource policy creation.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }

    public interface BuilderApplicator {
        public void apply(ResourcePolicyArgs.Builder a);
    }
    private static io.pulumi.googlenative.compute_v1.ResourcePolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.compute_v1.ResourcePolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ResourcePolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourcePolicy(String name) {
        this(name, ResourcePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourcePolicy(String name, ResourcePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourcePolicy(String name, ResourcePolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:ResourcePolicy", name, args == null ? ResourcePolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResourcePolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:ResourcePolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ResourcePolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourcePolicy(name, id, options);
    }
}