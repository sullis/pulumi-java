// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.AudioTrackDescriptorResponse;
import com.pulumi.azurenative.media.inputs.SelectAudioTrackByAttributeResponse;
import com.pulumi.azurenative.media.inputs.SelectAudioTrackByIdResponse;
import com.pulumi.azurenative.media.inputs.SelectVideoTrackByAttributeResponse;
import com.pulumi.azurenative.media.inputs.SelectVideoTrackByIdResponse;
import com.pulumi.azurenative.media.inputs.VideoTrackDescriptorResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
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
public final class FromEachInputFileResponse extends com.pulumi.resources.InvokeArgs {

    public static final FromEachInputFileResponse Empty = new FromEachInputFileResponse();

    /**
     * The list of TrackDescriptors which define the metadata and selection of tracks in the input.
     * 
     */
    @Import(name="includedTracks")
      private final @Nullable List<Object> includedTracks;

    public List<Object> includedTracks() {
        return this.includedTracks == null ? List.of() : this.includedTracks;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.FromEachInputFile'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    public FromEachInputFileResponse(
        @Nullable List<Object> includedTracks,
        String odataType) {
        this.includedTracks = includedTracks;
        this.odataType = Codegen.stringProp("odataType").arg(odataType).require();
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

        public Builder includedTracks(@Nullable List<Object> includedTracks) {
            this.includedTracks = includedTracks;
            return this;
        }
        public Builder includedTracks(Object... includedTracks) {
            return includedTracks(List.of(includedTracks));
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public FromEachInputFileResponse build() {
            return new FromEachInputFileResponse(includedTracks, odataType);
        }
    }
}
