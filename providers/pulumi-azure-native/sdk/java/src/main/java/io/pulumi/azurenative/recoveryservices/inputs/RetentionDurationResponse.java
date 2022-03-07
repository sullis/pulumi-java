// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Retention duration.
 * 
 */
public final class RetentionDurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final RetentionDurationResponse Empty = new RetentionDurationResponse();

    /**
     * Count of duration types. Retention duration is obtained by the counting the duration type Count times.
     * For example, when Count = 3 and DurationType = Weeks, retention duration will be three weeks.
     * 
     */
    @InputImport(name="count")
      private final @Nullable Integer count;

    public Optional<Integer> getCount() {
        return this.count == null ? Optional.empty() : Optional.ofNullable(this.count);
    }

    /**
     * Retention duration type of retention policy.
     * 
     */
    @InputImport(name="durationType")
      private final @Nullable String durationType;

    public Optional<String> getDurationType() {
        return this.durationType == null ? Optional.empty() : Optional.ofNullable(this.durationType);
    }

    public RetentionDurationResponse(
        @Nullable Integer count,
        @Nullable String durationType) {
        this.count = count;
        this.durationType = durationType;
    }

    private RetentionDurationResponse() {
        this.count = null;
        this.durationType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionDurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String durationType;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionDurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.durationType = defaults.durationType;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = count;
            return this;
        }

        public Builder setDurationType(@Nullable String durationType) {
            this.durationType = durationType;
            return this;
        }
        public RetentionDurationResponse build() {
            return new RetentionDurationResponse(count, durationType);
        }
    }
}