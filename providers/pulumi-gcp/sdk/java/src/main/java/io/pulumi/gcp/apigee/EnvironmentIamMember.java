// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigee;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.apigee.EnvironmentIamMemberArgs;
import io.pulumi.gcp.apigee.inputs.EnvironmentIamMemberState;
import io.pulumi.gcp.apigee.outputs.EnvironmentIamMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Apigee Environment. Each of these resources serves a different use case:
 * 
 * * `gcp.apigee.EnvironmentIamPolicy`: Authoritative. Sets the IAM policy for the environment and replaces any existing policy already attached.
 * * `gcp.apigee.EnvironmentIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the environment are preserved.
 * * `gcp.apigee.EnvironmentIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the environment are preserved.
 * 
 * > **Note:** `gcp.apigee.EnvironmentIamPolicy` **cannot** be used in conjunction with `gcp.apigee.EnvironmentIamBinding` and `gcp.apigee.EnvironmentIamMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.apigee.EnvironmentIamBinding` resources **can be** used in conjunction with `gcp.apigee.EnvironmentIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_apigee\_environment\_iam\_policy
 * 
 * ## google\_apigee\_environment\_iam\_binding
 * 
 * ## google\_apigee\_environment\_iam\_member
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* {{org_id}}/environments/{{name}} * {{name}} Any variables not passed in the import command will be taken from the provider configuration. Apigee environment IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/environmentIamMember:EnvironmentIamMember editor "{{org_id}}/environments/{{environment}} roles/viewer user:jane@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/environmentIamMember:EnvironmentIamMember editor "{{org_id}}/environments/{{environment}} roles/viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/environmentIamMember:EnvironmentIamMember editor {{org_id}}/environments/{{environment}}
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:apigee/environmentIamMember:EnvironmentIamMember")
public class EnvironmentIamMember extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=EnvironmentIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ EnvironmentIamMemberCondition> condition;

    public Output</* @Nullable */ EnvironmentIamMemberCondition> getCondition() {
        return this.condition;
    }
    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @OutputExport(name="envId", type=String.class, parameters={})
    private Output<String> envId;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> getEnvId() {
        return this.envId;
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
    @OutputExport(name="orgId", type=String.class, parameters={})
    private Output<String> orgId;

    public Output<String> getOrgId() {
        return this.orgId;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.apigee.EnvironmentIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.apigee.EnvironmentIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnvironmentIamMember(String name, EnvironmentIamMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/environmentIamMember:EnvironmentIamMember", name, args == null ? EnvironmentIamMemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EnvironmentIamMember(String name, Input<String> id, @Nullable EnvironmentIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/environmentIamMember:EnvironmentIamMember", name, state, makeResourceOptions(options, id));
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
    public static EnvironmentIamMember get(String name, Input<String> id, @Nullable EnvironmentIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EnvironmentIamMember(name, id, state, options);
    }
}
