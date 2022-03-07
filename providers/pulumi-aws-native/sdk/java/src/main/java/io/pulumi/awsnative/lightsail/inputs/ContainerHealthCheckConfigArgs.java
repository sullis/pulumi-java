// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the health check configuration of an Amazon Lightsail container service.
 * 
 */
public final class ContainerHealthCheckConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerHealthCheckConfigArgs Empty = new ContainerHealthCheckConfigArgs();

    /**
     * The number of consecutive health checks successes required before moving the container to the Healthy state. The default value is 2.
     * 
     */
    @InputImport(name="healthyThreshold")
      private final @Nullable Input<Integer> healthyThreshold;

    public Input<Integer> getHealthyThreshold() {
        return this.healthyThreshold == null ? Input.empty() : this.healthyThreshold;
    }

    /**
     * The approximate interval, in seconds, between health checks of an individual container. You can specify between 5 and 300 seconds. The default value is 5.
     * 
     */
    @InputImport(name="intervalSeconds")
      private final @Nullable Input<Integer> intervalSeconds;

    public Input<Integer> getIntervalSeconds() {
        return this.intervalSeconds == null ? Input.empty() : this.intervalSeconds;
    }

    /**
     * The path on the container on which to perform the health check. The default value is /.
     * 
     */
    @InputImport(name="path")
      private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * The HTTP codes to use when checking for a successful response from a container. You can specify values between 200 and 499. You can specify multiple values (for example, 200,202) or a range of values (for example, 200-299).
     * 
     */
    @InputImport(name="successCodes")
      private final @Nullable Input<String> successCodes;

    public Input<String> getSuccessCodes() {
        return this.successCodes == null ? Input.empty() : this.successCodes;
    }

    /**
     * The amount of time, in seconds, during which no response means a failed health check. You can specify between 2 and 60 seconds. The default value is 2.
     * 
     */
    @InputImport(name="timeoutSeconds")
      private final @Nullable Input<Integer> timeoutSeconds;

    public Input<Integer> getTimeoutSeconds() {
        return this.timeoutSeconds == null ? Input.empty() : this.timeoutSeconds;
    }

    /**
     * The number of consecutive health check failures required before moving the container to the Unhealthy state. The default value is 2.
     * 
     */
    @InputImport(name="unhealthyThreshold")
      private final @Nullable Input<Integer> unhealthyThreshold;

    public Input<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold == null ? Input.empty() : this.unhealthyThreshold;
    }

    public ContainerHealthCheckConfigArgs(
        @Nullable Input<Integer> healthyThreshold,
        @Nullable Input<Integer> intervalSeconds,
        @Nullable Input<String> path,
        @Nullable Input<String> successCodes,
        @Nullable Input<Integer> timeoutSeconds,
        @Nullable Input<Integer> unhealthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        this.intervalSeconds = intervalSeconds;
        this.path = path;
        this.successCodes = successCodes;
        this.timeoutSeconds = timeoutSeconds;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    private ContainerHealthCheckConfigArgs() {
        this.healthyThreshold = Input.empty();
        this.intervalSeconds = Input.empty();
        this.path = Input.empty();
        this.successCodes = Input.empty();
        this.timeoutSeconds = Input.empty();
        this.unhealthyThreshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerHealthCheckConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> healthyThreshold;
        private @Nullable Input<Integer> intervalSeconds;
        private @Nullable Input<String> path;
        private @Nullable Input<String> successCodes;
        private @Nullable Input<Integer> timeoutSeconds;
        private @Nullable Input<Integer> unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerHealthCheckConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.intervalSeconds = defaults.intervalSeconds;
    	      this.path = defaults.path;
    	      this.successCodes = defaults.successCodes;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
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

        public Builder setIntervalSeconds(@Nullable Input<Integer> intervalSeconds) {
            this.intervalSeconds = intervalSeconds;
            return this;
        }

        public Builder setIntervalSeconds(@Nullable Integer intervalSeconds) {
            this.intervalSeconds = Input.ofNullable(intervalSeconds);
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

        public Builder setSuccessCodes(@Nullable Input<String> successCodes) {
            this.successCodes = successCodes;
            return this;
        }

        public Builder setSuccessCodes(@Nullable String successCodes) {
            this.successCodes = Input.ofNullable(successCodes);
            return this;
        }

        public Builder setTimeoutSeconds(@Nullable Input<Integer> timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public Builder setTimeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = Input.ofNullable(timeoutSeconds);
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
        public ContainerHealthCheckConfigArgs build() {
            return new ContainerHealthCheckConfigArgs(healthyThreshold, intervalSeconds, path, successCodes, timeoutSeconds, unhealthyThreshold);
        }
    }
}