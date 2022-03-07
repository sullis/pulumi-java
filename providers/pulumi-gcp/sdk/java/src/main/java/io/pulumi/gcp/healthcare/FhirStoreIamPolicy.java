// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.healthcare.FhirStoreIamPolicyArgs;
import io.pulumi.gcp.healthcare.inputs.FhirStoreIamPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Healthcare FHIR store. Each of these resources serves a different use case:
 * 
 * * `gcp.healthcare.FhirStoreIamPolicy`: Authoritative. Sets the IAM policy for the FHIR store and replaces any existing policy already attached.
 * * `gcp.healthcare.FhirStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the FHIR store are preserved.
 * * `gcp.healthcare.FhirStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the FHIR store are preserved.
 * 
 * > **Note:** `gcp.healthcare.FhirStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.FhirStoreIamBinding` and `gcp.healthcare.FhirStoreIamMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.healthcare.FhirStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.FhirStoreIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_healthcare\_fhir\_store\_iam\_policy
 * 
 * ## google\_healthcare\_fhir\_store\_iam\_binding
 * 
 * ## google\_healthcare\_fhir\_store\_iam\_member
 * 
 * ## Import
 * 
 * IAM member imports use space-delimited identifiers; the resource in question, the role, and the account.
 * 
 * This member resource can be imported using the `fhir_store_id`, role, and account e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/fhirStoreIamPolicy:FhirStoreIamPolicy fhir_store_iam "your-project-id/location-name/dataset-name/fhir-store-name roles/viewer user:foo@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiers; the resource in question and the role.
 * 
 * This binding resource can be imported using the `fhir_store_id` and role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/fhirStoreIamPolicy:FhirStoreIamPolicy fhir_store_iam "your-project-id/location-name/dataset-name/fhir-store-name roles/viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question.
 * 
 * This policy resource can be imported using the `fhir_store_id`, role, and account e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/fhirStoreIamPolicy:FhirStoreIamPolicy fhir_store_iam your-project-id/location-name/dataset-name/fhir-store-name
 * ```
 * 
 */
@ResourceType(type="gcp:healthcare/fhirStoreIamPolicy:FhirStoreIamPolicy")
public class FhirStoreIamPolicy extends io.pulumi.resources.CustomResource {
    /**
     * (Computed) The etag of the FHIR store's IAM policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the FHIR store's IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The FHIR store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
     * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @OutputExport(name="fhirStoreId", type=String.class, parameters={})
    private Output<String> fhirStoreId;

    /**
     * @return The FHIR store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
     * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    public Output<String> getFhirStoreId() {
        return this.fhirStoreId;
    }
    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @OutputExport(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> getPolicyData() {
        return this.policyData;
    }

    public interface BuilderApplicator {
        public void apply(FhirStoreIamPolicyArgs.Builder a);
    }
    private static io.pulumi.gcp.healthcare.FhirStoreIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.healthcare.FhirStoreIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FhirStoreIamPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FhirStoreIamPolicy(String name) {
        this(name, FhirStoreIamPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FhirStoreIamPolicy(String name, FhirStoreIamPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FhirStoreIamPolicy(String name, FhirStoreIamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/fhirStoreIamPolicy:FhirStoreIamPolicy", name, args == null ? FhirStoreIamPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FhirStoreIamPolicy(String name, Input<String> id, @Nullable FhirStoreIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/fhirStoreIamPolicy:FhirStoreIamPolicy", name, state, makeResourceOptions(options, id));
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
    public static FhirStoreIamPolicy get(String name, Input<String> id, @Nullable FhirStoreIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FhirStoreIamPolicy(name, id, state, options);
    }
}