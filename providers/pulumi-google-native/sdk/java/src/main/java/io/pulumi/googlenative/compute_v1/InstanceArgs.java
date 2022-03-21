// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.enums.InstancePrivateIpv6GoogleAccess;
import io.pulumi.googlenative.compute_v1.inputs.AcceleratorConfigArgs;
import io.pulumi.googlenative.compute_v1.inputs.AdvancedMachineFeaturesArgs;
import io.pulumi.googlenative.compute_v1.inputs.AttachedDiskArgs;
import io.pulumi.googlenative.compute_v1.inputs.ConfidentialInstanceConfigArgs;
import io.pulumi.googlenative.compute_v1.inputs.CustomerEncryptionKeyArgs;
import io.pulumi.googlenative.compute_v1.inputs.DisplayDeviceArgs;
import io.pulumi.googlenative.compute_v1.inputs.MetadataArgs;
import io.pulumi.googlenative.compute_v1.inputs.NetworkInterfaceArgs;
import io.pulumi.googlenative.compute_v1.inputs.NetworkPerformanceConfigArgs;
import io.pulumi.googlenative.compute_v1.inputs.ReservationAffinityArgs;
import io.pulumi.googlenative.compute_v1.inputs.SchedulingArgs;
import io.pulumi.googlenative.compute_v1.inputs.ServiceAccountArgs;
import io.pulumi.googlenative.compute_v1.inputs.ShieldedInstanceConfigArgs;
import io.pulumi.googlenative.compute_v1.inputs.ShieldedInstanceIntegrityPolicyArgs;
import io.pulumi.googlenative.compute_v1.inputs.TagsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * Controls for advanced machine-related behavior features.
     * 
     */
    @Import(name="advancedMachineFeatures")
      private final @Nullable Output<AdvancedMachineFeaturesArgs> advancedMachineFeatures;

    public Output<AdvancedMachineFeaturesArgs> getAdvancedMachineFeatures() {
        return this.advancedMachineFeatures == null ? Output.empty() : this.advancedMachineFeatures;
    }

    /**
     * Allows this instance to send and receive packets with non-matching destination or source IPs. This is required if you plan to use this instance to forward routes. For more information, see Enabling IP Forwarding .
     * 
     */
    @Import(name="canIpForward")
      private final @Nullable Output<Boolean> canIpForward;

    public Output<Boolean> getCanIpForward() {
        return this.canIpForward == null ? Output.empty() : this.canIpForward;
    }

    @Import(name="confidentialInstanceConfig")
      private final @Nullable Output<ConfidentialInstanceConfigArgs> confidentialInstanceConfig;

    public Output<ConfidentialInstanceConfigArgs> getConfidentialInstanceConfig() {
        return this.confidentialInstanceConfig == null ? Output.empty() : this.confidentialInstanceConfig;
    }

    /**
     * Whether the resource should be protected against deletion.
     * 
     */
    @Import(name="deletionProtection")
      private final @Nullable Output<Boolean> deletionProtection;

    public Output<Boolean> getDeletionProtection() {
        return this.deletionProtection == null ? Output.empty() : this.deletionProtection;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Array of disks associated with this instance. Persistent disks must be created before you can assign them.
     * 
     */
    @Import(name="disks")
      private final @Nullable Output<List<AttachedDiskArgs>> disks;

    public Output<List<AttachedDiskArgs>> getDisks() {
        return this.disks == null ? Output.empty() : this.disks;
    }

    /**
     * Enables display device for the instance.
     * 
     */
    @Import(name="displayDevice")
      private final @Nullable Output<DisplayDeviceArgs> displayDevice;

    public Output<DisplayDeviceArgs> getDisplayDevice() {
        return this.displayDevice == null ? Output.empty() : this.displayDevice;
    }

    /**
     * A list of the type and count of accelerator cards attached to the instance.
     * 
     */
    @Import(name="guestAccelerators")
      private final @Nullable Output<List<AcceleratorConfigArgs>> guestAccelerators;

    public Output<List<AcceleratorConfigArgs>> getGuestAccelerators() {
        return this.guestAccelerators == null ? Output.empty() : this.guestAccelerators;
    }

    /**
     * Specifies the hostname of the instance. The specified hostname must be RFC1035 compliant. If hostname is not specified, the default hostname is [INSTANCE_NAME].c.[PROJECT_ID].internal when using the global DNS, and [INSTANCE_NAME].[ZONE].c.[PROJECT_ID].internal when using zonal DNS.
     * 
     */
    @Import(name="hostname")
      private final @Nullable Output<String> hostname;

    public Output<String> getHostname() {
        return this.hostname == null ? Output.empty() : this.hostname;
    }

    /**
     * Labels to apply to this instance. These can be later modified by the setLabels method.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Full or partial URL of the machine type resource to use for this instance, in the format: zones/zone/machineTypes/machine-type. This is provided by the client when the instance is created. For example, the following is a valid partial url to a predefined machine type: zones/us-central1-f/machineTypes/n1-standard-1 To create a custom machine type, provide a URL to a machine type in the following format, where CPUS is 1 or an even number up to 32 (2, 4, 6, ... 24, etc), and MEMORY is the total memory for this instance. Memory must be a multiple of 256 MB and must be supplied in MB (e.g. 5 GB of memory is 5120 MB): zones/zone/machineTypes/custom-CPUS-MEMORY For example: zones/us-central1-f/machineTypes/custom-4-5120 For a full list of restrictions, read the Specifications for custom machine types.
     * 
     */
    @Import(name="machineType")
      private final @Nullable Output<String> machineType;

    public Output<String> getMachineType() {
        return this.machineType == null ? Output.empty() : this.machineType;
    }

    /**
     * The metadata key/value pairs assigned to this instance. This includes custom metadata and predefined keys.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<MetadataArgs> metadata;

    public Output<MetadataArgs> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge".
     * 
     */
    @Import(name="minCpuPlatform")
      private final @Nullable Output<String> minCpuPlatform;

    public Output<String> getMinCpuPlatform() {
        return this.minCpuPlatform == null ? Output.empty() : this.minCpuPlatform;
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * An array of network configurations for this instance. These specify how interfaces are configured to interact with other network services, such as connecting to the internet. Multiple interfaces are supported per instance.
     * 
     */
    @Import(name="networkInterfaces")
      private final @Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces;

    public Output<List<NetworkInterfaceArgs>> getNetworkInterfaces() {
        return this.networkInterfaces == null ? Output.empty() : this.networkInterfaces;
    }

    @Import(name="networkPerformanceConfig")
      private final @Nullable Output<NetworkPerformanceConfigArgs> networkPerformanceConfig;

    public Output<NetworkPerformanceConfigArgs> getNetworkPerformanceConfig() {
        return this.networkPerformanceConfig == null ? Output.empty() : this.networkPerformanceConfig;
    }

    /**
     * The private IPv6 google access type for the VM. If not specified, use INHERIT_FROM_SUBNETWORK as default.
     * 
     */
    @Import(name="privateIpv6GoogleAccess")
      private final @Nullable Output<InstancePrivateIpv6GoogleAccess> privateIpv6GoogleAccess;

    public Output<InstancePrivateIpv6GoogleAccess> getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess == null ? Output.empty() : this.privateIpv6GoogleAccess;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    /**
     * Specifies the reservations that this instance can consume from.
     * 
     */
    @Import(name="reservationAffinity")
      private final @Nullable Output<ReservationAffinityArgs> reservationAffinity;

    public Output<ReservationAffinityArgs> getReservationAffinity() {
        return this.reservationAffinity == null ? Output.empty() : this.reservationAffinity;
    }

    /**
     * Resource policies applied to this instance.
     * 
     */
    @Import(name="resourcePolicies")
      private final @Nullable Output<List<String>> resourcePolicies;

    public Output<List<String>> getResourcePolicies() {
        return this.resourcePolicies == null ? Output.empty() : this.resourcePolicies;
    }

    /**
     * Sets the scheduling options for this instance.
     * 
     */
    @Import(name="scheduling")
      private final @Nullable Output<SchedulingArgs> scheduling;

    public Output<SchedulingArgs> getScheduling() {
        return this.scheduling == null ? Output.empty() : this.scheduling;
    }

    /**
     * A list of service accounts, with their specified scopes, authorized for this instance. Only one service account per VM instance is supported. Service accounts generate access tokens that can be accessed through the metadata server and used to authenticate applications on the instance. See Service Accounts for more information.
     * 
     */
    @Import(name="serviceAccounts")
      private final @Nullable Output<List<ServiceAccountArgs>> serviceAccounts;

    public Output<List<ServiceAccountArgs>> getServiceAccounts() {
        return this.serviceAccounts == null ? Output.empty() : this.serviceAccounts;
    }

    @Import(name="shieldedInstanceConfig")
      private final @Nullable Output<ShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Output<ShieldedInstanceConfigArgs> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig == null ? Output.empty() : this.shieldedInstanceConfig;
    }

    @Import(name="shieldedInstanceIntegrityPolicy")
      private final @Nullable Output<ShieldedInstanceIntegrityPolicyArgs> shieldedInstanceIntegrityPolicy;

    public Output<ShieldedInstanceIntegrityPolicyArgs> getShieldedInstanceIntegrityPolicy() {
        return this.shieldedInstanceIntegrityPolicy == null ? Output.empty() : this.shieldedInstanceIntegrityPolicy;
    }

    @Import(name="sourceInstanceTemplate")
      private final @Nullable Output<String> sourceInstanceTemplate;

    public Output<String> getSourceInstanceTemplate() {
        return this.sourceInstanceTemplate == null ? Output.empty() : this.sourceInstanceTemplate;
    }

    /**
     * Source machine image
     * 
     */
    @Import(name="sourceMachineImage")
      private final @Nullable Output<String> sourceMachineImage;

    public Output<String> getSourceMachineImage() {
        return this.sourceMachineImage == null ? Output.empty() : this.sourceMachineImage;
    }

    /**
     * Source machine image encryption key when creating an instance from a machine image.
     * 
     */
    @Import(name="sourceMachineImageEncryptionKey")
      private final @Nullable Output<CustomerEncryptionKeyArgs> sourceMachineImageEncryptionKey;

    public Output<CustomerEncryptionKeyArgs> getSourceMachineImageEncryptionKey() {
        return this.sourceMachineImageEncryptionKey == null ? Output.empty() : this.sourceMachineImageEncryptionKey;
    }

    /**
     * Tags to apply to this instance. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during instance creation. The tags can be later modified by the setTags method. Each tag within the list must comply with RFC1035. Multiple tags can be specified via the 'tags.items' field.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<TagsArgs> tags;

    public Output<TagsArgs> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public InstanceArgs(
        @Nullable Output<AdvancedMachineFeaturesArgs> advancedMachineFeatures,
        @Nullable Output<Boolean> canIpForward,
        @Nullable Output<ConfidentialInstanceConfigArgs> confidentialInstanceConfig,
        @Nullable Output<Boolean> deletionProtection,
        @Nullable Output<String> description,
        @Nullable Output<List<AttachedDiskArgs>> disks,
        @Nullable Output<DisplayDeviceArgs> displayDevice,
        @Nullable Output<List<AcceleratorConfigArgs>> guestAccelerators,
        @Nullable Output<String> hostname,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> machineType,
        @Nullable Output<MetadataArgs> metadata,
        @Nullable Output<String> minCpuPlatform,
        @Nullable Output<String> name,
        @Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces,
        @Nullable Output<NetworkPerformanceConfigArgs> networkPerformanceConfig,
        @Nullable Output<InstancePrivateIpv6GoogleAccess> privateIpv6GoogleAccess,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<ReservationAffinityArgs> reservationAffinity,
        @Nullable Output<List<String>> resourcePolicies,
        @Nullable Output<SchedulingArgs> scheduling,
        @Nullable Output<List<ServiceAccountArgs>> serviceAccounts,
        @Nullable Output<ShieldedInstanceConfigArgs> shieldedInstanceConfig,
        @Nullable Output<ShieldedInstanceIntegrityPolicyArgs> shieldedInstanceIntegrityPolicy,
        @Nullable Output<String> sourceInstanceTemplate,
        @Nullable Output<String> sourceMachineImage,
        @Nullable Output<CustomerEncryptionKeyArgs> sourceMachineImageEncryptionKey,
        @Nullable Output<TagsArgs> tags,
        @Nullable Output<String> zone) {
        this.advancedMachineFeatures = advancedMachineFeatures;
        this.canIpForward = canIpForward;
        this.confidentialInstanceConfig = confidentialInstanceConfig;
        this.deletionProtection = deletionProtection;
        this.description = description;
        this.disks = disks;
        this.displayDevice = displayDevice;
        this.guestAccelerators = guestAccelerators;
        this.hostname = hostname;
        this.labels = labels;
        this.machineType = machineType;
        this.metadata = metadata;
        this.minCpuPlatform = minCpuPlatform;
        this.name = name;
        this.networkInterfaces = networkInterfaces;
        this.networkPerformanceConfig = networkPerformanceConfig;
        this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
        this.project = project;
        this.requestId = requestId;
        this.reservationAffinity = reservationAffinity;
        this.resourcePolicies = resourcePolicies;
        this.scheduling = scheduling;
        this.serviceAccounts = serviceAccounts;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.shieldedInstanceIntegrityPolicy = shieldedInstanceIntegrityPolicy;
        this.sourceInstanceTemplate = sourceInstanceTemplate;
        this.sourceMachineImage = sourceMachineImage;
        this.sourceMachineImageEncryptionKey = sourceMachineImageEncryptionKey;
        this.tags = tags;
        this.zone = zone;
    }

    private InstanceArgs() {
        this.advancedMachineFeatures = Output.empty();
        this.canIpForward = Output.empty();
        this.confidentialInstanceConfig = Output.empty();
        this.deletionProtection = Output.empty();
        this.description = Output.empty();
        this.disks = Output.empty();
        this.displayDevice = Output.empty();
        this.guestAccelerators = Output.empty();
        this.hostname = Output.empty();
        this.labels = Output.empty();
        this.machineType = Output.empty();
        this.metadata = Output.empty();
        this.minCpuPlatform = Output.empty();
        this.name = Output.empty();
        this.networkInterfaces = Output.empty();
        this.networkPerformanceConfig = Output.empty();
        this.privateIpv6GoogleAccess = Output.empty();
        this.project = Output.empty();
        this.requestId = Output.empty();
        this.reservationAffinity = Output.empty();
        this.resourcePolicies = Output.empty();
        this.scheduling = Output.empty();
        this.serviceAccounts = Output.empty();
        this.shieldedInstanceConfig = Output.empty();
        this.shieldedInstanceIntegrityPolicy = Output.empty();
        this.sourceInstanceTemplate = Output.empty();
        this.sourceMachineImage = Output.empty();
        this.sourceMachineImageEncryptionKey = Output.empty();
        this.tags = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AdvancedMachineFeaturesArgs> advancedMachineFeatures;
        private @Nullable Output<Boolean> canIpForward;
        private @Nullable Output<ConfidentialInstanceConfigArgs> confidentialInstanceConfig;
        private @Nullable Output<Boolean> deletionProtection;
        private @Nullable Output<String> description;
        private @Nullable Output<List<AttachedDiskArgs>> disks;
        private @Nullable Output<DisplayDeviceArgs> displayDevice;
        private @Nullable Output<List<AcceleratorConfigArgs>> guestAccelerators;
        private @Nullable Output<String> hostname;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> machineType;
        private @Nullable Output<MetadataArgs> metadata;
        private @Nullable Output<String> minCpuPlatform;
        private @Nullable Output<String> name;
        private @Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces;
        private @Nullable Output<NetworkPerformanceConfigArgs> networkPerformanceConfig;
        private @Nullable Output<InstancePrivateIpv6GoogleAccess> privateIpv6GoogleAccess;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<ReservationAffinityArgs> reservationAffinity;
        private @Nullable Output<List<String>> resourcePolicies;
        private @Nullable Output<SchedulingArgs> scheduling;
        private @Nullable Output<List<ServiceAccountArgs>> serviceAccounts;
        private @Nullable Output<ShieldedInstanceConfigArgs> shieldedInstanceConfig;
        private @Nullable Output<ShieldedInstanceIntegrityPolicyArgs> shieldedInstanceIntegrityPolicy;
        private @Nullable Output<String> sourceInstanceTemplate;
        private @Nullable Output<String> sourceMachineImage;
        private @Nullable Output<CustomerEncryptionKeyArgs> sourceMachineImageEncryptionKey;
        private @Nullable Output<TagsArgs> tags;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedMachineFeatures = defaults.advancedMachineFeatures;
    	      this.canIpForward = defaults.canIpForward;
    	      this.confidentialInstanceConfig = defaults.confidentialInstanceConfig;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.description = defaults.description;
    	      this.disks = defaults.disks;
    	      this.displayDevice = defaults.displayDevice;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.hostname = defaults.hostname;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.name = defaults.name;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.networkPerformanceConfig = defaults.networkPerformanceConfig;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.scheduling = defaults.scheduling;
    	      this.serviceAccounts = defaults.serviceAccounts;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.shieldedInstanceIntegrityPolicy = defaults.shieldedInstanceIntegrityPolicy;
    	      this.sourceInstanceTemplate = defaults.sourceInstanceTemplate;
    	      this.sourceMachineImage = defaults.sourceMachineImage;
    	      this.sourceMachineImageEncryptionKey = defaults.sourceMachineImageEncryptionKey;
    	      this.tags = defaults.tags;
    	      this.zone = defaults.zone;
        }

        public Builder advancedMachineFeatures(@Nullable Output<AdvancedMachineFeaturesArgs> advancedMachineFeatures) {
            this.advancedMachineFeatures = advancedMachineFeatures;
            return this;
        }
        public Builder advancedMachineFeatures(@Nullable AdvancedMachineFeaturesArgs advancedMachineFeatures) {
            this.advancedMachineFeatures = Output.ofNullable(advancedMachineFeatures);
            return this;
        }
        public Builder canIpForward(@Nullable Output<Boolean> canIpForward) {
            this.canIpForward = canIpForward;
            return this;
        }
        public Builder canIpForward(@Nullable Boolean canIpForward) {
            this.canIpForward = Output.ofNullable(canIpForward);
            return this;
        }
        public Builder confidentialInstanceConfig(@Nullable Output<ConfidentialInstanceConfigArgs> confidentialInstanceConfig) {
            this.confidentialInstanceConfig = confidentialInstanceConfig;
            return this;
        }
        public Builder confidentialInstanceConfig(@Nullable ConfidentialInstanceConfigArgs confidentialInstanceConfig) {
            this.confidentialInstanceConfig = Output.ofNullable(confidentialInstanceConfig);
            return this;
        }
        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Builder deletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Output.ofNullable(deletionProtection);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder disks(@Nullable Output<List<AttachedDiskArgs>> disks) {
            this.disks = disks;
            return this;
        }
        public Builder disks(@Nullable List<AttachedDiskArgs> disks) {
            this.disks = Output.ofNullable(disks);
            return this;
        }
        public Builder disks(AttachedDiskArgs... disks) {
            return disks(List.of(disks));
        }
        public Builder displayDevice(@Nullable Output<DisplayDeviceArgs> displayDevice) {
            this.displayDevice = displayDevice;
            return this;
        }
        public Builder displayDevice(@Nullable DisplayDeviceArgs displayDevice) {
            this.displayDevice = Output.ofNullable(displayDevice);
            return this;
        }
        public Builder guestAccelerators(@Nullable Output<List<AcceleratorConfigArgs>> guestAccelerators) {
            this.guestAccelerators = guestAccelerators;
            return this;
        }
        public Builder guestAccelerators(@Nullable List<AcceleratorConfigArgs> guestAccelerators) {
            this.guestAccelerators = Output.ofNullable(guestAccelerators);
            return this;
        }
        public Builder guestAccelerators(AcceleratorConfigArgs... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }
        public Builder hostname(@Nullable Output<String> hostname) {
            this.hostname = hostname;
            return this;
        }
        public Builder hostname(@Nullable String hostname) {
            this.hostname = Output.ofNullable(hostname);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder machineType(@Nullable Output<String> machineType) {
            this.machineType = machineType;
            return this;
        }
        public Builder machineType(@Nullable String machineType) {
            this.machineType = Output.ofNullable(machineType);
            return this;
        }
        public Builder metadata(@Nullable Output<MetadataArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable MetadataArgs metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }
        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }
        public Builder minCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Output.ofNullable(minCpuPlatform);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder networkInterfaces(@Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public Builder networkInterfaces(@Nullable List<NetworkInterfaceArgs> networkInterfaces) {
            this.networkInterfaces = Output.ofNullable(networkInterfaces);
            return this;
        }
        public Builder networkInterfaces(NetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        public Builder networkPerformanceConfig(@Nullable Output<NetworkPerformanceConfigArgs> networkPerformanceConfig) {
            this.networkPerformanceConfig = networkPerformanceConfig;
            return this;
        }
        public Builder networkPerformanceConfig(@Nullable NetworkPerformanceConfigArgs networkPerformanceConfig) {
            this.networkPerformanceConfig = Output.ofNullable(networkPerformanceConfig);
            return this;
        }
        public Builder privateIpv6GoogleAccess(@Nullable Output<InstancePrivateIpv6GoogleAccess> privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
            return this;
        }
        public Builder privateIpv6GoogleAccess(@Nullable InstancePrivateIpv6GoogleAccess privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Output.ofNullable(privateIpv6GoogleAccess);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }
        public Builder reservationAffinity(@Nullable Output<ReservationAffinityArgs> reservationAffinity) {
            this.reservationAffinity = reservationAffinity;
            return this;
        }
        public Builder reservationAffinity(@Nullable ReservationAffinityArgs reservationAffinity) {
            this.reservationAffinity = Output.ofNullable(reservationAffinity);
            return this;
        }
        public Builder resourcePolicies(@Nullable Output<List<String>> resourcePolicies) {
            this.resourcePolicies = resourcePolicies;
            return this;
        }
        public Builder resourcePolicies(@Nullable List<String> resourcePolicies) {
            this.resourcePolicies = Output.ofNullable(resourcePolicies);
            return this;
        }
        public Builder resourcePolicies(String... resourcePolicies) {
            return resourcePolicies(List.of(resourcePolicies));
        }
        public Builder scheduling(@Nullable Output<SchedulingArgs> scheduling) {
            this.scheduling = scheduling;
            return this;
        }
        public Builder scheduling(@Nullable SchedulingArgs scheduling) {
            this.scheduling = Output.ofNullable(scheduling);
            return this;
        }
        public Builder serviceAccounts(@Nullable Output<List<ServiceAccountArgs>> serviceAccounts) {
            this.serviceAccounts = serviceAccounts;
            return this;
        }
        public Builder serviceAccounts(@Nullable List<ServiceAccountArgs> serviceAccounts) {
            this.serviceAccounts = Output.ofNullable(serviceAccounts);
            return this;
        }
        public Builder serviceAccounts(ServiceAccountArgs... serviceAccounts) {
            return serviceAccounts(List.of(serviceAccounts));
        }
        public Builder shieldedInstanceConfig(@Nullable Output<ShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }
        public Builder shieldedInstanceConfig(@Nullable ShieldedInstanceConfigArgs shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Output.ofNullable(shieldedInstanceConfig);
            return this;
        }
        public Builder shieldedInstanceIntegrityPolicy(@Nullable Output<ShieldedInstanceIntegrityPolicyArgs> shieldedInstanceIntegrityPolicy) {
            this.shieldedInstanceIntegrityPolicy = shieldedInstanceIntegrityPolicy;
            return this;
        }
        public Builder shieldedInstanceIntegrityPolicy(@Nullable ShieldedInstanceIntegrityPolicyArgs shieldedInstanceIntegrityPolicy) {
            this.shieldedInstanceIntegrityPolicy = Output.ofNullable(shieldedInstanceIntegrityPolicy);
            return this;
        }
        public Builder sourceInstanceTemplate(@Nullable Output<String> sourceInstanceTemplate) {
            this.sourceInstanceTemplate = sourceInstanceTemplate;
            return this;
        }
        public Builder sourceInstanceTemplate(@Nullable String sourceInstanceTemplate) {
            this.sourceInstanceTemplate = Output.ofNullable(sourceInstanceTemplate);
            return this;
        }
        public Builder sourceMachineImage(@Nullable Output<String> sourceMachineImage) {
            this.sourceMachineImage = sourceMachineImage;
            return this;
        }
        public Builder sourceMachineImage(@Nullable String sourceMachineImage) {
            this.sourceMachineImage = Output.ofNullable(sourceMachineImage);
            return this;
        }
        public Builder sourceMachineImageEncryptionKey(@Nullable Output<CustomerEncryptionKeyArgs> sourceMachineImageEncryptionKey) {
            this.sourceMachineImageEncryptionKey = sourceMachineImageEncryptionKey;
            return this;
        }
        public Builder sourceMachineImageEncryptionKey(@Nullable CustomerEncryptionKeyArgs sourceMachineImageEncryptionKey) {
            this.sourceMachineImageEncryptionKey = Output.ofNullable(sourceMachineImageEncryptionKey);
            return this;
        }
        public Builder tags(@Nullable Output<TagsArgs> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable TagsArgs tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Output.ofNullable(zone);
            return this;
        }        public InstanceArgs build() {
            return new InstanceArgs(advancedMachineFeatures, canIpForward, confidentialInstanceConfig, deletionProtection, description, disks, displayDevice, guestAccelerators, hostname, labels, machineType, metadata, minCpuPlatform, name, networkInterfaces, networkPerformanceConfig, privateIpv6GoogleAccess, project, requestId, reservationAffinity, resourcePolicies, scheduling, serviceAccounts, shieldedInstanceConfig, shieldedInstanceIntegrityPolicy, sourceInstanceTemplate, sourceMachineImage, sourceMachineImageEncryptionKey, tags, zone);
        }
    }
}
