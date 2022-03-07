// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseBlobAuditingPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDatabaseBlobAuditingPolicyArgs Empty = new GetDatabaseBlobAuditingPolicyArgs();

    /**
     * The name of the blob auditing policy.
     * 
     */
    @InputImport(name="blobAuditingPolicyName", required=true)
      private final String blobAuditingPolicyName;

    public String getBlobAuditingPolicyName() {
        return this.blobAuditingPolicyName;
    }

    /**
     * The name of the database.
     * 
     */
    @InputImport(name="databaseName", required=true)
      private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @InputImport(name="serverName", required=true)
      private final String serverName;

    public String getServerName() {
        return this.serverName;
    }

    public GetDatabaseBlobAuditingPolicyArgs(
        String blobAuditingPolicyName,
        String databaseName,
        String resourceGroupName,
        String serverName) {
        this.blobAuditingPolicyName = Objects.requireNonNull(blobAuditingPolicyName, "expected parameter 'blobAuditingPolicyName' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private GetDatabaseBlobAuditingPolicyArgs() {
        this.blobAuditingPolicyName = null;
        this.databaseName = null;
        this.resourceGroupName = null;
        this.serverName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseBlobAuditingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String blobAuditingPolicyName;
        private String databaseName;
        private String resourceGroupName;
        private String serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseBlobAuditingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobAuditingPolicyName = defaults.blobAuditingPolicyName;
    	      this.databaseName = defaults.databaseName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
        }

        public Builder setBlobAuditingPolicyName(String blobAuditingPolicyName) {
            this.blobAuditingPolicyName = Objects.requireNonNull(blobAuditingPolicyName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public GetDatabaseBlobAuditingPolicyArgs build() {
            return new GetDatabaseBlobAuditingPolicyArgs(blobAuditingPolicyName, databaseName, resourceGroupName, serverName);
        }
    }
}