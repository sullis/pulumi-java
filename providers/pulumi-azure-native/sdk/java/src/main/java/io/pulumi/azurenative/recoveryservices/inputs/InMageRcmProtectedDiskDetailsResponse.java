// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * InMageRcm protected disk details.
 * 
 */
public final class InMageRcmProtectedDiskDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final InMageRcmProtectedDiskDetailsResponse Empty = new InMageRcmProtectedDiskDetailsResponse();

    /**
     * The disk capacity in bytes.
     * 
     */
    @Import(name="capacityInBytes", required=true)
      private final Double capacityInBytes;

    public Double getCapacityInBytes() {
        return this.capacityInBytes;
    }

    /**
     * The disk encryption set ARM Id.
     * 
     */
    @Import(name="diskEncryptionSetId", required=true)
      private final String diskEncryptionSetId;

    public String getDiskEncryptionSetId() {
        return this.diskEncryptionSetId;
    }

    /**
     * The disk Id.
     * 
     */
    @Import(name="diskId", required=true)
      private final String diskId;

    public String getDiskId() {
        return this.diskId;
    }

    /**
     * The disk name.
     * 
     */
    @Import(name="diskName", required=true)
      private final String diskName;

    public String getDiskName() {
        return this.diskName;
    }

    /**
     * The disk type.
     * 
     */
    @Import(name="diskType", required=true)
      private final String diskType;

    public String getDiskType() {
        return this.diskType;
    }

    /**
     * A value indicating whether the disk is the OS disk.
     * 
     */
    @Import(name="isOSDisk", required=true)
      private final String isOSDisk;

    public String getIsOSDisk() {
        return this.isOSDisk;
    }

    /**
     * The log storage account ARM Id.
     * 
     */
    @Import(name="logStorageAccountId", required=true)
      private final String logStorageAccountId;

    public String getLogStorageAccountId() {
        return this.logStorageAccountId;
    }

    /**
     * The ARM Id of the seed managed disk.
     * 
     */
    @Import(name="seedManagedDiskId", required=true)
      private final String seedManagedDiskId;

    public String getSeedManagedDiskId() {
        return this.seedManagedDiskId;
    }

    /**
     * The ARM Id of the target managed disk.
     * 
     */
    @Import(name="targetManagedDiskId", required=true)
      private final String targetManagedDiskId;

    public String getTargetManagedDiskId() {
        return this.targetManagedDiskId;
    }

    public InMageRcmProtectedDiskDetailsResponse(
        Double capacityInBytes,
        String diskEncryptionSetId,
        String diskId,
        String diskName,
        String diskType,
        String isOSDisk,
        String logStorageAccountId,
        String seedManagedDiskId,
        String targetManagedDiskId) {
        this.capacityInBytes = Objects.requireNonNull(capacityInBytes, "expected parameter 'capacityInBytes' to be non-null");
        this.diskEncryptionSetId = Objects.requireNonNull(diskEncryptionSetId, "expected parameter 'diskEncryptionSetId' to be non-null");
        this.diskId = Objects.requireNonNull(diskId, "expected parameter 'diskId' to be non-null");
        this.diskName = Objects.requireNonNull(diskName, "expected parameter 'diskName' to be non-null");
        this.diskType = Objects.requireNonNull(diskType, "expected parameter 'diskType' to be non-null");
        this.isOSDisk = Objects.requireNonNull(isOSDisk, "expected parameter 'isOSDisk' to be non-null");
        this.logStorageAccountId = Objects.requireNonNull(logStorageAccountId, "expected parameter 'logStorageAccountId' to be non-null");
        this.seedManagedDiskId = Objects.requireNonNull(seedManagedDiskId, "expected parameter 'seedManagedDiskId' to be non-null");
        this.targetManagedDiskId = Objects.requireNonNull(targetManagedDiskId, "expected parameter 'targetManagedDiskId' to be non-null");
    }

    private InMageRcmProtectedDiskDetailsResponse() {
        this.capacityInBytes = null;
        this.diskEncryptionSetId = null;
        this.diskId = null;
        this.diskName = null;
        this.diskType = null;
        this.isOSDisk = null;
        this.logStorageAccountId = null;
        this.seedManagedDiskId = null;
        this.targetManagedDiskId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageRcmProtectedDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double capacityInBytes;
        private String diskEncryptionSetId;
        private String diskId;
        private String diskName;
        private String diskType;
        private String isOSDisk;
        private String logStorageAccountId;
        private String seedManagedDiskId;
        private String targetManagedDiskId;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageRcmProtectedDiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityInBytes = defaults.capacityInBytes;
    	      this.diskEncryptionSetId = defaults.diskEncryptionSetId;
    	      this.diskId = defaults.diskId;
    	      this.diskName = defaults.diskName;
    	      this.diskType = defaults.diskType;
    	      this.isOSDisk = defaults.isOSDisk;
    	      this.logStorageAccountId = defaults.logStorageAccountId;
    	      this.seedManagedDiskId = defaults.seedManagedDiskId;
    	      this.targetManagedDiskId = defaults.targetManagedDiskId;
        }

        public Builder capacityInBytes(Double capacityInBytes) {
            this.capacityInBytes = Objects.requireNonNull(capacityInBytes);
            return this;
        }
        public Builder diskEncryptionSetId(String diskEncryptionSetId) {
            this.diskEncryptionSetId = Objects.requireNonNull(diskEncryptionSetId);
            return this;
        }
        public Builder diskId(String diskId) {
            this.diskId = Objects.requireNonNull(diskId);
            return this;
        }
        public Builder diskName(String diskName) {
            this.diskName = Objects.requireNonNull(diskName);
            return this;
        }
        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }
        public Builder isOSDisk(String isOSDisk) {
            this.isOSDisk = Objects.requireNonNull(isOSDisk);
            return this;
        }
        public Builder logStorageAccountId(String logStorageAccountId) {
            this.logStorageAccountId = Objects.requireNonNull(logStorageAccountId);
            return this;
        }
        public Builder seedManagedDiskId(String seedManagedDiskId) {
            this.seedManagedDiskId = Objects.requireNonNull(seedManagedDiskId);
            return this;
        }
        public Builder targetManagedDiskId(String targetManagedDiskId) {
            this.targetManagedDiskId = Objects.requireNonNull(targetManagedDiskId);
            return this;
        }        public InMageRcmProtectedDiskDetailsResponse build() {
            return new InMageRcmProtectedDiskDetailsResponse(capacityInBytes, diskEncryptionSetId, diskId, diskName, diskType, isOSDisk, logStorageAccountId, seedManagedDiskId, targetManagedDiskId);
        }
    }
}
