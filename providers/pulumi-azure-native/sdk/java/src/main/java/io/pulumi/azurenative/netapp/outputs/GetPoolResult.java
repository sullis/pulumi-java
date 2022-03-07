// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPoolResult {
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * UUID v4 used to identify the Pool
     * 
     */
    private final String poolId;
    /**
     * Azure lifecycle management
     * 
     */
    private final String provisioningState;
    /**
     * The qos type of the pool
     * 
     */
    private final @Nullable String qosType;
    /**
     * The service level of the file system
     * 
     */
    private final String serviceLevel;
    /**
     * Provisioned size of the pool (in bytes). Allowed values are in 4TiB chunks (value must be multiply of 4398046511104).
     * 
     */
    private final Double size;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Total throughput of pool in Mibps
     * 
     */
    private final Double totalThroughputMibps;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * Utilized throughput of pool in Mibps
     * 
     */
    private final Double utilizedThroughputMibps;

    @OutputCustomType.Constructor({"id","location","name","poolId","provisioningState","qosType","serviceLevel","size","tags","totalThroughputMibps","type","utilizedThroughputMibps"})
    private GetPoolResult(
        String id,
        String location,
        String name,
        String poolId,
        String provisioningState,
        @Nullable String qosType,
        String serviceLevel,
        Double size,
        @Nullable Map<String,String> tags,
        Double totalThroughputMibps,
        String type,
        Double utilizedThroughputMibps) {
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.poolId = Objects.requireNonNull(poolId);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.qosType = qosType;
        this.serviceLevel = Objects.requireNonNull(serviceLevel);
        this.size = Objects.requireNonNull(size);
        this.tags = tags;
        this.totalThroughputMibps = Objects.requireNonNull(totalThroughputMibps);
        this.type = Objects.requireNonNull(type);
        this.utilizedThroughputMibps = Objects.requireNonNull(utilizedThroughputMibps);
    }

    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * UUID v4 used to identify the Pool
     * 
    */
    public String getPoolId() {
        return this.poolId;
    }
    /**
     * Azure lifecycle management
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The qos type of the pool
     * 
    */
    public Optional<String> getQosType() {
        return Optional.ofNullable(this.qosType);
    }
    /**
     * The service level of the file system
     * 
    */
    public String getServiceLevel() {
        return this.serviceLevel;
    }
    /**
     * Provisioned size of the pool (in bytes). Allowed values are in 4TiB chunks (value must be multiply of 4398046511104).
     * 
    */
    public Double getSize() {
        return this.size;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Total throughput of pool in Mibps
     * 
    */
    public Double getTotalThroughputMibps() {
        return this.totalThroughputMibps;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Utilized throughput of pool in Mibps
     * 
    */
    public Double getUtilizedThroughputMibps() {
        return this.utilizedThroughputMibps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private String poolId;
        private String provisioningState;
        private @Nullable String qosType;
        private String serviceLevel;
        private Double size;
        private @Nullable Map<String,String> tags;
        private Double totalThroughputMibps;
        private String type;
        private Double utilizedThroughputMibps;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.poolId = defaults.poolId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.qosType = defaults.qosType;
    	      this.serviceLevel = defaults.serviceLevel;
    	      this.size = defaults.size;
    	      this.tags = defaults.tags;
    	      this.totalThroughputMibps = defaults.totalThroughputMibps;
    	      this.type = defaults.type;
    	      this.utilizedThroughputMibps = defaults.utilizedThroughputMibps;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
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

        public Builder setPoolId(String poolId) {
            this.poolId = Objects.requireNonNull(poolId);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setQosType(@Nullable String qosType) {
            this.qosType = qosType;
            return this;
        }

        public Builder setServiceLevel(String serviceLevel) {
            this.serviceLevel = Objects.requireNonNull(serviceLevel);
            return this;
        }

        public Builder setSize(Double size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTotalThroughputMibps(Double totalThroughputMibps) {
            this.totalThroughputMibps = Objects.requireNonNull(totalThroughputMibps);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUtilizedThroughputMibps(Double utilizedThroughputMibps) {
            this.utilizedThroughputMibps = Objects.requireNonNull(utilizedThroughputMibps);
            return this;
        }
        public GetPoolResult build() {
            return new GetPoolResult(id, location, name, poolId, provisioningState, qosType, serviceLevel, size, tags, totalThroughputMibps, type, utilizedThroughputMibps);
        }
    }
}