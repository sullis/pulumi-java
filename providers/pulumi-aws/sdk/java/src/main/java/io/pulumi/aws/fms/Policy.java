// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fms;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.fms.PolicyArgs;
import io.pulumi.aws.fms.inputs.PolicyState;
import io.pulumi.aws.fms.outputs.PolicyExcludeMap;
import io.pulumi.aws.fms.outputs.PolicyIncludeMap;
import io.pulumi.aws.fms.outputs.PolicySecurityServicePolicyData;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to create an AWS Firewall Manager policy. You need to be using AWS organizations and have enabled the Firewall Manager administrator account.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Firewall Manager policies can be imported using the policy ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:fms/policy:Policy example 5be49585-a7e3-4c49-dde1-a179fe4a619a
 * ```
 * 
 */
@ResourceType(type="aws:fms/policy:Policy")
public class Policy extends io.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * If true, the request will also perform a clean-up process. Defaults to `true`. More information can be found here [AWS Firewall Manager delete policy](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_DeletePolicy.html)
     * 
     */
    @Export(name="deleteAllPolicyResources", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteAllPolicyResources;

    /**
     * @return If true, the request will also perform a clean-up process. Defaults to `true`. More information can be found here [AWS Firewall Manager delete policy](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_DeletePolicy.html)
     * 
     */
    public Output</* @Nullable */ Boolean> deleteAllPolicyResources() {
        return this.deleteAllPolicyResources;
    }
    /**
     * A map of lists of accounts and OU's to exclude from the policy.
     * 
     */
    @Export(name="excludeMap", type=PolicyExcludeMap.class, parameters={})
    private Output</* @Nullable */ PolicyExcludeMap> excludeMap;

    /**
     * @return A map of lists of accounts and OU's to exclude from the policy.
     * 
     */
    public Output</* @Nullable */ PolicyExcludeMap> excludeMap() {
        return this.excludeMap;
    }
    /**
     * A boolean value, if true the tags that are specified in the `resource_tags` are not protected by this policy. If set to false and resource_tags are populated, resources that contain tags will be protected by this policy.
     * 
     */
    @Export(name="excludeResourceTags", type=Boolean.class, parameters={})
    private Output<Boolean> excludeResourceTags;

    /**
     * @return A boolean value, if true the tags that are specified in the `resource_tags` are not protected by this policy. If set to false and resource_tags are populated, resources that contain tags will be protected by this policy.
     * 
     */
    public Output<Boolean> excludeResourceTags() {
        return this.excludeResourceTags;
    }
    /**
     * A map of lists of accounts and OU's to include in the policy.
     * 
     */
    @Export(name="includeMap", type=PolicyIncludeMap.class, parameters={})
    private Output</* @Nullable */ PolicyIncludeMap> includeMap;

    /**
     * @return A map of lists of accounts and OU's to include in the policy.
     * 
     */
    public Output</* @Nullable */ PolicyIncludeMap> includeMap() {
        return this.includeMap;
    }
    /**
     * The friendly name of the AWS Firewall Manager Policy.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The friendly name of the AWS Firewall Manager Policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A unique identifier for each update to the policy.
     * 
     */
    @Export(name="policyUpdateToken", type=String.class, parameters={})
    private Output<String> policyUpdateToken;

    /**
     * @return A unique identifier for each update to the policy.
     * 
     */
    public Output<String> policyUpdateToken() {
        return this.policyUpdateToken;
    }
    /**
     * A boolean value, indicates if the policy should automatically applied to resources that already exist in the account.
     * 
     */
    @Export(name="remediationEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> remediationEnabled;

    /**
     * @return A boolean value, indicates if the policy should automatically applied to resources that already exist in the account.
     * 
     */
    public Output</* @Nullable */ Boolean> remediationEnabled() {
        return this.remediationEnabled;
    }
    /**
     * A map of resource tags, that if present will filter protections on resources based on the exclude_resource_tags.
     * 
     */
    @Export(name="resourceTags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> resourceTags;

    /**
     * @return A map of resource tags, that if present will filter protections on resources based on the exclude_resource_tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> resourceTags() {
        return this.resourceTags;
    }
    /**
     * A resource type to protect. Conflicts with `resource_type_list`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
     * 
     */
    @Export(name="resourceType", type=String.class, parameters={})
    private Output<String> resourceType;

    /**
     * @return A resource type to protect. Conflicts with `resource_type_list`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }
    /**
     * A list of resource types to protect. Conflicts with `resource_type`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
     * 
     */
    @Export(name="resourceTypeLists", type=List.class, parameters={String.class})
    private Output<List<String>> resourceTypeLists;

    /**
     * @return A list of resource types to protect. Conflicts with `resource_type`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
     * 
     */
    public Output<List<String>> resourceTypeLists() {
        return this.resourceTypeLists;
    }
    /**
     * The objects to include in Security Service Policy Data. Documented below.
     * 
     */
    @Export(name="securityServicePolicyData", type=PolicySecurityServicePolicyData.class, parameters={})
    private Output<PolicySecurityServicePolicyData> securityServicePolicyData;

    /**
     * @return The objects to include in Security Service Policy Data. Documented below.
     * 
     */
    public Output<PolicySecurityServicePolicyData> securityServicePolicyData() {
        return this.securityServicePolicyData;
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
        super("aws:fms/policy:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Policy(String name, Output<String> id, @Nullable PolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:fms/policy:Policy", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Policy get(String name, Output<String> id, @Nullable PolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, state, options);
    }
}
