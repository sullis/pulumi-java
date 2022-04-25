// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class RuntimeMetricsResponse {
    /**
     * @return The system metrics.
     * 
     */
    private final Map<String,String> systemMetrics;

    @CustomType.Constructor
    private RuntimeMetricsResponse(@CustomType.Parameter("systemMetrics") Map<String,String> systemMetrics) {
        this.systemMetrics = systemMetrics;
    }

    /**
     * @return The system metrics.
     * 
     */
    public Map<String,String> systemMetrics() {
        return this.systemMetrics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeMetricsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> systemMetrics;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeMetricsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.systemMetrics = defaults.systemMetrics;
        }

        public Builder systemMetrics(Map<String,String> systemMetrics) {
            this.systemMetrics = Objects.requireNonNull(systemMetrics);
            return this;
        }        public RuntimeMetricsResponse build() {
            return new RuntimeMetricsResponse(systemMetrics);
        }
    }
}
