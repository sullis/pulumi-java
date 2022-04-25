// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.azurenative.videoanalyzer.enums.VideoScaleMode;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The video scaling information.
 * 
 */
public final class VideoScaleArgs extends com.pulumi.resources.ResourceArgs {

    public static final VideoScaleArgs Empty = new VideoScaleArgs();

    /**
     * The desired output video height.
     * 
     */
    @Import(name="height")
    private @Nullable Output<String> height;

    /**
     * @return The desired output video height.
     * 
     */
    public Optional<Output<String>> height() {
        return Optional.ofNullable(this.height);
    }

    /**
     * Describes the video scaling mode to be applied. Default mode is &#39;Pad&#39;. If the mode is &#39;Pad&#39; or &#39;Stretch&#39; then both width and height must be specified. Else if the mode is &#39;PreserveAspectRatio&#39; then only one of width or height need be provided.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<Either<String,VideoScaleMode>> mode;

    /**
     * @return Describes the video scaling mode to be applied. Default mode is &#39;Pad&#39;. If the mode is &#39;Pad&#39; or &#39;Stretch&#39; then both width and height must be specified. Else if the mode is &#39;PreserveAspectRatio&#39; then only one of width or height need be provided.
     * 
     */
    public Optional<Output<Either<String,VideoScaleMode>>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The desired output video width.
     * 
     */
    @Import(name="width")
    private @Nullable Output<String> width;

    /**
     * @return The desired output video width.
     * 
     */
    public Optional<Output<String>> width() {
        return Optional.ofNullable(this.width);
    }

    private VideoScaleArgs() {}

    private VideoScaleArgs(VideoScaleArgs $) {
        this.height = $.height;
        this.mode = $.mode;
        this.width = $.width;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VideoScaleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VideoScaleArgs $;

        public Builder() {
            $ = new VideoScaleArgs();
        }

        public Builder(VideoScaleArgs defaults) {
            $ = new VideoScaleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param height The desired output video height.
         * 
         * @return builder
         * 
         */
        public Builder height(@Nullable Output<String> height) {
            $.height = height;
            return this;
        }

        /**
         * @param height The desired output video height.
         * 
         * @return builder
         * 
         */
        public Builder height(String height) {
            return height(Output.of(height));
        }

        /**
         * @param mode Describes the video scaling mode to be applied. Default mode is &#39;Pad&#39;. If the mode is &#39;Pad&#39; or &#39;Stretch&#39; then both width and height must be specified. Else if the mode is &#39;PreserveAspectRatio&#39; then only one of width or height need be provided.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<Either<String,VideoScaleMode>> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Describes the video scaling mode to be applied. Default mode is &#39;Pad&#39;. If the mode is &#39;Pad&#39; or &#39;Stretch&#39; then both width and height must be specified. Else if the mode is &#39;PreserveAspectRatio&#39; then only one of width or height need be provided.
         * 
         * @return builder
         * 
         */
        public Builder mode(Either<String,VideoScaleMode> mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param mode Describes the video scaling mode to be applied. Default mode is &#39;Pad&#39;. If the mode is &#39;Pad&#39; or &#39;Stretch&#39; then both width and height must be specified. Else if the mode is &#39;PreserveAspectRatio&#39; then only one of width or height need be provided.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Either.ofLeft(mode));
        }

        /**
         * @param mode Describes the video scaling mode to be applied. Default mode is &#39;Pad&#39;. If the mode is &#39;Pad&#39; or &#39;Stretch&#39; then both width and height must be specified. Else if the mode is &#39;PreserveAspectRatio&#39; then only one of width or height need be provided.
         * 
         * @return builder
         * 
         */
        public Builder mode(VideoScaleMode mode) {
            return mode(Either.ofRight(mode));
        }

        /**
         * @param width The desired output video width.
         * 
         * @return builder
         * 
         */
        public Builder width(@Nullable Output<String> width) {
            $.width = width;
            return this;
        }

        /**
         * @param width The desired output video width.
         * 
         * @return builder
         * 
         */
        public Builder width(String width) {
            return width(Output.of(width));
        }

        public VideoScaleArgs build() {
            return $;
        }
    }

}
