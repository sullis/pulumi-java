// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkWatcherArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkWatcherArgs Empty = new GetNetworkWatcherArgs();

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

    public GetNetworkWatcherArgs(
        String networkWatcherName,
        String resourceGroupName) {
        this.networkWatcherName = Objects.requireNonNull(networkWatcherName, "expected parameter 'networkWatcherName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetNetworkWatcherArgs() {
        this.networkWatcherName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkWatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkWatcherName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkWatcherArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkWatcherName = defaults.networkWatcherName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setNetworkWatcherName(String networkWatcherName) {
            this.networkWatcherName = Objects.requireNonNull(networkWatcherName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetNetworkWatcherArgs build() {
            return new GetNetworkWatcherArgs(networkWatcherName, resourceGroupName);
        }
    }
}
