// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamBufferingHintsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamBufferingHintsArgs Empty = new DeliveryStreamBufferingHintsArgs();

    @Import(name="intervalInSeconds")
      private final @Nullable Output<Integer> intervalInSeconds;

    public Output<Integer> intervalInSeconds() {
        return this.intervalInSeconds == null ? Codegen.empty() : this.intervalInSeconds;
    }

    @Import(name="sizeInMBs")
      private final @Nullable Output<Integer> sizeInMBs;

    public Output<Integer> sizeInMBs() {
        return this.sizeInMBs == null ? Codegen.empty() : this.sizeInMBs;
    }

    public DeliveryStreamBufferingHintsArgs(
        @Nullable Output<Integer> intervalInSeconds,
        @Nullable Output<Integer> sizeInMBs) {
        this.intervalInSeconds = intervalInSeconds;
        this.sizeInMBs = sizeInMBs;
    }

    private DeliveryStreamBufferingHintsArgs() {
        this.intervalInSeconds = Codegen.empty();
        this.sizeInMBs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamBufferingHintsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> intervalInSeconds;
        private @Nullable Output<Integer> sizeInMBs;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamBufferingHintsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intervalInSeconds = defaults.intervalInSeconds;
    	      this.sizeInMBs = defaults.sizeInMBs;
        }

        public Builder intervalInSeconds(@Nullable Output<Integer> intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            return this;
        }
        public Builder intervalInSeconds(@Nullable Integer intervalInSeconds) {
            this.intervalInSeconds = Codegen.ofNullable(intervalInSeconds);
            return this;
        }
        public Builder sizeInMBs(@Nullable Output<Integer> sizeInMBs) {
            this.sizeInMBs = sizeInMBs;
            return this;
        }
        public Builder sizeInMBs(@Nullable Integer sizeInMBs) {
            this.sizeInMBs = Codegen.ofNullable(sizeInMBs);
            return this;
        }        public DeliveryStreamBufferingHintsArgs build() {
            return new DeliveryStreamBufferingHintsArgs(intervalInSeconds, sizeInMBs);
        }
    }
}
