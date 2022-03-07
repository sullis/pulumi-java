// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.GuestAgentProfileResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.HardwareProfileResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.IdentityResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.NetworkProfileResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.OsProfileResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.PlacementProfileResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ResourceStatusResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.StorageProfileResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVirtualMachineResult {
    /**
     * Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    private final String customResourceName;
    /**
     * Gets or sets the extended location.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * Firmware type
     * 
     */
    private final @Nullable String firmwareType;
    /**
     * Gets or sets the folder path of the vm.
     * 
     */
    private final String folderPath;
    /**
     * Guest agent status properties.
     * 
     */
    private final @Nullable GuestAgentProfileResponse guestAgentProfile;
    /**
     * Hardware properties.
     * 
     */
    private final @Nullable HardwareProfileResponse hardwareProfile;
    /**
     * Gets or sets the Id.
     * 
     */
    private final String id;
    /**
     * The identity of the resource.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * Gets or sets the instance uuid of the vm.
     * 
     */
    private final String instanceUuid;
    /**
     * Gets or sets the inventory Item ID for the virtual machine.
     * 
     */
    private final @Nullable String inventoryItemId;
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    private final @Nullable String kind;
    /**
     * Gets or sets the location.
     * 
     */
    private final String location;
    /**
     * Gets or sets the vCenter Managed Object name for the virtual machine.
     * 
     */
    private final String moName;
    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual machine.
     * 
     */
    private final @Nullable String moRefId;
    /**
     * Gets or sets the name.
     * 
     */
    private final String name;
    /**
     * Network properties.
     * 
     */
    private final @Nullable NetworkProfileResponse networkProfile;
    /**
     * OS properties.
     * 
     */
    private final @Nullable OsProfileResponse osProfile;
    /**
     * Placement properties.
     * 
     */
    private final @Nullable PlacementProfileResponse placementProfile;
    /**
     * Gets the power state of the virtual machine.
     * 
     */
    private final String powerState;
    /**
     * Gets or sets the provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * Gets or sets the ARM Id of the resourcePool resource on which this virtual machine will
     * deploy.
     * 
     */
    private final @Nullable String resourcePoolId;
    /**
     * Gets or sets the SMBIOS UUID of the vm.
     * 
     */
    private final @Nullable String smbiosUuid;
    /**
     * The resource status information.
     * 
     */
    private final List<ResourceStatusResponse> statuses;
    /**
     * Storage properties.
     * 
     */
    private final @Nullable StorageProfileResponse storageProfile;
    /**
     * The system data.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Gets or sets the Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Gets or sets the ARM Id of the template resource to deploy the virtual machine.
     * 
     */
    private final @Nullable String templateId;
    /**
     * Gets or sets the type of the resource.
     * 
     */
    private final String type;
    /**
     * Gets or sets a unique identifier for this resource.
     * 
     */
    private final String uuid;
    /**
     * Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
     * 
     */
    private final @Nullable String vCenterId;
    /**
     * Gets or sets a unique identifier for the vm resource.
     * 
     */
    private final String vmId;

    @OutputCustomType.Constructor({"customResourceName","extendedLocation","firmwareType","folderPath","guestAgentProfile","hardwareProfile","id","identity","instanceUuid","inventoryItemId","kind","location","moName","moRefId","name","networkProfile","osProfile","placementProfile","powerState","provisioningState","resourcePoolId","smbiosUuid","statuses","storageProfile","systemData","tags","templateId","type","uuid","vCenterId","vmId"})
    private GetVirtualMachineResult(
        String customResourceName,
        @Nullable ExtendedLocationResponse extendedLocation,
        @Nullable String firmwareType,
        String folderPath,
        @Nullable GuestAgentProfileResponse guestAgentProfile,
        @Nullable HardwareProfileResponse hardwareProfile,
        String id,
        @Nullable IdentityResponse identity,
        String instanceUuid,
        @Nullable String inventoryItemId,
        @Nullable String kind,
        String location,
        String moName,
        @Nullable String moRefId,
        String name,
        @Nullable NetworkProfileResponse networkProfile,
        @Nullable OsProfileResponse osProfile,
        @Nullable PlacementProfileResponse placementProfile,
        String powerState,
        String provisioningState,
        @Nullable String resourcePoolId,
        @Nullable String smbiosUuid,
        List<ResourceStatusResponse> statuses,
        @Nullable StorageProfileResponse storageProfile,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        @Nullable String templateId,
        String type,
        String uuid,
        @Nullable String vCenterId,
        String vmId) {
        this.customResourceName = Objects.requireNonNull(customResourceName);
        this.extendedLocation = extendedLocation;
        this.firmwareType = firmwareType;
        this.folderPath = Objects.requireNonNull(folderPath);
        this.guestAgentProfile = guestAgentProfile;
        this.hardwareProfile = hardwareProfile;
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.instanceUuid = Objects.requireNonNull(instanceUuid);
        this.inventoryItemId = inventoryItemId;
        this.kind = kind;
        this.location = Objects.requireNonNull(location);
        this.moName = Objects.requireNonNull(moName);
        this.moRefId = moRefId;
        this.name = Objects.requireNonNull(name);
        this.networkProfile = networkProfile;
        this.osProfile = osProfile;
        this.placementProfile = placementProfile;
        this.powerState = Objects.requireNonNull(powerState);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourcePoolId = resourcePoolId;
        this.smbiosUuid = smbiosUuid;
        this.statuses = Objects.requireNonNull(statuses);
        this.storageProfile = storageProfile;
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.templateId = templateId;
        this.type = Objects.requireNonNull(type);
        this.uuid = Objects.requireNonNull(uuid);
        this.vCenterId = vCenterId;
        this.vmId = Objects.requireNonNull(vmId);
    }

    /**
     * Gets the name of the corresponding resource in Kubernetes.
     * 
    */
    public String getCustomResourceName() {
        return this.customResourceName;
    }
    /**
     * Gets or sets the extended location.
     * 
    */
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * Firmware type
     * 
    */
    public Optional<String> getFirmwareType() {
        return Optional.ofNullable(this.firmwareType);
    }
    /**
     * Gets or sets the folder path of the vm.
     * 
    */
    public String getFolderPath() {
        return this.folderPath;
    }
    /**
     * Guest agent status properties.
     * 
    */
    public Optional<GuestAgentProfileResponse> getGuestAgentProfile() {
        return Optional.ofNullable(this.guestAgentProfile);
    }
    /**
     * Hardware properties.
     * 
    */
    public Optional<HardwareProfileResponse> getHardwareProfile() {
        return Optional.ofNullable(this.hardwareProfile);
    }
    /**
     * Gets or sets the Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The identity of the resource.
     * 
    */
    public Optional<IdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Gets or sets the instance uuid of the vm.
     * 
    */
    public String getInstanceUuid() {
        return this.instanceUuid;
    }
    /**
     * Gets or sets the inventory Item ID for the virtual machine.
     * 
    */
    public Optional<String> getInventoryItemId() {
        return Optional.ofNullable(this.inventoryItemId);
    }
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Gets or sets the location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Gets or sets the vCenter Managed Object name for the virtual machine.
     * 
    */
    public String getMoName() {
        return this.moName;
    }
    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual machine.
     * 
    */
    public Optional<String> getMoRefId() {
        return Optional.ofNullable(this.moRefId);
    }
    /**
     * Gets or sets the name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Network properties.
     * 
    */
    public Optional<NetworkProfileResponse> getNetworkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }
    /**
     * OS properties.
     * 
    */
    public Optional<OsProfileResponse> getOsProfile() {
        return Optional.ofNullable(this.osProfile);
    }
    /**
     * Placement properties.
     * 
    */
    public Optional<PlacementProfileResponse> getPlacementProfile() {
        return Optional.ofNullable(this.placementProfile);
    }
    /**
     * Gets the power state of the virtual machine.
     * 
    */
    public String getPowerState() {
        return this.powerState;
    }
    /**
     * Gets or sets the provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets or sets the ARM Id of the resourcePool resource on which this virtual machine will
     * deploy.
     * 
    */
    public Optional<String> getResourcePoolId() {
        return Optional.ofNullable(this.resourcePoolId);
    }
    /**
     * Gets or sets the SMBIOS UUID of the vm.
     * 
    */
    public Optional<String> getSmbiosUuid() {
        return Optional.ofNullable(this.smbiosUuid);
    }
    /**
     * The resource status information.
     * 
    */
    public List<ResourceStatusResponse> getStatuses() {
        return this.statuses;
    }
    /**
     * Storage properties.
     * 
    */
    public Optional<StorageProfileResponse> getStorageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }
    /**
     * The system data.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Gets or sets the Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Gets or sets the ARM Id of the template resource to deploy the virtual machine.
     * 
    */
    public Optional<String> getTemplateId() {
        return Optional.ofNullable(this.templateId);
    }
    /**
     * Gets or sets the type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Gets or sets a unique identifier for this resource.
     * 
    */
    public String getUuid() {
        return this.uuid;
    }
    /**
     * Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
     * 
    */
    public Optional<String> getVCenterId() {
        return Optional.ofNullable(this.vCenterId);
    }
    /**
     * Gets or sets a unique identifier for the vm resource.
     * 
    */
    public String getVmId() {
        return this.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customResourceName;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private @Nullable String firmwareType;
        private String folderPath;
        private @Nullable GuestAgentProfileResponse guestAgentProfile;
        private @Nullable HardwareProfileResponse hardwareProfile;
        private String id;
        private @Nullable IdentityResponse identity;
        private String instanceUuid;
        private @Nullable String inventoryItemId;
        private @Nullable String kind;
        private String location;
        private String moName;
        private @Nullable String moRefId;
        private String name;
        private @Nullable NetworkProfileResponse networkProfile;
        private @Nullable OsProfileResponse osProfile;
        private @Nullable PlacementProfileResponse placementProfile;
        private String powerState;
        private String provisioningState;
        private @Nullable String resourcePoolId;
        private @Nullable String smbiosUuid;
        private List<ResourceStatusResponse> statuses;
        private @Nullable StorageProfileResponse storageProfile;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private @Nullable String templateId;
        private String type;
        private String uuid;
        private @Nullable String vCenterId;
        private String vmId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResourceName = defaults.customResourceName;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.firmwareType = defaults.firmwareType;
    	      this.folderPath = defaults.folderPath;
    	      this.guestAgentProfile = defaults.guestAgentProfile;
    	      this.hardwareProfile = defaults.hardwareProfile;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.instanceUuid = defaults.instanceUuid;
    	      this.inventoryItemId = defaults.inventoryItemId;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.moName = defaults.moName;
    	      this.moRefId = defaults.moRefId;
    	      this.name = defaults.name;
    	      this.networkProfile = defaults.networkProfile;
    	      this.osProfile = defaults.osProfile;
    	      this.placementProfile = defaults.placementProfile;
    	      this.powerState = defaults.powerState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourcePoolId = defaults.resourcePoolId;
    	      this.smbiosUuid = defaults.smbiosUuid;
    	      this.statuses = defaults.statuses;
    	      this.storageProfile = defaults.storageProfile;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.templateId = defaults.templateId;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
    	      this.vCenterId = defaults.vCenterId;
    	      this.vmId = defaults.vmId;
        }

        public Builder setCustomResourceName(String customResourceName) {
            this.customResourceName = Objects.requireNonNull(customResourceName);
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setFirmwareType(@Nullable String firmwareType) {
            this.firmwareType = firmwareType;
            return this;
        }

        public Builder setFolderPath(String folderPath) {
            this.folderPath = Objects.requireNonNull(folderPath);
            return this;
        }

        public Builder setGuestAgentProfile(@Nullable GuestAgentProfileResponse guestAgentProfile) {
            this.guestAgentProfile = guestAgentProfile;
            return this;
        }

        public Builder setHardwareProfile(@Nullable HardwareProfileResponse hardwareProfile) {
            this.hardwareProfile = hardwareProfile;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setInstanceUuid(String instanceUuid) {
            this.instanceUuid = Objects.requireNonNull(instanceUuid);
            return this;
        }

        public Builder setInventoryItemId(@Nullable String inventoryItemId) {
            this.inventoryItemId = inventoryItemId;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMoName(String moName) {
            this.moName = Objects.requireNonNull(moName);
            return this;
        }

        public Builder setMoRefId(@Nullable String moRefId) {
            this.moRefId = moRefId;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkProfile(@Nullable NetworkProfileResponse networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder setOsProfile(@Nullable OsProfileResponse osProfile) {
            this.osProfile = osProfile;
            return this;
        }

        public Builder setPlacementProfile(@Nullable PlacementProfileResponse placementProfile) {
            this.placementProfile = placementProfile;
            return this;
        }

        public Builder setPowerState(String powerState) {
            this.powerState = Objects.requireNonNull(powerState);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourcePoolId(@Nullable String resourcePoolId) {
            this.resourcePoolId = resourcePoolId;
            return this;
        }

        public Builder setSmbiosUuid(@Nullable String smbiosUuid) {
            this.smbiosUuid = smbiosUuid;
            return this;
        }

        public Builder setStatuses(List<ResourceStatusResponse> statuses) {
            this.statuses = Objects.requireNonNull(statuses);
            return this;
        }

        public Builder setStorageProfile(@Nullable StorageProfileResponse storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTemplateId(@Nullable String templateId) {
            this.templateId = templateId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }

        public Builder setVCenterId(@Nullable String vCenterId) {
            this.vCenterId = vCenterId;
            return this;
        }

        public Builder setVmId(String vmId) {
            this.vmId = Objects.requireNonNull(vmId);
            return this;
        }
        public GetVirtualMachineResult build() {
            return new GetVirtualMachineResult(customResourceName, extendedLocation, firmwareType, folderPath, guestAgentProfile, hardwareProfile, id, identity, instanceUuid, inventoryItemId, kind, location, moName, moRefId, name, networkProfile, osProfile, placementProfile, powerState, provisioningState, resourcePoolId, smbiosUuid, statuses, storageProfile, systemData, tags, templateId, type, uuid, vCenterId, vmId);
        }
    }
}