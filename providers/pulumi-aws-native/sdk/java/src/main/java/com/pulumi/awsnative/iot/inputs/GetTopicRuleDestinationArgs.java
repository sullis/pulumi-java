// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTopicRuleDestinationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTopicRuleDestinationArgs Empty = new GetTopicRuleDestinationArgs();

    /**
     * Amazon Resource Name (ARN).
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN).
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    private GetTopicRuleDestinationArgs() {}

    private GetTopicRuleDestinationArgs(GetTopicRuleDestinationArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTopicRuleDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTopicRuleDestinationArgs $;

        public Builder() {
            $ = new GetTopicRuleDestinationArgs();
        }

        public Builder(GetTopicRuleDestinationArgs defaults) {
            $ = new GetTopicRuleDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public GetTopicRuleDestinationArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
