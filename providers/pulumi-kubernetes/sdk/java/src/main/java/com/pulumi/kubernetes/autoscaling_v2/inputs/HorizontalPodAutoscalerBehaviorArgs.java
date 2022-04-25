// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.autoscaling_v2.inputs.HPAScalingRulesArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * HorizontalPodAutoscalerBehavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively).
 * 
 */
public final class HorizontalPodAutoscalerBehaviorArgs extends com.pulumi.resources.ResourceArgs {

    public static final HorizontalPodAutoscalerBehaviorArgs Empty = new HorizontalPodAutoscalerBehaviorArgs();

    /**
     * scaleDown is scaling policy for scaling Down. If not set, the default value is to allow to scale down to minReplicas pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used).
     * 
     */
    @Import(name="scaleDown")
    private @Nullable Output<HPAScalingRulesArgs> scaleDown;

    /**
     * @return scaleDown is scaling policy for scaling Down. If not set, the default value is to allow to scale down to minReplicas pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used).
     * 
     */
    public Optional<Output<HPAScalingRulesArgs>> scaleDown() {
        return Optional.ofNullable(this.scaleDown);
    }

    /**
     * scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of:
     *   * increase no more than 4 pods per 60 seconds
     *   * double the number of pods per 60 seconds
     *     No stabilization is used.
     * 
     */
    @Import(name="scaleUp")
    private @Nullable Output<HPAScalingRulesArgs> scaleUp;

    /**
     * @return scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of:
     *   * increase no more than 4 pods per 60 seconds
     *   * double the number of pods per 60 seconds
     *     No stabilization is used.
     * 
     */
    public Optional<Output<HPAScalingRulesArgs>> scaleUp() {
        return Optional.ofNullable(this.scaleUp);
    }

    private HorizontalPodAutoscalerBehaviorArgs() {}

    private HorizontalPodAutoscalerBehaviorArgs(HorizontalPodAutoscalerBehaviorArgs $) {
        this.scaleDown = $.scaleDown;
        this.scaleUp = $.scaleUp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HorizontalPodAutoscalerBehaviorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HorizontalPodAutoscalerBehaviorArgs $;

        public Builder() {
            $ = new HorizontalPodAutoscalerBehaviorArgs();
        }

        public Builder(HorizontalPodAutoscalerBehaviorArgs defaults) {
            $ = new HorizontalPodAutoscalerBehaviorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scaleDown scaleDown is scaling policy for scaling Down. If not set, the default value is to allow to scale down to minReplicas pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used).
         * 
         * @return builder
         * 
         */
        public Builder scaleDown(@Nullable Output<HPAScalingRulesArgs> scaleDown) {
            $.scaleDown = scaleDown;
            return this;
        }

        /**
         * @param scaleDown scaleDown is scaling policy for scaling Down. If not set, the default value is to allow to scale down to minReplicas pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used).
         * 
         * @return builder
         * 
         */
        public Builder scaleDown(HPAScalingRulesArgs scaleDown) {
            return scaleDown(Output.of(scaleDown));
        }

        /**
         * @param scaleUp scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of:
         *   * increase no more than 4 pods per 60 seconds
         *   * double the number of pods per 60 seconds
         *     No stabilization is used.
         * 
         * @return builder
         * 
         */
        public Builder scaleUp(@Nullable Output<HPAScalingRulesArgs> scaleUp) {
            $.scaleUp = scaleUp;
            return this;
        }

        /**
         * @param scaleUp scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of:
         *   * increase no more than 4 pods per 60 seconds
         *   * double the number of pods per 60 seconds
         *     No stabilization is used.
         * 
         * @return builder
         * 
         */
        public Builder scaleUp(HPAScalingRulesArgs scaleUp) {
            return scaleUp(Output.of(scaleUp));
        }

        public HorizontalPodAutoscalerBehaviorArgs build() {
            return $;
        }
    }

}
