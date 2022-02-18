// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VolumeFailoverMetadataResponse {
    /**
     * The date at which the snapshot was taken.
     * 
     */
    private final @Nullable String backupCreatedDate;
    /**
     * The path ID of the backup-element for this volume, inside the backup set.
     * 
     */
    private final @Nullable String backupElementId;
    /**
     * The path ID of the backup set.
     * 
     */
    private final @Nullable String backupId;
    /**
     * The path ID of the backup policy using which the snapshot was taken.
     * 
     */
    private final @Nullable String backupPolicyId;
    /**
     * The size of the volume in bytes at the time the snapshot was taken.
     * 
     */
    private final @Nullable Double sizeInBytes;
    /**
     * The path ID of the volume.
     * 
     */
    private final @Nullable String volumeId;
    /**
     * The type of the volume.
     * 
     */
    private final @Nullable String volumeType;

    @OutputCustomType.Constructor({"backupCreatedDate","backupElementId","backupId","backupPolicyId","sizeInBytes","volumeId","volumeType"})
    private VolumeFailoverMetadataResponse(
        @Nullable String backupCreatedDate,
        @Nullable String backupElementId,
        @Nullable String backupId,
        @Nullable String backupPolicyId,
        @Nullable Double sizeInBytes,
        @Nullable String volumeId,
        @Nullable String volumeType) {
        this.backupCreatedDate = backupCreatedDate;
        this.backupElementId = backupElementId;
        this.backupId = backupId;
        this.backupPolicyId = backupPolicyId;
        this.sizeInBytes = sizeInBytes;
        this.volumeId = volumeId;
        this.volumeType = volumeType;
    }

    /**
     * The date at which the snapshot was taken.
     * 
     */
    public Optional<String> getBackupCreatedDate() {
        return Optional.ofNullable(this.backupCreatedDate);
    }
    /**
     * The path ID of the backup-element for this volume, inside the backup set.
     * 
     */
    public Optional<String> getBackupElementId() {
        return Optional.ofNullable(this.backupElementId);
    }
    /**
     * The path ID of the backup set.
     * 
     */
    public Optional<String> getBackupId() {
        return Optional.ofNullable(this.backupId);
    }
    /**
     * The path ID of the backup policy using which the snapshot was taken.
     * 
     */
    public Optional<String> getBackupPolicyId() {
        return Optional.ofNullable(this.backupPolicyId);
    }
    /**
     * The size of the volume in bytes at the time the snapshot was taken.
     * 
     */
    public Optional<Double> getSizeInBytes() {
        return Optional.ofNullable(this.sizeInBytes);
    }
    /**
     * The path ID of the volume.
     * 
     */
    public Optional<String> getVolumeId() {
        return Optional.ofNullable(this.volumeId);
    }
    /**
     * The type of the volume.
     * 
     */
    public Optional<String> getVolumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeFailoverMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupCreatedDate;
        private @Nullable String backupElementId;
        private @Nullable String backupId;
        private @Nullable String backupPolicyId;
        private @Nullable Double sizeInBytes;
        private @Nullable String volumeId;
        private @Nullable String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeFailoverMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupCreatedDate = defaults.backupCreatedDate;
    	      this.backupElementId = defaults.backupElementId;
    	      this.backupId = defaults.backupId;
    	      this.backupPolicyId = defaults.backupPolicyId;
    	      this.sizeInBytes = defaults.sizeInBytes;
    	      this.volumeId = defaults.volumeId;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setBackupCreatedDate(@Nullable String backupCreatedDate) {
            this.backupCreatedDate = backupCreatedDate;
            return this;
        }

        public Builder setBackupElementId(@Nullable String backupElementId) {
            this.backupElementId = backupElementId;
            return this;
        }

        public Builder setBackupId(@Nullable String backupId) {
            this.backupId = backupId;
            return this;
        }

        public Builder setBackupPolicyId(@Nullable String backupPolicyId) {
            this.backupPolicyId = backupPolicyId;
            return this;
        }

        public Builder setSizeInBytes(@Nullable Double sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            return this;
        }

        public Builder setVolumeId(@Nullable String volumeId) {
            this.volumeId = volumeId;
            return this;
        }

        public Builder setVolumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }

        public VolumeFailoverMetadataResponse build() {
            return new VolumeFailoverMetadataResponse(backupCreatedDate, backupElementId, backupId, backupPolicyId, sizeInBytes, volumeId, volumeType);
        }
    }
}
