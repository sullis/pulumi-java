// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Health checking configuration for VM instances. Unhealthy instances are killed and replaced with new instances. Only applicable for instances in App Engine flexible environment.
 * 
 */
public final class HealthCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final HealthCheckArgs Empty = new HealthCheckArgs();

    /**
     * Interval between health checks.
     * 
     */
    @Import(name="checkInterval")
    private @Nullable Output<String> checkInterval;

    /**
     * @return Interval between health checks.
     * 
     */
    public Optional<Output<String>> checkInterval() {
        return Optional.ofNullable(this.checkInterval);
    }

    /**
     * Whether to explicitly disable health checks for this instance.
     * 
     */
    @Import(name="disableHealthCheck")
    private @Nullable Output<Boolean> disableHealthCheck;

    /**
     * @return Whether to explicitly disable health checks for this instance.
     * 
     */
    public Optional<Output<Boolean>> disableHealthCheck() {
        return Optional.ofNullable(this.disableHealthCheck);
    }

    /**
     * Number of consecutive successful health checks required before receiving traffic.
     * 
     */
    @Import(name="healthyThreshold")
    private @Nullable Output<Integer> healthyThreshold;

    /**
     * @return Number of consecutive successful health checks required before receiving traffic.
     * 
     */
    public Optional<Output<Integer>> healthyThreshold() {
        return Optional.ofNullable(this.healthyThreshold);
    }

    /**
     * Host header to send when performing an HTTP health check. Example: &#34;myapp.appspot.com&#34;
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return Host header to send when performing an HTTP health check. Example: &#34;myapp.appspot.com&#34;
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * Number of consecutive failed health checks required before an instance is restarted.
     * 
     */
    @Import(name="restartThreshold")
    private @Nullable Output<Integer> restartThreshold;

    /**
     * @return Number of consecutive failed health checks required before an instance is restarted.
     * 
     */
    public Optional<Output<Integer>> restartThreshold() {
        return Optional.ofNullable(this.restartThreshold);
    }

    /**
     * Time before the health check is considered failed.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    /**
     * @return Time before the health check is considered failed.
     * 
     */
    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * Number of consecutive failed health checks required before removing traffic.
     * 
     */
    @Import(name="unhealthyThreshold")
    private @Nullable Output<Integer> unhealthyThreshold;

    /**
     * @return Number of consecutive failed health checks required before removing traffic.
     * 
     */
    public Optional<Output<Integer>> unhealthyThreshold() {
        return Optional.ofNullable(this.unhealthyThreshold);
    }

    private HealthCheckArgs() {}

    private HealthCheckArgs(HealthCheckArgs $) {
        this.checkInterval = $.checkInterval;
        this.disableHealthCheck = $.disableHealthCheck;
        this.healthyThreshold = $.healthyThreshold;
        this.host = $.host;
        this.restartThreshold = $.restartThreshold;
        this.timeout = $.timeout;
        this.unhealthyThreshold = $.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HealthCheckArgs $;

        public Builder() {
            $ = new HealthCheckArgs();
        }

        public Builder(HealthCheckArgs defaults) {
            $ = new HealthCheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param checkInterval Interval between health checks.
         * 
         * @return builder
         * 
         */
        public Builder checkInterval(@Nullable Output<String> checkInterval) {
            $.checkInterval = checkInterval;
            return this;
        }

        /**
         * @param checkInterval Interval between health checks.
         * 
         * @return builder
         * 
         */
        public Builder checkInterval(String checkInterval) {
            return checkInterval(Output.of(checkInterval));
        }

        /**
         * @param disableHealthCheck Whether to explicitly disable health checks for this instance.
         * 
         * @return builder
         * 
         */
        public Builder disableHealthCheck(@Nullable Output<Boolean> disableHealthCheck) {
            $.disableHealthCheck = disableHealthCheck;
            return this;
        }

        /**
         * @param disableHealthCheck Whether to explicitly disable health checks for this instance.
         * 
         * @return builder
         * 
         */
        public Builder disableHealthCheck(Boolean disableHealthCheck) {
            return disableHealthCheck(Output.of(disableHealthCheck));
        }

        /**
         * @param healthyThreshold Number of consecutive successful health checks required before receiving traffic.
         * 
         * @return builder
         * 
         */
        public Builder healthyThreshold(@Nullable Output<Integer> healthyThreshold) {
            $.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * @param healthyThreshold Number of consecutive successful health checks required before receiving traffic.
         * 
         * @return builder
         * 
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            return healthyThreshold(Output.of(healthyThreshold));
        }

        /**
         * @param host Host header to send when performing an HTTP health check. Example: &#34;myapp.appspot.com&#34;
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Host header to send when performing an HTTP health check. Example: &#34;myapp.appspot.com&#34;
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param restartThreshold Number of consecutive failed health checks required before an instance is restarted.
         * 
         * @return builder
         * 
         */
        public Builder restartThreshold(@Nullable Output<Integer> restartThreshold) {
            $.restartThreshold = restartThreshold;
            return this;
        }

        /**
         * @param restartThreshold Number of consecutive failed health checks required before an instance is restarted.
         * 
         * @return builder
         * 
         */
        public Builder restartThreshold(Integer restartThreshold) {
            return restartThreshold(Output.of(restartThreshold));
        }

        /**
         * @param timeout Time before the health check is considered failed.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Time before the health check is considered failed.
         * 
         * @return builder
         * 
         */
        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param unhealthyThreshold Number of consecutive failed health checks required before removing traffic.
         * 
         * @return builder
         * 
         */
        public Builder unhealthyThreshold(@Nullable Output<Integer> unhealthyThreshold) {
            $.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        /**
         * @param unhealthyThreshold Number of consecutive failed health checks required before removing traffic.
         * 
         * @return builder
         * 
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            return unhealthyThreshold(Output.of(unhealthyThreshold));
        }

        public HealthCheckArgs build() {
            return $;
        }
    }

}
