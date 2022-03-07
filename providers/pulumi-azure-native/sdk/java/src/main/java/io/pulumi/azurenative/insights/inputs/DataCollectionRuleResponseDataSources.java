// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.ExtensionDataSourceResponse;
import io.pulumi.azurenative.insights.inputs.PerfCounterDataSourceResponse;
import io.pulumi.azurenative.insights.inputs.SyslogDataSourceResponse;
import io.pulumi.azurenative.insights.inputs.WindowsEventLogDataSourceResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The specification of data sources.
 * This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
 * 
 */
public final class DataCollectionRuleResponseDataSources extends io.pulumi.resources.InvokeArgs {

    public static final DataCollectionRuleResponseDataSources Empty = new DataCollectionRuleResponseDataSources();

    /**
     * The list of Azure VM extension data source configurations.
     * 
     */
    @InputImport(name="extensions")
      private final @Nullable List<ExtensionDataSourceResponse> extensions;

    public List<ExtensionDataSourceResponse> getExtensions() {
        return this.extensions == null ? List.of() : this.extensions;
    }

    /**
     * The list of performance counter data source configurations.
     * 
     */
    @InputImport(name="performanceCounters")
      private final @Nullable List<PerfCounterDataSourceResponse> performanceCounters;

    public List<PerfCounterDataSourceResponse> getPerformanceCounters() {
        return this.performanceCounters == null ? List.of() : this.performanceCounters;
    }

    /**
     * The list of Syslog data source configurations.
     * 
     */
    @InputImport(name="syslog")
      private final @Nullable List<SyslogDataSourceResponse> syslog;

    public List<SyslogDataSourceResponse> getSyslog() {
        return this.syslog == null ? List.of() : this.syslog;
    }

    /**
     * The list of Windows Event Log data source configurations.
     * 
     */
    @InputImport(name="windowsEventLogs")
      private final @Nullable List<WindowsEventLogDataSourceResponse> windowsEventLogs;

    public List<WindowsEventLogDataSourceResponse> getWindowsEventLogs() {
        return this.windowsEventLogs == null ? List.of() : this.windowsEventLogs;
    }

    public DataCollectionRuleResponseDataSources(
        @Nullable List<ExtensionDataSourceResponse> extensions,
        @Nullable List<PerfCounterDataSourceResponse> performanceCounters,
        @Nullable List<SyslogDataSourceResponse> syslog,
        @Nullable List<WindowsEventLogDataSourceResponse> windowsEventLogs) {
        this.extensions = extensions;
        this.performanceCounters = performanceCounters;
        this.syslog = syslog;
        this.windowsEventLogs = windowsEventLogs;
    }

    private DataCollectionRuleResponseDataSources() {
        this.extensions = List.of();
        this.performanceCounters = List.of();
        this.syslog = List.of();
        this.windowsEventLogs = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionRuleResponseDataSources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ExtensionDataSourceResponse> extensions;
        private @Nullable List<PerfCounterDataSourceResponse> performanceCounters;
        private @Nullable List<SyslogDataSourceResponse> syslog;
        private @Nullable List<WindowsEventLogDataSourceResponse> windowsEventLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCollectionRuleResponseDataSources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensions = defaults.extensions;
    	      this.performanceCounters = defaults.performanceCounters;
    	      this.syslog = defaults.syslog;
    	      this.windowsEventLogs = defaults.windowsEventLogs;
        }

        public Builder setExtensions(@Nullable List<ExtensionDataSourceResponse> extensions) {
            this.extensions = extensions;
            return this;
        }

        public Builder setPerformanceCounters(@Nullable List<PerfCounterDataSourceResponse> performanceCounters) {
            this.performanceCounters = performanceCounters;
            return this;
        }

        public Builder setSyslog(@Nullable List<SyslogDataSourceResponse> syslog) {
            this.syslog = syslog;
            return this;
        }

        public Builder setWindowsEventLogs(@Nullable List<WindowsEventLogDataSourceResponse> windowsEventLogs) {
            this.windowsEventLogs = windowsEventLogs;
            return this;
        }
        public DataCollectionRuleResponseDataSources build() {
            return new DataCollectionRuleResponseDataSources(extensions, performanceCounters, syslog, windowsEventLogs);
        }
    }
}