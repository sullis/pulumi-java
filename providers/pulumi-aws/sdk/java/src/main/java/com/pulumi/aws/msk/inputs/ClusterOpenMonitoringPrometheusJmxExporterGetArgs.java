// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ClusterOpenMonitoringPrometheusJmxExporterGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterOpenMonitoringPrometheusJmxExporterGetArgs Empty = new ClusterOpenMonitoringPrometheusJmxExporterGetArgs();

    /**
     * Indicates whether you want to enable or disable the JMX Exporter.
     * 
     */
    @Import(name="enabledInBroker", required=true)
    private Output<Boolean> enabledInBroker;

    /**
     * @return Indicates whether you want to enable or disable the JMX Exporter.
     * 
     */
    public Output<Boolean> enabledInBroker() {
        return this.enabledInBroker;
    }

    private ClusterOpenMonitoringPrometheusJmxExporterGetArgs() {}

    private ClusterOpenMonitoringPrometheusJmxExporterGetArgs(ClusterOpenMonitoringPrometheusJmxExporterGetArgs $) {
        this.enabledInBroker = $.enabledInBroker;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterOpenMonitoringPrometheusJmxExporterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterOpenMonitoringPrometheusJmxExporterGetArgs $;

        public Builder() {
            $ = new ClusterOpenMonitoringPrometheusJmxExporterGetArgs();
        }

        public Builder(ClusterOpenMonitoringPrometheusJmxExporterGetArgs defaults) {
            $ = new ClusterOpenMonitoringPrometheusJmxExporterGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabledInBroker Indicates whether you want to enable or disable the JMX Exporter.
         * 
         * @return builder
         * 
         */
        public Builder enabledInBroker(Output<Boolean> enabledInBroker) {
            $.enabledInBroker = enabledInBroker;
            return this;
        }

        /**
         * @param enabledInBroker Indicates whether you want to enable or disable the JMX Exporter.
         * 
         * @return builder
         * 
         */
        public Builder enabledInBroker(Boolean enabledInBroker) {
            return enabledInBroker(Output.of(enabledInBroker));
        }

        public ClusterOpenMonitoringPrometheusJmxExporterGetArgs build() {
            $.enabledInBroker = Objects.requireNonNull($.enabledInBroker, "expected parameter 'enabledInBroker' to be non-null");
            return $;
        }
    }

}
