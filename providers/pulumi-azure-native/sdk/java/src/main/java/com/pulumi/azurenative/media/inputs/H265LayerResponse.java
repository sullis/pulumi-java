// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the settings to be used when encoding the input video into a desired output bitrate layer with the H.265 video codec.
 * 
 */
public final class H265LayerResponse extends com.pulumi.resources.InvokeArgs {

    public static final H265LayerResponse Empty = new H265LayerResponse();

    /**
     * Specifies whether or not adaptive B-frames are to be used when encoding this layer. If not specified, the encoder will turn it on whenever the video profile permits its use.
     * 
     */
    @Import(name="adaptiveBFrame")
    private @Nullable Boolean adaptiveBFrame;

    /**
     * @return Specifies whether or not adaptive B-frames are to be used when encoding this layer. If not specified, the encoder will turn it on whenever the video profile permits its use.
     * 
     */
    public Optional<Boolean> adaptiveBFrame() {
        return Optional.ofNullable(this.adaptiveBFrame);
    }

    /**
     * The number of B-frames to be used when encoding this layer.  If not specified, the encoder chooses an appropriate number based on the video profile and level.
     * 
     */
    @Import(name="bFrames")
    private @Nullable Integer bFrames;

    /**
     * @return The number of B-frames to be used when encoding this layer.  If not specified, the encoder chooses an appropriate number based on the video profile and level.
     * 
     */
    public Optional<Integer> bFrames() {
        return Optional.ofNullable(this.bFrames);
    }

    /**
     * The average bitrate in bits per second at which to encode the input video when generating this layer. For example: a target bitrate of 3000Kbps or 3Mbps means this value should be 3000000 This is a required field.
     * 
     */
    @Import(name="bitrate", required=true)
    private Integer bitrate;

    /**
     * @return The average bitrate in bits per second at which to encode the input video when generating this layer. For example: a target bitrate of 3000Kbps or 3Mbps means this value should be 3000000 This is a required field.
     * 
     */
    public Integer bitrate() {
        return this.bitrate;
    }

    /**
     * The VBV buffer window length. The value should be in ISO 8601 format. The value should be in the range [0.1-100] seconds. The default is 5 seconds (for example, PT5S).
     * 
     */
    @Import(name="bufferWindow")
    private @Nullable String bufferWindow;

    /**
     * @return The VBV buffer window length. The value should be in ISO 8601 format. The value should be in the range [0.1-100] seconds. The default is 5 seconds (for example, PT5S).
     * 
     */
    public Optional<String> bufferWindow() {
        return Optional.ofNullable(this.bufferWindow);
    }

    /**
     * The frame rate (in frames per second) at which to encode this layer. The value can be in the form of M/N where M and N are integers (For example, 30000/1001), or in the form of a number (For example, 30, or 29.97). The encoder enforces constraints on allowed frame rates based on the profile and level. If it is not specified, the encoder will use the same frame rate as the input video.
     * 
     */
    @Import(name="frameRate")
    private @Nullable String frameRate;

    /**
     * @return The frame rate (in frames per second) at which to encode this layer. The value can be in the form of M/N where M and N are integers (For example, 30000/1001), or in the form of a number (For example, 30, or 29.97). The encoder enforces constraints on allowed frame rates based on the profile and level. If it is not specified, the encoder will use the same frame rate as the input video.
     * 
     */
    public Optional<String> frameRate() {
        return Optional.ofNullable(this.frameRate);
    }

    /**
     * The height of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in height as the input.
     * 
     */
    @Import(name="height")
    private @Nullable String height;

    /**
     * @return The height of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in height as the input.
     * 
     */
    public Optional<String> height() {
        return Optional.ofNullable(this.height);
    }

    /**
     * The alphanumeric label for this layer, which can be used in multiplexing different video and audio layers, or in naming the output file.
     * 
     */
    @Import(name="label")
    private @Nullable String label;

    /**
     * @return The alphanumeric label for this layer, which can be used in multiplexing different video and audio layers, or in naming the output file.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * We currently support Level up to 6.2. The value can be Auto, or a number that matches the H.265 profile. If not specified, the default is Auto, which lets the encoder choose the Level that is appropriate for this layer.
     * 
     */
    @Import(name="level")
    private @Nullable String level;

    /**
     * @return We currently support Level up to 6.2. The value can be Auto, or a number that matches the H.265 profile. If not specified, the default is Auto, which lets the encoder choose the Level that is appropriate for this layer.
     * 
     */
    public Optional<String> level() {
        return Optional.ofNullable(this.level);
    }

    /**
     * The maximum bitrate (in bits per second), at which the VBV buffer should be assumed to refill. If not specified, defaults to the same value as bitrate.
     * 
     */
    @Import(name="maxBitrate")
    private @Nullable Integer maxBitrate;

    /**
     * @return The maximum bitrate (in bits per second), at which the VBV buffer should be assumed to refill. If not specified, defaults to the same value as bitrate.
     * 
     */
    public Optional<Integer> maxBitrate() {
        return Optional.ofNullable(this.maxBitrate);
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.H265Layer&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private String odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.H265Layer&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }

    /**
     * We currently support Main. Default is Auto.
     * 
     */
    @Import(name="profile")
    private @Nullable String profile;

    /**
     * @return We currently support Main. Default is Auto.
     * 
     */
    public Optional<String> profile() {
        return Optional.ofNullable(this.profile);
    }

    /**
     * The number of reference frames to be used when encoding this layer. If not specified, the encoder determines an appropriate number based on the encoder complexity setting.
     * 
     */
    @Import(name="referenceFrames")
    private @Nullable Integer referenceFrames;

    /**
     * @return The number of reference frames to be used when encoding this layer. If not specified, the encoder determines an appropriate number based on the encoder complexity setting.
     * 
     */
    public Optional<Integer> referenceFrames() {
        return Optional.ofNullable(this.referenceFrames);
    }

    /**
     * The number of slices to be used when encoding this layer. If not specified, default is zero, which means that encoder will use a single slice for each frame.
     * 
     */
    @Import(name="slices")
    private @Nullable Integer slices;

    /**
     * @return The number of slices to be used when encoding this layer. If not specified, default is zero, which means that encoder will use a single slice for each frame.
     * 
     */
    public Optional<Integer> slices() {
        return Optional.ofNullable(this.slices);
    }

    /**
     * The width of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in width as the input.
     * 
     */
    @Import(name="width")
    private @Nullable String width;

    /**
     * @return The width of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in width as the input.
     * 
     */
    public Optional<String> width() {
        return Optional.ofNullable(this.width);
    }

    private H265LayerResponse() {}

    private H265LayerResponse(H265LayerResponse $) {
        this.adaptiveBFrame = $.adaptiveBFrame;
        this.bFrames = $.bFrames;
        this.bitrate = $.bitrate;
        this.bufferWindow = $.bufferWindow;
        this.frameRate = $.frameRate;
        this.height = $.height;
        this.label = $.label;
        this.level = $.level;
        this.maxBitrate = $.maxBitrate;
        this.odataType = $.odataType;
        this.profile = $.profile;
        this.referenceFrames = $.referenceFrames;
        this.slices = $.slices;
        this.width = $.width;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(H265LayerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private H265LayerResponse $;

        public Builder() {
            $ = new H265LayerResponse();
        }

        public Builder(H265LayerResponse defaults) {
            $ = new H265LayerResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param adaptiveBFrame Specifies whether or not adaptive B-frames are to be used when encoding this layer. If not specified, the encoder will turn it on whenever the video profile permits its use.
         * 
         * @return builder
         * 
         */
        public Builder adaptiveBFrame(@Nullable Boolean adaptiveBFrame) {
            $.adaptiveBFrame = adaptiveBFrame;
            return this;
        }

        /**
         * @param bFrames The number of B-frames to be used when encoding this layer.  If not specified, the encoder chooses an appropriate number based on the video profile and level.
         * 
         * @return builder
         * 
         */
        public Builder bFrames(@Nullable Integer bFrames) {
            $.bFrames = bFrames;
            return this;
        }

        /**
         * @param bitrate The average bitrate in bits per second at which to encode the input video when generating this layer. For example: a target bitrate of 3000Kbps or 3Mbps means this value should be 3000000 This is a required field.
         * 
         * @return builder
         * 
         */
        public Builder bitrate(Integer bitrate) {
            $.bitrate = bitrate;
            return this;
        }

        /**
         * @param bufferWindow The VBV buffer window length. The value should be in ISO 8601 format. The value should be in the range [0.1-100] seconds. The default is 5 seconds (for example, PT5S).
         * 
         * @return builder
         * 
         */
        public Builder bufferWindow(@Nullable String bufferWindow) {
            $.bufferWindow = bufferWindow;
            return this;
        }

        /**
         * @param frameRate The frame rate (in frames per second) at which to encode this layer. The value can be in the form of M/N where M and N are integers (For example, 30000/1001), or in the form of a number (For example, 30, or 29.97). The encoder enforces constraints on allowed frame rates based on the profile and level. If it is not specified, the encoder will use the same frame rate as the input video.
         * 
         * @return builder
         * 
         */
        public Builder frameRate(@Nullable String frameRate) {
            $.frameRate = frameRate;
            return this;
        }

        /**
         * @param height The height of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in height as the input.
         * 
         * @return builder
         * 
         */
        public Builder height(@Nullable String height) {
            $.height = height;
            return this;
        }

        /**
         * @param label The alphanumeric label for this layer, which can be used in multiplexing different video and audio layers, or in naming the output file.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable String label) {
            $.label = label;
            return this;
        }

        /**
         * @param level We currently support Level up to 6.2. The value can be Auto, or a number that matches the H.265 profile. If not specified, the default is Auto, which lets the encoder choose the Level that is appropriate for this layer.
         * 
         * @return builder
         * 
         */
        public Builder level(@Nullable String level) {
            $.level = level;
            return this;
        }

        /**
         * @param maxBitrate The maximum bitrate (in bits per second), at which the VBV buffer should be assumed to refill. If not specified, defaults to the same value as bitrate.
         * 
         * @return builder
         * 
         */
        public Builder maxBitrate(@Nullable Integer maxBitrate) {
            $.maxBitrate = maxBitrate;
            return this;
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.H265Layer&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param profile We currently support Main. Default is Auto.
         * 
         * @return builder
         * 
         */
        public Builder profile(@Nullable String profile) {
            $.profile = profile;
            return this;
        }

        /**
         * @param referenceFrames The number of reference frames to be used when encoding this layer. If not specified, the encoder determines an appropriate number based on the encoder complexity setting.
         * 
         * @return builder
         * 
         */
        public Builder referenceFrames(@Nullable Integer referenceFrames) {
            $.referenceFrames = referenceFrames;
            return this;
        }

        /**
         * @param slices The number of slices to be used when encoding this layer. If not specified, default is zero, which means that encoder will use a single slice for each frame.
         * 
         * @return builder
         * 
         */
        public Builder slices(@Nullable Integer slices) {
            $.slices = slices;
            return this;
        }

        /**
         * @param width The width of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in width as the input.
         * 
         * @return builder
         * 
         */
        public Builder width(@Nullable String width) {
            $.width = width;
            return this;
        }

        public H265LayerResponse build() {
            $.bitrate = Objects.requireNonNull($.bitrate, "expected parameter 'bitrate' to be non-null");
            $.odataType = Codegen.stringProp("odataType").arg($.odataType).require();
            return $;
        }
    }

}
