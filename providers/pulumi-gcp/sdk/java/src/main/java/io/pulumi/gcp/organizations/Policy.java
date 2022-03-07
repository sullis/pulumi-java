// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.organizations.PolicyArgs;
import io.pulumi.gcp.organizations.inputs.PolicyState;
import io.pulumi.gcp.organizations.outputs.PolicyBooleanPolicy;
import io.pulumi.gcp.organizations.outputs.PolicyListPolicy;
import io.pulumi.gcp.organizations.outputs.PolicyRestorePolicy;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Allows management of Organization Policies for a Google Cloud Organization.
 * 
 * > **Warning:** This resource has been superseded by `gcp.orgpolicy.Policy`. `gcp.orgpolicy.Policy` uses Organization Policy API V2 instead of Cloud Resource Manager API V1 and it supports additional features such as tags and conditions.
 * 
 * To get more information about Organization Policies, see:
 * 
 * * [API documentation](https://cloud.google.com/resource-manager/reference/rest/v1/organizations/setOrgPolicy)
 * * How-to Guides
 *     * [Introduction to the Organization Policy Service](https://cloud.google.com/resource-manager/docs/organization-policy/overview)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Organization Policies can be imported using the `org_id` and the `constraint`, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:organizations/policy:Policy services_policy 123456789/constraints/serviceuser.services
 * ```
 * 
 *  It is all right if the constraint contains a slash, as in the example above.
 * 
 */
@ResourceType(type="gcp:organizations/policy:Policy")
public class Policy extends io.pulumi.resources.CustomResource {
    /**
     * A boolean policy is a constraint that is either enforced or not. Structure is documented
     * below.
     * 
     */
    @OutputExport(name="booleanPolicy", type=PolicyBooleanPolicy.class, parameters={})
    private Output</* @Nullable */ PolicyBooleanPolicy> booleanPolicy;

    /**
     * @return A boolean policy is a constraint that is either enforced or not. Structure is documented
     * below.
     * 
     */
    public Output</* @Nullable */ PolicyBooleanPolicy> getBooleanPolicy() {
        return this.booleanPolicy;
    }
    /**
     * The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
     * 
     */
    @OutputExport(name="constraint", type=String.class, parameters={})
    private Output<String> constraint;

    /**
     * @return The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
     * 
     */
    public Output<String> getConstraint() {
        return this.constraint;
    }
    /**
     * (Computed) The etag of the organization policy. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the organization policy. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
     * 
     */
    @OutputExport(name="listPolicy", type=PolicyListPolicy.class, parameters={})
    private Output</* @Nullable */ PolicyListPolicy> listPolicy;

    /**
     * @return A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
     * 
     */
    public Output</* @Nullable */ PolicyListPolicy> getListPolicy() {
        return this.listPolicy;
    }
    /**
     * The numeric ID of the organization to set the policy for.
     * 
     */
    @OutputExport(name="orgId", type=String.class, parameters={})
    private Output<String> orgId;

    /**
     * @return The numeric ID of the organization to set the policy for.
     * 
     */
    public Output<String> getOrgId() {
        return this.orgId;
    }
    /**
     * A restore policy is a constraint to restore the default policy. Structure is documented below.
     * 
     */
    @OutputExport(name="restorePolicy", type=PolicyRestorePolicy.class, parameters={})
    private Output</* @Nullable */ PolicyRestorePolicy> restorePolicy;

    /**
     * @return A restore policy is a constraint to restore the default policy. Structure is documented below.
     * 
     */
    public Output</* @Nullable */ PolicyRestorePolicy> getRestorePolicy() {
        return this.restorePolicy;
    }
    /**
     * (Computed) The timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds, representing when the variable was last updated. Example: "2016-10-09T12:33:37.578138407Z".
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return (Computed) The timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds, representing when the variable was last updated. Example: "2016-10-09T12:33:37.578138407Z".
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Version of the Policy. Default version is 0.
     * 
     */
    @OutputExport(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    /**
     * @return Version of the Policy. Default version is 0.
     * 
     */
    public Output<Integer> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(PolicyArgs.Builder a);
    }
    private static io.pulumi.gcp.organizations.PolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.organizations.PolicyArgs.builder();
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
        super("gcp:organizations/policy:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Policy(String name, Input<String> id, @Nullable PolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/policy:Policy", name, state, makeResourceOptions(options, id));
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