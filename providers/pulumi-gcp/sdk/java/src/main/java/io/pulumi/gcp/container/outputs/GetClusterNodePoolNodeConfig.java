// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigEphemeralStorageConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigGcfsConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigGuestAccelerator;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigKubeletConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigLinuxNodeConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigSandboxConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigShieldedInstanceConfig;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigTaint;
import io.pulumi.gcp.container.outputs.GetClusterNodePoolNodeConfigWorkloadMetadataConfig;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetClusterNodePoolNodeConfig {
    private final String bootDiskKmsKey;
    private final Integer diskSizeGb;
    private final String diskType;
    private final List<GetClusterNodePoolNodeConfigEphemeralStorageConfig> ephemeralStorageConfigs;
    private final List<GetClusterNodePoolNodeConfigGcfsConfig> gcfsConfigs;
    private final List<GetClusterNodePoolNodeConfigGuestAccelerator> guestAccelerators;
    private final String imageType;
    private final List<GetClusterNodePoolNodeConfigKubeletConfig> kubeletConfigs;
    private final Map<String,String> labels;
    private final List<GetClusterNodePoolNodeConfigLinuxNodeConfig> linuxNodeConfigs;
    private final Integer localSsdCount;
    private final String machineType;
    private final Map<String,String> metadata;
    private final String minCpuPlatform;
    private final String nodeGroup;
    private final List<String> oauthScopes;
    private final Boolean preemptible;
    private final List<GetClusterNodePoolNodeConfigSandboxConfig> sandboxConfigs;
    private final String serviceAccount;
    private final List<GetClusterNodePoolNodeConfigShieldedInstanceConfig> shieldedInstanceConfigs;
    private final Boolean spot;
    private final List<String> tags;
    private final List<GetClusterNodePoolNodeConfigTaint> taints;
    private final List<GetClusterNodePoolNodeConfigWorkloadMetadataConfig> workloadMetadataConfigs;

    @OutputCustomType.Constructor({"bootDiskKmsKey","diskSizeGb","diskType","ephemeralStorageConfigs","gcfsConfigs","guestAccelerators","imageType","kubeletConfigs","labels","linuxNodeConfigs","localSsdCount","machineType","metadata","minCpuPlatform","nodeGroup","oauthScopes","preemptible","sandboxConfigs","serviceAccount","shieldedInstanceConfigs","spot","tags","taints","workloadMetadataConfigs"})
    private GetClusterNodePoolNodeConfig(
        String bootDiskKmsKey,
        Integer diskSizeGb,
        String diskType,
        List<GetClusterNodePoolNodeConfigEphemeralStorageConfig> ephemeralStorageConfigs,
        List<GetClusterNodePoolNodeConfigGcfsConfig> gcfsConfigs,
        List<GetClusterNodePoolNodeConfigGuestAccelerator> guestAccelerators,
        String imageType,
        List<GetClusterNodePoolNodeConfigKubeletConfig> kubeletConfigs,
        Map<String,String> labels,
        List<GetClusterNodePoolNodeConfigLinuxNodeConfig> linuxNodeConfigs,
        Integer localSsdCount,
        String machineType,
        Map<String,String> metadata,
        String minCpuPlatform,
        String nodeGroup,
        List<String> oauthScopes,
        Boolean preemptible,
        List<GetClusterNodePoolNodeConfigSandboxConfig> sandboxConfigs,
        String serviceAccount,
        List<GetClusterNodePoolNodeConfigShieldedInstanceConfig> shieldedInstanceConfigs,
        Boolean spot,
        List<String> tags,
        List<GetClusterNodePoolNodeConfigTaint> taints,
        List<GetClusterNodePoolNodeConfigWorkloadMetadataConfig> workloadMetadataConfigs) {
        this.bootDiskKmsKey = Objects.requireNonNull(bootDiskKmsKey);
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
        this.diskType = Objects.requireNonNull(diskType);
        this.ephemeralStorageConfigs = Objects.requireNonNull(ephemeralStorageConfigs);
        this.gcfsConfigs = Objects.requireNonNull(gcfsConfigs);
        this.guestAccelerators = Objects.requireNonNull(guestAccelerators);
        this.imageType = Objects.requireNonNull(imageType);
        this.kubeletConfigs = Objects.requireNonNull(kubeletConfigs);
        this.labels = Objects.requireNonNull(labels);
        this.linuxNodeConfigs = Objects.requireNonNull(linuxNodeConfigs);
        this.localSsdCount = Objects.requireNonNull(localSsdCount);
        this.machineType = Objects.requireNonNull(machineType);
        this.metadata = Objects.requireNonNull(metadata);
        this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
        this.nodeGroup = Objects.requireNonNull(nodeGroup);
        this.oauthScopes = Objects.requireNonNull(oauthScopes);
        this.preemptible = Objects.requireNonNull(preemptible);
        this.sandboxConfigs = Objects.requireNonNull(sandboxConfigs);
        this.serviceAccount = Objects.requireNonNull(serviceAccount);
        this.shieldedInstanceConfigs = Objects.requireNonNull(shieldedInstanceConfigs);
        this.spot = Objects.requireNonNull(spot);
        this.tags = Objects.requireNonNull(tags);
        this.taints = Objects.requireNonNull(taints);
        this.workloadMetadataConfigs = Objects.requireNonNull(workloadMetadataConfigs);
    }

    public String getBootDiskKmsKey() {
        return this.bootDiskKmsKey;
    }
    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }
    public String getDiskType() {
        return this.diskType;
    }
    public List<GetClusterNodePoolNodeConfigEphemeralStorageConfig> getEphemeralStorageConfigs() {
        return this.ephemeralStorageConfigs;
    }
    public List<GetClusterNodePoolNodeConfigGcfsConfig> getGcfsConfigs() {
        return this.gcfsConfigs;
    }
    public List<GetClusterNodePoolNodeConfigGuestAccelerator> getGuestAccelerators() {
        return this.guestAccelerators;
    }
    public String getImageType() {
        return this.imageType;
    }
    public List<GetClusterNodePoolNodeConfigKubeletConfig> getKubeletConfigs() {
        return this.kubeletConfigs;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public List<GetClusterNodePoolNodeConfigLinuxNodeConfig> getLinuxNodeConfigs() {
        return this.linuxNodeConfigs;
    }
    public Integer getLocalSsdCount() {
        return this.localSsdCount;
    }
    public String getMachineType() {
        return this.machineType;
    }
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    public String getMinCpuPlatform() {
        return this.minCpuPlatform;
    }
    public String getNodeGroup() {
        return this.nodeGroup;
    }
    public List<String> getOauthScopes() {
        return this.oauthScopes;
    }
    public Boolean getPreemptible() {
        return this.preemptible;
    }
    public List<GetClusterNodePoolNodeConfigSandboxConfig> getSandboxConfigs() {
        return this.sandboxConfigs;
    }
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    public List<GetClusterNodePoolNodeConfigShieldedInstanceConfig> getShieldedInstanceConfigs() {
        return this.shieldedInstanceConfigs;
    }
    public Boolean getSpot() {
        return this.spot;
    }
    public List<String> getTags() {
        return this.tags;
    }
    public List<GetClusterNodePoolNodeConfigTaint> getTaints() {
        return this.taints;
    }
    public List<GetClusterNodePoolNodeConfigWorkloadMetadataConfig> getWorkloadMetadataConfigs() {
        return this.workloadMetadataConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolNodeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bootDiskKmsKey;
        private Integer diskSizeGb;
        private String diskType;
        private List<GetClusterNodePoolNodeConfigEphemeralStorageConfig> ephemeralStorageConfigs;
        private List<GetClusterNodePoolNodeConfigGcfsConfig> gcfsConfigs;
        private List<GetClusterNodePoolNodeConfigGuestAccelerator> guestAccelerators;
        private String imageType;
        private List<GetClusterNodePoolNodeConfigKubeletConfig> kubeletConfigs;
        private Map<String,String> labels;
        private List<GetClusterNodePoolNodeConfigLinuxNodeConfig> linuxNodeConfigs;
        private Integer localSsdCount;
        private String machineType;
        private Map<String,String> metadata;
        private String minCpuPlatform;
        private String nodeGroup;
        private List<String> oauthScopes;
        private Boolean preemptible;
        private List<GetClusterNodePoolNodeConfigSandboxConfig> sandboxConfigs;
        private String serviceAccount;
        private List<GetClusterNodePoolNodeConfigShieldedInstanceConfig> shieldedInstanceConfigs;
        private Boolean spot;
        private List<String> tags;
        private List<GetClusterNodePoolNodeConfigTaint> taints;
        private List<GetClusterNodePoolNodeConfigWorkloadMetadataConfig> workloadMetadataConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodePoolNodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskKmsKey = defaults.bootDiskKmsKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.ephemeralStorageConfigs = defaults.ephemeralStorageConfigs;
    	      this.gcfsConfigs = defaults.gcfsConfigs;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.imageType = defaults.imageType;
    	      this.kubeletConfigs = defaults.kubeletConfigs;
    	      this.labels = defaults.labels;
    	      this.linuxNodeConfigs = defaults.linuxNodeConfigs;
    	      this.localSsdCount = defaults.localSsdCount;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.nodeGroup = defaults.nodeGroup;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.preemptible = defaults.preemptible;
    	      this.sandboxConfigs = defaults.sandboxConfigs;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.shieldedInstanceConfigs = defaults.shieldedInstanceConfigs;
    	      this.spot = defaults.spot;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
    	      this.workloadMetadataConfigs = defaults.workloadMetadataConfigs;
        }

        public Builder setBootDiskKmsKey(String bootDiskKmsKey) {
            this.bootDiskKmsKey = Objects.requireNonNull(bootDiskKmsKey);
            return this;
        }

        public Builder setDiskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder setDiskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }

        public Builder setEphemeralStorageConfigs(List<GetClusterNodePoolNodeConfigEphemeralStorageConfig> ephemeralStorageConfigs) {
            this.ephemeralStorageConfigs = Objects.requireNonNull(ephemeralStorageConfigs);
            return this;
        }

        public Builder setGcfsConfigs(List<GetClusterNodePoolNodeConfigGcfsConfig> gcfsConfigs) {
            this.gcfsConfigs = Objects.requireNonNull(gcfsConfigs);
            return this;
        }

        public Builder setGuestAccelerators(List<GetClusterNodePoolNodeConfigGuestAccelerator> guestAccelerators) {
            this.guestAccelerators = Objects.requireNonNull(guestAccelerators);
            return this;
        }

        public Builder setImageType(String imageType) {
            this.imageType = Objects.requireNonNull(imageType);
            return this;
        }

        public Builder setKubeletConfigs(List<GetClusterNodePoolNodeConfigKubeletConfig> kubeletConfigs) {
            this.kubeletConfigs = Objects.requireNonNull(kubeletConfigs);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLinuxNodeConfigs(List<GetClusterNodePoolNodeConfigLinuxNodeConfig> linuxNodeConfigs) {
            this.linuxNodeConfigs = Objects.requireNonNull(linuxNodeConfigs);
            return this;
        }

        public Builder setLocalSsdCount(Integer localSsdCount) {
            this.localSsdCount = Objects.requireNonNull(localSsdCount);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setMetadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setMinCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }

        public Builder setNodeGroup(String nodeGroup) {
            this.nodeGroup = Objects.requireNonNull(nodeGroup);
            return this;
        }

        public Builder setOauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Objects.requireNonNull(oauthScopes);
            return this;
        }

        public Builder setPreemptible(Boolean preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }

        public Builder setSandboxConfigs(List<GetClusterNodePoolNodeConfigSandboxConfig> sandboxConfigs) {
            this.sandboxConfigs = Objects.requireNonNull(sandboxConfigs);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setShieldedInstanceConfigs(List<GetClusterNodePoolNodeConfigShieldedInstanceConfig> shieldedInstanceConfigs) {
            this.shieldedInstanceConfigs = Objects.requireNonNull(shieldedInstanceConfigs);
            return this;
        }

        public Builder setSpot(Boolean spot) {
            this.spot = Objects.requireNonNull(spot);
            return this;
        }

        public Builder setTags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setTaints(List<GetClusterNodePoolNodeConfigTaint> taints) {
            this.taints = Objects.requireNonNull(taints);
            return this;
        }

        public Builder setWorkloadMetadataConfigs(List<GetClusterNodePoolNodeConfigWorkloadMetadataConfig> workloadMetadataConfigs) {
            this.workloadMetadataConfigs = Objects.requireNonNull(workloadMetadataConfigs);
            return this;
        }
        public GetClusterNodePoolNodeConfig build() {
            return new GetClusterNodePoolNodeConfig(bootDiskKmsKey, diskSizeGb, diskType, ephemeralStorageConfigs, gcfsConfigs, guestAccelerators, imageType, kubeletConfigs, labels, linuxNodeConfigs, localSsdCount, machineType, metadata, minCpuPlatform, nodeGroup, oauthScopes, preemptible, sandboxConfigs, serviceAccount, shieldedInstanceConfigs, spot, tags, taints, workloadMetadataConfigs);
        }
    }
}