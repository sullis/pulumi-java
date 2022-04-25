// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagesync.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Server endpoint cloud tiering status object.
 * 
 */
public final class CloudTieringCachePerformanceResponse extends com.pulumi.resources.InvokeArgs {

    public static final CloudTieringCachePerformanceResponse Empty = new CloudTieringCachePerformanceResponse();

    /**
     * Count of bytes that were served from the local server
     * 
     */
    @Import(name="cacheHitBytes", required=true)
    private Double cacheHitBytes;

    /**
     * @return Count of bytes that were served from the local server
     * 
     */
    public Double cacheHitBytes() {
        return this.cacheHitBytes;
    }

    /**
     * Percentage of total bytes (hit + miss) that were served from the local server
     * 
     */
    @Import(name="cacheHitBytesPercent", required=true)
    private Integer cacheHitBytesPercent;

    /**
     * @return Percentage of total bytes (hit + miss) that were served from the local server
     * 
     */
    public Integer cacheHitBytesPercent() {
        return this.cacheHitBytesPercent;
    }

    /**
     * Count of bytes that were served from the cloud
     * 
     */
    @Import(name="cacheMissBytes", required=true)
    private Double cacheMissBytes;

    /**
     * @return Count of bytes that were served from the cloud
     * 
     */
    public Double cacheMissBytes() {
        return this.cacheMissBytes;
    }

    /**
     * Last updated timestamp
     * 
     */
    @Import(name="lastUpdatedTimestamp", required=true)
    private String lastUpdatedTimestamp;

    /**
     * @return Last updated timestamp
     * 
     */
    public String lastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    private CloudTieringCachePerformanceResponse() {}

    private CloudTieringCachePerformanceResponse(CloudTieringCachePerformanceResponse $) {
        this.cacheHitBytes = $.cacheHitBytes;
        this.cacheHitBytesPercent = $.cacheHitBytesPercent;
        this.cacheMissBytes = $.cacheMissBytes;
        this.lastUpdatedTimestamp = $.lastUpdatedTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudTieringCachePerformanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudTieringCachePerformanceResponse $;

        public Builder() {
            $ = new CloudTieringCachePerformanceResponse();
        }

        public Builder(CloudTieringCachePerformanceResponse defaults) {
            $ = new CloudTieringCachePerformanceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param cacheHitBytes Count of bytes that were served from the local server
         * 
         * @return builder
         * 
         */
        public Builder cacheHitBytes(Double cacheHitBytes) {
            $.cacheHitBytes = cacheHitBytes;
            return this;
        }

        /**
         * @param cacheHitBytesPercent Percentage of total bytes (hit + miss) that were served from the local server
         * 
         * @return builder
         * 
         */
        public Builder cacheHitBytesPercent(Integer cacheHitBytesPercent) {
            $.cacheHitBytesPercent = cacheHitBytesPercent;
            return this;
        }

        /**
         * @param cacheMissBytes Count of bytes that were served from the cloud
         * 
         * @return builder
         * 
         */
        public Builder cacheMissBytes(Double cacheMissBytes) {
            $.cacheMissBytes = cacheMissBytes;
            return this;
        }

        /**
         * @param lastUpdatedTimestamp Last updated timestamp
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedTimestamp(String lastUpdatedTimestamp) {
            $.lastUpdatedTimestamp = lastUpdatedTimestamp;
            return this;
        }

        public CloudTieringCachePerformanceResponse build() {
            $.cacheHitBytes = Objects.requireNonNull($.cacheHitBytes, "expected parameter 'cacheHitBytes' to be non-null");
            $.cacheHitBytesPercent = Objects.requireNonNull($.cacheHitBytesPercent, "expected parameter 'cacheHitBytesPercent' to be non-null");
            $.cacheMissBytes = Objects.requireNonNull($.cacheMissBytes, "expected parameter 'cacheMissBytes' to be non-null");
            $.lastUpdatedTimestamp = Objects.requireNonNull($.lastUpdatedTimestamp, "expected parameter 'lastUpdatedTimestamp' to be non-null");
            return $;
        }
    }

}
