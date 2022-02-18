// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DetectorModelAssetPropertyTimestamp {
    /**
     * The timestamp, in seconds, in the Unix epoch format. The valid range is between `1-31556889864403199`. You can also specify an expression.
     * 
     */
    private final @Nullable String offsetInNanos;
    /**
     * The nanosecond offset converted from `timeInSeconds`. The valid range is between `0-999999999`. You can also specify an expression.
     * 
     */
    private final String timeInSeconds;

    @OutputCustomType.Constructor({"offsetInNanos","timeInSeconds"})
    private DetectorModelAssetPropertyTimestamp(
        @Nullable String offsetInNanos,
        String timeInSeconds) {
        this.offsetInNanos = offsetInNanos;
        this.timeInSeconds = Objects.requireNonNull(timeInSeconds);
    }

    /**
     * The timestamp, in seconds, in the Unix epoch format. The valid range is between `1-31556889864403199`. You can also specify an expression.
     * 
     */
    public Optional<String> getOffsetInNanos() {
        return Optional.ofNullable(this.offsetInNanos);
    }
    /**
     * The nanosecond offset converted from `timeInSeconds`. The valid range is between `0-999999999`. You can also specify an expression.
     * 
     */
    public String getTimeInSeconds() {
        return this.timeInSeconds;
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

        public Builder setOffsetInNanos(@Nullable String offsetInNanos) {
            this.offsetInNanos = offsetInNanos;
            return this;
        }

        public Builder setTimeInSeconds(String timeInSeconds) {
            this.timeInSeconds = Objects.requireNonNull(timeInSeconds);
            return this;
        }

        public DetectorModelAssetPropertyTimestamp build() {
            return new DetectorModelAssetPropertyTimestamp(offsetInNanos, timeInSeconds);
        }
    }
}
