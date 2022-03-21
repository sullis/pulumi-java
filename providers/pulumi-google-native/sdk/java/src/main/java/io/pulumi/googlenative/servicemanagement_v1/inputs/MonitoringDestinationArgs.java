// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="metrics")
      private final @Nullable Output<List<String>> metrics;

    public Output<List<String>> getMetrics() {
        return this.metrics == null ? Output.empty() : this.metrics;
    }

    /**
     * The monitored resource type. The type must be defined in Service.monitored_resources section.
     * 
     */
    @Import(name="monitoredResource")
      private final @Nullable Output<String> monitoredResource;

    public Output<String> getMonitoredResource() {
        return this.monitoredResource == null ? Output.empty() : this.monitoredResource;
    }

    public MonitoringDestinationArgs(
        @Nullable Output<List<String>> metrics,
        @Nullable Output<String> monitoredResource) {
        this.metrics = metrics;
        this.monitoredResource = monitoredResource;
    }

    private MonitoringDestinationArgs() {
        this.metrics = Output.empty();
        this.monitoredResource = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> metrics;
        private @Nullable Output<String> monitoredResource;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metrics = defaults.metrics;
    	      this.monitoredResource = defaults.monitoredResource;
        }

        public Builder metrics(@Nullable Output<List<String>> metrics) {
            this.metrics = metrics;
            return this;
        }
        public Builder metrics(@Nullable List<String> metrics) {
            this.metrics = Output.ofNullable(metrics);
            return this;
        }
        public Builder metrics(String... metrics) {
            return metrics(List.of(metrics));
        }
        public Builder monitoredResource(@Nullable Output<String> monitoredResource) {
            this.monitoredResource = monitoredResource;
            return this;
        }
        public Builder monitoredResource(@Nullable String monitoredResource) {
            this.monitoredResource = Output.ofNullable(monitoredResource);
            return this;
        }        public MonitoringDestinationArgs build() {
            return new MonitoringDestinationArgs(metrics, monitoredResource);
        }
    }
}
