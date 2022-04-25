// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.applicationloadbalancing.inputs;

import com.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleActionForwardStickinessArgs;
import com.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleActionForwardTargetGroupArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleActionForwardArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionForwardArgs Empty = new ListenerRuleActionForwardArgs();

    /**
     * The target group stickiness for the rule.
     * 
     */
    @Import(name="stickiness")
    private @Nullable Output<ListenerRuleActionForwardStickinessArgs> stickiness;

    /**
     * @return The target group stickiness for the rule.
     * 
     */
    public Optional<Output<ListenerRuleActionForwardStickinessArgs>> stickiness() {
        return Optional.ofNullable(this.stickiness);
    }

    /**
     * One or more target groups block.
     * 
     */
    @Import(name="targetGroups", required=true)
    private Output<List<ListenerRuleActionForwardTargetGroupArgs>> targetGroups;

    /**
     * @return One or more target groups block.
     * 
     */
    public Output<List<ListenerRuleActionForwardTargetGroupArgs>> targetGroups() {
        return this.targetGroups;
    }

    private ListenerRuleActionForwardArgs() {}

    private ListenerRuleActionForwardArgs(ListenerRuleActionForwardArgs $) {
        this.stickiness = $.stickiness;
        this.targetGroups = $.targetGroups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleActionForwardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleActionForwardArgs $;

        public Builder() {
            $ = new ListenerRuleActionForwardArgs();
        }

        public Builder(ListenerRuleActionForwardArgs defaults) {
            $ = new ListenerRuleActionForwardArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param stickiness The target group stickiness for the rule.
         * 
         * @return builder
         * 
         */
        public Builder stickiness(@Nullable Output<ListenerRuleActionForwardStickinessArgs> stickiness) {
            $.stickiness = stickiness;
            return this;
        }

        /**
         * @param stickiness The target group stickiness for the rule.
         * 
         * @return builder
         * 
         */
        public Builder stickiness(ListenerRuleActionForwardStickinessArgs stickiness) {
            return stickiness(Output.of(stickiness));
        }

        /**
         * @param targetGroups One or more target groups block.
         * 
         * @return builder
         * 
         */
        public Builder targetGroups(Output<List<ListenerRuleActionForwardTargetGroupArgs>> targetGroups) {
            $.targetGroups = targetGroups;
            return this;
        }

        /**
         * @param targetGroups One or more target groups block.
         * 
         * @return builder
         * 
         */
        public Builder targetGroups(List<ListenerRuleActionForwardTargetGroupArgs> targetGroups) {
            return targetGroups(Output.of(targetGroups));
        }

        /**
         * @param targetGroups One or more target groups block.
         * 
         * @return builder
         * 
         */
        public Builder targetGroups(ListenerRuleActionForwardTargetGroupArgs... targetGroups) {
            return targetGroups(List.of(targetGroups));
        }

        public ListenerRuleActionForwardArgs build() {
            $.targetGroups = Objects.requireNonNull($.targetGroups, "expected parameter 'targetGroups' to be non-null");
            return $;
        }
    }

}
