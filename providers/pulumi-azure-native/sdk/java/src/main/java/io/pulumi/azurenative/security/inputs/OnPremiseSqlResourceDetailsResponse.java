// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the On Premise Sql resource that was assessed
 * 
 */
public final class OnPremiseSqlResourceDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final OnPremiseSqlResourceDetailsResponse Empty = new OnPremiseSqlResourceDetailsResponse();

    /**
     * The Sql database name installed on the machine
     * 
     */
    @InputImport(name="databaseName", required=true)
      private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The name of the machine
     * 
     */
    @InputImport(name="machineName", required=true)
      private final String machineName;

    public String getMachineName() {
        return this.machineName;
    }

    /**
     * The Sql server name installed on the machine
     * 
     */
    @InputImport(name="serverName", required=true)
      private final String serverName;

    public String getServerName() {
        return this.serverName;
    }

    /**
     * The platform where the assessed resource resides
     * Expected value is 'OnPremiseSql'.
     * 
     */
    @InputImport(name="source", required=true)
      private final String source;

    public String getSource() {
        return this.source;
    }

    /**
     * The oms agent Id installed on the machine
     * 
     */
    @InputImport(name="sourceComputerId", required=true)
      private final String sourceComputerId;

    public String getSourceComputerId() {
        return this.sourceComputerId;
    }

    /**
     * The unique Id of the machine
     * 
     */
    @InputImport(name="vmuuid", required=true)
      private final String vmuuid;

    public String getVmuuid() {
        return this.vmuuid;
    }

    /**
     * Azure resource Id of the workspace the machine is attached to
     * 
     */
    @InputImport(name="workspaceId", required=true)
      private final String workspaceId;

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public OnPremiseSqlResourceDetailsResponse(
        String databaseName,
        String machineName,
        String serverName,
        String source,
        String sourceComputerId,
        String vmuuid,
        String workspaceId) {
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.machineName = Objects.requireNonNull(machineName, "expected parameter 'machineName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.sourceComputerId = Objects.requireNonNull(sourceComputerId, "expected parameter 'sourceComputerId' to be non-null");
        this.vmuuid = Objects.requireNonNull(vmuuid, "expected parameter 'vmuuid' to be non-null");
        this.workspaceId = Objects.requireNonNull(workspaceId, "expected parameter 'workspaceId' to be non-null");
    }

    private OnPremiseSqlResourceDetailsResponse() {
        this.databaseName = null;
        this.machineName = null;
        this.serverName = null;
        this.source = null;
        this.sourceComputerId = null;
        this.vmuuid = null;
        this.workspaceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnPremiseSqlResourceDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseName;
        private String machineName;
        private String serverName;
        private String source;
        private String sourceComputerId;
        private String vmuuid;
        private String workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(OnPremiseSqlResourceDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.machineName = defaults.machineName;
    	      this.serverName = defaults.serverName;
    	      this.source = defaults.source;
    	      this.sourceComputerId = defaults.sourceComputerId;
    	      this.vmuuid = defaults.vmuuid;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setMachineName(String machineName) {
            this.machineName = Objects.requireNonNull(machineName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSourceComputerId(String sourceComputerId) {
            this.sourceComputerId = Objects.requireNonNull(sourceComputerId);
            return this;
        }

        public Builder setVmuuid(String vmuuid) {
            this.vmuuid = Objects.requireNonNull(vmuuid);
            return this;
        }

        public Builder setWorkspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }
        public OnPremiseSqlResourceDetailsResponse build() {
            return new OnPremiseSqlResourceDetailsResponse(databaseName, machineName, serverName, source, sourceComputerId, vmuuid, workspaceId);
        }
    }
}