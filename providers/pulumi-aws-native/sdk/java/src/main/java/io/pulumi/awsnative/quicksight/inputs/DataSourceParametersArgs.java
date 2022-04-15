// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.DataSourceAmazonElasticsearchParametersArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceAmazonOpenSearchParametersArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceAthenaParametersArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceAuroraParametersArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceAuroraPostgreSqlParametersArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceMariaDbParametersArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceMySqlParametersArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceOracleParametersArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourcePostgreSqlParametersArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourcePrestoParametersArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceRdsParametersArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceRedshiftParametersArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceS3ParametersArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceSnowflakeParametersArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceSparkParametersArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceSqlServerParametersArgs;
import io.pulumi.awsnative.quicksight.inputs.DataSourceTeradataParametersArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The parameters that Amazon QuickSight uses to connect to your underlying data source.
 *             This is a variant type structure. For this structure to be valid, only one of the
 *             attributes can be non-null.</p>
 * 
 */
public final class DataSourceParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersArgs Empty = new DataSourceParametersArgs();

    @Import(name="amazonElasticsearchParameters")
      private final @Nullable Output<DataSourceAmazonElasticsearchParametersArgs> amazonElasticsearchParameters;

    public Output<DataSourceAmazonElasticsearchParametersArgs> amazonElasticsearchParameters() {
        return this.amazonElasticsearchParameters == null ? Codegen.empty() : this.amazonElasticsearchParameters;
    }

    @Import(name="amazonOpenSearchParameters")
      private final @Nullable Output<DataSourceAmazonOpenSearchParametersArgs> amazonOpenSearchParameters;

    public Output<DataSourceAmazonOpenSearchParametersArgs> amazonOpenSearchParameters() {
        return this.amazonOpenSearchParameters == null ? Codegen.empty() : this.amazonOpenSearchParameters;
    }

    @Import(name="athenaParameters")
      private final @Nullable Output<DataSourceAthenaParametersArgs> athenaParameters;

    public Output<DataSourceAthenaParametersArgs> athenaParameters() {
        return this.athenaParameters == null ? Codegen.empty() : this.athenaParameters;
    }

    @Import(name="auroraParameters")
      private final @Nullable Output<DataSourceAuroraParametersArgs> auroraParameters;

    public Output<DataSourceAuroraParametersArgs> auroraParameters() {
        return this.auroraParameters == null ? Codegen.empty() : this.auroraParameters;
    }

    @Import(name="auroraPostgreSqlParameters")
      private final @Nullable Output<DataSourceAuroraPostgreSqlParametersArgs> auroraPostgreSqlParameters;

    public Output<DataSourceAuroraPostgreSqlParametersArgs> auroraPostgreSqlParameters() {
        return this.auroraPostgreSqlParameters == null ? Codegen.empty() : this.auroraPostgreSqlParameters;
    }

    @Import(name="mariaDbParameters")
      private final @Nullable Output<DataSourceMariaDbParametersArgs> mariaDbParameters;

    public Output<DataSourceMariaDbParametersArgs> mariaDbParameters() {
        return this.mariaDbParameters == null ? Codegen.empty() : this.mariaDbParameters;
    }

    @Import(name="mySqlParameters")
      private final @Nullable Output<DataSourceMySqlParametersArgs> mySqlParameters;

    public Output<DataSourceMySqlParametersArgs> mySqlParameters() {
        return this.mySqlParameters == null ? Codegen.empty() : this.mySqlParameters;
    }

    @Import(name="oracleParameters")
      private final @Nullable Output<DataSourceOracleParametersArgs> oracleParameters;

    public Output<DataSourceOracleParametersArgs> oracleParameters() {
        return this.oracleParameters == null ? Codegen.empty() : this.oracleParameters;
    }

    @Import(name="postgreSqlParameters")
      private final @Nullable Output<DataSourcePostgreSqlParametersArgs> postgreSqlParameters;

    public Output<DataSourcePostgreSqlParametersArgs> postgreSqlParameters() {
        return this.postgreSqlParameters == null ? Codegen.empty() : this.postgreSqlParameters;
    }

    @Import(name="prestoParameters")
      private final @Nullable Output<DataSourcePrestoParametersArgs> prestoParameters;

    public Output<DataSourcePrestoParametersArgs> prestoParameters() {
        return this.prestoParameters == null ? Codegen.empty() : this.prestoParameters;
    }

    @Import(name="rdsParameters")
      private final @Nullable Output<DataSourceRdsParametersArgs> rdsParameters;

    public Output<DataSourceRdsParametersArgs> rdsParameters() {
        return this.rdsParameters == null ? Codegen.empty() : this.rdsParameters;
    }

    @Import(name="redshiftParameters")
      private final @Nullable Output<DataSourceRedshiftParametersArgs> redshiftParameters;

    public Output<DataSourceRedshiftParametersArgs> redshiftParameters() {
        return this.redshiftParameters == null ? Codegen.empty() : this.redshiftParameters;
    }

    @Import(name="s3Parameters")
      private final @Nullable Output<DataSourceS3ParametersArgs> s3Parameters;

    public Output<DataSourceS3ParametersArgs> s3Parameters() {
        return this.s3Parameters == null ? Codegen.empty() : this.s3Parameters;
    }

    @Import(name="snowflakeParameters")
      private final @Nullable Output<DataSourceSnowflakeParametersArgs> snowflakeParameters;

    public Output<DataSourceSnowflakeParametersArgs> snowflakeParameters() {
        return this.snowflakeParameters == null ? Codegen.empty() : this.snowflakeParameters;
    }

    @Import(name="sparkParameters")
      private final @Nullable Output<DataSourceSparkParametersArgs> sparkParameters;

    public Output<DataSourceSparkParametersArgs> sparkParameters() {
        return this.sparkParameters == null ? Codegen.empty() : this.sparkParameters;
    }

    @Import(name="sqlServerParameters")
      private final @Nullable Output<DataSourceSqlServerParametersArgs> sqlServerParameters;

    public Output<DataSourceSqlServerParametersArgs> sqlServerParameters() {
        return this.sqlServerParameters == null ? Codegen.empty() : this.sqlServerParameters;
    }

    @Import(name="teradataParameters")
      private final @Nullable Output<DataSourceTeradataParametersArgs> teradataParameters;

    public Output<DataSourceTeradataParametersArgs> teradataParameters() {
        return this.teradataParameters == null ? Codegen.empty() : this.teradataParameters;
    }

    public DataSourceParametersArgs(
        @Nullable Output<DataSourceAmazonElasticsearchParametersArgs> amazonElasticsearchParameters,
        @Nullable Output<DataSourceAmazonOpenSearchParametersArgs> amazonOpenSearchParameters,
        @Nullable Output<DataSourceAthenaParametersArgs> athenaParameters,
        @Nullable Output<DataSourceAuroraParametersArgs> auroraParameters,
        @Nullable Output<DataSourceAuroraPostgreSqlParametersArgs> auroraPostgreSqlParameters,
        @Nullable Output<DataSourceMariaDbParametersArgs> mariaDbParameters,
        @Nullable Output<DataSourceMySqlParametersArgs> mySqlParameters,
        @Nullable Output<DataSourceOracleParametersArgs> oracleParameters,
        @Nullable Output<DataSourcePostgreSqlParametersArgs> postgreSqlParameters,
        @Nullable Output<DataSourcePrestoParametersArgs> prestoParameters,
        @Nullable Output<DataSourceRdsParametersArgs> rdsParameters,
        @Nullable Output<DataSourceRedshiftParametersArgs> redshiftParameters,
        @Nullable Output<DataSourceS3ParametersArgs> s3Parameters,
        @Nullable Output<DataSourceSnowflakeParametersArgs> snowflakeParameters,
        @Nullable Output<DataSourceSparkParametersArgs> sparkParameters,
        @Nullable Output<DataSourceSqlServerParametersArgs> sqlServerParameters,
        @Nullable Output<DataSourceTeradataParametersArgs> teradataParameters) {
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

    private DataSourceParametersArgs() {
        this.amazonElasticsearchParameters = Codegen.empty();
        this.amazonOpenSearchParameters = Codegen.empty();
        this.athenaParameters = Codegen.empty();
        this.auroraParameters = Codegen.empty();
        this.auroraPostgreSqlParameters = Codegen.empty();
        this.mariaDbParameters = Codegen.empty();
        this.mySqlParameters = Codegen.empty();
        this.oracleParameters = Codegen.empty();
        this.postgreSqlParameters = Codegen.empty();
        this.prestoParameters = Codegen.empty();
        this.rdsParameters = Codegen.empty();
        this.redshiftParameters = Codegen.empty();
        this.s3Parameters = Codegen.empty();
        this.snowflakeParameters = Codegen.empty();
        this.sparkParameters = Codegen.empty();
        this.sqlServerParameters = Codegen.empty();
        this.teradataParameters = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DataSourceAmazonElasticsearchParametersArgs> amazonElasticsearchParameters;
        private @Nullable Output<DataSourceAmazonOpenSearchParametersArgs> amazonOpenSearchParameters;
        private @Nullable Output<DataSourceAthenaParametersArgs> athenaParameters;
        private @Nullable Output<DataSourceAuroraParametersArgs> auroraParameters;
        private @Nullable Output<DataSourceAuroraPostgreSqlParametersArgs> auroraPostgreSqlParameters;
        private @Nullable Output<DataSourceMariaDbParametersArgs> mariaDbParameters;
        private @Nullable Output<DataSourceMySqlParametersArgs> mySqlParameters;
        private @Nullable Output<DataSourceOracleParametersArgs> oracleParameters;
        private @Nullable Output<DataSourcePostgreSqlParametersArgs> postgreSqlParameters;
        private @Nullable Output<DataSourcePrestoParametersArgs> prestoParameters;
        private @Nullable Output<DataSourceRdsParametersArgs> rdsParameters;
        private @Nullable Output<DataSourceRedshiftParametersArgs> redshiftParameters;
        private @Nullable Output<DataSourceS3ParametersArgs> s3Parameters;
        private @Nullable Output<DataSourceSnowflakeParametersArgs> snowflakeParameters;
        private @Nullable Output<DataSourceSparkParametersArgs> sparkParameters;
        private @Nullable Output<DataSourceSqlServerParametersArgs> sqlServerParameters;
        private @Nullable Output<DataSourceTeradataParametersArgs> teradataParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersArgs defaults) {
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

        public Builder amazonElasticsearchParameters(@Nullable Output<DataSourceAmazonElasticsearchParametersArgs> amazonElasticsearchParameters) {
            this.amazonElasticsearchParameters = amazonElasticsearchParameters;
            return this;
        }
        public Builder amazonElasticsearchParameters(@Nullable DataSourceAmazonElasticsearchParametersArgs amazonElasticsearchParameters) {
            this.amazonElasticsearchParameters = Codegen.ofNullable(amazonElasticsearchParameters);
            return this;
        }
        public Builder amazonOpenSearchParameters(@Nullable Output<DataSourceAmazonOpenSearchParametersArgs> amazonOpenSearchParameters) {
            this.amazonOpenSearchParameters = amazonOpenSearchParameters;
            return this;
        }
        public Builder amazonOpenSearchParameters(@Nullable DataSourceAmazonOpenSearchParametersArgs amazonOpenSearchParameters) {
            this.amazonOpenSearchParameters = Codegen.ofNullable(amazonOpenSearchParameters);
            return this;
        }
        public Builder athenaParameters(@Nullable Output<DataSourceAthenaParametersArgs> athenaParameters) {
            this.athenaParameters = athenaParameters;
            return this;
        }
        public Builder athenaParameters(@Nullable DataSourceAthenaParametersArgs athenaParameters) {
            this.athenaParameters = Codegen.ofNullable(athenaParameters);
            return this;
        }
        public Builder auroraParameters(@Nullable Output<DataSourceAuroraParametersArgs> auroraParameters) {
            this.auroraParameters = auroraParameters;
            return this;
        }
        public Builder auroraParameters(@Nullable DataSourceAuroraParametersArgs auroraParameters) {
            this.auroraParameters = Codegen.ofNullable(auroraParameters);
            return this;
        }
        public Builder auroraPostgreSqlParameters(@Nullable Output<DataSourceAuroraPostgreSqlParametersArgs> auroraPostgreSqlParameters) {
            this.auroraPostgreSqlParameters = auroraPostgreSqlParameters;
            return this;
        }
        public Builder auroraPostgreSqlParameters(@Nullable DataSourceAuroraPostgreSqlParametersArgs auroraPostgreSqlParameters) {
            this.auroraPostgreSqlParameters = Codegen.ofNullable(auroraPostgreSqlParameters);
            return this;
        }
        public Builder mariaDbParameters(@Nullable Output<DataSourceMariaDbParametersArgs> mariaDbParameters) {
            this.mariaDbParameters = mariaDbParameters;
            return this;
        }
        public Builder mariaDbParameters(@Nullable DataSourceMariaDbParametersArgs mariaDbParameters) {
            this.mariaDbParameters = Codegen.ofNullable(mariaDbParameters);
            return this;
        }
        public Builder mySqlParameters(@Nullable Output<DataSourceMySqlParametersArgs> mySqlParameters) {
            this.mySqlParameters = mySqlParameters;
            return this;
        }
        public Builder mySqlParameters(@Nullable DataSourceMySqlParametersArgs mySqlParameters) {
            this.mySqlParameters = Codegen.ofNullable(mySqlParameters);
            return this;
        }
        public Builder oracleParameters(@Nullable Output<DataSourceOracleParametersArgs> oracleParameters) {
            this.oracleParameters = oracleParameters;
            return this;
        }
        public Builder oracleParameters(@Nullable DataSourceOracleParametersArgs oracleParameters) {
            this.oracleParameters = Codegen.ofNullable(oracleParameters);
            return this;
        }
        public Builder postgreSqlParameters(@Nullable Output<DataSourcePostgreSqlParametersArgs> postgreSqlParameters) {
            this.postgreSqlParameters = postgreSqlParameters;
            return this;
        }
        public Builder postgreSqlParameters(@Nullable DataSourcePostgreSqlParametersArgs postgreSqlParameters) {
            this.postgreSqlParameters = Codegen.ofNullable(postgreSqlParameters);
            return this;
        }
        public Builder prestoParameters(@Nullable Output<DataSourcePrestoParametersArgs> prestoParameters) {
            this.prestoParameters = prestoParameters;
            return this;
        }
        public Builder prestoParameters(@Nullable DataSourcePrestoParametersArgs prestoParameters) {
            this.prestoParameters = Codegen.ofNullable(prestoParameters);
            return this;
        }
        public Builder rdsParameters(@Nullable Output<DataSourceRdsParametersArgs> rdsParameters) {
            this.rdsParameters = rdsParameters;
            return this;
        }
        public Builder rdsParameters(@Nullable DataSourceRdsParametersArgs rdsParameters) {
            this.rdsParameters = Codegen.ofNullable(rdsParameters);
            return this;
        }
        public Builder redshiftParameters(@Nullable Output<DataSourceRedshiftParametersArgs> redshiftParameters) {
            this.redshiftParameters = redshiftParameters;
            return this;
        }
        public Builder redshiftParameters(@Nullable DataSourceRedshiftParametersArgs redshiftParameters) {
            this.redshiftParameters = Codegen.ofNullable(redshiftParameters);
            return this;
        }
        public Builder s3Parameters(@Nullable Output<DataSourceS3ParametersArgs> s3Parameters) {
            this.s3Parameters = s3Parameters;
            return this;
        }
        public Builder s3Parameters(@Nullable DataSourceS3ParametersArgs s3Parameters) {
            this.s3Parameters = Codegen.ofNullable(s3Parameters);
            return this;
        }
        public Builder snowflakeParameters(@Nullable Output<DataSourceSnowflakeParametersArgs> snowflakeParameters) {
            this.snowflakeParameters = snowflakeParameters;
            return this;
        }
        public Builder snowflakeParameters(@Nullable DataSourceSnowflakeParametersArgs snowflakeParameters) {
            this.snowflakeParameters = Codegen.ofNullable(snowflakeParameters);
            return this;
        }
        public Builder sparkParameters(@Nullable Output<DataSourceSparkParametersArgs> sparkParameters) {
            this.sparkParameters = sparkParameters;
            return this;
        }
        public Builder sparkParameters(@Nullable DataSourceSparkParametersArgs sparkParameters) {
            this.sparkParameters = Codegen.ofNullable(sparkParameters);
            return this;
        }
        public Builder sqlServerParameters(@Nullable Output<DataSourceSqlServerParametersArgs> sqlServerParameters) {
            this.sqlServerParameters = sqlServerParameters;
            return this;
        }
        public Builder sqlServerParameters(@Nullable DataSourceSqlServerParametersArgs sqlServerParameters) {
            this.sqlServerParameters = Codegen.ofNullable(sqlServerParameters);
            return this;
        }
        public Builder teradataParameters(@Nullable Output<DataSourceTeradataParametersArgs> teradataParameters) {
            this.teradataParameters = teradataParameters;
            return this;
        }
        public Builder teradataParameters(@Nullable DataSourceTeradataParametersArgs teradataParameters) {
            this.teradataParameters = Codegen.ofNullable(teradataParameters);
            return this;
        }        public DataSourceParametersArgs build() {
            return new DataSourceParametersArgs(amazonElasticsearchParameters, amazonOpenSearchParameters, athenaParameters, auroraParameters, auroraPostgreSqlParameters, mariaDbParameters, mySqlParameters, oracleParameters, postgreSqlParameters, prestoParameters, rdsParameters, redshiftParameters, s3Parameters, snowflakeParameters, sparkParameters, sqlServerParameters, teradataParameters);
        }
    }
}
