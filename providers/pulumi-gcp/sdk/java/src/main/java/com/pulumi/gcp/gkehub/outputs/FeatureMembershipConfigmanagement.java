// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.gkehub.outputs.FeatureMembershipConfigmanagementBinauthz;
import com.pulumi.gcp.gkehub.outputs.FeatureMembershipConfigmanagementConfigSync;
import com.pulumi.gcp.gkehub.outputs.FeatureMembershipConfigmanagementHierarchyController;
import com.pulumi.gcp.gkehub.outputs.FeatureMembershipConfigmanagementPolicyController;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeatureMembershipConfigmanagement {
    /**
     * @return Binauthz configuration for the cluster. Structure is documented below.
     * 
     */
    private final @Nullable FeatureMembershipConfigmanagementBinauthz binauthz;
    /**
     * @return Config Sync configuration for the cluster. Structure is documented below.
     * 
     */
    private final @Nullable FeatureMembershipConfigmanagementConfigSync configSync;
    /**
     * @return Hierarchy Controller configuration for the cluster. Structure is documented below.
     * 
     */
    private final @Nullable FeatureMembershipConfigmanagementHierarchyController hierarchyController;
    /**
     * @return Policy Controller configuration for the cluster. Structure is documented below.
     * 
     */
    private final @Nullable FeatureMembershipConfigmanagementPolicyController policyController;
    /**
     * @return Version of ACM installed.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private FeatureMembershipConfigmanagement(
        @CustomType.Parameter("binauthz") @Nullable FeatureMembershipConfigmanagementBinauthz binauthz,
        @CustomType.Parameter("configSync") @Nullable FeatureMembershipConfigmanagementConfigSync configSync,
        @CustomType.Parameter("hierarchyController") @Nullable FeatureMembershipConfigmanagementHierarchyController hierarchyController,
        @CustomType.Parameter("policyController") @Nullable FeatureMembershipConfigmanagementPolicyController policyController,
        @CustomType.Parameter("version") @Nullable String version) {
        this.binauthz = binauthz;
        this.configSync = configSync;
        this.hierarchyController = hierarchyController;
        this.policyController = policyController;
        this.version = version;
    }

    /**
     * @return Binauthz configuration for the cluster. Structure is documented below.
     * 
     */
    public Optional<FeatureMembershipConfigmanagementBinauthz> binauthz() {
        return Optional.ofNullable(this.binauthz);
    }
    /**
     * @return Config Sync configuration for the cluster. Structure is documented below.
     * 
     */
    public Optional<FeatureMembershipConfigmanagementConfigSync> configSync() {
        return Optional.ofNullable(this.configSync);
    }
    /**
     * @return Hierarchy Controller configuration for the cluster. Structure is documented below.
     * 
     */
    public Optional<FeatureMembershipConfigmanagementHierarchyController> hierarchyController() {
        return Optional.ofNullable(this.hierarchyController);
    }
    /**
     * @return Policy Controller configuration for the cluster. Structure is documented below.
     * 
     */
    public Optional<FeatureMembershipConfigmanagementPolicyController> policyController() {
        return Optional.ofNullable(this.policyController);
    }
    /**
     * @return Version of ACM installed.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipConfigmanagement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FeatureMembershipConfigmanagementBinauthz binauthz;
        private @Nullable FeatureMembershipConfigmanagementConfigSync configSync;
        private @Nullable FeatureMembershipConfigmanagementHierarchyController hierarchyController;
        private @Nullable FeatureMembershipConfigmanagementPolicyController policyController;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureMembershipConfigmanagement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binauthz = defaults.binauthz;
    	      this.configSync = defaults.configSync;
    	      this.hierarchyController = defaults.hierarchyController;
    	      this.policyController = defaults.policyController;
    	      this.version = defaults.version;
        }

        public Builder binauthz(@Nullable FeatureMembershipConfigmanagementBinauthz binauthz) {
            this.binauthz = binauthz;
            return this;
        }
        public Builder configSync(@Nullable FeatureMembershipConfigmanagementConfigSync configSync) {
            this.configSync = configSync;
            return this;
        }
        public Builder hierarchyController(@Nullable FeatureMembershipConfigmanagementHierarchyController hierarchyController) {
            this.hierarchyController = hierarchyController;
            return this;
        }
        public Builder policyController(@Nullable FeatureMembershipConfigmanagementPolicyController policyController) {
            this.policyController = policyController;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public FeatureMembershipConfigmanagement build() {
            return new FeatureMembershipConfigmanagement(binauthz, configSync, hierarchyController, policyController, version);
        }
    }
}
