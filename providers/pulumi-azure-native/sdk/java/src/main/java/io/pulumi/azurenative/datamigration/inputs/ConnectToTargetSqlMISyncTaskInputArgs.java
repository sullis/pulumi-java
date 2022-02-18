// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.AzureActiveDirectoryAppArgs;
import io.pulumi.azurenative.datamigration.inputs.MiSqlConnectionInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


/**
 * Input for the task that validates connection to Azure SQL Database Managed Instance online scenario.
 * 
 */
public final class ConnectToTargetSqlMISyncTaskInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectToTargetSqlMISyncTaskInputArgs Empty = new ConnectToTargetSqlMISyncTaskInputArgs();

    /**
     * Azure Active Directory Application the DMS instance will use to connect to the target instance of Azure SQL Database Managed Instance and the Azure Storage Account
     * 
     */
    @InputImport(name="azureApp", required=true)
    private final Input<AzureActiveDirectoryAppArgs> azureApp;

    public Input<AzureActiveDirectoryAppArgs> getAzureApp() {
        return this.azureApp;
    }

    /**
     * Connection information for Azure SQL Database Managed Instance
     * 
     */
    @InputImport(name="targetConnectionInfo", required=true)
    private final Input<MiSqlConnectionInfoArgs> targetConnectionInfo;

    public Input<MiSqlConnectionInfoArgs> getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public ConnectToTargetSqlMISyncTaskInputArgs(
        Input<AzureActiveDirectoryAppArgs> azureApp,
        Input<MiSqlConnectionInfoArgs> targetConnectionInfo) {
        this.azureApp = Objects.requireNonNull(azureApp, "expected parameter 'azureApp' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private ConnectToTargetSqlMISyncTaskInputArgs() {
        this.azureApp = Input.empty();
        this.targetConnectionInfo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetSqlMISyncTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AzureActiveDirectoryAppArgs> azureApp;
        private Input<MiSqlConnectionInfoArgs> targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlMISyncTaskInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureApp = defaults.azureApp;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setAzureApp(Input<AzureActiveDirectoryAppArgs> azureApp) {
            this.azureApp = Objects.requireNonNull(azureApp);
            return this;
        }

        public Builder setAzureApp(AzureActiveDirectoryAppArgs azureApp) {
            this.azureApp = Input.of(Objects.requireNonNull(azureApp));
            return this;
        }

        public Builder setTargetConnectionInfo(Input<MiSqlConnectionInfoArgs> targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }

        public Builder setTargetConnectionInfo(MiSqlConnectionInfoArgs targetConnectionInfo) {
            this.targetConnectionInfo = Input.of(Objects.requireNonNull(targetConnectionInfo));
            return this;
        }

        public ConnectToTargetSqlMISyncTaskInputArgs build() {
            return new ConnectToTargetSqlMISyncTaskInputArgs(azureApp, targetConnectionInfo);
        }
    }
}
