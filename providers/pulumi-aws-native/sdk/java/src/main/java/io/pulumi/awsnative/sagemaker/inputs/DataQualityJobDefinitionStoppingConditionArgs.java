// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;


/**
 * Specifies a time limit for how long the monitoring job is allowed to run.
 * 
 */
public final class DataQualityJobDefinitionStoppingConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataQualityJobDefinitionStoppingConditionArgs Empty = new DataQualityJobDefinitionStoppingConditionArgs();

    /**
     * The maximum runtime allowed in seconds.
     * 
     */
    @Import(name="maxRuntimeInSeconds", required=true)
      private final Output<Integer> maxRuntimeInSeconds;

    public Output<Integer> maxRuntimeInSeconds() {
        return this.maxRuntimeInSeconds;
    }

    public DataQualityJobDefinitionStoppingConditionArgs(Output<Integer> maxRuntimeInSeconds) {
        this.maxRuntimeInSeconds = Objects.requireNonNull(maxRuntimeInSeconds, "expected parameter 'maxRuntimeInSeconds' to be non-null");
    }

    private DataQualityJobDefinitionStoppingConditionArgs() {
        this.maxRuntimeInSeconds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionStoppingConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maxRuntimeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(DataQualityJobDefinitionStoppingConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRuntimeInSeconds = defaults.maxRuntimeInSeconds;
        }

        public Builder maxRuntimeInSeconds(Output<Integer> maxRuntimeInSeconds) {
            this.maxRuntimeInSeconds = Objects.requireNonNull(maxRuntimeInSeconds);
            return this;
        }
        public Builder maxRuntimeInSeconds(Integer maxRuntimeInSeconds) {
            this.maxRuntimeInSeconds = Output.of(Objects.requireNonNull(maxRuntimeInSeconds));
            return this;
        }        public DataQualityJobDefinitionStoppingConditionArgs build() {
            return new DataQualityJobDefinitionStoppingConditionArgs(maxRuntimeInSeconds);
        }
    }
}
