// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.azurenative.videoanalyzer.outputs.VideoScaleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VideoEncoderH264Response {
    /**
     * The maximum bitrate, in kilobits per second or Kbps, at which video should be encoded. If omitted, encoder sets it automatically to try and match the quality of the input video.
     * 
     */
    private final @Nullable String bitrateKbps;
    /**
     * The frame rate (in frames per second) of the encoded video. The value must be greater than zero, and less than or equal to 300. If omitted, the encoder uses the average frame rate of the input video.
     * 
     */
    private final @Nullable String frameRate;
    /**
     * Describes the resolution of the encoded video. If omitted, the encoder uses the resolution of the input video.
     * 
     */
    private final @Nullable VideoScaleResponse scale;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.VideoEncoderH264'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"bitrateKbps","frameRate","scale","type"})
    private VideoEncoderH264Response(
        @Nullable String bitrateKbps,
        @Nullable String frameRate,
        @Nullable VideoScaleResponse scale,
        String type) {
        this.bitrateKbps = bitrateKbps;
        this.frameRate = frameRate;
        this.scale = scale;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The maximum bitrate, in kilobits per second or Kbps, at which video should be encoded. If omitted, encoder sets it automatically to try and match the quality of the input video.
     * 
    */
    public Optional<String> getBitrateKbps() {
        return Optional.ofNullable(this.bitrateKbps);
    }
    /**
     * The frame rate (in frames per second) of the encoded video. The value must be greater than zero, and less than or equal to 300. If omitted, the encoder uses the average frame rate of the input video.
     * 
    */
    public Optional<String> getFrameRate() {
        return Optional.ofNullable(this.frameRate);
    }
    /**
     * Describes the resolution of the encoded video. If omitted, the encoder uses the resolution of the input video.
     * 
    */
    public Optional<VideoScaleResponse> getScale() {
        return Optional.ofNullable(this.scale);
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.VideoEncoderH264'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoEncoderH264Response defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bitrateKbps;
        private @Nullable String frameRate;
        private @Nullable VideoScaleResponse scale;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoEncoderH264Response defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrateKbps = defaults.bitrateKbps;
    	      this.frameRate = defaults.frameRate;
    	      this.scale = defaults.scale;
    	      this.type = defaults.type;
        }

        public Builder setBitrateKbps(@Nullable String bitrateKbps) {
            this.bitrateKbps = bitrateKbps;
            return this;
        }

        public Builder setFrameRate(@Nullable String frameRate) {
            this.frameRate = frameRate;
            return this;
        }

        public Builder setScale(@Nullable VideoScaleResponse scale) {
            this.scale = scale;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public VideoEncoderH264Response build() {
            return new VideoEncoderH264Response(bitrateKbps, frameRate, scale, type);
        }
    }
}