// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.transcoder_v1.enums.ManifestType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Manifest configuration.
 * 
 */
public final class ManifestArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManifestArgs Empty = new ManifestArgs();

    /**
     * The name of the generated file. The default is `manifest` with the extension suffix corresponding to the `Manifest.type`.
     * 
     */
    @InputImport(name="fileName")
      private final @Nullable Input<String> fileName;

    public Input<String> getFileName() {
        return this.fileName == null ? Input.empty() : this.fileName;
    }

    /**
     * List of user given `MuxStream.key`s that should appear in this manifest. When `Manifest.type` is `HLS`, a media manifest with name `MuxStream.key` and `.m3u8` extension is generated for each element of the `Manifest.mux_streams`.
     * 
     */
    @InputImport(name="muxStreams", required=true)
      private final Input<List<String>> muxStreams;

    public Input<List<String>> getMuxStreams() {
        return this.muxStreams;
    }

    /**
     * Type of the manifest, can be `HLS` or `DASH`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<ManifestType> type;

    public Input<ManifestType> getType() {
        return this.type;
    }

    public ManifestArgs(
        @Nullable Input<String> fileName,
        Input<List<String>> muxStreams,
        Input<ManifestType> type) {
        this.fileName = fileName;
        this.muxStreams = Objects.requireNonNull(muxStreams, "expected parameter 'muxStreams' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ManifestArgs() {
        this.fileName = Input.empty();
        this.muxStreams = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManifestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fileName;
        private Input<List<String>> muxStreams;
        private Input<ManifestType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManifestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
    	      this.muxStreams = defaults.muxStreams;
    	      this.type = defaults.type;
        }

        public Builder setFileName(@Nullable Input<String> fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder setFileName(@Nullable String fileName) {
            this.fileName = Input.ofNullable(fileName);
            return this;
        }

        public Builder setMuxStreams(Input<List<String>> muxStreams) {
            this.muxStreams = Objects.requireNonNull(muxStreams);
            return this;
        }

        public Builder setMuxStreams(List<String> muxStreams) {
            this.muxStreams = Input.of(Objects.requireNonNull(muxStreams));
            return this;
        }

        public Builder setType(Input<ManifestType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(ManifestType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ManifestArgs build() {
            return new ManifestArgs(fileName, muxStreams, type);
        }
    }
}