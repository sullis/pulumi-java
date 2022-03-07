// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.EncryptionPropertiesResponse;
import io.pulumi.azurenative.automation.outputs.IdentityResponse;
import io.pulumi.azurenative.automation.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.automation.outputs.SkuResponse;
import io.pulumi.azurenative.automation.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAutomationAccountResult {
    /**
     * URL of automation hybrid service which is used for hybrid worker on-boarding.
     * 
     */
    private final @Nullable String automationHybridServiceUrl;
    /**
     * Gets the creation time.
     * 
     */
    private final String creationTime;
    /**
     * Gets or sets the description.
     * 
     */
    private final @Nullable String description;
    /**
     * Indicates whether requests using non-AAD authentication are blocked
     * 
     */
    private final @Nullable Boolean disableLocalAuth;
    /**
     * Encryption properties for the automation account
     * 
     */
    private final @Nullable EncryptionPropertiesResponse encryption;
    /**
     * Gets or sets the etag of the resource.
     * 
     */
    private final @Nullable String etag;
    /**
     * Fully qualified resource Id for the resource
     * 
     */
    private final String id;
    /**
     * Identity for the resource.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * Gets or sets the last modified by.
     * 
     */
    private final @Nullable String lastModifiedBy;
    /**
     * Gets the last modified time.
     * 
     */
    private final String lastModifiedTime;
    /**
     * The Azure Region where the resource lives
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * List of Automation operations supported by the Automation resource provider.
     * 
     */
    private final @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * Indicates whether traffic on the non-ARM endpoint (Webhook/Agent) is allowed from the public internet
     * 
     */
    private final @Nullable Boolean publicNetworkAccess;
    /**
     * Gets or sets the SKU of account.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * Gets status of account.
     * 
     */
    private final String state;
    /**
     * Resource system metadata.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"automationHybridServiceUrl","creationTime","description","disableLocalAuth","encryption","etag","id","identity","lastModifiedBy","lastModifiedTime","location","name","privateEndpointConnections","publicNetworkAccess","sku","state","systemData","tags","type"})
    private GetAutomationAccountResult(
        @Nullable String automationHybridServiceUrl,
        String creationTime,
        @Nullable String description,
        @Nullable Boolean disableLocalAuth,
        @Nullable EncryptionPropertiesResponse encryption,
        @Nullable String etag,
        String id,
        @Nullable IdentityResponse identity,
        @Nullable String lastModifiedBy,
        String lastModifiedTime,
        @Nullable String location,
        String name,
        @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @Nullable Boolean publicNetworkAccess,
        @Nullable SkuResponse sku,
        String state,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.automationHybridServiceUrl = automationHybridServiceUrl;
        this.creationTime = Objects.requireNonNull(creationTime);
        this.description = description;
        this.disableLocalAuth = disableLocalAuth;
        this.encryption = encryption;
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.privateEndpointConnections = privateEndpointConnections;
        this.publicNetworkAccess = publicNetworkAccess;
        this.sku = sku;
        this.state = Objects.requireNonNull(state);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * URL of automation hybrid service which is used for hybrid worker on-boarding.
     * 
    */
    public Optional<String> getAutomationHybridServiceUrl() {
        return Optional.ofNullable(this.automationHybridServiceUrl);
    }
    /**
     * Gets the creation time.
     * 
    */
    public String getCreationTime() {
        return this.creationTime;
    }
    /**
     * Gets or sets the description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Indicates whether requests using non-AAD authentication are blocked
     * 
    */
    public Optional<Boolean> getDisableLocalAuth() {
        return Optional.ofNullable(this.disableLocalAuth);
    }
    /**
     * Encryption properties for the automation account
     * 
    */
    public Optional<EncryptionPropertiesResponse> getEncryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * Gets or sets the etag of the resource.
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Fully qualified resource Id for the resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Identity for the resource.
     * 
    */
    public Optional<IdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Gets or sets the last modified by.
     * 
    */
    public Optional<String> getLastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }
    /**
     * Gets the last modified time.
     * 
    */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The Azure Region where the resource lives
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * List of Automation operations supported by the Automation resource provider.
     * 
    */
    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections == null ? List.of() : this.privateEndpointConnections;
    }
    /**
     * Indicates whether traffic on the non-ARM endpoint (Webhook/Agent) is allowed from the public internet
     * 
    */
    public Optional<Boolean> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * Gets or sets the SKU of account.
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Gets status of account.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Resource system metadata.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutomationAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String automationHybridServiceUrl;
        private String creationTime;
        private @Nullable String description;
        private @Nullable Boolean disableLocalAuth;
        private @Nullable EncryptionPropertiesResponse encryption;
        private @Nullable String etag;
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable String lastModifiedBy;
        private String lastModifiedTime;
        private @Nullable String location;
        private String name;
        private @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private @Nullable Boolean publicNetworkAccess;
        private @Nullable SkuResponse sku;
        private String state;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutomationAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationHybridServiceUrl = defaults.automationHybridServiceUrl;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.disableLocalAuth = defaults.disableLocalAuth;
    	      this.encryption = defaults.encryption;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.sku = defaults.sku;
    	      this.state = defaults.state;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAutomationHybridServiceUrl(@Nullable String automationHybridServiceUrl) {
            this.automationHybridServiceUrl = automationHybridServiceUrl;
            return this;
        }

        public Builder setCreationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisableLocalAuth(@Nullable Boolean disableLocalAuth) {
            this.disableLocalAuth = disableLocalAuth;
            return this;
        }

        public Builder setEncryption(@Nullable EncryptionPropertiesResponse encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
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

        public Builder setLastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }

        public Builder setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateEndpointConnections(@Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Boolean publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAutomationAccountResult build() {
            return new GetAutomationAccountResult(automationHybridServiceUrl, creationTime, description, disableLocalAuth, encryption, etag, id, identity, lastModifiedBy, lastModifiedTime, location, name, privateEndpointConnections, publicNetworkAccess, sku, state, systemData, tags, type);
        }
    }
}