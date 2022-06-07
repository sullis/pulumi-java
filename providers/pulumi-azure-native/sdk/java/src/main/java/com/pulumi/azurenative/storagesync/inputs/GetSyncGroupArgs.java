// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagesync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSyncGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSyncGroupArgs Empty = new GetSyncGroupArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Storage Sync Service resource.
     * 
     */
    @Import(name="storageSyncServiceName", required=true)
    private Output<String> storageSyncServiceName;

    /**
     * @return Name of Storage Sync Service resource.
     * 
     */
    public Output<String> storageSyncServiceName() {
        return this.storageSyncServiceName;
    }

    /**
     * Name of Sync Group resource.
     * 
     */
    @Import(name="syncGroupName", required=true)
    private Output<String> syncGroupName;

    /**
     * @return Name of Sync Group resource.
     * 
     */
    public Output<String> syncGroupName() {
        return this.syncGroupName;
    }

    private GetSyncGroupArgs() {}

    private GetSyncGroupArgs(GetSyncGroupArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.storageSyncServiceName = $.storageSyncServiceName;
        this.syncGroupName = $.syncGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSyncGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSyncGroupArgs $;

        public Builder() {
            $ = new GetSyncGroupArgs();
        }

        public Builder(GetSyncGroupArgs defaults) {
            $ = new GetSyncGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param storageSyncServiceName Name of Storage Sync Service resource.
         * 
         * @return builder
         * 
         */
        public Builder storageSyncServiceName(Output<String> storageSyncServiceName) {
            $.storageSyncServiceName = storageSyncServiceName;
            return this;
        }

        /**
         * @param storageSyncServiceName Name of Storage Sync Service resource.
         * 
         * @return builder
         * 
         */
        public Builder storageSyncServiceName(String storageSyncServiceName) {
            return storageSyncServiceName(Output.of(storageSyncServiceName));
        }

        /**
         * @param syncGroupName Name of Sync Group resource.
         * 
         * @return builder
         * 
         */
        public Builder syncGroupName(Output<String> syncGroupName) {
            $.syncGroupName = syncGroupName;
            return this;
        }

        /**
         * @param syncGroupName Name of Sync Group resource.
         * 
         * @return builder
         * 
         */
        public Builder syncGroupName(String syncGroupName) {
            return syncGroupName(Output.of(syncGroupName));
        }

        public GetSyncGroupArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.storageSyncServiceName = Objects.requireNonNull($.storageSyncServiceName, "expected parameter 'storageSyncServiceName' to be non-null");
            $.syncGroupName = Objects.requireNonNull($.syncGroupName, "expected parameter 'syncGroupName' to be non-null");
            return $;
        }
    }

}
