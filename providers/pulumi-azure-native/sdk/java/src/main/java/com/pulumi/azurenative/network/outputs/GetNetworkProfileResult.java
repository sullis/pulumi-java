// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.ContainerNetworkInterfaceConfigurationResponse;
import com.pulumi.azurenative.network.outputs.ContainerNetworkInterfaceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworkProfileResult {
    /**
     * @return List of chid container network interface configurations.
     * 
     */
    private final @Nullable List<ContainerNetworkInterfaceConfigurationResponse> containerNetworkInterfaceConfigurations;
    /**
     * @return List of child container network interfaces.
     * 
     */
    private final List<ContainerNetworkInterfaceResponse> containerNetworkInterfaces;
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return The provisioning state of the network profile resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return The resource GUID property of the network profile resource.
     * 
     */
    private final String resourceGuid;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetNetworkProfileResult(
        @CustomType.Parameter("containerNetworkInterfaceConfigurations") @Nullable List<ContainerNetworkInterfaceConfigurationResponse> containerNetworkInterfaceConfigurations,
        @CustomType.Parameter("containerNetworkInterfaces") List<ContainerNetworkInterfaceResponse> containerNetworkInterfaces,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceGuid") String resourceGuid,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.containerNetworkInterfaceConfigurations = containerNetworkInterfaceConfigurations;
        this.containerNetworkInterfaces = containerNetworkInterfaces;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.resourceGuid = resourceGuid;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return List of chid container network interface configurations.
     * 
     */
    public List<ContainerNetworkInterfaceConfigurationResponse> containerNetworkInterfaceConfigurations() {
        return this.containerNetworkInterfaceConfigurations == null ? List.of() : this.containerNetworkInterfaceConfigurations;
    }
    /**
     * @return List of child container network interfaces.
     * 
     */
    public List<ContainerNetworkInterfaceResponse> containerNetworkInterfaces() {
        return this.containerNetworkInterfaces;
    }
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Resource location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The provisioning state of the network profile resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The resource GUID property of the network profile resource.
     * 
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ContainerNetworkInterfaceConfigurationResponse> containerNetworkInterfaceConfigurations;
        private List<ContainerNetworkInterfaceResponse> containerNetworkInterfaces;
        private String etag;
        private @Nullable String id;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerNetworkInterfaceConfigurations = defaults.containerNetworkInterfaceConfigurations;
    	      this.containerNetworkInterfaces = defaults.containerNetworkInterfaces;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder containerNetworkInterfaceConfigurations(@Nullable List<ContainerNetworkInterfaceConfigurationResponse> containerNetworkInterfaceConfigurations) {
            this.containerNetworkInterfaceConfigurations = containerNetworkInterfaceConfigurations;
            return this;
        }
        public Builder containerNetworkInterfaceConfigurations(ContainerNetworkInterfaceConfigurationResponse... containerNetworkInterfaceConfigurations) {
            return containerNetworkInterfaceConfigurations(List.of(containerNetworkInterfaceConfigurations));
        }
        public Builder containerNetworkInterfaces(List<ContainerNetworkInterfaceResponse> containerNetworkInterfaces) {
            this.containerNetworkInterfaces = Objects.requireNonNull(containerNetworkInterfaces);
            return this;
        }
        public Builder containerNetworkInterfaces(ContainerNetworkInterfaceResponse... containerNetworkInterfaces) {
            return containerNetworkInterfaces(List.of(containerNetworkInterfaces));
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
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
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetNetworkProfileResult build() {
            return new GetNetworkProfileResult(containerNetworkInterfaceConfigurations, containerNetworkInterfaces, etag, id, location, name, provisioningState, resourceGuid, tags, type);
        }
    }
}
