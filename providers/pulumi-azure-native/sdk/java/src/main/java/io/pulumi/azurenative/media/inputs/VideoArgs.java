// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.StretchMode;
import io.pulumi.azurenative.media.enums.VideoSyncMode;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the basic properties for encoding the input video.
 * 
 */
public final class VideoArgs extends io.pulumi.resources.ResourceArgs {

    public static final VideoArgs Empty = new VideoArgs();

    /**
     * The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
     * 
     */
    @InputImport(name="keyFrameInterval")
      private final @Nullable Input<String> keyFrameInterval;

    public Input<String> getKeyFrameInterval() {
        return this.keyFrameInterval == null ? Input.empty() : this.keyFrameInterval;
    }

    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    @InputImport(name="label")
      private final @Nullable Input<String> label;

    public Input<String> getLabel() {
        return this.label == null ? Input.empty() : this.label;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.Video'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    /**
     * The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
     * 
     */
    @InputImport(name="stretchMode")
      private final @Nullable Input<Either<String,StretchMode>> stretchMode;

    public Input<Either<String,StretchMode>> getStretchMode() {
        return this.stretchMode == null ? Input.empty() : this.stretchMode;
    }

    /**
     * The Video Sync Mode
     * 
     */
    @InputImport(name="syncMode")
      private final @Nullable Input<Either<String,VideoSyncMode>> syncMode;

    public Input<Either<String,VideoSyncMode>> getSyncMode() {
        return this.syncMode == null ? Input.empty() : this.syncMode;
    }

    public VideoArgs(
        @Nullable Input<String> keyFrameInterval,
        @Nullable Input<String> label,
        Input<String> odataType,
        @Nullable Input<Either<String,StretchMode>> stretchMode,
        @Nullable Input<Either<String,VideoSyncMode>> syncMode) {
        this.keyFrameInterval = keyFrameInterval;
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.stretchMode = stretchMode;
        this.syncMode = syncMode;
    }

    private VideoArgs() {
        this.keyFrameInterval = Input.empty();
        this.label = Input.empty();
        this.odataType = Input.empty();
        this.stretchMode = Input.empty();
        this.syncMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyFrameInterval;
        private @Nullable Input<String> label;
        private Input<String> odataType;
        private @Nullable Input<Either<String,StretchMode>> stretchMode;
        private @Nullable Input<Either<String,VideoSyncMode>> syncMode;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyFrameInterval = defaults.keyFrameInterval;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.stretchMode = defaults.stretchMode;
    	      this.syncMode = defaults.syncMode;
        }

        public Builder setKeyFrameInterval(@Nullable Input<String> keyFrameInterval) {
            this.keyFrameInterval = keyFrameInterval;
            return this;
        }

        public Builder setKeyFrameInterval(@Nullable String keyFrameInterval) {
            this.keyFrameInterval = Input.ofNullable(keyFrameInterval);
            return this;
        }

        public Builder setLabel(@Nullable Input<String> label) {
            this.label = label;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = Input.ofNullable(label);
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setStretchMode(@Nullable Input<Either<String,StretchMode>> stretchMode) {
            this.stretchMode = stretchMode;
            return this;
        }

        public Builder setStretchMode(@Nullable Either<String,StretchMode> stretchMode) {
            this.stretchMode = Input.ofNullable(stretchMode);
            return this;
        }

        public Builder setSyncMode(@Nullable Input<Either<String,VideoSyncMode>> syncMode) {
            this.syncMode = syncMode;
            return this;
        }

        public Builder setSyncMode(@Nullable Either<String,VideoSyncMode> syncMode) {
            this.syncMode = Input.ofNullable(syncMode);
            return this;
        }
        public VideoArgs build() {
            return new VideoArgs(keyFrameInterval, label, odataType, stretchMode, syncMode);
        }
    }
}