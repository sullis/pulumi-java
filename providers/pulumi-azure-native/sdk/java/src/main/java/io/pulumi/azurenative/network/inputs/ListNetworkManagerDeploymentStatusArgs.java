// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ConfigurationType;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListNetworkManagerDeploymentStatusArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListNetworkManagerDeploymentStatusArgs Empty = new ListNetworkManagerDeploymentStatusArgs();

    /**
     * List of deployment types.
     * 
     */
    @InputImport(name="deploymentTypes")
    private final @Nullable List<Either<String,ConfigurationType>> deploymentTypes;

    public List<Either<String,ConfigurationType>> getDeploymentTypes() {
        return this.deploymentTypes == null ? List.of() : this.deploymentTypes;
    }

    /**
     * The name of the network manager.
     * 
     */
    @InputImport(name="networkManagerName", required=true)
    private final String networkManagerName;

    public String getNetworkManagerName() {
        return this.networkManagerName;
    }

    /**
     * List of locations.
     * 
     */
    @InputImport(name="regions")
    private final @Nullable List<String> regions;

    public List<String> getRegions() {
        return this.regions == null ? List.of() : this.regions;
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
     * Continuation token for pagination, capturing the next page size and offset, as well as the context of the query.
     * 
     */
    @InputImport(name="skipToken")
    private final @Nullable String skipToken;

    public Optional<String> getSkipToken() {
        return this.skipToken == null ? Optional.empty() : Optional.ofNullable(this.skipToken);
    }

    public ListNetworkManagerDeploymentStatusArgs(
        @Nullable List<Either<String,ConfigurationType>> deploymentTypes,
        String networkManagerName,
        @Nullable List<String> regions,
        String resourceGroupName,
        @Nullable String skipToken) {
        this.deploymentTypes = deploymentTypes;
        this.networkManagerName = Objects.requireNonNull(networkManagerName, "expected parameter 'networkManagerName' to be non-null");
        this.regions = regions;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.skipToken = skipToken;
    }

    private ListNetworkManagerDeploymentStatusArgs() {
        this.deploymentTypes = List.of();
        this.networkManagerName = null;
        this.regions = List.of();
        this.resourceGroupName = null;
        this.skipToken = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListNetworkManagerDeploymentStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Either<String,ConfigurationType>> deploymentTypes;
        private String networkManagerName;
        private @Nullable List<String> regions;
        private String resourceGroupName;
        private @Nullable String skipToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ListNetworkManagerDeploymentStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentTypes = defaults.deploymentTypes;
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.regions = defaults.regions;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.skipToken = defaults.skipToken;
        }

        public Builder setDeploymentTypes(@Nullable List<Either<String,ConfigurationType>> deploymentTypes) {
            this.deploymentTypes = deploymentTypes;
            return this;
        }

        public Builder setNetworkManagerName(String networkManagerName) {
            this.networkManagerName = Objects.requireNonNull(networkManagerName);
            return this;
        }

        public Builder setRegions(@Nullable List<String> regions) {
            this.regions = regions;
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSkipToken(@Nullable String skipToken) {
            this.skipToken = skipToken;
            return this;
        }

        public ListNetworkManagerDeploymentStatusArgs build() {
            return new ListNetworkManagerDeploymentStatusArgs(deploymentTypes, networkManagerName, regions, resourceGroupName, skipToken);
        }
    }
}
