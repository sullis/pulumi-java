// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamBufferingHintsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamBufferingHintsArgs Empty = new DeliveryStreamBufferingHintsArgs();

    @InputImport(name="intervalInSeconds")
    private final @Nullable Input<Integer> intervalInSeconds;

    public Input<Integer> getIntervalInSeconds() {
        return this.intervalInSeconds == null ? Input.empty() : this.intervalInSeconds;
    }

    @InputImport(name="sizeInMBs")
    private final @Nullable Input<Integer> sizeInMBs;

    public Input<Integer> getSizeInMBs() {
        return this.sizeInMBs == null ? Input.empty() : this.sizeInMBs;
    }

    public DeliveryStreamBufferingHintsArgs(
        @Nullable Input<Integer> intervalInSeconds,
        @Nullable Input<Integer> sizeInMBs) {
        this.intervalInSeconds = intervalInSeconds;
        this.sizeInMBs = sizeInMBs;
    }

    private DeliveryStreamBufferingHintsArgs() {
        this.intervalInSeconds = Input.empty();
        this.sizeInMBs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamBufferingHintsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> intervalInSeconds;
        private @Nullable Input<Integer> sizeInMBs;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamBufferingHintsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intervalInSeconds = defaults.intervalInSeconds;
    	      this.sizeInMBs = defaults.sizeInMBs;
        }

        public Builder setIntervalInSeconds(@Nullable Input<Integer> intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            return this;
        }

        public Builder setIntervalInSeconds(@Nullable Integer intervalInSeconds) {
            this.intervalInSeconds = Input.ofNullable(intervalInSeconds);
            return this;
        }

        public Builder setSizeInMBs(@Nullable Input<Integer> sizeInMBs) {
            this.sizeInMBs = sizeInMBs;
            return this;
        }

        public Builder setSizeInMBs(@Nullable Integer sizeInMBs) {
            this.sizeInMBs = Input.ofNullable(sizeInMBs);
            return this;
        }

        public DeliveryStreamBufferingHintsArgs build() {
            return new DeliveryStreamBufferingHintsArgs(intervalInSeconds, sizeInMBs);
        }
    }
}
