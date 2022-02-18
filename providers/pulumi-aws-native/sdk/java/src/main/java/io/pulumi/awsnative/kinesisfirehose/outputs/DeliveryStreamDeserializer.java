// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamHiveJsonSerDe;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamOpenXJsonSerDe;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeliveryStreamDeserializer {
    private final @Nullable DeliveryStreamHiveJsonSerDe hiveJsonSerDe;
    private final @Nullable DeliveryStreamOpenXJsonSerDe openXJsonSerDe;

    @OutputCustomType.Constructor({"hiveJsonSerDe","openXJsonSerDe"})
    private DeliveryStreamDeserializer(
        @Nullable DeliveryStreamHiveJsonSerDe hiveJsonSerDe,
        @Nullable DeliveryStreamOpenXJsonSerDe openXJsonSerDe) {
        this.hiveJsonSerDe = hiveJsonSerDe;
        this.openXJsonSerDe = openXJsonSerDe;
    }

    public Optional<DeliveryStreamHiveJsonSerDe> getHiveJsonSerDe() {
        return Optional.ofNullable(this.hiveJsonSerDe);
    }
    public Optional<DeliveryStreamOpenXJsonSerDe> getOpenXJsonSerDe() {
        return Optional.ofNullable(this.openXJsonSerDe);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamDeserializer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DeliveryStreamHiveJsonSerDe hiveJsonSerDe;
        private @Nullable DeliveryStreamOpenXJsonSerDe openXJsonSerDe;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamDeserializer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hiveJsonSerDe = defaults.hiveJsonSerDe;
    	      this.openXJsonSerDe = defaults.openXJsonSerDe;
        }

        public Builder setHiveJsonSerDe(@Nullable DeliveryStreamHiveJsonSerDe hiveJsonSerDe) {
            this.hiveJsonSerDe = hiveJsonSerDe;
            return this;
        }

        public Builder setOpenXJsonSerDe(@Nullable DeliveryStreamOpenXJsonSerDe openXJsonSerDe) {
            this.openXJsonSerDe = openXJsonSerDe;
            return this;
        }

        public DeliveryStreamDeserializer build() {
            return new DeliveryStreamDeserializer(hiveJsonSerDe, openXJsonSerDe);
        }
    }
}
