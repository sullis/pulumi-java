// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorFirehoseLogDelivery {
    private final @Nullable String deliveryStream;
    private final Boolean enabled;

    @OutputCustomType.Constructor({"deliveryStream","enabled"})
    private ConnectorFirehoseLogDelivery(
        @Nullable String deliveryStream,
        Boolean enabled) {
        this.deliveryStream = deliveryStream;
        this.enabled = Objects.requireNonNull(enabled);
    }

    public Optional<String> getDeliveryStream() {
        return Optional.ofNullable(this.deliveryStream);
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorFirehoseLogDelivery defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deliveryStream;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorFirehoseLogDelivery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryStream = defaults.deliveryStream;
    	      this.enabled = defaults.enabled;
        }

        public Builder setDeliveryStream(@Nullable String deliveryStream) {
            this.deliveryStream = deliveryStream;
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public ConnectorFirehoseLogDelivery build() {
            return new ConnectorFirehoseLogDelivery(deliveryStream, enabled);
        }
    }
}
