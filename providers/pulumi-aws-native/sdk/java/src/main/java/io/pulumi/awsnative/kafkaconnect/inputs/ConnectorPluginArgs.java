// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorCustomPluginArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * Details about a Kafka Connect plugin which will be used with the connector.
 * 
 */
public final class ConnectorPluginArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorPluginArgs Empty = new ConnectorPluginArgs();

    @Import(name="customPlugin", required=true)
      private final Output<ConnectorCustomPluginArgs> customPlugin;

    public Output<ConnectorCustomPluginArgs> customPlugin() {
        return this.customPlugin;
    }

    public ConnectorPluginArgs(Output<ConnectorCustomPluginArgs> customPlugin) {
        this.customPlugin = Objects.requireNonNull(customPlugin, "expected parameter 'customPlugin' to be non-null");
    }

    private ConnectorPluginArgs() {
        this.customPlugin = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorPluginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ConnectorCustomPluginArgs> customPlugin;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorPluginArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customPlugin = defaults.customPlugin;
        }

        public Builder customPlugin(Output<ConnectorCustomPluginArgs> customPlugin) {
            this.customPlugin = Objects.requireNonNull(customPlugin);
            return this;
        }
        public Builder customPlugin(ConnectorCustomPluginArgs customPlugin) {
            this.customPlugin = Output.of(Objects.requireNonNull(customPlugin));
            return this;
        }        public ConnectorPluginArgs build() {
            return new ConnectorPluginArgs(customPlugin);
        }
    }
}
