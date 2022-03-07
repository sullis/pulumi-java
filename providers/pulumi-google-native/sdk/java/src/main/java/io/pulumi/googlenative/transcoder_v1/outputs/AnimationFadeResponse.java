// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.transcoder_v1.outputs.NormalizedCoordinateResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AnimationFadeResponse {
    /**
     * The time to end the fade animation, in seconds. Default: `start_time_offset` + 1s
     * 
     */
    private final String endTimeOffset;
    /**
     * Type of fade animation: `FADE_IN` or `FADE_OUT`.
     * 
     */
    private final String fadeType;
    /**
     * The time to start the fade animation, in seconds. Default: 0
     * 
     */
    private final String startTimeOffset;
    /**
     * Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
     * 
     */
    private final NormalizedCoordinateResponse xy;

    @OutputCustomType.Constructor({"endTimeOffset","fadeType","startTimeOffset","xy"})
    private AnimationFadeResponse(
        String endTimeOffset,
        String fadeType,
        String startTimeOffset,
        NormalizedCoordinateResponse xy) {
        this.endTimeOffset = Objects.requireNonNull(endTimeOffset);
        this.fadeType = Objects.requireNonNull(fadeType);
        this.startTimeOffset = Objects.requireNonNull(startTimeOffset);
        this.xy = Objects.requireNonNull(xy);
    }

    /**
     * The time to end the fade animation, in seconds. Default: `start_time_offset` + 1s
     * 
    */
    public String getEndTimeOffset() {
        return this.endTimeOffset;
    }
    /**
     * Type of fade animation: `FADE_IN` or `FADE_OUT`.
     * 
    */
    public String getFadeType() {
        return this.fadeType;
    }
    /**
     * The time to start the fade animation, in seconds. Default: 0
     * 
    */
    public String getStartTimeOffset() {
        return this.startTimeOffset;
    }
    /**
     * Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
     * 
    */
    public NormalizedCoordinateResponse getXy() {
        return this.xy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnimationFadeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTimeOffset;
        private String fadeType;
        private String startTimeOffset;
        private NormalizedCoordinateResponse xy;

        public Builder() {
    	      // Empty
        }

        public Builder(AnimationFadeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTimeOffset = defaults.endTimeOffset;
    	      this.fadeType = defaults.fadeType;
    	      this.startTimeOffset = defaults.startTimeOffset;
    	      this.xy = defaults.xy;
        }

        public Builder setEndTimeOffset(String endTimeOffset) {
            this.endTimeOffset = Objects.requireNonNull(endTimeOffset);
            return this;
        }

        public Builder setFadeType(String fadeType) {
            this.fadeType = Objects.requireNonNull(fadeType);
            return this;
        }

        public Builder setStartTimeOffset(String startTimeOffset) {
            this.startTimeOffset = Objects.requireNonNull(startTimeOffset);
            return this;
        }

        public Builder setXy(NormalizedCoordinateResponse xy) {
            this.xy = Objects.requireNonNull(xy);
            return this;
        }
        public AnimationFadeResponse build() {
            return new AnimationFadeResponse(endTimeOffset, fadeType, startTimeOffset, xy);
        }
    }
}