// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.SubnetworkIAMMemberArgs;
import io.pulumi.gcp.compute.inputs.SubnetworkIAMMemberState;
import io.pulumi.gcp.compute.outputs.SubnetworkIAMMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Compute Engine Subnetwork. Each of these resources serves a different use case:
 * 
 * * `gcp.compute.SubnetworkIAMPolicy`: Authoritative. Sets the IAM policy for the subnetwork and replaces any existing policy already attached.
 * * `gcp.compute.SubnetworkIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the subnetwork are preserved.
 * * `gcp.compute.SubnetworkIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the subnetwork are preserved.
 * 
 * > **Note:** `gcp.compute.SubnetworkIAMPolicy` **cannot** be used in conjunction with `gcp.compute.SubnetworkIAMBinding` and `gcp.compute.SubnetworkIAMMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.compute.SubnetworkIAMBinding` resources **can be** used in conjunction with `gcp.compute.SubnetworkIAMMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_compute\_subnetwork\_iam\_policy
 * 
 * With IAM Conditions:
 * ## google\_compute\_subnetwork\_iam\_binding
 * 
 * With IAM Conditions:
 * ## google\_compute\_subnetwork\_iam\_member
 * 
 * With IAM Conditions:
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/regions/{{region}}/subnetworks/{{name}} * {{project}}/{{region}}/{{name}} * {{region}}/{{name}} * {{name}} Any variables not passed in the import command will be taken from the provider configuration. Compute Engine subnetwork IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:compute/subnetworkIAMMember:SubnetworkIAMMember editor "projects/{{project}}/regions/{{region}}/subnetworks/{{subnetwork}} roles/compute.networkUser user:jane@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:compute/subnetworkIAMMember:SubnetworkIAMMember editor "projects/{{project}}/regions/{{region}}/subnetworks/{{subnetwork}} roles/compute.networkUser"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:compute/subnetworkIAMMember:SubnetworkIAMMember editor projects/{{project}}/regions/{{region}}/subnetworks/{{subnetwork}}
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:compute/subnetworkIAMMember:SubnetworkIAMMember")
public class SubnetworkIAMMember extends io.pulumi.resources.CustomResource {
    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="condition", type=SubnetworkIAMMemberCondition.class, parameters={})
    private Output</* @Nullable */ SubnetworkIAMMemberCondition> condition;

    /**
     * @return ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ SubnetworkIAMMemberCondition> getCondition() {
        return this.condition;
    }
    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The GCP region for this subnetwork.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The GCP region for this subnetwork.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.compute.SubnetworkIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.compute.SubnetworkIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }
    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @OutputExport(name="subnetwork", type=String.class, parameters={})
    private Output<String> subnetwork;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> getSubnetwork() {
        return this.subnetwork;
    }

    public interface BuilderApplicator {
        public void apply(SubnetworkIAMMemberArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.SubnetworkIAMMemberArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.SubnetworkIAMMemberArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SubnetworkIAMMember(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SubnetworkIAMMember(String name) {
        this(name, SubnetworkIAMMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SubnetworkIAMMember(String name, SubnetworkIAMMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SubnetworkIAMMember(String name, SubnetworkIAMMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/subnetworkIAMMember:SubnetworkIAMMember", name, args == null ? SubnetworkIAMMemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SubnetworkIAMMember(String name, Input<String> id, @Nullable SubnetworkIAMMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/subnetworkIAMMember:SubnetworkIAMMember", name, state, makeResourceOptions(options, id));
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
    public static SubnetworkIAMMember get(String name, Input<String> id, @Nullable SubnetworkIAMMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SubnetworkIAMMember(name, id, state, options);
    }
}