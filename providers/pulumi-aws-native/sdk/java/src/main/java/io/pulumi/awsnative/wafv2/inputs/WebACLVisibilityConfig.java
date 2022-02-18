// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Visibility Metric of the WebACL.
 * 
 */
public final class WebACLVisibilityConfig extends io.pulumi.resources.InvokeArgs {

    public static final WebACLVisibilityConfig Empty = new WebACLVisibilityConfig();

    @InputImport(name="cloudWatchMetricsEnabled", required=true)
    private final Boolean cloudWatchMetricsEnabled;

    public Boolean getCloudWatchMetricsEnabled() {
        return this.cloudWatchMetricsEnabled;
    }

    @InputImport(name="metricName", required=true)
    private final String metricName;

    public String getMetricName() {
        return this.metricName;
    }

    @InputImport(name="sampledRequestsEnabled", required=true)
    private final Boolean sampledRequestsEnabled;

    public Boolean getSampledRequestsEnabled() {
        return this.sampledRequestsEnabled;
    }

    public WebACLVisibilityConfig(
        Boolean cloudWatchMetricsEnabled,
        String metricName,
        Boolean sampledRequestsEnabled) {
        this.cloudWatchMetricsEnabled = Objects.requireNonNull(cloudWatchMetricsEnabled, "expected parameter 'cloudWatchMetricsEnabled' to be non-null");
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.sampledRequestsEnabled = Objects.requireNonNull(sampledRequestsEnabled, "expected parameter 'sampledRequestsEnabled' to be non-null");
    }

    private WebACLVisibilityConfig() {
        this.cloudWatchMetricsEnabled = null;
        this.metricName = null;
        this.sampledRequestsEnabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLVisibilityConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean cloudWatchMetricsEnabled;
        private String metricName;
        private Boolean sampledRequestsEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLVisibilityConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchMetricsEnabled = defaults.cloudWatchMetricsEnabled;
    	      this.metricName = defaults.metricName;
    	      this.sampledRequestsEnabled = defaults.sampledRequestsEnabled;
        }

        public Builder setCloudWatchMetricsEnabled(Boolean cloudWatchMetricsEnabled) {
            this.cloudWatchMetricsEnabled = Objects.requireNonNull(cloudWatchMetricsEnabled);
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setSampledRequestsEnabled(Boolean sampledRequestsEnabled) {
            this.sampledRequestsEnabled = Objects.requireNonNull(sampledRequestsEnabled);
            return this;
        }

        public WebACLVisibilityConfig build() {
            return new WebACLVisibilityConfig(cloudWatchMetricsEnabled, metricName, sampledRequestsEnabled);
        }
    }
}
