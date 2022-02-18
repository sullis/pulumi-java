// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.outputs;

import io.pulumi.awsnative.kafkaconnect.outputs.ConnectorCapacity;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetConnectorResult {
    private final @Nullable ConnectorCapacity capacity;
    /**
     * Amazon Resource Name for the created Connector.
     * 
     */
    private final @Nullable String connectorArn;

    @OutputCustomType.Constructor({"capacity","connectorArn"})
    private GetConnectorResult(
        @Nullable ConnectorCapacity capacity,
        @Nullable String connectorArn) {
        this.capacity = capacity;
        this.connectorArn = connectorArn;
    }

    public Optional<ConnectorCapacity> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * Amazon Resource Name for the created Connector.
     * 
     */
    public Optional<String> getConnectorArn() {
        return Optional.ofNullable(this.connectorArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConnectorCapacity capacity;
        private @Nullable String connectorArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.connectorArn = defaults.connectorArn;
        }

        public Builder setCapacity(@Nullable ConnectorCapacity capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setConnectorArn(@Nullable String connectorArn) {
            this.connectorArn = connectorArn;
            return this;
        }

        public GetConnectorResult build() {
            return new GetConnectorResult(capacity, connectorArn);
        }
    }
}
