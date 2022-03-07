// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.gkehub_v1beta1.MembershipArgs;
import io.pulumi.googlenative.gkehub_v1beta1.outputs.AuthorityResponse;
import io.pulumi.googlenative.gkehub_v1beta1.outputs.MembershipEndpointResponse;
import io.pulumi.googlenative.gkehub_v1beta1.outputs.MembershipStateResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new Membership. **This is currently only supported for GKE clusters on Google Cloud**. To register other clusters, follow the instructions at https://cloud.google.com/anthos/multicluster-management/connect/registering-a-cluster.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:gkehub/v1beta1:Membership")
public class Membership extends io.pulumi.resources.CustomResource {
    /**
     * Optional. How to identify workloads from this Membership. See the documentation on Workload Identity for more details: https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     * 
     */
    @OutputExport(name="authority", type=AuthorityResponse.class, parameters={})
    private Output<AuthorityResponse> authority;

    /**
     * @return Optional. How to identify workloads from this Membership. See the documentation on Workload Identity for more details: https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     * 
     */
    public Output<AuthorityResponse> getAuthority() {
        return this.authority;
    }
    /**
     * When the Membership was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return When the Membership was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * When the Membership was deleted.
     * 
     */
    @OutputExport(name="deleteTime", type=String.class, parameters={})
    private Output<String> deleteTime;

    /**
     * @return When the Membership was deleted.
     * 
     */
    public Output<String> getDeleteTime() {
        return this.deleteTime;
    }
    /**
     * Optional. Description of this membership, limited to 63 characters. Must match the regex: `a-zA-Z0-9*`
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. Description of this membership, limited to 63 characters. Must match the regex: `a-zA-Z0-9*`
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Optional. Endpoint information to reach this member.
     * 
     */
    @OutputExport(name="endpoint", type=MembershipEndpointResponse.class, parameters={})
    private Output<MembershipEndpointResponse> endpoint;

    /**
     * @return Optional. Endpoint information to reach this member.
     * 
     */
    public Output<MembershipEndpointResponse> getEndpoint() {
        return this.endpoint;
    }
    /**
     * Optional. An externally-generated and managed ID for this Membership. This ID may be modified after creation, but this is not recommended. For GKE clusters, external_id is managed by the Hub API and updates will be ignored. The ID must match the regex: `a-zA-Z0-9*` If this Membership represents a Kubernetes cluster, this value should be set to the UID of the `kube-system` namespace object.
     * 
     */
    @OutputExport(name="externalId", type=String.class, parameters={})
    private Output<String> externalId;

    /**
     * @return Optional. An externally-generated and managed ID for this Membership. This ID may be modified after creation, but this is not recommended. For GKE clusters, external_id is managed by the Hub API and updates will be ignored. The ID must match the regex: `a-zA-Z0-9*` If this Membership represents a Kubernetes cluster, this value should be set to the UID of the `kube-system` namespace object.
     * 
     */
    public Output<String> getExternalId() {
        return this.externalId;
    }
    /**
     * Optional. The infrastructure type this Membership is running on.
     * 
     */
    @OutputExport(name="infrastructureType", type=String.class, parameters={})
    private Output<String> infrastructureType;

    /**
     * @return Optional. The infrastructure type this Membership is running on.
     * 
     */
    public Output<String> getInfrastructureType() {
        return this.infrastructureType;
    }
    /**
     * Optional. GCP labels for this membership.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. GCP labels for this membership.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * For clusters using Connect, the timestamp of the most recent connection established with Google Cloud. This time is updated every several minutes, not continuously. For clusters that do not use GKE Connect, or that have never connected successfully, this field will be unset.
     * 
     */
    @OutputExport(name="lastConnectionTime", type=String.class, parameters={})
    private Output<String> lastConnectionTime;

    /**
     * @return For clusters using Connect, the timestamp of the most recent connection established with Google Cloud. This time is updated every several minutes, not continuously. For clusters that do not use GKE Connect, or that have never connected successfully, this field will be unset.
     * 
     */
    public Output<String> getLastConnectionTime() {
        return this.lastConnectionTime;
    }
    /**
     * The full, unique name of this Membership resource in the format `projects/*{@literal /}locations/*{@literal /}memberships/{membership_id}`, set during creation. `membership_id` must be a valid RFC 1123 compliant DNS label: 1. At most 63 characters in length 2. It must consist of lower case alphanumeric characters or `-` 3. It must start and end with an alphanumeric character Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`, with a maximum length of 63 characters.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The full, unique name of this Membership resource in the format `projects/*{@literal /}locations/*{@literal /}memberships/{membership_id}`, set during creation. `membership_id` must be a valid RFC 1123 compliant DNS label: 1. At most 63 characters in length 2. It must consist of lower case alphanumeric characters or `-` 3. It must start and end with an alphanumeric character Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`, with a maximum length of 63 characters.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * State of the Membership resource.
     * 
     */
    @OutputExport(name="state", type=MembershipStateResponse.class, parameters={})
    private Output<MembershipStateResponse> state;

    /**
     * @return State of the Membership resource.
     * 
     */
    public Output<MembershipStateResponse> getState() {
        return this.state;
    }
    /**
     * Google-generated UUID for this resource. This is unique across all Membership resources. If a Membership resource is deleted and another resource with the same name is created, it gets a different unique_id.
     * 
     */
    @OutputExport(name="uniqueId", type=String.class, parameters={})
    private Output<String> uniqueId;

    /**
     * @return Google-generated UUID for this resource. This is unique across all Membership resources. If a Membership resource is deleted and another resource with the same name is created, it gets a different unique_id.
     * 
     */
    public Output<String> getUniqueId() {
        return this.uniqueId;
    }
    /**
     * When the Membership was last updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return When the Membership was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(MembershipArgs.Builder a);
    }
    private static io.pulumi.googlenative.gkehub_v1beta1.MembershipArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.gkehub_v1beta1.MembershipArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Membership(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Membership(String name) {
        this(name, MembershipArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Membership(String name, MembershipArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Membership(String name, MembershipArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gkehub/v1beta1:Membership", name, args == null ? MembershipArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Membership(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gkehub/v1beta1:Membership", name, null, makeResourceOptions(options, id));
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
    public static Membership get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Membership(name, id, options);
    }
}