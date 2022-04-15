// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.awsnative.mediapackage.outputs.OriginEndpointCmafEncryption;
import io.pulumi.awsnative.mediapackage.outputs.OriginEndpointHlsManifest;
import io.pulumi.awsnative.mediapackage.outputs.OriginEndpointStreamSelection;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OriginEndpointCmafPackage {
    private final @Nullable OriginEndpointCmafEncryption encryption;
    /**
     * A list of HLS manifest configurations
     * 
     */
    private final @Nullable List<OriginEndpointHlsManifest> hlsManifests;
    /**
     * Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the source segment duration.
     * 
     */
    private final @Nullable Integer segmentDurationSeconds;
    /**
     * An optional custom string that is prepended to the name of each segment. If not specified, it defaults to the ChannelId.
     * 
     */
    private final @Nullable String segmentPrefix;
    private final @Nullable OriginEndpointStreamSelection streamSelection;

    @CustomType.Constructor
    private OriginEndpointCmafPackage(
        @CustomType.Parameter("encryption") @Nullable OriginEndpointCmafEncryption encryption,
        @CustomType.Parameter("hlsManifests") @Nullable List<OriginEndpointHlsManifest> hlsManifests,
        @CustomType.Parameter("segmentDurationSeconds") @Nullable Integer segmentDurationSeconds,
        @CustomType.Parameter("segmentPrefix") @Nullable String segmentPrefix,
        @CustomType.Parameter("streamSelection") @Nullable OriginEndpointStreamSelection streamSelection) {
        this.encryption = encryption;
        this.hlsManifests = hlsManifests;
        this.segmentDurationSeconds = segmentDurationSeconds;
        this.segmentPrefix = segmentPrefix;
        this.streamSelection = streamSelection;
    }

    public Optional<OriginEndpointCmafEncryption> encryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * A list of HLS manifest configurations
     * 
    */
    public List<OriginEndpointHlsManifest> hlsManifests() {
        return this.hlsManifests == null ? List.of() : this.hlsManifests;
    }
    /**
     * Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the source segment duration.
     * 
    */
    public Optional<Integer> segmentDurationSeconds() {
        return Optional.ofNullable(this.segmentDurationSeconds);
    }
    /**
     * An optional custom string that is prepended to the name of each segment. If not specified, it defaults to the ChannelId.
     * 
    */
    public Optional<String> segmentPrefix() {
        return Optional.ofNullable(this.segmentPrefix);
    }
    public Optional<OriginEndpointStreamSelection> streamSelection() {
        return Optional.ofNullable(this.streamSelection);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointCmafPackage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable OriginEndpointCmafEncryption encryption;
        private @Nullable List<OriginEndpointHlsManifest> hlsManifests;
        private @Nullable Integer segmentDurationSeconds;
        private @Nullable String segmentPrefix;
        private @Nullable OriginEndpointStreamSelection streamSelection;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointCmafPackage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.hlsManifests = defaults.hlsManifests;
    	      this.segmentDurationSeconds = defaults.segmentDurationSeconds;
    	      this.segmentPrefix = defaults.segmentPrefix;
    	      this.streamSelection = defaults.streamSelection;
        }

        public Builder encryption(@Nullable OriginEndpointCmafEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder hlsManifests(@Nullable List<OriginEndpointHlsManifest> hlsManifests) {
            this.hlsManifests = hlsManifests;
            return this;
        }
        public Builder hlsManifests(OriginEndpointHlsManifest... hlsManifests) {
            return hlsManifests(List.of(hlsManifests));
        }
        public Builder segmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }
        public Builder segmentPrefix(@Nullable String segmentPrefix) {
            this.segmentPrefix = segmentPrefix;
            return this;
        }
        public Builder streamSelection(@Nullable OriginEndpointStreamSelection streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }        public OriginEndpointCmafPackage build() {
            return new OriginEndpointCmafPackage(encryption, hlsManifests, segmentDurationSeconds, segmentPrefix, streamSelection);
        }
    }
}
