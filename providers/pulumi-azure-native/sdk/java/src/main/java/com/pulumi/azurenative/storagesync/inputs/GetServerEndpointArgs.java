// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagesync.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServerEndpointArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerEndpointArgs Empty = new GetServerEndpointArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Server Endpoint object.
     * 
     */
    @Import(name="serverEndpointName", required=true)
    private String serverEndpointName;

    /**
     * @return Name of Server Endpoint object.
     * 
     */
    public String serverEndpointName() {
        return this.serverEndpointName;
    }

    /**
     * Name of Storage Sync Service resource.
     * 
     */
    @Import(name="storageSyncServiceName", required=true)
    private String storageSyncServiceName;

    /**
     * @return Name of Storage Sync Service resource.
     * 
     */
    public String storageSyncServiceName() {
        return this.storageSyncServiceName;
    }

    /**
     * Name of Sync Group resource.
     * 
     */
    @Import(name="syncGroupName", required=true)
    private String syncGroupName;

    /**
     * @return Name of Sync Group resource.
     * 
     */
    public String syncGroupName() {
        return this.syncGroupName;
    }

    private GetServerEndpointArgs() {}

    private GetServerEndpointArgs(GetServerEndpointArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.serverEndpointName = $.serverEndpointName;
        this.storageSyncServiceName = $.storageSyncServiceName;
        this.syncGroupName = $.syncGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerEndpointArgs $;

        public Builder() {
            $ = new GetServerEndpointArgs();
        }

        public Builder(GetServerEndpointArgs defaults) {
            $ = new GetServerEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serverEndpointName Name of Server Endpoint object.
         * 
         * @return builder
         * 
         */
        public Builder serverEndpointName(String serverEndpointName) {
            $.serverEndpointName = serverEndpointName;
            return this;
        }

        /**
         * @param storageSyncServiceName Name of Storage Sync Service resource.
         * 
         * @return builder
         * 
         */
        public Builder storageSyncServiceName(String storageSyncServiceName) {
            $.storageSyncServiceName = storageSyncServiceName;
            return this;
        }

        /**
         * @param syncGroupName Name of Sync Group resource.
         * 
         * @return builder
         * 
         */
        public Builder syncGroupName(String syncGroupName) {
            $.syncGroupName = syncGroupName;
            return this;
        }

        public GetServerEndpointArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverEndpointName = Objects.requireNonNull($.serverEndpointName, "expected parameter 'serverEndpointName' to be non-null");
            $.storageSyncServiceName = Objects.requireNonNull($.storageSyncServiceName, "expected parameter 'storageSyncServiceName' to be non-null");
            $.syncGroupName = Objects.requireNonNull($.syncGroupName, "expected parameter 'syncGroupName' to be non-null");
            return $;
        }
    }

}
