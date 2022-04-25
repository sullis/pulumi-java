// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elastictranscoder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PresetVideo {
    /**
     * @return The display aspect ratio of the video in the output file. Valid values are: `auto`, `1:1`, `4:3`, `3:2`, `16:9`. (Note; to better control resolution and aspect ratio of output videos, we recommend that you use the values `max_width`, `max_height`, `sizing_policy`, `padding_policy`, and `display_aspect_ratio` instead of `resolution` and `aspect_ratio`.)
     * 
     */
    private final @Nullable String aspectRatio;
    /**
     * @return The bit rate of the video stream in the output file, in kilobits/second. You can configure variable bit rate or constant bit rate encoding.
     * 
     */
    private final @Nullable String bitRate;
    /**
     * @return The video codec for the output file. Valid values are `gif`, `H.264`, `mpeg2`, `vp8`, and `vp9`.
     * 
     */
    private final @Nullable String codec;
    /**
     * @return The value that Elastic Transcoder adds to the metadata in the output file. If you set DisplayAspectRatio to auto, Elastic Transcoder chooses an aspect ratio that ensures square pixels. If you specify another option, Elastic Transcoder sets that value in the output file.
     * 
     */
    private final @Nullable String displayAspectRatio;
    /**
     * @return Whether to use a fixed value for Video:FixedGOP. Not applicable for containers of type gif. Valid values are true and false. Also known as, Fixed Number of Frames Between Keyframes.
     * 
     */
    private final @Nullable String fixedGop;
    /**
     * @return The frames per second for the video stream in the output file. The following values are valid: `auto`, `10`, `15`, `23.97`, `24`, `25`, `29.97`, `30`, `50`, `60`.
     * 
     */
    private final @Nullable String frameRate;
    /**
     * @return The maximum number of frames between key frames. Not applicable for containers of type gif.
     * 
     */
    private final @Nullable String keyframesMaxDist;
    /**
     * @return If you specify auto for FrameRate, Elastic Transcoder uses the frame rate of the input video for the frame rate of the output video, up to the maximum frame rate. If you do not specify a MaxFrameRate, Elastic Transcoder will use a default of 30.
     * 
     */
    private final @Nullable String maxFrameRate;
    /**
     * @return The maximum height of the output video in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 96 and 3072, inclusive.
     * 
     */
    private final @Nullable String maxHeight;
    /**
     * @return The maximum width of the output video in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 128 and 4096, inclusive.
     * 
     */
    private final @Nullable String maxWidth;
    /**
     * @return When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of the output video to make the total size of the output video match the values that you specified for `max_width` and `max_height`.
     * 
     */
    private final @Nullable String paddingPolicy;
    /**
     * @return The width and height of the video in the output file, in pixels. Valid values are `auto` and `widthxheight`. (see note for `aspect_ratio`)
     * 
     */
    private final @Nullable String resolution;
    /**
     * @return A value that controls scaling of the output video. Valid values are: `Fit`, `Fill`, `Stretch`, `Keep`, `ShrinkToFit`, `ShrinkToFill`.
     * 
     */
    private final @Nullable String sizingPolicy;

    @CustomType.Constructor
    private PresetVideo(
        @CustomType.Parameter("aspectRatio") @Nullable String aspectRatio,
        @CustomType.Parameter("bitRate") @Nullable String bitRate,
        @CustomType.Parameter("codec") @Nullable String codec,
        @CustomType.Parameter("displayAspectRatio") @Nullable String displayAspectRatio,
        @CustomType.Parameter("fixedGop") @Nullable String fixedGop,
        @CustomType.Parameter("frameRate") @Nullable String frameRate,
        @CustomType.Parameter("keyframesMaxDist") @Nullable String keyframesMaxDist,
        @CustomType.Parameter("maxFrameRate") @Nullable String maxFrameRate,
        @CustomType.Parameter("maxHeight") @Nullable String maxHeight,
        @CustomType.Parameter("maxWidth") @Nullable String maxWidth,
        @CustomType.Parameter("paddingPolicy") @Nullable String paddingPolicy,
        @CustomType.Parameter("resolution") @Nullable String resolution,
        @CustomType.Parameter("sizingPolicy") @Nullable String sizingPolicy) {
        this.aspectRatio = aspectRatio;
        this.bitRate = bitRate;
        this.codec = codec;
        this.displayAspectRatio = displayAspectRatio;
        this.fixedGop = fixedGop;
        this.frameRate = frameRate;
        this.keyframesMaxDist = keyframesMaxDist;
        this.maxFrameRate = maxFrameRate;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
        this.paddingPolicy = paddingPolicy;
        this.resolution = resolution;
        this.sizingPolicy = sizingPolicy;
    }

    /**
     * @return The display aspect ratio of the video in the output file. Valid values are: `auto`, `1:1`, `4:3`, `3:2`, `16:9`. (Note; to better control resolution and aspect ratio of output videos, we recommend that you use the values `max_width`, `max_height`, `sizing_policy`, `padding_policy`, and `display_aspect_ratio` instead of `resolution` and `aspect_ratio`.)
     * 
     */
    public Optional<String> aspectRatio() {
        return Optional.ofNullable(this.aspectRatio);
    }
    /**
     * @return The bit rate of the video stream in the output file, in kilobits/second. You can configure variable bit rate or constant bit rate encoding.
     * 
     */
    public Optional<String> bitRate() {
        return Optional.ofNullable(this.bitRate);
    }
    /**
     * @return The video codec for the output file. Valid values are `gif`, `H.264`, `mpeg2`, `vp8`, and `vp9`.
     * 
     */
    public Optional<String> codec() {
        return Optional.ofNullable(this.codec);
    }
    /**
     * @return The value that Elastic Transcoder adds to the metadata in the output file. If you set DisplayAspectRatio to auto, Elastic Transcoder chooses an aspect ratio that ensures square pixels. If you specify another option, Elastic Transcoder sets that value in the output file.
     * 
     */
    public Optional<String> displayAspectRatio() {
        return Optional.ofNullable(this.displayAspectRatio);
    }
    /**
     * @return Whether to use a fixed value for Video:FixedGOP. Not applicable for containers of type gif. Valid values are true and false. Also known as, Fixed Number of Frames Between Keyframes.
     * 
     */
    public Optional<String> fixedGop() {
        return Optional.ofNullable(this.fixedGop);
    }
    /**
     * @return The frames per second for the video stream in the output file. The following values are valid: `auto`, `10`, `15`, `23.97`, `24`, `25`, `29.97`, `30`, `50`, `60`.
     * 
     */
    public Optional<String> frameRate() {
        return Optional.ofNullable(this.frameRate);
    }
    /**
     * @return The maximum number of frames between key frames. Not applicable for containers of type gif.
     * 
     */
    public Optional<String> keyframesMaxDist() {
        return Optional.ofNullable(this.keyframesMaxDist);
    }
    /**
     * @return If you specify auto for FrameRate, Elastic Transcoder uses the frame rate of the input video for the frame rate of the output video, up to the maximum frame rate. If you do not specify a MaxFrameRate, Elastic Transcoder will use a default of 30.
     * 
     */
    public Optional<String> maxFrameRate() {
        return Optional.ofNullable(this.maxFrameRate);
    }
    /**
     * @return The maximum height of the output video in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 96 and 3072, inclusive.
     * 
     */
    public Optional<String> maxHeight() {
        return Optional.ofNullable(this.maxHeight);
    }
    /**
     * @return The maximum width of the output video in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 128 and 4096, inclusive.
     * 
     */
    public Optional<String> maxWidth() {
        return Optional.ofNullable(this.maxWidth);
    }
    /**
     * @return When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of the output video to make the total size of the output video match the values that you specified for `max_width` and `max_height`.
     * 
     */
    public Optional<String> paddingPolicy() {
        return Optional.ofNullable(this.paddingPolicy);
    }
    /**
     * @return The width and height of the video in the output file, in pixels. Valid values are `auto` and `widthxheight`. (see note for `aspect_ratio`)
     * 
     */
    public Optional<String> resolution() {
        return Optional.ofNullable(this.resolution);
    }
    /**
     * @return A value that controls scaling of the output video. Valid values are: `Fit`, `Fill`, `Stretch`, `Keep`, `ShrinkToFit`, `ShrinkToFill`.
     * 
     */
    public Optional<String> sizingPolicy() {
        return Optional.ofNullable(this.sizingPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PresetVideo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aspectRatio;
        private @Nullable String bitRate;
        private @Nullable String codec;
        private @Nullable String displayAspectRatio;
        private @Nullable String fixedGop;
        private @Nullable String frameRate;
        private @Nullable String keyframesMaxDist;
        private @Nullable String maxFrameRate;
        private @Nullable String maxHeight;
        private @Nullable String maxWidth;
        private @Nullable String paddingPolicy;
        private @Nullable String resolution;
        private @Nullable String sizingPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(PresetVideo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aspectRatio = defaults.aspectRatio;
    	      this.bitRate = defaults.bitRate;
    	      this.codec = defaults.codec;
    	      this.displayAspectRatio = defaults.displayAspectRatio;
    	      this.fixedGop = defaults.fixedGop;
    	      this.frameRate = defaults.frameRate;
    	      this.keyframesMaxDist = defaults.keyframesMaxDist;
    	      this.maxFrameRate = defaults.maxFrameRate;
    	      this.maxHeight = defaults.maxHeight;
    	      this.maxWidth = defaults.maxWidth;
    	      this.paddingPolicy = defaults.paddingPolicy;
    	      this.resolution = defaults.resolution;
    	      this.sizingPolicy = defaults.sizingPolicy;
        }

        public Builder aspectRatio(@Nullable String aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }
        public Builder bitRate(@Nullable String bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public Builder codec(@Nullable String codec) {
            this.codec = codec;
            return this;
        }
        public Builder displayAspectRatio(@Nullable String displayAspectRatio) {
            this.displayAspectRatio = displayAspectRatio;
            return this;
        }
        public Builder fixedGop(@Nullable String fixedGop) {
            this.fixedGop = fixedGop;
            return this;
        }
        public Builder frameRate(@Nullable String frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Builder keyframesMaxDist(@Nullable String keyframesMaxDist) {
            this.keyframesMaxDist = keyframesMaxDist;
            return this;
        }
        public Builder maxFrameRate(@Nullable String maxFrameRate) {
            this.maxFrameRate = maxFrameRate;
            return this;
        }
        public Builder maxHeight(@Nullable String maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }
        public Builder maxWidth(@Nullable String maxWidth) {
            this.maxWidth = maxWidth;
            return this;
        }
        public Builder paddingPolicy(@Nullable String paddingPolicy) {
            this.paddingPolicy = paddingPolicy;
            return this;
        }
        public Builder resolution(@Nullable String resolution) {
            this.resolution = resolution;
            return this;
        }
        public Builder sizingPolicy(@Nullable String sizingPolicy) {
            this.sizingPolicy = sizingPolicy;
            return this;
        }        public PresetVideo build() {
            return new PresetVideo(aspectRatio, bitRate, codec, displayAspectRatio, fixedGop, frameRate, keyframesMaxDist, maxFrameRate, maxHeight, maxWidth, paddingPolicy, resolution, sizingPolicy);
        }
    }
}
