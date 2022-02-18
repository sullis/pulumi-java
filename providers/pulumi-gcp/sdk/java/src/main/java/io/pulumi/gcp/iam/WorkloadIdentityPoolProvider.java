// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iam;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs;
import io.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderState;
import io.pulumi.gcp.iam.outputs.WorkloadIdentityPoolProviderAws;
import io.pulumi.gcp.iam.outputs.WorkloadIdentityPoolProviderOidc;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A configuration for an external identity provider.
 * 
 * To get more information about WorkloadIdentityPoolProvider, see:
 * 
 * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1beta/projects.locations.workloadIdentityPools.providers)
 * * How-to Guides
 *     * [Managing workload identity providers](https://cloud.google.com/iam/docs/manage-workload-identity-pools-providers#managing_workload_identity_providers)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * WorkloadIdentityPoolProvider can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:iam/workloadIdentityPoolProvider:WorkloadIdentityPoolProvider default projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}/providers/{{workload_identity_pool_provider_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:iam/workloadIdentityPoolProvider:WorkloadIdentityPoolProvider default {{project}}/{{workload_identity_pool_id}}/{{workload_identity_pool_provider_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:iam/workloadIdentityPoolProvider:WorkloadIdentityPoolProvider default {{workload_identity_pool_id}}/{{workload_identity_pool_provider_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:iam/workloadIdentityPoolProvider:WorkloadIdentityPoolProvider")
public class WorkloadIdentityPoolProvider extends io.pulumi.resources.CustomResource {
    /**
     * [A Common Expression Language](https://opensource.google/projects/cel) expression, in
     * plain text, to restrict what otherwise valid authentication credentials issued by the
     * provider should not be accepted.
     * The expression must output a boolean representing whether to allow the federation.
     * The following keywords may be referenced in the expressions:
     * * `assertion`: JSON representing the authentication credential issued by the provider.
     * * `google`: The Google attributes mapped from the assertion in the `attribute_mappings`.
     * * `attribute`: The custom attributes mapped from the assertion in the `attribute_mappings`.
     *   The maximum length of the attribute condition expression is 4096 characters. If
     *   unspecified, all valid authentication credential are accepted.
     *   The following example shows how to only allow credentials with a mapped `google.groups`
     *   value of `admins`:
     * 
     */
    @OutputExport(name="attributeCondition", type=String.class, parameters={})
    private Output</* @Nullable */ String> attributeCondition;

    /**
     * @return [A Common Expression Language](https://opensource.google/projects/cel) expression, in
     * plain text, to restrict what otherwise valid authentication credentials issued by the
     * provider should not be accepted.
     * The expression must output a boolean representing whether to allow the federation.
     * The following keywords may be referenced in the expressions:
     * * `assertion`: JSON representing the authentication credential issued by the provider.
     * * `google`: The Google attributes mapped from the assertion in the `attribute_mappings`.
     * * `attribute`: The custom attributes mapped from the assertion in the `attribute_mappings`.
     *   The maximum length of the attribute condition expression is 4096 characters. If
     *   unspecified, all valid authentication credential are accepted.
     *   The following example shows how to only allow credentials with a mapped `google.groups`
     *   value of `admins`:
     * 
     */
    public Output</* @Nullable */ String> getAttributeCondition() {
        return this.attributeCondition;
    }
    /**
     * Maps attributes from authentication credentials issued by an external identity provider
     * to Google Cloud attributes, such as `subject` and `segment`.
     * Each key must be a string specifying the Google Cloud IAM attribute to map to.
     * The following keys are supported:
     * * `google.subject`: The principal IAM is authenticating. You can reference this value
     *   in IAM bindings. This is also the subject that appears in Cloud Logging logs.
     *   Cannot exceed 127 characters.
     * * `google.groups`: Groups the external identity belongs to. You can grant groups
     *   access to resources using an IAM `principalSet` binding; access applies to all
     *   members of the group.
     *   You can also provide custom attributes by specifying `attribute.{custom_attribute}`,
     *   where `{custom_attribute}` is the name of the custom attribute to be mapped. You can
     *   define a maximum of 50 custom attributes. The maximum length of a mapped attribute key
     *   is 100 characters, and the key may only contain the characters [a-z0-9_].
     *   You can reference these attributes in IAM policies to define fine-grained access for a
     *   workload to Google Cloud resources. For example:
     * * `google.subject`:
     *   `principal://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/subject/{value}`
     * * `google.groups`:
     *   `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}`
     * * `attribute.{custom_attribute}`:
     *   `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}`
     *   Each value must be a [Common Expression Language](https://opensource.google/projects/cel)
     *   function that maps an identity provider credential to the normalized attribute specified
     *   by the corresponding map key.
     *   You can use the `assertion` keyword in the expression to access a JSON representation of
     *   the authentication credential issued by the provider.
     *   The maximum length of an attribute mapping expression is 2048 characters. When evaluated,
     *   the total size of all mapped attributes must not exceed 8KB.
     *   For AWS providers, the following rules apply:
     * - If no attribute mapping is defined, the following default mapping applies:
     * - If any custom attribute mappings are defined, they must include a mapping to the
     *   `google.subject` attribute.
     *   For OIDC providers, the following rules apply:
     * - Custom attribute mappings must be defined, and must include a mapping to the
     *   `google.subject` attribute. For example, the following maps the `sub` claim of the
     *   incoming credential to the `subject` attribute on a Google token.
     * 
     */
    @OutputExport(name="attributeMapping", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> attributeMapping;

    /**
     * @return Maps attributes from authentication credentials issued by an external identity provider
     * to Google Cloud attributes, such as `subject` and `segment`.
     * Each key must be a string specifying the Google Cloud IAM attribute to map to.
     * The following keys are supported:
     * * `google.subject`: The principal IAM is authenticating. You can reference this value
     *   in IAM bindings. This is also the subject that appears in Cloud Logging logs.
     *   Cannot exceed 127 characters.
     * * `google.groups`: Groups the external identity belongs to. You can grant groups
     *   access to resources using an IAM `principalSet` binding; access applies to all
     *   members of the group.
     *   You can also provide custom attributes by specifying `attribute.{custom_attribute}`,
     *   where `{custom_attribute}` is the name of the custom attribute to be mapped. You can
     *   define a maximum of 50 custom attributes. The maximum length of a mapped attribute key
     *   is 100 characters, and the key may only contain the characters [a-z0-9_].
     *   You can reference these attributes in IAM policies to define fine-grained access for a
     *   workload to Google Cloud resources. For example:
     * * `google.subject`:
     *   `principal://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/subject/{value}`
     * * `google.groups`:
     *   `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}`
     * * `attribute.{custom_attribute}`:
     *   `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}`
     *   Each value must be a [Common Expression Language](https://opensource.google/projects/cel)
     *   function that maps an identity provider credential to the normalized attribute specified
     *   by the corresponding map key.
     *   You can use the `assertion` keyword in the expression to access a JSON representation of
     *   the authentication credential issued by the provider.
     *   The maximum length of an attribute mapping expression is 2048 characters. When evaluated,
     *   the total size of all mapped attributes must not exceed 8KB.
     *   For AWS providers, the following rules apply:
     * - If no attribute mapping is defined, the following default mapping applies:
     * - If any custom attribute mappings are defined, they must include a mapping to the
     *   `google.subject` attribute.
     *   For OIDC providers, the following rules apply:
     * - Custom attribute mappings must be defined, and must include a mapping to the
     *   `google.subject` attribute. For example, the following maps the `sub` claim of the
     *   incoming credential to the `subject` attribute on a Google token.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getAttributeMapping() {
        return this.attributeMapping;
    }
    /**
     * An Amazon Web Services identity provider. Not compatible with the property oidc.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="aws", type=WorkloadIdentityPoolProviderAws.class, parameters={})
    private Output</* @Nullable */ WorkloadIdentityPoolProviderAws> aws;

    /**
     * @return An Amazon Web Services identity provider. Not compatible with the property oidc.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ WorkloadIdentityPoolProviderAws> getAws() {
        return this.aws;
    }
    /**
     * A description for the provider. Cannot exceed 256 characters.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the provider. Cannot exceed 256 characters.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Whether the provider is disabled. You cannot use a disabled provider to exchange tokens.
     * However, existing tokens still grant access.
     * 
     */
    @OutputExport(name="disabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return Whether the provider is disabled. You cannot use a disabled provider to exchange tokens.
     * However, existing tokens still grant access.
     * 
     */
    public Output</* @Nullable */ Boolean> getDisabled() {
        return this.disabled;
    }
    /**
     * A display name for the provider. Cannot exceed 32 characters.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return A display name for the provider. Cannot exceed 32 characters.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The resource name of the provider as
     * 'projects/{project_number}/locations/global/workloadIdentityPools/{workload_identity_pool_id}/providers/{workload_identity_pool_provider_id}'.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the provider as
     * 'projects/{project_number}/locations/global/workloadIdentityPools/{workload_identity_pool_id}/providers/{workload_identity_pool_provider_id}'.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * An OpenId Connect 1.0 identity provider. Not compatible with the property aws.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="oidc", type=WorkloadIdentityPoolProviderOidc.class, parameters={})
    private Output</* @Nullable */ WorkloadIdentityPoolProviderOidc> oidc;

    /**
     * @return An OpenId Connect 1.0 identity provider. Not compatible with the property aws.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ WorkloadIdentityPoolProviderOidc> getOidc() {
        return this.oidc;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The state of the provider. * STATE_UNSPECIFIED: State unspecified. * ACTIVE: The provider is active, and may be used to
     * validate authentication credentials. * DELETED: The provider is soft-deleted. Soft-deleted providers are permanently
     * deleted after approximately 30 days. You can restore a soft-deleted provider using UndeleteWorkloadIdentityPoolProvider.
     * You cannot reuse the ID of a soft-deleted provider until it is permanently deleted.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the provider. * STATE_UNSPECIFIED: State unspecified. * ACTIVE: The provider is active, and may be used to
     * validate authentication credentials. * DELETED: The provider is soft-deleted. Soft-deleted providers are permanently
     * deleted after approximately 30 days. You can restore a soft-deleted provider using UndeleteWorkloadIdentityPoolProvider.
     * You cannot reuse the ID of a soft-deleted provider until it is permanently deleted.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The ID used for the pool, which is the final component of the pool resource name. This
     * value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
     * `gcp-` is reserved for use by Google, and may not be specified.
     * 
     */
    @OutputExport(name="workloadIdentityPoolId", type=String.class, parameters={})
    private Output<String> workloadIdentityPoolId;

    /**
     * @return The ID used for the pool, which is the final component of the pool resource name. This
     * value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
     * `gcp-` is reserved for use by Google, and may not be specified.
     * 
     */
    public Output<String> getWorkloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }
    /**
     * The ID for the provider, which becomes the final component of the resource name. This
     * value must be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
     * `gcp-` is reserved for use by Google, and may not be specified.
     * 
     */
    @OutputExport(name="workloadIdentityPoolProviderId", type=String.class, parameters={})
    private Output<String> workloadIdentityPoolProviderId;

    /**
     * @return The ID for the provider, which becomes the final component of the resource name. This
     * value must be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
     * `gcp-` is reserved for use by Google, and may not be specified.
     * 
     */
    public Output<String> getWorkloadIdentityPoolProviderId() {
        return this.workloadIdentityPoolProviderId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkloadIdentityPoolProvider(String name, WorkloadIdentityPoolProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iam/workloadIdentityPoolProvider:WorkloadIdentityPoolProvider", name, args == null ? WorkloadIdentityPoolProviderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WorkloadIdentityPoolProvider(String name, Input<String> id, @Nullable WorkloadIdentityPoolProviderState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iam/workloadIdentityPoolProvider:WorkloadIdentityPoolProvider", name, state, makeResourceOptions(options, id));
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
    public static WorkloadIdentityPoolProvider get(String name, Input<String> id, @Nullable WorkloadIdentityPoolProviderState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkloadIdentityPoolProvider(name, id, state, options);
    }
}
