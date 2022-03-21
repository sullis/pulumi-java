// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.PostgreSqlConnectionInfoResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Input for the task that validates connection to PostgreSQL and source server requirements
 * 
 */
public final class ConnectToSourcePostgreSqlSyncTaskInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectToSourcePostgreSqlSyncTaskInputResponse Empty = new ConnectToSourcePostgreSqlSyncTaskInputResponse();

    /**
     * Connection information for source PostgreSQL server
     * 
     */
    @Import(name="sourceConnectionInfo", required=true)
      private final PostgreSqlConnectionInfoResponse sourceConnectionInfo;

    public PostgreSqlConnectionInfoResponse getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    public ConnectToSourcePostgreSqlSyncTaskInputResponse(PostgreSqlConnectionInfoResponse sourceConnectionInfo) {
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
    }

    private ConnectToSourcePostgreSqlSyncTaskInputResponse() {
        this.sourceConnectionInfo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToSourcePostgreSqlSyncTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PostgreSqlConnectionInfoResponse sourceConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToSourcePostgreSqlSyncTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
        }

        public Builder sourceConnectionInfo(PostgreSqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }        public ConnectToSourcePostgreSqlSyncTaskInputResponse build() {
            return new ConnectToSourcePostgreSqlSyncTaskInputResponse(sourceConnectionInfo);
        }
    }
}
