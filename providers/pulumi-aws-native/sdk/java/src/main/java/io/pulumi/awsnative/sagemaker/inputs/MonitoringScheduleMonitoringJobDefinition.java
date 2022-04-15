// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleBaselineConfig;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleMonitoringAppSpecification;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleMonitoringInput;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleMonitoringOutputConfig;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleMonitoringResources;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleNetworkConfig;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleStoppingCondition;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the monitoring job.
 * 
 */
public final class MonitoringScheduleMonitoringJobDefinition extends io.pulumi.resources.InvokeArgs {

    public static final MonitoringScheduleMonitoringJobDefinition Empty = new MonitoringScheduleMonitoringJobDefinition();

    @Import(name="baselineConfig")
      private final @Nullable MonitoringScheduleBaselineConfig baselineConfig;

    public Optional<MonitoringScheduleBaselineConfig> baselineConfig() {
        return this.baselineConfig == null ? Optional.empty() : Optional.ofNullable(this.baselineConfig);
    }

    /**
     * Sets the environment variables in the Docker container
     * 
     */
    @Import(name="environment")
      private final @Nullable Object environment;

    public Optional<Object> environment() {
        return this.environment == null ? Optional.empty() : Optional.ofNullable(this.environment);
    }

    @Import(name="monitoringAppSpecification", required=true)
      private final MonitoringScheduleMonitoringAppSpecification monitoringAppSpecification;

    public MonitoringScheduleMonitoringAppSpecification monitoringAppSpecification() {
        return this.monitoringAppSpecification;
    }

    @Import(name="monitoringInputs", required=true)
      private final List<MonitoringScheduleMonitoringInput> monitoringInputs;

    public List<MonitoringScheduleMonitoringInput> monitoringInputs() {
        return this.monitoringInputs;
    }

    @Import(name="monitoringOutputConfig", required=true)
      private final MonitoringScheduleMonitoringOutputConfig monitoringOutputConfig;

    public MonitoringScheduleMonitoringOutputConfig monitoringOutputConfig() {
        return this.monitoringOutputConfig;
    }

    @Import(name="monitoringResources", required=true)
      private final MonitoringScheduleMonitoringResources monitoringResources;

    public MonitoringScheduleMonitoringResources monitoringResources() {
        return this.monitoringResources;
    }

    @Import(name="networkConfig")
      private final @Nullable MonitoringScheduleNetworkConfig networkConfig;

    public Optional<MonitoringScheduleNetworkConfig> networkConfig() {
        return this.networkConfig == null ? Optional.empty() : Optional.ofNullable(this.networkConfig);
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    @Import(name="roleArn", required=true)
      private final String roleArn;

    public String roleArn() {
        return this.roleArn;
    }

    @Import(name="stoppingCondition")
      private final @Nullable MonitoringScheduleStoppingCondition stoppingCondition;

    public Optional<MonitoringScheduleStoppingCondition> stoppingCondition() {
        return this.stoppingCondition == null ? Optional.empty() : Optional.ofNullable(this.stoppingCondition);
    }

    public MonitoringScheduleMonitoringJobDefinition(
        @Nullable MonitoringScheduleBaselineConfig baselineConfig,
        @Nullable Object environment,
        MonitoringScheduleMonitoringAppSpecification monitoringAppSpecification,
        List<MonitoringScheduleMonitoringInput> monitoringInputs,
        MonitoringScheduleMonitoringOutputConfig monitoringOutputConfig,
        MonitoringScheduleMonitoringResources monitoringResources,
        @Nullable MonitoringScheduleNetworkConfig networkConfig,
        String roleArn,
        @Nullable MonitoringScheduleStoppingCondition stoppingCondition) {
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

    private MonitoringScheduleMonitoringJobDefinition() {
        this.baselineConfig = null;
        this.environment = null;
        this.monitoringAppSpecification = null;
        this.monitoringInputs = List.of();
        this.monitoringOutputConfig = null;
        this.monitoringResources = null;
        this.networkConfig = null;
        this.roleArn = null;
        this.stoppingCondition = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleMonitoringJobDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MonitoringScheduleBaselineConfig baselineConfig;
        private @Nullable Object environment;
        private MonitoringScheduleMonitoringAppSpecification monitoringAppSpecification;
        private List<MonitoringScheduleMonitoringInput> monitoringInputs;
        private MonitoringScheduleMonitoringOutputConfig monitoringOutputConfig;
        private MonitoringScheduleMonitoringResources monitoringResources;
        private @Nullable MonitoringScheduleNetworkConfig networkConfig;
        private String roleArn;
        private @Nullable MonitoringScheduleStoppingCondition stoppingCondition;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleMonitoringJobDefinition defaults) {
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

        public Builder baselineConfig(@Nullable MonitoringScheduleBaselineConfig baselineConfig) {
            this.baselineConfig = baselineConfig;
            return this;
        }
        public Builder environment(@Nullable Object environment) {
            this.environment = environment;
            return this;
        }
        public Builder monitoringAppSpecification(MonitoringScheduleMonitoringAppSpecification monitoringAppSpecification) {
            this.monitoringAppSpecification = Objects.requireNonNull(monitoringAppSpecification);
            return this;
        }
        public Builder monitoringInputs(List<MonitoringScheduleMonitoringInput> monitoringInputs) {
            this.monitoringInputs = Objects.requireNonNull(monitoringInputs);
            return this;
        }
        public Builder monitoringInputs(MonitoringScheduleMonitoringInput... monitoringInputs) {
            return monitoringInputs(List.of(monitoringInputs));
        }
        public Builder monitoringOutputConfig(MonitoringScheduleMonitoringOutputConfig monitoringOutputConfig) {
            this.monitoringOutputConfig = Objects.requireNonNull(monitoringOutputConfig);
            return this;
        }
        public Builder monitoringResources(MonitoringScheduleMonitoringResources monitoringResources) {
            this.monitoringResources = Objects.requireNonNull(monitoringResources);
            return this;
        }
        public Builder networkConfig(@Nullable MonitoringScheduleNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder stoppingCondition(@Nullable MonitoringScheduleStoppingCondition stoppingCondition) {
            this.stoppingCondition = stoppingCondition;
            return this;
        }        public MonitoringScheduleMonitoringJobDefinition build() {
            return new MonitoringScheduleMonitoringJobDefinition(baselineConfig, environment, monitoringAppSpecification, monitoringInputs, monitoringOutputConfig, monitoringResources, networkConfig, roleArn, stoppingCondition);
        }
    }
}
