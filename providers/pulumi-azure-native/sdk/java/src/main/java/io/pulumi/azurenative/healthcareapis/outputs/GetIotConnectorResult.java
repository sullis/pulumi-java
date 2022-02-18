// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.outputs;

import io.pulumi.azurenative.healthcareapis.outputs.IotEventHubIngestionEndpointConfigurationResponse;
import io.pulumi.azurenative.healthcareapis.outputs.IotMappingPropertiesResponse;
import io.pulumi.azurenative.healthcareapis.outputs.ServiceManagedIdentityResponseIdentity;
import io.pulumi.azurenative.healthcareapis.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIotConnectorResult {
    /**
     * Device Mappings.
     * 
     */
    private final @Nullable IotMappingPropertiesResponse deviceMapping;
    /**
     * An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    private final @Nullable String etag;
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    private final @Nullable ServiceManagedIdentityResponseIdentity identity;
    /**
     * Source configuration.
     * 
     */
    private final @Nullable IotEventHubIngestionEndpointConfigurationResponse ingestionEndpointConfiguration;
    /**
     * The resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * The provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"deviceMapping","etag","id","identity","ingestionEndpointConfiguration","location","name","provisioningState","systemData","tags","type"})
    private GetIotConnectorResult(
        @Nullable IotMappingPropertiesResponse deviceMapping,
        @Nullable String etag,
        String id,
        @Nullable ServiceManagedIdentityResponseIdentity identity,
        @Nullable IotEventHubIngestionEndpointConfigurationResponse ingestionEndpointConfiguration,
        @Nullable String location,
        String name,
        String provisioningState,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.deviceMapping = deviceMapping;
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.ingestionEndpointConfiguration = ingestionEndpointConfiguration;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Device Mappings.
     * 
     */
    public Optional<IotMappingPropertiesResponse> getDeviceMapping() {
        return Optional.ofNullable(this.deviceMapping);
    }
    /**
     * An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * The resource identifier.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    public Optional<ServiceManagedIdentityResponseIdentity> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Source configuration.
     * 
     */
    public Optional<IotEventHubIngestionEndpointConfigurationResponse> getIngestionEndpointConfiguration() {
        return Optional.ofNullable(this.ingestionEndpointConfiguration);
    }
    /**
     * The resource location.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
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
     * The resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIotConnectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IotMappingPropertiesResponse deviceMapping;
        private @Nullable String etag;
        private String id;
        private @Nullable ServiceManagedIdentityResponseIdentity identity;
        private @Nullable IotEventHubIngestionEndpointConfigurationResponse ingestionEndpointConfiguration;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIotConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceMapping = defaults.deviceMapping;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.ingestionEndpointConfiguration = defaults.ingestionEndpointConfiguration;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setDeviceMapping(@Nullable IotMappingPropertiesResponse deviceMapping) {
            this.deviceMapping = deviceMapping;
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

        public Builder setIdentity(@Nullable ServiceManagedIdentityResponseIdentity identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIngestionEndpointConfiguration(@Nullable IotEventHubIngestionEndpointConfigurationResponse ingestionEndpointConfiguration) {
            this.ingestionEndpointConfiguration = ingestionEndpointConfiguration;
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

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
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

        public GetIotConnectorResult build() {
            return new GetIotConnectorResult(deviceMapping, etag, id, identity, ingestionEndpointConfiguration, location, name, provisioningState, systemData, tags, type);
        }
    }
}
