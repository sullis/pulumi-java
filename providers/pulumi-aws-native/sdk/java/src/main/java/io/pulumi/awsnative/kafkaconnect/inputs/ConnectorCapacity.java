// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorAutoScaling;
import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorProvisionedCapacity;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the capacity allocated to the connector.
 * 
 */
public final class ConnectorCapacity extends io.pulumi.resources.InvokeArgs {

    public static final ConnectorCapacity Empty = new ConnectorCapacity();

    @Import(name="autoScaling")
      private final @Nullable ConnectorAutoScaling autoScaling;

    public Optional<ConnectorAutoScaling> autoScaling() {
        return this.autoScaling == null ? Optional.empty() : Optional.ofNullable(this.autoScaling);
    }

    @Import(name="provisionedCapacity")
      private final @Nullable ConnectorProvisionedCapacity provisionedCapacity;

    public Optional<ConnectorProvisionedCapacity> provisionedCapacity() {
        return this.provisionedCapacity == null ? Optional.empty() : Optional.ofNullable(this.provisionedCapacity);
    }

    public ConnectorCapacity(
        @Nullable ConnectorAutoScaling autoScaling,
        @Nullable ConnectorProvisionedCapacity provisionedCapacity) {
        this.autoScaling = autoScaling;
        this.provisionedCapacity = provisionedCapacity;
    }

    private ConnectorCapacity() {
        this.autoScaling = null;
        this.provisionedCapacity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorCapacity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConnectorAutoScaling autoScaling;
        private @Nullable ConnectorProvisionedCapacity provisionedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorCapacity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScaling = defaults.autoScaling;
    	      this.provisionedCapacity = defaults.provisionedCapacity;
        }

        public Builder autoScaling(@Nullable ConnectorAutoScaling autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }
        public Builder provisionedCapacity(@Nullable ConnectorProvisionedCapacity provisionedCapacity) {
            this.provisionedCapacity = provisionedCapacity;
            return this;
        }        public ConnectorCapacity build() {
            return new ConnectorCapacity(autoScaling, provisionedCapacity);
        }
    }
}
