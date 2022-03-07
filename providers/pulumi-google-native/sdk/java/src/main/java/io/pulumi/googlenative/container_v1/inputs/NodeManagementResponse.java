// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1.inputs.AutoUpgradeOptionsResponse;
import java.lang.Boolean;
import java.util.Objects;


/**
 * NodeManagement defines the set of node management services turned on for the node pool.
 * 
 */
public final class NodeManagementResponse extends io.pulumi.resources.InvokeArgs {

    public static final NodeManagementResponse Empty = new NodeManagementResponse();

    /**
     * A flag that specifies whether the node auto-repair is enabled for the node pool. If enabled, the nodes in this node pool will be monitored and, if they fail health checks too many times, an automatic repair action will be triggered.
     * 
     */
    @InputImport(name="autoRepair", required=true)
      private final Boolean autoRepair;

    public Boolean getAutoRepair() {
        return this.autoRepair;
    }

    /**
     * A flag that specifies whether node auto-upgrade is enabled for the node pool. If enabled, node auto-upgrade helps keep the nodes in your node pool up to date with the latest release version of Kubernetes.
     * 
     */
    @InputImport(name="autoUpgrade", required=true)
      private final Boolean autoUpgrade;

    public Boolean getAutoUpgrade() {
        return this.autoUpgrade;
    }

    /**
     * Specifies the Auto Upgrade knobs for the node pool.
     * 
     */
    @InputImport(name="upgradeOptions", required=true)
      private final AutoUpgradeOptionsResponse upgradeOptions;

    public AutoUpgradeOptionsResponse getUpgradeOptions() {
        return this.upgradeOptions;
    }

    public NodeManagementResponse(
        Boolean autoRepair,
        Boolean autoUpgrade,
        AutoUpgradeOptionsResponse upgradeOptions) {
        this.autoRepair = Objects.requireNonNull(autoRepair, "expected parameter 'autoRepair' to be non-null");
        this.autoUpgrade = Objects.requireNonNull(autoUpgrade, "expected parameter 'autoUpgrade' to be non-null");
        this.upgradeOptions = Objects.requireNonNull(upgradeOptions, "expected parameter 'upgradeOptions' to be non-null");
    }

    private NodeManagementResponse() {
        this.autoRepair = null;
        this.autoUpgrade = null;
        this.upgradeOptions = null;
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

        public Builder setAutoRepair(Boolean autoRepair) {
            this.autoRepair = Objects.requireNonNull(autoRepair);
            return this;
        }

        public Builder setAutoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = Objects.requireNonNull(autoUpgrade);
            return this;
        }

        public Builder setUpgradeOptions(AutoUpgradeOptionsResponse upgradeOptions) {
            this.upgradeOptions = Objects.requireNonNull(upgradeOptions);
            return this;
        }
        public NodeManagementResponse build() {
            return new NodeManagementResponse(autoRepair, autoUpgrade, upgradeOptions);
        }
    }
}