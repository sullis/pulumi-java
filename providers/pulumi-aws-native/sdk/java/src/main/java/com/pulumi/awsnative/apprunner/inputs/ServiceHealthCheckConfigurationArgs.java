// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner.inputs;

import com.pulumi.awsnative.apprunner.enums.ServiceHealthCheckConfigurationProtocol;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Health check configuration
 * 
 */
public final class ServiceHealthCheckConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceHealthCheckConfigurationArgs Empty = new ServiceHealthCheckConfigurationArgs();

    /**
     * Health check Healthy Threshold
     * 
     */
    @Import(name="healthyThreshold")
    private @Nullable Output<Integer> healthyThreshold;

    /**
     * @return Health check Healthy Threshold
     * 
     */
    public Optional<Output<Integer>> healthyThreshold() {
        return Optional.ofNullable(this.healthyThreshold);
    }

    /**
     * Health check Interval
     * 
     */
    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    /**
     * @return Health check Interval
     * 
     */
    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * Health check Path
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Health check Path
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Health Check Protocol
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<ServiceHealthCheckConfigurationProtocol> protocol;

    /**
     * @return Health Check Protocol
     * 
     */
    public Optional<Output<ServiceHealthCheckConfigurationProtocol>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Health check Timeout
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return Health check Timeout
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * Health check Unhealthy Threshold
     * 
     */
    @Import(name="unhealthyThreshold")
    private @Nullable Output<Integer> unhealthyThreshold;

    /**
     * @return Health check Unhealthy Threshold
     * 
     */
    public Optional<Output<Integer>> unhealthyThreshold() {
        return Optional.ofNullable(this.unhealthyThreshold);
    }

    private ServiceHealthCheckConfigurationArgs() {}

    private ServiceHealthCheckConfigurationArgs(ServiceHealthCheckConfigurationArgs $) {
        this.healthyThreshold = $.healthyThreshold;
        this.interval = $.interval;
        this.path = $.path;
        this.protocol = $.protocol;
        this.timeout = $.timeout;
        this.unhealthyThreshold = $.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceHealthCheckConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceHealthCheckConfigurationArgs $;

        public Builder() {
            $ = new ServiceHealthCheckConfigurationArgs();
        }

        public Builder(ServiceHealthCheckConfigurationArgs defaults) {
            $ = new ServiceHealthCheckConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param healthyThreshold Health check Healthy Threshold
         * 
         * @return builder
         * 
         */
        public Builder healthyThreshold(@Nullable Output<Integer> healthyThreshold) {
            $.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * @param healthyThreshold Health check Healthy Threshold
         * 
         * @return builder
         * 
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            return healthyThreshold(Output.of(healthyThreshold));
        }

        /**
         * @param interval Health check Interval
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval Health check Interval
         * 
         * @return builder
         * 
         */
        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param path Health check Path
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Health check Path
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param protocol Health Check Protocol
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<ServiceHealthCheckConfigurationProtocol> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Health Check Protocol
         * 
         * @return builder
         * 
         */
        public Builder protocol(ServiceHealthCheckConfigurationProtocol protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param timeout Health check Timeout
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Health check Timeout
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param unhealthyThreshold Health check Unhealthy Threshold
         * 
         * @return builder
         * 
         */
        public Builder unhealthyThreshold(@Nullable Output<Integer> unhealthyThreshold) {
            $.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        /**
         * @param unhealthyThreshold Health check Unhealthy Threshold
         * 
         * @return builder
         * 
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            return unhealthyThreshold(Output.of(unhealthyThreshold));
        }

        public ServiceHealthCheckConfigurationArgs build() {
            return $;
        }
    }

}
