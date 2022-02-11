// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.awsnative.customerprofiles.enums.IntegrationConnectorType;
import io.pulumi.awsnative.customerprofiles.inputs.IntegrationIncrementalPullConfigArgs;
import io.pulumi.awsnative.customerprofiles.inputs.IntegrationSourceConnectorPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationSourceFlowConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationSourceFlowConfigArgs Empty = new IntegrationSourceFlowConfigArgs();

    @InputImport(name="connectorProfileName")
    private final @Nullable Input<String> connectorProfileName;

    public Input<String> getConnectorProfileName() {
        return this.connectorProfileName == null ? Input.empty() : this.connectorProfileName;
    }

    @InputImport(name="connectorType", required=true)
    private final Input<IntegrationConnectorType> connectorType;

    public Input<IntegrationConnectorType> getConnectorType() {
        return this.connectorType;
    }

    @InputImport(name="incrementalPullConfig")
    private final @Nullable Input<IntegrationIncrementalPullConfigArgs> incrementalPullConfig;

    public Input<IntegrationIncrementalPullConfigArgs> getIncrementalPullConfig() {
        return this.incrementalPullConfig == null ? Input.empty() : this.incrementalPullConfig;
    }

    @InputImport(name="sourceConnectorProperties", required=true)
    private final Input<IntegrationSourceConnectorPropertiesArgs> sourceConnectorProperties;

    public Input<IntegrationSourceConnectorPropertiesArgs> getSourceConnectorProperties() {
        return this.sourceConnectorProperties;
    }

    public IntegrationSourceFlowConfigArgs(
        @Nullable Input<String> connectorProfileName,
        Input<IntegrationConnectorType> connectorType,
        @Nullable Input<IntegrationIncrementalPullConfigArgs> incrementalPullConfig,
        Input<IntegrationSourceConnectorPropertiesArgs> sourceConnectorProperties) {
        this.connectorProfileName = connectorProfileName;
        this.connectorType = Objects.requireNonNull(connectorType, "expected parameter 'connectorType' to be non-null");
        this.incrementalPullConfig = incrementalPullConfig;
        this.sourceConnectorProperties = Objects.requireNonNull(sourceConnectorProperties, "expected parameter 'sourceConnectorProperties' to be non-null");
    }

    private IntegrationSourceFlowConfigArgs() {
        this.connectorProfileName = Input.empty();
        this.connectorType = Input.empty();
        this.incrementalPullConfig = Input.empty();
        this.sourceConnectorProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationSourceFlowConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> connectorProfileName;
        private Input<IntegrationConnectorType> connectorType;
        private @Nullable Input<IntegrationIncrementalPullConfigArgs> incrementalPullConfig;
        private Input<IntegrationSourceConnectorPropertiesArgs> sourceConnectorProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationSourceFlowConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorProfileName = defaults.connectorProfileName;
    	      this.connectorType = defaults.connectorType;
    	      this.incrementalPullConfig = defaults.incrementalPullConfig;
    	      this.sourceConnectorProperties = defaults.sourceConnectorProperties;
        }

        public Builder setConnectorProfileName(@Nullable Input<String> connectorProfileName) {
            this.connectorProfileName = connectorProfileName;
            return this;
        }

        public Builder setConnectorProfileName(@Nullable String connectorProfileName) {
            this.connectorProfileName = Input.ofNullable(connectorProfileName);
            return this;
        }

        public Builder setConnectorType(Input<IntegrationConnectorType> connectorType) {
            this.connectorType = Objects.requireNonNull(connectorType);
            return this;
        }

        public Builder setConnectorType(IntegrationConnectorType connectorType) {
            this.connectorType = Input.of(Objects.requireNonNull(connectorType));
            return this;
        }

        public Builder setIncrementalPullConfig(@Nullable Input<IntegrationIncrementalPullConfigArgs> incrementalPullConfig) {
            this.incrementalPullConfig = incrementalPullConfig;
            return this;
        }

        public Builder setIncrementalPullConfig(@Nullable IntegrationIncrementalPullConfigArgs incrementalPullConfig) {
            this.incrementalPullConfig = Input.ofNullable(incrementalPullConfig);
            return this;
        }

        public Builder setSourceConnectorProperties(Input<IntegrationSourceConnectorPropertiesArgs> sourceConnectorProperties) {
            this.sourceConnectorProperties = Objects.requireNonNull(sourceConnectorProperties);
            return this;
        }

        public Builder setSourceConnectorProperties(IntegrationSourceConnectorPropertiesArgs sourceConnectorProperties) {
            this.sourceConnectorProperties = Input.of(Objects.requireNonNull(sourceConnectorProperties));
            return this;
        }

        public IntegrationSourceFlowConfigArgs build() {
            return new IntegrationSourceFlowConfigArgs(connectorProfileName, connectorType, incrementalPullConfig, sourceConnectorProperties);
        }
    }
}
