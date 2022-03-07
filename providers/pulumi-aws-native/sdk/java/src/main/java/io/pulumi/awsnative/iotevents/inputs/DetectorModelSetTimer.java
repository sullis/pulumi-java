// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information needed to set the timer.
 * 
 */
public final class DetectorModelSetTimer extends io.pulumi.resources.InvokeArgs {

    public static final DetectorModelSetTimer Empty = new DetectorModelSetTimer();

    /**
     * The duration of the timer, in seconds. You can use a string expression that includes numbers, variables (`$variable.<variable-name>`), and input values (`$input.<input-name>.<path-to-datum>`) as the duration. The range of the duration is `1-31622400` seconds. To ensure accuracy, the minimum duration is `60` seconds. The evaluated result of the duration is rounded down to the nearest whole number.
     * 
     */
    @InputImport(name="durationExpression")
      private final @Nullable String durationExpression;

    public Optional<String> getDurationExpression() {
        return this.durationExpression == null ? Optional.empty() : Optional.ofNullable(this.durationExpression);
    }

    /**
     * The number of seconds until the timer expires. The minimum value is `60` seconds to ensure accuracy. The maximum value is `31622400` seconds.
     * 
     */
    @InputImport(name="seconds")
      private final @Nullable Integer seconds;

    public Optional<Integer> getSeconds() {
        return this.seconds == null ? Optional.empty() : Optional.ofNullable(this.seconds);
    }

    /**
     * The name of the timer.
     * 
     */
    @InputImport(name="timerName", required=true)
      private final String timerName;

    public String getTimerName() {
        return this.timerName;
    }

    public DetectorModelSetTimer(
        @Nullable String durationExpression,
        @Nullable Integer seconds,
        String timerName) {
        this.durationExpression = durationExpression;
        this.seconds = seconds;
        this.timerName = Objects.requireNonNull(timerName, "expected parameter 'timerName' to be non-null");
    }

    private DetectorModelSetTimer() {
        this.durationExpression = null;
        this.seconds = null;
        this.timerName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelSetTimer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String durationExpression;
        private @Nullable Integer seconds;
        private String timerName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelSetTimer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationExpression = defaults.durationExpression;
    	      this.seconds = defaults.seconds;
    	      this.timerName = defaults.timerName;
        }

        public Builder setDurationExpression(@Nullable String durationExpression) {
            this.durationExpression = durationExpression;
            return this;
        }

        public Builder setSeconds(@Nullable Integer seconds) {
            this.seconds = seconds;
            return this;
        }

        public Builder setTimerName(String timerName) {
            this.timerName = Objects.requireNonNull(timerName);
            return this;
        }
        public DetectorModelSetTimer build() {
            return new DetectorModelSetTimer(durationExpression, seconds, timerName);
        }
    }
}