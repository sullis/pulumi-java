// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFlowArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFlowArgs Empty = new GetFlowArgs();

    /**
     * Name of the flow.
     * 
     */
    @Import(name="flowName", required=true)
    private Output<String> flowName;

    /**
     * @return Name of the flow.
     * 
     */
    public Output<String> flowName() {
        return this.flowName;
    }

    private GetFlowArgs() {}

    private GetFlowArgs(GetFlowArgs $) {
        this.flowName = $.flowName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFlowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFlowArgs $;

        public Builder() {
            $ = new GetFlowArgs();
        }

        public Builder(GetFlowArgs defaults) {
            $ = new GetFlowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param flowName Name of the flow.
         * 
         * @return builder
         * 
         */
        public Builder flowName(Output<String> flowName) {
            $.flowName = flowName;
            return this;
        }

        /**
         * @param flowName Name of the flow.
         * 
         * @return builder
         * 
         */
        public Builder flowName(String flowName) {
            return flowName(Output.of(flowName));
        }

        public GetFlowArgs build() {
            $.flowName = Objects.requireNonNull($.flowName, "expected parameter 'flowName' to be non-null");
            return $;
        }
    }

}
