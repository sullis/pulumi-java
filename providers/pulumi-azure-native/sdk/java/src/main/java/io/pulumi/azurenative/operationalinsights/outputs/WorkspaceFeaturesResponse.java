// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkspaceFeaturesResponse {
    /**
     * Dedicated LA cluster resourceId that is linked to the workspaces.
     * 
     */
    private final @Nullable String clusterResourceId;
    /**
     * Disable Non-AAD based Auth.
     * 
     */
    private final @Nullable Boolean disableLocalAuth;
    /**
     * Flag that indicate if data should be exported.
     * 
     */
    private final @Nullable Boolean enableDataExport;
    /**
     * Flag that indicate which permission to use - resource or workspace or both.
     * 
     */
    private final @Nullable Boolean enableLogAccessUsingOnlyResourcePermissions;
    /**
     * Flag that describes if we want to remove the data after 30 days.
     * 
     */
    private final @Nullable Boolean immediatePurgeDataOn30Days;

    @OutputCustomType.Constructor({"clusterResourceId","disableLocalAuth","enableDataExport","enableLogAccessUsingOnlyResourcePermissions","immediatePurgeDataOn30Days"})
    private WorkspaceFeaturesResponse(
        @Nullable String clusterResourceId,
        @Nullable Boolean disableLocalAuth,
        @Nullable Boolean enableDataExport,
        @Nullable Boolean enableLogAccessUsingOnlyResourcePermissions,
        @Nullable Boolean immediatePurgeDataOn30Days) {
        this.clusterResourceId = clusterResourceId;
        this.disableLocalAuth = disableLocalAuth;
        this.enableDataExport = enableDataExport;
        this.enableLogAccessUsingOnlyResourcePermissions = enableLogAccessUsingOnlyResourcePermissions;
        this.immediatePurgeDataOn30Days = immediatePurgeDataOn30Days;
    }

    /**
     * Dedicated LA cluster resourceId that is linked to the workspaces.
     * 
     */
    public Optional<String> getClusterResourceId() {
        return Optional.ofNullable(this.clusterResourceId);
    }
    /**
     * Disable Non-AAD based Auth.
     * 
     */
    public Optional<Boolean> getDisableLocalAuth() {
        return Optional.ofNullable(this.disableLocalAuth);
    }
    /**
     * Flag that indicate if data should be exported.
     * 
     */
    public Optional<Boolean> getEnableDataExport() {
        return Optional.ofNullable(this.enableDataExport);
    }
    /**
     * Flag that indicate which permission to use - resource or workspace or both.
     * 
     */
    public Optional<Boolean> getEnableLogAccessUsingOnlyResourcePermissions() {
        return Optional.ofNullable(this.enableLogAccessUsingOnlyResourcePermissions);
    }
    /**
     * Flag that describes if we want to remove the data after 30 days.
     * 
     */
    public Optional<Boolean> getImmediatePurgeDataOn30Days() {
        return Optional.ofNullable(this.immediatePurgeDataOn30Days);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceFeaturesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clusterResourceId;
        private @Nullable Boolean disableLocalAuth;
        private @Nullable Boolean enableDataExport;
        private @Nullable Boolean enableLogAccessUsingOnlyResourcePermissions;
        private @Nullable Boolean immediatePurgeDataOn30Days;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceFeaturesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterResourceId = defaults.clusterResourceId;
    	      this.disableLocalAuth = defaults.disableLocalAuth;
    	      this.enableDataExport = defaults.enableDataExport;
    	      this.enableLogAccessUsingOnlyResourcePermissions = defaults.enableLogAccessUsingOnlyResourcePermissions;
    	      this.immediatePurgeDataOn30Days = defaults.immediatePurgeDataOn30Days;
        }

        public Builder setClusterResourceId(@Nullable String clusterResourceId) {
            this.clusterResourceId = clusterResourceId;
            return this;
        }

        public Builder setDisableLocalAuth(@Nullable Boolean disableLocalAuth) {
            this.disableLocalAuth = disableLocalAuth;
            return this;
        }

        public Builder setEnableDataExport(@Nullable Boolean enableDataExport) {
            this.enableDataExport = enableDataExport;
            return this;
        }

        public Builder setEnableLogAccessUsingOnlyResourcePermissions(@Nullable Boolean enableLogAccessUsingOnlyResourcePermissions) {
            this.enableLogAccessUsingOnlyResourcePermissions = enableLogAccessUsingOnlyResourcePermissions;
            return this;
        }

        public Builder setImmediatePurgeDataOn30Days(@Nullable Boolean immediatePurgeDataOn30Days) {
            this.immediatePurgeDataOn30Days = immediatePurgeDataOn30Days;
            return this;
        }

        public WorkspaceFeaturesResponse build() {
            return new WorkspaceFeaturesResponse(clusterResourceId, disableLocalAuth, enableDataExport, enableLogAccessUsingOnlyResourcePermissions, immediatePurgeDataOn30Days);
        }
    }
}
