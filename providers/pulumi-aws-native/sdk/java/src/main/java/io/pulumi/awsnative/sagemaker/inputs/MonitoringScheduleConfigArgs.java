// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.enums.MonitoringScheduleMonitoringType;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleMonitoringJobDefinitionArgs;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleScheduleConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration object that specifies the monitoring schedule and defines the monitoring job.
 * 
 */
public final class MonitoringScheduleConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleConfigArgs Empty = new MonitoringScheduleConfigArgs();

    @InputImport(name="monitoringJobDefinition")
    private final @Nullable Input<MonitoringScheduleMonitoringJobDefinitionArgs> monitoringJobDefinition;

    public Input<MonitoringScheduleMonitoringJobDefinitionArgs> getMonitoringJobDefinition() {
        return this.monitoringJobDefinition == null ? Input.empty() : this.monitoringJobDefinition;
    }

    /**
     * Name of the job definition
     * 
     */
    @InputImport(name="monitoringJobDefinitionName")
    private final @Nullable Input<String> monitoringJobDefinitionName;

    public Input<String> getMonitoringJobDefinitionName() {
        return this.monitoringJobDefinitionName == null ? Input.empty() : this.monitoringJobDefinitionName;
    }

    @InputImport(name="monitoringType")
    private final @Nullable Input<MonitoringScheduleMonitoringType> monitoringType;

    public Input<MonitoringScheduleMonitoringType> getMonitoringType() {
        return this.monitoringType == null ? Input.empty() : this.monitoringType;
    }

    @InputImport(name="scheduleConfig")
    private final @Nullable Input<MonitoringScheduleScheduleConfigArgs> scheduleConfig;

    public Input<MonitoringScheduleScheduleConfigArgs> getScheduleConfig() {
        return this.scheduleConfig == null ? Input.empty() : this.scheduleConfig;
    }

    public MonitoringScheduleConfigArgs(
        @Nullable Input<MonitoringScheduleMonitoringJobDefinitionArgs> monitoringJobDefinition,
        @Nullable Input<String> monitoringJobDefinitionName,
        @Nullable Input<MonitoringScheduleMonitoringType> monitoringType,
        @Nullable Input<MonitoringScheduleScheduleConfigArgs> scheduleConfig) {
        this.monitoringJobDefinition = monitoringJobDefinition;
        this.monitoringJobDefinitionName = monitoringJobDefinitionName;
        this.monitoringType = monitoringType;
        this.scheduleConfig = scheduleConfig;
    }

    private MonitoringScheduleConfigArgs() {
        this.monitoringJobDefinition = Input.empty();
        this.monitoringJobDefinitionName = Input.empty();
        this.monitoringType = Input.empty();
        this.scheduleConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MonitoringScheduleMonitoringJobDefinitionArgs> monitoringJobDefinition;
        private @Nullable Input<String> monitoringJobDefinitionName;
        private @Nullable Input<MonitoringScheduleMonitoringType> monitoringType;
        private @Nullable Input<MonitoringScheduleScheduleConfigArgs> scheduleConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitoringJobDefinition = defaults.monitoringJobDefinition;
    	      this.monitoringJobDefinitionName = defaults.monitoringJobDefinitionName;
    	      this.monitoringType = defaults.monitoringType;
    	      this.scheduleConfig = defaults.scheduleConfig;
        }

        public Builder setMonitoringJobDefinition(@Nullable Input<MonitoringScheduleMonitoringJobDefinitionArgs> monitoringJobDefinition) {
            this.monitoringJobDefinition = monitoringJobDefinition;
            return this;
        }

        public Builder setMonitoringJobDefinition(@Nullable MonitoringScheduleMonitoringJobDefinitionArgs monitoringJobDefinition) {
            this.monitoringJobDefinition = Input.ofNullable(monitoringJobDefinition);
            return this;
        }

        public Builder setMonitoringJobDefinitionName(@Nullable Input<String> monitoringJobDefinitionName) {
            this.monitoringJobDefinitionName = monitoringJobDefinitionName;
            return this;
        }

        public Builder setMonitoringJobDefinitionName(@Nullable String monitoringJobDefinitionName) {
            this.monitoringJobDefinitionName = Input.ofNullable(monitoringJobDefinitionName);
            return this;
        }

        public Builder setMonitoringType(@Nullable Input<MonitoringScheduleMonitoringType> monitoringType) {
            this.monitoringType = monitoringType;
            return this;
        }

        public Builder setMonitoringType(@Nullable MonitoringScheduleMonitoringType monitoringType) {
            this.monitoringType = Input.ofNullable(monitoringType);
            return this;
        }

        public Builder setScheduleConfig(@Nullable Input<MonitoringScheduleScheduleConfigArgs> scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }

        public Builder setScheduleConfig(@Nullable MonitoringScheduleScheduleConfigArgs scheduleConfig) {
            this.scheduleConfig = Input.ofNullable(scheduleConfig);
            return this;
        }

        public MonitoringScheduleConfigArgs build() {
            return new MonitoringScheduleConfigArgs(monitoringJobDefinition, monitoringJobDefinitionName, monitoringType, scheduleConfig);
        }
    }
}
