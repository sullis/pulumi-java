// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPipelineArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPipelineArgs Empty = new GetPipelineArgs();

    /**
     * The name of the Pipeline.
     * 
     */
    @Import(name="pipelineName", required=true)
    private Output<String> pipelineName;

    /**
     * @return The name of the Pipeline.
     * 
     */
    public Output<String> pipelineName() {
        return this.pipelineName;
    }

    private GetPipelineArgs() {}

    private GetPipelineArgs(GetPipelineArgs $) {
        this.pipelineName = $.pipelineName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPipelineArgs $;

        public Builder() {
            $ = new GetPipelineArgs();
        }

        public Builder(GetPipelineArgs defaults) {
            $ = new GetPipelineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pipelineName The name of the Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder pipelineName(Output<String> pipelineName) {
            $.pipelineName = pipelineName;
            return this;
        }

        /**
         * @param pipelineName The name of the Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder pipelineName(String pipelineName) {
            return pipelineName(Output.of(pipelineName));
        }

        public GetPipelineArgs build() {
            $.pipelineName = Objects.requireNonNull($.pipelineName, "expected parameter 'pipelineName' to be non-null");
            return $;
        }
    }

}
