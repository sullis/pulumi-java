// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BillingDestinationResponse {
    /**
     * @return Names of the metrics to report to this billing destination. Each name must be defined in Service.metrics section.
     * 
     */
    private final List<String> metrics;
    /**
     * @return The monitored resource type. The type must be defined in Service.monitored_resources section.
     * 
     */
    private final String monitoredResource;

    @CustomType.Constructor
    private BillingDestinationResponse(
        @CustomType.Parameter("metrics") List<String> metrics,
        @CustomType.Parameter("monitoredResource") String monitoredResource) {
        this.metrics = metrics;
        this.monitoredResource = monitoredResource;
    }

    /**
     * @return Names of the metrics to report to this billing destination. Each name must be defined in Service.metrics section.
     * 
     */
    public List<String> metrics() {
        return this.metrics;
    }
    /**
     * @return The monitored resource type. The type must be defined in Service.monitored_resources section.
     * 
     */
    public String monitoredResource() {
        return this.monitoredResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> metrics;
        private String monitoredResource;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metrics = defaults.metrics;
    	      this.monitoredResource = defaults.monitoredResource;
        }

        public Builder metrics(List<String> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }
        public Builder metrics(String... metrics) {
            return metrics(List.of(metrics));
        }
        public Builder monitoredResource(String monitoredResource) {
            this.monitoredResource = Objects.requireNonNull(monitoredResource);
            return this;
        }        public BillingDestinationResponse build() {
            return new BillingDestinationResponse(metrics, monitoredResource);
        }
    }
}
