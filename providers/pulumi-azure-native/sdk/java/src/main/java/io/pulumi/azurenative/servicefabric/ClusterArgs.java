// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric;

import io.pulumi.azurenative.servicefabric.inputs.ApplicationTypeVersionsCleanupPolicyArgs;
import io.pulumi.azurenative.servicefabric.inputs.AzureActiveDirectoryArgs;
import io.pulumi.azurenative.servicefabric.inputs.CertificateDescriptionArgs;
import io.pulumi.azurenative.servicefabric.inputs.ClientCertificateCommonNameArgs;
import io.pulumi.azurenative.servicefabric.inputs.ClientCertificateThumbprintArgs;
import io.pulumi.azurenative.servicefabric.inputs.ClusterUpgradePolicyArgs;
import io.pulumi.azurenative.servicefabric.inputs.DiagnosticsStorageAccountConfigArgs;
import io.pulumi.azurenative.servicefabric.inputs.NodeTypeDescriptionArgs;
import io.pulumi.azurenative.servicefabric.inputs.ServerCertificateCommonNamesArgs;
import io.pulumi.azurenative.servicefabric.inputs.SettingsSectionDescriptionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * The list of add-on features to enable in the cluster.
     * 
     */
    @InputImport(name="addOnFeatures")
      private final @Nullable Input<List<String>> addOnFeatures;

    public Input<List<String>> getAddOnFeatures() {
        return this.addOnFeatures == null ? Input.empty() : this.addOnFeatures;
    }

    /**
     * The policy used to clean up unused versions.
     * 
     */
    @InputImport(name="applicationTypeVersionsCleanupPolicy")
      private final @Nullable Input<ApplicationTypeVersionsCleanupPolicyArgs> applicationTypeVersionsCleanupPolicy;

    public Input<ApplicationTypeVersionsCleanupPolicyArgs> getApplicationTypeVersionsCleanupPolicy() {
        return this.applicationTypeVersionsCleanupPolicy == null ? Input.empty() : this.applicationTypeVersionsCleanupPolicy;
    }

    /**
     * The AAD authentication settings of the cluster.
     * 
     */
    @InputImport(name="azureActiveDirectory")
      private final @Nullable Input<AzureActiveDirectoryArgs> azureActiveDirectory;

    public Input<AzureActiveDirectoryArgs> getAzureActiveDirectory() {
        return this.azureActiveDirectory == null ? Input.empty() : this.azureActiveDirectory;
    }

    /**
     * The certificate to use for securing the cluster. The certificate provided will be used for node to node security within the cluster, SSL certificate for cluster management endpoint and default admin client.
     * 
     */
    @InputImport(name="certificate")
      private final @Nullable Input<CertificateDescriptionArgs> certificate;

    public Input<CertificateDescriptionArgs> getCertificate() {
        return this.certificate == null ? Input.empty() : this.certificate;
    }

    /**
     * Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    @InputImport(name="certificateCommonNames")
      private final @Nullable Input<ServerCertificateCommonNamesArgs> certificateCommonNames;

    public Input<ServerCertificateCommonNamesArgs> getCertificateCommonNames() {
        return this.certificateCommonNames == null ? Input.empty() : this.certificateCommonNames;
    }

    /**
     * The list of client certificates referenced by common name that are allowed to manage the cluster.
     * 
     */
    @InputImport(name="clientCertificateCommonNames")
      private final @Nullable Input<List<ClientCertificateCommonNameArgs>> clientCertificateCommonNames;

    public Input<List<ClientCertificateCommonNameArgs>> getClientCertificateCommonNames() {
        return this.clientCertificateCommonNames == null ? Input.empty() : this.clientCertificateCommonNames;
    }

    /**
     * The list of client certificates referenced by thumbprint that are allowed to manage the cluster.
     * 
     */
    @InputImport(name="clientCertificateThumbprints")
      private final @Nullable Input<List<ClientCertificateThumbprintArgs>> clientCertificateThumbprints;

    public Input<List<ClientCertificateThumbprintArgs>> getClientCertificateThumbprints() {
        return this.clientCertificateThumbprints == null ? Input.empty() : this.clientCertificateThumbprints;
    }

    /**
     * The Service Fabric runtime version of the cluster. This property can only by set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing clusters use **availableClusterVersions**.
     * 
     */
    @InputImport(name="clusterCodeVersion")
      private final @Nullable Input<String> clusterCodeVersion;

    public Input<String> getClusterCodeVersion() {
        return this.clusterCodeVersion == null ? Input.empty() : this.clusterCodeVersion;
    }

    /**
     * The name of the cluster resource.
     * 
     */
    @InputImport(name="clusterName")
      private final @Nullable Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName == null ? Input.empty() : this.clusterName;
    }

    /**
     * The storage account information for storing Service Fabric diagnostic logs.
     * 
     */
    @InputImport(name="diagnosticsStorageAccountConfig")
      private final @Nullable Input<DiagnosticsStorageAccountConfigArgs> diagnosticsStorageAccountConfig;

    public Input<DiagnosticsStorageAccountConfigArgs> getDiagnosticsStorageAccountConfig() {
        return this.diagnosticsStorageAccountConfig == null ? Input.empty() : this.diagnosticsStorageAccountConfig;
    }

    /**
     * Indicates if the event store service is enabled.
     * 
     */
    @InputImport(name="eventStoreServiceEnabled")
      private final @Nullable Input<Boolean> eventStoreServiceEnabled;

    public Input<Boolean> getEventStoreServiceEnabled() {
        return this.eventStoreServiceEnabled == null ? Input.empty() : this.eventStoreServiceEnabled;
    }

    /**
     * The list of custom fabric settings to configure the cluster.
     * 
     */
    @InputImport(name="fabricSettings")
      private final @Nullable Input<List<SettingsSectionDescriptionArgs>> fabricSettings;

    public Input<List<SettingsSectionDescriptionArgs>> getFabricSettings() {
        return this.fabricSettings == null ? Input.empty() : this.fabricSettings;
    }

    /**
     * Azure resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The http management endpoint of the cluster.
     * 
     */
    @InputImport(name="managementEndpoint", required=true)
      private final Input<String> managementEndpoint;

    public Input<String> getManagementEndpoint() {
        return this.managementEndpoint;
    }

    /**
     * The list of node types in the cluster.
     * 
     */
    @InputImport(name="nodeTypes", required=true)
      private final Input<List<NodeTypeDescriptionArgs>> nodeTypes;

    public Input<List<NodeTypeDescriptionArgs>> getNodeTypes() {
        return this.nodeTypes;
    }

    /**
     * The reliability level sets the replica set size of system services. Learn about [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     * 
     *   - None - Run the System services with a target replica set count of 1. This should only be used for test clusters.
     *   - Bronze - Run the System services with a target replica set count of 3. This should only be used for test clusters.
     *   - Silver - Run the System services with a target replica set count of 5.
     *   - Gold - Run the System services with a target replica set count of 7.
     *   - Platinum - Run the System services with a target replica set count of 9.
     * 
     */
    @InputImport(name="reliabilityLevel")
      private final @Nullable Input<String> reliabilityLevel;

    public Input<String> getReliabilityLevel() {
        return this.reliabilityLevel == null ? Input.empty() : this.reliabilityLevel;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The server certificate used by reverse proxy.
     * 
     */
    @InputImport(name="reverseProxyCertificate")
      private final @Nullable Input<CertificateDescriptionArgs> reverseProxyCertificate;

    public Input<CertificateDescriptionArgs> getReverseProxyCertificate() {
        return this.reverseProxyCertificate == null ? Input.empty() : this.reverseProxyCertificate;
    }

    /**
     * Describes a list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    @InputImport(name="reverseProxyCertificateCommonNames")
      private final @Nullable Input<ServerCertificateCommonNamesArgs> reverseProxyCertificateCommonNames;

    public Input<ServerCertificateCommonNamesArgs> getReverseProxyCertificateCommonNames() {
        return this.reverseProxyCertificateCommonNames == null ? Input.empty() : this.reverseProxyCertificateCommonNames;
    }

    /**
     * Azure resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The policy to use when upgrading the cluster.
     * 
     */
    @InputImport(name="upgradeDescription")
      private final @Nullable Input<ClusterUpgradePolicyArgs> upgradeDescription;

    public Input<ClusterUpgradePolicyArgs> getUpgradeDescription() {
        return this.upgradeDescription == null ? Input.empty() : this.upgradeDescription;
    }

    /**
     * The upgrade mode of the cluster when new Service Fabric runtime version is available.
     * 
     *   - Automatic - The cluster will be automatically upgraded to the latest Service Fabric runtime version as soon as it is available.
     *   - Manual - The cluster will not be automatically upgraded to the latest Service Fabric runtime version. The cluster is upgraded by setting the **clusterCodeVersion** property in the cluster resource.
     * 
     */
    @InputImport(name="upgradeMode")
      private final @Nullable Input<String> upgradeMode;

    public Input<String> getUpgradeMode() {
        return this.upgradeMode == null ? Input.empty() : this.upgradeMode;
    }

    /**
     * The VM image VMSS has been configured with. Generic names such as Windows or Linux can be used.
     * 
     */
    @InputImport(name="vmImage")
      private final @Nullable Input<String> vmImage;

    public Input<String> getVmImage() {
        return this.vmImage == null ? Input.empty() : this.vmImage;
    }

    public ClusterArgs(
        @Nullable Input<List<String>> addOnFeatures,
        @Nullable Input<ApplicationTypeVersionsCleanupPolicyArgs> applicationTypeVersionsCleanupPolicy,
        @Nullable Input<AzureActiveDirectoryArgs> azureActiveDirectory,
        @Nullable Input<CertificateDescriptionArgs> certificate,
        @Nullable Input<ServerCertificateCommonNamesArgs> certificateCommonNames,
        @Nullable Input<List<ClientCertificateCommonNameArgs>> clientCertificateCommonNames,
        @Nullable Input<List<ClientCertificateThumbprintArgs>> clientCertificateThumbprints,
        @Nullable Input<String> clusterCodeVersion,
        @Nullable Input<String> clusterName,
        @Nullable Input<DiagnosticsStorageAccountConfigArgs> diagnosticsStorageAccountConfig,
        @Nullable Input<Boolean> eventStoreServiceEnabled,
        @Nullable Input<List<SettingsSectionDescriptionArgs>> fabricSettings,
        @Nullable Input<String> location,
        Input<String> managementEndpoint,
        Input<List<NodeTypeDescriptionArgs>> nodeTypes,
        @Nullable Input<String> reliabilityLevel,
        Input<String> resourceGroupName,
        @Nullable Input<CertificateDescriptionArgs> reverseProxyCertificate,
        @Nullable Input<ServerCertificateCommonNamesArgs> reverseProxyCertificateCommonNames,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<ClusterUpgradePolicyArgs> upgradeDescription,
        @Nullable Input<String> upgradeMode,
        @Nullable Input<String> vmImage) {
        this.addOnFeatures = addOnFeatures;
        this.applicationTypeVersionsCleanupPolicy = applicationTypeVersionsCleanupPolicy;
        this.azureActiveDirectory = azureActiveDirectory;
        this.certificate = certificate;
        this.certificateCommonNames = certificateCommonNames;
        this.clientCertificateCommonNames = clientCertificateCommonNames;
        this.clientCertificateThumbprints = clientCertificateThumbprints;
        this.clusterCodeVersion = clusterCodeVersion;
        this.clusterName = clusterName;
        this.diagnosticsStorageAccountConfig = diagnosticsStorageAccountConfig;
        this.eventStoreServiceEnabled = eventStoreServiceEnabled;
        this.fabricSettings = fabricSettings;
        this.location = location;
        this.managementEndpoint = Objects.requireNonNull(managementEndpoint, "expected parameter 'managementEndpoint' to be non-null");
        this.nodeTypes = Objects.requireNonNull(nodeTypes, "expected parameter 'nodeTypes' to be non-null");
        this.reliabilityLevel = reliabilityLevel;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.reverseProxyCertificate = reverseProxyCertificate;
        this.reverseProxyCertificateCommonNames = reverseProxyCertificateCommonNames;
        this.tags = tags;
        this.upgradeDescription = upgradeDescription;
        this.upgradeMode = upgradeMode;
        this.vmImage = vmImage;
    }

    private ClusterArgs() {
        this.addOnFeatures = Input.empty();
        this.applicationTypeVersionsCleanupPolicy = Input.empty();
        this.azureActiveDirectory = Input.empty();
        this.certificate = Input.empty();
        this.certificateCommonNames = Input.empty();
        this.clientCertificateCommonNames = Input.empty();
        this.clientCertificateThumbprints = Input.empty();
        this.clusterCodeVersion = Input.empty();
        this.clusterName = Input.empty();
        this.diagnosticsStorageAccountConfig = Input.empty();
        this.eventStoreServiceEnabled = Input.empty();
        this.fabricSettings = Input.empty();
        this.location = Input.empty();
        this.managementEndpoint = Input.empty();
        this.nodeTypes = Input.empty();
        this.reliabilityLevel = Input.empty();
        this.resourceGroupName = Input.empty();
        this.reverseProxyCertificate = Input.empty();
        this.reverseProxyCertificateCommonNames = Input.empty();
        this.tags = Input.empty();
        this.upgradeDescription = Input.empty();
        this.upgradeMode = Input.empty();
        this.vmImage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> addOnFeatures;
        private @Nullable Input<ApplicationTypeVersionsCleanupPolicyArgs> applicationTypeVersionsCleanupPolicy;
        private @Nullable Input<AzureActiveDirectoryArgs> azureActiveDirectory;
        private @Nullable Input<CertificateDescriptionArgs> certificate;
        private @Nullable Input<ServerCertificateCommonNamesArgs> certificateCommonNames;
        private @Nullable Input<List<ClientCertificateCommonNameArgs>> clientCertificateCommonNames;
        private @Nullable Input<List<ClientCertificateThumbprintArgs>> clientCertificateThumbprints;
        private @Nullable Input<String> clusterCodeVersion;
        private @Nullable Input<String> clusterName;
        private @Nullable Input<DiagnosticsStorageAccountConfigArgs> diagnosticsStorageAccountConfig;
        private @Nullable Input<Boolean> eventStoreServiceEnabled;
        private @Nullable Input<List<SettingsSectionDescriptionArgs>> fabricSettings;
        private @Nullable Input<String> location;
        private Input<String> managementEndpoint;
        private Input<List<NodeTypeDescriptionArgs>> nodeTypes;
        private @Nullable Input<String> reliabilityLevel;
        private Input<String> resourceGroupName;
        private @Nullable Input<CertificateDescriptionArgs> reverseProxyCertificate;
        private @Nullable Input<ServerCertificateCommonNamesArgs> reverseProxyCertificateCommonNames;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<ClusterUpgradePolicyArgs> upgradeDescription;
        private @Nullable Input<String> upgradeMode;
        private @Nullable Input<String> vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addOnFeatures = defaults.addOnFeatures;
    	      this.applicationTypeVersionsCleanupPolicy = defaults.applicationTypeVersionsCleanupPolicy;
    	      this.azureActiveDirectory = defaults.azureActiveDirectory;
    	      this.certificate = defaults.certificate;
    	      this.certificateCommonNames = defaults.certificateCommonNames;
    	      this.clientCertificateCommonNames = defaults.clientCertificateCommonNames;
    	      this.clientCertificateThumbprints = defaults.clientCertificateThumbprints;
    	      this.clusterCodeVersion = defaults.clusterCodeVersion;
    	      this.clusterName = defaults.clusterName;
    	      this.diagnosticsStorageAccountConfig = defaults.diagnosticsStorageAccountConfig;
    	      this.eventStoreServiceEnabled = defaults.eventStoreServiceEnabled;
    	      this.fabricSettings = defaults.fabricSettings;
    	      this.location = defaults.location;
    	      this.managementEndpoint = defaults.managementEndpoint;
    	      this.nodeTypes = defaults.nodeTypes;
    	      this.reliabilityLevel = defaults.reliabilityLevel;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.reverseProxyCertificate = defaults.reverseProxyCertificate;
    	      this.reverseProxyCertificateCommonNames = defaults.reverseProxyCertificateCommonNames;
    	      this.tags = defaults.tags;
    	      this.upgradeDescription = defaults.upgradeDescription;
    	      this.upgradeMode = defaults.upgradeMode;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder setAddOnFeatures(@Nullable Input<List<String>> addOnFeatures) {
            this.addOnFeatures = addOnFeatures;
            return this;
        }

        public Builder setAddOnFeatures(@Nullable List<String> addOnFeatures) {
            this.addOnFeatures = Input.ofNullable(addOnFeatures);
            return this;
        }

        public Builder setApplicationTypeVersionsCleanupPolicy(@Nullable Input<ApplicationTypeVersionsCleanupPolicyArgs> applicationTypeVersionsCleanupPolicy) {
            this.applicationTypeVersionsCleanupPolicy = applicationTypeVersionsCleanupPolicy;
            return this;
        }

        public Builder setApplicationTypeVersionsCleanupPolicy(@Nullable ApplicationTypeVersionsCleanupPolicyArgs applicationTypeVersionsCleanupPolicy) {
            this.applicationTypeVersionsCleanupPolicy = Input.ofNullable(applicationTypeVersionsCleanupPolicy);
            return this;
        }

        public Builder setAzureActiveDirectory(@Nullable Input<AzureActiveDirectoryArgs> azureActiveDirectory) {
            this.azureActiveDirectory = azureActiveDirectory;
            return this;
        }

        public Builder setAzureActiveDirectory(@Nullable AzureActiveDirectoryArgs azureActiveDirectory) {
            this.azureActiveDirectory = Input.ofNullable(azureActiveDirectory);
            return this;
        }

        public Builder setCertificate(@Nullable Input<CertificateDescriptionArgs> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder setCertificate(@Nullable CertificateDescriptionArgs certificate) {
            this.certificate = Input.ofNullable(certificate);
            return this;
        }

        public Builder setCertificateCommonNames(@Nullable Input<ServerCertificateCommonNamesArgs> certificateCommonNames) {
            this.certificateCommonNames = certificateCommonNames;
            return this;
        }

        public Builder setCertificateCommonNames(@Nullable ServerCertificateCommonNamesArgs certificateCommonNames) {
            this.certificateCommonNames = Input.ofNullable(certificateCommonNames);
            return this;
        }

        public Builder setClientCertificateCommonNames(@Nullable Input<List<ClientCertificateCommonNameArgs>> clientCertificateCommonNames) {
            this.clientCertificateCommonNames = clientCertificateCommonNames;
            return this;
        }

        public Builder setClientCertificateCommonNames(@Nullable List<ClientCertificateCommonNameArgs> clientCertificateCommonNames) {
            this.clientCertificateCommonNames = Input.ofNullable(clientCertificateCommonNames);
            return this;
        }

        public Builder setClientCertificateThumbprints(@Nullable Input<List<ClientCertificateThumbprintArgs>> clientCertificateThumbprints) {
            this.clientCertificateThumbprints = clientCertificateThumbprints;
            return this;
        }

        public Builder setClientCertificateThumbprints(@Nullable List<ClientCertificateThumbprintArgs> clientCertificateThumbprints) {
            this.clientCertificateThumbprints = Input.ofNullable(clientCertificateThumbprints);
            return this;
        }

        public Builder setClusterCodeVersion(@Nullable Input<String> clusterCodeVersion) {
            this.clusterCodeVersion = clusterCodeVersion;
            return this;
        }

        public Builder setClusterCodeVersion(@Nullable String clusterCodeVersion) {
            this.clusterCodeVersion = Input.ofNullable(clusterCodeVersion);
            return this;
        }

        public Builder setClusterName(@Nullable Input<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public Builder setClusterName(@Nullable String clusterName) {
            this.clusterName = Input.ofNullable(clusterName);
            return this;
        }

        public Builder setDiagnosticsStorageAccountConfig(@Nullable Input<DiagnosticsStorageAccountConfigArgs> diagnosticsStorageAccountConfig) {
            this.diagnosticsStorageAccountConfig = diagnosticsStorageAccountConfig;
            return this;
        }

        public Builder setDiagnosticsStorageAccountConfig(@Nullable DiagnosticsStorageAccountConfigArgs diagnosticsStorageAccountConfig) {
            this.diagnosticsStorageAccountConfig = Input.ofNullable(diagnosticsStorageAccountConfig);
            return this;
        }

        public Builder setEventStoreServiceEnabled(@Nullable Input<Boolean> eventStoreServiceEnabled) {
            this.eventStoreServiceEnabled = eventStoreServiceEnabled;
            return this;
        }

        public Builder setEventStoreServiceEnabled(@Nullable Boolean eventStoreServiceEnabled) {
            this.eventStoreServiceEnabled = Input.ofNullable(eventStoreServiceEnabled);
            return this;
        }

        public Builder setFabricSettings(@Nullable Input<List<SettingsSectionDescriptionArgs>> fabricSettings) {
            this.fabricSettings = fabricSettings;
            return this;
        }

        public Builder setFabricSettings(@Nullable List<SettingsSectionDescriptionArgs> fabricSettings) {
            this.fabricSettings = Input.ofNullable(fabricSettings);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setManagementEndpoint(Input<String> managementEndpoint) {
            this.managementEndpoint = Objects.requireNonNull(managementEndpoint);
            return this;
        }

        public Builder setManagementEndpoint(String managementEndpoint) {
            this.managementEndpoint = Input.of(Objects.requireNonNull(managementEndpoint));
            return this;
        }

        public Builder setNodeTypes(Input<List<NodeTypeDescriptionArgs>> nodeTypes) {
            this.nodeTypes = Objects.requireNonNull(nodeTypes);
            return this;
        }

        public Builder setNodeTypes(List<NodeTypeDescriptionArgs> nodeTypes) {
            this.nodeTypes = Input.of(Objects.requireNonNull(nodeTypes));
            return this;
        }

        public Builder setReliabilityLevel(@Nullable Input<String> reliabilityLevel) {
            this.reliabilityLevel = reliabilityLevel;
            return this;
        }

        public Builder setReliabilityLevel(@Nullable String reliabilityLevel) {
            this.reliabilityLevel = Input.ofNullable(reliabilityLevel);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setReverseProxyCertificate(@Nullable Input<CertificateDescriptionArgs> reverseProxyCertificate) {
            this.reverseProxyCertificate = reverseProxyCertificate;
            return this;
        }

        public Builder setReverseProxyCertificate(@Nullable CertificateDescriptionArgs reverseProxyCertificate) {
            this.reverseProxyCertificate = Input.ofNullable(reverseProxyCertificate);
            return this;
        }

        public Builder setReverseProxyCertificateCommonNames(@Nullable Input<ServerCertificateCommonNamesArgs> reverseProxyCertificateCommonNames) {
            this.reverseProxyCertificateCommonNames = reverseProxyCertificateCommonNames;
            return this;
        }

        public Builder setReverseProxyCertificateCommonNames(@Nullable ServerCertificateCommonNamesArgs reverseProxyCertificateCommonNames) {
            this.reverseProxyCertificateCommonNames = Input.ofNullable(reverseProxyCertificateCommonNames);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUpgradeDescription(@Nullable Input<ClusterUpgradePolicyArgs> upgradeDescription) {
            this.upgradeDescription = upgradeDescription;
            return this;
        }

        public Builder setUpgradeDescription(@Nullable ClusterUpgradePolicyArgs upgradeDescription) {
            this.upgradeDescription = Input.ofNullable(upgradeDescription);
            return this;
        }

        public Builder setUpgradeMode(@Nullable Input<String> upgradeMode) {
            this.upgradeMode = upgradeMode;
            return this;
        }

        public Builder setUpgradeMode(@Nullable String upgradeMode) {
            this.upgradeMode = Input.ofNullable(upgradeMode);
            return this;
        }

        public Builder setVmImage(@Nullable Input<String> vmImage) {
            this.vmImage = vmImage;
            return this;
        }

        public Builder setVmImage(@Nullable String vmImage) {
            this.vmImage = Input.ofNullable(vmImage);
            return this;
        }
        public ClusterArgs build() {
            return new ClusterArgs(addOnFeatures, applicationTypeVersionsCleanupPolicy, azureActiveDirectory, certificate, certificateCommonNames, clientCertificateCommonNames, clientCertificateThumbprints, clusterCodeVersion, clusterName, diagnosticsStorageAccountConfig, eventStoreServiceEnabled, fabricSettings, location, managementEndpoint, nodeTypes, reliabilityLevel, resourceGroupName, reverseProxyCertificate, reverseProxyCertificateCommonNames, tags, upgradeDescription, upgradeMode, vmImage);
        }
    }
}