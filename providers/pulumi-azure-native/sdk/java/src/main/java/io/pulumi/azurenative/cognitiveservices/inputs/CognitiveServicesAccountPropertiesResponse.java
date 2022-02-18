// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.azurenative.cognitiveservices.inputs.CognitiveServicesAccountApiPropertiesResponse;
import io.pulumi.azurenative.cognitiveservices.inputs.CognitiveServicesAccountSkuChangeInfoResponse;
import io.pulumi.azurenative.cognitiveservices.inputs.EncryptionResponse;
import io.pulumi.azurenative.cognitiveservices.inputs.NetworkRuleSetResponse;
import io.pulumi.azurenative.cognitiveservices.inputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.cognitiveservices.inputs.SkuCapabilityResponse;
import io.pulumi.azurenative.cognitiveservices.inputs.UserOwnedStorageResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of Cognitive Services account.
 * 
 */
public final class CognitiveServicesAccountPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final CognitiveServicesAccountPropertiesResponse Empty = new CognitiveServicesAccountPropertiesResponse();

    /**
     * The api properties for special APIs.
     * 
     */
    @InputImport(name="apiProperties")
    private final @Nullable CognitiveServicesAccountApiPropertiesResponse apiProperties;

    public Optional<CognitiveServicesAccountApiPropertiesResponse> getApiProperties() {
        return this.apiProperties == null ? Optional.empty() : Optional.ofNullable(this.apiProperties);
    }

    /**
     * Gets the capabilities of the cognitive services account. Each item indicates the capability of a specific feature. The values are read-only and for reference only.
     * 
     */
    @InputImport(name="capabilities", required=true)
    private final List<SkuCapabilityResponse> capabilities;

    public List<SkuCapabilityResponse> getCapabilities() {
        return this.capabilities;
    }

    /**
     * Optional subdomain name used for token-based authentication.
     * 
     */
    @InputImport(name="customSubDomainName")
    private final @Nullable String customSubDomainName;

    public Optional<String> getCustomSubDomainName() {
        return this.customSubDomainName == null ? Optional.empty() : Optional.ofNullable(this.customSubDomainName);
    }

    /**
     * Gets the date of cognitive services account creation.
     * 
     */
    @InputImport(name="dateCreated", required=true)
    private final String dateCreated;

    public String getDateCreated() {
        return this.dateCreated;
    }

    /**
     * The encryption properties for this resource.
     * 
     */
    @InputImport(name="encryption")
    private final @Nullable EncryptionResponse encryption;

    public Optional<EncryptionResponse> getEncryption() {
        return this.encryption == null ? Optional.empty() : Optional.ofNullable(this.encryption);
    }

    /**
     * Endpoint of the created account.
     * 
     */
    @InputImport(name="endpoint", required=true)
    private final String endpoint;

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * The internal identifier.
     * 
     */
    @InputImport(name="internalId", required=true)
    private final String internalId;

    public String getInternalId() {
        return this.internalId;
    }

    /**
     * If the resource is migrated from an existing key.
     * 
     */
    @InputImport(name="isMigrated", required=true)
    private final Boolean isMigrated;

    public Boolean getIsMigrated() {
        return this.isMigrated;
    }

    /**
     * A collection of rules governing the accessibility from specific network locations.
     * 
     */
    @InputImport(name="networkAcls")
    private final @Nullable NetworkRuleSetResponse networkAcls;

    public Optional<NetworkRuleSetResponse> getNetworkAcls() {
        return this.networkAcls == null ? Optional.empty() : Optional.ofNullable(this.networkAcls);
    }

    /**
     * The private endpoint connection associated with the Cognitive Services account.
     * 
     */
    @InputImport(name="privateEndpointConnections")
    private final @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;

    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections == null ? List.of() : this.privateEndpointConnections;
    }

    /**
     * Gets the status of the cognitive services account at the time the operation was called.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Whether or not public endpoint access is allowed for this account. Value is optional but if passed in, must be 'Enabled' or 'Disabled'
     * 
     */
    @InputImport(name="publicNetworkAccess")
    private final @Nullable String publicNetworkAccess;

    public Optional<String> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Optional.empty() : Optional.ofNullable(this.publicNetworkAccess);
    }

    /**
     * Sku change info of account.
     * 
     */
    @InputImport(name="skuChangeInfo", required=true)
    private final CognitiveServicesAccountSkuChangeInfoResponse skuChangeInfo;

    public CognitiveServicesAccountSkuChangeInfoResponse getSkuChangeInfo() {
        return this.skuChangeInfo;
    }

    /**
     * The storage accounts for this resource.
     * 
     */
    @InputImport(name="userOwnedStorage")
    private final @Nullable List<UserOwnedStorageResponse> userOwnedStorage;

    public List<UserOwnedStorageResponse> getUserOwnedStorage() {
        return this.userOwnedStorage == null ? List.of() : this.userOwnedStorage;
    }

    public CognitiveServicesAccountPropertiesResponse(
        @Nullable CognitiveServicesAccountApiPropertiesResponse apiProperties,
        List<SkuCapabilityResponse> capabilities,
        @Nullable String customSubDomainName,
        String dateCreated,
        @Nullable EncryptionResponse encryption,
        String endpoint,
        String internalId,
        Boolean isMigrated,
        @Nullable NetworkRuleSetResponse networkAcls,
        @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        String provisioningState,
        @Nullable String publicNetworkAccess,
        CognitiveServicesAccountSkuChangeInfoResponse skuChangeInfo,
        @Nullable List<UserOwnedStorageResponse> userOwnedStorage) {
        this.apiProperties = apiProperties;
        this.capabilities = Objects.requireNonNull(capabilities, "expected parameter 'capabilities' to be non-null");
        this.customSubDomainName = customSubDomainName;
        this.dateCreated = Objects.requireNonNull(dateCreated, "expected parameter 'dateCreated' to be non-null");
        this.encryption = encryption;
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.internalId = Objects.requireNonNull(internalId, "expected parameter 'internalId' to be non-null");
        this.isMigrated = Objects.requireNonNull(isMigrated, "expected parameter 'isMigrated' to be non-null");
        this.networkAcls = networkAcls;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publicNetworkAccess = publicNetworkAccess;
        this.skuChangeInfo = Objects.requireNonNull(skuChangeInfo, "expected parameter 'skuChangeInfo' to be non-null");
        this.userOwnedStorage = userOwnedStorage;
    }

    private CognitiveServicesAccountPropertiesResponse() {
        this.apiProperties = null;
        this.capabilities = List.of();
        this.customSubDomainName = null;
        this.dateCreated = null;
        this.encryption = null;
        this.endpoint = null;
        this.internalId = null;
        this.isMigrated = null;
        this.networkAcls = null;
        this.privateEndpointConnections = List.of();
        this.provisioningState = null;
        this.publicNetworkAccess = null;
        this.skuChangeInfo = null;
        this.userOwnedStorage = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CognitiveServicesAccountPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CognitiveServicesAccountApiPropertiesResponse apiProperties;
        private List<SkuCapabilityResponse> capabilities;
        private @Nullable String customSubDomainName;
        private String dateCreated;
        private @Nullable EncryptionResponse encryption;
        private String endpoint;
        private String internalId;
        private Boolean isMigrated;
        private @Nullable NetworkRuleSetResponse networkAcls;
        private @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private CognitiveServicesAccountSkuChangeInfoResponse skuChangeInfo;
        private @Nullable List<UserOwnedStorageResponse> userOwnedStorage;

        public Builder() {
    	      // Empty
        }

        public Builder(CognitiveServicesAccountPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiProperties = defaults.apiProperties;
    	      this.capabilities = defaults.capabilities;
    	      this.customSubDomainName = defaults.customSubDomainName;
    	      this.dateCreated = defaults.dateCreated;
    	      this.encryption = defaults.encryption;
    	      this.endpoint = defaults.endpoint;
    	      this.internalId = defaults.internalId;
    	      this.isMigrated = defaults.isMigrated;
    	      this.networkAcls = defaults.networkAcls;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.skuChangeInfo = defaults.skuChangeInfo;
    	      this.userOwnedStorage = defaults.userOwnedStorage;
        }

        public Builder setApiProperties(@Nullable CognitiveServicesAccountApiPropertiesResponse apiProperties) {
            this.apiProperties = apiProperties;
            return this;
        }

        public Builder setCapabilities(List<SkuCapabilityResponse> capabilities) {
            this.capabilities = Objects.requireNonNull(capabilities);
            return this;
        }

        public Builder setCustomSubDomainName(@Nullable String customSubDomainName) {
            this.customSubDomainName = customSubDomainName;
            return this;
        }

        public Builder setDateCreated(String dateCreated) {
            this.dateCreated = Objects.requireNonNull(dateCreated);
            return this;
        }

        public Builder setEncryption(@Nullable EncryptionResponse encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setInternalId(String internalId) {
            this.internalId = Objects.requireNonNull(internalId);
            return this;
        }

        public Builder setIsMigrated(Boolean isMigrated) {
            this.isMigrated = Objects.requireNonNull(isMigrated);
            return this;
        }

        public Builder setNetworkAcls(@Nullable NetworkRuleSetResponse networkAcls) {
            this.networkAcls = networkAcls;
            return this;
        }

        public Builder setPrivateEndpointConnections(@Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setSkuChangeInfo(CognitiveServicesAccountSkuChangeInfoResponse skuChangeInfo) {
            this.skuChangeInfo = Objects.requireNonNull(skuChangeInfo);
            return this;
        }

        public Builder setUserOwnedStorage(@Nullable List<UserOwnedStorageResponse> userOwnedStorage) {
            this.userOwnedStorage = userOwnedStorage;
            return this;
        }

        public CognitiveServicesAccountPropertiesResponse build() {
            return new CognitiveServicesAccountPropertiesResponse(apiProperties, capabilities, customSubDomainName, dateCreated, encryption, endpoint, internalId, isMigrated, networkAcls, privateEndpointConnections, provisioningState, publicNetworkAccess, skuChangeInfo, userOwnedStorage);
        }
    }
}
