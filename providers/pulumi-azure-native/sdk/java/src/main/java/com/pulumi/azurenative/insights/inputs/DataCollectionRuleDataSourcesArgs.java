// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.ExtensionDataSourceArgs;
import com.pulumi.azurenative.insights.inputs.PerfCounterDataSourceArgs;
import com.pulumi.azurenative.insights.inputs.SyslogDataSourceArgs;
import com.pulumi.azurenative.insights.inputs.WindowsEventLogDataSourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The specification of data sources.
 * This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
 * 
 */
public final class DataCollectionRuleDataSourcesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataCollectionRuleDataSourcesArgs Empty = new DataCollectionRuleDataSourcesArgs();

    /**
     * The list of Azure VM extension data source configurations.
     * 
     */
    @Import(name="extensions")
    private @Nullable Output<List<ExtensionDataSourceArgs>> extensions;

    /**
     * @return The list of Azure VM extension data source configurations.
     * 
     */
    public Optional<Output<List<ExtensionDataSourceArgs>>> extensions() {
        return Optional.ofNullable(this.extensions);
    }

    /**
     * The list of performance counter data source configurations.
     * 
     */
    @Import(name="performanceCounters")
    private @Nullable Output<List<PerfCounterDataSourceArgs>> performanceCounters;

    /**
     * @return The list of performance counter data source configurations.
     * 
     */
    public Optional<Output<List<PerfCounterDataSourceArgs>>> performanceCounters() {
        return Optional.ofNullable(this.performanceCounters);
    }

    /**
     * The list of Syslog data source configurations.
     * 
     */
    @Import(name="syslog")
    private @Nullable Output<List<SyslogDataSourceArgs>> syslog;

    /**
     * @return The list of Syslog data source configurations.
     * 
     */
    public Optional<Output<List<SyslogDataSourceArgs>>> syslog() {
        return Optional.ofNullable(this.syslog);
    }

    /**
     * The list of Windows Event Log data source configurations.
     * 
     */
    @Import(name="windowsEventLogs")
    private @Nullable Output<List<WindowsEventLogDataSourceArgs>> windowsEventLogs;

    /**
     * @return The list of Windows Event Log data source configurations.
     * 
     */
    public Optional<Output<List<WindowsEventLogDataSourceArgs>>> windowsEventLogs() {
        return Optional.ofNullable(this.windowsEventLogs);
    }

    private DataCollectionRuleDataSourcesArgs() {}

    private DataCollectionRuleDataSourcesArgs(DataCollectionRuleDataSourcesArgs $) {
        this.extensions = $.extensions;
        this.performanceCounters = $.performanceCounters;
        this.syslog = $.syslog;
        this.windowsEventLogs = $.windowsEventLogs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataCollectionRuleDataSourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataCollectionRuleDataSourcesArgs $;

        public Builder() {
            $ = new DataCollectionRuleDataSourcesArgs();
        }

        public Builder(DataCollectionRuleDataSourcesArgs defaults) {
            $ = new DataCollectionRuleDataSourcesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param extensions The list of Azure VM extension data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder extensions(@Nullable Output<List<ExtensionDataSourceArgs>> extensions) {
            $.extensions = extensions;
            return this;
        }

        /**
         * @param extensions The list of Azure VM extension data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder extensions(List<ExtensionDataSourceArgs> extensions) {
            return extensions(Output.of(extensions));
        }

        /**
         * @param extensions The list of Azure VM extension data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder extensions(ExtensionDataSourceArgs... extensions) {
            return extensions(List.of(extensions));
        }

        /**
         * @param performanceCounters The list of performance counter data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder performanceCounters(@Nullable Output<List<PerfCounterDataSourceArgs>> performanceCounters) {
            $.performanceCounters = performanceCounters;
            return this;
        }

        /**
         * @param performanceCounters The list of performance counter data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder performanceCounters(List<PerfCounterDataSourceArgs> performanceCounters) {
            return performanceCounters(Output.of(performanceCounters));
        }

        /**
         * @param performanceCounters The list of performance counter data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder performanceCounters(PerfCounterDataSourceArgs... performanceCounters) {
            return performanceCounters(List.of(performanceCounters));
        }

        /**
         * @param syslog The list of Syslog data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder syslog(@Nullable Output<List<SyslogDataSourceArgs>> syslog) {
            $.syslog = syslog;
            return this;
        }

        /**
         * @param syslog The list of Syslog data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder syslog(List<SyslogDataSourceArgs> syslog) {
            return syslog(Output.of(syslog));
        }

        /**
         * @param syslog The list of Syslog data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder syslog(SyslogDataSourceArgs... syslog) {
            return syslog(List.of(syslog));
        }

        /**
         * @param windowsEventLogs The list of Windows Event Log data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder windowsEventLogs(@Nullable Output<List<WindowsEventLogDataSourceArgs>> windowsEventLogs) {
            $.windowsEventLogs = windowsEventLogs;
            return this;
        }

        /**
         * @param windowsEventLogs The list of Windows Event Log data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder windowsEventLogs(List<WindowsEventLogDataSourceArgs> windowsEventLogs) {
            return windowsEventLogs(Output.of(windowsEventLogs));
        }

        /**
         * @param windowsEventLogs The list of Windows Event Log data source configurations.
         * 
         * @return builder
         * 
         */
        public Builder windowsEventLogs(WindowsEventLogDataSourceArgs... windowsEventLogs) {
            return windowsEventLogs(List.of(windowsEventLogs));
        }

        public DataCollectionRuleDataSourcesArgs build() {
            return $;
        }
    }

}
