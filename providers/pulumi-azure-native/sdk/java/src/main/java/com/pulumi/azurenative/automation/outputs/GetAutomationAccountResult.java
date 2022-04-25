// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.outputs;

import com.pulumi.azurenative.automation.outputs.EncryptionPropertiesResponse;
import com.pulumi.azurenative.automation.outputs.IdentityResponse;
import com.pulumi.azurenative.automation.outputs.PrivateEndpointConnectionResponse;
import com.pulumi.azurenative.automation.outputs.SkuResponse;
import com.pulumi.azurenative.automation.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAutomationAccountResult {
    /**
     * @return URL of automation hybrid service which is used for hybrid worker on-boarding.
     * 
     */
    private final @Nullable String automationHybridServiceUrl;
    /**
     * @return Gets the creation time.
     * 
     */
    private final String creationTime;
    /**
     * @return Gets or sets the description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Indicates whether requests using non-AAD authentication are blocked
     * 
     */
    private final @Nullable Boolean disableLocalAuth;
    /**
     * @return Encryption properties for the automation account
     * 
     */
    private final @Nullable EncryptionPropertiesResponse encryption;
    /**
     * @return Gets or sets the etag of the resource.
     * 
     */
    private final @Nullable String etag;
    /**
     * @return Fully qualified resource Id for the resource
     * 
     */
    private final String id;
    /**
     * @return Identity for the resource.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * @return Gets or sets the last modified by.
     * 
     */
    private final @Nullable String lastModifiedBy;
    /**
     * @return Gets the last modified time.
     * 
     */
    private final String lastModifiedTime;
    /**
     * @return The Azure Region where the resource lives
     * 
     */
    private final @Nullable String location;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return List of Automation operations supported by the Automation resource provider.
     * 
     */
    private final @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * @return Indicates whether traffic on the non-ARM endpoint (Webhook/Agent) is allowed from the public internet
     * 
     */
    private final @Nullable Boolean publicNetworkAccess;
    /**
     * @return Gets or sets the SKU of account.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * @return Gets status of account.
     * 
     */
    private final String state;
    /**
     * @return Resource system metadata.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetAutomationAccountResult(
        @CustomType.Parameter("automationHybridServiceUrl") @Nullable String automationHybridServiceUrl,
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("disableLocalAuth") @Nullable Boolean disableLocalAuth,
        @CustomType.Parameter("encryption") @Nullable EncryptionPropertiesResponse encryption,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityResponse identity,
        @CustomType.Parameter("lastModifiedBy") @Nullable String lastModifiedBy,
        @CustomType.Parameter("lastModifiedTime") String lastModifiedTime,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateEndpointConnections") @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @CustomType.Parameter("publicNetworkAccess") @Nullable Boolean publicNetworkAccess,
        @CustomType.Parameter("sku") @Nullable SkuResponse sku,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.automationHybridServiceUrl = automationHybridServiceUrl;
        this.creationTime = creationTime;
        this.description = description;
        this.disableLocalAuth = disableLocalAuth;
        this.encryption = encryption;
        this.etag = etag;
        this.id = id;
        this.identity = identity;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedTime = lastModifiedTime;
        this.location = location;
        this.name = name;
        this.privateEndpointConnections = privateEndpointConnections;
        this.publicNetworkAccess = publicNetworkAccess;
        this.sku = sku;
        this.state = state;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return URL of automation hybrid service which is used for hybrid worker on-boarding.
     * 
     */
    public Optional<String> automationHybridServiceUrl() {
        return Optional.ofNullable(this.automationHybridServiceUrl);
    }
    /**
     * @return Gets the creation time.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return Gets or sets the description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Indicates whether requests using non-AAD authentication are blocked
     * 
     */
    public Optional<Boolean> disableLocalAuth() {
        return Optional.ofNullable(this.disableLocalAuth);
    }
    /**
     * @return Encryption properties for the automation account
     * 
     */
    public Optional<EncryptionPropertiesResponse> encryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * @return Gets or sets the etag of the resource.
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * @return Fully qualified resource Id for the resource
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identity for the resource.
     * 
     */
    public Optional<IdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return Gets or sets the last modified by.
     * 
     */
    public Optional<String> lastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }
    /**
     * @return Gets the last modified time.
     * 
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * @return The Azure Region where the resource lives
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of Automation operations supported by the Automation resource provider.
     * 
     */
    public List<PrivateEndpointConnectionResponse> privateEndpointConnections() {
        return this.privateEndpointConnections == null ? List.of() : this.privateEndpointConnections;
    }
    /**
     * @return Indicates whether traffic on the non-ARM endpoint (Webhook/Agent) is allowed from the public internet
     * 
     */
    public Optional<Boolean> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * @return Gets or sets the SKU of account.
     * 
     */
    public Optional<SkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return Gets status of account.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Resource system metadata.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of the resource.
     * 
     */
    public String type() {
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

        public Builder automationHybridServiceUrl(@Nullable String automationHybridServiceUrl) {
            this.automationHybridServiceUrl = automationHybridServiceUrl;
            return this;
        }
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder disableLocalAuth(@Nullable Boolean disableLocalAuth) {
            this.disableLocalAuth = disableLocalAuth;
            return this;
        }
        public Builder encryption(@Nullable EncryptionPropertiesResponse encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder lastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateEndpointConnections(@Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }
        public Builder privateEndpointConnections(PrivateEndpointConnectionResponse... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }
        public Builder publicNetworkAccess(@Nullable Boolean publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetAutomationAccountResult build() {
            return new GetAutomationAccountResult(automationHybridServiceUrl, creationTime, description, disableLocalAuth, encryption, etag, id, identity, lastModifiedBy, lastModifiedTime, location, name, privateEndpointConnections, publicNetworkAccess, sku, state, systemData, tags, type);
        }
    }
}
