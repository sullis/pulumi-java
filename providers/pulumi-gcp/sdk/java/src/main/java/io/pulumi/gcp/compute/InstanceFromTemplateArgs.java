// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateAdvancedMachineFeaturesArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateAttachedDiskArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateBootDiskArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateConfidentialInstanceConfigArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateGuestAcceleratorArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkPerformanceConfigArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateReservationAffinityArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateScratchDiskArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateServiceAccountArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateShieldedInstanceConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromTemplateArgs Empty = new InstanceFromTemplateArgs();

    /**
     * Controls for advanced machine-related behavior features.
     * 
     */
    @InputImport(name="advancedMachineFeatures")
    private final @Nullable Input<InstanceFromTemplateAdvancedMachineFeaturesArgs> advancedMachineFeatures;

    public Input<InstanceFromTemplateAdvancedMachineFeaturesArgs> getAdvancedMachineFeatures() {
        return this.advancedMachineFeatures == null ? Input.empty() : this.advancedMachineFeatures;
    }

    /**
     * If true, allows Terraform to stop the instance to update its properties. If you try to update a property that requires
     * stopping the instance without setting this field, the update will fail.
     * 
     */
    @InputImport(name="allowStoppingForUpdate")
    private final @Nullable Input<Boolean> allowStoppingForUpdate;

    public Input<Boolean> getAllowStoppingForUpdate() {
        return this.allowStoppingForUpdate == null ? Input.empty() : this.allowStoppingForUpdate;
    }

    /**
     * List of disks attached to the instance
     * 
     */
    @InputImport(name="attachedDisks")
    private final @Nullable Input<List<InstanceFromTemplateAttachedDiskArgs>> attachedDisks;

    public Input<List<InstanceFromTemplateAttachedDiskArgs>> getAttachedDisks() {
        return this.attachedDisks == null ? Input.empty() : this.attachedDisks;
    }

    /**
     * The boot disk for the instance.
     * 
     */
    @InputImport(name="bootDisk")
    private final @Nullable Input<InstanceFromTemplateBootDiskArgs> bootDisk;

    public Input<InstanceFromTemplateBootDiskArgs> getBootDisk() {
        return this.bootDisk == null ? Input.empty() : this.bootDisk;
    }

    /**
     * Whether sending and receiving of packets with non-matching source or destination IPs is allowed.
     * 
     */
    @InputImport(name="canIpForward")
    private final @Nullable Input<Boolean> canIpForward;

    public Input<Boolean> getCanIpForward() {
        return this.canIpForward == null ? Input.empty() : this.canIpForward;
    }

    /**
     * The Confidential VM config being used by the instance. on_host_maintenance has to be set to TERMINATE or this will fail
     * to create.
     * 
     */
    @InputImport(name="confidentialInstanceConfig")
    private final @Nullable Input<InstanceFromTemplateConfidentialInstanceConfigArgs> confidentialInstanceConfig;

    public Input<InstanceFromTemplateConfidentialInstanceConfigArgs> getConfidentialInstanceConfig() {
        return this.confidentialInstanceConfig == null ? Input.empty() : this.confidentialInstanceConfig;
    }

    /**
     * Whether deletion protection is enabled on this instance.
     * 
     */
    @InputImport(name="deletionProtection")
    private final @Nullable Input<Boolean> deletionProtection;

    public Input<Boolean> getDeletionProtection() {
        return this.deletionProtection == null ? Input.empty() : this.deletionProtection;
    }

    /**
     * A brief description of the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Desired status of the instance. Either "RUNNING" or "TERMINATED".
     * 
     */
    @InputImport(name="desiredStatus")
    private final @Nullable Input<String> desiredStatus;

    public Input<String> getDesiredStatus() {
        return this.desiredStatus == null ? Input.empty() : this.desiredStatus;
    }

    /**
     * Whether the instance has virtual displays enabled.
     * 
     */
    @InputImport(name="enableDisplay")
    private final @Nullable Input<Boolean> enableDisplay;

    public Input<Boolean> getEnableDisplay() {
        return this.enableDisplay == null ? Input.empty() : this.enableDisplay;
    }

    /**
     * List of the type and count of accelerator cards attached to the instance.
     * 
     */
    @InputImport(name="guestAccelerators")
    private final @Nullable Input<List<InstanceFromTemplateGuestAcceleratorArgs>> guestAccelerators;

    public Input<List<InstanceFromTemplateGuestAcceleratorArgs>> getGuestAccelerators() {
        return this.guestAccelerators == null ? Input.empty() : this.guestAccelerators;
    }

    /**
     * A custom hostname for the instance. Must be a fully qualified DNS name and RFC-1035-valid. Valid format is a series of
     * labels 1-63 characters long matching the regular expression [a-z]([-a-z0-9]*[a-z0-9]), concatenated with periods. The
     * entire hostname must not exceed 253 characters. Changing this forces a new resource to be created.
     * 
     */
    @InputImport(name="hostname")
    private final @Nullable Input<String> hostname;

    public Input<String> getHostname() {
        return this.hostname == null ? Input.empty() : this.hostname;
    }

    /**
     * A set of key/value label pairs assigned to the instance.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The machine type to create.
     * 
     */
    @InputImport(name="machineType")
    private final @Nullable Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType == null ? Input.empty() : this.machineType;
    }

    /**
     * Metadata key/value pairs made available within the instance.
     * 
     */
    @InputImport(name="metadata")
    private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Metadata startup scripts made available within the instance.
     * 
     */
    @InputImport(name="metadataStartupScript")
    private final @Nullable Input<String> metadataStartupScript;

    public Input<String> getMetadataStartupScript() {
        return this.metadataStartupScript == null ? Input.empty() : this.metadataStartupScript;
    }

    /**
     * The minimum CPU platform specified for the VM instance.
     * 
     */
    @InputImport(name="minCpuPlatform")
    private final @Nullable Input<String> minCpuPlatform;

    public Input<String> getMinCpuPlatform() {
        return this.minCpuPlatform == null ? Input.empty() : this.minCpuPlatform;
    }

    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The networks attached to the instance.
     * 
     */
    @InputImport(name="networkInterfaces")
    private final @Nullable Input<List<InstanceFromTemplateNetworkInterfaceArgs>> networkInterfaces;

    public Input<List<InstanceFromTemplateNetworkInterfaceArgs>> getNetworkInterfaces() {
        return this.networkInterfaces == null ? Input.empty() : this.networkInterfaces;
    }

    /**
     * Configures network performance settings for the instance. If not specified, the instance will be created with its
     * default network performance configuration.
     * 
     */
    @InputImport(name="networkPerformanceConfig")
    private final @Nullable Input<InstanceFromTemplateNetworkPerformanceConfigArgs> networkPerformanceConfig;

    public Input<InstanceFromTemplateNetworkPerformanceConfigArgs> getNetworkPerformanceConfig() {
        return this.networkPerformanceConfig == null ? Input.empty() : this.networkPerformanceConfig;
    }

    /**
     * The ID of the project in which the resource belongs. If self_link is provided, this value is ignored. If neither
     * self_link nor project are provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Specifies the reservations that this instance can consume from.
     * 
     */
    @InputImport(name="reservationAffinity")
    private final @Nullable Input<InstanceFromTemplateReservationAffinityArgs> reservationAffinity;

    public Input<InstanceFromTemplateReservationAffinityArgs> getReservationAffinity() {
        return this.reservationAffinity == null ? Input.empty() : this.reservationAffinity;
    }

    /**
     * A list of short names or self_links of resource policies to attach to the instance. Currently a max of 1 resource policy
     * is supported.
     * 
     */
    @InputImport(name="resourcePolicies")
    private final @Nullable Input<String> resourcePolicies;

    public Input<String> getResourcePolicies() {
        return this.resourcePolicies == null ? Input.empty() : this.resourcePolicies;
    }

    /**
     * The scheduling strategy being used by the instance.
     * 
     */
    @InputImport(name="scheduling")
    private final @Nullable Input<InstanceFromTemplateSchedulingArgs> scheduling;

    public Input<InstanceFromTemplateSchedulingArgs> getScheduling() {
        return this.scheduling == null ? Input.empty() : this.scheduling;
    }

    /**
     * The scratch disks attached to the instance.
     * 
     */
    @InputImport(name="scratchDisks")
    private final @Nullable Input<List<InstanceFromTemplateScratchDiskArgs>> scratchDisks;

    public Input<List<InstanceFromTemplateScratchDiskArgs>> getScratchDisks() {
        return this.scratchDisks == null ? Input.empty() : this.scratchDisks;
    }

    /**
     * The service account to attach to the instance.
     * 
     */
    @InputImport(name="serviceAccount")
    private final @Nullable Input<InstanceFromTemplateServiceAccountArgs> serviceAccount;

    public Input<InstanceFromTemplateServiceAccountArgs> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    /**
     * The shielded vm config being used by the instance.
     * 
     */
    @InputImport(name="shieldedInstanceConfig")
    private final @Nullable Input<InstanceFromTemplateShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Input<InstanceFromTemplateShieldedInstanceConfigArgs> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig == null ? Input.empty() : this.shieldedInstanceConfig;
    }

    /**
     * Name or self link of an instance
     * template to create the instance based on.
     * 
     */
    @InputImport(name="sourceInstanceTemplate", required=true)
    private final Input<String> sourceInstanceTemplate;

    public Input<String> getSourceInstanceTemplate() {
        return this.sourceInstanceTemplate;
    }

    /**
     * The list of tags attached to the instance.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<String>> tags;

    public Input<List<String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The zone that the machine should be created in. If not
     * set, the provider zone is used.
     * 
     */
    @InputImport(name="zone")
    private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public InstanceFromTemplateArgs(
        @Nullable Input<InstanceFromTemplateAdvancedMachineFeaturesArgs> advancedMachineFeatures,
        @Nullable Input<Boolean> allowStoppingForUpdate,
        @Nullable Input<List<InstanceFromTemplateAttachedDiskArgs>> attachedDisks,
        @Nullable Input<InstanceFromTemplateBootDiskArgs> bootDisk,
        @Nullable Input<Boolean> canIpForward,
        @Nullable Input<InstanceFromTemplateConfidentialInstanceConfigArgs> confidentialInstanceConfig,
        @Nullable Input<Boolean> deletionProtection,
        @Nullable Input<String> description,
        @Nullable Input<String> desiredStatus,
        @Nullable Input<Boolean> enableDisplay,
        @Nullable Input<List<InstanceFromTemplateGuestAcceleratorArgs>> guestAccelerators,
        @Nullable Input<String> hostname,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> machineType,
        @Nullable Input<Map<String,String>> metadata,
        @Nullable Input<String> metadataStartupScript,
        @Nullable Input<String> minCpuPlatform,
        @Nullable Input<String> name,
        @Nullable Input<List<InstanceFromTemplateNetworkInterfaceArgs>> networkInterfaces,
        @Nullable Input<InstanceFromTemplateNetworkPerformanceConfigArgs> networkPerformanceConfig,
        @Nullable Input<String> project,
        @Nullable Input<InstanceFromTemplateReservationAffinityArgs> reservationAffinity,
        @Nullable Input<String> resourcePolicies,
        @Nullable Input<InstanceFromTemplateSchedulingArgs> scheduling,
        @Nullable Input<List<InstanceFromTemplateScratchDiskArgs>> scratchDisks,
        @Nullable Input<InstanceFromTemplateServiceAccountArgs> serviceAccount,
        @Nullable Input<InstanceFromTemplateShieldedInstanceConfigArgs> shieldedInstanceConfig,
        Input<String> sourceInstanceTemplate,
        @Nullable Input<List<String>> tags,
        @Nullable Input<String> zone) {
        this.advancedMachineFeatures = advancedMachineFeatures;
        this.allowStoppingForUpdate = allowStoppingForUpdate;
        this.attachedDisks = attachedDisks;
        this.bootDisk = bootDisk;
        this.canIpForward = canIpForward;
        this.confidentialInstanceConfig = confidentialInstanceConfig;
        this.deletionProtection = deletionProtection;
        this.description = description;
        this.desiredStatus = desiredStatus;
        this.enableDisplay = enableDisplay;
        this.guestAccelerators = guestAccelerators;
        this.hostname = hostname;
        this.labels = labels;
        this.machineType = machineType;
        this.metadata = metadata;
        this.metadataStartupScript = metadataStartupScript;
        this.minCpuPlatform = minCpuPlatform;
        this.name = name;
        this.networkInterfaces = networkInterfaces;
        this.networkPerformanceConfig = networkPerformanceConfig;
        this.project = project;
        this.reservationAffinity = reservationAffinity;
        this.resourcePolicies = resourcePolicies;
        this.scheduling = scheduling;
        this.scratchDisks = scratchDisks;
        this.serviceAccount = serviceAccount;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.sourceInstanceTemplate = Objects.requireNonNull(sourceInstanceTemplate, "expected parameter 'sourceInstanceTemplate' to be non-null");
        this.tags = tags;
        this.zone = zone;
    }

    private InstanceFromTemplateArgs() {
        this.advancedMachineFeatures = Input.empty();
        this.allowStoppingForUpdate = Input.empty();
        this.attachedDisks = Input.empty();
        this.bootDisk = Input.empty();
        this.canIpForward = Input.empty();
        this.confidentialInstanceConfig = Input.empty();
        this.deletionProtection = Input.empty();
        this.description = Input.empty();
        this.desiredStatus = Input.empty();
        this.enableDisplay = Input.empty();
        this.guestAccelerators = Input.empty();
        this.hostname = Input.empty();
        this.labels = Input.empty();
        this.machineType = Input.empty();
        this.metadata = Input.empty();
        this.metadataStartupScript = Input.empty();
        this.minCpuPlatform = Input.empty();
        this.name = Input.empty();
        this.networkInterfaces = Input.empty();
        this.networkPerformanceConfig = Input.empty();
        this.project = Input.empty();
        this.reservationAffinity = Input.empty();
        this.resourcePolicies = Input.empty();
        this.scheduling = Input.empty();
        this.scratchDisks = Input.empty();
        this.serviceAccount = Input.empty();
        this.shieldedInstanceConfig = Input.empty();
        this.sourceInstanceTemplate = Input.empty();
        this.tags = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InstanceFromTemplateAdvancedMachineFeaturesArgs> advancedMachineFeatures;
        private @Nullable Input<Boolean> allowStoppingForUpdate;
        private @Nullable Input<List<InstanceFromTemplateAttachedDiskArgs>> attachedDisks;
        private @Nullable Input<InstanceFromTemplateBootDiskArgs> bootDisk;
        private @Nullable Input<Boolean> canIpForward;
        private @Nullable Input<InstanceFromTemplateConfidentialInstanceConfigArgs> confidentialInstanceConfig;
        private @Nullable Input<Boolean> deletionProtection;
        private @Nullable Input<String> description;
        private @Nullable Input<String> desiredStatus;
        private @Nullable Input<Boolean> enableDisplay;
        private @Nullable Input<List<InstanceFromTemplateGuestAcceleratorArgs>> guestAccelerators;
        private @Nullable Input<String> hostname;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> machineType;
        private @Nullable Input<Map<String,String>> metadata;
        private @Nullable Input<String> metadataStartupScript;
        private @Nullable Input<String> minCpuPlatform;
        private @Nullable Input<String> name;
        private @Nullable Input<List<InstanceFromTemplateNetworkInterfaceArgs>> networkInterfaces;
        private @Nullable Input<InstanceFromTemplateNetworkPerformanceConfigArgs> networkPerformanceConfig;
        private @Nullable Input<String> project;
        private @Nullable Input<InstanceFromTemplateReservationAffinityArgs> reservationAffinity;
        private @Nullable Input<String> resourcePolicies;
        private @Nullable Input<InstanceFromTemplateSchedulingArgs> scheduling;
        private @Nullable Input<List<InstanceFromTemplateScratchDiskArgs>> scratchDisks;
        private @Nullable Input<InstanceFromTemplateServiceAccountArgs> serviceAccount;
        private @Nullable Input<InstanceFromTemplateShieldedInstanceConfigArgs> shieldedInstanceConfig;
        private Input<String> sourceInstanceTemplate;
        private @Nullable Input<List<String>> tags;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedMachineFeatures = defaults.advancedMachineFeatures;
    	      this.allowStoppingForUpdate = defaults.allowStoppingForUpdate;
    	      this.attachedDisks = defaults.attachedDisks;
    	      this.bootDisk = defaults.bootDisk;
    	      this.canIpForward = defaults.canIpForward;
    	      this.confidentialInstanceConfig = defaults.confidentialInstanceConfig;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.description = defaults.description;
    	      this.desiredStatus = defaults.desiredStatus;
    	      this.enableDisplay = defaults.enableDisplay;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.hostname = defaults.hostname;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.metadataStartupScript = defaults.metadataStartupScript;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.name = defaults.name;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.networkPerformanceConfig = defaults.networkPerformanceConfig;
    	      this.project = defaults.project;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.scheduling = defaults.scheduling;
    	      this.scratchDisks = defaults.scratchDisks;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.sourceInstanceTemplate = defaults.sourceInstanceTemplate;
    	      this.tags = defaults.tags;
    	      this.zone = defaults.zone;
        }

        public Builder setAdvancedMachineFeatures(@Nullable Input<InstanceFromTemplateAdvancedMachineFeaturesArgs> advancedMachineFeatures) {
            this.advancedMachineFeatures = advancedMachineFeatures;
            return this;
        }

        public Builder setAdvancedMachineFeatures(@Nullable InstanceFromTemplateAdvancedMachineFeaturesArgs advancedMachineFeatures) {
            this.advancedMachineFeatures = Input.ofNullable(advancedMachineFeatures);
            return this;
        }

        public Builder setAllowStoppingForUpdate(@Nullable Input<Boolean> allowStoppingForUpdate) {
            this.allowStoppingForUpdate = allowStoppingForUpdate;
            return this;
        }

        public Builder setAllowStoppingForUpdate(@Nullable Boolean allowStoppingForUpdate) {
            this.allowStoppingForUpdate = Input.ofNullable(allowStoppingForUpdate);
            return this;
        }

        public Builder setAttachedDisks(@Nullable Input<List<InstanceFromTemplateAttachedDiskArgs>> attachedDisks) {
            this.attachedDisks = attachedDisks;
            return this;
        }

        public Builder setAttachedDisks(@Nullable List<InstanceFromTemplateAttachedDiskArgs> attachedDisks) {
            this.attachedDisks = Input.ofNullable(attachedDisks);
            return this;
        }

        public Builder setBootDisk(@Nullable Input<InstanceFromTemplateBootDiskArgs> bootDisk) {
            this.bootDisk = bootDisk;
            return this;
        }

        public Builder setBootDisk(@Nullable InstanceFromTemplateBootDiskArgs bootDisk) {
            this.bootDisk = Input.ofNullable(bootDisk);
            return this;
        }

        public Builder setCanIpForward(@Nullable Input<Boolean> canIpForward) {
            this.canIpForward = canIpForward;
            return this;
        }

        public Builder setCanIpForward(@Nullable Boolean canIpForward) {
            this.canIpForward = Input.ofNullable(canIpForward);
            return this;
        }

        public Builder setConfidentialInstanceConfig(@Nullable Input<InstanceFromTemplateConfidentialInstanceConfigArgs> confidentialInstanceConfig) {
            this.confidentialInstanceConfig = confidentialInstanceConfig;
            return this;
        }

        public Builder setConfidentialInstanceConfig(@Nullable InstanceFromTemplateConfidentialInstanceConfigArgs confidentialInstanceConfig) {
            this.confidentialInstanceConfig = Input.ofNullable(confidentialInstanceConfig);
            return this;
        }

        public Builder setDeletionProtection(@Nullable Input<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        public Builder setDeletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Input.ofNullable(deletionProtection);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDesiredStatus(@Nullable Input<String> desiredStatus) {
            this.desiredStatus = desiredStatus;
            return this;
        }

        public Builder setDesiredStatus(@Nullable String desiredStatus) {
            this.desiredStatus = Input.ofNullable(desiredStatus);
            return this;
        }

        public Builder setEnableDisplay(@Nullable Input<Boolean> enableDisplay) {
            this.enableDisplay = enableDisplay;
            return this;
        }

        public Builder setEnableDisplay(@Nullable Boolean enableDisplay) {
            this.enableDisplay = Input.ofNullable(enableDisplay);
            return this;
        }

        public Builder setGuestAccelerators(@Nullable Input<List<InstanceFromTemplateGuestAcceleratorArgs>> guestAccelerators) {
            this.guestAccelerators = guestAccelerators;
            return this;
        }

        public Builder setGuestAccelerators(@Nullable List<InstanceFromTemplateGuestAcceleratorArgs> guestAccelerators) {
            this.guestAccelerators = Input.ofNullable(guestAccelerators);
            return this;
        }

        public Builder setHostname(@Nullable Input<String> hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder setHostname(@Nullable String hostname) {
            this.hostname = Input.ofNullable(hostname);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setMachineType(@Nullable Input<String> machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder setMachineType(@Nullable String machineType) {
            this.machineType = Input.ofNullable(machineType);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setMetadataStartupScript(@Nullable Input<String> metadataStartupScript) {
            this.metadataStartupScript = metadataStartupScript;
            return this;
        }

        public Builder setMetadataStartupScript(@Nullable String metadataStartupScript) {
            this.metadataStartupScript = Input.ofNullable(metadataStartupScript);
            return this;
        }

        public Builder setMinCpuPlatform(@Nullable Input<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder setMinCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Input.ofNullable(minCpuPlatform);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetworkInterfaces(@Nullable Input<List<InstanceFromTemplateNetworkInterfaceArgs>> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder setNetworkInterfaces(@Nullable List<InstanceFromTemplateNetworkInterfaceArgs> networkInterfaces) {
            this.networkInterfaces = Input.ofNullable(networkInterfaces);
            return this;
        }

        public Builder setNetworkPerformanceConfig(@Nullable Input<InstanceFromTemplateNetworkPerformanceConfigArgs> networkPerformanceConfig) {
            this.networkPerformanceConfig = networkPerformanceConfig;
            return this;
        }

        public Builder setNetworkPerformanceConfig(@Nullable InstanceFromTemplateNetworkPerformanceConfigArgs networkPerformanceConfig) {
            this.networkPerformanceConfig = Input.ofNullable(networkPerformanceConfig);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setReservationAffinity(@Nullable Input<InstanceFromTemplateReservationAffinityArgs> reservationAffinity) {
            this.reservationAffinity = reservationAffinity;
            return this;
        }

        public Builder setReservationAffinity(@Nullable InstanceFromTemplateReservationAffinityArgs reservationAffinity) {
            this.reservationAffinity = Input.ofNullable(reservationAffinity);
            return this;
        }

        public Builder setResourcePolicies(@Nullable Input<String> resourcePolicies) {
            this.resourcePolicies = resourcePolicies;
            return this;
        }

        public Builder setResourcePolicies(@Nullable String resourcePolicies) {
            this.resourcePolicies = Input.ofNullable(resourcePolicies);
            return this;
        }

        public Builder setScheduling(@Nullable Input<InstanceFromTemplateSchedulingArgs> scheduling) {
            this.scheduling = scheduling;
            return this;
        }

        public Builder setScheduling(@Nullable InstanceFromTemplateSchedulingArgs scheduling) {
            this.scheduling = Input.ofNullable(scheduling);
            return this;
        }

        public Builder setScratchDisks(@Nullable Input<List<InstanceFromTemplateScratchDiskArgs>> scratchDisks) {
            this.scratchDisks = scratchDisks;
            return this;
        }

        public Builder setScratchDisks(@Nullable List<InstanceFromTemplateScratchDiskArgs> scratchDisks) {
            this.scratchDisks = Input.ofNullable(scratchDisks);
            return this;
        }

        public Builder setServiceAccount(@Nullable Input<InstanceFromTemplateServiceAccountArgs> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccount(@Nullable InstanceFromTemplateServiceAccountArgs serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder setShieldedInstanceConfig(@Nullable Input<InstanceFromTemplateShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        public Builder setShieldedInstanceConfig(@Nullable InstanceFromTemplateShieldedInstanceConfigArgs shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Input.ofNullable(shieldedInstanceConfig);
            return this;
        }

        public Builder setSourceInstanceTemplate(Input<String> sourceInstanceTemplate) {
            this.sourceInstanceTemplate = Objects.requireNonNull(sourceInstanceTemplate);
            return this;
        }

        public Builder setSourceInstanceTemplate(String sourceInstanceTemplate) {
            this.sourceInstanceTemplate = Input.of(Objects.requireNonNull(sourceInstanceTemplate));
            return this;
        }

        public Builder setTags(@Nullable Input<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }

        public InstanceFromTemplateArgs build() {
            return new InstanceFromTemplateArgs(advancedMachineFeatures, allowStoppingForUpdate, attachedDisks, bootDisk, canIpForward, confidentialInstanceConfig, deletionProtection, description, desiredStatus, enableDisplay, guestAccelerators, hostname, labels, machineType, metadata, metadataStartupScript, minCpuPlatform, name, networkInterfaces, networkPerformanceConfig, project, reservationAffinity, resourcePolicies, scheduling, scratchDisks, serviceAccount, shieldedInstanceConfig, sourceInstanceTemplate, tags, zone);
        }
    }
}
