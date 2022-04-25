// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs Empty = new ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs();

    /**
     * Describes whether to use the default CloudWatch logging configuration for an application. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `log_level` or `metrics_level` attribute values to be effective.
     * 
     */
    @Import(name="configurationType", required=true)
    private Output<String> configurationType;

    /**
     * @return Describes whether to use the default CloudWatch logging configuration for an application. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `log_level` or `metrics_level` attribute values to be effective.
     * 
     */
    public Output<String> configurationType() {
        return this.configurationType;
    }

    /**
     * Describes the verbosity of the CloudWatch Logs for an application. Valid values: `DEBUG`, `ERROR`, `INFO`, `WARN`.
     * 
     */
    @Import(name="logLevel")
    private @Nullable Output<String> logLevel;

    /**
     * @return Describes the verbosity of the CloudWatch Logs for an application. Valid values: `DEBUG`, `ERROR`, `INFO`, `WARN`.
     * 
     */
    public Optional<Output<String>> logLevel() {
        return Optional.ofNullable(this.logLevel);
    }

    /**
     * Describes the granularity of the CloudWatch Logs for an application. Valid values: `APPLICATION`, `OPERATOR`, `PARALLELISM`, `TASK`.
     * 
     */
    @Import(name="metricsLevel")
    private @Nullable Output<String> metricsLevel;

    /**
     * @return Describes the granularity of the CloudWatch Logs for an application. Valid values: `APPLICATION`, `OPERATOR`, `PARALLELISM`, `TASK`.
     * 
     */
    public Optional<Output<String>> metricsLevel() {
        return Optional.ofNullable(this.metricsLevel);
    }

    private ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs() {}

    private ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs(ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs $) {
        this.configurationType = $.configurationType;
        this.logLevel = $.logLevel;
        this.metricsLevel = $.metricsLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs();
        }

        public Builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs defaults) {
            $ = new ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationType Describes whether to use the default CloudWatch logging configuration for an application. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `log_level` or `metrics_level` attribute values to be effective.
         * 
         * @return builder
         * 
         */
        public Builder configurationType(Output<String> configurationType) {
            $.configurationType = configurationType;
            return this;
        }

        /**
         * @param configurationType Describes whether to use the default CloudWatch logging configuration for an application. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `log_level` or `metrics_level` attribute values to be effective.
         * 
         * @return builder
         * 
         */
        public Builder configurationType(String configurationType) {
            return configurationType(Output.of(configurationType));
        }

        /**
         * @param logLevel Describes the verbosity of the CloudWatch Logs for an application. Valid values: `DEBUG`, `ERROR`, `INFO`, `WARN`.
         * 
         * @return builder
         * 
         */
        public Builder logLevel(@Nullable Output<String> logLevel) {
            $.logLevel = logLevel;
            return this;
        }

        /**
         * @param logLevel Describes the verbosity of the CloudWatch Logs for an application. Valid values: `DEBUG`, `ERROR`, `INFO`, `WARN`.
         * 
         * @return builder
         * 
         */
        public Builder logLevel(String logLevel) {
            return logLevel(Output.of(logLevel));
        }

        /**
         * @param metricsLevel Describes the granularity of the CloudWatch Logs for an application. Valid values: `APPLICATION`, `OPERATOR`, `PARALLELISM`, `TASK`.
         * 
         * @return builder
         * 
         */
        public Builder metricsLevel(@Nullable Output<String> metricsLevel) {
            $.metricsLevel = metricsLevel;
            return this;
        }

        /**
         * @param metricsLevel Describes the granularity of the CloudWatch Logs for an application. Valid values: `APPLICATION`, `OPERATOR`, `PARALLELISM`, `TASK`.
         * 
         * @return builder
         * 
         */
        public Builder metricsLevel(String metricsLevel) {
            return metricsLevel(Output.of(metricsLevel));
        }

        public ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs build() {
            $.configurationType = Objects.requireNonNull($.configurationType, "expected parameter 'configurationType' to be non-null");
            return $;
        }
    }

}
