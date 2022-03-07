// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.ToolExecutionResponse;
import java.util.Objects;


/**
 * Generic tool step to be used for binaries we do not explicitly support. For example: running cp to copy artifacts from one location to another.
 * 
 */
public final class ToolExecutionStepResponse extends io.pulumi.resources.InvokeArgs {

    public static final ToolExecutionStepResponse Empty = new ToolExecutionStepResponse();

    /**
     * A Tool execution. - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    @InputImport(name="toolExecution", required=true)
      private final ToolExecutionResponse toolExecution;

    public ToolExecutionResponse getToolExecution() {
        return this.toolExecution;
    }

    public ToolExecutionStepResponse(ToolExecutionResponse toolExecution) {
        this.toolExecution = Objects.requireNonNull(toolExecution, "expected parameter 'toolExecution' to be non-null");
    }

    private ToolExecutionStepResponse() {
        this.toolExecution = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ToolExecutionStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ToolExecutionResponse toolExecution;

        public Builder() {
    	      // Empty
        }

        public Builder(ToolExecutionStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.toolExecution = defaults.toolExecution;
        }

        public Builder setToolExecution(ToolExecutionResponse toolExecution) {
            this.toolExecution = Objects.requireNonNull(toolExecution);
            return this;
        }
        public ToolExecutionStepResponse build() {
            return new ToolExecutionStepResponse(toolExecution);
        }
    }
}