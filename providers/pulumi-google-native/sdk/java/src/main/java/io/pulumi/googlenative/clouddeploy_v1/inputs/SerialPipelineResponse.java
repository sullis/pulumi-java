// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.clouddeploy_v1.inputs.StageResponse;
import java.util.List;
import java.util.Objects;


/**
 * SerialPipeline defines a sequential set of stages for a `DeliveryPipeline`.
 * 
 */
public final class SerialPipelineResponse extends io.pulumi.resources.InvokeArgs {

    public static final SerialPipelineResponse Empty = new SerialPipelineResponse();

    /**
     * Each stage specifies configuration for a `Target`. The ordering of this list defines the promotion flow.
     * 
     */
    @Import(name="stages", required=true)
      private final List<StageResponse> stages;

    public List<StageResponse> getStages() {
        return this.stages;
    }

    public SerialPipelineResponse(List<StageResponse> stages) {
        this.stages = Objects.requireNonNull(stages, "expected parameter 'stages' to be non-null");
    }

    private SerialPipelineResponse() {
        this.stages = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SerialPipelineResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<StageResponse> stages;

        public Builder() {
    	      // Empty
        }

        public Builder(SerialPipelineResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stages = defaults.stages;
        }

        public Builder stages(List<StageResponse> stages) {
            this.stages = Objects.requireNonNull(stages);
            return this;
        }
        public Builder stages(StageResponse... stages) {
            return stages(List.of(stages));
        }        public SerialPipelineResponse build() {
            return new SerialPipelineResponse(stages);
        }
    }
}
