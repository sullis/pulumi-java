// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.azurenative.logz.inputs.MetricRulesResponse;
import io.pulumi.azurenative.logz.inputs.SystemDataResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of the properties for a TagRules resource.
 * 
 */
public final class MetricsTagRulesPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetricsTagRulesPropertiesResponse Empty = new MetricsTagRulesPropertiesResponse();

    @InputImport(name="metricRules")
      private final @Nullable List<MetricRulesResponse> metricRules;

    public List<MetricRulesResponse> getMetricRules() {
        return this.metricRules == null ? List.of() : this.metricRules;
    }

    /**
     * Flag specifying if the resource provisioning state as tracked by ARM.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Flag specifying if metrics from Azure resources should be sent for the Monitor resource.
     * 
     */
    @InputImport(name="sendMetrics")
      private final @Nullable Boolean sendMetrics;

    public Optional<Boolean> getSendMetrics() {
        return this.sendMetrics == null ? Optional.empty() : Optional.ofNullable(this.sendMetrics);
    }

    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @InputImport(name="systemData", required=true)
      private final SystemDataResponse systemData;

    public SystemDataResponse getSystemData() {
        return this.systemData;
    }

    public MetricsTagRulesPropertiesResponse(
        @Nullable List<MetricRulesResponse> metricRules,
        String provisioningState,
        @Nullable Boolean sendMetrics,
        SystemDataResponse systemData) {
        this.metricRules = metricRules;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.sendMetrics = sendMetrics;
        this.systemData = Objects.requireNonNull(systemData, "expected parameter 'systemData' to be non-null");
    }

    private MetricsTagRulesPropertiesResponse() {
        this.metricRules = List.of();
        this.provisioningState = null;
        this.sendMetrics = null;
        this.systemData = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricsTagRulesPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<MetricRulesResponse> metricRules;
        private String provisioningState;
        private @Nullable Boolean sendMetrics;
        private SystemDataResponse systemData;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricsTagRulesPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricRules = defaults.metricRules;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sendMetrics = defaults.sendMetrics;
    	      this.systemData = defaults.systemData;
        }

        public Builder setMetricRules(@Nullable List<MetricRulesResponse> metricRules) {
            this.metricRules = metricRules;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSendMetrics(@Nullable Boolean sendMetrics) {
            this.sendMetrics = sendMetrics;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public MetricsTagRulesPropertiesResponse build() {
            return new MetricsTagRulesPropertiesResponse(metricRules, provisioningState, sendMetrics, systemData);
        }
    }
}