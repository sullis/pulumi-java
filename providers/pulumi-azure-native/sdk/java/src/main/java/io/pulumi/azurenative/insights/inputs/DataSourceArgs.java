// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.DataSourceConfigurationArgs;
import io.pulumi.azurenative.insights.inputs.SinkConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Data source object contains configuration to collect telemetry and one or more sinks to send that telemetry data to
 * 
 */
public final class DataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceArgs Empty = new DataSourceArgs();

    @InputImport(name="configuration", required=true)
    private final Input<DataSourceConfigurationArgs> configuration;

    public Input<DataSourceConfigurationArgs> getConfiguration() {
        return this.configuration;
    }

    /**
     * Datasource kind
     * 
     */
    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    @InputImport(name="sinks", required=true)
    private final Input<List<SinkConfigurationArgs>> sinks;

    public Input<List<SinkConfigurationArgs>> getSinks() {
        return this.sinks;
    }

    public DataSourceArgs(
        Input<DataSourceConfigurationArgs> configuration,
        Input<String> kind,
        Input<List<SinkConfigurationArgs>> sinks) {
        this.configuration = Objects.requireNonNull(configuration, "expected parameter 'configuration' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.sinks = Objects.requireNonNull(sinks, "expected parameter 'sinks' to be non-null");
    }

    private DataSourceArgs() {
        this.configuration = Input.empty();
        this.kind = Input.empty();
        this.sinks = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DataSourceConfigurationArgs> configuration;
        private Input<String> kind;
        private Input<List<SinkConfigurationArgs>> sinks;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.kind = defaults.kind;
    	      this.sinks = defaults.sinks;
        }

        public Builder setConfiguration(Input<DataSourceConfigurationArgs> configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }

        public Builder setConfiguration(DataSourceConfigurationArgs configuration) {
            this.configuration = Input.of(Objects.requireNonNull(configuration));
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setSinks(Input<List<SinkConfigurationArgs>> sinks) {
            this.sinks = Objects.requireNonNull(sinks);
            return this;
        }

        public Builder setSinks(List<SinkConfigurationArgs> sinks) {
            this.sinks = Input.of(Objects.requireNonNull(sinks));
            return this;
        }

        public DataSourceArgs build() {
            return new DataSourceArgs(configuration, kind, sinks);
        }
    }
}
