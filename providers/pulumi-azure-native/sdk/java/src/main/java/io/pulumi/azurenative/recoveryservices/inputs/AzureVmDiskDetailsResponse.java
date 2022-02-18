// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Disk details for E2A provider.
 * 
 */
public final class AzureVmDiskDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureVmDiskDetailsResponse Empty = new AzureVmDiskDetailsResponse();

    /**
     * The DiskEncryptionSet ARM ID.
     * 
     */
    @InputImport(name="diskEncryptionSetId")
    private final @Nullable String diskEncryptionSetId;

    public Optional<String> getDiskEncryptionSetId() {
        return this.diskEncryptionSetId == null ? Optional.empty() : Optional.ofNullable(this.diskEncryptionSetId);
    }

    /**
     * The disk resource id.
     * 
     */
    @InputImport(name="diskId")
    private final @Nullable String diskId;

    public Optional<String> getDiskId() {
        return this.diskId == null ? Optional.empty() : Optional.ofNullable(this.diskId);
    }

    /**
     * Ordinal\LunId of the disk for the Azure VM.
     * 
     */
    @InputImport(name="lunId")
    private final @Nullable String lunId;

    public Optional<String> getLunId() {
        return this.lunId == null ? Optional.empty() : Optional.ofNullable(this.lunId);
    }

    /**
     * Max side in MB.
     * 
     */
    @InputImport(name="maxSizeMB")
    private final @Nullable String maxSizeMB;

    public Optional<String> getMaxSizeMB() {
        return this.maxSizeMB == null ? Optional.empty() : Optional.ofNullable(this.maxSizeMB);
    }

    /**
     * Blob uri of the Azure disk.
     * 
     */
    @InputImport(name="targetDiskLocation")
    private final @Nullable String targetDiskLocation;

    public Optional<String> getTargetDiskLocation() {
        return this.targetDiskLocation == null ? Optional.empty() : Optional.ofNullable(this.targetDiskLocation);
    }

    /**
     * The target Azure disk name.
     * 
     */
    @InputImport(name="targetDiskName")
    private final @Nullable String targetDiskName;

    public Optional<String> getTargetDiskName() {
        return this.targetDiskName == null ? Optional.empty() : Optional.ofNullable(this.targetDiskName);
    }

    /**
     * The VHD id.
     * 
     */
    @InputImport(name="vhdId")
    private final @Nullable String vhdId;

    public Optional<String> getVhdId() {
        return this.vhdId == null ? Optional.empty() : Optional.ofNullable(this.vhdId);
    }

    /**
     * VHD name.
     * 
     */
    @InputImport(name="vhdName")
    private final @Nullable String vhdName;

    public Optional<String> getVhdName() {
        return this.vhdName == null ? Optional.empty() : Optional.ofNullable(this.vhdName);
    }

    /**
     * VHD type.
     * 
     */
    @InputImport(name="vhdType")
    private final @Nullable String vhdType;

    public Optional<String> getVhdType() {
        return this.vhdType == null ? Optional.empty() : Optional.ofNullable(this.vhdType);
    }

    public AzureVmDiskDetailsResponse(
        @Nullable String diskEncryptionSetId,
        @Nullable String diskId,
        @Nullable String lunId,
        @Nullable String maxSizeMB,
        @Nullable String targetDiskLocation,
        @Nullable String targetDiskName,
        @Nullable String vhdId,
        @Nullable String vhdName,
        @Nullable String vhdType) {
        this.diskEncryptionSetId = diskEncryptionSetId;
        this.diskId = diskId;
        this.lunId = lunId;
        this.maxSizeMB = maxSizeMB;
        this.targetDiskLocation = targetDiskLocation;
        this.targetDiskName = targetDiskName;
        this.vhdId = vhdId;
        this.vhdName = vhdName;
        this.vhdType = vhdType;
    }

    private AzureVmDiskDetailsResponse() {
        this.diskEncryptionSetId = null;
        this.diskId = null;
        this.lunId = null;
        this.maxSizeMB = null;
        this.targetDiskLocation = null;
        this.targetDiskName = null;
        this.vhdId = null;
        this.vhdName = null;
        this.vhdType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureVmDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String diskEncryptionSetId;
        private @Nullable String diskId;
        private @Nullable String lunId;
        private @Nullable String maxSizeMB;
        private @Nullable String targetDiskLocation;
        private @Nullable String targetDiskName;
        private @Nullable String vhdId;
        private @Nullable String vhdName;
        private @Nullable String vhdType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureVmDiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionSetId = defaults.diskEncryptionSetId;
    	      this.diskId = defaults.diskId;
    	      this.lunId = defaults.lunId;
    	      this.maxSizeMB = defaults.maxSizeMB;
    	      this.targetDiskLocation = defaults.targetDiskLocation;
    	      this.targetDiskName = defaults.targetDiskName;
    	      this.vhdId = defaults.vhdId;
    	      this.vhdName = defaults.vhdName;
    	      this.vhdType = defaults.vhdType;
        }

        public Builder setDiskEncryptionSetId(@Nullable String diskEncryptionSetId) {
            this.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }

        public Builder setDiskId(@Nullable String diskId) {
            this.diskId = diskId;
            return this;
        }

        public Builder setLunId(@Nullable String lunId) {
            this.lunId = lunId;
            return this;
        }

        public Builder setMaxSizeMB(@Nullable String maxSizeMB) {
            this.maxSizeMB = maxSizeMB;
            return this;
        }

        public Builder setTargetDiskLocation(@Nullable String targetDiskLocation) {
            this.targetDiskLocation = targetDiskLocation;
            return this;
        }

        public Builder setTargetDiskName(@Nullable String targetDiskName) {
            this.targetDiskName = targetDiskName;
            return this;
        }

        public Builder setVhdId(@Nullable String vhdId) {
            this.vhdId = vhdId;
            return this;
        }

        public Builder setVhdName(@Nullable String vhdName) {
            this.vhdName = vhdName;
            return this;
        }

        public Builder setVhdType(@Nullable String vhdType) {
            this.vhdType = vhdType;
            return this;
        }

        public AzureVmDiskDetailsResponse build() {
            return new AzureVmDiskDetailsResponse(diskEncryptionSetId, diskId, lunId, maxSizeMB, targetDiskLocation, targetDiskName, vhdId, vhdName, vhdType);
        }
    }
}
