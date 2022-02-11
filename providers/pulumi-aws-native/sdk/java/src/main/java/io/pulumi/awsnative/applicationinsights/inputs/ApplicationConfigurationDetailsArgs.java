// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.awsnative.applicationinsights.inputs.ApplicationAlarmArgs;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationAlarmMetricArgs;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationHAClusterPrometheusExporterArgs;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationHANAPrometheusExporterArgs;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationJMXPrometheusExporterArgs;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationLogArgs;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationWindowsEventArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationConfigurationDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationConfigurationDetailsArgs Empty = new ApplicationConfigurationDetailsArgs();

    @InputImport(name="alarmMetrics")
    private final @Nullable Input<List<ApplicationAlarmMetricArgs>> alarmMetrics;

    public Input<List<ApplicationAlarmMetricArgs>> getAlarmMetrics() {
        return this.alarmMetrics == null ? Input.empty() : this.alarmMetrics;
    }

    @InputImport(name="alarms")
    private final @Nullable Input<List<ApplicationAlarmArgs>> alarms;

    public Input<List<ApplicationAlarmArgs>> getAlarms() {
        return this.alarms == null ? Input.empty() : this.alarms;
    }

    @InputImport(name="hAClusterPrometheusExporter")
    private final @Nullable Input<ApplicationHAClusterPrometheusExporterArgs> hAClusterPrometheusExporter;

    public Input<ApplicationHAClusterPrometheusExporterArgs> getHAClusterPrometheusExporter() {
        return this.hAClusterPrometheusExporter == null ? Input.empty() : this.hAClusterPrometheusExporter;
    }

    @InputImport(name="hANAPrometheusExporter")
    private final @Nullable Input<ApplicationHANAPrometheusExporterArgs> hANAPrometheusExporter;

    public Input<ApplicationHANAPrometheusExporterArgs> getHANAPrometheusExporter() {
        return this.hANAPrometheusExporter == null ? Input.empty() : this.hANAPrometheusExporter;
    }

    @InputImport(name="jMXPrometheusExporter")
    private final @Nullable Input<ApplicationJMXPrometheusExporterArgs> jMXPrometheusExporter;

    public Input<ApplicationJMXPrometheusExporterArgs> getJMXPrometheusExporter() {
        return this.jMXPrometheusExporter == null ? Input.empty() : this.jMXPrometheusExporter;
    }

    @InputImport(name="logs")
    private final @Nullable Input<List<ApplicationLogArgs>> logs;

    public Input<List<ApplicationLogArgs>> getLogs() {
        return this.logs == null ? Input.empty() : this.logs;
    }

    @InputImport(name="windowsEvents")
    private final @Nullable Input<List<ApplicationWindowsEventArgs>> windowsEvents;

    public Input<List<ApplicationWindowsEventArgs>> getWindowsEvents() {
        return this.windowsEvents == null ? Input.empty() : this.windowsEvents;
    }

    public ApplicationConfigurationDetailsArgs(
        @Nullable Input<List<ApplicationAlarmMetricArgs>> alarmMetrics,
        @Nullable Input<List<ApplicationAlarmArgs>> alarms,
        @Nullable Input<ApplicationHAClusterPrometheusExporterArgs> hAClusterPrometheusExporter,
        @Nullable Input<ApplicationHANAPrometheusExporterArgs> hANAPrometheusExporter,
        @Nullable Input<ApplicationJMXPrometheusExporterArgs> jMXPrometheusExporter,
        @Nullable Input<List<ApplicationLogArgs>> logs,
        @Nullable Input<List<ApplicationWindowsEventArgs>> windowsEvents) {
        this.alarmMetrics = alarmMetrics;
        this.alarms = alarms;
        this.hAClusterPrometheusExporter = hAClusterPrometheusExporter;
        this.hANAPrometheusExporter = hANAPrometheusExporter;
        this.jMXPrometheusExporter = jMXPrometheusExporter;
        this.logs = logs;
        this.windowsEvents = windowsEvents;
    }

    private ApplicationConfigurationDetailsArgs() {
        this.alarmMetrics = Input.empty();
        this.alarms = Input.empty();
        this.hAClusterPrometheusExporter = Input.empty();
        this.hANAPrometheusExporter = Input.empty();
        this.jMXPrometheusExporter = Input.empty();
        this.logs = Input.empty();
        this.windowsEvents = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationConfigurationDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ApplicationAlarmMetricArgs>> alarmMetrics;
        private @Nullable Input<List<ApplicationAlarmArgs>> alarms;
        private @Nullable Input<ApplicationHAClusterPrometheusExporterArgs> hAClusterPrometheusExporter;
        private @Nullable Input<ApplicationHANAPrometheusExporterArgs> hANAPrometheusExporter;
        private @Nullable Input<ApplicationJMXPrometheusExporterArgs> jMXPrometheusExporter;
        private @Nullable Input<List<ApplicationLogArgs>> logs;
        private @Nullable Input<List<ApplicationWindowsEventArgs>> windowsEvents;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationConfigurationDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmMetrics = defaults.alarmMetrics;
    	      this.alarms = defaults.alarms;
    	      this.hAClusterPrometheusExporter = defaults.hAClusterPrometheusExporter;
    	      this.hANAPrometheusExporter = defaults.hANAPrometheusExporter;
    	      this.jMXPrometheusExporter = defaults.jMXPrometheusExporter;
    	      this.logs = defaults.logs;
    	      this.windowsEvents = defaults.windowsEvents;
        }

        public Builder setAlarmMetrics(@Nullable Input<List<ApplicationAlarmMetricArgs>> alarmMetrics) {
            this.alarmMetrics = alarmMetrics;
            return this;
        }

        public Builder setAlarmMetrics(@Nullable List<ApplicationAlarmMetricArgs> alarmMetrics) {
            this.alarmMetrics = Input.ofNullable(alarmMetrics);
            return this;
        }

        public Builder setAlarms(@Nullable Input<List<ApplicationAlarmArgs>> alarms) {
            this.alarms = alarms;
            return this;
        }

        public Builder setAlarms(@Nullable List<ApplicationAlarmArgs> alarms) {
            this.alarms = Input.ofNullable(alarms);
            return this;
        }

        public Builder setHAClusterPrometheusExporter(@Nullable Input<ApplicationHAClusterPrometheusExporterArgs> hAClusterPrometheusExporter) {
            this.hAClusterPrometheusExporter = hAClusterPrometheusExporter;
            return this;
        }

        public Builder setHAClusterPrometheusExporter(@Nullable ApplicationHAClusterPrometheusExporterArgs hAClusterPrometheusExporter) {
            this.hAClusterPrometheusExporter = Input.ofNullable(hAClusterPrometheusExporter);
            return this;
        }

        public Builder setHANAPrometheusExporter(@Nullable Input<ApplicationHANAPrometheusExporterArgs> hANAPrometheusExporter) {
            this.hANAPrometheusExporter = hANAPrometheusExporter;
            return this;
        }

        public Builder setHANAPrometheusExporter(@Nullable ApplicationHANAPrometheusExporterArgs hANAPrometheusExporter) {
            this.hANAPrometheusExporter = Input.ofNullable(hANAPrometheusExporter);
            return this;
        }

        public Builder setJMXPrometheusExporter(@Nullable Input<ApplicationJMXPrometheusExporterArgs> jMXPrometheusExporter) {
            this.jMXPrometheusExporter = jMXPrometheusExporter;
            return this;
        }

        public Builder setJMXPrometheusExporter(@Nullable ApplicationJMXPrometheusExporterArgs jMXPrometheusExporter) {
            this.jMXPrometheusExporter = Input.ofNullable(jMXPrometheusExporter);
            return this;
        }

        public Builder setLogs(@Nullable Input<List<ApplicationLogArgs>> logs) {
            this.logs = logs;
            return this;
        }

        public Builder setLogs(@Nullable List<ApplicationLogArgs> logs) {
            this.logs = Input.ofNullable(logs);
            return this;
        }

        public Builder setWindowsEvents(@Nullable Input<List<ApplicationWindowsEventArgs>> windowsEvents) {
            this.windowsEvents = windowsEvents;
            return this;
        }

        public Builder setWindowsEvents(@Nullable List<ApplicationWindowsEventArgs> windowsEvents) {
            this.windowsEvents = Input.ofNullable(windowsEvents);
            return this;
        }

        public ApplicationConfigurationDetailsArgs build() {
            return new ApplicationConfigurationDetailsArgs(alarmMetrics, alarms, hAClusterPrometheusExporter, hANAPrometheusExporter, jMXPrometheusExporter, logs, windowsEvents);
        }
    }
}
