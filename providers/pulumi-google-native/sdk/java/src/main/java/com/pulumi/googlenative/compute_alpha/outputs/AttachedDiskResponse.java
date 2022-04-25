// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.AttachedDiskInitializeParamsResponse;
import com.pulumi.googlenative.compute_alpha.outputs.CustomerEncryptionKeyResponse;
import com.pulumi.googlenative.compute_alpha.outputs.GuestOsFeatureResponse;
import com.pulumi.googlenative.compute_alpha.outputs.InitialStateConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AttachedDiskResponse {
    /**
     * @return Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    private final Boolean autoDelete;
    /**
     * @return Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    private final Boolean boot;
    /**
     * @return Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
     * 
     */
    private final String deviceName;
    /**
     * @return Encrypts or decrypts a disk using a customer-supplied encryption key. If you are creating a new disk, this field encrypts the new disk using an encryption key that you provide. If you are attaching an existing disk that is already encrypted, this field decrypts the disk using the customer-supplied encryption key. If you encrypt a disk using a customer-supplied key, you must provide the same key again when you attempt to use this resource at a later time. For example, you must provide the key when you create a snapshot or an image from the disk or when you attach the disk to a virtual machine instance. If you do not provide an encryption key, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later. Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt disks in a managed instance group.
     * 
     */
    private final CustomerEncryptionKeyResponse diskEncryptionKey;
    /**
     * @return The size of the disk in GB.
     * 
     */
    private final String diskSizeGb;
    /**
     * @return [Input Only] Whether to force attach the regional disk even if it&#39;s currently attached to another instance. If you try to force attach a zonal disk to an instance, you will receive an error.
     * 
     */
    private final Boolean forceAttach;
    /**
     * @return A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    private final List<GuestOsFeatureResponse> guestOsFeatures;
    /**
     * @return A zero-based index to this disk, where 0 is reserved for the boot disk. If you have many disks attached to an instance, each disk would have a unique index number.
     * 
     */
    private final Integer index;
    /**
     * @return [Input Only] Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
     * 
     */
    private final AttachedDiskInitializeParamsResponse initializeParams;
    /**
     * @return Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * 
     */
    private final String interface_;
    /**
     * @return Type of the resource. Always compute#attachedDisk for attached disks.
     * 
     */
    private final String kind;
    /**
     * @return Any valid publicly visible licenses.
     * 
     */
    private final List<String> licenses;
    /**
     * @return Whether to indicate the attached disk is locked. The locked disk is not allowed to be detached from the instance, or to be used as the source of the snapshot creation, and the image creation. The instance with at least one locked attached disk is not allow to be used as source of machine image creation, instant snapshot creation, and not allowed to be deleted with --keep-disk parameter set to true for locked disks.
     * 
     */
    private final Boolean locked;
    /**
     * @return The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode.
     * 
     */
    private final String mode;
    /**
     * @return For LocalSSD disks on VM Instances in STOPPED or SUSPENDED state, this field is set to PRESERVED if the LocalSSD data has been saved to a persistent location by customer request. (see the discard_local_ssd option on Stop/Suspend). Read-only in the api.
     * 
     */
    private final String savedState;
    /**
     * @return shielded vm initial state stored on disk
     * 
     */
    private final InitialStateConfigResponse shieldedInstanceInitialState;
    /**
     * @return Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. If desired, you can also attach existing non-root persistent disks using this property. This field is only applicable for persistent disks. Note that for InstanceTemplate, specify the disk name for zonal disk, and the URL for regional disk.
     * 
     */
    private final String source;
    /**
     * @return Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT.
     * 
     */
    private final String type;
    /**
     * @return A list of user provided licenses. It represents a list of URLs to the license resource. Unlike regular licenses, user provided licenses can be modified after the disk is created.
     * 
     */
    private final List<String> userLicenses;

    @CustomType.Constructor
    private AttachedDiskResponse(
        @CustomType.Parameter("autoDelete") Boolean autoDelete,
        @CustomType.Parameter("boot") Boolean boot,
        @CustomType.Parameter("deviceName") String deviceName,
        @CustomType.Parameter("diskEncryptionKey") CustomerEncryptionKeyResponse diskEncryptionKey,
        @CustomType.Parameter("diskSizeGb") String diskSizeGb,
        @CustomType.Parameter("forceAttach") Boolean forceAttach,
        @CustomType.Parameter("guestOsFeatures") List<GuestOsFeatureResponse> guestOsFeatures,
        @CustomType.Parameter("index") Integer index,
        @CustomType.Parameter("initializeParams") AttachedDiskInitializeParamsResponse initializeParams,
        @CustomType.Parameter("interface") String interface_,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("licenses") List<String> licenses,
        @CustomType.Parameter("locked") Boolean locked,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("savedState") String savedState,
        @CustomType.Parameter("shieldedInstanceInitialState") InitialStateConfigResponse shieldedInstanceInitialState,
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userLicenses") List<String> userLicenses) {
        this.autoDelete = autoDelete;
        this.boot = boot;
        this.deviceName = deviceName;
        this.diskEncryptionKey = diskEncryptionKey;
        this.diskSizeGb = diskSizeGb;
        this.forceAttach = forceAttach;
        this.guestOsFeatures = guestOsFeatures;
        this.index = index;
        this.initializeParams = initializeParams;
        this.interface_ = interface_;
        this.kind = kind;
        this.licenses = licenses;
        this.locked = locked;
        this.mode = mode;
        this.savedState = savedState;
        this.shieldedInstanceInitialState = shieldedInstanceInitialState;
        this.source = source;
        this.type = type;
        this.userLicenses = userLicenses;
    }

    /**
     * @return Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    public Boolean autoDelete() {
        return this.autoDelete;
    }
    /**
     * @return Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    public Boolean boot() {
        return this.boot;
    }
    /**
     * @return Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return Encrypts or decrypts a disk using a customer-supplied encryption key. If you are creating a new disk, this field encrypts the new disk using an encryption key that you provide. If you are attaching an existing disk that is already encrypted, this field decrypts the disk using the customer-supplied encryption key. If you encrypt a disk using a customer-supplied key, you must provide the same key again when you attempt to use this resource at a later time. For example, you must provide the key when you create a snapshot or an image from the disk or when you attach the disk to a virtual machine instance. If you do not provide an encryption key, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later. Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt disks in a managed instance group.
     * 
     */
    public CustomerEncryptionKeyResponse diskEncryptionKey() {
        return this.diskEncryptionKey;
    }
    /**
     * @return The size of the disk in GB.
     * 
     */
    public String diskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * @return [Input Only] Whether to force attach the regional disk even if it&#39;s currently attached to another instance. If you try to force attach a zonal disk to an instance, you will receive an error.
     * 
     */
    public Boolean forceAttach() {
        return this.forceAttach;
    }
    /**
     * @return A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    public List<GuestOsFeatureResponse> guestOsFeatures() {
        return this.guestOsFeatures;
    }
    /**
     * @return A zero-based index to this disk, where 0 is reserved for the boot disk. If you have many disks attached to an instance, each disk would have a unique index number.
     * 
     */
    public Integer index() {
        return this.index;
    }
    /**
     * @return [Input Only] Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
     * 
     */
    public AttachedDiskInitializeParamsResponse initializeParams() {
        return this.initializeParams;
    }
    /**
     * @return Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * 
     */
    public String interface_() {
        return this.interface_;
    }
    /**
     * @return Type of the resource. Always compute#attachedDisk for attached disks.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Any valid publicly visible licenses.
     * 
     */
    public List<String> licenses() {
        return this.licenses;
    }
    /**
     * @return Whether to indicate the attached disk is locked. The locked disk is not allowed to be detached from the instance, or to be used as the source of the snapshot creation, and the image creation. The instance with at least one locked attached disk is not allow to be used as source of machine image creation, instant snapshot creation, and not allowed to be deleted with --keep-disk parameter set to true for locked disks.
     * 
     */
    public Boolean locked() {
        return this.locked;
    }
    /**
     * @return The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode.
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return For LocalSSD disks on VM Instances in STOPPED or SUSPENDED state, this field is set to PRESERVED if the LocalSSD data has been saved to a persistent location by customer request. (see the discard_local_ssd option on Stop/Suspend). Read-only in the api.
     * 
     */
    public String savedState() {
        return this.savedState;
    }
    /**
     * @return shielded vm initial state stored on disk
     * 
     */
    public InitialStateConfigResponse shieldedInstanceInitialState() {
        return this.shieldedInstanceInitialState;
    }
    /**
     * @return Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. If desired, you can also attach existing non-root persistent disks using this property. This field is only applicable for persistent disks. Note that for InstanceTemplate, specify the disk name for zonal disk, and the URL for regional disk.
     * 
     */
    public String source() {
        return this.source;
    }
    /**
     * @return Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return A list of user provided licenses. It represents a list of URLs to the license resource. Unlike regular licenses, user provided licenses can be modified after the disk is created.
     * 
     */
    public List<String> userLicenses() {
        return this.userLicenses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoDelete;
        private Boolean boot;
        private String deviceName;
        private CustomerEncryptionKeyResponse diskEncryptionKey;
        private String diskSizeGb;
        private Boolean forceAttach;
        private List<GuestOsFeatureResponse> guestOsFeatures;
        private Integer index;
        private AttachedDiskInitializeParamsResponse initializeParams;
        private String interface_;
        private String kind;
        private List<String> licenses;
        private Boolean locked;
        private String mode;
        private String savedState;
        private InitialStateConfigResponse shieldedInstanceInitialState;
        private String source;
        private String type;
        private List<String> userLicenses;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachedDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.forceAttach = defaults.forceAttach;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.index = defaults.index;
    	      this.initializeParams = defaults.initializeParams;
    	      this.interface_ = defaults.interface_;
    	      this.kind = defaults.kind;
    	      this.licenses = defaults.licenses;
    	      this.locked = defaults.locked;
    	      this.mode = defaults.mode;
    	      this.savedState = defaults.savedState;
    	      this.shieldedInstanceInitialState = defaults.shieldedInstanceInitialState;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
    	      this.userLicenses = defaults.userLicenses;
        }

        public Builder autoDelete(Boolean autoDelete) {
            this.autoDelete = Objects.requireNonNull(autoDelete);
            return this;
        }
        public Builder boot(Boolean boot) {
            this.boot = Objects.requireNonNull(boot);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder diskEncryptionKey(CustomerEncryptionKeyResponse diskEncryptionKey) {
            this.diskEncryptionKey = Objects.requireNonNull(diskEncryptionKey);
            return this;
        }
        public Builder diskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder forceAttach(Boolean forceAttach) {
            this.forceAttach = Objects.requireNonNull(forceAttach);
            return this;
        }
        public Builder guestOsFeatures(List<GuestOsFeatureResponse> guestOsFeatures) {
            this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures);
            return this;
        }
        public Builder guestOsFeatures(GuestOsFeatureResponse... guestOsFeatures) {
            return guestOsFeatures(List.of(guestOsFeatures));
        }
        public Builder index(Integer index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }
        public Builder initializeParams(AttachedDiskInitializeParamsResponse initializeParams) {
            this.initializeParams = Objects.requireNonNull(initializeParams);
            return this;
        }
        public Builder interface_(String interface_) {
            this.interface_ = Objects.requireNonNull(interface_);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder licenses(List<String> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }
        public Builder licenses(String... licenses) {
            return licenses(List.of(licenses));
        }
        public Builder locked(Boolean locked) {
            this.locked = Objects.requireNonNull(locked);
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder savedState(String savedState) {
            this.savedState = Objects.requireNonNull(savedState);
            return this;
        }
        public Builder shieldedInstanceInitialState(InitialStateConfigResponse shieldedInstanceInitialState) {
            this.shieldedInstanceInitialState = Objects.requireNonNull(shieldedInstanceInitialState);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userLicenses(List<String> userLicenses) {
            this.userLicenses = Objects.requireNonNull(userLicenses);
            return this;
        }
        public Builder userLicenses(String... userLicenses) {
            return userLicenses(List.of(userLicenses));
        }        public AttachedDiskResponse build() {
            return new AttachedDiskResponse(autoDelete, boot, deviceName, diskEncryptionKey, diskSizeGb, forceAttach, guestOsFeatures, index, initializeParams, interface_, kind, licenses, locked, mode, savedState, shieldedInstanceInitialState, source, type, userLicenses);
        }
    }
}
