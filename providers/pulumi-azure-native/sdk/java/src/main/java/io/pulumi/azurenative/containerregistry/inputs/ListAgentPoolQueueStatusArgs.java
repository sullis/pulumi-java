// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListAgentPoolQueueStatusArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListAgentPoolQueueStatusArgs Empty = new ListAgentPoolQueueStatusArgs();

    /**
     * The name of the agent pool.
     * 
     */
    @InputImport(name="agentPoolName", required=true)
      private final String agentPoolName;

    public String getAgentPoolName() {
        return this.agentPoolName;
    }

    /**
     * The name of the container registry.
     * 
     */
    @InputImport(name="registryName", required=true)
      private final String registryName;

    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListAgentPoolQueueStatusArgs(
        String agentPoolName,
        String registryName,
        String resourceGroupName) {
        this.agentPoolName = Objects.requireNonNull(agentPoolName, "expected parameter 'agentPoolName' to be non-null");
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListAgentPoolQueueStatusArgs() {
        this.agentPoolName = null;
        this.registryName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListAgentPoolQueueStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentPoolName;
        private String registryName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListAgentPoolQueueStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.registryName = defaults.registryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAgentPoolName(String agentPoolName) {
            this.agentPoolName = Objects.requireNonNull(agentPoolName);
            return this;
        }

        public Builder setRegistryName(String registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public ListAgentPoolQueueStatusArgs build() {
            return new ListAgentPoolQueueStatusArgs(agentPoolName, registryName, resourceGroupName);
        }
    }
}