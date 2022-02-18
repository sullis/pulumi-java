// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The execution options of a job step.
 * 
 */
public final class JobStepExecutionOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobStepExecutionOptionsArgs Empty = new JobStepExecutionOptionsArgs();

    /**
     * Initial delay between retries for job step execution.
     * 
     */
    @InputImport(name="initialRetryIntervalSeconds")
    private final @Nullable Input<Integer> initialRetryIntervalSeconds;

    public Input<Integer> getInitialRetryIntervalSeconds() {
        return this.initialRetryIntervalSeconds == null ? Input.empty() : this.initialRetryIntervalSeconds;
    }

    /**
     * The maximum amount of time to wait between retries for job step execution.
     * 
     */
    @InputImport(name="maximumRetryIntervalSeconds")
    private final @Nullable Input<Integer> maximumRetryIntervalSeconds;

    public Input<Integer> getMaximumRetryIntervalSeconds() {
        return this.maximumRetryIntervalSeconds == null ? Input.empty() : this.maximumRetryIntervalSeconds;
    }

    /**
     * Maximum number of times the job step will be reattempted if the first attempt fails.
     * 
     */
    @InputImport(name="retryAttempts")
    private final @Nullable Input<Integer> retryAttempts;

    public Input<Integer> getRetryAttempts() {
        return this.retryAttempts == null ? Input.empty() : this.retryAttempts;
    }

    /**
     * The backoff multiplier for the time between retries.
     * 
     */
    @InputImport(name="retryIntervalBackoffMultiplier")
    private final @Nullable Input<Double> retryIntervalBackoffMultiplier;

    public Input<Double> getRetryIntervalBackoffMultiplier() {
        return this.retryIntervalBackoffMultiplier == null ? Input.empty() : this.retryIntervalBackoffMultiplier;
    }

    /**
     * Execution timeout for the job step.
     * 
     */
    @InputImport(name="timeoutSeconds")
    private final @Nullable Input<Integer> timeoutSeconds;

    public Input<Integer> getTimeoutSeconds() {
        return this.timeoutSeconds == null ? Input.empty() : this.timeoutSeconds;
    }

    public JobStepExecutionOptionsArgs(
        @Nullable Input<Integer> initialRetryIntervalSeconds,
        @Nullable Input<Integer> maximumRetryIntervalSeconds,
        @Nullable Input<Integer> retryAttempts,
        @Nullable Input<Double> retryIntervalBackoffMultiplier,
        @Nullable Input<Integer> timeoutSeconds) {
        this.initialRetryIntervalSeconds = initialRetryIntervalSeconds == null ? Input.ofNullable(1) : initialRetryIntervalSeconds;
        this.maximumRetryIntervalSeconds = maximumRetryIntervalSeconds == null ? Input.ofNullable(120) : maximumRetryIntervalSeconds;
        this.retryAttempts = retryAttempts == null ? Input.ofNullable(10) : retryAttempts;
        this.retryIntervalBackoffMultiplier = retryIntervalBackoffMultiplier == null ? Input.ofNullable(2e+00) : retryIntervalBackoffMultiplier;
        this.timeoutSeconds = timeoutSeconds == null ? Input.ofNullable(43200) : timeoutSeconds;
    }

    private JobStepExecutionOptionsArgs() {
        this.initialRetryIntervalSeconds = Input.empty();
        this.maximumRetryIntervalSeconds = Input.empty();
        this.retryAttempts = Input.empty();
        this.retryIntervalBackoffMultiplier = Input.empty();
        this.timeoutSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStepExecutionOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> initialRetryIntervalSeconds;
        private @Nullable Input<Integer> maximumRetryIntervalSeconds;
        private @Nullable Input<Integer> retryAttempts;
        private @Nullable Input<Double> retryIntervalBackoffMultiplier;
        private @Nullable Input<Integer> timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStepExecutionOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initialRetryIntervalSeconds = defaults.initialRetryIntervalSeconds;
    	      this.maximumRetryIntervalSeconds = defaults.maximumRetryIntervalSeconds;
    	      this.retryAttempts = defaults.retryAttempts;
    	      this.retryIntervalBackoffMultiplier = defaults.retryIntervalBackoffMultiplier;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder setInitialRetryIntervalSeconds(@Nullable Input<Integer> initialRetryIntervalSeconds) {
            this.initialRetryIntervalSeconds = initialRetryIntervalSeconds;
            return this;
        }

        public Builder setInitialRetryIntervalSeconds(@Nullable Integer initialRetryIntervalSeconds) {
            this.initialRetryIntervalSeconds = Input.ofNullable(initialRetryIntervalSeconds);
            return this;
        }

        public Builder setMaximumRetryIntervalSeconds(@Nullable Input<Integer> maximumRetryIntervalSeconds) {
            this.maximumRetryIntervalSeconds = maximumRetryIntervalSeconds;
            return this;
        }

        public Builder setMaximumRetryIntervalSeconds(@Nullable Integer maximumRetryIntervalSeconds) {
            this.maximumRetryIntervalSeconds = Input.ofNullable(maximumRetryIntervalSeconds);
            return this;
        }

        public Builder setRetryAttempts(@Nullable Input<Integer> retryAttempts) {
            this.retryAttempts = retryAttempts;
            return this;
        }

        public Builder setRetryAttempts(@Nullable Integer retryAttempts) {
            this.retryAttempts = Input.ofNullable(retryAttempts);
            return this;
        }

        public Builder setRetryIntervalBackoffMultiplier(@Nullable Input<Double> retryIntervalBackoffMultiplier) {
            this.retryIntervalBackoffMultiplier = retryIntervalBackoffMultiplier;
            return this;
        }

        public Builder setRetryIntervalBackoffMultiplier(@Nullable Double retryIntervalBackoffMultiplier) {
            this.retryIntervalBackoffMultiplier = Input.ofNullable(retryIntervalBackoffMultiplier);
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

        public JobStepExecutionOptionsArgs build() {
            return new JobStepExecutionOptionsArgs(initialRetryIntervalSeconds, maximumRetryIntervalSeconds, retryAttempts, retryIntervalBackoffMultiplier, timeoutSeconds);
        }
    }
}
