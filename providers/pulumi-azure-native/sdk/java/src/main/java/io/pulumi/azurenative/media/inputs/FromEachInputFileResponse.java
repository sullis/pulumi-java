// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AudioTrackDescriptorResponse;
import io.pulumi.azurenative.media.inputs.SelectAudioTrackByAttributeResponse;
import io.pulumi.azurenative.media.inputs.SelectAudioTrackByIdResponse;
import io.pulumi.azurenative.media.inputs.SelectVideoTrackByAttributeResponse;
import io.pulumi.azurenative.media.inputs.SelectVideoTrackByIdResponse;
import io.pulumi.azurenative.media.inputs.VideoTrackDescriptorResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An InputDefinition that looks at each input file provided to select tracks specified by the IncludedTracks property. Generally used with the AudioTrackByAttribute and VideoTrackByAttribute to select tracks from each file given.
 * 
 */
public final class FromEachInputFileResponse extends io.pulumi.resources.InvokeArgs {

    public static final FromEachInputFileResponse Empty = new FromEachInputFileResponse();

    /**
     * The list of TrackDescriptors which define the metadata and selection of tracks in the input.
     * 
     */
    @InputImport(name="includedTracks")
      private final @Nullable List<Object> includedTracks;

    public List<Object> getIncludedTracks() {
        return this.includedTracks == null ? List.of() : this.includedTracks;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.FromEachInputFile'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public FromEachInputFileResponse(
        @Nullable List<Object> includedTracks,
        String odataType) {
        this.includedTracks = includedTracks;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private FromEachInputFileResponse() {
        this.includedTracks = List.of();
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FromEachInputFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> includedTracks;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(FromEachInputFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includedTracks = defaults.includedTracks;
    	      this.odataType = defaults.odataType;
        }

        public Builder setIncludedTracks(@Nullable List<Object> includedTracks) {
            this.includedTracks = includedTracks;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public FromEachInputFileResponse build() {
            return new FromEachInputFileResponse(includedTracks, odataType);
        }
    }
}