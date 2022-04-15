// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamSplunkRetryOptions extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamSplunkRetryOptions Empty = new DeliveryStreamSplunkRetryOptions();

    @Import(name="durationInSeconds")
      private final @Nullable Integer durationInSeconds;

    public Optional<Integer> durationInSeconds() {
        return this.durationInSeconds == null ? Optional.empty() : Optional.ofNullable(this.durationInSeconds);
    }

    public DeliveryStreamSplunkRetryOptions(@Nullable Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    private DeliveryStreamSplunkRetryOptions() {
        this.durationInSeconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamSplunkRetryOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer durationInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamSplunkRetryOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationInSeconds = defaults.durationInSeconds;
        }

        public Builder durationInSeconds(@Nullable Integer durationInSeconds) {
            this.durationInSeconds = durationInSeconds;
            return this;
        }        public DeliveryStreamSplunkRetryOptions build() {
            return new DeliveryStreamSplunkRetryOptions(durationInSeconds);
        }
    }
}
