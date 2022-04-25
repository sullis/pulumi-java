// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.H265LayerResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes all the properties for encoding a video with the H.265 codec.
 * 
 */
public final class H265VideoResponse extends com.pulumi.resources.InvokeArgs {

    public static final H265VideoResponse Empty = new H265VideoResponse();

    /**
     * Tells the encoder how to choose its encoding settings.  Quality will provide for a higher compression ratio but at a higher cost and longer compute time.  Speed will produce a relatively larger file but is faster and more economical. The default value is Balanced.
     * 
     */
    @Import(name="complexity")
    private @Nullable String complexity;

    /**
     * @return Tells the encoder how to choose its encoding settings.  Quality will provide for a higher compression ratio but at a higher cost and longer compute time.  Speed will produce a relatively larger file but is faster and more economical. The default value is Balanced.
     * 
     */
    public Optional<String> complexity() {
        return Optional.ofNullable(this.complexity);
    }

    /**
     * The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
     * 
     */
    @Import(name="keyFrameInterval")
    private @Nullable String keyFrameInterval;

    /**
     * @return The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
     * 
     */
    public Optional<String> keyFrameInterval() {
        return Optional.ofNullable(this.keyFrameInterval);
    }

    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    @Import(name="label")
    private @Nullable String label;

    /**
     * @return An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The collection of output H.265 layers to be produced by the encoder.
     * 
     */
    @Import(name="layers")
    private @Nullable List<H265LayerResponse> layers;

    /**
     * @return The collection of output H.265 layers to be produced by the encoder.
     * 
     */
    public Optional<List<H265LayerResponse>> layers() {
        return Optional.ofNullable(this.layers);
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.H265Video&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private String odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.H265Video&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }

    /**
     * Specifies whether or not the encoder should insert key frames at scene changes. If not specified, the default is false. This flag should be set to true only when the encoder is being configured to produce a single output video.
     * 
     */
    @Import(name="sceneChangeDetection")
    private @Nullable Boolean sceneChangeDetection;

    /**
     * @return Specifies whether or not the encoder should insert key frames at scene changes. If not specified, the default is false. This flag should be set to true only when the encoder is being configured to produce a single output video.
     * 
     */
    public Optional<Boolean> sceneChangeDetection() {
        return Optional.ofNullable(this.sceneChangeDetection);
    }

    /**
     * The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
     * 
     */
    @Import(name="stretchMode")
    private @Nullable String stretchMode;

    /**
     * @return The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
     * 
     */
    public Optional<String> stretchMode() {
        return Optional.ofNullable(this.stretchMode);
    }

    /**
     * The Video Sync Mode
     * 
     */
    @Import(name="syncMode")
    private @Nullable String syncMode;

    /**
     * @return The Video Sync Mode
     * 
     */
    public Optional<String> syncMode() {
        return Optional.ofNullable(this.syncMode);
    }

    private H265VideoResponse() {}

    private H265VideoResponse(H265VideoResponse $) {
        this.complexity = $.complexity;
        this.keyFrameInterval = $.keyFrameInterval;
        this.label = $.label;
        this.layers = $.layers;
        this.odataType = $.odataType;
        this.sceneChangeDetection = $.sceneChangeDetection;
        this.stretchMode = $.stretchMode;
        this.syncMode = $.syncMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(H265VideoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private H265VideoResponse $;

        public Builder() {
            $ = new H265VideoResponse();
        }

        public Builder(H265VideoResponse defaults) {
            $ = new H265VideoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param complexity Tells the encoder how to choose its encoding settings.  Quality will provide for a higher compression ratio but at a higher cost and longer compute time.  Speed will produce a relatively larger file but is faster and more economical. The default value is Balanced.
         * 
         * @return builder
         * 
         */
        public Builder complexity(@Nullable String complexity) {
            $.complexity = complexity;
            return this;
        }

        /**
         * @param keyFrameInterval The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
         * 
         * @return builder
         * 
         */
        public Builder keyFrameInterval(@Nullable String keyFrameInterval) {
            $.keyFrameInterval = keyFrameInterval;
            return this;
        }

        /**
         * @param label An optional label for the codec. The label can be used to control muxing behavior.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable String label) {
            $.label = label;
            return this;
        }

        /**
         * @param layers The collection of output H.265 layers to be produced by the encoder.
         * 
         * @return builder
         * 
         */
        public Builder layers(@Nullable List<H265LayerResponse> layers) {
            $.layers = layers;
            return this;
        }

        /**
         * @param layers The collection of output H.265 layers to be produced by the encoder.
         * 
         * @return builder
         * 
         */
        public Builder layers(H265LayerResponse... layers) {
            return layers(List.of(layers));
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.H265Video&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param sceneChangeDetection Specifies whether or not the encoder should insert key frames at scene changes. If not specified, the default is false. This flag should be set to true only when the encoder is being configured to produce a single output video.
         * 
         * @return builder
         * 
         */
        public Builder sceneChangeDetection(@Nullable Boolean sceneChangeDetection) {
            $.sceneChangeDetection = sceneChangeDetection;
            return this;
        }

        /**
         * @param stretchMode The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
         * 
         * @return builder
         * 
         */
        public Builder stretchMode(@Nullable String stretchMode) {
            $.stretchMode = stretchMode;
            return this;
        }

        /**
         * @param syncMode The Video Sync Mode
         * 
         * @return builder
         * 
         */
        public Builder syncMode(@Nullable String syncMode) {
            $.syncMode = syncMode;
            return this;
        }

        public H265VideoResponse build() {
            $.odataType = Codegen.stringProp("odataType").arg($.odataType).require();
            return $;
        }
    }

}
