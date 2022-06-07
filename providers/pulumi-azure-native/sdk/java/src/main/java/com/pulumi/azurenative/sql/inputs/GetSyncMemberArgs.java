// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSyncMemberArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSyncMemberArgs Empty = new GetSyncMemberArgs();

    /**
     * The name of the database on which the sync group is hosted.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The name of the database on which the sync group is hosted.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the server.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * The name of the sync group on which the sync member is hosted.
     * 
     */
    @Import(name="syncGroupName", required=true)
    private Output<String> syncGroupName;

    /**
     * @return The name of the sync group on which the sync member is hosted.
     * 
     */
    public Output<String> syncGroupName() {
        return this.syncGroupName;
    }

    /**
     * The name of the sync member.
     * 
     */
    @Import(name="syncMemberName", required=true)
    private Output<String> syncMemberName;

    /**
     * @return The name of the sync member.
     * 
     */
    public Output<String> syncMemberName() {
        return this.syncMemberName;
    }

    private GetSyncMemberArgs() {}

    private GetSyncMemberArgs(GetSyncMemberArgs $) {
        this.databaseName = $.databaseName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.syncGroupName = $.syncGroupName;
        this.syncMemberName = $.syncMemberName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSyncMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSyncMemberArgs $;

        public Builder() {
            $ = new GetSyncMemberArgs();
        }

        public Builder(GetSyncMemberArgs defaults) {
            $ = new GetSyncMemberArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName The name of the database on which the sync group is hosted.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the database on which the sync group is hosted.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param syncGroupName The name of the sync group on which the sync member is hosted.
         * 
         * @return builder
         * 
         */
        public Builder syncGroupName(Output<String> syncGroupName) {
            $.syncGroupName = syncGroupName;
            return this;
        }

        /**
         * @param syncGroupName The name of the sync group on which the sync member is hosted.
         * 
         * @return builder
         * 
         */
        public Builder syncGroupName(String syncGroupName) {
            return syncGroupName(Output.of(syncGroupName));
        }

        /**
         * @param syncMemberName The name of the sync member.
         * 
         * @return builder
         * 
         */
        public Builder syncMemberName(Output<String> syncMemberName) {
            $.syncMemberName = syncMemberName;
            return this;
        }

        /**
         * @param syncMemberName The name of the sync member.
         * 
         * @return builder
         * 
         */
        public Builder syncMemberName(String syncMemberName) {
            return syncMemberName(Output.of(syncMemberName));
        }

        public GetSyncMemberArgs build() {
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            $.syncGroupName = Objects.requireNonNull($.syncGroupName, "expected parameter 'syncGroupName' to be non-null");
            $.syncMemberName = Objects.requireNonNull($.syncMemberName, "expected parameter 'syncMemberName' to be non-null");
            return $;
        }
    }

}
