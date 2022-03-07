// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.enums.VideoScaleMode;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The video scaling information.
 * 
 */
public final class VideoScaleArgs extends io.pulumi.resources.ResourceArgs {

    public static final VideoScaleArgs Empty = new VideoScaleArgs();

    /**
     * The desired output video height.
     * 
     */
    @InputImport(name="height")
      private final @Nullable Input<String> height;

    public Input<String> getHeight() {
        return this.height == null ? Input.empty() : this.height;
    }

    /**
     * Describes the video scaling mode to be applied. Default mode is 'Pad'. If the mode is 'Pad' or 'Stretch' then both width and height must be specified. Else if the mode is 'PreserveAspectRatio' then only one of width or height need be provided.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<Either<String,VideoScaleMode>> mode;

    public Input<Either<String,VideoScaleMode>> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * The desired output video width.
     * 
     */
    @InputImport(name="width")
      private final @Nullable Input<String> width;

    public Input<String> getWidth() {
        return this.width == null ? Input.empty() : this.width;
    }

    public VideoScaleArgs(
        @Nullable Input<String> height,
        @Nullable Input<Either<String,VideoScaleMode>> mode,
        @Nullable Input<String> width) {
        this.height = height;
        this.mode = mode;
        this.width = width;
    }

    private VideoScaleArgs() {
        this.height = Input.empty();
        this.mode = Input.empty();
        this.width = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoScaleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> height;
        private @Nullable Input<Either<String,VideoScaleMode>> mode;
        private @Nullable Input<String> width;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoScaleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.mode = defaults.mode;
    	      this.width = defaults.width;
        }

        public Builder setHeight(@Nullable Input<String> height) {
            this.height = height;
            return this;
        }

        public Builder setHeight(@Nullable String height) {
            this.height = Input.ofNullable(height);
            return this;
        }

        public Builder setMode(@Nullable Input<Either<String,VideoScaleMode>> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable Either<String,VideoScaleMode> mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setWidth(@Nullable Input<String> width) {
            this.width = width;
            return this;
        }

        public Builder setWidth(@Nullable String width) {
            this.width = Input.ofNullable(width);
            return this;
        }
        public VideoScaleArgs build() {
            return new VideoScaleArgs(height, mode, width);
        }
    }
}