// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamHiveJsonSerDe extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamHiveJsonSerDe Empty = new DeliveryStreamHiveJsonSerDe();

    @InputImport(name="timestampFormats")
      private final @Nullable List<String> timestampFormats;

    public List<String> getTimestampFormats() {
        return this.timestampFormats == null ? List.of() : this.timestampFormats;
    }

    public DeliveryStreamHiveJsonSerDe(@Nullable List<String> timestampFormats) {
        this.timestampFormats = timestampFormats;
    }

    private DeliveryStreamHiveJsonSerDe() {
        this.timestampFormats = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamHiveJsonSerDe defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> timestampFormats;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamHiveJsonSerDe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timestampFormats = defaults.timestampFormats;
        }

        public Builder setTimestampFormats(@Nullable List<String> timestampFormats) {
            this.timestampFormats = timestampFormats;
            return this;
        }
        public DeliveryStreamHiveJsonSerDe build() {
            return new DeliveryStreamHiveJsonSerDe(timestampFormats);
        }
    }
}