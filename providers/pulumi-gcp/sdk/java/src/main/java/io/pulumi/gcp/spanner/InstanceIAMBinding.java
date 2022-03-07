// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.spanner;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.spanner.InstanceIAMBindingArgs;
import io.pulumi.gcp.spanner.inputs.InstanceIAMBindingState;
import io.pulumi.gcp.spanner.outputs.InstanceIAMBindingCondition;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for a Spanner instance. Each of these resources serves a different use case:
 * 
 * * `gcp.spanner.InstanceIAMPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
 * 
 * > **Warning:** It's entirely possibly to lock yourself out of your instance using `gcp.spanner.InstanceIAMPolicy`. Any permissions granted by default will be removed unless you include them in your config.
 * 
 * * `gcp.spanner.InstanceIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
 * * `gcp.spanner.InstanceIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
 * 
 * > **Note:** `gcp.spanner.InstanceIAMPolicy` **cannot** be used in conjunction with `gcp.spanner.InstanceIAMBinding` and `gcp.spanner.InstanceIAMMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.spanner.InstanceIAMBinding` resources **can be** used in conjunction with `gcp.spanner.InstanceIAMMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_spanner\_instance\_iam\_policy
 * 
 * ## google\_spanner\_instance\_iam\_binding
 * 
 * ## google\_spanner\_instance\_iam\_member
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* {{project}}/{{name}} * {{name}} (project is taken from provider project) IAM member imports use space-delimited identifiers; the resource in question, the role, and the account, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:spanner/instanceIAMBinding:InstanceIAMBinding instance "project-name/instance-name roles/viewer user:foo@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiers; the resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:spanner/instanceIAMBinding:InstanceIAMBinding instance "project-name/instance-name roles/viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:spanner/instanceIAMBinding:InstanceIAMBinding instance project-name/instance-name
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:spanner/instanceIAMBinding:InstanceIAMBinding")
public class InstanceIAMBinding extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=InstanceIAMBindingCondition.class, parameters={})
    private Output</* @Nullable */ InstanceIAMBindingCondition> condition;

    public Output</* @Nullable */ InstanceIAMBindingCondition> getCondition() {
        return this.condition;
    }
    /**
     * (Computed) The etag of the instance's IAM policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the instance's IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The name of the instance.
     * 
     */
    @OutputExport(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    /**
     * @return The name of the instance.
     * 
     */
    public Output<String> getInstance() {
        return this.instance;
    }
    @OutputExport(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.spanner.InstanceIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.spanner.InstanceIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }

    public interface BuilderApplicator {
        public void apply(InstanceIAMBindingArgs.Builder a);
    }
    private static io.pulumi.gcp.spanner.InstanceIAMBindingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.spanner.InstanceIAMBindingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public InstanceIAMBinding(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceIAMBinding(String name) {
        this(name, InstanceIAMBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceIAMBinding(String name, InstanceIAMBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceIAMBinding(String name, InstanceIAMBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:spanner/instanceIAMBinding:InstanceIAMBinding", name, args == null ? InstanceIAMBindingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private InstanceIAMBinding(String name, Input<String> id, @Nullable InstanceIAMBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:spanner/instanceIAMBinding:InstanceIAMBinding", name, state, makeResourceOptions(options, id));
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
    public static InstanceIAMBinding get(String name, Input<String> id, @Nullable InstanceIAMBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InstanceIAMBinding(name, id, state, options);
    }
}