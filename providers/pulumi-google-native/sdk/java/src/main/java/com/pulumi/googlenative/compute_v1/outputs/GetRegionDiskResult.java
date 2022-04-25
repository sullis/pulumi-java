// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_v1.outputs.CustomerEncryptionKeyResponse;
import com.pulumi.googlenative.compute_v1.outputs.GuestOsFeatureResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRegionDiskResult {
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return Encrypts the disk using a customer-supplied encryption key or a customer-managed encryption key. Encryption keys do not protect access to metadata of the disk. After you encrypt a disk with a customer-supplied key, you must provide the same key if you use the disk later. For example, to create a disk snapshot, to create a disk image, to create a machine image, or to attach the disk to a virtual machine. After you encrypt a disk with a customer-managed key, the diskEncryptionKey.kmsKeyName is set to a key *version* name once the disk is created. The disk is encrypted with this version of the key. In the response, diskEncryptionKey.kmsKeyName appears in the following format: &#34;diskEncryptionKey.kmsKeyName&#34;: &#34;projects/kms_project_id/locations/region/keyRings/ key_region/cryptoKeys/key /cryptoKeysVersions/version If you do not provide an encryption key when creating the disk, then the disk is encrypted using an automatically generated key and you don&#39;t need to provide a key to use the disk later.
     * 
     */
    private final CustomerEncryptionKeyResponse diskEncryptionKey;
    /**
     * @return A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    private final List<GuestOsFeatureResponse> guestOsFeatures;
    /**
     * @return Type of the resource. Always compute#disk for disks.
     * 
     */
    private final String kind;
    /**
     * @return A fingerprint for the labels being applied to this disk, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a disk.
     * 
     */
    private final String labelFingerprint;
    /**
     * @return Labels to apply to this disk. These can be later modified by the setLabels method.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Last attach timestamp in RFC3339 text format.
     * 
     */
    private final String lastAttachTimestamp;
    /**
     * @return Last detach timestamp in RFC3339 text format.
     * 
     */
    private final String lastDetachTimestamp;
    /**
     * @return Integer license codes indicating which licenses are attached to this disk.
     * 
     */
    private final List<String> licenseCodes;
    /**
     * @return A list of publicly visible licenses. Reserved for Google&#39;s use.
     * 
     */
    private final List<String> licenses;
    /**
     * @return An opaque location hint used to place the disk close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    private final String locationHint;
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * @return Internal use only.
     * 
     */
    private final String options;
    /**
     * @return Physical block size of the persistent disk, in bytes. If not present in a request, a default value is used. The currently supported size is 4096, other sizes may be added in the future. If an unsupported value is requested, the error message will list the supported values for the caller&#39;s project.
     * 
     */
    private final String physicalBlockSizeBytes;
    /**
     * @return Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per second that the disk can handle. Values must be between 10,000 and 120,000. For more details, see the Extreme persistent disk documentation.
     * 
     */
    private final String provisionedIops;
    /**
     * @return URL of the region where the disk resides. Only applicable for regional resources. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * @return URLs of the zones where the disk should be replicated to. Only applicable for regional resources.
     * 
     */
    private final List<String> replicaZones;
    /**
     * @return Resource policies applied to this disk for automatic snapshot creations.
     * 
     */
    private final List<String> resourcePolicies;
    /**
     * @return Reserved for future use.
     * 
     */
    private final Boolean satisfiesPzs;
    /**
     * @return Server-defined fully-qualified URL for this resource.
     * 
     */
    private final String selfLink;
    /**
     * @return Size, in GB, of the persistent disk. You can specify this field when creating a persistent disk using the sourceImage, sourceSnapshot, or sourceDisk parameter, or specify it alone to create an empty persistent disk. If you specify this field along with a source, the value of sizeGb must not be less than the size of the source. Acceptable values are 1 to 65536, inclusive.
     * 
     */
    private final String sizeGb;
    /**
     * @return The source disk used to create this disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - https://www.googleapis.com/compute/v1/projects/project/regions/region /disks/disk - projects/project/zones/zone/disks/disk - projects/project/regions/region/disks/disk - zones/zone/disks/disk - regions/region/disks/disk
     * 
     */
    private final String sourceDisk;
    /**
     * @return The unique ID of the disk used to create this disk. This value identifies the exact disk that was used to create this persistent disk. For example, if you created the persistent disk from a disk that was later deleted and recreated under the same name, the source disk ID would identify the exact version of the disk that was used.
     * 
     */
    private final String sourceDiskId;
    /**
     * @return The source image used to create this disk. If the source image is deleted, this field will not be set. To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific version of a public operating system image: projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image name in the following format: global/images/my-custom-image You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name: global/images/family/my-image-family
     * 
     */
    private final String sourceImage;
    /**
     * @return The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
     * 
     */
    private final CustomerEncryptionKeyResponse sourceImageEncryptionKey;
    /**
     * @return The ID value of the image used to create this disk. This value identifies the exact image that was used to create this persistent disk. For example, if you created the persistent disk from an image that was later deleted and recreated under the same name, the source image ID would identify the exact version of the image that was used.
     * 
     */
    private final String sourceImageId;
    /**
     * @return The source snapshot used to create this disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project /global/snapshots/snapshot - projects/project/global/snapshots/snapshot - global/snapshots/snapshot
     * 
     */
    private final String sourceSnapshot;
    /**
     * @return The customer-supplied encryption key of the source snapshot. Required if the source snapshot is protected by a customer-supplied encryption key.
     * 
     */
    private final CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey;
    /**
     * @return The unique ID of the snapshot used to create this disk. This value identifies the exact snapshot that was used to create this persistent disk. For example, if you created the persistent disk from a snapshot that was later deleted and recreated under the same name, the source snapshot ID would identify the exact version of the snapshot that was used.
     * 
     */
    private final String sourceSnapshotId;
    /**
     * @return The full Google Cloud Storage URI where the disk image is stored. This file must be a gzip-compressed tarball whose name ends in .tar.gz or virtual machine disk whose name ends in vmdk. Valid URIs may start with gs:// or https://storage.googleapis.com/. This flag is not optimized for creating multiple disks from a source storage object. To create many disks from a source storage object, use gcloud compute images import instead.
     * 
     */
    private final String sourceStorageObject;
    /**
     * @return The status of disk creation. - CREATING: Disk is provisioning. - RESTORING: Source data is being copied into the disk. - FAILED: Disk creation failed. - READY: Disk is ready for use. - DELETING: Disk is deleting.
     * 
     */
    private final String status;
    /**
     * @return URL of the disk type resource describing which disk type to use to create the disk. Provide this when creating the disk. For example: projects/project /zones/zone/diskTypes/pd-ssd . See Persistent disk types.
     * 
     */
    private final String type;
    /**
     * @return Links to the users of the disk (attached instances) in form: projects/project/zones/zone/instances/instance
     * 
     */
    private final List<String> users;
    /**
     * @return URL of the zone where the disk resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private GetRegionDiskResult(
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("diskEncryptionKey") CustomerEncryptionKeyResponse diskEncryptionKey,
        @CustomType.Parameter("guestOsFeatures") List<GuestOsFeatureResponse> guestOsFeatures,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("labelFingerprint") String labelFingerprint,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("lastAttachTimestamp") String lastAttachTimestamp,
        @CustomType.Parameter("lastDetachTimestamp") String lastDetachTimestamp,
        @CustomType.Parameter("licenseCodes") List<String> licenseCodes,
        @CustomType.Parameter("licenses") List<String> licenses,
        @CustomType.Parameter("locationHint") String locationHint,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("options") String options,
        @CustomType.Parameter("physicalBlockSizeBytes") String physicalBlockSizeBytes,
        @CustomType.Parameter("provisionedIops") String provisionedIops,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("replicaZones") List<String> replicaZones,
        @CustomType.Parameter("resourcePolicies") List<String> resourcePolicies,
        @CustomType.Parameter("satisfiesPzs") Boolean satisfiesPzs,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("sizeGb") String sizeGb,
        @CustomType.Parameter("sourceDisk") String sourceDisk,
        @CustomType.Parameter("sourceDiskId") String sourceDiskId,
        @CustomType.Parameter("sourceImage") String sourceImage,
        @CustomType.Parameter("sourceImageEncryptionKey") CustomerEncryptionKeyResponse sourceImageEncryptionKey,
        @CustomType.Parameter("sourceImageId") String sourceImageId,
        @CustomType.Parameter("sourceSnapshot") String sourceSnapshot,
        @CustomType.Parameter("sourceSnapshotEncryptionKey") CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey,
        @CustomType.Parameter("sourceSnapshotId") String sourceSnapshotId,
        @CustomType.Parameter("sourceStorageObject") String sourceStorageObject,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("users") List<String> users,
        @CustomType.Parameter("zone") String zone) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.diskEncryptionKey = diskEncryptionKey;
        this.guestOsFeatures = guestOsFeatures;
        this.kind = kind;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.lastAttachTimestamp = lastAttachTimestamp;
        this.lastDetachTimestamp = lastDetachTimestamp;
        this.licenseCodes = licenseCodes;
        this.licenses = licenses;
        this.locationHint = locationHint;
        this.name = name;
        this.options = options;
        this.physicalBlockSizeBytes = physicalBlockSizeBytes;
        this.provisionedIops = provisionedIops;
        this.region = region;
        this.replicaZones = replicaZones;
        this.resourcePolicies = resourcePolicies;
        this.satisfiesPzs = satisfiesPzs;
        this.selfLink = selfLink;
        this.sizeGb = sizeGb;
        this.sourceDisk = sourceDisk;
        this.sourceDiskId = sourceDiskId;
        this.sourceImage = sourceImage;
        this.sourceImageEncryptionKey = sourceImageEncryptionKey;
        this.sourceImageId = sourceImageId;
        this.sourceSnapshot = sourceSnapshot;
        this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
        this.sourceSnapshotId = sourceSnapshotId;
        this.sourceStorageObject = sourceStorageObject;
        this.status = status;
        this.type = type;
        this.users = users;
        this.zone = zone;
    }

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Encrypts the disk using a customer-supplied encryption key or a customer-managed encryption key. Encryption keys do not protect access to metadata of the disk. After you encrypt a disk with a customer-supplied key, you must provide the same key if you use the disk later. For example, to create a disk snapshot, to create a disk image, to create a machine image, or to attach the disk to a virtual machine. After you encrypt a disk with a customer-managed key, the diskEncryptionKey.kmsKeyName is set to a key *version* name once the disk is created. The disk is encrypted with this version of the key. In the response, diskEncryptionKey.kmsKeyName appears in the following format: &#34;diskEncryptionKey.kmsKeyName&#34;: &#34;projects/kms_project_id/locations/region/keyRings/ key_region/cryptoKeys/key /cryptoKeysVersions/version If you do not provide an encryption key when creating the disk, then the disk is encrypted using an automatically generated key and you don&#39;t need to provide a key to use the disk later.
     * 
     */
    public CustomerEncryptionKeyResponse diskEncryptionKey() {
        return this.diskEncryptionKey;
    }
    /**
     * @return A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    public List<GuestOsFeatureResponse> guestOsFeatures() {
        return this.guestOsFeatures;
    }
    /**
     * @return Type of the resource. Always compute#disk for disks.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return A fingerprint for the labels being applied to this disk, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a disk.
     * 
     */
    public String labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * @return Labels to apply to this disk. These can be later modified by the setLabels method.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Last attach timestamp in RFC3339 text format.
     * 
     */
    public String lastAttachTimestamp() {
        return this.lastAttachTimestamp;
    }
    /**
     * @return Last detach timestamp in RFC3339 text format.
     * 
     */
    public String lastDetachTimestamp() {
        return this.lastDetachTimestamp;
    }
    /**
     * @return Integer license codes indicating which licenses are attached to this disk.
     * 
     */
    public List<String> licenseCodes() {
        return this.licenseCodes;
    }
    /**
     * @return A list of publicly visible licenses. Reserved for Google&#39;s use.
     * 
     */
    public List<String> licenses() {
        return this.licenses;
    }
    /**
     * @return An opaque location hint used to place the disk close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    public String locationHint() {
        return this.locationHint;
    }
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Internal use only.
     * 
     */
    public String options() {
        return this.options;
    }
    /**
     * @return Physical block size of the persistent disk, in bytes. If not present in a request, a default value is used. The currently supported size is 4096, other sizes may be added in the future. If an unsupported value is requested, the error message will list the supported values for the caller&#39;s project.
     * 
     */
    public String physicalBlockSizeBytes() {
        return this.physicalBlockSizeBytes;
    }
    /**
     * @return Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per second that the disk can handle. Values must be between 10,000 and 120,000. For more details, see the Extreme persistent disk documentation.
     * 
     */
    public String provisionedIops() {
        return this.provisionedIops;
    }
    /**
     * @return URL of the region where the disk resides. Only applicable for regional resources. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return URLs of the zones where the disk should be replicated to. Only applicable for regional resources.
     * 
     */
    public List<String> replicaZones() {
        return this.replicaZones;
    }
    /**
     * @return Resource policies applied to this disk for automatic snapshot creations.
     * 
     */
    public List<String> resourcePolicies() {
        return this.resourcePolicies;
    }
    /**
     * @return Reserved for future use.
     * 
     */
    public Boolean satisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * @return Server-defined fully-qualified URL for this resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return Size, in GB, of the persistent disk. You can specify this field when creating a persistent disk using the sourceImage, sourceSnapshot, or sourceDisk parameter, or specify it alone to create an empty persistent disk. If you specify this field along with a source, the value of sizeGb must not be less than the size of the source. Acceptable values are 1 to 65536, inclusive.
     * 
     */
    public String sizeGb() {
        return this.sizeGb;
    }
    /**
     * @return The source disk used to create this disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - https://www.googleapis.com/compute/v1/projects/project/regions/region /disks/disk - projects/project/zones/zone/disks/disk - projects/project/regions/region/disks/disk - zones/zone/disks/disk - regions/region/disks/disk
     * 
     */
    public String sourceDisk() {
        return this.sourceDisk;
    }
    /**
     * @return The unique ID of the disk used to create this disk. This value identifies the exact disk that was used to create this persistent disk. For example, if you created the persistent disk from a disk that was later deleted and recreated under the same name, the source disk ID would identify the exact version of the disk that was used.
     * 
     */
    public String sourceDiskId() {
        return this.sourceDiskId;
    }
    /**
     * @return The source image used to create this disk. If the source image is deleted, this field will not be set. To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific version of a public operating system image: projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image name in the following format: global/images/my-custom-image You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name: global/images/family/my-image-family
     * 
     */
    public String sourceImage() {
        return this.sourceImage;
    }
    /**
     * @return The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
     * 
     */
    public CustomerEncryptionKeyResponse sourceImageEncryptionKey() {
        return this.sourceImageEncryptionKey;
    }
    /**
     * @return The ID value of the image used to create this disk. This value identifies the exact image that was used to create this persistent disk. For example, if you created the persistent disk from an image that was later deleted and recreated under the same name, the source image ID would identify the exact version of the image that was used.
     * 
     */
    public String sourceImageId() {
        return this.sourceImageId;
    }
    /**
     * @return The source snapshot used to create this disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project /global/snapshots/snapshot - projects/project/global/snapshots/snapshot - global/snapshots/snapshot
     * 
     */
    public String sourceSnapshot() {
        return this.sourceSnapshot;
    }
    /**
     * @return The customer-supplied encryption key of the source snapshot. Required if the source snapshot is protected by a customer-supplied encryption key.
     * 
     */
    public CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey;
    }
    /**
     * @return The unique ID of the snapshot used to create this disk. This value identifies the exact snapshot that was used to create this persistent disk. For example, if you created the persistent disk from a snapshot that was later deleted and recreated under the same name, the source snapshot ID would identify the exact version of the snapshot that was used.
     * 
     */
    public String sourceSnapshotId() {
        return this.sourceSnapshotId;
    }
    /**
     * @return The full Google Cloud Storage URI where the disk image is stored. This file must be a gzip-compressed tarball whose name ends in .tar.gz or virtual machine disk whose name ends in vmdk. Valid URIs may start with gs:// or https://storage.googleapis.com/. This flag is not optimized for creating multiple disks from a source storage object. To create many disks from a source storage object, use gcloud compute images import instead.
     * 
     */
    public String sourceStorageObject() {
        return this.sourceStorageObject;
    }
    /**
     * @return The status of disk creation. - CREATING: Disk is provisioning. - RESTORING: Source data is being copied into the disk. - FAILED: Disk creation failed. - READY: Disk is ready for use. - DELETING: Disk is deleting.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return URL of the disk type resource describing which disk type to use to create the disk. Provide this when creating the disk. For example: projects/project /zones/zone/diskTypes/pd-ssd . See Persistent disk types.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Links to the users of the disk (attached instances) in form: projects/project/zones/zone/instances/instance
     * 
     */
    public List<String> users() {
        return this.users;
    }
    /**
     * @return URL of the zone where the disk resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionDiskResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private CustomerEncryptionKeyResponse diskEncryptionKey;
        private List<GuestOsFeatureResponse> guestOsFeatures;
        private String kind;
        private String labelFingerprint;
        private Map<String,String> labels;
        private String lastAttachTimestamp;
        private String lastDetachTimestamp;
        private List<String> licenseCodes;
        private List<String> licenses;
        private String locationHint;
        private String name;
        private String options;
        private String physicalBlockSizeBytes;
        private String provisionedIops;
        private String region;
        private List<String> replicaZones;
        private List<String> resourcePolicies;
        private Boolean satisfiesPzs;
        private String selfLink;
        private String sizeGb;
        private String sourceDisk;
        private String sourceDiskId;
        private String sourceImage;
        private CustomerEncryptionKeyResponse sourceImageEncryptionKey;
        private String sourceImageId;
        private String sourceSnapshot;
        private CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey;
        private String sourceSnapshotId;
        private String sourceStorageObject;
        private String status;
        private String type;
        private List<String> users;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionDiskResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.kind = defaults.kind;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.lastAttachTimestamp = defaults.lastAttachTimestamp;
    	      this.lastDetachTimestamp = defaults.lastDetachTimestamp;
    	      this.licenseCodes = defaults.licenseCodes;
    	      this.licenses = defaults.licenses;
    	      this.locationHint = defaults.locationHint;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.physicalBlockSizeBytes = defaults.physicalBlockSizeBytes;
    	      this.provisionedIops = defaults.provisionedIops;
    	      this.region = defaults.region;
    	      this.replicaZones = defaults.replicaZones;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.selfLink = defaults.selfLink;
    	      this.sizeGb = defaults.sizeGb;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.sourceDiskId = defaults.sourceDiskId;
    	      this.sourceImage = defaults.sourceImage;
    	      this.sourceImageEncryptionKey = defaults.sourceImageEncryptionKey;
    	      this.sourceImageId = defaults.sourceImageId;
    	      this.sourceSnapshot = defaults.sourceSnapshot;
    	      this.sourceSnapshotEncryptionKey = defaults.sourceSnapshotEncryptionKey;
    	      this.sourceSnapshotId = defaults.sourceSnapshotId;
    	      this.sourceStorageObject = defaults.sourceStorageObject;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.users = defaults.users;
    	      this.zone = defaults.zone;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder diskEncryptionKey(CustomerEncryptionKeyResponse diskEncryptionKey) {
            this.diskEncryptionKey = Objects.requireNonNull(diskEncryptionKey);
            return this;
        }
        public Builder guestOsFeatures(List<GuestOsFeatureResponse> guestOsFeatures) {
            this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures);
            return this;
        }
        public Builder guestOsFeatures(GuestOsFeatureResponse... guestOsFeatures) {
            return guestOsFeatures(List.of(guestOsFeatures));
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder labelFingerprint(String labelFingerprint) {
            this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder lastAttachTimestamp(String lastAttachTimestamp) {
            this.lastAttachTimestamp = Objects.requireNonNull(lastAttachTimestamp);
            return this;
        }
        public Builder lastDetachTimestamp(String lastDetachTimestamp) {
            this.lastDetachTimestamp = Objects.requireNonNull(lastDetachTimestamp);
            return this;
        }
        public Builder licenseCodes(List<String> licenseCodes) {
            this.licenseCodes = Objects.requireNonNull(licenseCodes);
            return this;
        }
        public Builder licenseCodes(String... licenseCodes) {
            return licenseCodes(List.of(licenseCodes));
        }
        public Builder licenses(List<String> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }
        public Builder licenses(String... licenses) {
            return licenses(List.of(licenses));
        }
        public Builder locationHint(String locationHint) {
            this.locationHint = Objects.requireNonNull(locationHint);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder options(String options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public Builder physicalBlockSizeBytes(String physicalBlockSizeBytes) {
            this.physicalBlockSizeBytes = Objects.requireNonNull(physicalBlockSizeBytes);
            return this;
        }
        public Builder provisionedIops(String provisionedIops) {
            this.provisionedIops = Objects.requireNonNull(provisionedIops);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder replicaZones(List<String> replicaZones) {
            this.replicaZones = Objects.requireNonNull(replicaZones);
            return this;
        }
        public Builder replicaZones(String... replicaZones) {
            return replicaZones(List.of(replicaZones));
        }
        public Builder resourcePolicies(List<String> resourcePolicies) {
            this.resourcePolicies = Objects.requireNonNull(resourcePolicies);
            return this;
        }
        public Builder resourcePolicies(String... resourcePolicies) {
            return resourcePolicies(List.of(resourcePolicies));
        }
        public Builder satisfiesPzs(Boolean satisfiesPzs) {
            this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder sizeGb(String sizeGb) {
            this.sizeGb = Objects.requireNonNull(sizeGb);
            return this;
        }
        public Builder sourceDisk(String sourceDisk) {
            this.sourceDisk = Objects.requireNonNull(sourceDisk);
            return this;
        }
        public Builder sourceDiskId(String sourceDiskId) {
            this.sourceDiskId = Objects.requireNonNull(sourceDiskId);
            return this;
        }
        public Builder sourceImage(String sourceImage) {
            this.sourceImage = Objects.requireNonNull(sourceImage);
            return this;
        }
        public Builder sourceImageEncryptionKey(CustomerEncryptionKeyResponse sourceImageEncryptionKey) {
            this.sourceImageEncryptionKey = Objects.requireNonNull(sourceImageEncryptionKey);
            return this;
        }
        public Builder sourceImageId(String sourceImageId) {
            this.sourceImageId = Objects.requireNonNull(sourceImageId);
            return this;
        }
        public Builder sourceSnapshot(String sourceSnapshot) {
            this.sourceSnapshot = Objects.requireNonNull(sourceSnapshot);
            return this;
        }
        public Builder sourceSnapshotEncryptionKey(CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = Objects.requireNonNull(sourceSnapshotEncryptionKey);
            return this;
        }
        public Builder sourceSnapshotId(String sourceSnapshotId) {
            this.sourceSnapshotId = Objects.requireNonNull(sourceSnapshotId);
            return this;
        }
        public Builder sourceStorageObject(String sourceStorageObject) {
            this.sourceStorageObject = Objects.requireNonNull(sourceStorageObject);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder users(List<String> users) {
            this.users = Objects.requireNonNull(users);
            return this;
        }
        public Builder users(String... users) {
            return users(List.of(users));
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetRegionDiskResult build() {
            return new GetRegionDiskResult(creationTimestamp, description, diskEncryptionKey, guestOsFeatures, kind, labelFingerprint, labels, lastAttachTimestamp, lastDetachTimestamp, licenseCodes, licenses, locationHint, name, options, physicalBlockSizeBytes, provisionedIops, region, replicaZones, resourcePolicies, satisfiesPzs, selfLink, sizeGb, sourceDisk, sourceDiskId, sourceImage, sourceImageEncryptionKey, sourceImageId, sourceSnapshot, sourceSnapshotEncryptionKey, sourceSnapshotId, sourceStorageObject, status, type, users, zone);
        }
    }
}
