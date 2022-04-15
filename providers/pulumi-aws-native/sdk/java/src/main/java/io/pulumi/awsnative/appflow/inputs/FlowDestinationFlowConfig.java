// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowConnectorType;
import io.pulumi.awsnative.appflow.inputs.FlowDestinationConnectorProperties;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configurations of destination connector.
 * 
 */
public final class FlowDestinationFlowConfig extends io.pulumi.resources.InvokeArgs {

    public static final FlowDestinationFlowConfig Empty = new FlowDestinationFlowConfig();

    /**
     * Name of destination connector profile
     * 
     */
    @Import(name="connectorProfileName")
      private final @Nullable String connectorProfileName;

    public Optional<String> connectorProfileName() {
        return this.connectorProfileName == null ? Optional.empty() : Optional.ofNullable(this.connectorProfileName);
    }

    /**
     * Destination connector type
     * 
     */
    @Import(name="connectorType", required=true)
      private final FlowConnectorType connectorType;

    public FlowConnectorType connectorType() {
        return this.connectorType;
    }

    /**
     * Destination connector details
     * 
     */
    @Import(name="destinationConnectorProperties", required=true)
      private final FlowDestinationConnectorProperties destinationConnectorProperties;

    public FlowDestinationConnectorProperties destinationConnectorProperties() {
        return this.destinationConnectorProperties;
    }

    public FlowDestinationFlowConfig(
        @Nullable String connectorProfileName,
        FlowConnectorType connectorType,
        FlowDestinationConnectorProperties destinationConnectorProperties) {
        this.connectorProfileName = connectorProfileName;
        this.connectorType = Objects.requireNonNull(connectorType, "expected parameter 'connectorType' to be non-null");
        this.destinationConnectorProperties = Objects.requireNonNull(destinationConnectorProperties, "expected parameter 'destinationConnectorProperties' to be non-null");
    }

    private FlowDestinationFlowConfig() {
        this.connectorProfileName = null;
        this.connectorType = null;
        this.destinationConnectorProperties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDestinationFlowConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String connectorProfileName;
        private FlowConnectorType connectorType;
        private FlowDestinationConnectorProperties destinationConnectorProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDestinationFlowConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorProfileName = defaults.connectorProfileName;
    	      this.connectorType = defaults.connectorType;
    	      this.destinationConnectorProperties = defaults.destinationConnectorProperties;
        }

        public Builder connectorProfileName(@Nullable String connectorProfileName) {
            this.connectorProfileName = connectorProfileName;
            return this;
        }
        public Builder connectorType(FlowConnectorType connectorType) {
            this.connectorType = Objects.requireNonNull(connectorType);
            return this;
        }
        public Builder destinationConnectorProperties(FlowDestinationConnectorProperties destinationConnectorProperties) {
            this.destinationConnectorProperties = Objects.requireNonNull(destinationConnectorProperties);
            return this;
        }        public FlowDestinationFlowConfig build() {
            return new FlowDestinationFlowConfig(connectorProfileName, connectorType, destinationConnectorProperties);
        }
    }
}
