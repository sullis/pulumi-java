// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab;

import com.pulumi.azurenative.devtestlab.inputs.ArtifactInstallPropertiesArgs;
import com.pulumi.azurenative.devtestlab.inputs.DataDiskPropertiesArgs;
import com.pulumi.azurenative.devtestlab.inputs.GalleryImageReferenceArgs;
import com.pulumi.azurenative.devtestlab.inputs.NetworkInterfacePropertiesArgs;
import com.pulumi.azurenative.devtestlab.inputs.ScheduleCreationParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineArgs Empty = new VirtualMachineArgs();

    /**
     * Indicates whether another user can take ownership of the virtual machine
     * 
     */
    @Import(name="allowClaim")
    private @Nullable Output<Boolean> allowClaim;

    /**
     * @return Indicates whether another user can take ownership of the virtual machine
     * 
     */
    public Optional<Output<Boolean>> allowClaim() {
        return Optional.ofNullable(this.allowClaim);
    }

    /**
     * The artifacts to be installed on the virtual machine.
     * 
     */
    @Import(name="artifacts")
    private @Nullable Output<List<ArtifactInstallPropertiesArgs>> artifacts;

    /**
     * @return The artifacts to be installed on the virtual machine.
     * 
     */
    public Optional<Output<List<ArtifactInstallPropertiesArgs>>> artifacts() {
        return Optional.ofNullable(this.artifacts);
    }

    /**
     * The creation date of the virtual machine.
     * 
     */
    @Import(name="createdDate")
    private @Nullable Output<String> createdDate;

    /**
     * @return The creation date of the virtual machine.
     * 
     */
    public Optional<Output<String>> createdDate() {
        return Optional.ofNullable(this.createdDate);
    }

    /**
     * The custom image identifier of the virtual machine.
     * 
     */
    @Import(name="customImageId")
    private @Nullable Output<String> customImageId;

    /**
     * @return The custom image identifier of the virtual machine.
     * 
     */
    public Optional<Output<String>> customImageId() {
        return Optional.ofNullable(this.customImageId);
    }

    /**
     * New or existing data disks to attach to the virtual machine after creation
     * 
     */
    @Import(name="dataDiskParameters")
    private @Nullable Output<List<DataDiskPropertiesArgs>> dataDiskParameters;

    /**
     * @return New or existing data disks to attach to the virtual machine after creation
     * 
     */
    public Optional<Output<List<DataDiskPropertiesArgs>>> dataDiskParameters() {
        return Optional.ofNullable(this.dataDiskParameters);
    }

    /**
     * Indicates whether the virtual machine is to be created without a public IP address.
     * 
     */
    @Import(name="disallowPublicIpAddress")
    private @Nullable Output<Boolean> disallowPublicIpAddress;

    /**
     * @return Indicates whether the virtual machine is to be created without a public IP address.
     * 
     */
    public Optional<Output<Boolean>> disallowPublicIpAddress() {
        return Optional.ofNullable(this.disallowPublicIpAddress);
    }

    /**
     * The resource ID of the environment that contains this virtual machine, if any.
     * 
     */
    @Import(name="environmentId")
    private @Nullable Output<String> environmentId;

    /**
     * @return The resource ID of the environment that contains this virtual machine, if any.
     * 
     */
    public Optional<Output<String>> environmentId() {
        return Optional.ofNullable(this.environmentId);
    }

    /**
     * The expiration date for VM.
     * 
     */
    @Import(name="expirationDate")
    private @Nullable Output<String> expirationDate;

    /**
     * @return The expiration date for VM.
     * 
     */
    public Optional<Output<String>> expirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }

    /**
     * The Microsoft Azure Marketplace image reference of the virtual machine.
     * 
     */
    @Import(name="galleryImageReference")
    private @Nullable Output<GalleryImageReferenceArgs> galleryImageReference;

    /**
     * @return The Microsoft Azure Marketplace image reference of the virtual machine.
     * 
     */
    public Optional<Output<GalleryImageReferenceArgs>> galleryImageReference() {
        return Optional.ofNullable(this.galleryImageReference);
    }

    /**
     * Indicates whether this virtual machine uses an SSH key for authentication.
     * 
     */
    @Import(name="isAuthenticationWithSshKey")
    private @Nullable Output<Boolean> isAuthenticationWithSshKey;

    /**
     * @return Indicates whether this virtual machine uses an SSH key for authentication.
     * 
     */
    public Optional<Output<Boolean>> isAuthenticationWithSshKey() {
        return Optional.ofNullable(this.isAuthenticationWithSshKey);
    }

    /**
     * The name of the lab.
     * 
     */
    @Import(name="labName", required=true)
    private Output<String> labName;

    /**
     * @return The name of the lab.
     * 
     */
    public Output<String> labName() {
        return this.labName;
    }

    /**
     * The lab subnet name of the virtual machine.
     * 
     */
    @Import(name="labSubnetName")
    private @Nullable Output<String> labSubnetName;

    /**
     * @return The lab subnet name of the virtual machine.
     * 
     */
    public Optional<Output<String>> labSubnetName() {
        return Optional.ofNullable(this.labSubnetName);
    }

    /**
     * The lab virtual network identifier of the virtual machine.
     * 
     */
    @Import(name="labVirtualNetworkId")
    private @Nullable Output<String> labVirtualNetworkId;

    /**
     * @return The lab virtual network identifier of the virtual machine.
     * 
     */
    public Optional<Output<String>> labVirtualNetworkId() {
        return Optional.ofNullable(this.labVirtualNetworkId);
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the virtual machine.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the virtual machine.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The network interface properties.
     * 
     */
    @Import(name="networkInterface")
    private @Nullable Output<NetworkInterfacePropertiesArgs> networkInterface;

    /**
     * @return The network interface properties.
     * 
     */
    public Optional<Output<NetworkInterfacePropertiesArgs>> networkInterface() {
        return Optional.ofNullable(this.networkInterface);
    }

    /**
     * The notes of the virtual machine.
     * 
     */
    @Import(name="notes")
    private @Nullable Output<String> notes;

    /**
     * @return The notes of the virtual machine.
     * 
     */
    public Optional<Output<String>> notes() {
        return Optional.ofNullable(this.notes);
    }

    /**
     * The object identifier of the owner of the virtual machine.
     * 
     */
    @Import(name="ownerObjectId")
    private @Nullable Output<String> ownerObjectId;

    /**
     * @return The object identifier of the owner of the virtual machine.
     * 
     */
    public Optional<Output<String>> ownerObjectId() {
        return Optional.ofNullable(this.ownerObjectId);
    }

    /**
     * The user principal name of the virtual machine owner.
     * 
     */
    @Import(name="ownerUserPrincipalName")
    private @Nullable Output<String> ownerUserPrincipalName;

    /**
     * @return The user principal name of the virtual machine owner.
     * 
     */
    public Optional<Output<String>> ownerUserPrincipalName() {
        return Optional.ofNullable(this.ownerUserPrincipalName);
    }

    /**
     * The password of the virtual machine administrator.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password of the virtual machine administrator.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The id of the plan associated with the virtual machine image
     * 
     */
    @Import(name="planId")
    private @Nullable Output<String> planId;

    /**
     * @return The id of the plan associated with the virtual machine image
     * 
     */
    public Optional<Output<String>> planId() {
        return Optional.ofNullable(this.planId);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Virtual Machine schedules to be created
     * 
     */
    @Import(name="scheduleParameters")
    private @Nullable Output<List<ScheduleCreationParameterArgs>> scheduleParameters;

    /**
     * @return Virtual Machine schedules to be created
     * 
     */
    public Optional<Output<List<ScheduleCreationParameterArgs>>> scheduleParameters() {
        return Optional.ofNullable(this.scheduleParameters);
    }

    /**
     * The size of the virtual machine.
     * 
     */
    @Import(name="size")
    private @Nullable Output<String> size;

    /**
     * @return The size of the virtual machine.
     * 
     */
    public Optional<Output<String>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The SSH key of the virtual machine administrator.
     * 
     */
    @Import(name="sshKey")
    private @Nullable Output<String> sshKey;

    /**
     * @return The SSH key of the virtual machine administrator.
     * 
     */
    public Optional<Output<String>> sshKey() {
        return Optional.ofNullable(this.sshKey);
    }

    /**
     * Storage type to use for virtual machine (i.e. Standard, Premium).
     * 
     */
    @Import(name="storageType")
    private @Nullable Output<String> storageType;

    /**
     * @return Storage type to use for virtual machine (i.e. Standard, Premium).
     * 
     */
    public Optional<Output<String>> storageType() {
        return Optional.ofNullable(this.storageType);
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The user name of the virtual machine.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return The user name of the virtual machine.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private VirtualMachineArgs() {}

    private VirtualMachineArgs(VirtualMachineArgs $) {
        this.allowClaim = $.allowClaim;
        this.artifacts = $.artifacts;
        this.createdDate = $.createdDate;
        this.customImageId = $.customImageId;
        this.dataDiskParameters = $.dataDiskParameters;
        this.disallowPublicIpAddress = $.disallowPublicIpAddress;
        this.environmentId = $.environmentId;
        this.expirationDate = $.expirationDate;
        this.galleryImageReference = $.galleryImageReference;
        this.isAuthenticationWithSshKey = $.isAuthenticationWithSshKey;
        this.labName = $.labName;
        this.labSubnetName = $.labSubnetName;
        this.labVirtualNetworkId = $.labVirtualNetworkId;
        this.location = $.location;
        this.name = $.name;
        this.networkInterface = $.networkInterface;
        this.notes = $.notes;
        this.ownerObjectId = $.ownerObjectId;
        this.ownerUserPrincipalName = $.ownerUserPrincipalName;
        this.password = $.password;
        this.planId = $.planId;
        this.resourceGroupName = $.resourceGroupName;
        this.scheduleParameters = $.scheduleParameters;
        this.size = $.size;
        this.sshKey = $.sshKey;
        this.storageType = $.storageType;
        this.tags = $.tags;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineArgs $;

        public Builder() {
            $ = new VirtualMachineArgs();
        }

        public Builder(VirtualMachineArgs defaults) {
            $ = new VirtualMachineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowClaim Indicates whether another user can take ownership of the virtual machine
         * 
         * @return builder
         * 
         */
        public Builder allowClaim(@Nullable Output<Boolean> allowClaim) {
            $.allowClaim = allowClaim;
            return this;
        }

        /**
         * @param allowClaim Indicates whether another user can take ownership of the virtual machine
         * 
         * @return builder
         * 
         */
        public Builder allowClaim(Boolean allowClaim) {
            return allowClaim(Output.of(allowClaim));
        }

        /**
         * @param artifacts The artifacts to be installed on the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder artifacts(@Nullable Output<List<ArtifactInstallPropertiesArgs>> artifacts) {
            $.artifacts = artifacts;
            return this;
        }

        /**
         * @param artifacts The artifacts to be installed on the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder artifacts(List<ArtifactInstallPropertiesArgs> artifacts) {
            return artifacts(Output.of(artifacts));
        }

        /**
         * @param artifacts The artifacts to be installed on the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder artifacts(ArtifactInstallPropertiesArgs... artifacts) {
            return artifacts(List.of(artifacts));
        }

        /**
         * @param createdDate The creation date of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder createdDate(@Nullable Output<String> createdDate) {
            $.createdDate = createdDate;
            return this;
        }

        /**
         * @param createdDate The creation date of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder createdDate(String createdDate) {
            return createdDate(Output.of(createdDate));
        }

        /**
         * @param customImageId The custom image identifier of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder customImageId(@Nullable Output<String> customImageId) {
            $.customImageId = customImageId;
            return this;
        }

        /**
         * @param customImageId The custom image identifier of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder customImageId(String customImageId) {
            return customImageId(Output.of(customImageId));
        }

        /**
         * @param dataDiskParameters New or existing data disks to attach to the virtual machine after creation
         * 
         * @return builder
         * 
         */
        public Builder dataDiskParameters(@Nullable Output<List<DataDiskPropertiesArgs>> dataDiskParameters) {
            $.dataDiskParameters = dataDiskParameters;
            return this;
        }

        /**
         * @param dataDiskParameters New or existing data disks to attach to the virtual machine after creation
         * 
         * @return builder
         * 
         */
        public Builder dataDiskParameters(List<DataDiskPropertiesArgs> dataDiskParameters) {
            return dataDiskParameters(Output.of(dataDiskParameters));
        }

        /**
         * @param dataDiskParameters New or existing data disks to attach to the virtual machine after creation
         * 
         * @return builder
         * 
         */
        public Builder dataDiskParameters(DataDiskPropertiesArgs... dataDiskParameters) {
            return dataDiskParameters(List.of(dataDiskParameters));
        }

        /**
         * @param disallowPublicIpAddress Indicates whether the virtual machine is to be created without a public IP address.
         * 
         * @return builder
         * 
         */
        public Builder disallowPublicIpAddress(@Nullable Output<Boolean> disallowPublicIpAddress) {
            $.disallowPublicIpAddress = disallowPublicIpAddress;
            return this;
        }

        /**
         * @param disallowPublicIpAddress Indicates whether the virtual machine is to be created without a public IP address.
         * 
         * @return builder
         * 
         */
        public Builder disallowPublicIpAddress(Boolean disallowPublicIpAddress) {
            return disallowPublicIpAddress(Output.of(disallowPublicIpAddress));
        }

        /**
         * @param environmentId The resource ID of the environment that contains this virtual machine, if any.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(@Nullable Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        /**
         * @param environmentId The resource ID of the environment that contains this virtual machine, if any.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        /**
         * @param expirationDate The expiration date for VM.
         * 
         * @return builder
         * 
         */
        public Builder expirationDate(@Nullable Output<String> expirationDate) {
            $.expirationDate = expirationDate;
            return this;
        }

        /**
         * @param expirationDate The expiration date for VM.
         * 
         * @return builder
         * 
         */
        public Builder expirationDate(String expirationDate) {
            return expirationDate(Output.of(expirationDate));
        }

        /**
         * @param galleryImageReference The Microsoft Azure Marketplace image reference of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder galleryImageReference(@Nullable Output<GalleryImageReferenceArgs> galleryImageReference) {
            $.galleryImageReference = galleryImageReference;
            return this;
        }

        /**
         * @param galleryImageReference The Microsoft Azure Marketplace image reference of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder galleryImageReference(GalleryImageReferenceArgs galleryImageReference) {
            return galleryImageReference(Output.of(galleryImageReference));
        }

        /**
         * @param isAuthenticationWithSshKey Indicates whether this virtual machine uses an SSH key for authentication.
         * 
         * @return builder
         * 
         */
        public Builder isAuthenticationWithSshKey(@Nullable Output<Boolean> isAuthenticationWithSshKey) {
            $.isAuthenticationWithSshKey = isAuthenticationWithSshKey;
            return this;
        }

        /**
         * @param isAuthenticationWithSshKey Indicates whether this virtual machine uses an SSH key for authentication.
         * 
         * @return builder
         * 
         */
        public Builder isAuthenticationWithSshKey(Boolean isAuthenticationWithSshKey) {
            return isAuthenticationWithSshKey(Output.of(isAuthenticationWithSshKey));
        }

        /**
         * @param labName The name of the lab.
         * 
         * @return builder
         * 
         */
        public Builder labName(Output<String> labName) {
            $.labName = labName;
            return this;
        }

        /**
         * @param labName The name of the lab.
         * 
         * @return builder
         * 
         */
        public Builder labName(String labName) {
            return labName(Output.of(labName));
        }

        /**
         * @param labSubnetName The lab subnet name of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder labSubnetName(@Nullable Output<String> labSubnetName) {
            $.labSubnetName = labSubnetName;
            return this;
        }

        /**
         * @param labSubnetName The lab subnet name of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder labSubnetName(String labSubnetName) {
            return labSubnetName(Output.of(labSubnetName));
        }

        /**
         * @param labVirtualNetworkId The lab virtual network identifier of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder labVirtualNetworkId(@Nullable Output<String> labVirtualNetworkId) {
            $.labVirtualNetworkId = labVirtualNetworkId;
            return this;
        }

        /**
         * @param labVirtualNetworkId The lab virtual network identifier of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder labVirtualNetworkId(String labVirtualNetworkId) {
            return labVirtualNetworkId(Output.of(labVirtualNetworkId));
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkInterface The network interface properties.
         * 
         * @return builder
         * 
         */
        public Builder networkInterface(@Nullable Output<NetworkInterfacePropertiesArgs> networkInterface) {
            $.networkInterface = networkInterface;
            return this;
        }

        /**
         * @param networkInterface The network interface properties.
         * 
         * @return builder
         * 
         */
        public Builder networkInterface(NetworkInterfacePropertiesArgs networkInterface) {
            return networkInterface(Output.of(networkInterface));
        }

        /**
         * @param notes The notes of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder notes(@Nullable Output<String> notes) {
            $.notes = notes;
            return this;
        }

        /**
         * @param notes The notes of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder notes(String notes) {
            return notes(Output.of(notes));
        }

        /**
         * @param ownerObjectId The object identifier of the owner of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder ownerObjectId(@Nullable Output<String> ownerObjectId) {
            $.ownerObjectId = ownerObjectId;
            return this;
        }

        /**
         * @param ownerObjectId The object identifier of the owner of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder ownerObjectId(String ownerObjectId) {
            return ownerObjectId(Output.of(ownerObjectId));
        }

        /**
         * @param ownerUserPrincipalName The user principal name of the virtual machine owner.
         * 
         * @return builder
         * 
         */
        public Builder ownerUserPrincipalName(@Nullable Output<String> ownerUserPrincipalName) {
            $.ownerUserPrincipalName = ownerUserPrincipalName;
            return this;
        }

        /**
         * @param ownerUserPrincipalName The user principal name of the virtual machine owner.
         * 
         * @return builder
         * 
         */
        public Builder ownerUserPrincipalName(String ownerUserPrincipalName) {
            return ownerUserPrincipalName(Output.of(ownerUserPrincipalName));
        }

        /**
         * @param password The password of the virtual machine administrator.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password of the virtual machine administrator.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param planId The id of the plan associated with the virtual machine image
         * 
         * @return builder
         * 
         */
        public Builder planId(@Nullable Output<String> planId) {
            $.planId = planId;
            return this;
        }

        /**
         * @param planId The id of the plan associated with the virtual machine image
         * 
         * @return builder
         * 
         */
        public Builder planId(String planId) {
            return planId(Output.of(planId));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param scheduleParameters Virtual Machine schedules to be created
         * 
         * @return builder
         * 
         */
        public Builder scheduleParameters(@Nullable Output<List<ScheduleCreationParameterArgs>> scheduleParameters) {
            $.scheduleParameters = scheduleParameters;
            return this;
        }

        /**
         * @param scheduleParameters Virtual Machine schedules to be created
         * 
         * @return builder
         * 
         */
        public Builder scheduleParameters(List<ScheduleCreationParameterArgs> scheduleParameters) {
            return scheduleParameters(Output.of(scheduleParameters));
        }

        /**
         * @param scheduleParameters Virtual Machine schedules to be created
         * 
         * @return builder
         * 
         */
        public Builder scheduleParameters(ScheduleCreationParameterArgs... scheduleParameters) {
            return scheduleParameters(List.of(scheduleParameters));
        }

        /**
         * @param size The size of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<String> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder size(String size) {
            return size(Output.of(size));
        }

        /**
         * @param sshKey The SSH key of the virtual machine administrator.
         * 
         * @return builder
         * 
         */
        public Builder sshKey(@Nullable Output<String> sshKey) {
            $.sshKey = sshKey;
            return this;
        }

        /**
         * @param sshKey The SSH key of the virtual machine administrator.
         * 
         * @return builder
         * 
         */
        public Builder sshKey(String sshKey) {
            return sshKey(Output.of(sshKey));
        }

        /**
         * @param storageType Storage type to use for virtual machine (i.e. Standard, Premium).
         * 
         * @return builder
         * 
         */
        public Builder storageType(@Nullable Output<String> storageType) {
            $.storageType = storageType;
            return this;
        }

        /**
         * @param storageType Storage type to use for virtual machine (i.e. Standard, Premium).
         * 
         * @return builder
         * 
         */
        public Builder storageType(String storageType) {
            return storageType(Output.of(storageType));
        }

        /**
         * @param tags The tags of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param userName The user name of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The user name of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public VirtualMachineArgs build() {
            $.allowClaim = Codegen.booleanProp("allowClaim").output().arg($.allowClaim).def(false).getNullable();
            $.disallowPublicIpAddress = Codegen.booleanProp("disallowPublicIpAddress").output().arg($.disallowPublicIpAddress).def(false).getNullable();
            $.labName = Objects.requireNonNull($.labName, "expected parameter 'labName' to be non-null");
            $.ownerObjectId = Codegen.stringProp("ownerObjectId").output().arg($.ownerObjectId).def("dynamicValue").getNullable();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.storageType = Codegen.stringProp("storageType").output().arg($.storageType).def("labStorageType").getNullable();
            return $;
        }
    }

}
