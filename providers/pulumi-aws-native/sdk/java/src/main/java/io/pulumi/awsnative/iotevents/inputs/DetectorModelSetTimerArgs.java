// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information needed to set the timer.
 * 
 */
public final class DetectorModelSetTimerArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelSetTimerArgs Empty = new DetectorModelSetTimerArgs();

    /**
     * The duration of the timer, in seconds. You can use a string expression that includes numbers, variables (`$variable.<variable-name>`), and input values (`$input.<input-name>.<path-to-datum>`) as the duration. The range of the duration is `1-31622400` seconds. To ensure accuracy, the minimum duration is `60` seconds. The evaluated result of the duration is rounded down to the nearest whole number.
     * 
     */
    @InputImport(name="durationExpression")
    private final @Nullable Input<String> durationExpression;

    public Input<String> getDurationExpression() {
        return this.durationExpression == null ? Input.empty() : this.durationExpression;
    }

    /**
     * The number of seconds until the timer expires. The minimum value is `60` seconds to ensure accuracy. The maximum value is `31622400` seconds.
     * 
     */
    @InputImport(name="seconds")
    private final @Nullable Input<Integer> seconds;

    public Input<Integer> getSeconds() {
        return this.seconds == null ? Input.empty() : this.seconds;
    }

    /**
     * The name of the timer.
     * 
     */
    @InputImport(name="timerName", required=true)
    private final Input<String> timerName;

    public Input<String> getTimerName() {
        return this.timerName;
    }

    public DetectorModelSetTimerArgs(
        @Nullable Input<String> durationExpression,
        @Nullable Input<Integer> seconds,
        Input<String> timerName) {
        this.durationExpression = durationExpression;
        this.seconds = seconds;
        this.timerName = Objects.requireNonNull(timerName, "expected parameter 'timerName' to be non-null");
    }

    private DetectorModelSetTimerArgs() {
        this.durationExpression = Input.empty();
        this.seconds = Input.empty();
        this.timerName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelSetTimerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> durationExpression;
        private @Nullable Input<Integer> seconds;
        private Input<String> timerName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelSetTimerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationExpression = defaults.durationExpression;
    	      this.seconds = defaults.seconds;
    	      this.timerName = defaults.timerName;
        }

        public Builder setDurationExpression(@Nullable Input<String> durationExpression) {
            this.durationExpression = durationExpression;
            return this;
        }

        public Builder setDurationExpression(@Nullable String durationExpression) {
            this.durationExpression = Input.ofNullable(durationExpression);
            return this;
        }

        public Builder setSeconds(@Nullable Input<Integer> seconds) {
            this.seconds = seconds;
            return this;
        }

        public Builder setSeconds(@Nullable Integer seconds) {
            this.seconds = Input.ofNullable(seconds);
            return this;
        }

        public Builder setTimerName(Input<String> timerName) {
            this.timerName = Objects.requireNonNull(timerName);
            return this;
        }

        public Builder setTimerName(String timerName) {
            this.timerName = Input.of(Objects.requireNonNull(timerName));
            return this;
        }

        public DetectorModelSetTimerArgs build() {
            return new DetectorModelSetTimerArgs(durationExpression, seconds, timerName);
        }
    }
}
