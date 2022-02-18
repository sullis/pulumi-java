// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AudioTrackDescriptorArgs;
import io.pulumi.azurenative.media.inputs.SelectAudioTrackByAttributeArgs;
import io.pulumi.azurenative.media.inputs.SelectAudioTrackByIdArgs;
import io.pulumi.azurenative.media.inputs.SelectVideoTrackByAttributeArgs;
import io.pulumi.azurenative.media.inputs.SelectVideoTrackByIdArgs;
import io.pulumi.azurenative.media.inputs.VideoTrackDescriptorArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An InputDefinition that looks across all of the files provided to select tracks specified by the IncludedTracks property. Generally used with the AudioTrackByAttribute and VideoTrackByAttribute to allow selection of a single track across a set of input files.
 * 
 */
public final class FromAllInputFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final FromAllInputFileArgs Empty = new FromAllInputFileArgs();

    /**
     * The list of TrackDescriptors which define the metadata and selection of tracks in the input.
     * 
     */
    @InputImport(name="includedTracks")
    private final @Nullable Input<List<Object>> includedTracks;

    public Input<List<Object>> getIncludedTracks() {
        return this.includedTracks == null ? Input.empty() : this.includedTracks;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.FromAllInputFile'.
     * 
     */
    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public FromAllInputFileArgs(
        @Nullable Input<List<Object>> includedTracks,
        Input<String> odataType) {
        this.includedTracks = includedTracks;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private FromAllInputFileArgs() {
        this.includedTracks = Input.empty();
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FromAllInputFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> includedTracks;
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(FromAllInputFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includedTracks = defaults.includedTracks;
    	      this.odataType = defaults.odataType;
        }

        public Builder setIncludedTracks(@Nullable Input<List<Object>> includedTracks) {
            this.includedTracks = includedTracks;
            return this;
        }

        public Builder setIncludedTracks(@Nullable List<Object> includedTracks) {
            this.includedTracks = Input.ofNullable(includedTracks);
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

        public FromAllInputFileArgs build() {
            return new FromAllInputFileArgs(includedTracks, odataType);
        }
    }
}
