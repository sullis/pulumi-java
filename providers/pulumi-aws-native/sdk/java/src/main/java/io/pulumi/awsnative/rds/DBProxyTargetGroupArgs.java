// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds;

import io.pulumi.awsnative.rds.enums.DBProxyTargetGroupTargetGroupName;
import io.pulumi.awsnative.rds.inputs.DBProxyTargetGroupConnectionPoolConfigurationInfoFormatArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DBProxyTargetGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final DBProxyTargetGroupArgs Empty = new DBProxyTargetGroupArgs();

    @InputImport(name="connectionPoolConfigurationInfo")
    private final @Nullable Input<DBProxyTargetGroupConnectionPoolConfigurationInfoFormatArgs> connectionPoolConfigurationInfo;

    public Input<DBProxyTargetGroupConnectionPoolConfigurationInfoFormatArgs> getConnectionPoolConfigurationInfo() {
        return this.connectionPoolConfigurationInfo == null ? Input.empty() : this.connectionPoolConfigurationInfo;
    }

    @InputImport(name="dBClusterIdentifiers")
    private final @Nullable Input<List<String>> dBClusterIdentifiers;

    public Input<List<String>> getDBClusterIdentifiers() {
        return this.dBClusterIdentifiers == null ? Input.empty() : this.dBClusterIdentifiers;
    }

    @InputImport(name="dBInstanceIdentifiers")
    private final @Nullable Input<List<String>> dBInstanceIdentifiers;

    public Input<List<String>> getDBInstanceIdentifiers() {
        return this.dBInstanceIdentifiers == null ? Input.empty() : this.dBInstanceIdentifiers;
    }

    /**
     * The identifier for the proxy.
     * 
     */
    @InputImport(name="dBProxyName", required=true)
    private final Input<String> dBProxyName;

    public Input<String> getDBProxyName() {
        return this.dBProxyName;
    }

    /**
     * The identifier for the DBProxyTargetGroup
     * 
     */
    @InputImport(name="targetGroupName", required=true)
    private final Input<DBProxyTargetGroupTargetGroupName> targetGroupName;

    public Input<DBProxyTargetGroupTargetGroupName> getTargetGroupName() {
        return this.targetGroupName;
    }

    public DBProxyTargetGroupArgs(
        @Nullable Input<DBProxyTargetGroupConnectionPoolConfigurationInfoFormatArgs> connectionPoolConfigurationInfo,
        @Nullable Input<List<String>> dBClusterIdentifiers,
        @Nullable Input<List<String>> dBInstanceIdentifiers,
        Input<String> dBProxyName,
        Input<DBProxyTargetGroupTargetGroupName> targetGroupName) {
        this.connectionPoolConfigurationInfo = connectionPoolConfigurationInfo;
        this.dBClusterIdentifiers = dBClusterIdentifiers;
        this.dBInstanceIdentifiers = dBInstanceIdentifiers;
        this.dBProxyName = Objects.requireNonNull(dBProxyName, "expected parameter 'dBProxyName' to be non-null");
        this.targetGroupName = Objects.requireNonNull(targetGroupName, "expected parameter 'targetGroupName' to be non-null");
    }

    private DBProxyTargetGroupArgs() {
        this.connectionPoolConfigurationInfo = Input.empty();
        this.dBClusterIdentifiers = Input.empty();
        this.dBInstanceIdentifiers = Input.empty();
        this.dBProxyName = Input.empty();
        this.targetGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DBProxyTargetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DBProxyTargetGroupConnectionPoolConfigurationInfoFormatArgs> connectionPoolConfigurationInfo;
        private @Nullable Input<List<String>> dBClusterIdentifiers;
        private @Nullable Input<List<String>> dBInstanceIdentifiers;
        private Input<String> dBProxyName;
        private Input<DBProxyTargetGroupTargetGroupName> targetGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(DBProxyTargetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPoolConfigurationInfo = defaults.connectionPoolConfigurationInfo;
    	      this.dBClusterIdentifiers = defaults.dBClusterIdentifiers;
    	      this.dBInstanceIdentifiers = defaults.dBInstanceIdentifiers;
    	      this.dBProxyName = defaults.dBProxyName;
    	      this.targetGroupName = defaults.targetGroupName;
        }

        public Builder setConnectionPoolConfigurationInfo(@Nullable Input<DBProxyTargetGroupConnectionPoolConfigurationInfoFormatArgs> connectionPoolConfigurationInfo) {
            this.connectionPoolConfigurationInfo = connectionPoolConfigurationInfo;
            return this;
        }

        public Builder setConnectionPoolConfigurationInfo(@Nullable DBProxyTargetGroupConnectionPoolConfigurationInfoFormatArgs connectionPoolConfigurationInfo) {
            this.connectionPoolConfigurationInfo = Input.ofNullable(connectionPoolConfigurationInfo);
            return this;
        }

        public Builder setDBClusterIdentifiers(@Nullable Input<List<String>> dBClusterIdentifiers) {
            this.dBClusterIdentifiers = dBClusterIdentifiers;
            return this;
        }

        public Builder setDBClusterIdentifiers(@Nullable List<String> dBClusterIdentifiers) {
            this.dBClusterIdentifiers = Input.ofNullable(dBClusterIdentifiers);
            return this;
        }

        public Builder setDBInstanceIdentifiers(@Nullable Input<List<String>> dBInstanceIdentifiers) {
            this.dBInstanceIdentifiers = dBInstanceIdentifiers;
            return this;
        }

        public Builder setDBInstanceIdentifiers(@Nullable List<String> dBInstanceIdentifiers) {
            this.dBInstanceIdentifiers = Input.ofNullable(dBInstanceIdentifiers);
            return this;
        }

        public Builder setDBProxyName(Input<String> dBProxyName) {
            this.dBProxyName = Objects.requireNonNull(dBProxyName);
            return this;
        }

        public Builder setDBProxyName(String dBProxyName) {
            this.dBProxyName = Input.of(Objects.requireNonNull(dBProxyName));
            return this;
        }

        public Builder setTargetGroupName(Input<DBProxyTargetGroupTargetGroupName> targetGroupName) {
            this.targetGroupName = Objects.requireNonNull(targetGroupName);
            return this;
        }

        public Builder setTargetGroupName(DBProxyTargetGroupTargetGroupName targetGroupName) {
            this.targetGroupName = Input.of(Objects.requireNonNull(targetGroupName));
            return this;
        }

        public DBProxyTargetGroupArgs build() {
            return new DBProxyTargetGroupArgs(connectionPoolConfigurationInfo, dBClusterIdentifiers, dBInstanceIdentifiers, dBProxyName, targetGroupName);
        }
    }
}
