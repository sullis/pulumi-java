// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.enums.FlowConnectorType;
import io.pulumi.awsnative.appflow.outputs.FlowIncrementalPullConfig;
import io.pulumi.awsnative.appflow.outputs.FlowSourceConnectorProperties;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowSourceFlowConfig {
    private final @Nullable String connectorProfileName;
    private final FlowConnectorType connectorType;
    private final @Nullable FlowIncrementalPullConfig incrementalPullConfig;
    private final FlowSourceConnectorProperties sourceConnectorProperties;

    @OutputCustomType.Constructor({"connectorProfileName","connectorType","incrementalPullConfig","sourceConnectorProperties"})
    private FlowSourceFlowConfig(
        @Nullable String connectorProfileName,
        FlowConnectorType connectorType,
        @Nullable FlowIncrementalPullConfig incrementalPullConfig,
        FlowSourceConnectorProperties sourceConnectorProperties) {
        this.connectorProfileName = connectorProfileName;
        this.connectorType = Objects.requireNonNull(connectorType);
        this.incrementalPullConfig = incrementalPullConfig;
        this.sourceConnectorProperties = Objects.requireNonNull(sourceConnectorProperties);
    }

    public Optional<String> getConnectorProfileName() {
        return Optional.ofNullable(this.connectorProfileName);
    }
    public FlowConnectorType getConnectorType() {
        return this.connectorType;
    }
    public Optional<FlowIncrementalPullConfig> getIncrementalPullConfig() {
        return Optional.ofNullable(this.incrementalPullConfig);
    }
    public FlowSourceConnectorProperties getSourceConnectorProperties() {
        return this.sourceConnectorProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSourceFlowConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String connectorProfileName;
        private FlowConnectorType connectorType;
        private @Nullable FlowIncrementalPullConfig incrementalPullConfig;
        private FlowSourceConnectorProperties sourceConnectorProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSourceFlowConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorProfileName = defaults.connectorProfileName;
    	      this.connectorType = defaults.connectorType;
    	      this.incrementalPullConfig = defaults.incrementalPullConfig;
    	      this.sourceConnectorProperties = defaults.sourceConnectorProperties;
        }

        public Builder setConnectorProfileName(@Nullable String connectorProfileName) {
            this.connectorProfileName = connectorProfileName;
            return this;
        }

        public Builder setConnectorType(FlowConnectorType connectorType) {
            this.connectorType = Objects.requireNonNull(connectorType);
            return this;
        }

        public Builder setIncrementalPullConfig(@Nullable FlowIncrementalPullConfig incrementalPullConfig) {
            this.incrementalPullConfig = incrementalPullConfig;
            return this;
        }

        public Builder setSourceConnectorProperties(FlowSourceConnectorProperties sourceConnectorProperties) {
            this.sourceConnectorProperties = Objects.requireNonNull(sourceConnectorProperties);
            return this;
        }

        public FlowSourceFlowConfig build() {
            return new FlowSourceFlowConfig(connectorProfileName, connectorType, incrementalPullConfig, sourceConnectorProperties);
        }
    }
}
