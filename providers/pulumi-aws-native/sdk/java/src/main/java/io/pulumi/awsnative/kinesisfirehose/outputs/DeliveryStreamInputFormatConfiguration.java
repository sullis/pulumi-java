// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamDeserializer;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryStreamInputFormatConfiguration {
    private final @Nullable DeliveryStreamDeserializer deserializer;

    @CustomType.Constructor
    private DeliveryStreamInputFormatConfiguration(@CustomType.Parameter("deserializer") @Nullable DeliveryStreamDeserializer deserializer) {
        this.deserializer = deserializer;
    }

    public Optional<DeliveryStreamDeserializer> deserializer() {
        return Optional.ofNullable(this.deserializer);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamInputFormatConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DeliveryStreamDeserializer deserializer;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamInputFormatConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deserializer = defaults.deserializer;
        }

        public Builder deserializer(@Nullable DeliveryStreamDeserializer deserializer) {
            this.deserializer = deserializer;
            return this;
        }        public DeliveryStreamInputFormatConfiguration build() {
            return new DeliveryStreamInputFormatConfiguration(deserializer);
        }
    }
}
