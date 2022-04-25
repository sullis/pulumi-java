// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InMageRcmProtectedDiskDetailsResponse {
    /**
     * @return The disk capacity in bytes.
     * 
     */
    private final Double capacityInBytes;
    /**
     * @return The disk encryption set ARM Id.
     * 
     */
    private final String diskEncryptionSetId;
    /**
     * @return The disk Id.
     * 
     */
    private final String diskId;
    /**
     * @return The disk name.
     * 
     */
    private final String diskName;
    /**
     * @return The disk type.
     * 
     */
    private final String diskType;
    /**
     * @return A value indicating whether the disk is the OS disk.
     * 
     */
    private final String isOSDisk;
    /**
     * @return The log storage account ARM Id.
     * 
     */
    private final String logStorageAccountId;
    /**
     * @return The ARM Id of the seed managed disk.
     * 
     */
    private final String seedManagedDiskId;
    /**
     * @return The ARM Id of the target managed disk.
     * 
     */
    private final String targetManagedDiskId;

    @CustomType.Constructor
    private InMageRcmProtectedDiskDetailsResponse(
        @CustomType.Parameter("capacityInBytes") Double capacityInBytes,
        @CustomType.Parameter("diskEncryptionSetId") String diskEncryptionSetId,
        @CustomType.Parameter("diskId") String diskId,
        @CustomType.Parameter("diskName") String diskName,
        @CustomType.Parameter("diskType") String diskType,
        @CustomType.Parameter("isOSDisk") String isOSDisk,
        @CustomType.Parameter("logStorageAccountId") String logStorageAccountId,
        @CustomType.Parameter("seedManagedDiskId") String seedManagedDiskId,
        @CustomType.Parameter("targetManagedDiskId") String targetManagedDiskId) {
        this.capacityInBytes = capacityInBytes;
        this.diskEncryptionSetId = diskEncryptionSetId;
        this.diskId = diskId;
        this.diskName = diskName;
        this.diskType = diskType;
        this.isOSDisk = isOSDisk;
        this.logStorageAccountId = logStorageAccountId;
        this.seedManagedDiskId = seedManagedDiskId;
        this.targetManagedDiskId = targetManagedDiskId;
    }

    /**
     * @return The disk capacity in bytes.
     * 
     */
    public Double capacityInBytes() {
        return this.capacityInBytes;
    }
    /**
     * @return The disk encryption set ARM Id.
     * 
     */
    public String diskEncryptionSetId() {
        return this.diskEncryptionSetId;
    }
    /**
     * @return The disk Id.
     * 
     */
    public String diskId() {
        return this.diskId;
    }
    /**
     * @return The disk name.
     * 
     */
    public String diskName() {
        return this.diskName;
    }
    /**
     * @return The disk type.
     * 
     */
    public String diskType() {
        return this.diskType;
    }
    /**
     * @return A value indicating whether the disk is the OS disk.
     * 
     */
    public String isOSDisk() {
        return this.isOSDisk;
    }
    /**
     * @return The log storage account ARM Id.
     * 
     */
    public String logStorageAccountId() {
        return this.logStorageAccountId;
    }
    /**
     * @return The ARM Id of the seed managed disk.
     * 
     */
    public String seedManagedDiskId() {
        return this.seedManagedDiskId;
    }
    /**
     * @return The ARM Id of the target managed disk.
     * 
     */
    public String targetManagedDiskId() {
        return this.targetManagedDiskId;
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
