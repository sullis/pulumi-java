// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamBufferingHints extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamBufferingHints Empty = new DeliveryStreamBufferingHints();

    @InputImport(name="intervalInSeconds")
      private final @Nullable Integer intervalInSeconds;

    public Optional<Integer> getIntervalInSeconds() {
        return this.intervalInSeconds == null ? Optional.empty() : Optional.ofNullable(this.intervalInSeconds);
    }

    @InputImport(name="sizeInMBs")
      private final @Nullable Integer sizeInMBs;

    public Optional<Integer> getSizeInMBs() {
        return this.sizeInMBs == null ? Optional.empty() : Optional.ofNullable(this.sizeInMBs);
    }

    public DeliveryStreamBufferingHints(
        @Nullable Integer intervalInSeconds,
        @Nullable Integer sizeInMBs) {
        this.intervalInSeconds = intervalInSeconds;
        this.sizeInMBs = sizeInMBs;
    }

    private DeliveryStreamBufferingHints() {
        this.intervalInSeconds = null;
        this.sizeInMBs = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamBufferingHints defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer intervalInSeconds;
        private @Nullable Integer sizeInMBs;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamBufferingHints defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intervalInSeconds = defaults.intervalInSeconds;
    	      this.sizeInMBs = defaults.sizeInMBs;
        }

        public Builder setIntervalInSeconds(@Nullable Integer intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            return this;
        }

        public Builder setSizeInMBs(@Nullable Integer sizeInMBs) {
            this.sizeInMBs = sizeInMBs;
            return this;
        }
        public DeliveryStreamBufferingHints build() {
            return new DeliveryStreamBufferingHints(intervalInSeconds, sizeInMBs);
        }
    }
}