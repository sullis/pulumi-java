// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb.inputs;

import com.pulumi.aws.alb.inputs.ListenerDefaultActionForwardStickinessGetArgs;
import com.pulumi.aws.alb.inputs.ListenerDefaultActionForwardTargetGroupGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerDefaultActionForwardGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionForwardGetArgs Empty = new ListenerDefaultActionForwardGetArgs();

    /**
     * Configuration block for target group stickiness for the rule. Detailed below.
     * 
     */
    @Import(name="stickiness")
    private @Nullable Output<ListenerDefaultActionForwardStickinessGetArgs> stickiness;

    /**
     * @return Configuration block for target group stickiness for the rule. Detailed below.
     * 
     */
    public Optional<Output<ListenerDefaultActionForwardStickinessGetArgs>> stickiness() {
        return Optional.ofNullable(this.stickiness);
    }

    /**
     * Set of 1-5 target group blocks. Detailed below.
     * 
     */
    @Import(name="targetGroups", required=true)
    private Output<List<ListenerDefaultActionForwardTargetGroupGetArgs>> targetGroups;

    /**
     * @return Set of 1-5 target group blocks. Detailed below.
     * 
     */
    public Output<List<ListenerDefaultActionForwardTargetGroupGetArgs>> targetGroups() {
        return this.targetGroups;
    }

    private ListenerDefaultActionForwardGetArgs() {}

    private ListenerDefaultActionForwardGetArgs(ListenerDefaultActionForwardGetArgs $) {
        this.stickiness = $.stickiness;
        this.targetGroups = $.targetGroups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerDefaultActionForwardGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerDefaultActionForwardGetArgs $;

        public Builder() {
            $ = new ListenerDefaultActionForwardGetArgs();
        }

        public Builder(ListenerDefaultActionForwardGetArgs defaults) {
            $ = new ListenerDefaultActionForwardGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param stickiness Configuration block for target group stickiness for the rule. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder stickiness(@Nullable Output<ListenerDefaultActionForwardStickinessGetArgs> stickiness) {
            $.stickiness = stickiness;
            return this;
        }

        /**
         * @param stickiness Configuration block for target group stickiness for the rule. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder stickiness(ListenerDefaultActionForwardStickinessGetArgs stickiness) {
            return stickiness(Output.of(stickiness));
        }

        /**
         * @param targetGroups Set of 1-5 target group blocks. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder targetGroups(Output<List<ListenerDefaultActionForwardTargetGroupGetArgs>> targetGroups) {
            $.targetGroups = targetGroups;
            return this;
        }

        /**
         * @param targetGroups Set of 1-5 target group blocks. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder targetGroups(List<ListenerDefaultActionForwardTargetGroupGetArgs> targetGroups) {
            return targetGroups(Output.of(targetGroups));
        }

        /**
         * @param targetGroups Set of 1-5 target group blocks. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder targetGroups(ListenerDefaultActionForwardTargetGroupGetArgs... targetGroups) {
            return targetGroups(List.of(targetGroups));
        }

        public ListenerDefaultActionForwardGetArgs build() {
            $.targetGroups = Objects.requireNonNull($.targetGroups, "expected parameter 'targetGroups' to be non-null");
            return $;
        }
    }

}
