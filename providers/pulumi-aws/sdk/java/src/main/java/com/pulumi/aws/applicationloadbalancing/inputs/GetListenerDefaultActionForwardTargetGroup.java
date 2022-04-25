// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.applicationloadbalancing.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetListenerDefaultActionForwardTargetGroup extends com.pulumi.resources.InvokeArgs {

    public static final GetListenerDefaultActionForwardTargetGroup Empty = new GetListenerDefaultActionForwardTargetGroup();

    /**
     * ARN of the listener. Required if `load_balancer_arn` and `port` is not set.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return ARN of the listener. Required if `load_balancer_arn` and `port` is not set.
     * 
     */
    public String arn() {
        return this.arn;
    }

    @Import(name="weight", required=true)
    private Integer weight;

    public Integer weight() {
        return this.weight;
    }

    private GetListenerDefaultActionForwardTargetGroup() {}

    private GetListenerDefaultActionForwardTargetGroup(GetListenerDefaultActionForwardTargetGroup $) {
        this.arn = $.arn;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetListenerDefaultActionForwardTargetGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetListenerDefaultActionForwardTargetGroup $;

        public Builder() {
            $ = new GetListenerDefaultActionForwardTargetGroup();
        }

        public Builder(GetListenerDefaultActionForwardTargetGroup defaults) {
            $ = new GetListenerDefaultActionForwardTargetGroup(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN of the listener. Required if `load_balancer_arn` and `port` is not set.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public Builder weight(Integer weight) {
            $.weight = weight;
            return this;
        }

        public GetListenerDefaultActionForwardTargetGroup build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            $.weight = Objects.requireNonNull($.weight, "expected parameter 'weight' to be non-null");
            return $;
        }
    }

}
