// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.inputs;

import io.pulumi.awsnative.apprunner.enums.ServiceHealthCheckConfigurationProtocol;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Health check configuration
 * 
 */
public final class ServiceHealthCheckConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceHealthCheckConfigurationArgs Empty = new ServiceHealthCheckConfigurationArgs();

    /**
     * Health check Healthy Threshold
     * 
     */
    @InputImport(name="healthyThreshold")
      private final @Nullable Input<Integer> healthyThreshold;

    public Input<Integer> getHealthyThreshold() {
        return this.healthyThreshold == null ? Input.empty() : this.healthyThreshold;
    }

    /**
     * Health check Interval
     * 
     */
    @InputImport(name="interval")
      private final @Nullable Input<Integer> interval;

    public Input<Integer> getInterval() {
        return this.interval == null ? Input.empty() : this.interval;
    }

    /**
     * Health check Path
     * 
     */
    @InputImport(name="path")
      private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * Health Check Protocol
     * 
     */
    @InputImport(name="protocol")
      private final @Nullable Input<ServiceHealthCheckConfigurationProtocol> protocol;

    public Input<ServiceHealthCheckConfigurationProtocol> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    /**
     * Health check Timeout
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Input<Integer> timeout;

    public Input<Integer> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * Health check Unhealthy Threshold
     * 
     */
    @InputImport(name="unhealthyThreshold")
      private final @Nullable Input<Integer> unhealthyThreshold;

    public Input<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold == null ? Input.empty() : this.unhealthyThreshold;
    }

    public ServiceHealthCheckConfigurationArgs(
        @Nullable Input<Integer> healthyThreshold,
        @Nullable Input<Integer> interval,
        @Nullable Input<String> path,
        @Nullable Input<ServiceHealthCheckConfigurationProtocol> protocol,
        @Nullable Input<Integer> timeout,
        @Nullable Input<Integer> unhealthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        this.interval = interval;
        this.path = path;
        this.protocol = protocol;
        this.timeout = timeout;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    private ServiceHealthCheckConfigurationArgs() {
        this.healthyThreshold = Input.empty();
        this.interval = Input.empty();
        this.path = Input.empty();
        this.protocol = Input.empty();
        this.timeout = Input.empty();
        this.unhealthyThreshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceHealthCheckConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> healthyThreshold;
        private @Nullable Input<Integer> interval;
        private @Nullable Input<String> path;
        private @Nullable Input<ServiceHealthCheckConfigurationProtocol> protocol;
        private @Nullable Input<Integer> timeout;
        private @Nullable Input<Integer> unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceHealthCheckConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.interval = defaults.interval;
    	      this.path = defaults.path;
    	      this.protocol = defaults.protocol;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder setHealthyThreshold(@Nullable Input<Integer> healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        public Builder setHealthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = Input.ofNullable(healthyThreshold);
            return this;
        }

        public Builder setInterval(@Nullable Input<Integer> interval) {
            this.interval = interval;
            return this;
        }

        public Builder setInterval(@Nullable Integer interval) {
            this.interval = Input.ofNullable(interval);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setProtocol(@Nullable Input<ServiceHealthCheckConfigurationProtocol> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable ServiceHealthCheckConfigurationProtocol protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public Builder setTimeout(@Nullable Input<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setUnhealthyThreshold(@Nullable Input<Integer> unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public Builder setUnhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = Input.ofNullable(unhealthyThreshold);
            return this;
        }
        public ServiceHealthCheckConfigurationArgs build() {
            return new ServiceHealthCheckConfigurationArgs(healthyThreshold, interval, path, protocol, timeout, unhealthyThreshold);
        }
    }
}