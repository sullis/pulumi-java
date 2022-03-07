// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Volume details using the backup policy
 * 
 */
public final class VolumeBackupsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VolumeBackupsResponse Empty = new VolumeBackupsResponse();

    /**
     * Total count of backups for volume
     * 
     */
    @InputImport(name="backupsCount")
      private final @Nullable Integer backupsCount;

    public Optional<Integer> getBackupsCount() {
        return this.backupsCount == null ? Optional.empty() : Optional.ofNullable(this.backupsCount);
    }

    /**
     * Policy enabled
     * 
     */
    @InputImport(name="policyEnabled")
      private final @Nullable Boolean policyEnabled;

    public Optional<Boolean> getPolicyEnabled() {
        return this.policyEnabled == null ? Optional.empty() : Optional.ofNullable(this.policyEnabled);
    }

    /**
     * Volume name
     * 
     */
    @InputImport(name="volumeName")
      private final @Nullable String volumeName;

    public Optional<String> getVolumeName() {
        return this.volumeName == null ? Optional.empty() : Optional.ofNullable(this.volumeName);
    }

    public VolumeBackupsResponse(
        @Nullable Integer backupsCount,
        @Nullable Boolean policyEnabled,
        @Nullable String volumeName) {
        this.backupsCount = backupsCount;
        this.policyEnabled = policyEnabled;
        this.volumeName = volumeName;
    }

    private VolumeBackupsResponse() {
        this.backupsCount = null;
        this.policyEnabled = null;
        this.volumeName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeBackupsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer backupsCount;
        private @Nullable Boolean policyEnabled;
        private @Nullable String volumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeBackupsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupsCount = defaults.backupsCount;
    	      this.policyEnabled = defaults.policyEnabled;
    	      this.volumeName = defaults.volumeName;
        }

        public Builder setBackupsCount(@Nullable Integer backupsCount) {
            this.backupsCount = backupsCount;
            return this;
        }

        public Builder setPolicyEnabled(@Nullable Boolean policyEnabled) {
            this.policyEnabled = policyEnabled;
            return this;
        }

        public Builder setVolumeName(@Nullable String volumeName) {
            this.volumeName = volumeName;
            return this;
        }
        public VolumeBackupsResponse build() {
            return new VolumeBackupsResponse(backupsCount, policyEnabled, volumeName);
        }
    }
}