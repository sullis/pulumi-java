// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cache.outputs;

import com.pulumi.azurenative.cache.outputs.EnterpriseSkuResponse;
import com.pulumi.azurenative.cache.outputs.PrivateEndpointConnectionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRedisEnterpriseResult {
    /**
     * @return DNS name of the cluster endpoint
     * 
     */
    private final String hostName;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * @return The minimum TLS version for the cluster to support, e.g. &#39;1.2&#39;
     * 
     */
    private final @Nullable String minimumTlsVersion;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return List of private endpoint connections associated with the specified RedisEnterprise cluster
     * 
     */
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * @return Current provisioning status of the cluster
     * 
     */
    private final String provisioningState;
    /**
     * @return Version of redis the cluster supports, e.g. &#39;6&#39;
     * 
     */
    private final String redisVersion;
    /**
     * @return Current resource status of the cluster
     * 
     */
    private final String resourceState;
    /**
     * @return The SKU to create, which affects price, performance, and features.
     * 
     */
    private final EnterpriseSkuResponse sku;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;
    /**
     * @return The Availability Zones where this cluster will be deployed.
     * 
     */
    private final @Nullable List<String> zones;

    @CustomType.Constructor
    private GetRedisEnterpriseResult(
        @CustomType.Parameter("hostName") String hostName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("minimumTlsVersion") @Nullable String minimumTlsVersion,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateEndpointConnections") List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("redisVersion") String redisVersion,
        @CustomType.Parameter("resourceState") String resourceState,
        @CustomType.Parameter("sku") EnterpriseSkuResponse sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("zones") @Nullable List<String> zones) {
        this.hostName = hostName;
        this.id = id;
        this.location = location;
        this.minimumTlsVersion = minimumTlsVersion;
        this.name = name;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = provisioningState;
        this.redisVersion = redisVersion;
        this.resourceState = resourceState;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
        this.zones = zones;
    }

    /**
     * @return DNS name of the cluster endpoint
     * 
     */
    public String hostName() {
        return this.hostName;
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The geo-location where the resource lives
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The minimum TLS version for the cluster to support, e.g. &#39;1.2&#39;
     * 
     */
    public Optional<String> minimumTlsVersion() {
        return Optional.ofNullable(this.minimumTlsVersion);
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of private endpoint connections associated with the specified RedisEnterprise cluster
     * 
     */
    public List<PrivateEndpointConnectionResponse> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * @return Current provisioning status of the cluster
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Version of redis the cluster supports, e.g. &#39;6&#39;
     * 
     */
    public String redisVersion() {
        return this.redisVersion;
    }
    /**
     * @return Current resource status of the cluster
     * 
     */
    public String resourceState() {
        return this.resourceState;
    }
    /**
     * @return The SKU to create, which affects price, performance, and features.
     * 
     */
    public EnterpriseSkuResponse sku() {
        return this.sku;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The Availability Zones where this cluster will be deployed.
     * 
     */
    public List<String> zones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRedisEnterpriseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostName;
        private String id;
        private String location;
        private @Nullable String minimumTlsVersion;
        private String name;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private String redisVersion;
        private String resourceState;
        private EnterpriseSkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRedisEnterpriseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.name = defaults.name;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.redisVersion = defaults.redisVersion;
    	      this.resourceState = defaults.resourceState;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
        }

        public Builder hostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder minimumTlsVersion(@Nullable String minimumTlsVersion) {
            this.minimumTlsVersion = minimumTlsVersion;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }
        public Builder privateEndpointConnections(PrivateEndpointConnectionResponse... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder redisVersion(String redisVersion) {
            this.redisVersion = Objects.requireNonNull(redisVersion);
            return this;
        }
        public Builder resourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }
        public Builder sku(EnterpriseSkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder zones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public GetRedisEnterpriseResult build() {
            return new GetRedisEnterpriseResult(hostName, id, location, minimumTlsVersion, name, privateEndpointConnections, provisioningState, redisVersion, resourceState, sku, tags, type, zones);
        }
    }
}
