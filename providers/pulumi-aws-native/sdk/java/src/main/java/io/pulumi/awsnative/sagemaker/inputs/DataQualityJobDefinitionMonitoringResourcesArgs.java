// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.DataQualityJobDefinitionClusterConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * Identifies the resources to deploy for a monitoring job.
 * 
 */
public final class DataQualityJobDefinitionMonitoringResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataQualityJobDefinitionMonitoringResourcesArgs Empty = new DataQualityJobDefinitionMonitoringResourcesArgs();

    @Import(name="clusterConfig", required=true)
      private final Output<DataQualityJobDefinitionClusterConfigArgs> clusterConfig;

    public Output<DataQualityJobDefinitionClusterConfigArgs> clusterConfig() {
        return this.clusterConfig;
    }

    public DataQualityJobDefinitionMonitoringResourcesArgs(Output<DataQualityJobDefinitionClusterConfigArgs> clusterConfig) {
        this.clusterConfig = Objects.requireNonNull(clusterConfig, "expected parameter 'clusterConfig' to be non-null");
    }

    private DataQualityJobDefinitionMonitoringResourcesArgs() {
        this.clusterConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionMonitoringResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<DataQualityJobDefinitionClusterConfigArgs> clusterConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(DataQualityJobDefinitionMonitoringResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterConfig = defaults.clusterConfig;
        }

        public Builder clusterConfig(Output<DataQualityJobDefinitionClusterConfigArgs> clusterConfig) {
            this.clusterConfig = Objects.requireNonNull(clusterConfig);
            return this;
        }
        public Builder clusterConfig(DataQualityJobDefinitionClusterConfigArgs clusterConfig) {
            this.clusterConfig = Output.of(Objects.requireNonNull(clusterConfig));
            return this;
        }        public DataQualityJobDefinitionMonitoringResourcesArgs build() {
            return new DataQualityJobDefinitionMonitoringResourcesArgs(clusterConfig);
        }
    }
}
