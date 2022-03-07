// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.PostgreSqlConnectionInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse {
    /**
     * Connection information for source PostgreSQL server
     * 
     */
    private final PostgreSqlConnectionInfoResponse sourceConnectionInfo;
    /**
     * Connection information for target Azure Database for PostgreSQL server
     * 
     */
    private final PostgreSqlConnectionInfoResponse targetConnectionInfo;

    @OutputCustomType.Constructor({"sourceConnectionInfo","targetConnectionInfo"})
    private ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse(
        PostgreSqlConnectionInfoResponse sourceConnectionInfo,
        PostgreSqlConnectionInfoResponse targetConnectionInfo) {
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
    }

    /**
     * Connection information for source PostgreSQL server
     * 
    */
    public PostgreSqlConnectionInfoResponse getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }
    /**
     * Connection information for target Azure Database for PostgreSQL server
     * 
    */
    public PostgreSqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PostgreSqlConnectionInfoResponse sourceConnectionInfo;
        private PostgreSqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setSourceConnectionInfo(PostgreSqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder setTargetConnectionInfo(PostgreSqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }
        public ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse build() {
            return new ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse(sourceConnectionInfo, targetConnectionInfo);
        }
    }
}