// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1beta1.inputs.AutoUpgradeOptionsArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NodeManagement defines the set of node management services turned on for the node pool.
 * 
 */
public final class NodeManagementArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeManagementArgs Empty = new NodeManagementArgs();

    /**
     * Whether the nodes will be automatically repaired.
     * 
     */
    @InputImport(name="autoRepair")
      private final @Nullable Input<Boolean> autoRepair;

    public Input<Boolean> getAutoRepair() {
        return this.autoRepair == null ? Input.empty() : this.autoRepair;
    }

    /**
     * Whether the nodes will be automatically upgraded.
     * 
     */
    @InputImport(name="autoUpgrade")
      private final @Nullable Input<Boolean> autoUpgrade;

    public Input<Boolean> getAutoUpgrade() {
        return this.autoUpgrade == null ? Input.empty() : this.autoUpgrade;
    }

    /**
     * Specifies the Auto Upgrade knobs for the node pool.
     * 
     */
    @InputImport(name="upgradeOptions")
      private final @Nullable Input<AutoUpgradeOptionsArgs> upgradeOptions;

    public Input<AutoUpgradeOptionsArgs> getUpgradeOptions() {
        return this.upgradeOptions == null ? Input.empty() : this.upgradeOptions;
    }

    public NodeManagementArgs(
        @Nullable Input<Boolean> autoRepair,
        @Nullable Input<Boolean> autoUpgrade,
        @Nullable Input<AutoUpgradeOptionsArgs> upgradeOptions) {
        this.autoRepair = autoRepair;
        this.autoUpgrade = autoUpgrade;
        this.upgradeOptions = upgradeOptions;
    }

    private NodeManagementArgs() {
        this.autoRepair = Input.empty();
        this.autoUpgrade = Input.empty();
        this.upgradeOptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoRepair;
        private @Nullable Input<Boolean> autoUpgrade;
        private @Nullable Input<AutoUpgradeOptionsArgs> upgradeOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeManagementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRepair = defaults.autoRepair;
    	      this.autoUpgrade = defaults.autoUpgrade;
    	      this.upgradeOptions = defaults.upgradeOptions;
        }

        public Builder setAutoRepair(@Nullable Input<Boolean> autoRepair) {
            this.autoRepair = autoRepair;
            return this;
        }

        public Builder setAutoRepair(@Nullable Boolean autoRepair) {
            this.autoRepair = Input.ofNullable(autoRepair);
            return this;
        }

        public Builder setAutoUpgrade(@Nullable Input<Boolean> autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }

        public Builder setAutoUpgrade(@Nullable Boolean autoUpgrade) {
            this.autoUpgrade = Input.ofNullable(autoUpgrade);
            return this;
        }

        public Builder setUpgradeOptions(@Nullable Input<AutoUpgradeOptionsArgs> upgradeOptions) {
            this.upgradeOptions = upgradeOptions;
            return this;
        }

        public Builder setUpgradeOptions(@Nullable AutoUpgradeOptionsArgs upgradeOptions) {
            this.upgradeOptions = Input.ofNullable(upgradeOptions);
            return this;
        }
        public NodeManagementArgs build() {
            return new NodeManagementArgs(autoRepair, autoUpgrade, upgradeOptions);
        }
    }
}