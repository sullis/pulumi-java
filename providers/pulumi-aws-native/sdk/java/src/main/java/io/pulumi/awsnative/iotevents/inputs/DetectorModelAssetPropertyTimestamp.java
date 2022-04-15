// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A structure that contains timestamp information. For more information, see [TimeInNanos](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_TimeInNanos.html) in the *AWS IoT SiteWise API Reference*.
 * 
 */
public final class DetectorModelAssetPropertyTimestamp extends io.pulumi.resources.InvokeArgs {

    public static final DetectorModelAssetPropertyTimestamp Empty = new DetectorModelAssetPropertyTimestamp();

    /**
     * The timestamp, in seconds, in the Unix epoch format. The valid range is between `1-31556889864403199`. You can also specify an expression.
     * 
     */
    @Import(name="offsetInNanos")
      private final @Nullable String offsetInNanos;

    public Optional<String> offsetInNanos() {
        return this.offsetInNanos == null ? Optional.empty() : Optional.ofNullable(this.offsetInNanos);
    }

    /**
     * The nanosecond offset converted from `timeInSeconds`. The valid range is between `0-999999999`. You can also specify an expression.
     * 
     */
    @Import(name="timeInSeconds", required=true)
      private final String timeInSeconds;

    public String timeInSeconds() {
        return this.timeInSeconds;
    }

    public DetectorModelAssetPropertyTimestamp(
        @Nullable String offsetInNanos,
        String timeInSeconds) {
        this.offsetInNanos = offsetInNanos;
        this.timeInSeconds = Objects.requireNonNull(timeInSeconds, "expected parameter 'timeInSeconds' to be non-null");
    }

    private DetectorModelAssetPropertyTimestamp() {
        this.offsetInNanos = null;
        this.timeInSeconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelAssetPropertyTimestamp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String offsetInNanos;
        private String timeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelAssetPropertyTimestamp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offsetInNanos = defaults.offsetInNanos;
    	      this.timeInSeconds = defaults.timeInSeconds;
        }

        public Builder offsetInNanos(@Nullable String offsetInNanos) {
            this.offsetInNanos = offsetInNanos;
            return this;
        }
        public Builder timeInSeconds(String timeInSeconds) {
            this.timeInSeconds = Objects.requireNonNull(timeInSeconds);
            return this;
        }        public DetectorModelAssetPropertyTimestamp build() {
            return new DetectorModelAssetPropertyTimestamp(offsetInNanos, timeInSeconds);
        }
    }
}
