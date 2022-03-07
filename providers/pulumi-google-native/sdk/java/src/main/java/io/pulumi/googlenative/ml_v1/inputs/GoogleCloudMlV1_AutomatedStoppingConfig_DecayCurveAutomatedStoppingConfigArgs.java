// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs Empty = new GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs();

    /**
     * If true, measurement.elapsed_time is used as the x-axis of each Trials Decay Curve. Otherwise, Measurement.steps will be used as the x-axis.
     * 
     */
    @InputImport(name="useElapsedTime")
      private final @Nullable Input<Boolean> useElapsedTime;

    public Input<Boolean> getUseElapsedTime() {
        return this.useElapsedTime == null ? Input.empty() : this.useElapsedTime;
    }

    public GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs(@Nullable Input<Boolean> useElapsedTime) {
        this.useElapsedTime = useElapsedTime;
    }

    private GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs() {
        this.useElapsedTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> useElapsedTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.useElapsedTime = defaults.useElapsedTime;
        }

        public Builder setUseElapsedTime(@Nullable Input<Boolean> useElapsedTime) {
            this.useElapsedTime = useElapsedTime;
            return this;
        }

        public Builder setUseElapsedTime(@Nullable Boolean useElapsedTime) {
            this.useElapsedTime = Input.ofNullable(useElapsedTime);
            return this;
        }
        public GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs build() {
            return new GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigArgs(useElapsedTime);
        }
    }
}