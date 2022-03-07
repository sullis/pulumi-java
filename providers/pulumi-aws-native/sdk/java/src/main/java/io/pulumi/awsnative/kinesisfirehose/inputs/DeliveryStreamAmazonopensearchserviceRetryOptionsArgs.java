// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamAmazonopensearchserviceRetryOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamAmazonopensearchserviceRetryOptionsArgs Empty = new DeliveryStreamAmazonopensearchserviceRetryOptionsArgs();

    @InputImport(name="durationInSeconds")
      private final @Nullable Input<Integer> durationInSeconds;

    public Input<Integer> getDurationInSeconds() {
        return this.durationInSeconds == null ? Input.empty() : this.durationInSeconds;
    }

    public DeliveryStreamAmazonopensearchserviceRetryOptionsArgs(@Nullable Input<Integer> durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    private DeliveryStreamAmazonopensearchserviceRetryOptionsArgs() {
        this.durationInSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamAmazonopensearchserviceRetryOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> durationInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamAmazonopensearchserviceRetryOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationInSeconds = defaults.durationInSeconds;
        }

        public Builder setDurationInSeconds(@Nullable Input<Integer> durationInSeconds) {
            this.durationInSeconds = durationInSeconds;
            return this;
        }

        public Builder setDurationInSeconds(@Nullable Integer durationInSeconds) {
            this.durationInSeconds = Input.ofNullable(durationInSeconds);
            return this;
        }
        public DeliveryStreamAmazonopensearchserviceRetryOptionsArgs build() {
            return new DeliveryStreamAmazonopensearchserviceRetryOptionsArgs(durationInSeconds);
        }
    }
}