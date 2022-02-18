// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.AnalysisResolution;
import io.pulumi.azurenative.media.enums.BlurType;
import io.pulumi.azurenative.media.enums.FaceRedactorMode;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes all the settings to be used when analyzing a video in order to detect (and optionally redact) all the faces present.
 * 
 */
public final class FaceDetectorPresetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FaceDetectorPresetArgs Empty = new FaceDetectorPresetArgs();

    /**
     * Blur type
     * 
     */
    @InputImport(name="blurType")
    private final @Nullable Input<Either<String,BlurType>> blurType;

    public Input<Either<String,BlurType>> getBlurType() {
        return this.blurType == null ? Input.empty() : this.blurType;
    }

    /**
     * Dictionary containing key value pairs for parameters not exposed in the preset itself
     * 
     */
    @InputImport(name="experimentalOptions")
    private final @Nullable Input<Map<String,String>> experimentalOptions;

    public Input<Map<String,String>> getExperimentalOptions() {
        return this.experimentalOptions == null ? Input.empty() : this.experimentalOptions;
    }

    /**
     * This mode provides the ability to choose between the following settings: 1) Analyze - For detection only.This mode generates a metadata JSON file marking appearances of faces throughout the video.Where possible, appearances of the same person are assigned the same ID. 2) Combined - Additionally redacts(blurs) detected faces. 3) Redact - This enables a 2-pass process, allowing for selective redaction of a subset of detected faces.It takes in the metadata file from a prior analyze pass, along with the source video, and a user-selected subset of IDs that require redaction.
     * 
     */
    @InputImport(name="mode")
    private final @Nullable Input<Either<String,FaceRedactorMode>> mode;

    public Input<Either<String,FaceRedactorMode>> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.FaceDetectorPreset'.
     * 
     */
    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    /**
     * Specifies the maximum resolution at which your video is analyzed. The default behavior is "SourceResolution," which will keep the input video at its original resolution when analyzed. Using "StandardDefinition" will resize input videos to standard definition while preserving the appropriate aspect ratio. It will only resize if the video is of higher resolution. For example, a 1920x1080 input would be scaled to 640x360 before processing. Switching to "StandardDefinition" will reduce the time it takes to process high resolution video. It may also reduce the cost of using this component (see https://azure.microsoft.com/en-us/pricing/details/media-services/#analytics for details). However, faces that end up being too small in the resized video may not be detected.
     * 
     */
    @InputImport(name="resolution")
    private final @Nullable Input<Either<String,AnalysisResolution>> resolution;

    public Input<Either<String,AnalysisResolution>> getResolution() {
        return this.resolution == null ? Input.empty() : this.resolution;
    }

    public FaceDetectorPresetArgs(
        @Nullable Input<Either<String,BlurType>> blurType,
        @Nullable Input<Map<String,String>> experimentalOptions,
        @Nullable Input<Either<String,FaceRedactorMode>> mode,
        Input<String> odataType,
        @Nullable Input<Either<String,AnalysisResolution>> resolution) {
        this.blurType = blurType;
        this.experimentalOptions = experimentalOptions;
        this.mode = mode;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.resolution = resolution;
    }

    private FaceDetectorPresetArgs() {
        this.blurType = Input.empty();
        this.experimentalOptions = Input.empty();
        this.mode = Input.empty();
        this.odataType = Input.empty();
        this.resolution = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FaceDetectorPresetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,BlurType>> blurType;
        private @Nullable Input<Map<String,String>> experimentalOptions;
        private @Nullable Input<Either<String,FaceRedactorMode>> mode;
        private Input<String> odataType;
        private @Nullable Input<Either<String,AnalysisResolution>> resolution;

        public Builder() {
    	      // Empty
        }

        public Builder(FaceDetectorPresetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blurType = defaults.blurType;
    	      this.experimentalOptions = defaults.experimentalOptions;
    	      this.mode = defaults.mode;
    	      this.odataType = defaults.odataType;
    	      this.resolution = defaults.resolution;
        }

        public Builder setBlurType(@Nullable Input<Either<String,BlurType>> blurType) {
            this.blurType = blurType;
            return this;
        }

        public Builder setBlurType(@Nullable Either<String,BlurType> blurType) {
            this.blurType = Input.ofNullable(blurType);
            return this;
        }

        public Builder setExperimentalOptions(@Nullable Input<Map<String,String>> experimentalOptions) {
            this.experimentalOptions = experimentalOptions;
            return this;
        }

        public Builder setExperimentalOptions(@Nullable Map<String,String> experimentalOptions) {
            this.experimentalOptions = Input.ofNullable(experimentalOptions);
            return this;
        }

        public Builder setMode(@Nullable Input<Either<String,FaceRedactorMode>> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable Either<String,FaceRedactorMode> mode) {
            this.mode = Input.ofNullable(mode);
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

        public Builder setResolution(@Nullable Input<Either<String,AnalysisResolution>> resolution) {
            this.resolution = resolution;
            return this;
        }

        public Builder setResolution(@Nullable Either<String,AnalysisResolution> resolution) {
            this.resolution = Input.ofNullable(resolution);
            return this;
        }

        public FaceDetectorPresetArgs build() {
            return new FaceDetectorPresetArgs(blurType, experimentalOptions, mode, odataType, resolution);
        }
    }
}
