// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.inputs;

import com.pulumi.azurenative.sqlvirtualmachine.enums.ConnectivityType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Set the access level and network port settings for SQL Server.
 * 
 */
public final class SqlConnectivityUpdateSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlConnectivityUpdateSettingsArgs Empty = new SqlConnectivityUpdateSettingsArgs();

    /**
     * SQL Server connectivity option.
     * 
     */
    @Import(name="connectivityType")
    private @Nullable Output<Either<String,ConnectivityType>> connectivityType;

    /**
     * @return SQL Server connectivity option.
     * 
     */
    public Optional<Output<Either<String,ConnectivityType>>> connectivityType() {
        return Optional.ofNullable(this.connectivityType);
    }

    /**
     * SQL Server port.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return SQL Server port.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * SQL Server sysadmin login password.
     * 
     */
    @Import(name="sqlAuthUpdatePassword")
    private @Nullable Output<String> sqlAuthUpdatePassword;

    /**
     * @return SQL Server sysadmin login password.
     * 
     */
    public Optional<Output<String>> sqlAuthUpdatePassword() {
        return Optional.ofNullable(this.sqlAuthUpdatePassword);
    }

    /**
     * SQL Server sysadmin login to create.
     * 
     */
    @Import(name="sqlAuthUpdateUserName")
    private @Nullable Output<String> sqlAuthUpdateUserName;

    /**
     * @return SQL Server sysadmin login to create.
     * 
     */
    public Optional<Output<String>> sqlAuthUpdateUserName() {
        return Optional.ofNullable(this.sqlAuthUpdateUserName);
    }

    private SqlConnectivityUpdateSettingsArgs() {}

    private SqlConnectivityUpdateSettingsArgs(SqlConnectivityUpdateSettingsArgs $) {
        this.connectivityType = $.connectivityType;
        this.port = $.port;
        this.sqlAuthUpdatePassword = $.sqlAuthUpdatePassword;
        this.sqlAuthUpdateUserName = $.sqlAuthUpdateUserName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlConnectivityUpdateSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlConnectivityUpdateSettingsArgs $;

        public Builder() {
            $ = new SqlConnectivityUpdateSettingsArgs();
        }

        public Builder(SqlConnectivityUpdateSettingsArgs defaults) {
            $ = new SqlConnectivityUpdateSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectivityType SQL Server connectivity option.
         * 
         * @return builder
         * 
         */
        public Builder connectivityType(@Nullable Output<Either<String,ConnectivityType>> connectivityType) {
            $.connectivityType = connectivityType;
            return this;
        }

        /**
         * @param connectivityType SQL Server connectivity option.
         * 
         * @return builder
         * 
         */
        public Builder connectivityType(Either<String,ConnectivityType> connectivityType) {
            return connectivityType(Output.of(connectivityType));
        }

        /**
         * @param connectivityType SQL Server connectivity option.
         * 
         * @return builder
         * 
         */
        public Builder connectivityType(String connectivityType) {
            return connectivityType(Either.ofLeft(connectivityType));
        }

        /**
         * @param connectivityType SQL Server connectivity option.
         * 
         * @return builder
         * 
         */
        public Builder connectivityType(ConnectivityType connectivityType) {
            return connectivityType(Either.ofRight(connectivityType));
        }

        /**
         * @param port SQL Server port.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port SQL Server port.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param sqlAuthUpdatePassword SQL Server sysadmin login password.
         * 
         * @return builder
         * 
         */
        public Builder sqlAuthUpdatePassword(@Nullable Output<String> sqlAuthUpdatePassword) {
            $.sqlAuthUpdatePassword = sqlAuthUpdatePassword;
            return this;
        }

        /**
         * @param sqlAuthUpdatePassword SQL Server sysadmin login password.
         * 
         * @return builder
         * 
         */
        public Builder sqlAuthUpdatePassword(String sqlAuthUpdatePassword) {
            return sqlAuthUpdatePassword(Output.of(sqlAuthUpdatePassword));
        }

        /**
         * @param sqlAuthUpdateUserName SQL Server sysadmin login to create.
         * 
         * @return builder
         * 
         */
        public Builder sqlAuthUpdateUserName(@Nullable Output<String> sqlAuthUpdateUserName) {
            $.sqlAuthUpdateUserName = sqlAuthUpdateUserName;
            return this;
        }

        /**
         * @param sqlAuthUpdateUserName SQL Server sysadmin login to create.
         * 
         * @return builder
         * 
         */
        public Builder sqlAuthUpdateUserName(String sqlAuthUpdateUserName) {
            return sqlAuthUpdateUserName(Output.of(sqlAuthUpdateUserName));
        }

        public SqlConnectivityUpdateSettingsArgs build() {
            return $;
        }
    }

}
