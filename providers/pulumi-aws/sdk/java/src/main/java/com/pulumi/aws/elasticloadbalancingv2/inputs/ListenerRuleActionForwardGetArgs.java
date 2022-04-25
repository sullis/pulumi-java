// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancingv2.inputs;

import com.pulumi.aws.elasticloadbalancingv2.inputs.ListenerRuleActionForwardStickinessGetArgs;
import com.pulumi.aws.elasticloadbalancingv2.inputs.ListenerRuleActionForwardTargetGroupGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleActionForwardGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionForwardGetArgs Empty = new ListenerRuleActionForwardGetArgs();

    /**
     * The target group stickiness for the rule.
     * 
     */
    @Import(name="stickiness")
    private @Nullable Output<ListenerRuleActionForwardStickinessGetArgs> stickiness;

    /**
     * @return The target group stickiness for the rule.
     * 
     */
    public Optional<Output<ListenerRuleActionForwardStickinessGetArgs>> stickiness() {
        return Optional.ofNullable(this.stickiness);
    }

    /**
     * One or more target groups block.
     * 
     */
    @Import(name="targetGroups", required=true)
    private Output<List<ListenerRuleActionForwardTargetGroupGetArgs>> targetGroups;

    /**
     * @return One or more target groups block.
     * 
     */
    public Output<List<ListenerRuleActionForwardTargetGroupGetArgs>> targetGroups() {
        return this.targetGroups;
    }

    private ListenerRuleActionForwardGetArgs() {}

    private ListenerRuleActionForwardGetArgs(ListenerRuleActionForwardGetArgs $) {
        this.stickiness = $.stickiness;
        this.targetGroups = $.targetGroups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleActionForwardGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleActionForwardGetArgs $;

        public Builder() {
            $ = new ListenerRuleActionForwardGetArgs();
        }

        public Builder(ListenerRuleActionForwardGetArgs defaults) {
            $ = new ListenerRuleActionForwardGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param stickiness The target group stickiness for the rule.
         * 
         * @return builder
         * 
         */
        public Builder stickiness(@Nullable Output<ListenerRuleActionForwardStickinessGetArgs> stickiness) {
            $.stickiness = stickiness;
            return this;
        }

        /**
         * @param stickiness The target group stickiness for the rule.
         * 
         * @return builder
         * 
         */
        public Builder stickiness(ListenerRuleActionForwardStickinessGetArgs stickiness) {
            return stickiness(Output.of(stickiness));
        }

        /**
         * @param targetGroups One or more target groups block.
         * 
         * @return builder
         * 
         */
        public Builder targetGroups(Output<List<ListenerRuleActionForwardTargetGroupGetArgs>> targetGroups) {
            $.targetGroups = targetGroups;
            return this;
        }

        /**
         * @param targetGroups One or more target groups block.
         * 
         * @return builder
         * 
         */
        public Builder targetGroups(List<ListenerRuleActionForwardTargetGroupGetArgs> targetGroups) {
            return targetGroups(Output.of(targetGroups));
        }

        /**
         * @param targetGroups One or more target groups block.
         * 
         * @return builder
         * 
         */
        public Builder targetGroups(ListenerRuleActionForwardTargetGroupGetArgs... targetGroups) {
            return targetGroups(List.of(targetGroups));
        }

        public ListenerRuleActionForwardGetArgs build() {
            $.targetGroups = Objects.requireNonNull($.targetGroups, "expected parameter 'targetGroups' to be non-null");
            return $;
        }
    }

}
