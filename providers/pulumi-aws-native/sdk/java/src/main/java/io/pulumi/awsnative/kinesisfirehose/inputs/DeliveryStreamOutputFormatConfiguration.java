// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamSerializer;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamOutputFormatConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamOutputFormatConfiguration Empty = new DeliveryStreamOutputFormatConfiguration();

    @InputImport(name="serializer")
    private final @Nullable DeliveryStreamSerializer serializer;

    public Optional<DeliveryStreamSerializer> getSerializer() {
        return this.serializer == null ? Optional.empty() : Optional.ofNullable(this.serializer);
    }

    public DeliveryStreamOutputFormatConfiguration(@Nullable DeliveryStreamSerializer serializer) {
        this.serializer = serializer;
    }

    private DeliveryStreamOutputFormatConfiguration() {
        this.serializer = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamOutputFormatConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DeliveryStreamSerializer serializer;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamOutputFormatConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serializer = defaults.serializer;
        }

        public Builder setSerializer(@Nullable DeliveryStreamSerializer serializer) {
            this.serializer = serializer;
            return this;
        }

        public DeliveryStreamOutputFormatConfiguration build() {
            return new DeliveryStreamOutputFormatConfiguration(serializer);
        }
    }
}
