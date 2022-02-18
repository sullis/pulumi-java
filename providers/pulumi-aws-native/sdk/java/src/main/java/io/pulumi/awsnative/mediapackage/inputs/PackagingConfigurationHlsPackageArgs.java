// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationHlsEncryptionArgs;
import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationHlsManifestArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An HTTP Live Streaming (HLS) packaging configuration.
 * 
 */
public final class PackagingConfigurationHlsPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackagingConfigurationHlsPackageArgs Empty = new PackagingConfigurationHlsPackageArgs();

    @InputImport(name="encryption")
    private final @Nullable Input<PackagingConfigurationHlsEncryptionArgs> encryption;

    public Input<PackagingConfigurationHlsEncryptionArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    /**
     * A list of HLS manifest configurations.
     * 
     */
    @InputImport(name="hlsManifests", required=true)
    private final Input<List<PackagingConfigurationHlsManifestArgs>> hlsManifests;

    public Input<List<PackagingConfigurationHlsManifestArgs>> getHlsManifests() {
        return this.hlsManifests;
    }

    @InputImport(name="segmentDurationSeconds")
    private final @Nullable Input<Integer> segmentDurationSeconds;

    public Input<Integer> getSegmentDurationSeconds() {
        return this.segmentDurationSeconds == null ? Input.empty() : this.segmentDurationSeconds;
    }

    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     * 
     */
    @InputImport(name="useAudioRenditionGroup")
    private final @Nullable Input<Boolean> useAudioRenditionGroup;

    public Input<Boolean> getUseAudioRenditionGroup() {
        return this.useAudioRenditionGroup == null ? Input.empty() : this.useAudioRenditionGroup;
    }

    public PackagingConfigurationHlsPackageArgs(
        @Nullable Input<PackagingConfigurationHlsEncryptionArgs> encryption,
        Input<List<PackagingConfigurationHlsManifestArgs>> hlsManifests,
        @Nullable Input<Integer> segmentDurationSeconds,
        @Nullable Input<Boolean> useAudioRenditionGroup) {
        this.encryption = encryption;
        this.hlsManifests = Objects.requireNonNull(hlsManifests, "expected parameter 'hlsManifests' to be non-null");
        this.segmentDurationSeconds = segmentDurationSeconds;
        this.useAudioRenditionGroup = useAudioRenditionGroup;
    }

    private PackagingConfigurationHlsPackageArgs() {
        this.encryption = Input.empty();
        this.hlsManifests = Input.empty();
        this.segmentDurationSeconds = Input.empty();
        this.useAudioRenditionGroup = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationHlsPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PackagingConfigurationHlsEncryptionArgs> encryption;
        private Input<List<PackagingConfigurationHlsManifestArgs>> hlsManifests;
        private @Nullable Input<Integer> segmentDurationSeconds;
        private @Nullable Input<Boolean> useAudioRenditionGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationHlsPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.hlsManifests = defaults.hlsManifests;
    	      this.segmentDurationSeconds = defaults.segmentDurationSeconds;
    	      this.useAudioRenditionGroup = defaults.useAudioRenditionGroup;
        }

        public Builder setEncryption(@Nullable Input<PackagingConfigurationHlsEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setEncryption(@Nullable PackagingConfigurationHlsEncryptionArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder setHlsManifests(Input<List<PackagingConfigurationHlsManifestArgs>> hlsManifests) {
            this.hlsManifests = Objects.requireNonNull(hlsManifests);
            return this;
        }

        public Builder setHlsManifests(List<PackagingConfigurationHlsManifestArgs> hlsManifests) {
            this.hlsManifests = Input.of(Objects.requireNonNull(hlsManifests));
            return this;
        }

        public Builder setSegmentDurationSeconds(@Nullable Input<Integer> segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }

        public Builder setSegmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = Input.ofNullable(segmentDurationSeconds);
            return this;
        }

        public Builder setUseAudioRenditionGroup(@Nullable Input<Boolean> useAudioRenditionGroup) {
            this.useAudioRenditionGroup = useAudioRenditionGroup;
            return this;
        }

        public Builder setUseAudioRenditionGroup(@Nullable Boolean useAudioRenditionGroup) {
            this.useAudioRenditionGroup = Input.ofNullable(useAudioRenditionGroup);
            return this;
        }

        public PackagingConfigurationHlsPackageArgs build() {
            return new PackagingConfigurationHlsPackageArgs(encryption, hlsManifests, segmentDurationSeconds, useAudioRenditionGroup);
        }
    }
}
