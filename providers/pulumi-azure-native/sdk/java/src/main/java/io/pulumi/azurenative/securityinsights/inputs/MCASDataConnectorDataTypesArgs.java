// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.DataConnectorDataTypeCommonArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The available data types for MCAS (Microsoft Cloud App Security) data connector.
 * 
 */
public final class MCASDataConnectorDataTypesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MCASDataConnectorDataTypesArgs Empty = new MCASDataConnectorDataTypesArgs();

    /**
     * Alerts data type connection.
     * 
     */
    @InputImport(name="alerts")
      private final @Nullable Input<DataConnectorDataTypeCommonArgs> alerts;

    public Input<DataConnectorDataTypeCommonArgs> getAlerts() {
        return this.alerts == null ? Input.empty() : this.alerts;
    }

    /**
     * Discovery log data type connection.
     * 
     */
    @InputImport(name="discoveryLogs")
      private final @Nullable Input<DataConnectorDataTypeCommonArgs> discoveryLogs;

    public Input<DataConnectorDataTypeCommonArgs> getDiscoveryLogs() {
        return this.discoveryLogs == null ? Input.empty() : this.discoveryLogs;
    }

    public MCASDataConnectorDataTypesArgs(
        @Nullable Input<DataConnectorDataTypeCommonArgs> alerts,
        @Nullable Input<DataConnectorDataTypeCommonArgs> discoveryLogs) {
        this.alerts = alerts;
        this.discoveryLogs = discoveryLogs;
    }

    private MCASDataConnectorDataTypesArgs() {
        this.alerts = Input.empty();
        this.discoveryLogs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MCASDataConnectorDataTypesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DataConnectorDataTypeCommonArgs> alerts;
        private @Nullable Input<DataConnectorDataTypeCommonArgs> discoveryLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(MCASDataConnectorDataTypesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alerts = defaults.alerts;
    	      this.discoveryLogs = defaults.discoveryLogs;
        }

        public Builder setAlerts(@Nullable Input<DataConnectorDataTypeCommonArgs> alerts) {
            this.alerts = alerts;
            return this;
        }

        public Builder setAlerts(@Nullable DataConnectorDataTypeCommonArgs alerts) {
            this.alerts = Input.ofNullable(alerts);
            return this;
        }

        public Builder setDiscoveryLogs(@Nullable Input<DataConnectorDataTypeCommonArgs> discoveryLogs) {
            this.discoveryLogs = discoveryLogs;
            return this;
        }

        public Builder setDiscoveryLogs(@Nullable DataConnectorDataTypeCommonArgs discoveryLogs) {
            this.discoveryLogs = Input.ofNullable(discoveryLogs);
            return this;
        }
        public MCASDataConnectorDataTypesArgs build() {
            return new MCASDataConnectorDataTypesArgs(alerts, discoveryLogs);
        }
    }
}