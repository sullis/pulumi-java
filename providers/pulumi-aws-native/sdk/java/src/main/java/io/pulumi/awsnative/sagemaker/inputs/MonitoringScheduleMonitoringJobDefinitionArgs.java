// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleBaselineConfigArgs;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleMonitoringAppSpecificationArgs;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleMonitoringInputArgs;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleMonitoringOutputConfigArgs;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleMonitoringResourcesArgs;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleNetworkConfigArgs;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleStoppingConditionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the monitoring job.
 * 
 */
public final class MonitoringScheduleMonitoringJobDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleMonitoringJobDefinitionArgs Empty = new MonitoringScheduleMonitoringJobDefinitionArgs();

    @InputImport(name="baselineConfig")
    private final @Nullable Input<MonitoringScheduleBaselineConfigArgs> baselineConfig;

    public Input<MonitoringScheduleBaselineConfigArgs> getBaselineConfig() {
        return this.baselineConfig == null ? Input.empty() : this.baselineConfig;
    }

    /**
     * Sets the environment variables in the Docker container
     * 
     */
    @InputImport(name="environment")
    private final @Nullable Input<Object> environment;

    public Input<Object> getEnvironment() {
        return this.environment == null ? Input.empty() : this.environment;
    }

    @InputImport(name="monitoringAppSpecification", required=true)
    private final Input<MonitoringScheduleMonitoringAppSpecificationArgs> monitoringAppSpecification;

    public Input<MonitoringScheduleMonitoringAppSpecificationArgs> getMonitoringAppSpecification() {
        return this.monitoringAppSpecification;
    }

    @InputImport(name="monitoringInputs", required=true)
    private final Input<List<MonitoringScheduleMonitoringInputArgs>> monitoringInputs;

    public Input<List<MonitoringScheduleMonitoringInputArgs>> getMonitoringInputs() {
        return this.monitoringInputs;
    }

    @InputImport(name="monitoringOutputConfig", required=true)
    private final Input<MonitoringScheduleMonitoringOutputConfigArgs> monitoringOutputConfig;

    public Input<MonitoringScheduleMonitoringOutputConfigArgs> getMonitoringOutputConfig() {
        return this.monitoringOutputConfig;
    }

    @InputImport(name="monitoringResources", required=true)
    private final Input<MonitoringScheduleMonitoringResourcesArgs> monitoringResources;

    public Input<MonitoringScheduleMonitoringResourcesArgs> getMonitoringResources() {
        return this.monitoringResources;
    }

    @InputImport(name="networkConfig")
    private final @Nullable Input<MonitoringScheduleNetworkConfigArgs> networkConfig;

    public Input<MonitoringScheduleNetworkConfigArgs> getNetworkConfig() {
        return this.networkConfig == null ? Input.empty() : this.networkConfig;
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    @InputImport(name="stoppingCondition")
    private final @Nullable Input<MonitoringScheduleStoppingConditionArgs> stoppingCondition;

    public Input<MonitoringScheduleStoppingConditionArgs> getStoppingCondition() {
        return this.stoppingCondition == null ? Input.empty() : this.stoppingCondition;
    }

    public MonitoringScheduleMonitoringJobDefinitionArgs(
        @Nullable Input<MonitoringScheduleBaselineConfigArgs> baselineConfig,
        @Nullable Input<Object> environment,
        Input<MonitoringScheduleMonitoringAppSpecificationArgs> monitoringAppSpecification,
        Input<List<MonitoringScheduleMonitoringInputArgs>> monitoringInputs,
        Input<MonitoringScheduleMonitoringOutputConfigArgs> monitoringOutputConfig,
        Input<MonitoringScheduleMonitoringResourcesArgs> monitoringResources,
        @Nullable Input<MonitoringScheduleNetworkConfigArgs> networkConfig,
        Input<String> roleArn,
        @Nullable Input<MonitoringScheduleStoppingConditionArgs> stoppingCondition) {
        this.baselineConfig = baselineConfig;
        this.environment = environment;
        this.monitoringAppSpecification = Objects.requireNonNull(monitoringAppSpecification, "expected parameter 'monitoringAppSpecification' to be non-null");
        this.monitoringInputs = Objects.requireNonNull(monitoringInputs, "expected parameter 'monitoringInputs' to be non-null");
        this.monitoringOutputConfig = Objects.requireNonNull(monitoringOutputConfig, "expected parameter 'monitoringOutputConfig' to be non-null");
        this.monitoringResources = Objects.requireNonNull(monitoringResources, "expected parameter 'monitoringResources' to be non-null");
        this.networkConfig = networkConfig;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.stoppingCondition = stoppingCondition;
    }

    private MonitoringScheduleMonitoringJobDefinitionArgs() {
        this.baselineConfig = Input.empty();
        this.environment = Input.empty();
        this.monitoringAppSpecification = Input.empty();
        this.monitoringInputs = Input.empty();
        this.monitoringOutputConfig = Input.empty();
        this.monitoringResources = Input.empty();
        this.networkConfig = Input.empty();
        this.roleArn = Input.empty();
        this.stoppingCondition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleMonitoringJobDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MonitoringScheduleBaselineConfigArgs> baselineConfig;
        private @Nullable Input<Object> environment;
        private Input<MonitoringScheduleMonitoringAppSpecificationArgs> monitoringAppSpecification;
        private Input<List<MonitoringScheduleMonitoringInputArgs>> monitoringInputs;
        private Input<MonitoringScheduleMonitoringOutputConfigArgs> monitoringOutputConfig;
        private Input<MonitoringScheduleMonitoringResourcesArgs> monitoringResources;
        private @Nullable Input<MonitoringScheduleNetworkConfigArgs> networkConfig;
        private Input<String> roleArn;
        private @Nullable Input<MonitoringScheduleStoppingConditionArgs> stoppingCondition;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleMonitoringJobDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baselineConfig = defaults.baselineConfig;
    	      this.environment = defaults.environment;
    	      this.monitoringAppSpecification = defaults.monitoringAppSpecification;
    	      this.monitoringInputs = defaults.monitoringInputs;
    	      this.monitoringOutputConfig = defaults.monitoringOutputConfig;
    	      this.monitoringResources = defaults.monitoringResources;
    	      this.networkConfig = defaults.networkConfig;
    	      this.roleArn = defaults.roleArn;
    	      this.stoppingCondition = defaults.stoppingCondition;
        }

        public Builder setBaselineConfig(@Nullable Input<MonitoringScheduleBaselineConfigArgs> baselineConfig) {
            this.baselineConfig = baselineConfig;
            return this;
        }

        public Builder setBaselineConfig(@Nullable MonitoringScheduleBaselineConfigArgs baselineConfig) {
            this.baselineConfig = Input.ofNullable(baselineConfig);
            return this;
        }

        public Builder setEnvironment(@Nullable Input<Object> environment) {
            this.environment = environment;
            return this;
        }

        public Builder setEnvironment(@Nullable Object environment) {
            this.environment = Input.ofNullable(environment);
            return this;
        }

        public Builder setMonitoringAppSpecification(Input<MonitoringScheduleMonitoringAppSpecificationArgs> monitoringAppSpecification) {
            this.monitoringAppSpecification = Objects.requireNonNull(monitoringAppSpecification);
            return this;
        }

        public Builder setMonitoringAppSpecification(MonitoringScheduleMonitoringAppSpecificationArgs monitoringAppSpecification) {
            this.monitoringAppSpecification = Input.of(Objects.requireNonNull(monitoringAppSpecification));
            return this;
        }

        public Builder setMonitoringInputs(Input<List<MonitoringScheduleMonitoringInputArgs>> monitoringInputs) {
            this.monitoringInputs = Objects.requireNonNull(monitoringInputs);
            return this;
        }

        public Builder setMonitoringInputs(List<MonitoringScheduleMonitoringInputArgs> monitoringInputs) {
            this.monitoringInputs = Input.of(Objects.requireNonNull(monitoringInputs));
            return this;
        }

        public Builder setMonitoringOutputConfig(Input<MonitoringScheduleMonitoringOutputConfigArgs> monitoringOutputConfig) {
            this.monitoringOutputConfig = Objects.requireNonNull(monitoringOutputConfig);
            return this;
        }

        public Builder setMonitoringOutputConfig(MonitoringScheduleMonitoringOutputConfigArgs monitoringOutputConfig) {
            this.monitoringOutputConfig = Input.of(Objects.requireNonNull(monitoringOutputConfig));
            return this;
        }

        public Builder setMonitoringResources(Input<MonitoringScheduleMonitoringResourcesArgs> monitoringResources) {
            this.monitoringResources = Objects.requireNonNull(monitoringResources);
            return this;
        }

        public Builder setMonitoringResources(MonitoringScheduleMonitoringResourcesArgs monitoringResources) {
            this.monitoringResources = Input.of(Objects.requireNonNull(monitoringResources));
            return this;
        }

        public Builder setNetworkConfig(@Nullable Input<MonitoringScheduleNetworkConfigArgs> networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public Builder setNetworkConfig(@Nullable MonitoringScheduleNetworkConfigArgs networkConfig) {
            this.networkConfig = Input.ofNullable(networkConfig);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setStoppingCondition(@Nullable Input<MonitoringScheduleStoppingConditionArgs> stoppingCondition) {
            this.stoppingCondition = stoppingCondition;
            return this;
        }

        public Builder setStoppingCondition(@Nullable MonitoringScheduleStoppingConditionArgs stoppingCondition) {
            this.stoppingCondition = Input.ofNullable(stoppingCondition);
            return this;
        }

        public MonitoringScheduleMonitoringJobDefinitionArgs build() {
            return new MonitoringScheduleMonitoringJobDefinitionArgs(baselineConfig, environment, monitoringAppSpecification, monitoringInputs, monitoringOutputConfig, monitoringResources, networkConfig, roleArn, stoppingCondition);
        }
    }
}
