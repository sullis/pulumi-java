// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.outputs;

import com.pulumi.aws.appsync.outputs.DataSourceDynamodbConfigDeltaSyncConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceDynamodbConfig {
    private final @Nullable DataSourceDynamodbConfigDeltaSyncConfig deltaSyncConfig;
    /**
     * @return AWS Region for RDS HTTP endpoint. Defaults to current region.
     * 
     */
    private final @Nullable String region;
    /**
     * @return Name of the DynamoDB table.
     * 
     */
    private final String tableName;
    /**
     * @return Set to `true` to use Amazon Cognito credentials with this data source.
     * 
     */
    private final @Nullable Boolean useCallerCredentials;
    private final @Nullable Boolean versioned;

    @CustomType.Constructor
    private DataSourceDynamodbConfig(
        @CustomType.Parameter("deltaSyncConfig") @Nullable DataSourceDynamodbConfigDeltaSyncConfig deltaSyncConfig,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("tableName") String tableName,
        @CustomType.Parameter("useCallerCredentials") @Nullable Boolean useCallerCredentials,
        @CustomType.Parameter("versioned") @Nullable Boolean versioned) {
        this.deltaSyncConfig = deltaSyncConfig;
        this.region = region;
        this.tableName = tableName;
        this.useCallerCredentials = useCallerCredentials;
        this.versioned = versioned;
    }

    public Optional<DataSourceDynamodbConfigDeltaSyncConfig> deltaSyncConfig() {
        return Optional.ofNullable(this.deltaSyncConfig);
    }
    /**
     * @return AWS Region for RDS HTTP endpoint. Defaults to current region.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return Name of the DynamoDB table.
     * 
     */
    public String tableName() {
        return this.tableName;
    }
    /**
     * @return Set to `true` to use Amazon Cognito credentials with this data source.
     * 
     */
    public Optional<Boolean> useCallerCredentials() {
        return Optional.ofNullable(this.useCallerCredentials);
    }
    public Optional<Boolean> versioned() {
        return Optional.ofNullable(this.versioned);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceDynamodbConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceDynamodbConfigDeltaSyncConfig deltaSyncConfig;
        private @Nullable String region;
        private String tableName;
        private @Nullable Boolean useCallerCredentials;
        private @Nullable Boolean versioned;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceDynamodbConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deltaSyncConfig = defaults.deltaSyncConfig;
    	      this.region = defaults.region;
    	      this.tableName = defaults.tableName;
    	      this.useCallerCredentials = defaults.useCallerCredentials;
    	      this.versioned = defaults.versioned;
        }

        public Builder deltaSyncConfig(@Nullable DataSourceDynamodbConfigDeltaSyncConfig deltaSyncConfig) {
            this.deltaSyncConfig = deltaSyncConfig;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public Builder useCallerCredentials(@Nullable Boolean useCallerCredentials) {
            this.useCallerCredentials = useCallerCredentials;
            return this;
        }
        public Builder versioned(@Nullable Boolean versioned) {
            this.versioned = versioned;
            return this;
        }        public DataSourceDynamodbConfig build() {
            return new DataSourceDynamodbConfig(deltaSyncConfig, region, tableName, useCallerCredentials, versioned);
        }
    }
}
