// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.awsnative.applicationinsights.inputs.ApplicationAlarm;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationAlarmMetric;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationHAClusterPrometheusExporter;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationHANAPrometheusExporter;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationJMXPrometheusExporter;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationLog;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationWindowsEvent;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings.
 * 
 */
public final class ApplicationConfigurationDetails extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationConfigurationDetails Empty = new ApplicationConfigurationDetails();

    /**
     * A list of metrics to monitor for the component.
     * 
     */
    @InputImport(name="alarmMetrics")
    private final @Nullable List<ApplicationAlarmMetric> alarmMetrics;

    public List<ApplicationAlarmMetric> getAlarmMetrics() {
        return this.alarmMetrics == null ? List.of() : this.alarmMetrics;
    }

    /**
     * A list of alarms to monitor for the component.
     * 
     */
    @InputImport(name="alarms")
    private final @Nullable List<ApplicationAlarm> alarms;

    public List<ApplicationAlarm> getAlarms() {
        return this.alarms == null ? List.of() : this.alarms;
    }

    /**
     * The HA cluster Prometheus Exporter settings.
     * 
     */
    @InputImport(name="hAClusterPrometheusExporter")
    private final @Nullable ApplicationHAClusterPrometheusExporter hAClusterPrometheusExporter;

    public Optional<ApplicationHAClusterPrometheusExporter> getHAClusterPrometheusExporter() {
        return this.hAClusterPrometheusExporter == null ? Optional.empty() : Optional.ofNullable(this.hAClusterPrometheusExporter);
    }

    /**
     * The HANA DB Prometheus Exporter settings.
     * 
     */
    @InputImport(name="hANAPrometheusExporter")
    private final @Nullable ApplicationHANAPrometheusExporter hANAPrometheusExporter;

    public Optional<ApplicationHANAPrometheusExporter> getHANAPrometheusExporter() {
        return this.hANAPrometheusExporter == null ? Optional.empty() : Optional.ofNullable(this.hANAPrometheusExporter);
    }

    /**
     * The JMX Prometheus Exporter settings.
     * 
     */
    @InputImport(name="jMXPrometheusExporter")
    private final @Nullable ApplicationJMXPrometheusExporter jMXPrometheusExporter;

    public Optional<ApplicationJMXPrometheusExporter> getJMXPrometheusExporter() {
        return this.jMXPrometheusExporter == null ? Optional.empty() : Optional.ofNullable(this.jMXPrometheusExporter);
    }

    /**
     * A list of logs to monitor for the component.
     * 
     */
    @InputImport(name="logs")
    private final @Nullable List<ApplicationLog> logs;

    public List<ApplicationLog> getLogs() {
        return this.logs == null ? List.of() : this.logs;
    }

    /**
     * A list of Windows Events to log.
     * 
     */
    @InputImport(name="windowsEvents")
    private final @Nullable List<ApplicationWindowsEvent> windowsEvents;

    public List<ApplicationWindowsEvent> getWindowsEvents() {
        return this.windowsEvents == null ? List.of() : this.windowsEvents;
    }

    public ApplicationConfigurationDetails(
        @Nullable List<ApplicationAlarmMetric> alarmMetrics,
        @Nullable List<ApplicationAlarm> alarms,
        @Nullable ApplicationHAClusterPrometheusExporter hAClusterPrometheusExporter,
        @Nullable ApplicationHANAPrometheusExporter hANAPrometheusExporter,
        @Nullable ApplicationJMXPrometheusExporter jMXPrometheusExporter,
        @Nullable List<ApplicationLog> logs,
        @Nullable List<ApplicationWindowsEvent> windowsEvents) {
        this.alarmMetrics = alarmMetrics;
        this.alarms = alarms;
        this.hAClusterPrometheusExporter = hAClusterPrometheusExporter;
        this.hANAPrometheusExporter = hANAPrometheusExporter;
        this.jMXPrometheusExporter = jMXPrometheusExporter;
        this.logs = logs;
        this.windowsEvents = windowsEvents;
    }

    private ApplicationConfigurationDetails() {
        this.alarmMetrics = List.of();
        this.alarms = List.of();
        this.hAClusterPrometheusExporter = null;
        this.hANAPrometheusExporter = null;
        this.jMXPrometheusExporter = null;
        this.logs = List.of();
        this.windowsEvents = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationConfigurationDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ApplicationAlarmMetric> alarmMetrics;
        private @Nullable List<ApplicationAlarm> alarms;
        private @Nullable ApplicationHAClusterPrometheusExporter hAClusterPrometheusExporter;
        private @Nullable ApplicationHANAPrometheusExporter hANAPrometheusExporter;
        private @Nullable ApplicationJMXPrometheusExporter jMXPrometheusExporter;
        private @Nullable List<ApplicationLog> logs;
        private @Nullable List<ApplicationWindowsEvent> windowsEvents;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationConfigurationDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmMetrics = defaults.alarmMetrics;
    	      this.alarms = defaults.alarms;
    	      this.hAClusterPrometheusExporter = defaults.hAClusterPrometheusExporter;
    	      this.hANAPrometheusExporter = defaults.hANAPrometheusExporter;
    	      this.jMXPrometheusExporter = defaults.jMXPrometheusExporter;
    	      this.logs = defaults.logs;
    	      this.windowsEvents = defaults.windowsEvents;
        }

        public Builder setAlarmMetrics(@Nullable List<ApplicationAlarmMetric> alarmMetrics) {
            this.alarmMetrics = alarmMetrics;
            return this;
        }

        public Builder setAlarms(@Nullable List<ApplicationAlarm> alarms) {
            this.alarms = alarms;
            return this;
        }

        public Builder setHAClusterPrometheusExporter(@Nullable ApplicationHAClusterPrometheusExporter hAClusterPrometheusExporter) {
            this.hAClusterPrometheusExporter = hAClusterPrometheusExporter;
            return this;
        }

        public Builder setHANAPrometheusExporter(@Nullable ApplicationHANAPrometheusExporter hANAPrometheusExporter) {
            this.hANAPrometheusExporter = hANAPrometheusExporter;
            return this;
        }

        public Builder setJMXPrometheusExporter(@Nullable ApplicationJMXPrometheusExporter jMXPrometheusExporter) {
            this.jMXPrometheusExporter = jMXPrometheusExporter;
            return this;
        }

        public Builder setLogs(@Nullable List<ApplicationLog> logs) {
            this.logs = logs;
            return this;
        }

        public Builder setWindowsEvents(@Nullable List<ApplicationWindowsEvent> windowsEvents) {
            this.windowsEvents = windowsEvents;
            return this;
        }

        public ApplicationConfigurationDetails build() {
            return new ApplicationConfigurationDetails(alarmMetrics, alarms, hAClusterPrometheusExporter, hANAPrometheusExporter, jMXPrometheusExporter, logs, windowsEvents);
        }
    }
}
