// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs Empty = new GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs();

    /**
     * If true, measurement.elapsed_time is used as the x-axis of each Trials Decay Curve. Otherwise, Measurement.steps will be used as the x-axis.
     * 
     */
    @Import(name="useElapsedTime")
    private @Nullable Output<Boolean> useElapsedTime;

    /**
     * @return If true, measurement.elapsed_time is used as the x-axis of each Trials Decay Curve. Otherwise, Measurement.steps will be used as the x-axis.
     * 
     */
    public Optional<Output<Boolean>> useElapsedTime() {
        return Optional.ofNullable(this.useElapsedTime);
    }

    private GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs() {}

    private GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs(GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs $) {
        this.useElapsedTime = $.useElapsedTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs $;

        public Builder() {
            $ = new GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs();
        }

        public Builder(GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs defaults) {
            $ = new GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param useElapsedTime If true, measurement.elapsed_time is used as the x-axis of each Trials Decay Curve. Otherwise, Measurement.steps will be used as the x-axis.
         * 
         * @return builder
         * 
         */
        public Builder useElapsedTime(@Nullable Output<Boolean> useElapsedTime) {
            $.useElapsedTime = useElapsedTime;
            return this;
        }

        /**
         * @param useElapsedTime If true, measurement.elapsed_time is used as the x-axis of each Trials Decay Curve. Otherwise, Measurement.steps will be used as the x-axis.
         * 
         * @return builder
         * 
         */
        public Builder useElapsedTime(Boolean useElapsedTime) {
            return useElapsedTime(Output.of(useElapsedTime));
        }

        public GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs build() {
            return $;
        }
    }

}
