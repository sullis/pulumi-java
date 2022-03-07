// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFlowLogArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFlowLogArgs Empty = new GetFlowLogArgs();

    /**
     * The name of the flow log resource.
     * 
     */
    @InputImport(name="flowLogName", required=true)
      private final String flowLogName;

    public String getFlowLogName() {
        return this.flowLogName;
    }

    /**
     * The name of the network watcher.
     * 
     */
    @InputImport(name="networkWatcherName", required=true)
      private final String networkWatcherName;

    public String getNetworkWatcherName() {
        return this.networkWatcherName;
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

    public GetFlowLogArgs(
        String flowLogName,
        String networkWatcherName,
        String resourceGroupName) {
        this.flowLogName = Objects.requireNonNull(flowLogName, "expected parameter 'flowLogName' to be non-null");
        this.networkWatcherName = Objects.requireNonNull(networkWatcherName, "expected parameter 'networkWatcherName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetFlowLogArgs() {
        this.flowLogName = null;
        this.networkWatcherName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlowLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String flowLogName;
        private String networkWatcherName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFlowLogArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flowLogName = defaults.flowLogName;
    	      this.networkWatcherName = defaults.networkWatcherName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setFlowLogName(String flowLogName) {
            this.flowLogName = Objects.requireNonNull(flowLogName);
            return this;
        }

        public Builder setNetworkWatcherName(String networkWatcherName) {
            this.networkWatcherName = Objects.requireNonNull(networkWatcherName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetFlowLogArgs build() {
            return new GetFlowLogArgs(flowLogName, networkWatcherName, resourceGroupName);
        }
    }
}