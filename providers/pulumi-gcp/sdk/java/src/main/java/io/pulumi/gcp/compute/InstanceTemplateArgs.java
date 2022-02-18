// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.InstanceTemplateAdvancedMachineFeaturesArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateConfidentialInstanceConfigArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateDiskArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateGuestAcceleratorArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateNetworkPerformanceConfigArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateReservationAffinityArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateServiceAccountArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateShieldedInstanceConfigArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateArgs Empty = new InstanceTemplateArgs();

    /**
     * Configure Nested Virtualisation and Simultaneous Hyper Threading on this VM. Structure is documented below
     * 
     */
    @InputImport(name="advancedMachineFeatures")
    private final @Nullable Input<InstanceTemplateAdvancedMachineFeaturesArgs> advancedMachineFeatures;

    public Input<InstanceTemplateAdvancedMachineFeaturesArgs> getAdvancedMachineFeatures() {
        return this.advancedMachineFeatures == null ? Input.empty() : this.advancedMachineFeatures;
    }

    /**
     * Whether to allow sending and receiving of
     * packets with non-matching source or destination IPs. This defaults to false.
     * 
     */
    @InputImport(name="canIpForward")
    private final @Nullable Input<Boolean> canIpForward;

    public Input<Boolean> getCanIpForward() {
        return this.canIpForward == null ? Input.empty() : this.canIpForward;
    }

    /**
     * Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
     * 
     */
    @InputImport(name="confidentialInstanceConfig")
    private final @Nullable Input<InstanceTemplateConfidentialInstanceConfigArgs> confidentialInstanceConfig;

    public Input<InstanceTemplateConfidentialInstanceConfigArgs> getConfidentialInstanceConfig() {
        return this.confidentialInstanceConfig == null ? Input.empty() : this.confidentialInstanceConfig;
    }

    /**
     * A brief description of this resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Disks to attach to instances created from this template.
     * This can be specified multiple times for multiple disks. Structure is
     * documented below.
     * 
     */
    @InputImport(name="disks", required=true)
    private final Input<List<InstanceTemplateDiskArgs>> disks;

    public Input<List<InstanceTemplateDiskArgs>> getDisks() {
        return this.disks;
    }

    /**
     * ) Enable [Virtual Displays](https://cloud.google.com/compute/docs/instances/enable-instance-virtual-display#verify_display_driver) on this instance.
     * **Note**: `allow_stopping_for_update` must be set to true in order to update this field.
     * 
     */
    @InputImport(name="enableDisplay")
    private final @Nullable Input<Boolean> enableDisplay;

    public Input<Boolean> getEnableDisplay() {
        return this.enableDisplay == null ? Input.empty() : this.enableDisplay;
    }

    /**
     * List of the type and count of accelerator cards attached to the instance. Structure documented below.
     * 
     */
    @InputImport(name="guestAccelerators")
    private final @Nullable Input<List<InstanceTemplateGuestAcceleratorArgs>> guestAccelerators;

    public Input<List<InstanceTemplateGuestAcceleratorArgs>> getGuestAccelerators() {
        return this.guestAccelerators == null ? Input.empty() : this.guestAccelerators;
    }

    /**
     * A brief description to use for instances
     * created from this template.
     * 
     */
    @InputImport(name="instanceDescription")
    private final @Nullable Input<String> instanceDescription;

    public Input<String> getInstanceDescription() {
        return this.instanceDescription == null ? Input.empty() : this.instanceDescription;
    }

    /**
     * A set of ket/value label pairs to assign to disk created from
     * this template
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
    @InputImport(name="machineType", required=true)
    private final Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType;
    }

    /**
     * Metadata key/value pairs to make available from
     * within instances created from this template.
     * 
     */
    @InputImport(name="metadata")
    private final @Nullable Input<Map<String,Object>> metadata;

    public Input<Map<String,Object>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * An alternative to using the
     * startup-script metadata key, mostly to match the compute_instance resource.
     * This replaces the startup-script metadata key on the created instance and
     * thus the two mechanisms are not allowed to be used simultaneously.
     * 
     */
    @InputImport(name="metadataStartupScript")
    private final @Nullable Input<String> metadataStartupScript;

    public Input<String> getMetadataStartupScript() {
        return this.metadataStartupScript == null ? Input.empty() : this.metadataStartupScript;
    }

    /**
     * Specifies a minimum CPU platform. Applicable values are the friendly names of CPU platforms, such as
     * `Intel Haswell` or `Intel Skylake`. See the complete list [here](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform).
     * 
     */
    @InputImport(name="minCpuPlatform")
    private final @Nullable Input<String> minCpuPlatform;

    public Input<String> getMinCpuPlatform() {
        return this.minCpuPlatform == null ? Input.empty() : this.minCpuPlatform;
    }

    /**
     * The name of the instance template. If you leave
     * this blank, the provider will auto-generate a unique name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
    private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * Networks to attach to instances created from
     * this template. This can be specified multiple times for multiple networks.
     * Structure is documented below.
     * 
     */
    @InputImport(name="networkInterfaces")
    private final @Nullable Input<List<InstanceTemplateNetworkInterfaceArgs>> networkInterfaces;

    public Input<List<InstanceTemplateNetworkInterfaceArgs>> getNetworkInterfaces() {
        return this.networkInterfaces == null ? Input.empty() : this.networkInterfaces;
    }

    /**
     * Configures network performance settings for the instance created from the
     * template. Structure is documented below. **Note**: `machine_type`
     * must be a [supported type](https://cloud.google.com/compute/docs/networking/configure-vm-with-high-bandwidth-configuration),
     * the `image` used must include the [`GVNIC`](https://cloud.google.com/compute/docs/networking/using-gvnic#create-instance-gvnic-image)
     * in `guest-os-features`, and `network_interface.0.nic-type` must be `GVNIC`
     * in order for this setting to take effect.
     * 
     */
    @InputImport(name="networkPerformanceConfig")
    private final @Nullable Input<InstanceTemplateNetworkPerformanceConfigArgs> networkPerformanceConfig;

    public Input<InstanceTemplateNetworkPerformanceConfigArgs> getNetworkPerformanceConfig() {
        return this.networkPerformanceConfig == null ? Input.empty() : this.networkPerformanceConfig;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * An instance template is a global resource that is not
     * bound to a zone or a region. However, you can still specify some regional
     * resources in an instance template, which restricts the template to the
     * region where that resource resides. For example, a custom `subnetwork`
     * resource is tied to a specific region. Defaults to the region of the
     * Provider if no value is given.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * Specifies the reservations that this instance can consume from.
     * Structure is documented below.
     * 
     */
    @InputImport(name="reservationAffinity")
    private final @Nullable Input<InstanceTemplateReservationAffinityArgs> reservationAffinity;

    public Input<InstanceTemplateReservationAffinityArgs> getReservationAffinity() {
        return this.reservationAffinity == null ? Input.empty() : this.reservationAffinity;
    }

    /**
     * The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     * 
     */
    @InputImport(name="scheduling")
    private final @Nullable Input<InstanceTemplateSchedulingArgs> scheduling;

    public Input<InstanceTemplateSchedulingArgs> getScheduling() {
        return this.scheduling == null ? Input.empty() : this.scheduling;
    }

    /**
     * Service account to attach to the instance. Structure is documented below.
     * 
     */
    @InputImport(name="serviceAccount")
    private final @Nullable Input<InstanceTemplateServiceAccountArgs> serviceAccount;

    public Input<InstanceTemplateServiceAccountArgs> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    /**
     * Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
     * **Note**: `shielded_instance_config` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
     * 
     */
    @InputImport(name="shieldedInstanceConfig")
    private final @Nullable Input<InstanceTemplateShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Input<InstanceTemplateShieldedInstanceConfigArgs> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig == null ? Input.empty() : this.shieldedInstanceConfig;
    }

    /**
     * Tags to attach to the instance.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<String>> tags;

    public Input<List<String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public InstanceTemplateArgs(
        @Nullable Input<InstanceTemplateAdvancedMachineFeaturesArgs> advancedMachineFeatures,
        @Nullable Input<Boolean> canIpForward,
        @Nullable Input<InstanceTemplateConfidentialInstanceConfigArgs> confidentialInstanceConfig,
        @Nullable Input<String> description,
        Input<List<InstanceTemplateDiskArgs>> disks,
        @Nullable Input<Boolean> enableDisplay,
        @Nullable Input<List<InstanceTemplateGuestAcceleratorArgs>> guestAccelerators,
        @Nullable Input<String> instanceDescription,
        @Nullable Input<Map<String,String>> labels,
        Input<String> machineType,
        @Nullable Input<Map<String,Object>> metadata,
        @Nullable Input<String> metadataStartupScript,
        @Nullable Input<String> minCpuPlatform,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<List<InstanceTemplateNetworkInterfaceArgs>> networkInterfaces,
        @Nullable Input<InstanceTemplateNetworkPerformanceConfigArgs> networkPerformanceConfig,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<InstanceTemplateReservationAffinityArgs> reservationAffinity,
        @Nullable Input<InstanceTemplateSchedulingArgs> scheduling,
        @Nullable Input<InstanceTemplateServiceAccountArgs> serviceAccount,
        @Nullable Input<InstanceTemplateShieldedInstanceConfigArgs> shieldedInstanceConfig,
        @Nullable Input<List<String>> tags) {
        this.advancedMachineFeatures = advancedMachineFeatures;
        this.canIpForward = canIpForward;
        this.confidentialInstanceConfig = confidentialInstanceConfig;
        this.description = description;
        this.disks = Objects.requireNonNull(disks, "expected parameter 'disks' to be non-null");
        this.enableDisplay = enableDisplay;
        this.guestAccelerators = guestAccelerators;
        this.instanceDescription = instanceDescription;
        this.labels = labels;
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.metadata = metadata;
        this.metadataStartupScript = metadataStartupScript;
        this.minCpuPlatform = minCpuPlatform;
        this.name = name;
        this.namePrefix = namePrefix;
        this.networkInterfaces = networkInterfaces;
        this.networkPerformanceConfig = networkPerformanceConfig;
        this.project = project;
        this.region = region;
        this.reservationAffinity = reservationAffinity;
        this.scheduling = scheduling;
        this.serviceAccount = serviceAccount;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.tags = tags;
    }

    private InstanceTemplateArgs() {
        this.advancedMachineFeatures = Input.empty();
        this.canIpForward = Input.empty();
        this.confidentialInstanceConfig = Input.empty();
        this.description = Input.empty();
        this.disks = Input.empty();
        this.enableDisplay = Input.empty();
        this.guestAccelerators = Input.empty();
        this.instanceDescription = Input.empty();
        this.labels = Input.empty();
        this.machineType = Input.empty();
        this.metadata = Input.empty();
        this.metadataStartupScript = Input.empty();
        this.minCpuPlatform = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.networkInterfaces = Input.empty();
        this.networkPerformanceConfig = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.reservationAffinity = Input.empty();
        this.scheduling = Input.empty();
        this.serviceAccount = Input.empty();
        this.shieldedInstanceConfig = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InstanceTemplateAdvancedMachineFeaturesArgs> advancedMachineFeatures;
        private @Nullable Input<Boolean> canIpForward;
        private @Nullable Input<InstanceTemplateConfidentialInstanceConfigArgs> confidentialInstanceConfig;
        private @Nullable Input<String> description;
        private Input<List<InstanceTemplateDiskArgs>> disks;
        private @Nullable Input<Boolean> enableDisplay;
        private @Nullable Input<List<InstanceTemplateGuestAcceleratorArgs>> guestAccelerators;
        private @Nullable Input<String> instanceDescription;
        private @Nullable Input<Map<String,String>> labels;
        private Input<String> machineType;
        private @Nullable Input<Map<String,Object>> metadata;
        private @Nullable Input<String> metadataStartupScript;
        private @Nullable Input<String> minCpuPlatform;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<List<InstanceTemplateNetworkInterfaceArgs>> networkInterfaces;
        private @Nullable Input<InstanceTemplateNetworkPerformanceConfigArgs> networkPerformanceConfig;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<InstanceTemplateReservationAffinityArgs> reservationAffinity;
        private @Nullable Input<InstanceTemplateSchedulingArgs> scheduling;
        private @Nullable Input<InstanceTemplateServiceAccountArgs> serviceAccount;
        private @Nullable Input<InstanceTemplateShieldedInstanceConfigArgs> shieldedInstanceConfig;
        private @Nullable Input<List<String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedMachineFeatures = defaults.advancedMachineFeatures;
    	      this.canIpForward = defaults.canIpForward;
    	      this.confidentialInstanceConfig = defaults.confidentialInstanceConfig;
    	      this.description = defaults.description;
    	      this.disks = defaults.disks;
    	      this.enableDisplay = defaults.enableDisplay;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.instanceDescription = defaults.instanceDescription;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.metadataStartupScript = defaults.metadataStartupScript;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.networkPerformanceConfig = defaults.networkPerformanceConfig;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.scheduling = defaults.scheduling;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.tags = defaults.tags;
        }

        public Builder setAdvancedMachineFeatures(@Nullable Input<InstanceTemplateAdvancedMachineFeaturesArgs> advancedMachineFeatures) {
            this.advancedMachineFeatures = advancedMachineFeatures;
            return this;
        }

        public Builder setAdvancedMachineFeatures(@Nullable InstanceTemplateAdvancedMachineFeaturesArgs advancedMachineFeatures) {
            this.advancedMachineFeatures = Input.ofNullable(advancedMachineFeatures);
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

        public Builder setConfidentialInstanceConfig(@Nullable Input<InstanceTemplateConfidentialInstanceConfigArgs> confidentialInstanceConfig) {
            this.confidentialInstanceConfig = confidentialInstanceConfig;
            return this;
        }

        public Builder setConfidentialInstanceConfig(@Nullable InstanceTemplateConfidentialInstanceConfigArgs confidentialInstanceConfig) {
            this.confidentialInstanceConfig = Input.ofNullable(confidentialInstanceConfig);
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

        public Builder setDisks(Input<List<InstanceTemplateDiskArgs>> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }

        public Builder setDisks(List<InstanceTemplateDiskArgs> disks) {
            this.disks = Input.of(Objects.requireNonNull(disks));
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

        public Builder setGuestAccelerators(@Nullable Input<List<InstanceTemplateGuestAcceleratorArgs>> guestAccelerators) {
            this.guestAccelerators = guestAccelerators;
            return this;
        }

        public Builder setGuestAccelerators(@Nullable List<InstanceTemplateGuestAcceleratorArgs> guestAccelerators) {
            this.guestAccelerators = Input.ofNullable(guestAccelerators);
            return this;
        }

        public Builder setInstanceDescription(@Nullable Input<String> instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }

        public Builder setInstanceDescription(@Nullable String instanceDescription) {
            this.instanceDescription = Input.ofNullable(instanceDescription);
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

        public Builder setMachineType(Input<String> machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Input.of(Objects.requireNonNull(machineType));
            return this;
        }

        public Builder setMetadata(@Nullable Input<Map<String,Object>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,Object> metadata) {
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

        public Builder setNamePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder setNetworkInterfaces(@Nullable Input<List<InstanceTemplateNetworkInterfaceArgs>> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder setNetworkInterfaces(@Nullable List<InstanceTemplateNetworkInterfaceArgs> networkInterfaces) {
            this.networkInterfaces = Input.ofNullable(networkInterfaces);
            return this;
        }

        public Builder setNetworkPerformanceConfig(@Nullable Input<InstanceTemplateNetworkPerformanceConfigArgs> networkPerformanceConfig) {
            this.networkPerformanceConfig = networkPerformanceConfig;
            return this;
        }

        public Builder setNetworkPerformanceConfig(@Nullable InstanceTemplateNetworkPerformanceConfigArgs networkPerformanceConfig) {
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

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setReservationAffinity(@Nullable Input<InstanceTemplateReservationAffinityArgs> reservationAffinity) {
            this.reservationAffinity = reservationAffinity;
            return this;
        }

        public Builder setReservationAffinity(@Nullable InstanceTemplateReservationAffinityArgs reservationAffinity) {
            this.reservationAffinity = Input.ofNullable(reservationAffinity);
            return this;
        }

        public Builder setScheduling(@Nullable Input<InstanceTemplateSchedulingArgs> scheduling) {
            this.scheduling = scheduling;
            return this;
        }

        public Builder setScheduling(@Nullable InstanceTemplateSchedulingArgs scheduling) {
            this.scheduling = Input.ofNullable(scheduling);
            return this;
        }

        public Builder setServiceAccount(@Nullable Input<InstanceTemplateServiceAccountArgs> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccount(@Nullable InstanceTemplateServiceAccountArgs serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder setShieldedInstanceConfig(@Nullable Input<InstanceTemplateShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        public Builder setShieldedInstanceConfig(@Nullable InstanceTemplateShieldedInstanceConfigArgs shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Input.ofNullable(shieldedInstanceConfig);
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

        public InstanceTemplateArgs build() {
            return new InstanceTemplateArgs(advancedMachineFeatures, canIpForward, confidentialInstanceConfig, description, disks, enableDisplay, guestAccelerators, instanceDescription, labels, machineType, metadata, metadataStartupScript, minCpuPlatform, name, namePrefix, networkInterfaces, networkPerformanceConfig, project, region, reservationAffinity, scheduling, serviceAccount, shieldedInstanceConfig, tags);
        }
    }
}
