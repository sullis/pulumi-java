// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerservice.ManagedClusterArgs;
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
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Managed cluster.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:containerservice:ManagedCluster clustername1 /subscriptions/subid1/resourcegroups/rg1/providers/Microsoft.ContainerService/managedClusters/clustername1 
 * ```
 * 
 */
@ResourceType(type="azure-native:containerservice:ManagedCluster")
public class ManagedCluster extends io.pulumi.resources.CustomResource {
    /**
     * Profile of Azure Active Directory configuration.
     * 
     */
    @OutputExport(name="aadProfile", type=ManagedClusterAADProfileResponse.class, parameters={})
    private Output</* @Nullable */ ManagedClusterAADProfileResponse> aadProfile;

    /**
     * @return Profile of Azure Active Directory configuration.
     * 
     */
    public Output</* @Nullable */ ManagedClusterAADProfileResponse> getAadProfile() {
        return this.aadProfile;
    }
    /**
     * Profile of managed cluster add-on.
     * 
     */
    @OutputExport(name="addonProfiles", type=Map.class, parameters={String.class, ManagedClusterAddonProfileResponse.class})
    private Output</* @Nullable */ Map<String,ManagedClusterAddonProfileResponse>> addonProfiles;

    /**
     * @return Profile of managed cluster add-on.
     * 
     */
    public Output</* @Nullable */ Map<String,ManagedClusterAddonProfileResponse>> getAddonProfiles() {
        return this.addonProfiles;
    }
    /**
     * Properties of the agent pool.
     * 
     */
    @OutputExport(name="agentPoolProfiles", type=List.class, parameters={ManagedClusterAgentPoolProfileResponse.class})
    private Output</* @Nullable */ List<ManagedClusterAgentPoolProfileResponse>> agentPoolProfiles;

    /**
     * @return Properties of the agent pool.
     * 
     */
    public Output</* @Nullable */ List<ManagedClusterAgentPoolProfileResponse>> getAgentPoolProfiles() {
        return this.agentPoolProfiles;
    }
    /**
     * Access profile for managed cluster API server.
     * 
     */
    @OutputExport(name="apiServerAccessProfile", type=ManagedClusterAPIServerAccessProfileResponse.class, parameters={})
    private Output</* @Nullable */ ManagedClusterAPIServerAccessProfileResponse> apiServerAccessProfile;

    /**
     * @return Access profile for managed cluster API server.
     * 
     */
    public Output</* @Nullable */ ManagedClusterAPIServerAccessProfileResponse> getApiServerAccessProfile() {
        return this.apiServerAccessProfile;
    }
    /**
     * Parameters to be applied to the cluster-autoscaler when enabled
     * 
     */
    @OutputExport(name="autoScalerProfile", type=ManagedClusterPropertiesResponseAutoScalerProfile.class, parameters={})
    private Output</* @Nullable */ ManagedClusterPropertiesResponseAutoScalerProfile> autoScalerProfile;

    /**
     * @return Parameters to be applied to the cluster-autoscaler when enabled
     * 
     */
    public Output</* @Nullable */ ManagedClusterPropertiesResponseAutoScalerProfile> getAutoScalerProfile() {
        return this.autoScalerProfile;
    }
    /**
     * Profile of auto upgrade configuration.
     * 
     */
    @OutputExport(name="autoUpgradeProfile", type=ManagedClusterAutoUpgradeProfileResponse.class, parameters={})
    private Output</* @Nullable */ ManagedClusterAutoUpgradeProfileResponse> autoUpgradeProfile;

    /**
     * @return Profile of auto upgrade configuration.
     * 
     */
    public Output</* @Nullable */ ManagedClusterAutoUpgradeProfileResponse> getAutoUpgradeProfile() {
        return this.autoUpgradeProfile;
    }
    /**
     * FQDN for the master pool which used by proxy config.
     * 
     */
    @OutputExport(name="azurePortalFQDN", type=String.class, parameters={})
    private Output<String> azurePortalFQDN;

    /**
     * @return FQDN for the master pool which used by proxy config.
     * 
     */
    public Output<String> getAzurePortalFQDN() {
        return this.azurePortalFQDN;
    }
    /**
     * If set to true, getting static credential will be disabled for this cluster. Expected to only be used for AAD clusters.
     * 
     */
    @OutputExport(name="disableLocalAccounts", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableLocalAccounts;

    /**
     * @return If set to true, getting static credential will be disabled for this cluster. Expected to only be used for AAD clusters.
     * 
     */
    public Output</* @Nullable */ Boolean> getDisableLocalAccounts() {
        return this.disableLocalAccounts;
    }
    /**
     * ResourceId of the disk encryption set to use for enabling encryption at rest.
     * 
     */
    @OutputExport(name="diskEncryptionSetID", type=String.class, parameters={})
    private Output</* @Nullable */ String> diskEncryptionSetID;

    /**
     * @return ResourceId of the disk encryption set to use for enabling encryption at rest.
     * 
     */
    public Output</* @Nullable */ String> getDiskEncryptionSetID() {
        return this.diskEncryptionSetID;
    }
    /**
     * DNS prefix specified when creating the managed cluster.
     * 
     */
    @OutputExport(name="dnsPrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> dnsPrefix;

    /**
     * @return DNS prefix specified when creating the managed cluster.
     * 
     */
    public Output</* @Nullable */ String> getDnsPrefix() {
        return this.dnsPrefix;
    }
    /**
     * (DEPRECATING) Whether to enable Kubernetes pod security policy (preview). This feature is set for removal on October 15th, 2020. Learn more at aka.ms/aks/azpodpolicy.
     * 
     */
    @OutputExport(name="enablePodSecurityPolicy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enablePodSecurityPolicy;

    /**
     * @return (DEPRECATING) Whether to enable Kubernetes pod security policy (preview). This feature is set for removal on October 15th, 2020. Learn more at aka.ms/aks/azpodpolicy.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnablePodSecurityPolicy() {
        return this.enablePodSecurityPolicy;
    }
    /**
     * Whether to enable Kubernetes Role-Based Access Control.
     * 
     */
    @OutputExport(name="enableRBAC", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableRBAC;

    /**
     * @return Whether to enable Kubernetes Role-Based Access Control.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableRBAC() {
        return this.enableRBAC;
    }
    /**
     * The extended location of the Virtual Machine.
     * 
     */
    @OutputExport(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location of the Virtual Machine.
     * 
     */
    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    /**
     * FQDN for the master pool.
     * 
     */
    @OutputExport(name="fqdn", type=String.class, parameters={})
    private Output<String> fqdn;

    /**
     * @return FQDN for the master pool.
     * 
     */
    public Output<String> getFqdn() {
        return this.fqdn;
    }
    /**
     * FQDN subdomain specified when creating private cluster with custom private dns zone.
     * 
     */
    @OutputExport(name="fqdnSubdomain", type=String.class, parameters={})
    private Output</* @Nullable */ String> fqdnSubdomain;

    /**
     * @return FQDN subdomain specified when creating private cluster with custom private dns zone.
     * 
     */
    public Output</* @Nullable */ String> getFqdnSubdomain() {
        return this.fqdnSubdomain;
    }
    /**
     * Configurations for provisioning the cluster with HTTP proxy servers.
     * 
     */
    @OutputExport(name="httpProxyConfig", type=ManagedClusterHTTPProxyConfigResponse.class, parameters={})
    private Output</* @Nullable */ ManagedClusterHTTPProxyConfigResponse> httpProxyConfig;

    /**
     * @return Configurations for provisioning the cluster with HTTP proxy servers.
     * 
     */
    public Output</* @Nullable */ ManagedClusterHTTPProxyConfigResponse> getHttpProxyConfig() {
        return this.httpProxyConfig;
    }
    /**
     * The identity of the managed cluster, if configured.
     * 
     */
    @OutputExport(name="identity", type=ManagedClusterIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedClusterIdentityResponse> identity;

    /**
     * @return The identity of the managed cluster, if configured.
     * 
     */
    public Output</* @Nullable */ ManagedClusterIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Identities associated with the cluster.
     * 
     */
    @OutputExport(name="identityProfile", type=Map.class, parameters={String.class, ManagedClusterPropertiesResponseIdentityProfile.class})
    private Output</* @Nullable */ Map<String,ManagedClusterPropertiesResponseIdentityProfile>> identityProfile;

    /**
     * @return Identities associated with the cluster.
     * 
     */
    public Output</* @Nullable */ Map<String,ManagedClusterPropertiesResponseIdentityProfile>> getIdentityProfile() {
        return this.identityProfile;
    }
    /**
     * Version of Kubernetes specified when creating the managed cluster.
     * 
     */
    @OutputExport(name="kubernetesVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> kubernetesVersion;

    /**
     * @return Version of Kubernetes specified when creating the managed cluster.
     * 
     */
    public Output</* @Nullable */ String> getKubernetesVersion() {
        return this.kubernetesVersion;
    }
    /**
     * Profile for Linux VMs in the container service cluster.
     * 
     */
    @OutputExport(name="linuxProfile", type=ContainerServiceLinuxProfileResponse.class, parameters={})
    private Output</* @Nullable */ ContainerServiceLinuxProfileResponse> linuxProfile;

    /**
     * @return Profile for Linux VMs in the container service cluster.
     * 
     */
    public Output</* @Nullable */ ContainerServiceLinuxProfileResponse> getLinuxProfile() {
        return this.linuxProfile;
    }
    /**
     * Resource location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The max number of agent pools for the managed cluster.
     * 
     */
    @OutputExport(name="maxAgentPools", type=Integer.class, parameters={})
    private Output<Integer> maxAgentPools;

    /**
     * @return The max number of agent pools for the managed cluster.
     * 
     */
    public Output<Integer> getMaxAgentPools() {
        return this.maxAgentPools;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Profile of network configuration.
     * 
     */
    @OutputExport(name="networkProfile", type=ContainerServiceNetworkProfileResponse.class, parameters={})
    private Output</* @Nullable */ ContainerServiceNetworkProfileResponse> networkProfile;

    /**
     * @return Profile of network configuration.
     * 
     */
    public Output</* @Nullable */ ContainerServiceNetworkProfileResponse> getNetworkProfile() {
        return this.networkProfile;
    }
    /**
     * Name of the resource group containing agent pool nodes.
     * 
     */
    @OutputExport(name="nodeResourceGroup", type=String.class, parameters={})
    private Output</* @Nullable */ String> nodeResourceGroup;

    /**
     * @return Name of the resource group containing agent pool nodes.
     * 
     */
    public Output</* @Nullable */ String> getNodeResourceGroup() {
        return this.nodeResourceGroup;
    }
    /**
     * Profile of managed cluster pod identity.
     * 
     */
    @OutputExport(name="podIdentityProfile", type=ManagedClusterPodIdentityProfileResponse.class, parameters={})
    private Output</* @Nullable */ ManagedClusterPodIdentityProfileResponse> podIdentityProfile;

    /**
     * @return Profile of managed cluster pod identity.
     * 
     */
    public Output</* @Nullable */ ManagedClusterPodIdentityProfileResponse> getPodIdentityProfile() {
        return this.podIdentityProfile;
    }
    /**
     * Represents the Power State of the cluster
     * 
     */
    @OutputExport(name="powerState", type=PowerStateResponse.class, parameters={})
    private Output<PowerStateResponse> powerState;

    /**
     * @return Represents the Power State of the cluster
     * 
     */
    public Output<PowerStateResponse> getPowerState() {
        return this.powerState;
    }
    /**
     * FQDN of private cluster.
     * 
     */
    @OutputExport(name="privateFQDN", type=String.class, parameters={})
    private Output<String> privateFQDN;

    /**
     * @return FQDN of private cluster.
     * 
     */
    public Output<String> getPrivateFQDN() {
        return this.privateFQDN;
    }
    /**
     * Private link resources associated with the cluster.
     * 
     */
    @OutputExport(name="privateLinkResources", type=List.class, parameters={PrivateLinkResourceResponse.class})
    private Output</* @Nullable */ List<PrivateLinkResourceResponse>> privateLinkResources;

    /**
     * @return Private link resources associated with the cluster.
     * 
     */
    public Output</* @Nullable */ List<PrivateLinkResourceResponse>> getPrivateLinkResources() {
        return this.privateLinkResources;
    }
    /**
     * The current deployment or provisioning state, which only appears in the response.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The current deployment or provisioning state, which only appears in the response.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Information about a service principal identity for the cluster to use for manipulating Azure APIs.
     * 
     */
    @OutputExport(name="servicePrincipalProfile", type=ManagedClusterServicePrincipalProfileResponse.class, parameters={})
    private Output</* @Nullable */ ManagedClusterServicePrincipalProfileResponse> servicePrincipalProfile;

    /**
     * @return Information about a service principal identity for the cluster to use for manipulating Azure APIs.
     * 
     */
    public Output</* @Nullable */ ManagedClusterServicePrincipalProfileResponse> getServicePrincipalProfile() {
        return this.servicePrincipalProfile;
    }
    /**
     * The managed cluster SKU.
     * 
     */
    @OutputExport(name="sku", type=ManagedClusterSKUResponse.class, parameters={})
    private Output</* @Nullable */ ManagedClusterSKUResponse> sku;

    /**
     * @return The managed cluster SKU.
     * 
     */
    public Output</* @Nullable */ ManagedClusterSKUResponse> getSku() {
        return this.sku;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Profile for Windows VMs in the container service cluster.
     * 
     */
    @OutputExport(name="windowsProfile", type=ManagedClusterWindowsProfileResponse.class, parameters={})
    private Output</* @Nullable */ ManagedClusterWindowsProfileResponse> windowsProfile;

    /**
     * @return Profile for Windows VMs in the container service cluster.
     * 
     */
    public Output</* @Nullable */ ManagedClusterWindowsProfileResponse> getWindowsProfile() {
        return this.windowsProfile;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedCluster(String name, ManagedClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerservice:ManagedCluster", name, args == null ? ManagedClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ManagedCluster(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerservice:ManagedCluster", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:containerservice/v20170831:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20180331:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20180801preview:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20190201:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20190401:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20190601:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20190801:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20191001:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20191101:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20200101:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20200201:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20200301:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20200401:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20200601:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20200701:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20200901:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20201101:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20201201:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20210201:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20210301:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20210501:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20210701:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20210801:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20210901:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20211001:ManagedCluster").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20211101preview:ManagedCluster").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ManagedCluster get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ManagedCluster(name, id, options);
    }
}
