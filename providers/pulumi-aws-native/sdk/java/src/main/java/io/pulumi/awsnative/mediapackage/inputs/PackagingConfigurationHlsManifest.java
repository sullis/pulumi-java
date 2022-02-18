// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.enums.PackagingConfigurationHlsManifestAdMarkers;
import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationStreamSelection;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An HTTP Live Streaming (HLS) manifest configuration.
 * 
 */
public final class PackagingConfigurationHlsManifest extends io.pulumi.resources.InvokeArgs {

    public static final PackagingConfigurationHlsManifest Empty = new PackagingConfigurationHlsManifest();

    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35 messages in the input source.
     * 
     */
    @InputImport(name="adMarkers")
    private final @Nullable PackagingConfigurationHlsManifestAdMarkers adMarkers;

    public Optional<PackagingConfigurationHlsManifestAdMarkers> getAdMarkers() {
        return this.adMarkers == null ? Optional.empty() : Optional.ofNullable(this.adMarkers);
    }

    /**
     * When enabled, an I-Frame only stream will be included in the output.
     * 
     */
    @InputImport(name="includeIframeOnlyStream")
    private final @Nullable Boolean includeIframeOnlyStream;

    public Optional<Boolean> getIncludeIframeOnlyStream() {
        return this.includeIframeOnlyStream == null ? Optional.empty() : Optional.ofNullable(this.includeIframeOnlyStream);
    }

    @InputImport(name="manifestName")
    private final @Nullable String manifestName;

    public Optional<String> getManifestName() {
        return this.manifestName == null ? Optional.empty() : Optional.ofNullable(this.manifestName);
    }

    /**
     * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
     * 
     */
    @InputImport(name="programDateTimeIntervalSeconds")
    private final @Nullable Integer programDateTimeIntervalSeconds;

    public Optional<Integer> getProgramDateTimeIntervalSeconds() {
        return this.programDateTimeIntervalSeconds == null ? Optional.empty() : Optional.ofNullable(this.programDateTimeIntervalSeconds);
    }

    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     */
    @InputImport(name="repeatExtXKey")
    private final @Nullable Boolean repeatExtXKey;

    public Optional<Boolean> getRepeatExtXKey() {
        return this.repeatExtXKey == null ? Optional.empty() : Optional.ofNullable(this.repeatExtXKey);
    }

    @InputImport(name="streamSelection")
    private final @Nullable PackagingConfigurationStreamSelection streamSelection;

    public Optional<PackagingConfigurationStreamSelection> getStreamSelection() {
        return this.streamSelection == null ? Optional.empty() : Optional.ofNullable(this.streamSelection);
    }

    public PackagingConfigurationHlsManifest(
        @Nullable PackagingConfigurationHlsManifestAdMarkers adMarkers,
        @Nullable Boolean includeIframeOnlyStream,
        @Nullable String manifestName,
        @Nullable Integer programDateTimeIntervalSeconds,
        @Nullable Boolean repeatExtXKey,
        @Nullable PackagingConfigurationStreamSelection streamSelection) {
        this.adMarkers = adMarkers;
        this.includeIframeOnlyStream = includeIframeOnlyStream;
        this.manifestName = manifestName;
        this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
        this.repeatExtXKey = repeatExtXKey;
        this.streamSelection = streamSelection;
    }

    private PackagingConfigurationHlsManifest() {
        this.adMarkers = null;
        this.includeIframeOnlyStream = null;
        this.manifestName = null;
        this.programDateTimeIntervalSeconds = null;
        this.repeatExtXKey = null;
        this.streamSelection = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationHlsManifest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PackagingConfigurationHlsManifestAdMarkers adMarkers;
        private @Nullable Boolean includeIframeOnlyStream;
        private @Nullable String manifestName;
        private @Nullable Integer programDateTimeIntervalSeconds;
        private @Nullable Boolean repeatExtXKey;
        private @Nullable PackagingConfigurationStreamSelection streamSelection;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationHlsManifest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adMarkers = defaults.adMarkers;
    	      this.includeIframeOnlyStream = defaults.includeIframeOnlyStream;
    	      this.manifestName = defaults.manifestName;
    	      this.programDateTimeIntervalSeconds = defaults.programDateTimeIntervalSeconds;
    	      this.repeatExtXKey = defaults.repeatExtXKey;
    	      this.streamSelection = defaults.streamSelection;
        }

        public Builder setAdMarkers(@Nullable PackagingConfigurationHlsManifestAdMarkers adMarkers) {
            this.adMarkers = adMarkers;
            return this;
        }

        public Builder setIncludeIframeOnlyStream(@Nullable Boolean includeIframeOnlyStream) {
            this.includeIframeOnlyStream = includeIframeOnlyStream;
            return this;
        }

        public Builder setManifestName(@Nullable String manifestName) {
            this.manifestName = manifestName;
            return this;
        }

        public Builder setProgramDateTimeIntervalSeconds(@Nullable Integer programDateTimeIntervalSeconds) {
            this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
            return this;
        }

        public Builder setRepeatExtXKey(@Nullable Boolean repeatExtXKey) {
            this.repeatExtXKey = repeatExtXKey;
            return this;
        }

        public Builder setStreamSelection(@Nullable PackagingConfigurationStreamSelection streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }

        public PackagingConfigurationHlsManifest build() {
            return new PackagingConfigurationHlsManifest(adMarkers, includeIframeOnlyStream, manifestName, programDateTimeIntervalSeconds, repeatExtXKey, streamSelection);
        }
    }
}
