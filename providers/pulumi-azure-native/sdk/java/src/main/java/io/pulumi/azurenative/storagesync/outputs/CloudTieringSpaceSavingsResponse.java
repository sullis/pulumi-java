// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CloudTieringSpaceSavingsResponse {
    /**
     * Cached content size on the server
     * 
     */
    private final Double cachedSizeBytes;
    /**
     * Last updated timestamp
     * 
     */
    private final String lastUpdatedTimestamp;
    /**
     * Count of bytes saved on the server
     * 
     */
    private final Double spaceSavingsBytes;
    /**
     * Percentage of cached size over total size
     * 
     */
    private final Integer spaceSavingsPercent;
    /**
     * Total size of content in the azure file share
     * 
     */
    private final Double totalSizeCloudBytes;
    /**
     * Volume size
     * 
     */
    private final Double volumeSizeBytes;

    @OutputCustomType.Constructor({"cachedSizeBytes","lastUpdatedTimestamp","spaceSavingsBytes","spaceSavingsPercent","totalSizeCloudBytes","volumeSizeBytes"})
    private CloudTieringSpaceSavingsResponse(
        Double cachedSizeBytes,
        String lastUpdatedTimestamp,
        Double spaceSavingsBytes,
        Integer spaceSavingsPercent,
        Double totalSizeCloudBytes,
        Double volumeSizeBytes) {
        this.cachedSizeBytes = Objects.requireNonNull(cachedSizeBytes);
        this.lastUpdatedTimestamp = Objects.requireNonNull(lastUpdatedTimestamp);
        this.spaceSavingsBytes = Objects.requireNonNull(spaceSavingsBytes);
        this.spaceSavingsPercent = Objects.requireNonNull(spaceSavingsPercent);
        this.totalSizeCloudBytes = Objects.requireNonNull(totalSizeCloudBytes);
        this.volumeSizeBytes = Objects.requireNonNull(volumeSizeBytes);
    }

    /**
     * Cached content size on the server
     * 
    */
    public Double getCachedSizeBytes() {
        return this.cachedSizeBytes;
    }
    /**
     * Last updated timestamp
     * 
    */
    public String getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }
    /**
     * Count of bytes saved on the server
     * 
    */
    public Double getSpaceSavingsBytes() {
        return this.spaceSavingsBytes;
    }
    /**
     * Percentage of cached size over total size
     * 
    */
    public Integer getSpaceSavingsPercent() {
        return this.spaceSavingsPercent;
    }
    /**
     * Total size of content in the azure file share
     * 
    */
    public Double getTotalSizeCloudBytes() {
        return this.totalSizeCloudBytes;
    }
    /**
     * Volume size
     * 
    */
    public Double getVolumeSizeBytes() {
        return this.volumeSizeBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudTieringSpaceSavingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cachedSizeBytes;
        private String lastUpdatedTimestamp;
        private Double spaceSavingsBytes;
        private Integer spaceSavingsPercent;
        private Double totalSizeCloudBytes;
        private Double volumeSizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudTieringSpaceSavingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cachedSizeBytes = defaults.cachedSizeBytes;
    	      this.lastUpdatedTimestamp = defaults.lastUpdatedTimestamp;
    	      this.spaceSavingsBytes = defaults.spaceSavingsBytes;
    	      this.spaceSavingsPercent = defaults.spaceSavingsPercent;
    	      this.totalSizeCloudBytes = defaults.totalSizeCloudBytes;
    	      this.volumeSizeBytes = defaults.volumeSizeBytes;
        }

        public Builder setCachedSizeBytes(Double cachedSizeBytes) {
            this.cachedSizeBytes = Objects.requireNonNull(cachedSizeBytes);
            return this;
        }

        public Builder setLastUpdatedTimestamp(String lastUpdatedTimestamp) {
            this.lastUpdatedTimestamp = Objects.requireNonNull(lastUpdatedTimestamp);
            return this;
        }

        public Builder setSpaceSavingsBytes(Double spaceSavingsBytes) {
            this.spaceSavingsBytes = Objects.requireNonNull(spaceSavingsBytes);
            return this;
        }

        public Builder setSpaceSavingsPercent(Integer spaceSavingsPercent) {
            this.spaceSavingsPercent = Objects.requireNonNull(spaceSavingsPercent);
            return this;
        }

        public Builder setTotalSizeCloudBytes(Double totalSizeCloudBytes) {
            this.totalSizeCloudBytes = Objects.requireNonNull(totalSizeCloudBytes);
            return this;
        }

        public Builder setVolumeSizeBytes(Double volumeSizeBytes) {
            this.volumeSizeBytes = Objects.requireNonNull(volumeSizeBytes);
            return this;
        }
        public CloudTieringSpaceSavingsResponse build() {
            return new CloudTieringSpaceSavingsResponse(cachedSizeBytes, lastUpdatedTimestamp, spaceSavingsBytes, spaceSavingsPercent, totalSizeCloudBytes, volumeSizeBytes);
        }
    }
}