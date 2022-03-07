// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionBackendServiceLogConfig {
    /**
     * Whether to enable logging for the load balancer traffic served by this backend service.
     * 
     */
    private final @Nullable Boolean enable;
    /**
     * This field can only be specified if logging is enabled for this backend service. The value of
     * the field must be in [0, 1]. This configures the sampling rate of requests to the load balancer
     * where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported.
     * The default value is 1.0.
     * 
     */
    private final @Nullable Double sampleRate;

    @OutputCustomType.Constructor({"enable","sampleRate"})
    private RegionBackendServiceLogConfig(
        @Nullable Boolean enable,
        @Nullable Double sampleRate) {
        this.enable = enable;
        this.sampleRate = sampleRate;
    }

    /**
     * Whether to enable logging for the load balancer traffic served by this backend service.
     * 
    */
    public Optional<Boolean> getEnable() {
        return Optional.ofNullable(this.enable);
    }
    /**
     * This field can only be specified if logging is enabled for this backend service. The value of
     * the field must be in [0, 1]. This configures the sampling rate of requests to the load balancer
     * where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported.
     * The default value is 1.0.
     * 
    */
    public Optional<Double> getSampleRate() {
        return Optional.ofNullable(this.sampleRate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceLogConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enable;
        private @Nullable Double sampleRate;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceLogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.sampleRate = defaults.sampleRate;
        }

        public Builder setEnable(@Nullable Boolean enable) {
            this.enable = enable;
            return this;
        }

        public Builder setSampleRate(@Nullable Double sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public RegionBackendServiceLogConfig build() {
            return new RegionBackendServiceLogConfig(enable, sampleRate);
        }
    }
}