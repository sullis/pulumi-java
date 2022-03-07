// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.policyinsights.RemediationAtResourceArgs;
import io.pulumi.azurenative.policyinsights.outputs.RemediationDeploymentSummaryResponse;
import io.pulumi.azurenative.policyinsights.outputs.RemediationFiltersResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The remediation definition.
 * API Version: 2019-07-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:policyinsights:RemediationAtResource storageRemediation /subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourcegroups/myResourceGroup/providers/microsoft.storage/storageaccounts/storAc1/providers/microsoft.policyinsights/remediations/storageRemediation 
 * ```
 * 
 */
@ResourceType(type="azure-native:policyinsights:RemediationAtResource")
public class RemediationAtResource extends io.pulumi.resources.CustomResource {
    /**
     * The time at which the remediation was created.
     * 
     */
    @OutputExport(name="createdOn", type=String.class, parameters={})
    private Output<String> createdOn;

    /**
     * @return The time at which the remediation was created.
     * 
     */
    public Output<String> getCreatedOn() {
        return this.createdOn;
    }
    /**
     * The deployment status summary for all deployments created by the remediation.
     * 
     */
    @OutputExport(name="deploymentStatus", type=RemediationDeploymentSummaryResponse.class, parameters={})
    private Output<RemediationDeploymentSummaryResponse> deploymentStatus;

    /**
     * @return The deployment status summary for all deployments created by the remediation.
     * 
     */
    public Output<RemediationDeploymentSummaryResponse> getDeploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * The filters that will be applied to determine which resources to remediate.
     * 
     */
    @OutputExport(name="filters", type=RemediationFiltersResponse.class, parameters={})
    private Output</* @Nullable */ RemediationFiltersResponse> filters;

    /**
     * @return The filters that will be applied to determine which resources to remediate.
     * 
     */
    public Output</* @Nullable */ RemediationFiltersResponse> getFilters() {
        return this.filters;
    }
    /**
     * The time at which the remediation was last updated.
     * 
     */
    @OutputExport(name="lastUpdatedOn", type=String.class, parameters={})
    private Output<String> lastUpdatedOn;

    /**
     * @return The time at which the remediation was last updated.
     * 
     */
    public Output<String> getLastUpdatedOn() {
        return this.lastUpdatedOn;
    }
    /**
     * The name of the remediation.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the remediation.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The resource ID of the policy assignment that should be remediated.
     * 
     */
    @OutputExport(name="policyAssignmentId", type=String.class, parameters={})
    private Output</* @Nullable */ String> policyAssignmentId;

    /**
     * @return The resource ID of the policy assignment that should be remediated.
     * 
     */
    public Output</* @Nullable */ String> getPolicyAssignmentId() {
        return this.policyAssignmentId;
    }
    /**
     * The policy definition reference ID of the individual definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     * 
     */
    @OutputExport(name="policyDefinitionReferenceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> policyDefinitionReferenceId;

    /**
     * @return The policy definition reference ID of the individual definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     * 
     */
    public Output</* @Nullable */ String> getPolicyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId;
    }
    /**
     * The status of the remediation.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The status of the remediation.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The way resources to remediate are discovered. Defaults to ExistingNonCompliant if not specified.
     * 
     */
    @OutputExport(name="resourceDiscoveryMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceDiscoveryMode;

    /**
     * @return The way resources to remediate are discovered. Defaults to ExistingNonCompliant if not specified.
     * 
     */
    public Output</* @Nullable */ String> getResourceDiscoveryMode() {
        return this.resourceDiscoveryMode;
    }
    /**
     * The type of the remediation.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the remediation.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(RemediationAtResourceArgs.Builder a);
    }
    private static io.pulumi.azurenative.policyinsights.RemediationAtResourceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.policyinsights.RemediationAtResourceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RemediationAtResource(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RemediationAtResource(String name) {
        this(name, RemediationAtResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RemediationAtResource(String name, RemediationAtResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RemediationAtResource(String name, RemediationAtResourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:policyinsights:RemediationAtResource", name, args == null ? RemediationAtResourceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RemediationAtResource(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:policyinsights:RemediationAtResource", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:policyinsights/v20180701preview:RemediationAtResource").build()),
                Input.of(Alias.builder().setType("azure-native:policyinsights/v20190701:RemediationAtResource").build()),
                Input.of(Alias.builder().setType("azure-native:policyinsights/v20211001:RemediationAtResource").build())
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
    public static RemediationAtResource get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RemediationAtResource(name, id, options);
    }
}