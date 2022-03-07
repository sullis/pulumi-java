// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Configuration of a specific monitoring destination (the producer project or the consumer project).
 * 
 */
public final class MonitoringDestinationResponse extends io.pulumi.resources.InvokeArgs {

    public static final MonitoringDestinationResponse Empty = new MonitoringDestinationResponse();

    /**
     * Types of the metrics to report to this monitoring destination. Each type must be defined in Service.metrics section.
     * 
     */
    @InputImport(name="metrics", required=true)
      private final List<String> metrics;

    public List<String> getMetrics() {
        return this.metrics;
    }

    /**
     * The monitored resource type. The type must be defined in Service.monitored_resources section.
     * 
     */
    @InputImport(name="monitoredResource", required=true)
      private final String monitoredResource;

    public String getMonitoredResource() {
        return this.monitoredResource;
    }

    public MonitoringDestinationResponse(
        List<String> metrics,
        String monitoredResource) {
        this.metrics = Objects.requireNonNull(metrics, "expected parameter 'metrics' to be non-null");
        this.monitoredResource = Objects.requireNonNull(monitoredResource, "expected parameter 'monitoredResource' to be non-null");
    }

    private MonitoringDestinationResponse() {
        this.metrics = List.of();
        this.monitoredResource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> metrics;
        private String monitoredResource;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metrics = defaults.metrics;
    	      this.monitoredResource = defaults.monitoredResource;
        }

        public Builder setMetrics(List<String> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }

        public Builder setMonitoredResource(String monitoredResource) {
            this.monitoredResource = Objects.requireNonNull(monitoredResource);
            return this;
        }
        public MonitoringDestinationResponse build() {
            return new MonitoringDestinationResponse(metrics, monitoredResource);
        }
    }
}