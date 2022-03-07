// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.container_v1beta1.outputs.NodeManagementResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.ShieldedInstanceConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.UpgradeSettingsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AutoprovisioningNodePoolDefaultsResponse {
    /**
     *  The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see: https://cloud.google.com/compute/docs/disks/customer-managed-encryption
     * 
     */
    private final String bootDiskKmsKey;
    /**
     * Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. If unspecified, the default disk size is 100GB.
     * 
     */
    private final Integer diskSizeGb;
    /**
     * Type of the disk attached to each node (e.g. 'pd-standard', 'pd-ssd' or 'pd-balanced') If unspecified, the default disk type is 'pd-standard'
     * 
     */
    private final String diskType;
    /**
     * The image type to use for NAP created node.
     * 
     */
    private final String imageType;
    /**
     * NodeManagement configuration for this NodePool.
     * 
     */
    private final NodeManagementResponse management;
    /**
     * Minimum CPU platform to be used by this instance. The instance may be scheduled on the specified or newer CPU platform. Applicable values are the friendly names of CPU platforms, such as `minCpuPlatform: "Intel Haswell"` or `minCpuPlatform: "Intel Sandy Bridge"`. For more information, read [how to specify min CPU platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform) To unset the min cpu platform field pass "automatic" as field value.
     * 
     */
    private final String minCpuPlatform;
    /**
     * The set of Google API scopes to be made available on all of the node VMs under the "default" service account. The following scopes are recommended, but not required, and by default are not included: * `https://www.googleapis.com/auth/compute` is required for mounting persistent storage on your nodes. * `https://www.googleapis.com/auth/devstorage.read_only` is required for communicating with **gcr.io** (the [Google Container Registry](https://cloud.google.com/container-registry/)). If unspecified, no scopes are added, unless Cloud Logging or Cloud Monitoring are enabled, in which case their required scopes will be added.
     * 
     */
    private final List<String> oauthScopes;
    /**
     * The Google Cloud Platform Service Account to be used by the node VMs. Specify the email address of the Service Account; otherwise, if no Service Account is specified, the "default" service account is used.
     * 
     */
    private final String serviceAccount;
    /**
     * Shielded Instance options.
     * 
     */
    private final ShieldedInstanceConfigResponse shieldedInstanceConfig;
    /**
     * Upgrade settings control disruption and speed of the upgrade.
     * 
     */
    private final UpgradeSettingsResponse upgradeSettings;

    @OutputCustomType.Constructor({"bootDiskKmsKey","diskSizeGb","diskType","imageType","management","minCpuPlatform","oauthScopes","serviceAccount","shieldedInstanceConfig","upgradeSettings"})
    private AutoprovisioningNodePoolDefaultsResponse(
        String bootDiskKmsKey,
        Integer diskSizeGb,
        String diskType,
        String imageType,
        NodeManagementResponse management,
        String minCpuPlatform,
        List<String> oauthScopes,
        String serviceAccount,
        ShieldedInstanceConfigResponse shieldedInstanceConfig,
        UpgradeSettingsResponse upgradeSettings) {
        this.bootDiskKmsKey = Objects.requireNonNull(bootDiskKmsKey);
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
        this.diskType = Objects.requireNonNull(diskType);
        this.imageType = Objects.requireNonNull(imageType);
        this.management = Objects.requireNonNull(management);
        this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
        this.oauthScopes = Objects.requireNonNull(oauthScopes);
        this.serviceAccount = Objects.requireNonNull(serviceAccount);
        this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig);
        this.upgradeSettings = Objects.requireNonNull(upgradeSettings);
    }

    /**
     *  The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see: https://cloud.google.com/compute/docs/disks/customer-managed-encryption
     * 
    */
    public String getBootDiskKmsKey() {
        return this.bootDiskKmsKey;
    }
    /**
     * Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. If unspecified, the default disk size is 100GB.
     * 
    */
    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * Type of the disk attached to each node (e.g. 'pd-standard', 'pd-ssd' or 'pd-balanced') If unspecified, the default disk type is 'pd-standard'
     * 
    */
    public String getDiskType() {
        return this.diskType;
    }
    /**
     * The image type to use for NAP created node.
     * 
    */
    public String getImageType() {
        return this.imageType;
    }
    /**
     * NodeManagement configuration for this NodePool.
     * 
    */
    public NodeManagementResponse getManagement() {
        return this.management;
    }
    /**
     * Minimum CPU platform to be used by this instance. The instance may be scheduled on the specified or newer CPU platform. Applicable values are the friendly names of CPU platforms, such as `minCpuPlatform: "Intel Haswell"` or `minCpuPlatform: "Intel Sandy Bridge"`. For more information, read [how to specify min CPU platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform) To unset the min cpu platform field pass "automatic" as field value.
     * 
    */
    public String getMinCpuPlatform() {
        return this.minCpuPlatform;
    }
    /**
     * The set of Google API scopes to be made available on all of the node VMs under the "default" service account. The following scopes are recommended, but not required, and by default are not included: * `https://www.googleapis.com/auth/compute` is required for mounting persistent storage on your nodes. * `https://www.googleapis.com/auth/devstorage.read_only` is required for communicating with **gcr.io** (the [Google Container Registry](https://cloud.google.com/container-registry/)). If unspecified, no scopes are added, unless Cloud Logging or Cloud Monitoring are enabled, in which case their required scopes will be added.
     * 
    */
    public List<String> getOauthScopes() {
        return this.oauthScopes;
    }
    /**
     * The Google Cloud Platform Service Account to be used by the node VMs. Specify the email address of the Service Account; otherwise, if no Service Account is specified, the "default" service account is used.
     * 
    */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Shielded Instance options.
     * 
    */
    public ShieldedInstanceConfigResponse getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    /**
     * Upgrade settings control disruption and speed of the upgrade.
     * 
    */
    public UpgradeSettingsResponse getUpgradeSettings() {
        return this.upgradeSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoprovisioningNodePoolDefaultsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bootDiskKmsKey;
        private Integer diskSizeGb;
        private String diskType;
        private String imageType;
        private NodeManagementResponse management;
        private String minCpuPlatform;
        private List<String> oauthScopes;
        private String serviceAccount;
        private ShieldedInstanceConfigResponse shieldedInstanceConfig;
        private UpgradeSettingsResponse upgradeSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoprovisioningNodePoolDefaultsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskKmsKey = defaults.bootDiskKmsKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.imageType = defaults.imageType;
    	      this.management = defaults.management;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.upgradeSettings = defaults.upgradeSettings;
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

        public Builder setImageType(String imageType) {
            this.imageType = Objects.requireNonNull(imageType);
            return this;
        }

        public Builder setManagement(NodeManagementResponse management) {
            this.management = Objects.requireNonNull(management);
            return this;
        }

        public Builder setMinCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }

        public Builder setOauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Objects.requireNonNull(oauthScopes);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setShieldedInstanceConfig(ShieldedInstanceConfigResponse shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig);
            return this;
        }

        public Builder setUpgradeSettings(UpgradeSettingsResponse upgradeSettings) {
            this.upgradeSettings = Objects.requireNonNull(upgradeSettings);
            return this;
        }
        public AutoprovisioningNodePoolDefaultsResponse build() {
            return new AutoprovisioningNodePoolDefaultsResponse(bootDiskKmsKey, diskSizeGb, diskType, imageType, management, minCpuPlatform, oauthScopes, serviceAccount, shieldedInstanceConfig, upgradeSettings);
        }
    }
}