// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow;

import io.pulumi.awsnative.appflow.enums.ConnectorProfileConnectionMode;
import io.pulumi.awsnative.appflow.enums.ConnectorProfileConnectorType;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileArgs Empty = new ConnectorProfileArgs();

    @InputImport(name="connectionMode", required=true)
    private final Input<ConnectorProfileConnectionMode> connectionMode;

    public Input<ConnectorProfileConnectionMode> getConnectionMode() {
        return this.connectionMode;
    }

    @InputImport(name="connectorProfileConfig")
    private final @Nullable Input<ConnectorProfileConfigArgs> connectorProfileConfig;

    public Input<ConnectorProfileConfigArgs> getConnectorProfileConfig() {
        return this.connectorProfileConfig == null ? Input.empty() : this.connectorProfileConfig;
    }

    @InputImport(name="connectorProfileName")
    private final @Nullable Input<String> connectorProfileName;

    public Input<String> getConnectorProfileName() {
        return this.connectorProfileName == null ? Input.empty() : this.connectorProfileName;
    }

    @InputImport(name="connectorType", required=true)
    private final Input<ConnectorProfileConnectorType> connectorType;

    public Input<ConnectorProfileConnectorType> getConnectorType() {
        return this.connectorType;
    }

    @InputImport(name="kMSArn")
    private final @Nullable Input<String> kMSArn;

    public Input<String> getKMSArn() {
        return this.kMSArn == null ? Input.empty() : this.kMSArn;
    }

    public ConnectorProfileArgs(
        Input<ConnectorProfileConnectionMode> connectionMode,
        @Nullable Input<ConnectorProfileConfigArgs> connectorProfileConfig,
        @Nullable Input<String> connectorProfileName,
        Input<ConnectorProfileConnectorType> connectorType,
        @Nullable Input<String> kMSArn) {
        this.connectionMode = Objects.requireNonNull(connectionMode, "expected parameter 'connectionMode' to be non-null");
        this.connectorProfileConfig = connectorProfileConfig;
        this.connectorProfileName = connectorProfileName;
        this.connectorType = Objects.requireNonNull(connectorType, "expected parameter 'connectorType' to be non-null");
        this.kMSArn = kMSArn;
    }

    private ConnectorProfileArgs() {
        this.connectionMode = Input.empty();
        this.connectorProfileConfig = Input.empty();
        this.connectorProfileName = Input.empty();
        this.connectorType = Input.empty();
        this.kMSArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ConnectorProfileConnectionMode> connectionMode;
        private @Nullable Input<ConnectorProfileConfigArgs> connectorProfileConfig;
        private @Nullable Input<String> connectorProfileName;
        private Input<ConnectorProfileConnectorType> connectorType;
        private @Nullable Input<String> kMSArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionMode = defaults.connectionMode;
    	      this.connectorProfileConfig = defaults.connectorProfileConfig;
    	      this.connectorProfileName = defaults.connectorProfileName;
    	      this.connectorType = defaults.connectorType;
    	      this.kMSArn = defaults.kMSArn;
        }

        public Builder setConnectionMode(Input<ConnectorProfileConnectionMode> connectionMode) {
            this.connectionMode = Objects.requireNonNull(connectionMode);
            return this;
        }

        public Builder setConnectionMode(ConnectorProfileConnectionMode connectionMode) {
            this.connectionMode = Input.of(Objects.requireNonNull(connectionMode));
            return this;
        }

        public Builder setConnectorProfileConfig(@Nullable Input<ConnectorProfileConfigArgs> connectorProfileConfig) {
            this.connectorProfileConfig = connectorProfileConfig;
            return this;
        }

        public Builder setConnectorProfileConfig(@Nullable ConnectorProfileConfigArgs connectorProfileConfig) {
            this.connectorProfileConfig = Input.ofNullable(connectorProfileConfig);
            return this;
        }

        public Builder setConnectorProfileName(@Nullable Input<String> connectorProfileName) {
            this.connectorProfileName = connectorProfileName;
            return this;
        }

        public Builder setConnectorProfileName(@Nullable String connectorProfileName) {
            this.connectorProfileName = Input.ofNullable(connectorProfileName);
            return this;
        }

        public Builder setConnectorType(Input<ConnectorProfileConnectorType> connectorType) {
            this.connectorType = Objects.requireNonNull(connectorType);
            return this;
        }

        public Builder setConnectorType(ConnectorProfileConnectorType connectorType) {
            this.connectorType = Input.of(Objects.requireNonNull(connectorType));
            return this;
        }

        public Builder setKMSArn(@Nullable Input<String> kMSArn) {
            this.kMSArn = kMSArn;
            return this;
        }

        public Builder setKMSArn(@Nullable String kMSArn) {
            this.kMSArn = Input.ofNullable(kMSArn);
            return this;
        }

        public ConnectorProfileArgs build() {
            return new ConnectorProfileArgs(connectionMode, connectorProfileConfig, connectorProfileName, connectorType, kMSArn);
        }
    }
}
