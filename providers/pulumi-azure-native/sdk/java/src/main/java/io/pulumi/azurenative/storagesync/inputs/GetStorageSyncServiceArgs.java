// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetStorageSyncServiceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStorageSyncServiceArgs Empty = new GetStorageSyncServiceArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Storage Sync Service resource.
     * 
     */
    @InputImport(name="storageSyncServiceName", required=true)
    private final String storageSyncServiceName;

    public String getStorageSyncServiceName() {
        return this.storageSyncServiceName;
    }

    public GetStorageSyncServiceArgs(
        String resourceGroupName,
        String storageSyncServiceName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageSyncServiceName = Objects.requireNonNull(storageSyncServiceName, "expected parameter 'storageSyncServiceName' to be non-null");
    }

    private GetStorageSyncServiceArgs() {
        this.resourceGroupName = null;
        this.storageSyncServiceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStorageSyncServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String storageSyncServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStorageSyncServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageSyncServiceName = defaults.storageSyncServiceName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setStorageSyncServiceName(String storageSyncServiceName) {
            this.storageSyncServiceName = Objects.requireNonNull(storageSyncServiceName);
            return this;
        }

        public GetStorageSyncServiceArgs build() {
            return new GetStorageSyncServiceArgs(resourceGroupName, storageSyncServiceName);
        }
    }
}
