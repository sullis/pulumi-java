// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListListUpgradableVersionPostArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListListUpgradableVersionPostArgs Empty = new ListListUpgradableVersionPostArgs();

    /**
     * The name of the cluster resource.
     * 
     */
    @InputImport(name="clusterName", required=true)
    private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The target code version.
     * 
     */
    @InputImport(name="targetVersion", required=true)
    private final String targetVersion;

    public String getTargetVersion() {
        return this.targetVersion;
    }

    public ListListUpgradableVersionPostArgs(
        String clusterName,
        String resourceGroupName,
        String targetVersion) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.targetVersion = Objects.requireNonNull(targetVersion, "expected parameter 'targetVersion' to be non-null");
    }

    private ListListUpgradableVersionPostArgs() {
        this.clusterName = null;
        this.resourceGroupName = null;
        this.targetVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListListUpgradableVersionPostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String resourceGroupName;
        private String targetVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ListListUpgradableVersionPostArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.targetVersion = defaults.targetVersion;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setTargetVersion(String targetVersion) {
            this.targetVersion = Objects.requireNonNull(targetVersion);
            return this;
        }

        public ListListUpgradableVersionPostArgs build() {
            return new ListListUpgradableVersionPostArgs(clusterName, resourceGroupName, targetVersion);
        }
    }
}
