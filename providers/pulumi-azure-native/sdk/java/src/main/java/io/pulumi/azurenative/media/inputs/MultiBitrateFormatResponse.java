// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.OutputFileResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties for producing a collection of GOP aligned multi-bitrate files. The default behavior is to produce one output file for each video layer which is muxed together with all the audios. The exact output files produced can be controlled by specifying the outputFiles collection.
 * 
 */
public final class MultiBitrateFormatResponse extends io.pulumi.resources.InvokeArgs {

    public static final MultiBitrateFormatResponse Empty = new MultiBitrateFormatResponse();

    /**
     * The pattern of the file names for the generated output files. The following macros are supported in the file name: {Basename} - An expansion macro that will use the name of the input video file. If the base name(the file suffix is not included) of the input video file is less than 32 characters long, the base name of input video files will be used. If the length of base name of the input video file exceeds 32 characters, the base name is truncated to the first 32 characters in total length. {Extension} - The appropriate extension for this format. {Label} - The label assigned to the codec/layer. {Index} - A unique index for thumbnails. Only applicable to thumbnails. {Bitrate} - The audio/video bitrate. Not applicable to thumbnails. {Codec} - The type of the audio/video codec. {Resolution} - The video resolution. Any unsubstituted macros will be collapsed and removed from the filename.
     * 
     */
    @InputImport(name="filenamePattern", required=true)
      private final String filenamePattern;

    public String getFilenamePattern() {
        return this.filenamePattern;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MultiBitrateFormat'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * The list of output files to produce.  Each entry in the list is a set of audio and video layer labels to be muxed together .
     * 
     */
    @InputImport(name="outputFiles")
      private final @Nullable List<OutputFileResponse> outputFiles;

    public List<OutputFileResponse> getOutputFiles() {
        return this.outputFiles == null ? List.of() : this.outputFiles;
    }

    public MultiBitrateFormatResponse(
        String filenamePattern,
        String odataType,
        @Nullable List<OutputFileResponse> outputFiles) {
        this.filenamePattern = Objects.requireNonNull(filenamePattern, "expected parameter 'filenamePattern' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.outputFiles = outputFiles;
    }

    private MultiBitrateFormatResponse() {
        this.filenamePattern = null;
        this.odataType = null;
        this.outputFiles = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiBitrateFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filenamePattern;
        private String odataType;
        private @Nullable List<OutputFileResponse> outputFiles;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiBitrateFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filenamePattern = defaults.filenamePattern;
    	      this.odataType = defaults.odataType;
    	      this.outputFiles = defaults.outputFiles;
        }

        public Builder setFilenamePattern(String filenamePattern) {
            this.filenamePattern = Objects.requireNonNull(filenamePattern);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOutputFiles(@Nullable List<OutputFileResponse> outputFiles) {
            this.outputFiles = outputFiles;
            return this;
        }
        public MultiBitrateFormatResponse build() {
            return new MultiBitrateFormatResponse(filenamePattern, odataType, outputFiles);
        }
    }
}