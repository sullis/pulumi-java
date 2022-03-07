// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kubernetesconfiguration.FluxConfigurationArgs;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.GitRepositoryDefinitionResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.KustomizationDefinitionResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.ObjectStatusDefinitionResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The Flux Configuration object returned in Get & Put response.
 * API Version: 2021-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:kubernetesconfiguration:FluxConfiguration srs-fluxconfig /subscriptions/subId1/resourceGroups/rg1/providers/Microsoft.Kubernetes/connectedClusters/clusterName1/providers/Microsoft.KubernetesConfiguration/fluxConfigurations/srs-fluxconfig 
 * ```
 * 
 */
@ResourceType(type="azure-native:kubernetesconfiguration:FluxConfiguration")
public class FluxConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * Combined status of the Flux Kubernetes resources created by the fluxConfiguration or created by the managed objects.
     * 
     */
    @OutputExport(name="complianceState", type=String.class, parameters={})
    private Output<String> complianceState;

    /**
     * @return Combined status of the Flux Kubernetes resources created by the fluxConfiguration or created by the managed objects.
     * 
     */
    public Output<String> getComplianceState() {
        return this.complianceState;
    }
    /**
     * Key-value pairs of protected configuration settings for the configuration
     * 
     */
    @OutputExport(name="configurationProtectedSettings", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> configurationProtectedSettings;

    /**
     * @return Key-value pairs of protected configuration settings for the configuration
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getConfigurationProtectedSettings() {
        return this.configurationProtectedSettings;
    }
    /**
     * Error message returned to the user in the case of provisioning failure.
     * 
     */
    @OutputExport(name="errorMessage", type=String.class, parameters={})
    private Output<String> errorMessage;

    /**
     * @return Error message returned to the user in the case of provisioning failure.
     * 
     */
    public Output<String> getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * Parameters to reconcile to the GitRepository source kind type.
     * 
     */
    @OutputExport(name="gitRepository", type=GitRepositoryDefinitionResponse.class, parameters={})
    private Output</* @Nullable */ GitRepositoryDefinitionResponse> gitRepository;

    /**
     * @return Parameters to reconcile to the GitRepository source kind type.
     * 
     */
    public Output</* @Nullable */ GitRepositoryDefinitionResponse> getGitRepository() {
        return this.gitRepository;
    }
    /**
     * Array of kustomizations used to reconcile the artifact pulled by the source type on the cluster.
     * 
     */
    @OutputExport(name="kustomizations", type=Map.class, parameters={String.class, KustomizationDefinitionResponse.class})
    private Output</* @Nullable */ Map<String,KustomizationDefinitionResponse>> kustomizations;

    /**
     * @return Array of kustomizations used to reconcile the artifact pulled by the source type on the cluster.
     * 
     */
    public Output</* @Nullable */ Map<String,KustomizationDefinitionResponse>> getKustomizations() {
        return this.kustomizations;
    }
    /**
     * Datetime the fluxConfiguration last synced its source on the cluster.
     * 
     */
    @OutputExport(name="lastSourceSyncedAt", type=String.class, parameters={})
    private Output<String> lastSourceSyncedAt;

    /**
     * @return Datetime the fluxConfiguration last synced its source on the cluster.
     * 
     */
    public Output<String> getLastSourceSyncedAt() {
        return this.lastSourceSyncedAt;
    }
    /**
     * Branch and SHA of the last source commit synced with the cluster.
     * 
     */
    @OutputExport(name="lastSourceSyncedCommitId", type=String.class, parameters={})
    private Output<String> lastSourceSyncedCommitId;

    /**
     * @return Branch and SHA of the last source commit synced with the cluster.
     * 
     */
    public Output<String> getLastSourceSyncedCommitId() {
        return this.lastSourceSyncedCommitId;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The namespace to which this configuration is installed to. Maximum of 253 lower case alphanumeric characters, hyphen and period only.
     * 
     */
    @OutputExport(name="namespace", type=String.class, parameters={})
    private Output</* @Nullable */ String> namespace;

    /**
     * @return The namespace to which this configuration is installed to. Maximum of 253 lower case alphanumeric characters, hyphen and period only.
     * 
     */
    public Output</* @Nullable */ String> getNamespace() {
        return this.namespace;
    }
    /**
     * Status of the creation of the fluxConfiguration.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Status of the creation of the fluxConfiguration.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Public Key associated with this fluxConfiguration (either generated within the cluster or provided by the user).
     * 
     */
    @OutputExport(name="repositoryPublicKey", type=String.class, parameters={})
    private Output<String> repositoryPublicKey;

    /**
     * @return Public Key associated with this fluxConfiguration (either generated within the cluster or provided by the user).
     * 
     */
    public Output<String> getRepositoryPublicKey() {
        return this.repositoryPublicKey;
    }
    /**
     * Scope at which the operator will be installed.
     * 
     */
    @OutputExport(name="scope", type=String.class, parameters={})
    private Output</* @Nullable */ String> scope;

    /**
     * @return Scope at which the operator will be installed.
     * 
     */
    public Output</* @Nullable */ String> getScope() {
        return this.scope;
    }
    /**
     * Source Kind to pull the configuration data from.
     * 
     */
    @OutputExport(name="sourceKind", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceKind;

    /**
     * @return Source Kind to pull the configuration data from.
     * 
     */
    public Output</* @Nullable */ String> getSourceKind() {
        return this.sourceKind;
    }
    /**
     * Statuses of the Flux Kubernetes resources created by the fluxConfiguration or created by the managed objects provisioned by the fluxConfiguration.
     * 
     */
    @OutputExport(name="statuses", type=List.class, parameters={ObjectStatusDefinitionResponse.class})
    private Output<List<ObjectStatusDefinitionResponse>> statuses;

    /**
     * @return Statuses of the Flux Kubernetes resources created by the fluxConfiguration or created by the managed objects provisioned by the fluxConfiguration.
     * 
     */
    public Output<List<ObjectStatusDefinitionResponse>> getStatuses() {
        return this.statuses;
    }
    /**
     * Whether this configuration should suspend its reconciliation of its kustomizations and sources.
     * 
     */
    @OutputExport(name="suspend", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> suspend;

    /**
     * @return Whether this configuration should suspend its reconciliation of its kustomizations and sources.
     * 
     */
    public Output</* @Nullable */ Boolean> getSuspend() {
        return this.suspend;
    }
    /**
     * Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(FluxConfigurationArgs.Builder a);
    }
    private static io.pulumi.azurenative.kubernetesconfiguration.FluxConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.kubernetesconfiguration.FluxConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FluxConfiguration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FluxConfiguration(String name) {
        this(name, FluxConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FluxConfiguration(String name, FluxConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FluxConfiguration(String name, FluxConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kubernetesconfiguration:FluxConfiguration", name, args == null ? FluxConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FluxConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kubernetesconfiguration:FluxConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:kubernetesconfiguration/v20211101preview:FluxConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:kubernetesconfiguration/v20220101preview:FluxConfiguration").build())
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
    public static FluxConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FluxConfiguration(name, id, options);
    }
}