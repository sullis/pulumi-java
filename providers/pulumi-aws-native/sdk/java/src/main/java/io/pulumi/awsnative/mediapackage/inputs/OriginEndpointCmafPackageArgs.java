// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointCmafEncryptionArgs;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointHlsManifestArgs;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointStreamSelectionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Common Media Application Format (CMAF) packaging configuration.
 * 
 */
public final class OriginEndpointCmafPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginEndpointCmafPackageArgs Empty = new OriginEndpointCmafPackageArgs();

    @Import(name="encryption")
      private final @Nullable Output<OriginEndpointCmafEncryptionArgs> encryption;

    public Output<OriginEndpointCmafEncryptionArgs> encryption() {
        return this.encryption == null ? Codegen.empty() : this.encryption;
    }

    /**
     * A list of HLS manifest configurations
     * 
     */
    @Import(name="hlsManifests")
      private final @Nullable Output<List<OriginEndpointHlsManifestArgs>> hlsManifests;

    public Output<List<OriginEndpointHlsManifestArgs>> hlsManifests() {
        return this.hlsManifests == null ? Codegen.empty() : this.hlsManifests;
    }

    /**
     * Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the source segment duration.
     * 
     */
    @Import(name="segmentDurationSeconds")
      private final @Nullable Output<Integer> segmentDurationSeconds;

    public Output<Integer> segmentDurationSeconds() {
        return this.segmentDurationSeconds == null ? Codegen.empty() : this.segmentDurationSeconds;
    }

    /**
     * An optional custom string that is prepended to the name of each segment. If not specified, it defaults to the ChannelId.
     * 
     */
    @Import(name="segmentPrefix")
      private final @Nullable Output<String> segmentPrefix;

    public Output<String> segmentPrefix() {
        return this.segmentPrefix == null ? Codegen.empty() : this.segmentPrefix;
    }

    @Import(name="streamSelection")
      private final @Nullable Output<OriginEndpointStreamSelectionArgs> streamSelection;

    public Output<OriginEndpointStreamSelectionArgs> streamSelection() {
        return this.streamSelection == null ? Codegen.empty() : this.streamSelection;
    }

    public OriginEndpointCmafPackageArgs(
        @Nullable Output<OriginEndpointCmafEncryptionArgs> encryption,
        @Nullable Output<List<OriginEndpointHlsManifestArgs>> hlsManifests,
        @Nullable Output<Integer> segmentDurationSeconds,
        @Nullable Output<String> segmentPrefix,
        @Nullable Output<OriginEndpointStreamSelectionArgs> streamSelection) {
        this.encryption = encryption;
        this.hlsManifests = hlsManifests;
        this.segmentDurationSeconds = segmentDurationSeconds;
        this.segmentPrefix = segmentPrefix;
        this.streamSelection = streamSelection;
    }

    private OriginEndpointCmafPackageArgs() {
        this.encryption = Codegen.empty();
        this.hlsManifests = Codegen.empty();
        this.segmentDurationSeconds = Codegen.empty();
        this.segmentPrefix = Codegen.empty();
        this.streamSelection = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointCmafPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<OriginEndpointCmafEncryptionArgs> encryption;
        private @Nullable Output<List<OriginEndpointHlsManifestArgs>> hlsManifests;
        private @Nullable Output<Integer> segmentDurationSeconds;
        private @Nullable Output<String> segmentPrefix;
        private @Nullable Output<OriginEndpointStreamSelectionArgs> streamSelection;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointCmafPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.hlsManifests = defaults.hlsManifests;
    	      this.segmentDurationSeconds = defaults.segmentDurationSeconds;
    	      this.segmentPrefix = defaults.segmentPrefix;
    	      this.streamSelection = defaults.streamSelection;
        }

        public Builder encryption(@Nullable Output<OriginEndpointCmafEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder encryption(@Nullable OriginEndpointCmafEncryptionArgs encryption) {
            this.encryption = Codegen.ofNullable(encryption);
            return this;
        }
        public Builder hlsManifests(@Nullable Output<List<OriginEndpointHlsManifestArgs>> hlsManifests) {
            this.hlsManifests = hlsManifests;
            return this;
        }
        public Builder hlsManifests(@Nullable List<OriginEndpointHlsManifestArgs> hlsManifests) {
            this.hlsManifests = Codegen.ofNullable(hlsManifests);
            return this;
        }
        public Builder hlsManifests(OriginEndpointHlsManifestArgs... hlsManifests) {
            return hlsManifests(List.of(hlsManifests));
        }
        public Builder segmentDurationSeconds(@Nullable Output<Integer> segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }
        public Builder segmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = Codegen.ofNullable(segmentDurationSeconds);
            return this;
        }
        public Builder segmentPrefix(@Nullable Output<String> segmentPrefix) {
            this.segmentPrefix = segmentPrefix;
            return this;
        }
        public Builder segmentPrefix(@Nullable String segmentPrefix) {
            this.segmentPrefix = Codegen.ofNullable(segmentPrefix);
            return this;
        }
        public Builder streamSelection(@Nullable Output<OriginEndpointStreamSelectionArgs> streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }
        public Builder streamSelection(@Nullable OriginEndpointStreamSelectionArgs streamSelection) {
            this.streamSelection = Codegen.ofNullable(streamSelection);
            return this;
        }        public OriginEndpointCmafPackageArgs build() {
            return new OriginEndpointCmafPackageArgs(encryption, hlsManifests, segmentDurationSeconds, segmentPrefix, streamSelection);
        }
    }
}
