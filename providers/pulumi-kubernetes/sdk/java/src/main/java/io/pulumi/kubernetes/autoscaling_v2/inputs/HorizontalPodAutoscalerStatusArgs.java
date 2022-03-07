// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.autoscaling_v2.inputs.HorizontalPodAutoscalerConditionArgs;
import io.pulumi.kubernetes.autoscaling_v2.inputs.MetricStatusArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
 * 
 */
public final class HorizontalPodAutoscalerStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final HorizontalPodAutoscalerStatusArgs Empty = new HorizontalPodAutoscalerStatusArgs();

    /**
     * conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
     * 
     */
    @InputImport(name="conditions")
      private final @Nullable Input<List<HorizontalPodAutoscalerConditionArgs>> conditions;

    public Input<List<HorizontalPodAutoscalerConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * 
     */
    @InputImport(name="currentMetrics")
      private final @Nullable Input<List<MetricStatusArgs>> currentMetrics;

    public Input<List<MetricStatusArgs>> getCurrentMetrics() {
        return this.currentMetrics == null ? Input.empty() : this.currentMetrics;
    }

    /**
     * currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
     * 
     */
    @InputImport(name="currentReplicas")
      private final @Nullable Input<Integer> currentReplicas;

    public Input<Integer> getCurrentReplicas() {
        return this.currentReplicas == null ? Input.empty() : this.currentReplicas;
    }

    /**
     * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
     * 
     */
    @InputImport(name="desiredReplicas", required=true)
      private final Input<Integer> desiredReplicas;

    public Input<Integer> getDesiredReplicas() {
        return this.desiredReplicas;
    }

    /**
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.
     * 
     */
    @InputImport(name="lastScaleTime")
      private final @Nullable Input<String> lastScaleTime;

    public Input<String> getLastScaleTime() {
        return this.lastScaleTime == null ? Input.empty() : this.lastScaleTime;
    }

    /**
     * observedGeneration is the most recent generation observed by this autoscaler.
     * 
     */
    @InputImport(name="observedGeneration")
      private final @Nullable Input<Integer> observedGeneration;

    public Input<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Input.empty() : this.observedGeneration;
    }

    public HorizontalPodAutoscalerStatusArgs(
        @Nullable Input<List<HorizontalPodAutoscalerConditionArgs>> conditions,
        @Nullable Input<List<MetricStatusArgs>> currentMetrics,
        @Nullable Input<Integer> currentReplicas,
        Input<Integer> desiredReplicas,
        @Nullable Input<String> lastScaleTime,
        @Nullable Input<Integer> observedGeneration) {
        this.conditions = conditions;
        this.currentMetrics = currentMetrics;
        this.currentReplicas = currentReplicas;
        this.desiredReplicas = Objects.requireNonNull(desiredReplicas, "expected parameter 'desiredReplicas' to be non-null");
        this.lastScaleTime = lastScaleTime;
        this.observedGeneration = observedGeneration;
    }

    private HorizontalPodAutoscalerStatusArgs() {
        this.conditions = Input.empty();
        this.currentMetrics = Input.empty();
        this.currentReplicas = Input.empty();
        this.desiredReplicas = Input.empty();
        this.lastScaleTime = Input.empty();
        this.observedGeneration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<HorizontalPodAutoscalerConditionArgs>> conditions;
        private @Nullable Input<List<MetricStatusArgs>> currentMetrics;
        private @Nullable Input<Integer> currentReplicas;
        private Input<Integer> desiredReplicas;
        private @Nullable Input<String> lastScaleTime;
        private @Nullable Input<Integer> observedGeneration;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.currentMetrics = defaults.currentMetrics;
    	      this.currentReplicas = defaults.currentReplicas;
    	      this.desiredReplicas = defaults.desiredReplicas;
    	      this.lastScaleTime = defaults.lastScaleTime;
    	      this.observedGeneration = defaults.observedGeneration;
        }

        public Builder setConditions(@Nullable Input<List<HorizontalPodAutoscalerConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<HorizontalPodAutoscalerConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setCurrentMetrics(@Nullable Input<List<MetricStatusArgs>> currentMetrics) {
            this.currentMetrics = currentMetrics;
            return this;
        }

        public Builder setCurrentMetrics(@Nullable List<MetricStatusArgs> currentMetrics) {
            this.currentMetrics = Input.ofNullable(currentMetrics);
            return this;
        }

        public Builder setCurrentReplicas(@Nullable Input<Integer> currentReplicas) {
            this.currentReplicas = currentReplicas;
            return this;
        }

        public Builder setCurrentReplicas(@Nullable Integer currentReplicas) {
            this.currentReplicas = Input.ofNullable(currentReplicas);
            return this;
        }

        public Builder setDesiredReplicas(Input<Integer> desiredReplicas) {
            this.desiredReplicas = Objects.requireNonNull(desiredReplicas);
            return this;
        }

        public Builder setDesiredReplicas(Integer desiredReplicas) {
            this.desiredReplicas = Input.of(Objects.requireNonNull(desiredReplicas));
            return this;
        }

        public Builder setLastScaleTime(@Nullable Input<String> lastScaleTime) {
            this.lastScaleTime = lastScaleTime;
            return this;
        }

        public Builder setLastScaleTime(@Nullable String lastScaleTime) {
            this.lastScaleTime = Input.ofNullable(lastScaleTime);
            return this;
        }

        public Builder setObservedGeneration(@Nullable Input<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Input.ofNullable(observedGeneration);
            return this;
        }
        public HorizontalPodAutoscalerStatusArgs build() {
            return new HorizontalPodAutoscalerStatusArgs(conditions, currentMetrics, currentReplicas, desiredReplicas, lastScaleTime, observedGeneration);
        }
    }
}