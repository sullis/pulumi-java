// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.healthcare.DatasetIamMemberArgs;
import io.pulumi.gcp.healthcare.inputs.DatasetIamMemberState;
import io.pulumi.gcp.healthcare.outputs.DatasetIamMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Healthcare dataset. Each of these resources serves a different use case:
 * 
 * * `gcp.healthcare.DatasetIamPolicy`: Authoritative. Sets the IAM policy for the dataset and replaces any existing policy already attached.
 * * `gcp.healthcare.DatasetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataset are preserved.
 * * `gcp.healthcare.DatasetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataset are preserved.
 * 
 * > **Note:** `gcp.healthcare.DatasetIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.DatasetIamBinding` and `gcp.healthcare.DatasetIamMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.healthcare.DatasetIamBinding` resources **can be** used in conjunction with `gcp.healthcare.DatasetIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_healthcare\_dataset\_iam\_policy
 * 
 * ## google\_healthcare\_dataset\_iam\_binding
 * 
 * ## google\_healthcare\_dataset\_iam\_member
 * 
 * ## Import
 * 
 * IAM member imports use space-delimited identifiers; the resource in question, the role, and the account.
 * 
 * This member resource can be imported using the `dataset_id`, role, and account e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/datasetIamMember:DatasetIamMember dataset_iam "your-project-id/location-name/dataset-name roles/viewer user:foo@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiers; the resource in question and the role.
 * 
 * This binding resource can be imported using the `dataset_id` and role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/datasetIamMember:DatasetIamMember dataset_iam "your-project-id/location-name/dataset-name roles/viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question.
 * 
 * This policy resource can be imported using the `dataset_id`, role, and account e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/datasetIamMember:DatasetIamMember dataset_iam your-project-id/location-name/dataset-name
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:healthcare/datasetIamMember:DatasetIamMember")
public class DatasetIamMember extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=DatasetIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ DatasetIamMemberCondition> condition;

    public Output</* @Nullable */ DatasetIamMemberCondition> getCondition() {
        return this.condition;
    }
    /**
     * The dataset ID, in the form
     * `{project_id}/{location_name}/{dataset_name}` or
     * `{location_name}/{dataset_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @OutputExport(name="datasetId", type=String.class, parameters={})
    private Output<String> datasetId;

    /**
     * @return The dataset ID, in the form
     * `{project_id}/{location_name}/{dataset_name}` or
     * `{location_name}/{dataset_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    public Output<String> getDatasetId() {
        return this.datasetId;
    }
    /**
     * (Computed) The etag of the dataset's IAM policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the dataset's IAM policy.
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
     * The role that should be applied. Only one
     * `gcp.healthcare.DatasetIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.healthcare.DatasetIamBinding` can be used per role. Note that custom roles must be of the format
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
    public DatasetIamMember(String name, DatasetIamMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/datasetIamMember:DatasetIamMember", name, args == null ? DatasetIamMemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DatasetIamMember(String name, Input<String> id, @Nullable DatasetIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/datasetIamMember:DatasetIamMember", name, state, makeResourceOptions(options, id));
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
    public static DatasetIamMember get(String name, Input<String> id, @Nullable DatasetIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DatasetIamMember(name, id, state, options);
    }
}
