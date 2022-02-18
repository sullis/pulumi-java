// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SyncAgentArgs extends io.pulumi.resources.ResourceArgs {

    public static final SyncAgentArgs Empty = new SyncAgentArgs();

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server on which the sync agent is hosted.
     * 
     */
    @InputImport(name="serverName", required=true)
    private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    /**
     * The name of the sync agent.
     * 
     */
    @InputImport(name="syncAgentName")
    private final @Nullable Input<String> syncAgentName;

    public Input<String> getSyncAgentName() {
        return this.syncAgentName == null ? Input.empty() : this.syncAgentName;
    }

    /**
     * ARM resource id of the sync database in the sync agent.
     * 
     */
    @InputImport(name="syncDatabaseId")
    private final @Nullable Input<String> syncDatabaseId;

    public Input<String> getSyncDatabaseId() {
        return this.syncDatabaseId == null ? Input.empty() : this.syncDatabaseId;
    }

    public SyncAgentArgs(
        Input<String> resourceGroupName,
        Input<String> serverName,
        @Nullable Input<String> syncAgentName,
        @Nullable Input<String> syncDatabaseId) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.syncAgentName = syncAgentName;
        this.syncDatabaseId = syncDatabaseId;
    }

    private SyncAgentArgs() {
        this.resourceGroupName = Input.empty();
        this.serverName = Input.empty();
        this.syncAgentName = Input.empty();
        this.syncDatabaseId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyncAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> resourceGroupName;
        private Input<String> serverName;
        private @Nullable Input<String> syncAgentName;
        private @Nullable Input<String> syncDatabaseId;

        public Builder() {
    	      // Empty
        }

        public Builder(SyncAgentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.syncAgentName = defaults.syncAgentName;
    	      this.syncDatabaseId = defaults.syncDatabaseId;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServerName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }

        public Builder setSyncAgentName(@Nullable Input<String> syncAgentName) {
            this.syncAgentName = syncAgentName;
            return this;
        }

        public Builder setSyncAgentName(@Nullable String syncAgentName) {
            this.syncAgentName = Input.ofNullable(syncAgentName);
            return this;
        }

        public Builder setSyncDatabaseId(@Nullable Input<String> syncDatabaseId) {
            this.syncDatabaseId = syncDatabaseId;
            return this;
        }

        public Builder setSyncDatabaseId(@Nullable String syncDatabaseId) {
            this.syncDatabaseId = Input.ofNullable(syncDatabaseId);
            return this;
        }

        public SyncAgentArgs build() {
            return new SyncAgentArgs(resourceGroupName, serverName, syncAgentName, syncDatabaseId);
        }
    }
}
