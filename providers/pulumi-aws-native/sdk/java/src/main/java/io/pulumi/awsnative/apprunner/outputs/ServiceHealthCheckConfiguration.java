// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.outputs;

import io.pulumi.awsnative.apprunner.enums.ServiceHealthCheckConfigurationProtocol;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceHealthCheckConfiguration {
    /**
     * Health check Healthy Threshold
     * 
     */
    private final @Nullable Integer healthyThreshold;
    /**
     * Health check Interval
     * 
     */
    private final @Nullable Integer interval;
    /**
     * Health check Path
     * 
     */
    private final @Nullable String path;
    /**
     * Health Check Protocol
     * 
     */
    private final @Nullable ServiceHealthCheckConfigurationProtocol protocol;
    /**
     * Health check Timeout
     * 
     */
    private final @Nullable Integer timeout;
    /**
     * Health check Unhealthy Threshold
     * 
     */
    private final @Nullable Integer unhealthyThreshold;

    @OutputCustomType.Constructor({"healthyThreshold","interval","path","protocol","timeout","unhealthyThreshold"})
    private ServiceHealthCheckConfiguration(
        @Nullable Integer healthyThreshold,
        @Nullable Integer interval,
        @Nullable String path,
        @Nullable ServiceHealthCheckConfigurationProtocol protocol,
        @Nullable Integer timeout,
        @Nullable Integer unhealthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        this.interval = interval;
        this.path = path;
        this.protocol = protocol;
        this.timeout = timeout;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * Health check Healthy Threshold
     * 
     */
    public Optional<Integer> getHealthyThreshold() {
        return Optional.ofNullable(this.healthyThreshold);
    }
    /**
     * Health check Interval
     * 
     */
    public Optional<Integer> getInterval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * Health check Path
     * 
     */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * Health Check Protocol
     * 
     */
    public Optional<ServiceHealthCheckConfigurationProtocol> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * Health check Timeout
     * 
     */
    public Optional<Integer> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * Health check Unhealthy Threshold
     * 
     */
    public Optional<Integer> getUnhealthyThreshold() {
        return Optional.ofNullable(this.unhealthyThreshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceHealthCheckConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer healthyThreshold;
        private @Nullable Integer interval;
        private @Nullable String path;
        private @Nullable ServiceHealthCheckConfigurationProtocol protocol;
        private @Nullable Integer timeout;
        private @Nullable Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceHealthCheckConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.interval = defaults.interval;
    	      this.path = defaults.path;
    	      this.protocol = defaults.protocol;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder setHealthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        public Builder setInterval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setProtocol(@Nullable ServiceHealthCheckConfigurationProtocol protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setUnhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public ServiceHealthCheckConfiguration build() {
            return new ServiceHealthCheckConfiguration(healthyThreshold, interval, path, protocol, timeout, unhealthyThreshold);
        }
    }
}
