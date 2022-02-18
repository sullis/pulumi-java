// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.ArtifactInstallPropertiesResponse;
import io.pulumi.azurenative.devtestlab.outputs.BulkCreationParametersResponse;
import io.pulumi.azurenative.devtestlab.outputs.DataDiskPropertiesResponse;
import io.pulumi.azurenative.devtestlab.outputs.GalleryImageReferenceResponse;
import io.pulumi.azurenative.devtestlab.outputs.NetworkInterfacePropertiesResponse;
import io.pulumi.azurenative.devtestlab.outputs.ScheduleCreationParameterResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LabVirtualMachineCreationParameterResponse {
    /**
     * Indicates whether another user can take ownership of the virtual machine
     * 
     */
    private final @Nullable Boolean allowClaim;
    /**
     * The artifacts to be installed on the virtual machine.
     * 
     */
    private final @Nullable List<ArtifactInstallPropertiesResponse> artifacts;
    /**
     * The number of virtual machine instances to create.
     * 
     */
    private final @Nullable BulkCreationParametersResponse bulkCreationParameters;
    /**
     * The creation date of the virtual machine.
     * 
     */
    private final @Nullable String createdDate;
    /**
     * The custom image identifier of the virtual machine.
     * 
     */
    private final @Nullable String customImageId;
    /**
     * New or existing data disks to attach to the virtual machine after creation
     * 
     */
    private final @Nullable List<DataDiskPropertiesResponse> dataDiskParameters;
    /**
     * Indicates whether the virtual machine is to be created without a public IP address.
     * 
     */
    private final @Nullable Boolean disallowPublicIpAddress;
    /**
     * The resource ID of the environment that contains this virtual machine, if any.
     * 
     */
    private final @Nullable String environmentId;
    /**
     * The expiration date for VM.
     * 
     */
    private final @Nullable String expirationDate;
    /**
     * The Microsoft Azure Marketplace image reference of the virtual machine.
     * 
     */
    private final @Nullable GalleryImageReferenceResponse galleryImageReference;
    /**
     * Indicates whether this virtual machine uses an SSH key for authentication.
     * 
     */
    private final @Nullable Boolean isAuthenticationWithSshKey;
    /**
     * The lab subnet name of the virtual machine.
     * 
     */
    private final @Nullable String labSubnetName;
    /**
     * The lab virtual network identifier of the virtual machine.
     * 
     */
    private final @Nullable String labVirtualNetworkId;
    /**
     * The location of the new virtual machine or environment
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the virtual machine or environment
     * 
     */
    private final @Nullable String name;
    /**
     * The network interface properties.
     * 
     */
    private final @Nullable NetworkInterfacePropertiesResponse networkInterface;
    /**
     * The notes of the virtual machine.
     * 
     */
    private final @Nullable String notes;
    /**
     * The object identifier of the owner of the virtual machine.
     * 
     */
    private final @Nullable String ownerObjectId;
    /**
     * The user principal name of the virtual machine owner.
     * 
     */
    private final @Nullable String ownerUserPrincipalName;
    /**
     * The password of the virtual machine administrator.
     * 
     */
    private final @Nullable String password;
    /**
     * The id of the plan associated with the virtual machine image
     * 
     */
    private final @Nullable String planId;
    /**
     * Virtual Machine schedules to be created
     * 
     */
    private final @Nullable List<ScheduleCreationParameterResponse> scheduleParameters;
    /**
     * The size of the virtual machine.
     * 
     */
    private final @Nullable String size;
    /**
     * The SSH key of the virtual machine administrator.
     * 
     */
    private final @Nullable String sshKey;
    /**
     * Storage type to use for virtual machine (i.e. Standard, Premium).
     * 
     */
    private final @Nullable String storageType;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The user name of the virtual machine.
     * 
     */
    private final @Nullable String userName;

    @OutputCustomType.Constructor({"allowClaim","artifacts","bulkCreationParameters","createdDate","customImageId","dataDiskParameters","disallowPublicIpAddress","environmentId","expirationDate","galleryImageReference","isAuthenticationWithSshKey","labSubnetName","labVirtualNetworkId","location","name","networkInterface","notes","ownerObjectId","ownerUserPrincipalName","password","planId","scheduleParameters","size","sshKey","storageType","tags","userName"})
    private LabVirtualMachineCreationParameterResponse(
        @Nullable Boolean allowClaim,
        @Nullable List<ArtifactInstallPropertiesResponse> artifacts,
        @Nullable BulkCreationParametersResponse bulkCreationParameters,
        @Nullable String createdDate,
        @Nullable String customImageId,
        @Nullable List<DataDiskPropertiesResponse> dataDiskParameters,
        @Nullable Boolean disallowPublicIpAddress,
        @Nullable String environmentId,
        @Nullable String expirationDate,
        @Nullable GalleryImageReferenceResponse galleryImageReference,
        @Nullable Boolean isAuthenticationWithSshKey,
        @Nullable String labSubnetName,
        @Nullable String labVirtualNetworkId,
        @Nullable String location,
        @Nullable String name,
        @Nullable NetworkInterfacePropertiesResponse networkInterface,
        @Nullable String notes,
        @Nullable String ownerObjectId,
        @Nullable String ownerUserPrincipalName,
        @Nullable String password,
        @Nullable String planId,
        @Nullable List<ScheduleCreationParameterResponse> scheduleParameters,
        @Nullable String size,
        @Nullable String sshKey,
        @Nullable String storageType,
        @Nullable Map<String,String> tags,
        @Nullable String userName) {
        this.allowClaim = allowClaim;
        this.artifacts = artifacts;
        this.bulkCreationParameters = bulkCreationParameters;
        this.createdDate = createdDate;
        this.customImageId = customImageId;
        this.dataDiskParameters = dataDiskParameters;
        this.disallowPublicIpAddress = disallowPublicIpAddress;
        this.environmentId = environmentId;
        this.expirationDate = expirationDate;
        this.galleryImageReference = galleryImageReference;
        this.isAuthenticationWithSshKey = isAuthenticationWithSshKey;
        this.labSubnetName = labSubnetName;
        this.labVirtualNetworkId = labVirtualNetworkId;
        this.location = location;
        this.name = name;
        this.networkInterface = networkInterface;
        this.notes = notes;
        this.ownerObjectId = ownerObjectId;
        this.ownerUserPrincipalName = ownerUserPrincipalName;
        this.password = password;
        this.planId = planId;
        this.scheduleParameters = scheduleParameters;
        this.size = size;
        this.sshKey = sshKey;
        this.storageType = storageType;
        this.tags = tags;
        this.userName = userName;
    }

    /**
     * Indicates whether another user can take ownership of the virtual machine
     * 
     */
    public Optional<Boolean> getAllowClaim() {
        return Optional.ofNullable(this.allowClaim);
    }
    /**
     * The artifacts to be installed on the virtual machine.
     * 
     */
    public List<ArtifactInstallPropertiesResponse> getArtifacts() {
        return this.artifacts == null ? List.of() : this.artifacts;
    }
    /**
     * The number of virtual machine instances to create.
     * 
     */
    public Optional<BulkCreationParametersResponse> getBulkCreationParameters() {
        return Optional.ofNullable(this.bulkCreationParameters);
    }
    /**
     * The creation date of the virtual machine.
     * 
     */
    public Optional<String> getCreatedDate() {
        return Optional.ofNullable(this.createdDate);
    }
    /**
     * The custom image identifier of the virtual machine.
     * 
     */
    public Optional<String> getCustomImageId() {
        return Optional.ofNullable(this.customImageId);
    }
    /**
     * New or existing data disks to attach to the virtual machine after creation
     * 
     */
    public List<DataDiskPropertiesResponse> getDataDiskParameters() {
        return this.dataDiskParameters == null ? List.of() : this.dataDiskParameters;
    }
    /**
     * Indicates whether the virtual machine is to be created without a public IP address.
     * 
     */
    public Optional<Boolean> getDisallowPublicIpAddress() {
        return Optional.ofNullable(this.disallowPublicIpAddress);
    }
    /**
     * The resource ID of the environment that contains this virtual machine, if any.
     * 
     */
    public Optional<String> getEnvironmentId() {
        return Optional.ofNullable(this.environmentId);
    }
    /**
     * The expiration date for VM.
     * 
     */
    public Optional<String> getExpirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }
    /**
     * The Microsoft Azure Marketplace image reference of the virtual machine.
     * 
     */
    public Optional<GalleryImageReferenceResponse> getGalleryImageReference() {
        return Optional.ofNullable(this.galleryImageReference);
    }
    /**
     * Indicates whether this virtual machine uses an SSH key for authentication.
     * 
     */
    public Optional<Boolean> getIsAuthenticationWithSshKey() {
        return Optional.ofNullable(this.isAuthenticationWithSshKey);
    }
    /**
     * The lab subnet name of the virtual machine.
     * 
     */
    public Optional<String> getLabSubnetName() {
        return Optional.ofNullable(this.labSubnetName);
    }
    /**
     * The lab virtual network identifier of the virtual machine.
     * 
     */
    public Optional<String> getLabVirtualNetworkId() {
        return Optional.ofNullable(this.labVirtualNetworkId);
    }
    /**
     * The location of the new virtual machine or environment
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the virtual machine or environment
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The network interface properties.
     * 
     */
    public Optional<NetworkInterfacePropertiesResponse> getNetworkInterface() {
        return Optional.ofNullable(this.networkInterface);
    }
    /**
     * The notes of the virtual machine.
     * 
     */
    public Optional<String> getNotes() {
        return Optional.ofNullable(this.notes);
    }
    /**
     * The object identifier of the owner of the virtual machine.
     * 
     */
    public Optional<String> getOwnerObjectId() {
        return Optional.ofNullable(this.ownerObjectId);
    }
    /**
     * The user principal name of the virtual machine owner.
     * 
     */
    public Optional<String> getOwnerUserPrincipalName() {
        return Optional.ofNullable(this.ownerUserPrincipalName);
    }
    /**
     * The password of the virtual machine administrator.
     * 
     */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The id of the plan associated with the virtual machine image
     * 
     */
    public Optional<String> getPlanId() {
        return Optional.ofNullable(this.planId);
    }
    /**
     * Virtual Machine schedules to be created
     * 
     */
    public List<ScheduleCreationParameterResponse> getScheduleParameters() {
        return this.scheduleParameters == null ? List.of() : this.scheduleParameters;
    }
    /**
     * The size of the virtual machine.
     * 
     */
    public Optional<String> getSize() {
        return Optional.ofNullable(this.size);
    }
    /**
     * The SSH key of the virtual machine administrator.
     * 
     */
    public Optional<String> getSshKey() {
        return Optional.ofNullable(this.sshKey);
    }
    /**
     * Storage type to use for virtual machine (i.e. Standard, Premium).
     * 
     */
    public Optional<String> getStorageType() {
        return Optional.ofNullable(this.storageType);
    }
    /**
     * The tags of the resource.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The user name of the virtual machine.
     * 
     */
    public Optional<String> getUserName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabVirtualMachineCreationParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowClaim;
        private @Nullable List<ArtifactInstallPropertiesResponse> artifacts;
        private @Nullable BulkCreationParametersResponse bulkCreationParameters;
        private @Nullable String createdDate;
        private @Nullable String customImageId;
        private @Nullable List<DataDiskPropertiesResponse> dataDiskParameters;
        private @Nullable Boolean disallowPublicIpAddress;
        private @Nullable String environmentId;
        private @Nullable String expirationDate;
        private @Nullable GalleryImageReferenceResponse galleryImageReference;
        private @Nullable Boolean isAuthenticationWithSshKey;
        private @Nullable String labSubnetName;
        private @Nullable String labVirtualNetworkId;
        private @Nullable String location;
        private @Nullable String name;
        private @Nullable NetworkInterfacePropertiesResponse networkInterface;
        private @Nullable String notes;
        private @Nullable String ownerObjectId;
        private @Nullable String ownerUserPrincipalName;
        private @Nullable String password;
        private @Nullable String planId;
        private @Nullable List<ScheduleCreationParameterResponse> scheduleParameters;
        private @Nullable String size;
        private @Nullable String sshKey;
        private @Nullable String storageType;
        private @Nullable Map<String,String> tags;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(LabVirtualMachineCreationParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowClaim = defaults.allowClaim;
    	      this.artifacts = defaults.artifacts;
    	      this.bulkCreationParameters = defaults.bulkCreationParameters;
    	      this.createdDate = defaults.createdDate;
    	      this.customImageId = defaults.customImageId;
    	      this.dataDiskParameters = defaults.dataDiskParameters;
    	      this.disallowPublicIpAddress = defaults.disallowPublicIpAddress;
    	      this.environmentId = defaults.environmentId;
    	      this.expirationDate = defaults.expirationDate;
    	      this.galleryImageReference = defaults.galleryImageReference;
    	      this.isAuthenticationWithSshKey = defaults.isAuthenticationWithSshKey;
    	      this.labSubnetName = defaults.labSubnetName;
    	      this.labVirtualNetworkId = defaults.labVirtualNetworkId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkInterface = defaults.networkInterface;
    	      this.notes = defaults.notes;
    	      this.ownerObjectId = defaults.ownerObjectId;
    	      this.ownerUserPrincipalName = defaults.ownerUserPrincipalName;
    	      this.password = defaults.password;
    	      this.planId = defaults.planId;
    	      this.scheduleParameters = defaults.scheduleParameters;
    	      this.size = defaults.size;
    	      this.sshKey = defaults.sshKey;
    	      this.storageType = defaults.storageType;
    	      this.tags = defaults.tags;
    	      this.userName = defaults.userName;
        }

        public Builder setAllowClaim(@Nullable Boolean allowClaim) {
            this.allowClaim = allowClaim;
            return this;
        }

        public Builder setArtifacts(@Nullable List<ArtifactInstallPropertiesResponse> artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        public Builder setBulkCreationParameters(@Nullable BulkCreationParametersResponse bulkCreationParameters) {
            this.bulkCreationParameters = bulkCreationParameters;
            return this;
        }

        public Builder setCreatedDate(@Nullable String createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Builder setCustomImageId(@Nullable String customImageId) {
            this.customImageId = customImageId;
            return this;
        }

        public Builder setDataDiskParameters(@Nullable List<DataDiskPropertiesResponse> dataDiskParameters) {
            this.dataDiskParameters = dataDiskParameters;
            return this;
        }

        public Builder setDisallowPublicIpAddress(@Nullable Boolean disallowPublicIpAddress) {
            this.disallowPublicIpAddress = disallowPublicIpAddress;
            return this;
        }

        public Builder setEnvironmentId(@Nullable String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder setExpirationDate(@Nullable String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder setGalleryImageReference(@Nullable GalleryImageReferenceResponse galleryImageReference) {
            this.galleryImageReference = galleryImageReference;
            return this;
        }

        public Builder setIsAuthenticationWithSshKey(@Nullable Boolean isAuthenticationWithSshKey) {
            this.isAuthenticationWithSshKey = isAuthenticationWithSshKey;
            return this;
        }

        public Builder setLabSubnetName(@Nullable String labSubnetName) {
            this.labSubnetName = labSubnetName;
            return this;
        }

        public Builder setLabVirtualNetworkId(@Nullable String labVirtualNetworkId) {
            this.labVirtualNetworkId = labVirtualNetworkId;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNetworkInterface(@Nullable NetworkInterfacePropertiesResponse networkInterface) {
            this.networkInterface = networkInterface;
            return this;
        }

        public Builder setNotes(@Nullable String notes) {
            this.notes = notes;
            return this;
        }

        public Builder setOwnerObjectId(@Nullable String ownerObjectId) {
            this.ownerObjectId = ownerObjectId;
            return this;
        }

        public Builder setOwnerUserPrincipalName(@Nullable String ownerUserPrincipalName) {
            this.ownerUserPrincipalName = ownerUserPrincipalName;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setPlanId(@Nullable String planId) {
            this.planId = planId;
            return this;
        }

        public Builder setScheduleParameters(@Nullable List<ScheduleCreationParameterResponse> scheduleParameters) {
            this.scheduleParameters = scheduleParameters;
            return this;
        }

        public Builder setSize(@Nullable String size) {
            this.size = size;
            return this;
        }

        public Builder setSshKey(@Nullable String sshKey) {
            this.sshKey = sshKey;
            return this;
        }

        public Builder setStorageType(@Nullable String storageType) {
            this.storageType = storageType;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }

        public LabVirtualMachineCreationParameterResponse build() {
            return new LabVirtualMachineCreationParameterResponse(allowClaim, artifacts, bulkCreationParameters, createdDate, customImageId, dataDiskParameters, disallowPublicIpAddress, environmentId, expirationDate, galleryImageReference, isAuthenticationWithSshKey, labSubnetName, labVirtualNetworkId, location, name, networkInterface, notes, ownerObjectId, ownerUserPrincipalName, password, planId, scheduleParameters, size, sshKey, storageType, tags, userName);
        }
    }
}
