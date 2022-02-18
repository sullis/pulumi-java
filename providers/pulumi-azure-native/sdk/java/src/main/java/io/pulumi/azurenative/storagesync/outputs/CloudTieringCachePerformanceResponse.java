// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CloudTieringCachePerformanceResponse {
    /**
     * Count of bytes that were served from the local server
     * 
     */
    private final Double cacheHitBytes;
    /**
     * Percentage of total bytes (hit + miss) that were served from the local server
     * 
     */
    private final Integer cacheHitBytesPercent;
    /**
     * Count of bytes that were served from the cloud
     * 
     */
    private final Double cacheMissBytes;
    /**
     * Last updated timestamp
     * 
     */
    private final String lastUpdatedTimestamp;

    @OutputCustomType.Constructor({"cacheHitBytes","cacheHitBytesPercent","cacheMissBytes","lastUpdatedTimestamp"})
    private CloudTieringCachePerformanceResponse(
        Double cacheHitBytes,
        Integer cacheHitBytesPercent,
        Double cacheMissBytes,
        String lastUpdatedTimestamp) {
        this.cacheHitBytes = Objects.requireNonNull(cacheHitBytes);
        this.cacheHitBytesPercent = Objects.requireNonNull(cacheHitBytesPercent);
        this.cacheMissBytes = Objects.requireNonNull(cacheMissBytes);
        this.lastUpdatedTimestamp = Objects.requireNonNull(lastUpdatedTimestamp);
    }

    /**
     * Count of bytes that were served from the local server
     * 
     */
    public Double getCacheHitBytes() {
        return this.cacheHitBytes;
    }
    /**
     * Percentage of total bytes (hit + miss) that were served from the local server
     * 
     */
    public Integer getCacheHitBytesPercent() {
        return this.cacheHitBytesPercent;
    }
    /**
     * Count of bytes that were served from the cloud
     * 
     */
    public Double getCacheMissBytes() {
        return this.cacheMissBytes;
    }
    /**
     * Last updated timestamp
     * 
     */
    public String getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudTieringCachePerformanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cacheHitBytes;
        private Integer cacheHitBytesPercent;
        private Double cacheMissBytes;
        private String lastUpdatedTimestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudTieringCachePerformanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheHitBytes = defaults.cacheHitBytes;
    	      this.cacheHitBytesPercent = defaults.cacheHitBytesPercent;
    	      this.cacheMissBytes = defaults.cacheMissBytes;
    	      this.lastUpdatedTimestamp = defaults.lastUpdatedTimestamp;
        }

        public Builder setCacheHitBytes(Double cacheHitBytes) {
            this.cacheHitBytes = Objects.requireNonNull(cacheHitBytes);
            return this;
        }

        public Builder setCacheHitBytesPercent(Integer cacheHitBytesPercent) {
            this.cacheHitBytesPercent = Objects.requireNonNull(cacheHitBytesPercent);
            return this;
        }

        public Builder setCacheMissBytes(Double cacheMissBytes) {
            this.cacheMissBytes = Objects.requireNonNull(cacheMissBytes);
            return this;
        }

        public Builder setLastUpdatedTimestamp(String lastUpdatedTimestamp) {
            this.lastUpdatedTimestamp = Objects.requireNonNull(lastUpdatedTimestamp);
            return this;
        }

        public CloudTieringCachePerformanceResponse build() {
            return new CloudTieringCachePerformanceResponse(cacheHitBytes, cacheHitBytesPercent, cacheMissBytes, lastUpdatedTimestamp);
        }
    }
}
