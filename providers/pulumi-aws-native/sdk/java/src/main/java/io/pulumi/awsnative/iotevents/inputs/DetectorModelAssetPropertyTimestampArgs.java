// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A structure that contains timestamp information. For more information, see [TimeInNanos](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_TimeInNanos.html) in the *AWS IoT SiteWise API Reference*.
 * 
 */
public final class DetectorModelAssetPropertyTimestampArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelAssetPropertyTimestampArgs Empty = new DetectorModelAssetPropertyTimestampArgs();

    /**
     * The timestamp, in seconds, in the Unix epoch format. The valid range is between `1-31556889864403199`. You can also specify an expression.
     * 
     */
    @InputImport(name="offsetInNanos")
    private final @Nullable Input<String> offsetInNanos;

    public Input<String> getOffsetInNanos() {
        return this.offsetInNanos == null ? Input.empty() : this.offsetInNanos;
    }

    /**
     * The nanosecond offset converted from `timeInSeconds`. The valid range is between `0-999999999`. You can also specify an expression.
     * 
     */
    @InputImport(name="timeInSeconds", required=true)
    private final Input<String> timeInSeconds;

    public Input<String> getTimeInSeconds() {
        return this.timeInSeconds;
    }

    public DetectorModelAssetPropertyTimestampArgs(
        @Nullable Input<String> offsetInNanos,
        Input<String> timeInSeconds) {
        this.offsetInNanos = offsetInNanos;
        this.timeInSeconds = Objects.requireNonNull(timeInSeconds, "expected parameter 'timeInSeconds' to be non-null");
    }

    private DetectorModelAssetPropertyTimestampArgs() {
        this.offsetInNanos = Input.empty();
        this.timeInSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelAssetPropertyTimestampArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> offsetInNanos;
        private Input<String> timeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelAssetPropertyTimestampArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offsetInNanos = defaults.offsetInNanos;
    	      this.timeInSeconds = defaults.timeInSeconds;
        }

        public Builder setOffsetInNanos(@Nullable Input<String> offsetInNanos) {
            this.offsetInNanos = offsetInNanos;
            return this;
        }

        public Builder setOffsetInNanos(@Nullable String offsetInNanos) {
            this.offsetInNanos = Input.ofNullable(offsetInNanos);
            return this;
        }

        public Builder setTimeInSeconds(Input<String> timeInSeconds) {
            this.timeInSeconds = Objects.requireNonNull(timeInSeconds);
            return this;
        }

        public Builder setTimeInSeconds(String timeInSeconds) {
            this.timeInSeconds = Input.of(Objects.requireNonNull(timeInSeconds));
            return this;
        }

        public DetectorModelAssetPropertyTimestampArgs build() {
            return new DetectorModelAssetPropertyTimestampArgs(offsetInNanos, timeInSeconds);
        }
    }
}
