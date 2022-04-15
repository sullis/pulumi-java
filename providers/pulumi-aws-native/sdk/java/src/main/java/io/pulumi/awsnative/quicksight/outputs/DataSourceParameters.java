// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.outputs.DataSourceAmazonElasticsearchParameters;
import io.pulumi.awsnative.quicksight.outputs.DataSourceAmazonOpenSearchParameters;
import io.pulumi.awsnative.quicksight.outputs.DataSourceAthenaParameters;
import io.pulumi.awsnative.quicksight.outputs.DataSourceAuroraParameters;
import io.pulumi.awsnative.quicksight.outputs.DataSourceAuroraPostgreSqlParameters;
import io.pulumi.awsnative.quicksight.outputs.DataSourceMariaDbParameters;
import io.pulumi.awsnative.quicksight.outputs.DataSourceMySqlParameters;
import io.pulumi.awsnative.quicksight.outputs.DataSourceOracleParameters;
import io.pulumi.awsnative.quicksight.outputs.DataSourcePostgreSqlParameters;
import io.pulumi.awsnative.quicksight.outputs.DataSourcePrestoParameters;
import io.pulumi.awsnative.quicksight.outputs.DataSourceRdsParameters;
import io.pulumi.awsnative.quicksight.outputs.DataSourceRedshiftParameters;
import io.pulumi.awsnative.quicksight.outputs.DataSourceS3Parameters;
import io.pulumi.awsnative.quicksight.outputs.DataSourceSnowflakeParameters;
import io.pulumi.awsnative.quicksight.outputs.DataSourceSparkParameters;
import io.pulumi.awsnative.quicksight.outputs.DataSourceSqlServerParameters;
import io.pulumi.awsnative.quicksight.outputs.DataSourceTeradataParameters;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceParameters {
    private final @Nullable DataSourceAmazonElasticsearchParameters amazonElasticsearchParameters;
    private final @Nullable DataSourceAmazonOpenSearchParameters amazonOpenSearchParameters;
    private final @Nullable DataSourceAthenaParameters athenaParameters;
    private final @Nullable DataSourceAuroraParameters auroraParameters;
    private final @Nullable DataSourceAuroraPostgreSqlParameters auroraPostgreSqlParameters;
    private final @Nullable DataSourceMariaDbParameters mariaDbParameters;
    private final @Nullable DataSourceMySqlParameters mySqlParameters;
    private final @Nullable DataSourceOracleParameters oracleParameters;
    private final @Nullable DataSourcePostgreSqlParameters postgreSqlParameters;
    private final @Nullable DataSourcePrestoParameters prestoParameters;
    private final @Nullable DataSourceRdsParameters rdsParameters;
    private final @Nullable DataSourceRedshiftParameters redshiftParameters;
    private final @Nullable DataSourceS3Parameters s3Parameters;
    private final @Nullable DataSourceSnowflakeParameters snowflakeParameters;
    private final @Nullable DataSourceSparkParameters sparkParameters;
    private final @Nullable DataSourceSqlServerParameters sqlServerParameters;
    private final @Nullable DataSourceTeradataParameters teradataParameters;

    @CustomType.Constructor
    private DataSourceParameters(
        @CustomType.Parameter("amazonElasticsearchParameters") @Nullable DataSourceAmazonElasticsearchParameters amazonElasticsearchParameters,
        @CustomType.Parameter("amazonOpenSearchParameters") @Nullable DataSourceAmazonOpenSearchParameters amazonOpenSearchParameters,
        @CustomType.Parameter("athenaParameters") @Nullable DataSourceAthenaParameters athenaParameters,
        @CustomType.Parameter("auroraParameters") @Nullable DataSourceAuroraParameters auroraParameters,
        @CustomType.Parameter("auroraPostgreSqlParameters") @Nullable DataSourceAuroraPostgreSqlParameters auroraPostgreSqlParameters,
        @CustomType.Parameter("mariaDbParameters") @Nullable DataSourceMariaDbParameters mariaDbParameters,
        @CustomType.Parameter("mySqlParameters") @Nullable DataSourceMySqlParameters mySqlParameters,
        @CustomType.Parameter("oracleParameters") @Nullable DataSourceOracleParameters oracleParameters,
        @CustomType.Parameter("postgreSqlParameters") @Nullable DataSourcePostgreSqlParameters postgreSqlParameters,
        @CustomType.Parameter("prestoParameters") @Nullable DataSourcePrestoParameters prestoParameters,
        @CustomType.Parameter("rdsParameters") @Nullable DataSourceRdsParameters rdsParameters,
        @CustomType.Parameter("redshiftParameters") @Nullable DataSourceRedshiftParameters redshiftParameters,
        @CustomType.Parameter("s3Parameters") @Nullable DataSourceS3Parameters s3Parameters,
        @CustomType.Parameter("snowflakeParameters") @Nullable DataSourceSnowflakeParameters snowflakeParameters,
        @CustomType.Parameter("sparkParameters") @Nullable DataSourceSparkParameters sparkParameters,
        @CustomType.Parameter("sqlServerParameters") @Nullable DataSourceSqlServerParameters sqlServerParameters,
        @CustomType.Parameter("teradataParameters") @Nullable DataSourceTeradataParameters teradataParameters) {
        this.amazonElasticsearchParameters = amazonElasticsearchParameters;
        this.amazonOpenSearchParameters = amazonOpenSearchParameters;
        this.athenaParameters = athenaParameters;
        this.auroraParameters = auroraParameters;
        this.auroraPostgreSqlParameters = auroraPostgreSqlParameters;
        this.mariaDbParameters = mariaDbParameters;
        this.mySqlParameters = mySqlParameters;
        this.oracleParameters = oracleParameters;
        this.postgreSqlParameters = postgreSqlParameters;
        this.prestoParameters = prestoParameters;
        this.rdsParameters = rdsParameters;
        this.redshiftParameters = redshiftParameters;
        this.s3Parameters = s3Parameters;
        this.snowflakeParameters = snowflakeParameters;
        this.sparkParameters = sparkParameters;
        this.sqlServerParameters = sqlServerParameters;
        this.teradataParameters = teradataParameters;
    }

    public Optional<DataSourceAmazonElasticsearchParameters> amazonElasticsearchParameters() {
        return Optional.ofNullable(this.amazonElasticsearchParameters);
    }
    public Optional<DataSourceAmazonOpenSearchParameters> amazonOpenSearchParameters() {
        return Optional.ofNullable(this.amazonOpenSearchParameters);
    }
    public Optional<DataSourceAthenaParameters> athenaParameters() {
        return Optional.ofNullable(this.athenaParameters);
    }
    public Optional<DataSourceAuroraParameters> auroraParameters() {
        return Optional.ofNullable(this.auroraParameters);
    }
    public Optional<DataSourceAuroraPostgreSqlParameters> auroraPostgreSqlParameters() {
        return Optional.ofNullable(this.auroraPostgreSqlParameters);
    }
    public Optional<DataSourceMariaDbParameters> mariaDbParameters() {
        return Optional.ofNullable(this.mariaDbParameters);
    }
    public Optional<DataSourceMySqlParameters> mySqlParameters() {
        return Optional.ofNullable(this.mySqlParameters);
    }
    public Optional<DataSourceOracleParameters> oracleParameters() {
        return Optional.ofNullable(this.oracleParameters);
    }
    public Optional<DataSourcePostgreSqlParameters> postgreSqlParameters() {
        return Optional.ofNullable(this.postgreSqlParameters);
    }
    public Optional<DataSourcePrestoParameters> prestoParameters() {
        return Optional.ofNullable(this.prestoParameters);
    }
    public Optional<DataSourceRdsParameters> rdsParameters() {
        return Optional.ofNullable(this.rdsParameters);
    }
    public Optional<DataSourceRedshiftParameters> redshiftParameters() {
        return Optional.ofNullable(this.redshiftParameters);
    }
    public Optional<DataSourceS3Parameters> s3Parameters() {
        return Optional.ofNullable(this.s3Parameters);
    }
    public Optional<DataSourceSnowflakeParameters> snowflakeParameters() {
        return Optional.ofNullable(this.snowflakeParameters);
    }
    public Optional<DataSourceSparkParameters> sparkParameters() {
        return Optional.ofNullable(this.sparkParameters);
    }
    public Optional<DataSourceSqlServerParameters> sqlServerParameters() {
        return Optional.ofNullable(this.sqlServerParameters);
    }
    public Optional<DataSourceTeradataParameters> teradataParameters() {
        return Optional.ofNullable(this.teradataParameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceAmazonElasticsearchParameters amazonElasticsearchParameters;
        private @Nullable DataSourceAmazonOpenSearchParameters amazonOpenSearchParameters;
        private @Nullable DataSourceAthenaParameters athenaParameters;
        private @Nullable DataSourceAuroraParameters auroraParameters;
        private @Nullable DataSourceAuroraPostgreSqlParameters auroraPostgreSqlParameters;
        private @Nullable DataSourceMariaDbParameters mariaDbParameters;
        private @Nullable DataSourceMySqlParameters mySqlParameters;
        private @Nullable DataSourceOracleParameters oracleParameters;
        private @Nullable DataSourcePostgreSqlParameters postgreSqlParameters;
        private @Nullable DataSourcePrestoParameters prestoParameters;
        private @Nullable DataSourceRdsParameters rdsParameters;
        private @Nullable DataSourceRedshiftParameters redshiftParameters;
        private @Nullable DataSourceS3Parameters s3Parameters;
        private @Nullable DataSourceSnowflakeParameters snowflakeParameters;
        private @Nullable DataSourceSparkParameters sparkParameters;
        private @Nullable DataSourceSqlServerParameters sqlServerParameters;
        private @Nullable DataSourceTeradataParameters teradataParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amazonElasticsearchParameters = defaults.amazonElasticsearchParameters;
    	      this.amazonOpenSearchParameters = defaults.amazonOpenSearchParameters;
    	      this.athenaParameters = defaults.athenaParameters;
    	      this.auroraParameters = defaults.auroraParameters;
    	      this.auroraPostgreSqlParameters = defaults.auroraPostgreSqlParameters;
    	      this.mariaDbParameters = defaults.mariaDbParameters;
    	      this.mySqlParameters = defaults.mySqlParameters;
    	      this.oracleParameters = defaults.oracleParameters;
    	      this.postgreSqlParameters = defaults.postgreSqlParameters;
    	      this.prestoParameters = defaults.prestoParameters;
    	      this.rdsParameters = defaults.rdsParameters;
    	      this.redshiftParameters = defaults.redshiftParameters;
    	      this.s3Parameters = defaults.s3Parameters;
    	      this.snowflakeParameters = defaults.snowflakeParameters;
    	      this.sparkParameters = defaults.sparkParameters;
    	      this.sqlServerParameters = defaults.sqlServerParameters;
    	      this.teradataParameters = defaults.teradataParameters;
        }

        public Builder amazonElasticsearchParameters(@Nullable DataSourceAmazonElasticsearchParameters amazonElasticsearchParameters) {
            this.amazonElasticsearchParameters = amazonElasticsearchParameters;
            return this;
        }
        public Builder amazonOpenSearchParameters(@Nullable DataSourceAmazonOpenSearchParameters amazonOpenSearchParameters) {
            this.amazonOpenSearchParameters = amazonOpenSearchParameters;
            return this;
        }
        public Builder athenaParameters(@Nullable DataSourceAthenaParameters athenaParameters) {
            this.athenaParameters = athenaParameters;
            return this;
        }
        public Builder auroraParameters(@Nullable DataSourceAuroraParameters auroraParameters) {
            this.auroraParameters = auroraParameters;
            return this;
        }
        public Builder auroraPostgreSqlParameters(@Nullable DataSourceAuroraPostgreSqlParameters auroraPostgreSqlParameters) {
            this.auroraPostgreSqlParameters = auroraPostgreSqlParameters;
            return this;
        }
        public Builder mariaDbParameters(@Nullable DataSourceMariaDbParameters mariaDbParameters) {
            this.mariaDbParameters = mariaDbParameters;
            return this;
        }
        public Builder mySqlParameters(@Nullable DataSourceMySqlParameters mySqlParameters) {
            this.mySqlParameters = mySqlParameters;
            return this;
        }
        public Builder oracleParameters(@Nullable DataSourceOracleParameters oracleParameters) {
            this.oracleParameters = oracleParameters;
            return this;
        }
        public Builder postgreSqlParameters(@Nullable DataSourcePostgreSqlParameters postgreSqlParameters) {
            this.postgreSqlParameters = postgreSqlParameters;
            return this;
        }
        public Builder prestoParameters(@Nullable DataSourcePrestoParameters prestoParameters) {
            this.prestoParameters = prestoParameters;
            return this;
        }
        public Builder rdsParameters(@Nullable DataSourceRdsParameters rdsParameters) {
            this.rdsParameters = rdsParameters;
            return this;
        }
        public Builder redshiftParameters(@Nullable DataSourceRedshiftParameters redshiftParameters) {
            this.redshiftParameters = redshiftParameters;
            return this;
        }
        public Builder s3Parameters(@Nullable DataSourceS3Parameters s3Parameters) {
            this.s3Parameters = s3Parameters;
            return this;
        }
        public Builder snowflakeParameters(@Nullable DataSourceSnowflakeParameters snowflakeParameters) {
            this.snowflakeParameters = snowflakeParameters;
            return this;
        }
        public Builder sparkParameters(@Nullable DataSourceSparkParameters sparkParameters) {
            this.sparkParameters = sparkParameters;
            return this;
        }
        public Builder sqlServerParameters(@Nullable DataSourceSqlServerParameters sqlServerParameters) {
            this.sqlServerParameters = sqlServerParameters;
            return this;
        }
        public Builder teradataParameters(@Nullable DataSourceTeradataParameters teradataParameters) {
            this.teradataParameters = teradataParameters;
            return this;
        }        public DataSourceParameters build() {
            return new DataSourceParameters(amazonElasticsearchParameters, amazonOpenSearchParameters, athenaParameters, auroraParameters, auroraPostgreSqlParameters, mariaDbParameters, mySqlParameters, oracleParameters, postgreSqlParameters, prestoParameters, rdsParameters, redshiftParameters, s3Parameters, snowflakeParameters, sparkParameters, sqlServerParameters, teradataParameters);
        }
    }
}
