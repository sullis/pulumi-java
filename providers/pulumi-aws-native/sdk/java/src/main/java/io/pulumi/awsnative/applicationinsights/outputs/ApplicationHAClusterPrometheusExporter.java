// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationHAClusterPrometheusExporter {
    /**
     * Prometheus exporter port.
     * 
     */
    private final @Nullable String prometheusPort;

    @CustomType.Constructor
    private ApplicationHAClusterPrometheusExporter(@CustomType.Parameter("prometheusPort") @Nullable String prometheusPort) {
        this.prometheusPort = prometheusPort;
    }

    /**
     * Prometheus exporter port.
     * 
    */
    public Optional<String> prometheusPort() {
        return Optional.ofNullable(this.prometheusPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationHAClusterPrometheusExporter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String prometheusPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationHAClusterPrometheusExporter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prometheusPort = defaults.prometheusPort;
        }

        public Builder prometheusPort(@Nullable String prometheusPort) {
            this.prometheusPort = prometheusPort;
            return this;
        }        public ApplicationHAClusterPrometheusExporter build() {
            return new ApplicationHAClusterPrometheusExporter(prometheusPort);
        }
    }
}
