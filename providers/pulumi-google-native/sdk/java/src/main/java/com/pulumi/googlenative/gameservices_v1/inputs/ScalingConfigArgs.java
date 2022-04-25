// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gameservices_v1.inputs.LabelSelectorArgs;
import com.pulumi.googlenative.gameservices_v1.inputs.ScheduleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Autoscaling config for an Agones fleet.
 * 
 */
public final class ScalingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScalingConfigArgs Empty = new ScalingConfigArgs();

    /**
     * Agones fleet autoscaler spec. Example spec: https://agones.dev/site/docs/reference/fleetautoscaler/
     * 
     */
    @Import(name="fleetAutoscalerSpec", required=true)
    private Output<String> fleetAutoscalerSpec;

    /**
     * @return Agones fleet autoscaler spec. Example spec: https://agones.dev/site/docs/reference/fleetautoscaler/
     * 
     */
    public Output<String> fleetAutoscalerSpec() {
        return this.fleetAutoscalerSpec;
    }

    /**
     * The name of the Scaling Config
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Scaling Config
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The schedules to which this Scaling Config applies.
     * 
     */
    @Import(name="schedules")
    private @Nullable Output<List<ScheduleArgs>> schedules;

    /**
     * @return The schedules to which this Scaling Config applies.
     * 
     */
    public Optional<Output<List<ScheduleArgs>>> schedules() {
        return Optional.ofNullable(this.schedules);
    }

    /**
     * Labels used to identify the game server clusters to which this Agones scaling config applies. A game server cluster is subject to this Agones scaling config if its labels match any of the selector entries.
     * 
     */
    @Import(name="selectors")
    private @Nullable Output<List<LabelSelectorArgs>> selectors;

    /**
     * @return Labels used to identify the game server clusters to which this Agones scaling config applies. A game server cluster is subject to this Agones scaling config if its labels match any of the selector entries.
     * 
     */
    public Optional<Output<List<LabelSelectorArgs>>> selectors() {
        return Optional.ofNullable(this.selectors);
    }

    private ScalingConfigArgs() {}

    private ScalingConfigArgs(ScalingConfigArgs $) {
        this.fleetAutoscalerSpec = $.fleetAutoscalerSpec;
        this.name = $.name;
        this.schedules = $.schedules;
        this.selectors = $.selectors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScalingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScalingConfigArgs $;

        public Builder() {
            $ = new ScalingConfigArgs();
        }

        public Builder(ScalingConfigArgs defaults) {
            $ = new ScalingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fleetAutoscalerSpec Agones fleet autoscaler spec. Example spec: https://agones.dev/site/docs/reference/fleetautoscaler/
         * 
         * @return builder
         * 
         */
        public Builder fleetAutoscalerSpec(Output<String> fleetAutoscalerSpec) {
            $.fleetAutoscalerSpec = fleetAutoscalerSpec;
            return this;
        }

        /**
         * @param fleetAutoscalerSpec Agones fleet autoscaler spec. Example spec: https://agones.dev/site/docs/reference/fleetautoscaler/
         * 
         * @return builder
         * 
         */
        public Builder fleetAutoscalerSpec(String fleetAutoscalerSpec) {
            return fleetAutoscalerSpec(Output.of(fleetAutoscalerSpec));
        }

        /**
         * @param name The name of the Scaling Config
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Scaling Config
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schedules The schedules to which this Scaling Config applies.
         * 
         * @return builder
         * 
         */
        public Builder schedules(@Nullable Output<List<ScheduleArgs>> schedules) {
            $.schedules = schedules;
            return this;
        }

        /**
         * @param schedules The schedules to which this Scaling Config applies.
         * 
         * @return builder
         * 
         */
        public Builder schedules(List<ScheduleArgs> schedules) {
            return schedules(Output.of(schedules));
        }

        /**
         * @param schedules The schedules to which this Scaling Config applies.
         * 
         * @return builder
         * 
         */
        public Builder schedules(ScheduleArgs... schedules) {
            return schedules(List.of(schedules));
        }

        /**
         * @param selectors Labels used to identify the game server clusters to which this Agones scaling config applies. A game server cluster is subject to this Agones scaling config if its labels match any of the selector entries.
         * 
         * @return builder
         * 
         */
        public Builder selectors(@Nullable Output<List<LabelSelectorArgs>> selectors) {
            $.selectors = selectors;
            return this;
        }

        /**
         * @param selectors Labels used to identify the game server clusters to which this Agones scaling config applies. A game server cluster is subject to this Agones scaling config if its labels match any of the selector entries.
         * 
         * @return builder
         * 
         */
        public Builder selectors(List<LabelSelectorArgs> selectors) {
            return selectors(Output.of(selectors));
        }

        /**
         * @param selectors Labels used to identify the game server clusters to which this Agones scaling config applies. A game server cluster is subject to this Agones scaling config if its labels match any of the selector entries.
         * 
         * @return builder
         * 
         */
        public Builder selectors(LabelSelectorArgs... selectors) {
            return selectors(List.of(selectors));
        }

        public ScalingConfigArgs build() {
            $.fleetAutoscalerSpec = Objects.requireNonNull($.fleetAutoscalerSpec, "expected parameter 'fleetAutoscalerSpec' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
