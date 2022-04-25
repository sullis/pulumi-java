// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.enums.StretchMode;
import com.pulumi.azurenative.media.enums.VideoSyncMode;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the basic properties for generating thumbnails from the input video
 * 
 */
public final class ImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageArgs Empty = new ImageArgs();

    /**
     * The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
     * 
     */
    @Import(name="keyFrameInterval")
    private @Nullable Output<String> keyFrameInterval;

    /**
     * @return The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
     * 
     */
    public Optional<Output<String>> keyFrameInterval() {
        return Optional.ofNullable(this.keyFrameInterval);
    }

    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.Image&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.Image&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * The position relative to transform preset start time in the input video at which to stop generating thumbnails. The value can be in ISO 8601 format (For example, PT5M30S to stop at 5 minutes and 30 seconds from start time), or a frame count (For example, 300 to stop at the 300th frame from the frame at start time. If this value is 1, it means only producing one thumbnail at start time), or a relative value to the stream duration (For example, 50% to stop at half of stream duration from start time). The default value is 100%, which means to stop at the end of the stream.
     * 
     */
    @Import(name="range")
    private @Nullable Output<String> range;

    /**
     * @return The position relative to transform preset start time in the input video at which to stop generating thumbnails. The value can be in ISO 8601 format (For example, PT5M30S to stop at 5 minutes and 30 seconds from start time), or a frame count (For example, 300 to stop at the 300th frame from the frame at start time. If this value is 1, it means only producing one thumbnail at start time), or a relative value to the stream duration (For example, 50% to stop at half of stream duration from start time). The default value is 100%, which means to stop at the end of the stream.
     * 
     */
    public Optional<Output<String>> range() {
        return Optional.ofNullable(this.range);
    }

    /**
     * The position in the input video from where to start generating thumbnails. The value can be in ISO 8601 format (For example, PT05S to start at 5 seconds), or a frame count (For example, 10 to start at the 10th frame), or a relative value to stream duration (For example, 10% to start at 10% of stream duration). Also supports a macro {Best}, which tells the encoder to select the best thumbnail from the first few seconds of the video and will only produce one thumbnail, no matter what other settings are for Step and Range. The default value is macro {Best}.
     * 
     */
    @Import(name="start", required=true)
    private Output<String> start;

    /**
     * @return The position in the input video from where to start generating thumbnails. The value can be in ISO 8601 format (For example, PT05S to start at 5 seconds), or a frame count (For example, 10 to start at the 10th frame), or a relative value to stream duration (For example, 10% to start at 10% of stream duration). Also supports a macro {Best}, which tells the encoder to select the best thumbnail from the first few seconds of the video and will only produce one thumbnail, no matter what other settings are for Step and Range. The default value is macro {Best}.
     * 
     */
    public Output<String> start() {
        return this.start;
    }

    /**
     * The intervals at which thumbnails are generated. The value can be in ISO 8601 format (For example, PT05S for one image every 5 seconds), or a frame count (For example, 30 for one image every 30 frames), or a relative value to stream duration (For example, 10% for one image every 10% of stream duration). Note: Step value will affect the first generated thumbnail, which may not be exactly the one specified at transform preset start time. This is due to the encoder, which tries to select the best thumbnail between start time and Step position from start time as the first output. As the default value is 10%, it means if stream has long duration, the first generated thumbnail might be far away from the one specified at start time. Try to select reasonable value for Step if the first thumbnail is expected close to start time, or set Range value at 1 if only one thumbnail is needed at start time.
     * 
     */
    @Import(name="step")
    private @Nullable Output<String> step;

    /**
     * @return The intervals at which thumbnails are generated. The value can be in ISO 8601 format (For example, PT05S for one image every 5 seconds), or a frame count (For example, 30 for one image every 30 frames), or a relative value to stream duration (For example, 10% for one image every 10% of stream duration). Note: Step value will affect the first generated thumbnail, which may not be exactly the one specified at transform preset start time. This is due to the encoder, which tries to select the best thumbnail between start time and Step position from start time as the first output. As the default value is 10%, it means if stream has long duration, the first generated thumbnail might be far away from the one specified at start time. Try to select reasonable value for Step if the first thumbnail is expected close to start time, or set Range value at 1 if only one thumbnail is needed at start time.
     * 
     */
    public Optional<Output<String>> step() {
        return Optional.ofNullable(this.step);
    }

    /**
     * The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
     * 
     */
    @Import(name="stretchMode")
    private @Nullable Output<Either<String,StretchMode>> stretchMode;

    /**
     * @return The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
     * 
     */
    public Optional<Output<Either<String,StretchMode>>> stretchMode() {
        return Optional.ofNullable(this.stretchMode);
    }

    /**
     * The Video Sync Mode
     * 
     */
    @Import(name="syncMode")
    private @Nullable Output<Either<String,VideoSyncMode>> syncMode;

    /**
     * @return The Video Sync Mode
     * 
     */
    public Optional<Output<Either<String,VideoSyncMode>>> syncMode() {
        return Optional.ofNullable(this.syncMode);
    }

    private ImageArgs() {}

    private ImageArgs(ImageArgs $) {
        this.keyFrameInterval = $.keyFrameInterval;
        this.label = $.label;
        this.odataType = $.odataType;
        this.range = $.range;
        this.start = $.start;
        this.step = $.step;
        this.stretchMode = $.stretchMode;
        this.syncMode = $.syncMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageArgs $;

        public Builder() {
            $ = new ImageArgs();
        }

        public Builder(ImageArgs defaults) {
            $ = new ImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyFrameInterval The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
         * 
         * @return builder
         * 
         */
        public Builder keyFrameInterval(@Nullable Output<String> keyFrameInterval) {
            $.keyFrameInterval = keyFrameInterval;
            return this;
        }

        /**
         * @param keyFrameInterval The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
         * 
         * @return builder
         * 
         */
        public Builder keyFrameInterval(String keyFrameInterval) {
            return keyFrameInterval(Output.of(keyFrameInterval));
        }

        /**
         * @param label An optional label for the codec. The label can be used to control muxing behavior.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label An optional label for the codec. The label can be used to control muxing behavior.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.Image&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.Image&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        /**
         * @param range The position relative to transform preset start time in the input video at which to stop generating thumbnails. The value can be in ISO 8601 format (For example, PT5M30S to stop at 5 minutes and 30 seconds from start time), or a frame count (For example, 300 to stop at the 300th frame from the frame at start time. If this value is 1, it means only producing one thumbnail at start time), or a relative value to the stream duration (For example, 50% to stop at half of stream duration from start time). The default value is 100%, which means to stop at the end of the stream.
         * 
         * @return builder
         * 
         */
        public Builder range(@Nullable Output<String> range) {
            $.range = range;
            return this;
        }

        /**
         * @param range The position relative to transform preset start time in the input video at which to stop generating thumbnails. The value can be in ISO 8601 format (For example, PT5M30S to stop at 5 minutes and 30 seconds from start time), or a frame count (For example, 300 to stop at the 300th frame from the frame at start time. If this value is 1, it means only producing one thumbnail at start time), or a relative value to the stream duration (For example, 50% to stop at half of stream duration from start time). The default value is 100%, which means to stop at the end of the stream.
         * 
         * @return builder
         * 
         */
        public Builder range(String range) {
            return range(Output.of(range));
        }

        /**
         * @param start The position in the input video from where to start generating thumbnails. The value can be in ISO 8601 format (For example, PT05S to start at 5 seconds), or a frame count (For example, 10 to start at the 10th frame), or a relative value to stream duration (For example, 10% to start at 10% of stream duration). Also supports a macro {Best}, which tells the encoder to select the best thumbnail from the first few seconds of the video and will only produce one thumbnail, no matter what other settings are for Step and Range. The default value is macro {Best}.
         * 
         * @return builder
         * 
         */
        public Builder start(Output<String> start) {
            $.start = start;
            return this;
        }

        /**
         * @param start The position in the input video from where to start generating thumbnails. The value can be in ISO 8601 format (For example, PT05S to start at 5 seconds), or a frame count (For example, 10 to start at the 10th frame), or a relative value to stream duration (For example, 10% to start at 10% of stream duration). Also supports a macro {Best}, which tells the encoder to select the best thumbnail from the first few seconds of the video and will only produce one thumbnail, no matter what other settings are for Step and Range. The default value is macro {Best}.
         * 
         * @return builder
         * 
         */
        public Builder start(String start) {
            return start(Output.of(start));
        }

        /**
         * @param step The intervals at which thumbnails are generated. The value can be in ISO 8601 format (For example, PT05S for one image every 5 seconds), or a frame count (For example, 30 for one image every 30 frames), or a relative value to stream duration (For example, 10% for one image every 10% of stream duration). Note: Step value will affect the first generated thumbnail, which may not be exactly the one specified at transform preset start time. This is due to the encoder, which tries to select the best thumbnail between start time and Step position from start time as the first output. As the default value is 10%, it means if stream has long duration, the first generated thumbnail might be far away from the one specified at start time. Try to select reasonable value for Step if the first thumbnail is expected close to start time, or set Range value at 1 if only one thumbnail is needed at start time.
         * 
         * @return builder
         * 
         */
        public Builder step(@Nullable Output<String> step) {
            $.step = step;
            return this;
        }

        /**
         * @param step The intervals at which thumbnails are generated. The value can be in ISO 8601 format (For example, PT05S for one image every 5 seconds), or a frame count (For example, 30 for one image every 30 frames), or a relative value to stream duration (For example, 10% for one image every 10% of stream duration). Note: Step value will affect the first generated thumbnail, which may not be exactly the one specified at transform preset start time. This is due to the encoder, which tries to select the best thumbnail between start time and Step position from start time as the first output. As the default value is 10%, it means if stream has long duration, the first generated thumbnail might be far away from the one specified at start time. Try to select reasonable value for Step if the first thumbnail is expected close to start time, or set Range value at 1 if only one thumbnail is needed at start time.
         * 
         * @return builder
         * 
         */
        public Builder step(String step) {
            return step(Output.of(step));
        }

        /**
         * @param stretchMode The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
         * 
         * @return builder
         * 
         */
        public Builder stretchMode(@Nullable Output<Either<String,StretchMode>> stretchMode) {
            $.stretchMode = stretchMode;
            return this;
        }

        /**
         * @param stretchMode The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
         * 
         * @return builder
         * 
         */
        public Builder stretchMode(Either<String,StretchMode> stretchMode) {
            return stretchMode(Output.of(stretchMode));
        }

        /**
         * @param stretchMode The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
         * 
         * @return builder
         * 
         */
        public Builder stretchMode(String stretchMode) {
            return stretchMode(Either.ofLeft(stretchMode));
        }

        /**
         * @param stretchMode The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
         * 
         * @return builder
         * 
         */
        public Builder stretchMode(StretchMode stretchMode) {
            return stretchMode(Either.ofRight(stretchMode));
        }

        /**
         * @param syncMode The Video Sync Mode
         * 
         * @return builder
         * 
         */
        public Builder syncMode(@Nullable Output<Either<String,VideoSyncMode>> syncMode) {
            $.syncMode = syncMode;
            return this;
        }

        /**
         * @param syncMode The Video Sync Mode
         * 
         * @return builder
         * 
         */
        public Builder syncMode(Either<String,VideoSyncMode> syncMode) {
            return syncMode(Output.of(syncMode));
        }

        /**
         * @param syncMode The Video Sync Mode
         * 
         * @return builder
         * 
         */
        public Builder syncMode(String syncMode) {
            return syncMode(Either.ofLeft(syncMode));
        }

        /**
         * @param syncMode The Video Sync Mode
         * 
         * @return builder
         * 
         */
        public Builder syncMode(VideoSyncMode syncMode) {
            return syncMode(Either.ofRight(syncMode));
        }

        public ImageArgs build() {
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            $.start = Objects.requireNonNull($.start, "expected parameter 'start' to be non-null");
            return $;
        }
    }

}
