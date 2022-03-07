// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.outputs;

import io.pulumi.azurenative.cache.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.cache.outputs.RedisAccessKeysResponse;
import io.pulumi.azurenative.cache.outputs.RedisCommonPropertiesResponseRedisConfiguration;
import io.pulumi.azurenative.cache.outputs.RedisInstanceDetailsResponse;
import io.pulumi.azurenative.cache.outputs.RedisLinkedServerResponse;
import io.pulumi.azurenative.cache.outputs.SkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRedisResult {
    /**
     * The keys of the Redis cache - not set if this object is not the response to Create or Update redis cache
     * 
     */
    private final RedisAccessKeysResponse accessKeys;
    /**
     * Specifies whether the non-ssl Redis server port (6379) is enabled.
     * 
     */
    private final @Nullable Boolean enableNonSslPort;
    /**
     * Redis host name.
     * 
     */
    private final String hostName;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * List of the Redis instances associated with the cache
     * 
     */
    private final List<RedisInstanceDetailsResponse> instances;
    /**
     * List of the linked servers associated with the cache
     * 
     */
    private final List<RedisLinkedServerResponse> linkedServers;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * Optional: requires clients to use a specified TLS version (or higher) to connect (e,g, '1.0', '1.1', '1.2')
     * 
     */
    private final @Nullable String minimumTlsVersion;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Redis non-SSL port.
     * 
     */
    private final Integer port;
    /**
     * List of private endpoint connection associated with the specified redis cache
     * 
     */
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * Redis instance provisioning status.
     * 
     */
    private final String provisioningState;
    /**
     * Whether or not public endpoint access is allowed for this cache.  Value is optional but if passed in, must be 'Enabled' or 'Disabled'. If 'Disabled', private endpoints are the exclusive access method. Default value is 'Enabled'
     * 
     */
    private final @Nullable String publicNetworkAccess;
    /**
     * All Redis Settings. Few possible keys: rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value etc.
     * 
     */
    private final @Nullable RedisCommonPropertiesResponseRedisConfiguration redisConfiguration;
    /**
     * Redis version.
     * 
     */
    private final String redisVersion;
    /**
     * The number of replicas to be created per master.
     * 
     */
    private final @Nullable Integer replicasPerMaster;
    /**
     * The number of shards to be created on a Premium Cluster Cache.
     * 
     */
    private final @Nullable Integer shardCount;
    /**
     * The SKU of the Redis cache to deploy.
     * 
     */
    private final SkuResponse sku;
    /**
     * Redis SSL port.
     * 
     */
    private final Integer sslPort;
    /**
     * Static IP address. Optionally, may be specified when deploying a Redis cache inside an existing Azure Virtual Network; auto assigned by default.
     * 
     */
    private final @Nullable String staticIP;
    /**
     * The full resource ID of a subnet in a virtual network to deploy the Redis cache in. Example format: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1
     * 
     */
    private final @Nullable String subnetId;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * A dictionary of tenant settings
     * 
     */
    private final @Nullable Map<String,String> tenantSettings;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
     */
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor({"accessKeys","enableNonSslPort","hostName","id","instances","linkedServers","location","minimumTlsVersion","name","port","privateEndpointConnections","provisioningState","publicNetworkAccess","redisConfiguration","redisVersion","replicasPerMaster","shardCount","sku","sslPort","staticIP","subnetId","tags","tenantSettings","type","zones"})
    private GetRedisResult(
        RedisAccessKeysResponse accessKeys,
        @Nullable Boolean enableNonSslPort,
        String hostName,
        String id,
        List<RedisInstanceDetailsResponse> instances,
        List<RedisLinkedServerResponse> linkedServers,
        String location,
        @Nullable String minimumTlsVersion,
        String name,
        Integer port,
        List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        String provisioningState,
        @Nullable String publicNetworkAccess,
        @Nullable RedisCommonPropertiesResponseRedisConfiguration redisConfiguration,
        String redisVersion,
        @Nullable Integer replicasPerMaster,
        @Nullable Integer shardCount,
        SkuResponse sku,
        Integer sslPort,
        @Nullable String staticIP,
        @Nullable String subnetId,
        @Nullable Map<String,String> tags,
        @Nullable Map<String,String> tenantSettings,
        String type,
        @Nullable List<String> zones) {
        this.accessKeys = Objects.requireNonNull(accessKeys);
        this.enableNonSslPort = enableNonSslPort;
        this.hostName = Objects.requireNonNull(hostName);
        this.id = Objects.requireNonNull(id);
        this.instances = Objects.requireNonNull(instances);
        this.linkedServers = Objects.requireNonNull(linkedServers);
        this.location = Objects.requireNonNull(location);
        this.minimumTlsVersion = minimumTlsVersion;
        this.name = Objects.requireNonNull(name);
        this.port = Objects.requireNonNull(port);
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicNetworkAccess = publicNetworkAccess;
        this.redisConfiguration = redisConfiguration;
        this.redisVersion = Objects.requireNonNull(redisVersion);
        this.replicasPerMaster = replicasPerMaster;
        this.shardCount = shardCount;
        this.sku = Objects.requireNonNull(sku);
        this.sslPort = Objects.requireNonNull(sslPort);
        this.staticIP = staticIP;
        this.subnetId = subnetId;
        this.tags = tags;
        this.tenantSettings = tenantSettings;
        this.type = Objects.requireNonNull(type);
        this.zones = zones;
    }

    /**
     * The keys of the Redis cache - not set if this object is not the response to Create or Update redis cache
     * 
    */
    public RedisAccessKeysResponse getAccessKeys() {
        return this.accessKeys;
    }
    /**
     * Specifies whether the non-ssl Redis server port (6379) is enabled.
     * 
    */
    public Optional<Boolean> getEnableNonSslPort() {
        return Optional.ofNullable(this.enableNonSslPort);
    }
    /**
     * Redis host name.
     * 
    */
    public String getHostName() {
        return this.hostName;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * List of the Redis instances associated with the cache
     * 
    */
    public List<RedisInstanceDetailsResponse> getInstances() {
        return this.instances;
    }
    /**
     * List of the linked servers associated with the cache
     * 
    */
    public List<RedisLinkedServerResponse> getLinkedServers() {
        return this.linkedServers;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Optional: requires clients to use a specified TLS version (or higher) to connect (e,g, '1.0', '1.1', '1.2')
     * 
    */
    public Optional<String> getMinimumTlsVersion() {
        return Optional.ofNullable(this.minimumTlsVersion);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Redis non-SSL port.
     * 
    */
    public Integer getPort() {
        return this.port;
    }
    /**
     * List of private endpoint connection associated with the specified redis cache
     * 
    */
    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Redis instance provisioning status.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Whether or not public endpoint access is allowed for this cache.  Value is optional but if passed in, must be 'Enabled' or 'Disabled'. If 'Disabled', private endpoints are the exclusive access method. Default value is 'Enabled'
     * 
    */
    public Optional<String> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * All Redis Settings. Few possible keys: rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value etc.
     * 
    */
    public Optional<RedisCommonPropertiesResponseRedisConfiguration> getRedisConfiguration() {
        return Optional.ofNullable(this.redisConfiguration);
    }
    /**
     * Redis version.
     * 
    */
    public String getRedisVersion() {
        return this.redisVersion;
    }
    /**
     * The number of replicas to be created per master.
     * 
    */
    public Optional<Integer> getReplicasPerMaster() {
        return Optional.ofNullable(this.replicasPerMaster);
    }
    /**
     * The number of shards to be created on a Premium Cluster Cache.
     * 
    */
    public Optional<Integer> getShardCount() {
        return Optional.ofNullable(this.shardCount);
    }
    /**
     * The SKU of the Redis cache to deploy.
     * 
    */
    public SkuResponse getSku() {
        return this.sku;
    }
    /**
     * Redis SSL port.
     * 
    */
    public Integer getSslPort() {
        return this.sslPort;
    }
    /**
     * Static IP address. Optionally, may be specified when deploying a Redis cache inside an existing Azure Virtual Network; auto assigned by default.
     * 
    */
    public Optional<String> getStaticIP() {
        return Optional.ofNullable(this.staticIP);
    }
    /**
     * The full resource ID of a subnet in a virtual network to deploy the Redis cache in. Example format: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1
     * 
    */
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * A dictionary of tenant settings
     * 
    */
    public Map<String,String> getTenantSettings() {
        return this.tenantSettings == null ? Map.of() : this.tenantSettings;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
    */
    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRedisResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RedisAccessKeysResponse accessKeys;
        private @Nullable Boolean enableNonSslPort;
        private String hostName;
        private String id;
        private List<RedisInstanceDetailsResponse> instances;
        private List<RedisLinkedServerResponse> linkedServers;
        private String location;
        private @Nullable String minimumTlsVersion;
        private String name;
        private Integer port;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private @Nullable RedisCommonPropertiesResponseRedisConfiguration redisConfiguration;
        private String redisVersion;
        private @Nullable Integer replicasPerMaster;
        private @Nullable Integer shardCount;
        private SkuResponse sku;
        private Integer sslPort;
        private @Nullable String staticIP;
        private @Nullable String subnetId;
        private @Nullable Map<String,String> tags;
        private @Nullable Map<String,String> tenantSettings;
        private String type;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRedisResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeys = defaults.accessKeys;
    	      this.enableNonSslPort = defaults.enableNonSslPort;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.instances = defaults.instances;
    	      this.linkedServers = defaults.linkedServers;
    	      this.location = defaults.location;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.redisConfiguration = defaults.redisConfiguration;
    	      this.redisVersion = defaults.redisVersion;
    	      this.replicasPerMaster = defaults.replicasPerMaster;
    	      this.shardCount = defaults.shardCount;
    	      this.sku = defaults.sku;
    	      this.sslPort = defaults.sslPort;
    	      this.staticIP = defaults.staticIP;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.tenantSettings = defaults.tenantSettings;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
        }

        public Builder setAccessKeys(RedisAccessKeysResponse accessKeys) {
            this.accessKeys = Objects.requireNonNull(accessKeys);
            return this;
        }

        public Builder setEnableNonSslPort(@Nullable Boolean enableNonSslPort) {
            this.enableNonSslPort = enableNonSslPort;
            return this;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstances(List<RedisInstanceDetailsResponse> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder setLinkedServers(List<RedisLinkedServerResponse> linkedServers) {
            this.linkedServers = Objects.requireNonNull(linkedServers);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMinimumTlsVersion(@Nullable String minimumTlsVersion) {
            this.minimumTlsVersion = minimumTlsVersion;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setPrivateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
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

        public Builder setRedisConfiguration(@Nullable RedisCommonPropertiesResponseRedisConfiguration redisConfiguration) {
            this.redisConfiguration = redisConfiguration;
            return this;
        }

        public Builder setRedisVersion(String redisVersion) {
            this.redisVersion = Objects.requireNonNull(redisVersion);
            return this;
        }

        public Builder setReplicasPerMaster(@Nullable Integer replicasPerMaster) {
            this.replicasPerMaster = replicasPerMaster;
            return this;
        }

        public Builder setShardCount(@Nullable Integer shardCount) {
            this.shardCount = shardCount;
            return this;
        }

        public Builder setSku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSslPort(Integer sslPort) {
            this.sslPort = Objects.requireNonNull(sslPort);
            return this;
        }

        public Builder setStaticIP(@Nullable String staticIP) {
            this.staticIP = staticIP;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTenantSettings(@Nullable Map<String,String> tenantSettings) {
            this.tenantSettings = tenantSettings;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public GetRedisResult build() {
            return new GetRedisResult(accessKeys, enableNonSslPort, hostName, id, instances, linkedServers, location, minimumTlsVersion, name, port, privateEndpointConnections, provisioningState, publicNetworkAccess, redisConfiguration, redisVersion, replicasPerMaster, shardCount, sku, sslPort, staticIP, subnetId, tags, tenantSettings, type, zones);
        }
    }
}