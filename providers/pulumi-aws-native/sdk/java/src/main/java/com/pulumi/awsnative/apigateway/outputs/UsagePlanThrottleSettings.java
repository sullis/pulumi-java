// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UsagePlanThrottleSettings {
    /**
     * @return The maximum API request rate limit over a time ranging from one to a few seconds. The maximum API request rate limit depends on whether the underlying token bucket is at its full capacity.
     * 
     */
    private final @Nullable Integer burstLimit;
    /**
     * @return The API request steady-state rate limit (average requests per second over an extended period of time).
     * 
     */
    private final @Nullable Double rateLimit;

    @CustomType.Constructor
    private UsagePlanThrottleSettings(
        @CustomType.Parameter("burstLimit") @Nullable Integer burstLimit,
        @CustomType.Parameter("rateLimit") @Nullable Double rateLimit) {
        this.burstLimit = burstLimit;
        this.rateLimit = rateLimit;
    }

    /**
     * @return The maximum API request rate limit over a time ranging from one to a few seconds. The maximum API request rate limit depends on whether the underlying token bucket is at its full capacity.
     * 
     */
    public Optional<Integer> burstLimit() {
        return Optional.ofNullable(this.burstLimit);
    }
    /**
     * @return The API request steady-state rate limit (average requests per second over an extended period of time).
     * 
     */
    public Optional<Double> rateLimit() {
        return Optional.ofNullable(this.rateLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanThrottleSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer burstLimit;
        private @Nullable Double rateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanThrottleSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burstLimit = defaults.burstLimit;
    	      this.rateLimit = defaults.rateLimit;
        }

        public Builder burstLimit(@Nullable Integer burstLimit) {
            this.burstLimit = burstLimit;
            return this;
        }
        public Builder rateLimit(@Nullable Double rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }        public UsagePlanThrottleSettings build() {
            return new UsagePlanThrottleSettings(burstLimit, rateLimit);
        }
    }
}
