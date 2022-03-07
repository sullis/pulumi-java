// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.azurenative.sqlvirtualmachine.enums.ConnectivityType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Set the access level and network port settings for SQL Server.
 * 
 */
public final class SqlConnectivityUpdateSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlConnectivityUpdateSettingsArgs Empty = new SqlConnectivityUpdateSettingsArgs();

    /**
     * SQL Server connectivity option.
     * 
     */
    @InputImport(name="connectivityType")
      private final @Nullable Input<Either<String,ConnectivityType>> connectivityType;

    public Input<Either<String,ConnectivityType>> getConnectivityType() {
        return this.connectivityType == null ? Input.empty() : this.connectivityType;
    }

    /**
     * SQL Server port.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * SQL Server sysadmin login password.
     * 
     */
    @InputImport(name="sqlAuthUpdatePassword")
      private final @Nullable Input<String> sqlAuthUpdatePassword;

    public Input<String> getSqlAuthUpdatePassword() {
        return this.sqlAuthUpdatePassword == null ? Input.empty() : this.sqlAuthUpdatePassword;
    }

    /**
     * SQL Server sysadmin login to create.
     * 
     */
    @InputImport(name="sqlAuthUpdateUserName")
      private final @Nullable Input<String> sqlAuthUpdateUserName;

    public Input<String> getSqlAuthUpdateUserName() {
        return this.sqlAuthUpdateUserName == null ? Input.empty() : this.sqlAuthUpdateUserName;
    }

    public SqlConnectivityUpdateSettingsArgs(
        @Nullable Input<Either<String,ConnectivityType>> connectivityType,
        @Nullable Input<Integer> port,
        @Nullable Input<String> sqlAuthUpdatePassword,
        @Nullable Input<String> sqlAuthUpdateUserName) {
        this.connectivityType = connectivityType;
        this.port = port;
        this.sqlAuthUpdatePassword = sqlAuthUpdatePassword;
        this.sqlAuthUpdateUserName = sqlAuthUpdateUserName;
    }

    private SqlConnectivityUpdateSettingsArgs() {
        this.connectivityType = Input.empty();
        this.port = Input.empty();
        this.sqlAuthUpdatePassword = Input.empty();
        this.sqlAuthUpdateUserName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlConnectivityUpdateSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ConnectivityType>> connectivityType;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> sqlAuthUpdatePassword;
        private @Nullable Input<String> sqlAuthUpdateUserName;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlConnectivityUpdateSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectivityType = defaults.connectivityType;
    	      this.port = defaults.port;
    	      this.sqlAuthUpdatePassword = defaults.sqlAuthUpdatePassword;
    	      this.sqlAuthUpdateUserName = defaults.sqlAuthUpdateUserName;
        }

        public Builder setConnectivityType(@Nullable Input<Either<String,ConnectivityType>> connectivityType) {
            this.connectivityType = connectivityType;
            return this;
        }

        public Builder setConnectivityType(@Nullable Either<String,ConnectivityType> connectivityType) {
            this.connectivityType = Input.ofNullable(connectivityType);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setSqlAuthUpdatePassword(@Nullable Input<String> sqlAuthUpdatePassword) {
            this.sqlAuthUpdatePassword = sqlAuthUpdatePassword;
            return this;
        }

        public Builder setSqlAuthUpdatePassword(@Nullable String sqlAuthUpdatePassword) {
            this.sqlAuthUpdatePassword = Input.ofNullable(sqlAuthUpdatePassword);
            return this;
        }

        public Builder setSqlAuthUpdateUserName(@Nullable Input<String> sqlAuthUpdateUserName) {
            this.sqlAuthUpdateUserName = sqlAuthUpdateUserName;
            return this;
        }

        public Builder setSqlAuthUpdateUserName(@Nullable String sqlAuthUpdateUserName) {
            this.sqlAuthUpdateUserName = Input.ofNullable(sqlAuthUpdateUserName);
            return this;
        }
        public SqlConnectivityUpdateSettingsArgs build() {
            return new SqlConnectivityUpdateSettingsArgs(connectivityType, port, sqlAuthUpdatePassword, sqlAuthUpdateUserName);
        }
    }
}