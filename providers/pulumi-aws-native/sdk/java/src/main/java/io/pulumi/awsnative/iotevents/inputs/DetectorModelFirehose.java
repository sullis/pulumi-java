// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelPayload;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DetectorModelFirehose extends io.pulumi.resources.InvokeArgs {

    public static final DetectorModelFirehose Empty = new DetectorModelFirehose();

    @InputImport(name="deliveryStreamName", required=true)
    private final String deliveryStreamName;

    public String getDeliveryStreamName() {
        return this.deliveryStreamName;
    }

    @InputImport(name="payload")
    private final @Nullable DetectorModelPayload payload;

    public Optional<DetectorModelPayload> getPayload() {
        return this.payload == null ? Optional.empty() : Optional.ofNullable(this.payload);
    }

    @InputImport(name="separator")
    private final @Nullable String separator;

    public Optional<String> getSeparator() {
        return this.separator == null ? Optional.empty() : Optional.ofNullable(this.separator);
    }

    public DetectorModelFirehose(
        String deliveryStreamName,
        @Nullable DetectorModelPayload payload,
        @Nullable String separator) {
        this.deliveryStreamName = Objects.requireNonNull(deliveryStreamName, "expected parameter 'deliveryStreamName' to be non-null");
        this.payload = payload;
        this.separator = separator;
    }

    private DetectorModelFirehose() {
        this.deliveryStreamName = null;
        this.payload = null;
        this.separator = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelFirehose defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deliveryStreamName;
        private @Nullable DetectorModelPayload payload;
        private @Nullable String separator;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelFirehose defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryStreamName = defaults.deliveryStreamName;
    	      this.payload = defaults.payload;
    	      this.separator = defaults.separator;
        }

        public Builder setDeliveryStreamName(String deliveryStreamName) {
            this.deliveryStreamName = Objects.requireNonNull(deliveryStreamName);
            return this;
        }

        public Builder setPayload(@Nullable DetectorModelPayload payload) {
            this.payload = payload;
            return this;
        }

        public Builder setSeparator(@Nullable String separator) {
            this.separator = separator;
            return this;
        }

        public DetectorModelFirehose build() {
            return new DetectorModelFirehose(deliveryStreamName, payload, separator);
        }
    }
}
