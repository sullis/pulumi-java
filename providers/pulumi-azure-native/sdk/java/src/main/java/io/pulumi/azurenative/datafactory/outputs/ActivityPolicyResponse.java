// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ActivityPolicyResponse {
    /**
     * Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    private final @Nullable Object retry;
    /**
     * Interval between each retry attempt (in seconds). The default is 30 sec.
     * 
     */
    private final @Nullable Integer retryIntervalInSeconds;
    /**
     * When set to true, Input from activity is considered as secure and will not be logged to monitoring.
     * 
     */
    private final @Nullable Boolean secureInput;
    /**
     * When set to true, Output from activity is considered as secure and will not be logged to monitoring.
     * 
     */
    private final @Nullable Boolean secureOutput;
    /**
     * Specifies the timeout for the activity to run. The default timeout is 7 days. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object timeout;

    @OutputCustomType.Constructor({"retry","retryIntervalInSeconds","secureInput","secureOutput","timeout"})
    private ActivityPolicyResponse(
        @Nullable Object retry,
        @Nullable Integer retryIntervalInSeconds,
        @Nullable Boolean secureInput,
        @Nullable Boolean secureOutput,
        @Nullable Object timeout) {
        this.retry = retry;
        this.retryIntervalInSeconds = retryIntervalInSeconds;
        this.secureInput = secureInput;
        this.secureOutput = secureOutput;
        this.timeout = timeout;
    }

    /**
     * Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
    */
    public Optional<Object> getRetry() {
        return Optional.ofNullable(this.retry);
    }
    /**
     * Interval between each retry attempt (in seconds). The default is 30 sec.
     * 
    */
    public Optional<Integer> getRetryIntervalInSeconds() {
        return Optional.ofNullable(this.retryIntervalInSeconds);
    }
    /**
     * When set to true, Input from activity is considered as secure and will not be logged to monitoring.
     * 
    */
    public Optional<Boolean> getSecureInput() {
        return Optional.ofNullable(this.secureInput);
    }
    /**
     * When set to true, Output from activity is considered as secure and will not be logged to monitoring.
     * 
    */
    public Optional<Boolean> getSecureOutput() {
        return Optional.ofNullable(this.secureOutput);
    }
    /**
     * Specifies the timeout for the activity to run. The default timeout is 7 days. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivityPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object retry;
        private @Nullable Integer retryIntervalInSeconds;
        private @Nullable Boolean secureInput;
        private @Nullable Boolean secureOutput;
        private @Nullable Object timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivityPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retry = defaults.retry;
    	      this.retryIntervalInSeconds = defaults.retryIntervalInSeconds;
    	      this.secureInput = defaults.secureInput;
    	      this.secureOutput = defaults.secureOutput;
    	      this.timeout = defaults.timeout;
        }

        public Builder setRetry(@Nullable Object retry) {
            this.retry = retry;
            return this;
        }

        public Builder setRetryIntervalInSeconds(@Nullable Integer retryIntervalInSeconds) {
            this.retryIntervalInSeconds = retryIntervalInSeconds;
            return this;
        }

        public Builder setSecureInput(@Nullable Boolean secureInput) {
            this.secureInput = secureInput;
            return this;
        }

        public Builder setSecureOutput(@Nullable Boolean secureOutput) {
            this.secureOutput = secureOutput;
            return this;
        }

        public Builder setTimeout(@Nullable Object timeout) {
            this.timeout = timeout;
            return this;
        }
        public ActivityPolicyResponse build() {
            return new ActivityPolicyResponse(retry, retryIntervalInSeconds, secureInput, secureOutput, timeout);
        }
    }
}