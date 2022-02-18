// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.azurenative.containerservice.outputs.ContainerServiceLinuxProfileResponse;
import io.pulumi.azurenative.containerservice.outputs.ContainerServiceNetworkProfileResponse;
import io.pulumi.azurenative.containerservice.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.containerservice.outputs.ManagedClusterAADProfileResponse;
import io.pulumi.azurenative.containerservice.outputs.ManagedClusterAPIServerAccessProfileResponse;
import io.pulumi.azurenative.containerservice.outputs.ManagedClusterAddonProfileResponse;
import io.pulumi.azurenative.containerservice.outputs.ManagedClusterAgentPoolProfileResponse;
import io.pulumi.azurenative.containerservice.outputs.ManagedClusterAutoUpgradeProfileResponse;
import io.pulumi.azurenative.containerservice.outputs.ManagedClusterHTTPProxyConfigResponse;
import io.pulumi.azurenative.containerservice.outputs.ManagedClusterIdentityResponse;
import io.pulumi.azurenative.containerservice.outputs.ManagedClusterPodIdentityProfileResponse;
import io.pulumi.azurenative.containerservice.outputs.ManagedClusterPropertiesResponseAutoScalerProfile;
import io.pulumi.azurenative.containerservice.outputs.ManagedClusterPropertiesResponseIdentityProfile;
import io.pulumi.azurenative.containerservice.outputs.ManagedClusterSKUResponse;
import io.pulumi.azurenative.containerservice.outputs.ManagedClusterServicePrincipalProfileResponse;
import io.pulumi.azurenative.containerservice.outputs.ManagedClusterWindowsProfileResponse;
import io.pulumi.azurenative.containerservice.outputs.PowerStateResponse;
import io.pulumi.azurenative.containerservice.outputs.PrivateLinkResourceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetManagedClusterResult {
    /**
     * Profile of Azure Active Directory configuration.
     * 
     */
    private final @Nullable ManagedClusterAADProfileResponse aadProfile;
    /**
     * Profile of managed cluster add-on.
     * 
     */
    private final @Nullable Map<String,ManagedClusterAddonProfileResponse> addonProfiles;
    /**
     * Properties of the agent pool.
     * 
     */
    private final @Nullable List<ManagedClusterAgentPoolProfileResponse> agentPoolProfiles;
    /**
     * Access profile for managed cluster API server.
     * 
     */
    private final @Nullable ManagedClusterAPIServerAccessProfileResponse apiServerAccessProfile;
    /**
     * Parameters to be applied to the cluster-autoscaler when enabled
     * 
     */
    private final @Nullable ManagedClusterPropertiesResponseAutoScalerProfile autoScalerProfile;
    /**
     * Profile of auto upgrade configuration.
     * 
     */
    private final @Nullable ManagedClusterAutoUpgradeProfileResponse autoUpgradeProfile;
    /**
     * FQDN for the master pool which used by proxy config.
     * 
     */
    private final String azurePortalFQDN;
    /**
     * If set to true, getting static credential will be disabled for this cluster. Expected to only be used for AAD clusters.
     * 
     */
    private final @Nullable Boolean disableLocalAccounts;
    /**
     * ResourceId of the disk encryption set to use for enabling encryption at rest.
     * 
     */
    private final @Nullable String diskEncryptionSetID;
    /**
     * DNS prefix specified when creating the managed cluster.
     * 
     */
    private final @Nullable String dnsPrefix;
    /**
     * (DEPRECATING) Whether to enable Kubernetes pod security policy (preview). This feature is set for removal on October 15th, 2020. Learn more at aka.ms/aks/azpodpolicy.
     * 
     */
    private final @Nullable Boolean enablePodSecurityPolicy;
    /**
     * Whether to enable Kubernetes Role-Based Access Control.
     * 
     */
    private final @Nullable Boolean enableRBAC;
    /**
     * The extended location of the Virtual Machine.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * FQDN for the master pool.
     * 
     */
    private final String fqdn;
    /**
     * FQDN subdomain specified when creating private cluster with custom private dns zone.
     * 
     */
    private final @Nullable String fqdnSubdomain;
    /**
     * Configurations for provisioning the cluster with HTTP proxy servers.
     * 
     */
    private final @Nullable ManagedClusterHTTPProxyConfigResponse httpProxyConfig;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * The identity of the managed cluster, if configured.
     * 
     */
    private final @Nullable ManagedClusterIdentityResponse identity;
    /**
     * Identities associated with the cluster.
     * 
     */
    private final @Nullable Map<String,ManagedClusterPropertiesResponseIdentityProfile> identityProfile;
    /**
     * Version of Kubernetes specified when creating the managed cluster.
     * 
     */
    private final @Nullable String kubernetesVersion;
    /**
     * Profile for Linux VMs in the container service cluster.
     * 
     */
    private final @Nullable ContainerServiceLinuxProfileResponse linuxProfile;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * The max number of agent pools for the managed cluster.
     * 
     */
    private final Integer maxAgentPools;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Profile of network configuration.
     * 
     */
    private final @Nullable ContainerServiceNetworkProfileResponse networkProfile;
    /**
     * Name of the resource group containing agent pool nodes.
     * 
     */
    private final @Nullable String nodeResourceGroup;
    /**
     * Profile of managed cluster pod identity.
     * 
     */
    private final @Nullable ManagedClusterPodIdentityProfileResponse podIdentityProfile;
    /**
     * Represents the Power State of the cluster
     * 
     */
    private final PowerStateResponse powerState;
    /**
     * FQDN of private cluster.
     * 
     */
    private final String privateFQDN;
    /**
     * Private link resources associated with the cluster.
     * 
     */
    private final @Nullable List<PrivateLinkResourceResponse> privateLinkResources;
    /**
     * The current deployment or provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * Information about a service principal identity for the cluster to use for manipulating Azure APIs.
     * 
     */
    private final @Nullable ManagedClusterServicePrincipalProfileResponse servicePrincipalProfile;
    /**
     * The managed cluster SKU.
     * 
     */
    private final @Nullable ManagedClusterSKUResponse sku;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * Profile for Windows VMs in the container service cluster.
     * 
     */
    private final @Nullable ManagedClusterWindowsProfileResponse windowsProfile;

    @OutputCustomType.Constructor({"aadProfile","addonProfiles","agentPoolProfiles","apiServerAccessProfile","autoScalerProfile","autoUpgradeProfile","azurePortalFQDN","disableLocalAccounts","diskEncryptionSetID","dnsPrefix","enablePodSecurityPolicy","enableRBAC","extendedLocation","fqdn","fqdnSubdomain","httpProxyConfig","id","identity","identityProfile","kubernetesVersion","linuxProfile","location","maxAgentPools","name","networkProfile","nodeResourceGroup","podIdentityProfile","powerState","privateFQDN","privateLinkResources","provisioningState","servicePrincipalProfile","sku","tags","type","windowsProfile"})
    private GetManagedClusterResult(
        @Nullable ManagedClusterAADProfileResponse aadProfile,
        @Nullable Map<String,ManagedClusterAddonProfileResponse> addonProfiles,
        @Nullable List<ManagedClusterAgentPoolProfileResponse> agentPoolProfiles,
        @Nullable ManagedClusterAPIServerAccessProfileResponse apiServerAccessProfile,
        @Nullable ManagedClusterPropertiesResponseAutoScalerProfile autoScalerProfile,
        @Nullable ManagedClusterAutoUpgradeProfileResponse autoUpgradeProfile,
        String azurePortalFQDN,
        @Nullable Boolean disableLocalAccounts,
        @Nullable String diskEncryptionSetID,
        @Nullable String dnsPrefix,
        @Nullable Boolean enablePodSecurityPolicy,
        @Nullable Boolean enableRBAC,
        @Nullable ExtendedLocationResponse extendedLocation,
        String fqdn,
        @Nullable String fqdnSubdomain,
        @Nullable ManagedClusterHTTPProxyConfigResponse httpProxyConfig,
        String id,
        @Nullable ManagedClusterIdentityResponse identity,
        @Nullable Map<String,ManagedClusterPropertiesResponseIdentityProfile> identityProfile,
        @Nullable String kubernetesVersion,
        @Nullable ContainerServiceLinuxProfileResponse linuxProfile,
        String location,
        Integer maxAgentPools,
        String name,
        @Nullable ContainerServiceNetworkProfileResponse networkProfile,
        @Nullable String nodeResourceGroup,
        @Nullable ManagedClusterPodIdentityProfileResponse podIdentityProfile,
        PowerStateResponse powerState,
        String privateFQDN,
        @Nullable List<PrivateLinkResourceResponse> privateLinkResources,
        String provisioningState,
        @Nullable ManagedClusterServicePrincipalProfileResponse servicePrincipalProfile,
        @Nullable ManagedClusterSKUResponse sku,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable ManagedClusterWindowsProfileResponse windowsProfile) {
        this.aadProfile = aadProfile;
        this.addonProfiles = addonProfiles;
        this.agentPoolProfiles = agentPoolProfiles;
        this.apiServerAccessProfile = apiServerAccessProfile;
        this.autoScalerProfile = autoScalerProfile;
        this.autoUpgradeProfile = autoUpgradeProfile;
        this.azurePortalFQDN = Objects.requireNonNull(azurePortalFQDN);
        this.disableLocalAccounts = disableLocalAccounts;
        this.diskEncryptionSetID = diskEncryptionSetID;
        this.dnsPrefix = dnsPrefix;
        this.enablePodSecurityPolicy = enablePodSecurityPolicy;
        this.enableRBAC = enableRBAC;
        this.extendedLocation = extendedLocation;
        this.fqdn = Objects.requireNonNull(fqdn);
        this.fqdnSubdomain = fqdnSubdomain;
        this.httpProxyConfig = httpProxyConfig;
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.identityProfile = identityProfile;
        this.kubernetesVersion = kubernetesVersion;
        this.linuxProfile = linuxProfile;
        this.location = Objects.requireNonNull(location);
        this.maxAgentPools = Objects.requireNonNull(maxAgentPools);
        this.name = Objects.requireNonNull(name);
        this.networkProfile = networkProfile;
        this.nodeResourceGroup = nodeResourceGroup;
        this.podIdentityProfile = podIdentityProfile;
        this.powerState = Objects.requireNonNull(powerState);
        this.privateFQDN = Objects.requireNonNull(privateFQDN);
        this.privateLinkResources = privateLinkResources;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.servicePrincipalProfile = servicePrincipalProfile;
        this.sku = sku;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.windowsProfile = windowsProfile;
    }

    /**
     * Profile of Azure Active Directory configuration.
     * 
     */
    public Optional<ManagedClusterAADProfileResponse> getAadProfile() {
        return Optional.ofNullable(this.aadProfile);
    }
    /**
     * Profile of managed cluster add-on.
     * 
     */
    public Map<String,ManagedClusterAddonProfileResponse> getAddonProfiles() {
        return this.addonProfiles == null ? Map.of() : this.addonProfiles;
    }
    /**
     * Properties of the agent pool.
     * 
     */
    public List<ManagedClusterAgentPoolProfileResponse> getAgentPoolProfiles() {
        return this.agentPoolProfiles == null ? List.of() : this.agentPoolProfiles;
    }
    /**
     * Access profile for managed cluster API server.
     * 
     */
    public Optional<ManagedClusterAPIServerAccessProfileResponse> getApiServerAccessProfile() {
        return Optional.ofNullable(this.apiServerAccessProfile);
    }
    /**
     * Parameters to be applied to the cluster-autoscaler when enabled
     * 
     */
    public Optional<ManagedClusterPropertiesResponseAutoScalerProfile> getAutoScalerProfile() {
        return Optional.ofNullable(this.autoScalerProfile);
    }
    /**
     * Profile of auto upgrade configuration.
     * 
     */
    public Optional<ManagedClusterAutoUpgradeProfileResponse> getAutoUpgradeProfile() {
        return Optional.ofNullable(this.autoUpgradeProfile);
    }
    /**
     * FQDN for the master pool which used by proxy config.
     * 
     */
    public String getAzurePortalFQDN() {
        return this.azurePortalFQDN;
    }
    /**
     * If set to true, getting static credential will be disabled for this cluster. Expected to only be used for AAD clusters.
     * 
     */
    public Optional<Boolean> getDisableLocalAccounts() {
        return Optional.ofNullable(this.disableLocalAccounts);
    }
    /**
     * ResourceId of the disk encryption set to use for enabling encryption at rest.
     * 
     */
    public Optional<String> getDiskEncryptionSetID() {
        return Optional.ofNullable(this.diskEncryptionSetID);
    }
    /**
     * DNS prefix specified when creating the managed cluster.
     * 
     */
    public Optional<String> getDnsPrefix() {
        return Optional.ofNullable(this.dnsPrefix);
    }
    /**
     * (DEPRECATING) Whether to enable Kubernetes pod security policy (preview). This feature is set for removal on October 15th, 2020. Learn more at aka.ms/aks/azpodpolicy.
     * 
     */
    public Optional<Boolean> getEnablePodSecurityPolicy() {
        return Optional.ofNullable(this.enablePodSecurityPolicy);
    }
    /**
     * Whether to enable Kubernetes Role-Based Access Control.
     * 
     */
    public Optional<Boolean> getEnableRBAC() {
        return Optional.ofNullable(this.enableRBAC);
    }
    /**
     * The extended location of the Virtual Machine.
     * 
     */
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * FQDN for the master pool.
     * 
     */
    public String getFqdn() {
        return this.fqdn;
    }
    /**
     * FQDN subdomain specified when creating private cluster with custom private dns zone.
     * 
     */
    public Optional<String> getFqdnSubdomain() {
        return Optional.ofNullable(this.fqdnSubdomain);
    }
    /**
     * Configurations for provisioning the cluster with HTTP proxy servers.
     * 
     */
    public Optional<ManagedClusterHTTPProxyConfigResponse> getHttpProxyConfig() {
        return Optional.ofNullable(this.httpProxyConfig);
    }
    /**
     * Resource Id
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The identity of the managed cluster, if configured.
     * 
     */
    public Optional<ManagedClusterIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Identities associated with the cluster.
     * 
     */
    public Map<String,ManagedClusterPropertiesResponseIdentityProfile> getIdentityProfile() {
        return this.identityProfile == null ? Map.of() : this.identityProfile;
    }
    /**
     * Version of Kubernetes specified when creating the managed cluster.
     * 
     */
    public Optional<String> getKubernetesVersion() {
        return Optional.ofNullable(this.kubernetesVersion);
    }
    /**
     * Profile for Linux VMs in the container service cluster.
     * 
     */
    public Optional<ContainerServiceLinuxProfileResponse> getLinuxProfile() {
        return Optional.ofNullable(this.linuxProfile);
    }
    /**
     * Resource location
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * The max number of agent pools for the managed cluster.
     * 
     */
    public Integer getMaxAgentPools() {
        return this.maxAgentPools;
    }
    /**
     * Resource name
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Profile of network configuration.
     * 
     */
    public Optional<ContainerServiceNetworkProfileResponse> getNetworkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }
    /**
     * Name of the resource group containing agent pool nodes.
     * 
     */
    public Optional<String> getNodeResourceGroup() {
        return Optional.ofNullable(this.nodeResourceGroup);
    }
    /**
     * Profile of managed cluster pod identity.
     * 
     */
    public Optional<ManagedClusterPodIdentityProfileResponse> getPodIdentityProfile() {
        return Optional.ofNullable(this.podIdentityProfile);
    }
    /**
     * Represents the Power State of the cluster
     * 
     */
    public PowerStateResponse getPowerState() {
        return this.powerState;
    }
    /**
     * FQDN of private cluster.
     * 
     */
    public String getPrivateFQDN() {
        return this.privateFQDN;
    }
    /**
     * Private link resources associated with the cluster.
     * 
     */
    public List<PrivateLinkResourceResponse> getPrivateLinkResources() {
        return this.privateLinkResources == null ? List.of() : this.privateLinkResources;
    }
    /**
     * The current deployment or provisioning state, which only appears in the response.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Information about a service principal identity for the cluster to use for manipulating Azure APIs.
     * 
     */
    public Optional<ManagedClusterServicePrincipalProfileResponse> getServicePrincipalProfile() {
        return Optional.ofNullable(this.servicePrincipalProfile);
    }
    /**
     * The managed cluster SKU.
     * 
     */
    public Optional<ManagedClusterSKUResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Resource tags
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Profile for Windows VMs in the container service cluster.
     * 
     */
    public Optional<ManagedClusterWindowsProfileResponse> getWindowsProfile() {
        return Optional.ofNullable(this.windowsProfile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ManagedClusterAADProfileResponse aadProfile;
        private @Nullable Map<String,ManagedClusterAddonProfileResponse> addonProfiles;
        private @Nullable List<ManagedClusterAgentPoolProfileResponse> agentPoolProfiles;
        private @Nullable ManagedClusterAPIServerAccessProfileResponse apiServerAccessProfile;
        private @Nullable ManagedClusterPropertiesResponseAutoScalerProfile autoScalerProfile;
        private @Nullable ManagedClusterAutoUpgradeProfileResponse autoUpgradeProfile;
        private String azurePortalFQDN;
        private @Nullable Boolean disableLocalAccounts;
        private @Nullable String diskEncryptionSetID;
        private @Nullable String dnsPrefix;
        private @Nullable Boolean enablePodSecurityPolicy;
        private @Nullable Boolean enableRBAC;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private String fqdn;
        private @Nullable String fqdnSubdomain;
        private @Nullable ManagedClusterHTTPProxyConfigResponse httpProxyConfig;
        private String id;
        private @Nullable ManagedClusterIdentityResponse identity;
        private @Nullable Map<String,ManagedClusterPropertiesResponseIdentityProfile> identityProfile;
        private @Nullable String kubernetesVersion;
        private @Nullable ContainerServiceLinuxProfileResponse linuxProfile;
        private String location;
        private Integer maxAgentPools;
        private String name;
        private @Nullable ContainerServiceNetworkProfileResponse networkProfile;
        private @Nullable String nodeResourceGroup;
        private @Nullable ManagedClusterPodIdentityProfileResponse podIdentityProfile;
        private PowerStateResponse powerState;
        private String privateFQDN;
        private @Nullable List<PrivateLinkResourceResponse> privateLinkResources;
        private String provisioningState;
        private @Nullable ManagedClusterServicePrincipalProfileResponse servicePrincipalProfile;
        private @Nullable ManagedClusterSKUResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable ManagedClusterWindowsProfileResponse windowsProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadProfile = defaults.aadProfile;
    	      this.addonProfiles = defaults.addonProfiles;
    	      this.agentPoolProfiles = defaults.agentPoolProfiles;
    	      this.apiServerAccessProfile = defaults.apiServerAccessProfile;
    	      this.autoScalerProfile = defaults.autoScalerProfile;
    	      this.autoUpgradeProfile = defaults.autoUpgradeProfile;
    	      this.azurePortalFQDN = defaults.azurePortalFQDN;
    	      this.disableLocalAccounts = defaults.disableLocalAccounts;
    	      this.diskEncryptionSetID = defaults.diskEncryptionSetID;
    	      this.dnsPrefix = defaults.dnsPrefix;
    	      this.enablePodSecurityPolicy = defaults.enablePodSecurityPolicy;
    	      this.enableRBAC = defaults.enableRBAC;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.fqdn = defaults.fqdn;
    	      this.fqdnSubdomain = defaults.fqdnSubdomain;
    	      this.httpProxyConfig = defaults.httpProxyConfig;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.identityProfile = defaults.identityProfile;
    	      this.kubernetesVersion = defaults.kubernetesVersion;
    	      this.linuxProfile = defaults.linuxProfile;
    	      this.location = defaults.location;
    	      this.maxAgentPools = defaults.maxAgentPools;
    	      this.name = defaults.name;
    	      this.networkProfile = defaults.networkProfile;
    	      this.nodeResourceGroup = defaults.nodeResourceGroup;
    	      this.podIdentityProfile = defaults.podIdentityProfile;
    	      this.powerState = defaults.powerState;
    	      this.privateFQDN = defaults.privateFQDN;
    	      this.privateLinkResources = defaults.privateLinkResources;
    	      this.provisioningState = defaults.provisioningState;
    	      this.servicePrincipalProfile = defaults.servicePrincipalProfile;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.windowsProfile = defaults.windowsProfile;
        }

        public Builder setAadProfile(@Nullable ManagedClusterAADProfileResponse aadProfile) {
            this.aadProfile = aadProfile;
            return this;
        }

        public Builder setAddonProfiles(@Nullable Map<String,ManagedClusterAddonProfileResponse> addonProfiles) {
            this.addonProfiles = addonProfiles;
            return this;
        }

        public Builder setAgentPoolProfiles(@Nullable List<ManagedClusterAgentPoolProfileResponse> agentPoolProfiles) {
            this.agentPoolProfiles = agentPoolProfiles;
            return this;
        }

        public Builder setApiServerAccessProfile(@Nullable ManagedClusterAPIServerAccessProfileResponse apiServerAccessProfile) {
            this.apiServerAccessProfile = apiServerAccessProfile;
            return this;
        }

        public Builder setAutoScalerProfile(@Nullable ManagedClusterPropertiesResponseAutoScalerProfile autoScalerProfile) {
            this.autoScalerProfile = autoScalerProfile;
            return this;
        }

        public Builder setAutoUpgradeProfile(@Nullable ManagedClusterAutoUpgradeProfileResponse autoUpgradeProfile) {
            this.autoUpgradeProfile = autoUpgradeProfile;
            return this;
        }

        public Builder setAzurePortalFQDN(String azurePortalFQDN) {
            this.azurePortalFQDN = Objects.requireNonNull(azurePortalFQDN);
            return this;
        }

        public Builder setDisableLocalAccounts(@Nullable Boolean disableLocalAccounts) {
            this.disableLocalAccounts = disableLocalAccounts;
            return this;
        }

        public Builder setDiskEncryptionSetID(@Nullable String diskEncryptionSetID) {
            this.diskEncryptionSetID = diskEncryptionSetID;
            return this;
        }

        public Builder setDnsPrefix(@Nullable String dnsPrefix) {
            this.dnsPrefix = dnsPrefix;
            return this;
        }

        public Builder setEnablePodSecurityPolicy(@Nullable Boolean enablePodSecurityPolicy) {
            this.enablePodSecurityPolicy = enablePodSecurityPolicy;
            return this;
        }

        public Builder setEnableRBAC(@Nullable Boolean enableRBAC) {
            this.enableRBAC = enableRBAC;
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setFqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }

        public Builder setFqdnSubdomain(@Nullable String fqdnSubdomain) {
            this.fqdnSubdomain = fqdnSubdomain;
            return this;
        }

        public Builder setHttpProxyConfig(@Nullable ManagedClusterHTTPProxyConfigResponse httpProxyConfig) {
            this.httpProxyConfig = httpProxyConfig;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ManagedClusterIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentityProfile(@Nullable Map<String,ManagedClusterPropertiesResponseIdentityProfile> identityProfile) {
            this.identityProfile = identityProfile;
            return this;
        }

        public Builder setKubernetesVersion(@Nullable String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }

        public Builder setLinuxProfile(@Nullable ContainerServiceLinuxProfileResponse linuxProfile) {
            this.linuxProfile = linuxProfile;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMaxAgentPools(Integer maxAgentPools) {
            this.maxAgentPools = Objects.requireNonNull(maxAgentPools);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkProfile(@Nullable ContainerServiceNetworkProfileResponse networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder setNodeResourceGroup(@Nullable String nodeResourceGroup) {
            this.nodeResourceGroup = nodeResourceGroup;
            return this;
        }

        public Builder setPodIdentityProfile(@Nullable ManagedClusterPodIdentityProfileResponse podIdentityProfile) {
            this.podIdentityProfile = podIdentityProfile;
            return this;
        }

        public Builder setPowerState(PowerStateResponse powerState) {
            this.powerState = Objects.requireNonNull(powerState);
            return this;
        }

        public Builder setPrivateFQDN(String privateFQDN) {
            this.privateFQDN = Objects.requireNonNull(privateFQDN);
            return this;
        }

        public Builder setPrivateLinkResources(@Nullable List<PrivateLinkResourceResponse> privateLinkResources) {
            this.privateLinkResources = privateLinkResources;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setServicePrincipalProfile(@Nullable ManagedClusterServicePrincipalProfileResponse servicePrincipalProfile) {
            this.servicePrincipalProfile = servicePrincipalProfile;
            return this;
        }

        public Builder setSku(@Nullable ManagedClusterSKUResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWindowsProfile(@Nullable ManagedClusterWindowsProfileResponse windowsProfile) {
            this.windowsProfile = windowsProfile;
            return this;
        }

        public GetManagedClusterResult build() {
            return new GetManagedClusterResult(aadProfile, addonProfiles, agentPoolProfiles, apiServerAccessProfile, autoScalerProfile, autoUpgradeProfile, azurePortalFQDN, disableLocalAccounts, diskEncryptionSetID, dnsPrefix, enablePodSecurityPolicy, enableRBAC, extendedLocation, fqdn, fqdnSubdomain, httpProxyConfig, id, identity, identityProfile, kubernetesVersion, linuxProfile, location, maxAgentPools, name, networkProfile, nodeResourceGroup, podIdentityProfile, powerState, privateFQDN, privateLinkResources, provisioningState, servicePrincipalProfile, sku, tags, type, windowsProfile);
        }
    }
}
