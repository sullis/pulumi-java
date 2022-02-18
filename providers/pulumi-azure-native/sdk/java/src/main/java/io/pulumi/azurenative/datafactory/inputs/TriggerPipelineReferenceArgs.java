// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.PipelineReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Pipeline that needs to be triggered with the given parameters.
 * 
 */
public final class TriggerPipelineReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerPipelineReferenceArgs Empty = new TriggerPipelineReferenceArgs();

    /**
     * Pipeline parameters.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,Object>> parameters;

    public Input<Map<String,Object>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Pipeline reference.
     * 
     */
    @InputImport(name="pipelineReference")
    private final @Nullable Input<PipelineReferenceArgs> pipelineReference;

    public Input<PipelineReferenceArgs> getPipelineReference() {
        return this.pipelineReference == null ? Input.empty() : this.pipelineReference;
    }

    public TriggerPipelineReferenceArgs(
        @Nullable Input<Map<String,Object>> parameters,
        @Nullable Input<PipelineReferenceArgs> pipelineReference) {
        this.parameters = parameters;
        this.pipelineReference = pipelineReference;
    }

    private TriggerPipelineReferenceArgs() {
        this.parameters = Input.empty();
        this.pipelineReference = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerPipelineReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,Object>> parameters;
        private @Nullable Input<PipelineReferenceArgs> pipelineReference;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerPipelineReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.pipelineReference = defaults.pipelineReference;
        }

        public Builder setParameters(@Nullable Input<Map<String,Object>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,Object> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setPipelineReference(@Nullable Input<PipelineReferenceArgs> pipelineReference) {
            this.pipelineReference = pipelineReference;
            return this;
        }

        public Builder setPipelineReference(@Nullable PipelineReferenceArgs pipelineReference) {
            this.pipelineReference = Input.ofNullable(pipelineReference);
            return this;
        }

        public TriggerPipelineReferenceArgs build() {
            return new TriggerPipelineReferenceArgs(parameters, pipelineReference);
        }
    }
}
