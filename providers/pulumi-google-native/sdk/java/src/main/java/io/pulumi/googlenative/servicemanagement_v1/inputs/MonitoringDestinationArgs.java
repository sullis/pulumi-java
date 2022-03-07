// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration of a specific monitoring destination (the producer project or the consumer project).
 * 
 */
public final class MonitoringDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringDestinationArgs Empty = new MonitoringDestinationArgs();

    /**
     * Types of the metrics to report to this monitoring destination. Each type must be defined in Service.metrics section.
     * 
     */
    @InputImport(name="metrics")
      private final @Nullable Input<List<String>> metrics;

    public Input<List<String>> getMetrics() {
        return this.metrics == null ? Input.empty() : this.metrics;
    }

    /**
     * The monitored resource type. The type must be defined in Service.monitored_resources section.
     * 
     */
    @InputImport(name="monitoredResource")
      private final @Nullable Input<String> monitoredResource;

    public Input<String> getMonitoredResource() {
        return this.monitoredResource == null ? Input.empty() : this.monitoredResource;
    }

    public MonitoringDestinationArgs(
        @Nullable Input<List<String>> metrics,
        @Nullable Input<String> monitoredResource) {
        this.metrics = metrics;
        this.monitoredResource = monitoredResource;
    }

    private MonitoringDestinationArgs() {
        this.metrics = Input.empty();
        this.monitoredResource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> metrics;
        private @Nullable Input<String> monitoredResource;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metrics = defaults.metrics;
    	      this.monitoredResource = defaults.monitoredResource;
        }

        public Builder setMetrics(@Nullable Input<List<String>> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder setMetrics(@Nullable List<String> metrics) {
            this.metrics = Input.ofNullable(metrics);
            return this;
        }

        public Builder setMonitoredResource(@Nullable Input<String> monitoredResource) {
            this.monitoredResource = monitoredResource;
            return this;
        }

        public Builder setMonitoredResource(@Nullable String monitoredResource) {
            this.monitoredResource = Input.ofNullable(monitoredResource);
            return this;
        }
        public MonitoringDestinationArgs build() {
            return new MonitoringDestinationArgs(metrics, monitoredResource);
        }
    }
}