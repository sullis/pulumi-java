// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ModelInferenceExecutionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelInferenceExecutionConfigArgs Empty = new ModelInferenceExecutionConfigArgs();

    /**
     * The container hosts value `SingleModel/MultiModel`. The default value is `SingleModel`.
     * 
     */
    @Import(name="mode", required=true)
      private final Output<String> mode;

    public Output<String> getMode() {
        return this.mode;
    }

    public ModelInferenceExecutionConfigArgs(Output<String> mode) {
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
    }

    private ModelInferenceExecutionConfigArgs() {
        this.mode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelInferenceExecutionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelInferenceExecutionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder mode(Output<String> mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Output.of(Objects.requireNonNull(mode));
            return this;
        }        public ModelInferenceExecutionConfigArgs build() {
            return new ModelInferenceExecutionConfigArgs(mode);
        }
    }
}
