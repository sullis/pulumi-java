// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.container_v1.outputs.AutoUpgradeOptionsResponse;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class NodeManagementResponse {
    /**
     * @return A flag that specifies whether the node auto-repair is enabled for the node pool. If enabled, the nodes in this node pool will be monitored and, if they fail health checks too many times, an automatic repair action will be triggered.
     * 
     */
    private final Boolean autoRepair;
    /**
     * @return A flag that specifies whether node auto-upgrade is enabled for the node pool. If enabled, node auto-upgrade helps keep the nodes in your node pool up to date with the latest release version of Kubernetes.
     * 
     */
    private final Boolean autoUpgrade;
    /**
     * @return Specifies the Auto Upgrade knobs for the node pool.
     * 
     */
    private final AutoUpgradeOptionsResponse upgradeOptions;

    @CustomType.Constructor
    private NodeManagementResponse(
        @CustomType.Parameter("autoRepair") Boolean autoRepair,
        @CustomType.Parameter("autoUpgrade") Boolean autoUpgrade,
        @CustomType.Parameter("upgradeOptions") AutoUpgradeOptionsResponse upgradeOptions) {
        this.autoRepair = autoRepair;
        this.autoUpgrade = autoUpgrade;
        this.upgradeOptions = upgradeOptions;
    }

    /**
     * @return A flag that specifies whether the node auto-repair is enabled for the node pool. If enabled, the nodes in this node pool will be monitored and, if they fail health checks too many times, an automatic repair action will be triggered.
     * 
     */
    public Boolean autoRepair() {
        return this.autoRepair;
    }
    /**
     * @return A flag that specifies whether node auto-upgrade is enabled for the node pool. If enabled, node auto-upgrade helps keep the nodes in your node pool up to date with the latest release version of Kubernetes.
     * 
     */
    public Boolean autoUpgrade() {
        return this.autoUpgrade;
    }
    /**
     * @return Specifies the Auto Upgrade knobs for the node pool.
     * 
     */
    public AutoUpgradeOptionsResponse upgradeOptions() {
        return this.upgradeOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeManagementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoRepair;
        private Boolean autoUpgrade;
        private AutoUpgradeOptionsResponse upgradeOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeManagementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRepair = defaults.autoRepair;
    	      this.autoUpgrade = defaults.autoUpgrade;
    	      this.upgradeOptions = defaults.upgradeOptions;
        }

        public Builder autoRepair(Boolean autoRepair) {
            this.autoRepair = Objects.requireNonNull(autoRepair);
            return this;
        }
        public Builder autoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = Objects.requireNonNull(autoUpgrade);
            return this;
        }
        public Builder upgradeOptions(AutoUpgradeOptionsResponse upgradeOptions) {
            this.upgradeOptions = Objects.requireNonNull(upgradeOptions);
            return this;
        }        public NodeManagementResponse build() {
            return new NodeManagementResponse(autoRepair, autoUpgrade, upgradeOptions);
        }
    }
}
