// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.enums.DataSourceDatabaseEngineType;
import io.pulumi.awsnative.kendra.inputs.DataSourceAclConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.DataSourceColumnConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.DataSourceConnectionConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.DataSourceSqlConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.DataSourceVpcConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceDatabaseConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceDatabaseConfigurationArgs Empty = new DataSourceDatabaseConfigurationArgs();

    @InputImport(name="aclConfiguration")
    private final @Nullable Input<DataSourceAclConfigurationArgs> aclConfiguration;

    public Input<DataSourceAclConfigurationArgs> getAclConfiguration() {
        return this.aclConfiguration == null ? Input.empty() : this.aclConfiguration;
    }

    @InputImport(name="columnConfiguration", required=true)
    private final Input<DataSourceColumnConfigurationArgs> columnConfiguration;

    public Input<DataSourceColumnConfigurationArgs> getColumnConfiguration() {
        return this.columnConfiguration;
    }

    @InputImport(name="connectionConfiguration", required=true)
    private final Input<DataSourceConnectionConfigurationArgs> connectionConfiguration;

    public Input<DataSourceConnectionConfigurationArgs> getConnectionConfiguration() {
        return this.connectionConfiguration;
    }

    @InputImport(name="databaseEngineType", required=true)
    private final Input<DataSourceDatabaseEngineType> databaseEngineType;

    public Input<DataSourceDatabaseEngineType> getDatabaseEngineType() {
        return this.databaseEngineType;
    }

    @InputImport(name="sqlConfiguration")
    private final @Nullable Input<DataSourceSqlConfigurationArgs> sqlConfiguration;

    public Input<DataSourceSqlConfigurationArgs> getSqlConfiguration() {
        return this.sqlConfiguration == null ? Input.empty() : this.sqlConfiguration;
    }

    @InputImport(name="vpcConfiguration")
    private final @Nullable Input<DataSourceVpcConfigurationArgs> vpcConfiguration;

    public Input<DataSourceVpcConfigurationArgs> getVpcConfiguration() {
        return this.vpcConfiguration == null ? Input.empty() : this.vpcConfiguration;
    }

    public DataSourceDatabaseConfigurationArgs(
        @Nullable Input<DataSourceAclConfigurationArgs> aclConfiguration,
        Input<DataSourceColumnConfigurationArgs> columnConfiguration,
        Input<DataSourceConnectionConfigurationArgs> connectionConfiguration,
        Input<DataSourceDatabaseEngineType> databaseEngineType,
        @Nullable Input<DataSourceSqlConfigurationArgs> sqlConfiguration,
        @Nullable Input<DataSourceVpcConfigurationArgs> vpcConfiguration) {
        this.aclConfiguration = aclConfiguration;
        this.columnConfiguration = Objects.requireNonNull(columnConfiguration, "expected parameter 'columnConfiguration' to be non-null");
        this.connectionConfiguration = Objects.requireNonNull(connectionConfiguration, "expected parameter 'connectionConfiguration' to be non-null");
        this.databaseEngineType = Objects.requireNonNull(databaseEngineType, "expected parameter 'databaseEngineType' to be non-null");
        this.sqlConfiguration = sqlConfiguration;
        this.vpcConfiguration = vpcConfiguration;
    }

    private DataSourceDatabaseConfigurationArgs() {
        this.aclConfiguration = Input.empty();
        this.columnConfiguration = Input.empty();
        this.connectionConfiguration = Input.empty();
        this.databaseEngineType = Input.empty();
        this.sqlConfiguration = Input.empty();
        this.vpcConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceDatabaseConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DataSourceAclConfigurationArgs> aclConfiguration;
        private Input<DataSourceColumnConfigurationArgs> columnConfiguration;
        private Input<DataSourceConnectionConfigurationArgs> connectionConfiguration;
        private Input<DataSourceDatabaseEngineType> databaseEngineType;
        private @Nullable Input<DataSourceSqlConfigurationArgs> sqlConfiguration;
        private @Nullable Input<DataSourceVpcConfigurationArgs> vpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceDatabaseConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclConfiguration = defaults.aclConfiguration;
    	      this.columnConfiguration = defaults.columnConfiguration;
    	      this.connectionConfiguration = defaults.connectionConfiguration;
    	      this.databaseEngineType = defaults.databaseEngineType;
    	      this.sqlConfiguration = defaults.sqlConfiguration;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        public Builder setAclConfiguration(@Nullable Input<DataSourceAclConfigurationArgs> aclConfiguration) {
            this.aclConfiguration = aclConfiguration;
            return this;
        }

        public Builder setAclConfiguration(@Nullable DataSourceAclConfigurationArgs aclConfiguration) {
            this.aclConfiguration = Input.ofNullable(aclConfiguration);
            return this;
        }

        public Builder setColumnConfiguration(Input<DataSourceColumnConfigurationArgs> columnConfiguration) {
            this.columnConfiguration = Objects.requireNonNull(columnConfiguration);
            return this;
        }

        public Builder setColumnConfiguration(DataSourceColumnConfigurationArgs columnConfiguration) {
            this.columnConfiguration = Input.of(Objects.requireNonNull(columnConfiguration));
            return this;
        }

        public Builder setConnectionConfiguration(Input<DataSourceConnectionConfigurationArgs> connectionConfiguration) {
            this.connectionConfiguration = Objects.requireNonNull(connectionConfiguration);
            return this;
        }

        public Builder setConnectionConfiguration(DataSourceConnectionConfigurationArgs connectionConfiguration) {
            this.connectionConfiguration = Input.of(Objects.requireNonNull(connectionConfiguration));
            return this;
        }

        public Builder setDatabaseEngineType(Input<DataSourceDatabaseEngineType> databaseEngineType) {
            this.databaseEngineType = Objects.requireNonNull(databaseEngineType);
            return this;
        }

        public Builder setDatabaseEngineType(DataSourceDatabaseEngineType databaseEngineType) {
            this.databaseEngineType = Input.of(Objects.requireNonNull(databaseEngineType));
            return this;
        }

        public Builder setSqlConfiguration(@Nullable Input<DataSourceSqlConfigurationArgs> sqlConfiguration) {
            this.sqlConfiguration = sqlConfiguration;
            return this;
        }

        public Builder setSqlConfiguration(@Nullable DataSourceSqlConfigurationArgs sqlConfiguration) {
            this.sqlConfiguration = Input.ofNullable(sqlConfiguration);
            return this;
        }

        public Builder setVpcConfiguration(@Nullable Input<DataSourceVpcConfigurationArgs> vpcConfiguration) {
            this.vpcConfiguration = vpcConfiguration;
            return this;
        }

        public Builder setVpcConfiguration(@Nullable DataSourceVpcConfigurationArgs vpcConfiguration) {
            this.vpcConfiguration = Input.ofNullable(vpcConfiguration);
            return this;
        }

        public DataSourceDatabaseConfigurationArgs build() {
            return new DataSourceDatabaseConfigurationArgs(aclConfiguration, columnConfiguration, connectionConfiguration, databaseEngineType, sqlConfiguration, vpcConfiguration);
        }
    }
}
