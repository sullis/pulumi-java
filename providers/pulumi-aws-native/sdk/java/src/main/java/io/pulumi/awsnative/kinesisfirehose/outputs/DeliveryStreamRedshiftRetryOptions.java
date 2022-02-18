// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeliveryStreamRedshiftRetryOptions {
    private final @Nullable Integer durationInSeconds;

    @OutputCustomType.Constructor({"durationInSeconds"})
    private DeliveryStreamRedshiftRetryOptions(@Nullable Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public Optional<Integer> getDurationInSeconds() {
        return Optional.ofNullable(this.durationInSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamRedshiftRetryOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer durationInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamRedshiftRetryOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationInSeconds = defaults.durationInSeconds;
        }

        public Builder setDurationInSeconds(@Nullable Integer durationInSeconds) {
            this.durationInSeconds = durationInSeconds;
            return this;
        }

        public DeliveryStreamRedshiftRetryOptions build() {
            return new DeliveryStreamRedshiftRetryOptions(durationInSeconds);
        }
    }
}
