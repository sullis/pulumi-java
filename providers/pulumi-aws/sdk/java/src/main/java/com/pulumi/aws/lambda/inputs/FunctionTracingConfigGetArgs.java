// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FunctionTracingConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionTracingConfigGetArgs Empty = new FunctionTracingConfigGetArgs();

    /**
     * Whether to to sample and trace a subset of incoming requests with AWS X-Ray. Valid values are `PassThrough` and `Active`. If `PassThrough`, Lambda will only trace the request from an upstream service if it contains a tracing header with &#34;sampled=1&#34;. If `Active`, Lambda will respect any tracing header it receives from an upstream service. If no tracing header is received, Lambda will call X-Ray for a tracing decision.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    /**
     * @return Whether to to sample and trace a subset of incoming requests with AWS X-Ray. Valid values are `PassThrough` and `Active`. If `PassThrough`, Lambda will only trace the request from an upstream service if it contains a tracing header with &#34;sampled=1&#34;. If `Active`, Lambda will respect any tracing header it receives from an upstream service. If no tracing header is received, Lambda will call X-Ray for a tracing decision.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }

    private FunctionTracingConfigGetArgs() {}

    private FunctionTracingConfigGetArgs(FunctionTracingConfigGetArgs $) {
        this.mode = $.mode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionTracingConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionTracingConfigGetArgs $;

        public Builder() {
            $ = new FunctionTracingConfigGetArgs();
        }

        public Builder(FunctionTracingConfigGetArgs defaults) {
            $ = new FunctionTracingConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode Whether to to sample and trace a subset of incoming requests with AWS X-Ray. Valid values are `PassThrough` and `Active`. If `PassThrough`, Lambda will only trace the request from an upstream service if it contains a tracing header with &#34;sampled=1&#34;. If `Active`, Lambda will respect any tracing header it receives from an upstream service. If no tracing header is received, Lambda will call X-Ray for a tracing decision.
         * 
         * @return builder
         * 
         */
        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Whether to to sample and trace a subset of incoming requests with AWS X-Ray. Valid values are `PassThrough` and `Active`. If `PassThrough`, Lambda will only trace the request from an upstream service if it contains a tracing header with &#34;sampled=1&#34;. If `Active`, Lambda will respect any tracing header it receives from an upstream service. If no tracing header is received, Lambda will call X-Ray for a tracing decision.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public FunctionTracingConfigGetArgs build() {
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            return $;
        }
    }

}
