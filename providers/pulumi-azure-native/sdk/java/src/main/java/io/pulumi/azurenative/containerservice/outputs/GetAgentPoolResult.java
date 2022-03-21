// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.azurenative.containerservice.outputs.AgentPoolUpgradeSettingsResponse;
import io.pulumi.azurenative.containerservice.outputs.KubeletConfigResponse;
import io.pulumi.azurenative.containerservice.outputs.LinuxOSConfigResponse;
import io.pulumi.azurenative.containerservice.outputs.PowerStateResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAgentPoolResult {
    /**
     * Availability zones for nodes. Must use VirtualMachineScaleSets AgentPoolType.
     * 
     */
    private final @Nullable List<String> availabilityZones;
    /**
     * Number of agents (VMs) to host docker containers. Allowed values must be in the range of 0 to 100 (inclusive) for user pools and in the range of 1 to 100 (inclusive) for system pools. The default value is 1.
     * 
     */
    private final @Nullable Integer count;
    /**
     * Whether to enable auto-scaler
     * 
     */
    private final @Nullable Boolean enableAutoScaling;
    /**
     * Whether to enable EncryptionAtHost
     * 
     */
    private final @Nullable Boolean enableEncryptionAtHost;
    /**
     * Whether to use FIPS enabled OS
     * 
     */
    private final @Nullable Boolean enableFIPS;
    /**
     * Enable public IP for nodes
     * 
     */
    private final @Nullable Boolean enableNodePublicIP;
    /**
     * GPUInstanceProfile to be used to specify GPU MIG instance profile for supported GPU VM SKU. Supported values are MIG1g, MIG2g, MIG3g, MIG4g and MIG7g.
     * 
     */
    private final @Nullable String gpuInstanceProfile;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * KubeletConfig specifies the configuration of kubelet on agent nodes.
     * 
     */
    private final @Nullable KubeletConfigResponse kubeletConfig;
    /**
     * KubeletDiskType determines the placement of emptyDir volumes, container runtime data root, and Kubelet ephemeral storage. Currently allows one value, OS, resulting in Kubelet using the OS disk for data.
     * 
     */
    private final @Nullable String kubeletDiskType;
    /**
     * LinuxOSConfig specifies the OS configuration of linux agent nodes.
     * 
     */
    private final @Nullable LinuxOSConfigResponse linuxOSConfig;
    /**
     * Maximum number of nodes for auto-scaling
     * 
     */
    private final @Nullable Integer maxCount;
    /**
     * Maximum number of pods that can run on a node.
     * 
     */
    private final @Nullable Integer maxPods;
    /**
     * Minimum number of nodes for auto-scaling
     * 
     */
    private final @Nullable Integer minCount;
    /**
     * AgentPoolMode represents mode of an agent pool
     * 
     */
    private final @Nullable String mode;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final String name;
    /**
     * Version of node image
     * 
     */
    private final String nodeImageVersion;
    /**
     * Agent pool node labels to be persisted across all nodes in agent pool.
     * 
     */
    private final @Nullable Map<String,String> nodeLabels;
    /**
     * Public IP Prefix ID. VM nodes use IPs assigned from this Public IP Prefix.
     * 
     */
    private final @Nullable String nodePublicIPPrefixID;
    /**
     * Taints added to new nodes during node pool create and scale. For example, key=value:NoSchedule.
     * 
     */
    private final @Nullable List<String> nodeTaints;
    /**
     * Version of orchestrator specified when creating the managed cluster.
     * 
     */
    private final @Nullable String orchestratorVersion;
    /**
     * OS Disk Size in GB to be used to specify the disk size for every machine in this master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     * 
     */
    private final @Nullable Integer osDiskSizeGB;
    /**
     * OS disk type to be used for machines in a given agent pool. Allowed values are 'Ephemeral' and 'Managed'. If unspecified, defaults to 'Ephemeral' when the VM supports ephemeral OS and has a cache disk larger than the requested OSDiskSizeGB. Otherwise, defaults to 'Managed'. May not be changed after creation.
     * 
     */
    private final @Nullable String osDiskType;
    /**
     * OsSKU to be used to specify os sku. Choose from Ubuntu(default) and CBLMariner for Linux OSType. Not applicable to Windows OSType.
     * 
     */
    private final @Nullable String osSKU;
    /**
     * OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     */
    private final @Nullable String osType;
    /**
     * Pod SubnetID specifies the VNet's subnet identifier for pods.
     * 
     */
    private final @Nullable String podSubnetID;
    /**
     * Describes whether the Agent Pool is Running or Stopped
     * 
     */
    private final PowerStateResponse powerState;
    /**
     * The current deployment or provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * The ID for Proximity Placement Group.
     * 
     */
    private final @Nullable String proximityPlacementGroupID;
    /**
     * ScaleSetEvictionPolicy to be used to specify eviction policy for Spot virtual machine scale set. Default to Delete.
     * 
     */
    private final @Nullable String scaleSetEvictionPolicy;
    /**
     * ScaleSetPriority to be used to specify virtual machine scale set priority. Default to regular.
     * 
     */
    private final @Nullable String scaleSetPriority;
    /**
     * SpotMaxPrice to be used to specify the maximum price you are willing to pay in US Dollars. Possible values are any decimal value greater than zero or -1 which indicates default price to be up-to on-demand.
     * 
     */
    private final @Nullable Double spotMaxPrice;
    /**
     * Agent pool tags to be persisted on the agent pool virtual machine scale set.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * AgentPoolType represents types of an agent pool
     * 
     */
    private final String type;
    /**
     * Settings for upgrading the agentpool
     * 
     */
    private final @Nullable AgentPoolUpgradeSettingsResponse upgradeSettings;
    /**
     * Size of agent VMs.
     * 
     */
    private final @Nullable String vmSize;
    /**
     * VNet SubnetID specifies the VNet's subnet identifier for nodes and maybe pods
     * 
     */
    private final @Nullable String vnetSubnetID;

    @CustomType.Constructor
    private GetAgentPoolResult(
        @CustomType.Parameter("availabilityZones") @Nullable List<String> availabilityZones,
        @CustomType.Parameter("count") @Nullable Integer count,
        @CustomType.Parameter("enableAutoScaling") @Nullable Boolean enableAutoScaling,
        @CustomType.Parameter("enableEncryptionAtHost") @Nullable Boolean enableEncryptionAtHost,
        @CustomType.Parameter("enableFIPS") @Nullable Boolean enableFIPS,
        @CustomType.Parameter("enableNodePublicIP") @Nullable Boolean enableNodePublicIP,
        @CustomType.Parameter("gpuInstanceProfile") @Nullable String gpuInstanceProfile,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kubeletConfig") @Nullable KubeletConfigResponse kubeletConfig,
        @CustomType.Parameter("kubeletDiskType") @Nullable String kubeletDiskType,
        @CustomType.Parameter("linuxOSConfig") @Nullable LinuxOSConfigResponse linuxOSConfig,
        @CustomType.Parameter("maxCount") @Nullable Integer maxCount,
        @CustomType.Parameter("maxPods") @Nullable Integer maxPods,
        @CustomType.Parameter("minCount") @Nullable Integer minCount,
        @CustomType.Parameter("mode") @Nullable String mode,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nodeImageVersion") String nodeImageVersion,
        @CustomType.Parameter("nodeLabels") @Nullable Map<String,String> nodeLabels,
        @CustomType.Parameter("nodePublicIPPrefixID") @Nullable String nodePublicIPPrefixID,
        @CustomType.Parameter("nodeTaints") @Nullable List<String> nodeTaints,
        @CustomType.Parameter("orchestratorVersion") @Nullable String orchestratorVersion,
        @CustomType.Parameter("osDiskSizeGB") @Nullable Integer osDiskSizeGB,
        @CustomType.Parameter("osDiskType") @Nullable String osDiskType,
        @CustomType.Parameter("osSKU") @Nullable String osSKU,
        @CustomType.Parameter("osType") @Nullable String osType,
        @CustomType.Parameter("podSubnetID") @Nullable String podSubnetID,
        @CustomType.Parameter("powerState") PowerStateResponse powerState,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("proximityPlacementGroupID") @Nullable String proximityPlacementGroupID,
        @CustomType.Parameter("scaleSetEvictionPolicy") @Nullable String scaleSetEvictionPolicy,
        @CustomType.Parameter("scaleSetPriority") @Nullable String scaleSetPriority,
        @CustomType.Parameter("spotMaxPrice") @Nullable Double spotMaxPrice,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("upgradeSettings") @Nullable AgentPoolUpgradeSettingsResponse upgradeSettings,
        @CustomType.Parameter("vmSize") @Nullable String vmSize,
        @CustomType.Parameter("vnetSubnetID") @Nullable String vnetSubnetID) {
        this.availabilityZones = availabilityZones;
        this.count = count;
        this.enableAutoScaling = enableAutoScaling;
        this.enableEncryptionAtHost = enableEncryptionAtHost;
        this.enableFIPS = enableFIPS;
        this.enableNodePublicIP = enableNodePublicIP;
        this.gpuInstanceProfile = gpuInstanceProfile;
        this.id = id;
        this.kubeletConfig = kubeletConfig;
        this.kubeletDiskType = kubeletDiskType;
        this.linuxOSConfig = linuxOSConfig;
        this.maxCount = maxCount;
        this.maxPods = maxPods;
        this.minCount = minCount;
        this.mode = mode;
        this.name = name;
        this.nodeImageVersion = nodeImageVersion;
        this.nodeLabels = nodeLabels;
        this.nodePublicIPPrefixID = nodePublicIPPrefixID;
        this.nodeTaints = nodeTaints;
        this.orchestratorVersion = orchestratorVersion;
        this.osDiskSizeGB = osDiskSizeGB;
        this.osDiskType = osDiskType;
        this.osSKU = osSKU;
        this.osType = osType;
        this.podSubnetID = podSubnetID;
        this.powerState = powerState;
        this.provisioningState = provisioningState;
        this.proximityPlacementGroupID = proximityPlacementGroupID;
        this.scaleSetEvictionPolicy = scaleSetEvictionPolicy;
        this.scaleSetPriority = scaleSetPriority;
        this.spotMaxPrice = spotMaxPrice;
        this.tags = tags;
        this.type = type;
        this.upgradeSettings = upgradeSettings;
        this.vmSize = vmSize;
        this.vnetSubnetID = vnetSubnetID;
    }

    /**
     * Availability zones for nodes. Must use VirtualMachineScaleSets AgentPoolType.
     * 
    */
    public List<String> getAvailabilityZones() {
        return this.availabilityZones == null ? List.of() : this.availabilityZones;
    }
    /**
     * Number of agents (VMs) to host docker containers. Allowed values must be in the range of 0 to 100 (inclusive) for user pools and in the range of 1 to 100 (inclusive) for system pools. The default value is 1.
     * 
    */
    public Optional<Integer> getCount() {
        return Optional.ofNullable(this.count);
    }
    /**
     * Whether to enable auto-scaler
     * 
    */
    public Optional<Boolean> getEnableAutoScaling() {
        return Optional.ofNullable(this.enableAutoScaling);
    }
    /**
     * Whether to enable EncryptionAtHost
     * 
    */
    public Optional<Boolean> getEnableEncryptionAtHost() {
        return Optional.ofNullable(this.enableEncryptionAtHost);
    }
    /**
     * Whether to use FIPS enabled OS
     * 
    */
    public Optional<Boolean> getEnableFIPS() {
        return Optional.ofNullable(this.enableFIPS);
    }
    /**
     * Enable public IP for nodes
     * 
    */
    public Optional<Boolean> getEnableNodePublicIP() {
        return Optional.ofNullable(this.enableNodePublicIP);
    }
    /**
     * GPUInstanceProfile to be used to specify GPU MIG instance profile for supported GPU VM SKU. Supported values are MIG1g, MIG2g, MIG3g, MIG4g and MIG7g.
     * 
    */
    public Optional<String> getGpuInstanceProfile() {
        return Optional.ofNullable(this.gpuInstanceProfile);
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * KubeletConfig specifies the configuration of kubelet on agent nodes.
     * 
    */
    public Optional<KubeletConfigResponse> getKubeletConfig() {
        return Optional.ofNullable(this.kubeletConfig);
    }
    /**
     * KubeletDiskType determines the placement of emptyDir volumes, container runtime data root, and Kubelet ephemeral storage. Currently allows one value, OS, resulting in Kubelet using the OS disk for data.
     * 
    */
    public Optional<String> getKubeletDiskType() {
        return Optional.ofNullable(this.kubeletDiskType);
    }
    /**
     * LinuxOSConfig specifies the OS configuration of linux agent nodes.
     * 
    */
    public Optional<LinuxOSConfigResponse> getLinuxOSConfig() {
        return Optional.ofNullable(this.linuxOSConfig);
    }
    /**
     * Maximum number of nodes for auto-scaling
     * 
    */
    public Optional<Integer> getMaxCount() {
        return Optional.ofNullable(this.maxCount);
    }
    /**
     * Maximum number of pods that can run on a node.
     * 
    */
    public Optional<Integer> getMaxPods() {
        return Optional.ofNullable(this.maxPods);
    }
    /**
     * Minimum number of nodes for auto-scaling
     * 
    */
    public Optional<Integer> getMinCount() {
        return Optional.ofNullable(this.minCount);
    }
    /**
     * AgentPoolMode represents mode of an agent pool
     * 
    */
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Version of node image
     * 
    */
    public String getNodeImageVersion() {
        return this.nodeImageVersion;
    }
    /**
     * Agent pool node labels to be persisted across all nodes in agent pool.
     * 
    */
    public Map<String,String> getNodeLabels() {
        return this.nodeLabels == null ? Map.of() : this.nodeLabels;
    }
    /**
     * Public IP Prefix ID. VM nodes use IPs assigned from this Public IP Prefix.
     * 
    */
    public Optional<String> getNodePublicIPPrefixID() {
        return Optional.ofNullable(this.nodePublicIPPrefixID);
    }
    /**
     * Taints added to new nodes during node pool create and scale. For example, key=value:NoSchedule.
     * 
    */
    public List<String> getNodeTaints() {
        return this.nodeTaints == null ? List.of() : this.nodeTaints;
    }
    /**
     * Version of orchestrator specified when creating the managed cluster.
     * 
    */
    public Optional<String> getOrchestratorVersion() {
        return Optional.ofNullable(this.orchestratorVersion);
    }
    /**
     * OS Disk Size in GB to be used to specify the disk size for every machine in this master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     * 
    */
    public Optional<Integer> getOsDiskSizeGB() {
        return Optional.ofNullable(this.osDiskSizeGB);
    }
    /**
     * OS disk type to be used for machines in a given agent pool. Allowed values are 'Ephemeral' and 'Managed'. If unspecified, defaults to 'Ephemeral' when the VM supports ephemeral OS and has a cache disk larger than the requested OSDiskSizeGB. Otherwise, defaults to 'Managed'. May not be changed after creation.
     * 
    */
    public Optional<String> getOsDiskType() {
        return Optional.ofNullable(this.osDiskType);
    }
    /**
     * OsSKU to be used to specify os sku. Choose from Ubuntu(default) and CBLMariner for Linux OSType. Not applicable to Windows OSType.
     * 
    */
    public Optional<String> getOsSKU() {
        return Optional.ofNullable(this.osSKU);
    }
    /**
     * OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
    */
    public Optional<String> getOsType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * Pod SubnetID specifies the VNet's subnet identifier for pods.
     * 
    */
    public Optional<String> getPodSubnetID() {
        return Optional.ofNullable(this.podSubnetID);
    }
    /**
     * Describes whether the Agent Pool is Running or Stopped
     * 
    */
    public PowerStateResponse getPowerState() {
        return this.powerState;
    }
    /**
     * The current deployment or provisioning state, which only appears in the response.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The ID for Proximity Placement Group.
     * 
    */
    public Optional<String> getProximityPlacementGroupID() {
        return Optional.ofNullable(this.proximityPlacementGroupID);
    }
    /**
     * ScaleSetEvictionPolicy to be used to specify eviction policy for Spot virtual machine scale set. Default to Delete.
     * 
    */
    public Optional<String> getScaleSetEvictionPolicy() {
        return Optional.ofNullable(this.scaleSetEvictionPolicy);
    }
    /**
     * ScaleSetPriority to be used to specify virtual machine scale set priority. Default to regular.
     * 
    */
    public Optional<String> getScaleSetPriority() {
        return Optional.ofNullable(this.scaleSetPriority);
    }
    /**
     * SpotMaxPrice to be used to specify the maximum price you are willing to pay in US Dollars. Possible values are any decimal value greater than zero or -1 which indicates default price to be up-to on-demand.
     * 
    */
    public Optional<Double> getSpotMaxPrice() {
        return Optional.ofNullable(this.spotMaxPrice);
    }
    /**
     * Agent pool tags to be persisted on the agent pool virtual machine scale set.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * AgentPoolType represents types of an agent pool
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Settings for upgrading the agentpool
     * 
    */
    public Optional<AgentPoolUpgradeSettingsResponse> getUpgradeSettings() {
        return Optional.ofNullable(this.upgradeSettings);
    }
    /**
     * Size of agent VMs.
     * 
    */
    public Optional<String> getVmSize() {
        return Optional.ofNullable(this.vmSize);
    }
    /**
     * VNet SubnetID specifies the VNet's subnet identifier for nodes and maybe pods
     * 
    */
    public Optional<String> getVnetSubnetID() {
        return Optional.ofNullable(this.vnetSubnetID);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAgentPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> availabilityZones;
        private @Nullable Integer count;
        private @Nullable Boolean enableAutoScaling;
        private @Nullable Boolean enableEncryptionAtHost;
        private @Nullable Boolean enableFIPS;
        private @Nullable Boolean enableNodePublicIP;
        private @Nullable String gpuInstanceProfile;
        private String id;
        private @Nullable KubeletConfigResponse kubeletConfig;
        private @Nullable String kubeletDiskType;
        private @Nullable LinuxOSConfigResponse linuxOSConfig;
        private @Nullable Integer maxCount;
        private @Nullable Integer maxPods;
        private @Nullable Integer minCount;
        private @Nullable String mode;
        private String name;
        private String nodeImageVersion;
        private @Nullable Map<String,String> nodeLabels;
        private @Nullable String nodePublicIPPrefixID;
        private @Nullable List<String> nodeTaints;
        private @Nullable String orchestratorVersion;
        private @Nullable Integer osDiskSizeGB;
        private @Nullable String osDiskType;
        private @Nullable String osSKU;
        private @Nullable String osType;
        private @Nullable String podSubnetID;
        private PowerStateResponse powerState;
        private String provisioningState;
        private @Nullable String proximityPlacementGroupID;
        private @Nullable String scaleSetEvictionPolicy;
        private @Nullable String scaleSetPriority;
        private @Nullable Double spotMaxPrice;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable AgentPoolUpgradeSettingsResponse upgradeSettings;
        private @Nullable String vmSize;
        private @Nullable String vnetSubnetID;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAgentPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.count = defaults.count;
    	      this.enableAutoScaling = defaults.enableAutoScaling;
    	      this.enableEncryptionAtHost = defaults.enableEncryptionAtHost;
    	      this.enableFIPS = defaults.enableFIPS;
    	      this.enableNodePublicIP = defaults.enableNodePublicIP;
    	      this.gpuInstanceProfile = defaults.gpuInstanceProfile;
    	      this.id = defaults.id;
    	      this.kubeletConfig = defaults.kubeletConfig;
    	      this.kubeletDiskType = defaults.kubeletDiskType;
    	      this.linuxOSConfig = defaults.linuxOSConfig;
    	      this.maxCount = defaults.maxCount;
    	      this.maxPods = defaults.maxPods;
    	      this.minCount = defaults.minCount;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.nodeImageVersion = defaults.nodeImageVersion;
    	      this.nodeLabels = defaults.nodeLabels;
    	      this.nodePublicIPPrefixID = defaults.nodePublicIPPrefixID;
    	      this.nodeTaints = defaults.nodeTaints;
    	      this.orchestratorVersion = defaults.orchestratorVersion;
    	      this.osDiskSizeGB = defaults.osDiskSizeGB;
    	      this.osDiskType = defaults.osDiskType;
    	      this.osSKU = defaults.osSKU;
    	      this.osType = defaults.osType;
    	      this.podSubnetID = defaults.podSubnetID;
    	      this.powerState = defaults.powerState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.proximityPlacementGroupID = defaults.proximityPlacementGroupID;
    	      this.scaleSetEvictionPolicy = defaults.scaleSetEvictionPolicy;
    	      this.scaleSetPriority = defaults.scaleSetPriority;
    	      this.spotMaxPrice = defaults.spotMaxPrice;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.upgradeSettings = defaults.upgradeSettings;
    	      this.vmSize = defaults.vmSize;
    	      this.vnetSubnetID = defaults.vnetSubnetID;
        }

        public Builder availabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        public Builder enableAutoScaling(@Nullable Boolean enableAutoScaling) {
            this.enableAutoScaling = enableAutoScaling;
            return this;
        }
        public Builder enableEncryptionAtHost(@Nullable Boolean enableEncryptionAtHost) {
            this.enableEncryptionAtHost = enableEncryptionAtHost;
            return this;
        }
        public Builder enableFIPS(@Nullable Boolean enableFIPS) {
            this.enableFIPS = enableFIPS;
            return this;
        }
        public Builder enableNodePublicIP(@Nullable Boolean enableNodePublicIP) {
            this.enableNodePublicIP = enableNodePublicIP;
            return this;
        }
        public Builder gpuInstanceProfile(@Nullable String gpuInstanceProfile) {
            this.gpuInstanceProfile = gpuInstanceProfile;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kubeletConfig(@Nullable KubeletConfigResponse kubeletConfig) {
            this.kubeletConfig = kubeletConfig;
            return this;
        }
        public Builder kubeletDiskType(@Nullable String kubeletDiskType) {
            this.kubeletDiskType = kubeletDiskType;
            return this;
        }
        public Builder linuxOSConfig(@Nullable LinuxOSConfigResponse linuxOSConfig) {
            this.linuxOSConfig = linuxOSConfig;
            return this;
        }
        public Builder maxCount(@Nullable Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Builder maxPods(@Nullable Integer maxPods) {
            this.maxPods = maxPods;
            return this;
        }
        public Builder minCount(@Nullable Integer minCount) {
            this.minCount = minCount;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nodeImageVersion(String nodeImageVersion) {
            this.nodeImageVersion = Objects.requireNonNull(nodeImageVersion);
            return this;
        }
        public Builder nodeLabels(@Nullable Map<String,String> nodeLabels) {
            this.nodeLabels = nodeLabels;
            return this;
        }
        public Builder nodePublicIPPrefixID(@Nullable String nodePublicIPPrefixID) {
            this.nodePublicIPPrefixID = nodePublicIPPrefixID;
            return this;
        }
        public Builder nodeTaints(@Nullable List<String> nodeTaints) {
            this.nodeTaints = nodeTaints;
            return this;
        }
        public Builder nodeTaints(String... nodeTaints) {
            return nodeTaints(List.of(nodeTaints));
        }
        public Builder orchestratorVersion(@Nullable String orchestratorVersion) {
            this.orchestratorVersion = orchestratorVersion;
            return this;
        }
        public Builder osDiskSizeGB(@Nullable Integer osDiskSizeGB) {
            this.osDiskSizeGB = osDiskSizeGB;
            return this;
        }
        public Builder osDiskType(@Nullable String osDiskType) {
            this.osDiskType = osDiskType;
            return this;
        }
        public Builder osSKU(@Nullable String osSKU) {
            this.osSKU = osSKU;
            return this;
        }
        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }
        public Builder podSubnetID(@Nullable String podSubnetID) {
            this.podSubnetID = podSubnetID;
            return this;
        }
        public Builder powerState(PowerStateResponse powerState) {
            this.powerState = Objects.requireNonNull(powerState);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder proximityPlacementGroupID(@Nullable String proximityPlacementGroupID) {
            this.proximityPlacementGroupID = proximityPlacementGroupID;
            return this;
        }
        public Builder scaleSetEvictionPolicy(@Nullable String scaleSetEvictionPolicy) {
            this.scaleSetEvictionPolicy = scaleSetEvictionPolicy;
            return this;
        }
        public Builder scaleSetPriority(@Nullable String scaleSetPriority) {
            this.scaleSetPriority = scaleSetPriority;
            return this;
        }
        public Builder spotMaxPrice(@Nullable Double spotMaxPrice) {
            this.spotMaxPrice = spotMaxPrice;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder upgradeSettings(@Nullable AgentPoolUpgradeSettingsResponse upgradeSettings) {
            this.upgradeSettings = upgradeSettings;
            return this;
        }
        public Builder vmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }
        public Builder vnetSubnetID(@Nullable String vnetSubnetID) {
            this.vnetSubnetID = vnetSubnetID;
            return this;
        }        public GetAgentPoolResult build() {
            return new GetAgentPoolResult(availabilityZones, count, enableAutoScaling, enableEncryptionAtHost, enableFIPS, enableNodePublicIP, gpuInstanceProfile, id, kubeletConfig, kubeletDiskType, linuxOSConfig, maxCount, maxPods, minCount, mode, name, nodeImageVersion, nodeLabels, nodePublicIPPrefixID, nodeTaints, orchestratorVersion, osDiskSizeGB, osDiskType, osSKU, osType, podSubnetID, powerState, provisioningState, proximityPlacementGroupID, scaleSetEvictionPolicy, scaleSetPriority, spotMaxPrice, tags, type, upgradeSettings, vmSize, vnetSubnetID);
        }
    }
}
