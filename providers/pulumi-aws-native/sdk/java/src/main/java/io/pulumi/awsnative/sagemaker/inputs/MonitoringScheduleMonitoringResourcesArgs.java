// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleClusterConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * Identifies the resources to deploy for a monitoring job.
 * 
 */
public final class MonitoringScheduleMonitoringResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleMonitoringResourcesArgs Empty = new MonitoringScheduleMonitoringResourcesArgs();

    @Import(name="clusterConfig", required=true)
      private final Output<MonitoringScheduleClusterConfigArgs> clusterConfig;

    public Output<MonitoringScheduleClusterConfigArgs> clusterConfig() {
        return this.clusterConfig;
    }

    public MonitoringScheduleMonitoringResourcesArgs(Output<MonitoringScheduleClusterConfigArgs> clusterConfig) {
        this.clusterConfig = Objects.requireNonNull(clusterConfig, "expected parameter 'clusterConfig' to be non-null");
    }

    private MonitoringScheduleMonitoringResourcesArgs() {
        this.clusterConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleMonitoringResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<MonitoringScheduleClusterConfigArgs> clusterConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleMonitoringResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterConfig = defaults.clusterConfig;
        }

        public Builder clusterConfig(Output<MonitoringScheduleClusterConfigArgs> clusterConfig) {
            this.clusterConfig = Objects.requireNonNull(clusterConfig);
            return this;
        }
        public Builder clusterConfig(MonitoringScheduleClusterConfigArgs clusterConfig) {
            this.clusterConfig = Output.of(Objects.requireNonNull(clusterConfig));
            return this;
        }        public MonitoringScheduleMonitoringResourcesArgs build() {
            return new MonitoringScheduleMonitoringResourcesArgs(clusterConfig);
        }
    }
}
