// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metric limits set on an app.
 * 
 */
public final class SiteLimitsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SiteLimitsResponse Empty = new SiteLimitsResponse();

    /**
     * Maximum allowed disk size usage in MB.
     * 
     */
    @InputImport(name="maxDiskSizeInMb")
      private final @Nullable Double maxDiskSizeInMb;

    public Optional<Double> getMaxDiskSizeInMb() {
        return this.maxDiskSizeInMb == null ? Optional.empty() : Optional.ofNullable(this.maxDiskSizeInMb);
    }

    /**
     * Maximum allowed memory usage in MB.
     * 
     */
    @InputImport(name="maxMemoryInMb")
      private final @Nullable Double maxMemoryInMb;

    public Optional<Double> getMaxMemoryInMb() {
        return this.maxMemoryInMb == null ? Optional.empty() : Optional.ofNullable(this.maxMemoryInMb);
    }

    /**
     * Maximum allowed CPU usage percentage.
     * 
     */
    @InputImport(name="maxPercentageCpu")
      private final @Nullable Double maxPercentageCpu;

    public Optional<Double> getMaxPercentageCpu() {
        return this.maxPercentageCpu == null ? Optional.empty() : Optional.ofNullable(this.maxPercentageCpu);
    }

    public SiteLimitsResponse(
        @Nullable Double maxDiskSizeInMb,
        @Nullable Double maxMemoryInMb,
        @Nullable Double maxPercentageCpu) {
        this.maxDiskSizeInMb = maxDiskSizeInMb;
        this.maxMemoryInMb = maxMemoryInMb;
        this.maxPercentageCpu = maxPercentageCpu;
    }

    private SiteLimitsResponse() {
        this.maxDiskSizeInMb = null;
        this.maxMemoryInMb = null;
        this.maxPercentageCpu = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteLimitsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double maxDiskSizeInMb;
        private @Nullable Double maxMemoryInMb;
        private @Nullable Double maxPercentageCpu;

        public Builder() {
    	      // Empty
        }

        public Builder(SiteLimitsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxDiskSizeInMb = defaults.maxDiskSizeInMb;
    	      this.maxMemoryInMb = defaults.maxMemoryInMb;
    	      this.maxPercentageCpu = defaults.maxPercentageCpu;
        }

        public Builder setMaxDiskSizeInMb(@Nullable Double maxDiskSizeInMb) {
            this.maxDiskSizeInMb = maxDiskSizeInMb;
            return this;
        }

        public Builder setMaxMemoryInMb(@Nullable Double maxMemoryInMb) {
            this.maxMemoryInMb = maxMemoryInMb;
            return this;
        }

        public Builder setMaxPercentageCpu(@Nullable Double maxPercentageCpu) {
            this.maxPercentageCpu = maxPercentageCpu;
            return this;
        }
        public SiteLimitsResponse build() {
            return new SiteLimitsResponse(maxDiskSizeInMb, maxMemoryInMb, maxPercentageCpu);
        }
    }
}