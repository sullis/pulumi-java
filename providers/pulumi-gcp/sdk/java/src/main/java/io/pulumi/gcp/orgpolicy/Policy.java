// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.orgpolicy;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.orgpolicy.PolicyArgs;
import io.pulumi.gcp.orgpolicy.inputs.PolicyState;
import io.pulumi.gcp.orgpolicy.outputs.PolicySpec;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * An organization policy gives you programmatic control over your organization's cloud resources.  Using Organization Policies, you will be able to configure constraints across your entire resource hierarchy.
 * 
 * For more information, see:
 * * [Understanding Org Policy concepts](https://cloud.google.com/resource-manager/docs/organization-policy/overview)
 * * [The resource hierarchy](https://cloud.google.com/resource-manager/docs/cloud-platform-resource-hierarchy)
 * * [All valid constraints](https://cloud.google.com/resource-manager/docs/organization-policy/org-policy-constraints)
 * ## Example Usage
 * 
 * ## Import
 * 
 * Policy can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:orgpolicy/policy:Policy default {{parent}}/policies/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:orgpolicy/policy:Policy default {{parent}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:orgpolicy/policy:Policy")
public class Policy extends io.pulumi.resources.CustomResource {
    /**
     * Immutable. The resource name of the Policy. Must be one of the following forms, where constraint_name is the name of the constraint which this Policy configures: * `projects/{project_number}/policies/{constraint_name}` * `folders/{folder_id}/policies/{constraint_name}` * `organizations/{organization_id}/policies/{constraint_name}` For example, "projects/123/policies/compute.disableSerialPortAccess". Note: `projects/{project_id}/policies/{constraint_name}` is also an acceptable name for API requests, but responses will return the name using the equivalent project number.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The resource name of the Policy. Must be one of the following forms, where constraint_name is the name of the constraint which this Policy configures: * `projects/{project_number}/policies/{constraint_name}` * `folders/{folder_id}/policies/{constraint_name}` * `organizations/{organization_id}/policies/{constraint_name}` For example, "projects/123/policies/compute.disableSerialPortAccess". Note: `projects/{project_id}/policies/{constraint_name}` is also an acceptable name for API requests, but responses will return the name using the equivalent project number.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The parent of the resource.
     * 
     */
    @OutputExport(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The parent of the resource.
     * 
     */
    public Output<String> getParent() {
        return this.parent;
    }
    /**
     * Basic information about the Organization Policy.
     * 
     */
    @OutputExport(name="spec", type=PolicySpec.class, parameters={})
    private Output</* @Nullable */ PolicySpec> spec;

    /**
     * @return Basic information about the Organization Policy.
     * 
     */
    public Output</* @Nullable */ PolicySpec> getSpec() {
        return this.spec;
    }

    public interface BuilderApplicator {
        public void apply(PolicyArgs.Builder a);
    }
    private static io.pulumi.gcp.orgpolicy.PolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.orgpolicy.PolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Policy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Policy(String name) {
        this(name, PolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Policy(String name, PolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Policy(String name, PolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:orgpolicy/policy:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Policy(String name, Input<String> id, @Nullable PolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:orgpolicy/policy:Policy", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Policy get(String name, Input<String> id, @Nullable PolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, state, options);
    }
}