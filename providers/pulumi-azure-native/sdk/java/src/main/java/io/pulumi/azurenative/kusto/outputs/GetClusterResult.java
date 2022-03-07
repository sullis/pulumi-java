// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.outputs;

import io.pulumi.azurenative.kusto.outputs.AzureSkuResponse;
import io.pulumi.azurenative.kusto.outputs.IdentityResponse;
import io.pulumi.azurenative.kusto.outputs.KeyVaultPropertiesResponse;
import io.pulumi.azurenative.kusto.outputs.LanguageExtensionsListResponse;
import io.pulumi.azurenative.kusto.outputs.OptimizedAutoscaleResponse;
import io.pulumi.azurenative.kusto.outputs.TrustedExternalTenantResponse;
import io.pulumi.azurenative.kusto.outputs.VirtualNetworkConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetClusterResult {
    /**
     * The cluster data ingestion URI.
     * 
     */
    private final String dataIngestionUri;
    /**
     * A boolean value that indicates if the cluster's disks are encrypted.
     * 
     */
    private final @Nullable Boolean enableDiskEncryption;
    /**
     * A boolean value that indicates if double encryption is enabled.
     * 
     */
    private final @Nullable Boolean enableDoubleEncryption;
    /**
     * A boolean value that indicates if the purge operations are enabled.
     * 
     */
    private final @Nullable Boolean enablePurge;
    /**
     * A boolean value that indicates if the streaming ingest is enabled.
     * 
     */
    private final @Nullable Boolean enableStreamingIngest;
    /**
     * The engine type
     * 
     */
    private final @Nullable String engineType;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The identity of the cluster, if configured.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * KeyVault properties for the cluster encryption.
     * 
     */
    private final @Nullable KeyVaultPropertiesResponse keyVaultProperties;
    /**
     * List of the cluster's language extensions.
     * 
     */
    private final LanguageExtensionsListResponse languageExtensions;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Optimized auto scale definition.
     * 
     */
    private final @Nullable OptimizedAutoscaleResponse optimizedAutoscale;
    /**
     * The provisioned state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The SKU of the cluster.
     * 
     */
    private final AzureSkuResponse sku;
    /**
     * The state of the resource.
     * 
     */
    private final String state;
    /**
     * The reason for the cluster's current state.
     * 
     */
    private final String stateReason;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The cluster's external tenants.
     * 
     */
    private final @Nullable List<TrustedExternalTenantResponse> trustedExternalTenants;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * The cluster URI.
     * 
     */
    private final String uri;
    /**
     * Virtual network definition.
     * 
     */
    private final @Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration;
    /**
     * The availability zones of the cluster.
     * 
     */
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor({"dataIngestionUri","enableDiskEncryption","enableDoubleEncryption","enablePurge","enableStreamingIngest","engineType","etag","id","identity","keyVaultProperties","languageExtensions","location","name","optimizedAutoscale","provisioningState","sku","state","stateReason","tags","trustedExternalTenants","type","uri","virtualNetworkConfiguration","zones"})
    private GetClusterResult(
        String dataIngestionUri,
        @Nullable Boolean enableDiskEncryption,
        @Nullable Boolean enableDoubleEncryption,
        @Nullable Boolean enablePurge,
        @Nullable Boolean enableStreamingIngest,
        @Nullable String engineType,
        String etag,
        String id,
        @Nullable IdentityResponse identity,
        @Nullable KeyVaultPropertiesResponse keyVaultProperties,
        LanguageExtensionsListResponse languageExtensions,
        String location,
        String name,
        @Nullable OptimizedAutoscaleResponse optimizedAutoscale,
        String provisioningState,
        AzureSkuResponse sku,
        String state,
        String stateReason,
        @Nullable Map<String,String> tags,
        @Nullable List<TrustedExternalTenantResponse> trustedExternalTenants,
        String type,
        String uri,
        @Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration,
        @Nullable List<String> zones) {
        this.dataIngestionUri = Objects.requireNonNull(dataIngestionUri);
        this.enableDiskEncryption = enableDiskEncryption;
        this.enableDoubleEncryption = enableDoubleEncryption;
        this.enablePurge = enablePurge;
        this.enableStreamingIngest = enableStreamingIngest;
        this.engineType = engineType;
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.keyVaultProperties = keyVaultProperties;
        this.languageExtensions = Objects.requireNonNull(languageExtensions);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.optimizedAutoscale = optimizedAutoscale;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.sku = Objects.requireNonNull(sku);
        this.state = Objects.requireNonNull(state);
        this.stateReason = Objects.requireNonNull(stateReason);
        this.tags = tags;
        this.trustedExternalTenants = trustedExternalTenants;
        this.type = Objects.requireNonNull(type);
        this.uri = Objects.requireNonNull(uri);
        this.virtualNetworkConfiguration = virtualNetworkConfiguration;
        this.zones = zones;
    }

    /**
     * The cluster data ingestion URI.
     * 
    */
    public String getDataIngestionUri() {
        return this.dataIngestionUri;
    }
    /**
     * A boolean value that indicates if the cluster's disks are encrypted.
     * 
    */
    public Optional<Boolean> getEnableDiskEncryption() {
        return Optional.ofNullable(this.enableDiskEncryption);
    }
    /**
     * A boolean value that indicates if double encryption is enabled.
     * 
    */
    public Optional<Boolean> getEnableDoubleEncryption() {
        return Optional.ofNullable(this.enableDoubleEncryption);
    }
    /**
     * A boolean value that indicates if the purge operations are enabled.
     * 
    */
    public Optional<Boolean> getEnablePurge() {
        return Optional.ofNullable(this.enablePurge);
    }
    /**
     * A boolean value that indicates if the streaming ingest is enabled.
     * 
    */
    public Optional<Boolean> getEnableStreamingIngest() {
        return Optional.ofNullable(this.enableStreamingIngest);
    }
    /**
     * The engine type
     * 
    */
    public Optional<String> getEngineType() {
        return Optional.ofNullable(this.engineType);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The identity of the cluster, if configured.
     * 
    */
    public Optional<IdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * KeyVault properties for the cluster encryption.
     * 
    */
    public Optional<KeyVaultPropertiesResponse> getKeyVaultProperties() {
        return Optional.ofNullable(this.keyVaultProperties);
    }
    /**
     * List of the cluster's language extensions.
     * 
    */
    public LanguageExtensionsListResponse getLanguageExtensions() {
        return this.languageExtensions;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Optimized auto scale definition.
     * 
    */
    public Optional<OptimizedAutoscaleResponse> getOptimizedAutoscale() {
        return Optional.ofNullable(this.optimizedAutoscale);
    }
    /**
     * The provisioned state of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The SKU of the cluster.
     * 
    */
    public AzureSkuResponse getSku() {
        return this.sku;
    }
    /**
     * The state of the resource.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The reason for the cluster's current state.
     * 
    */
    public String getStateReason() {
        return this.stateReason;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The cluster's external tenants.
     * 
    */
    public List<TrustedExternalTenantResponse> getTrustedExternalTenants() {
        return this.trustedExternalTenants == null ? List.of() : this.trustedExternalTenants;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The cluster URI.
     * 
    */
    public String getUri() {
        return this.uri;
    }
    /**
     * Virtual network definition.
     * 
    */
    public Optional<VirtualNetworkConfigurationResponse> getVirtualNetworkConfiguration() {
        return Optional.ofNullable(this.virtualNetworkConfiguration);
    }
    /**
     * The availability zones of the cluster.
     * 
    */
    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataIngestionUri;
        private @Nullable Boolean enableDiskEncryption;
        private @Nullable Boolean enableDoubleEncryption;
        private @Nullable Boolean enablePurge;
        private @Nullable Boolean enableStreamingIngest;
        private @Nullable String engineType;
        private String etag;
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable KeyVaultPropertiesResponse keyVaultProperties;
        private LanguageExtensionsListResponse languageExtensions;
        private String location;
        private String name;
        private @Nullable OptimizedAutoscaleResponse optimizedAutoscale;
        private String provisioningState;
        private AzureSkuResponse sku;
        private String state;
        private String stateReason;
        private @Nullable Map<String,String> tags;
        private @Nullable List<TrustedExternalTenantResponse> trustedExternalTenants;
        private String type;
        private String uri;
        private @Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataIngestionUri = defaults.dataIngestionUri;
    	      this.enableDiskEncryption = defaults.enableDiskEncryption;
    	      this.enableDoubleEncryption = defaults.enableDoubleEncryption;
    	      this.enablePurge = defaults.enablePurge;
    	      this.enableStreamingIngest = defaults.enableStreamingIngest;
    	      this.engineType = defaults.engineType;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
    	      this.languageExtensions = defaults.languageExtensions;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.optimizedAutoscale = defaults.optimizedAutoscale;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.state = defaults.state;
    	      this.stateReason = defaults.stateReason;
    	      this.tags = defaults.tags;
    	      this.trustedExternalTenants = defaults.trustedExternalTenants;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
    	      this.virtualNetworkConfiguration = defaults.virtualNetworkConfiguration;
    	      this.zones = defaults.zones;
        }

        public Builder setDataIngestionUri(String dataIngestionUri) {
            this.dataIngestionUri = Objects.requireNonNull(dataIngestionUri);
            return this;
        }

        public Builder setEnableDiskEncryption(@Nullable Boolean enableDiskEncryption) {
            this.enableDiskEncryption = enableDiskEncryption;
            return this;
        }

        public Builder setEnableDoubleEncryption(@Nullable Boolean enableDoubleEncryption) {
            this.enableDoubleEncryption = enableDoubleEncryption;
            return this;
        }

        public Builder setEnablePurge(@Nullable Boolean enablePurge) {
            this.enablePurge = enablePurge;
            return this;
        }

        public Builder setEnableStreamingIngest(@Nullable Boolean enableStreamingIngest) {
            this.enableStreamingIngest = enableStreamingIngest;
            return this;
        }

        public Builder setEngineType(@Nullable String engineType) {
            this.engineType = engineType;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setKeyVaultProperties(@Nullable KeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }

        public Builder setLanguageExtensions(LanguageExtensionsListResponse languageExtensions) {
            this.languageExtensions = Objects.requireNonNull(languageExtensions);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOptimizedAutoscale(@Nullable OptimizedAutoscaleResponse optimizedAutoscale) {
            this.optimizedAutoscale = optimizedAutoscale;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSku(AzureSkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStateReason(String stateReason) {
            this.stateReason = Objects.requireNonNull(stateReason);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTrustedExternalTenants(@Nullable List<TrustedExternalTenantResponse> trustedExternalTenants) {
            this.trustedExternalTenants = trustedExternalTenants;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setVirtualNetworkConfiguration(@Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration) {
            this.virtualNetworkConfiguration = virtualNetworkConfiguration;
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public GetClusterResult build() {
            return new GetClusterResult(dataIngestionUri, enableDiskEncryption, enableDoubleEncryption, enablePurge, enableStreamingIngest, engineType, etag, id, identity, keyVaultProperties, languageExtensions, location, name, optimizedAutoscale, provisioningState, sku, state, stateReason, tags, trustedExternalTenants, type, uri, virtualNetworkConfiguration, zones);
        }
    }
}