// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.PolicyArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A Policy.
 * API Version: 2018-09-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:devtestlab:Policy {labName} /subscriptions/{subscriptionId}/resourceGroups/resourceGroupName/providers/Microsoft.DevTestLab/labs/{labName}/policysets/{policySetName}/policies/{policyName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:devtestlab:Policy")
public class Policy extends io.pulumi.resources.CustomResource {
    /**
     * The creation date of the policy.
     * 
     */
    @OutputExport(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The creation date of the policy.
     * 
     */
    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The description of the policy.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the policy.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The evaluator type of the policy (i.e. AllowedValuesPolicy, MaxValuePolicy).
     * 
     */
    @OutputExport(name="evaluatorType", type=String.class, parameters={})
    private Output</* @Nullable */ String> evaluatorType;

    /**
     * @return The evaluator type of the policy (i.e. AllowedValuesPolicy, MaxValuePolicy).
     * 
     */
    public Output</* @Nullable */ String> getEvaluatorType() {
        return this.evaluatorType;
    }
    /**
     * The fact data of the policy.
     * 
     */
    @OutputExport(name="factData", type=String.class, parameters={})
    private Output</* @Nullable */ String> factData;

    /**
     * @return The fact data of the policy.
     * 
     */
    public Output</* @Nullable */ String> getFactData() {
        return this.factData;
    }
    /**
     * The fact name of the policy (e.g. LabVmCount, LabVmSize, MaxVmsAllowedPerLab, etc.
     * 
     */
    @OutputExport(name="factName", type=String.class, parameters={})
    private Output</* @Nullable */ String> factName;

    /**
     * @return The fact name of the policy (e.g. LabVmCount, LabVmSize, MaxVmsAllowedPerLab, etc.
     * 
     */
    public Output</* @Nullable */ String> getFactName() {
        return this.factName;
    }
    /**
     * The location of the resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning status of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning status of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The status of the policy.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return The status of the policy.
     * 
     */
    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }
    /**
     * The tags of the resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The threshold of the policy (i.e. a number for MaxValuePolicy, and a JSON array of values for AllowedValuesPolicy).
     * 
     */
    @OutputExport(name="threshold", type=String.class, parameters={})
    private Output</* @Nullable */ String> threshold;

    /**
     * @return The threshold of the policy (i.e. a number for MaxValuePolicy, and a JSON array of values for AllowedValuesPolicy).
     * 
     */
    public Output</* @Nullable */ String> getThreshold() {
        return this.threshold;
    }
    /**
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @OutputExport(name="uniqueIdentifier", type=String.class, parameters={})
    private Output<String> uniqueIdentifier;

    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    public Output<String> getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Policy(String name, PolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Policy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:Policy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:devtestlab/v20150521preview:Policy").build()),
                Input.of(Alias.builder().setType("azure-native:devtestlab/v20160515:Policy").build()),
                Input.of(Alias.builder().setType("azure-native:devtestlab/v20180915:Policy").build())
            ))
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
    public static Policy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, options);
    }
}
