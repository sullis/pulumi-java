// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmincidents.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResponsePlanArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResponsePlanArgs Empty = new GetResponsePlanArgs();

    /**
     * The ARN of the response plan.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return The ARN of the response plan.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    private GetResponsePlanArgs() {}

    private GetResponsePlanArgs(GetResponsePlanArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResponsePlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResponsePlanArgs $;

        public Builder() {
            $ = new GetResponsePlanArgs();
        }

        public Builder(GetResponsePlanArgs defaults) {
            $ = new GetResponsePlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the response plan.
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the response plan.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public GetResponsePlanArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
