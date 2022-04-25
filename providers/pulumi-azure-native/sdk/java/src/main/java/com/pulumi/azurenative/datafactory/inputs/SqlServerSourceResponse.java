// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.SqlPartitionSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.StoredProcedureParameterResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity SQL server source.
 * 
 */
public final class SqlServerSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SqlServerSourceResponse Empty = new SqlServerSourceResponse();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @Import(name="additionalColumns")
    private @Nullable Object additionalColumns;

    /**
     * @return Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    public Optional<Object> additionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
    private @Nullable Object disableMetricsCollection;

    /**
     * @return If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Object maxConcurrentConnections;

    /**
     * @return The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * The partition mechanism that will be used for Sql read in parallel. Possible values include: &#34;None&#34;, &#34;PhysicalPartitionsOfTable&#34;, &#34;DynamicRange&#34;.
     * 
     */
    @Import(name="partitionOption")
    private @Nullable Object partitionOption;

    /**
     * @return The partition mechanism that will be used for Sql read in parallel. Possible values include: &#34;None&#34;, &#34;PhysicalPartitionsOfTable&#34;, &#34;DynamicRange&#34;.
     * 
     */
    public Optional<Object> partitionOption() {
        return Optional.ofNullable(this.partitionOption);
    }

    /**
     * The settings that will be leveraged for Sql source partitioning.
     * 
     */
    @Import(name="partitionSettings")
    private @Nullable SqlPartitionSettingsResponse partitionSettings;

    /**
     * @return The settings that will be leveraged for Sql source partitioning.
     * 
     */
    public Optional<SqlPartitionSettingsResponse> partitionSettings() {
        return Optional.ofNullable(this.partitionSettings);
    }

    /**
     * Which additional types to produce.
     * 
     */
    @Import(name="produceAdditionalTypes")
    private @Nullable Object produceAdditionalTypes;

    /**
     * @return Which additional types to produce.
     * 
     */
    public Optional<Object> produceAdditionalTypes() {
        return Optional.ofNullable(this.produceAdditionalTypes);
    }

    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="queryTimeout")
    private @Nullable Object queryTimeout;

    /**
     * @return Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Object> queryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
    private @Nullable Object sourceRetryCount;

    /**
     * @return Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> sourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
    private @Nullable Object sourceRetryWait;

    /**
     * @return Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Object> sourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * SQL reader query. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sqlReaderQuery")
    private @Nullable Object sqlReaderQuery;

    /**
     * @return SQL reader query. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> sqlReaderQuery() {
        return Optional.ofNullable(this.sqlReaderQuery);
    }

    /**
     * Name of the stored procedure for a SQL Database source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sqlReaderStoredProcedureName")
    private @Nullable Object sqlReaderStoredProcedureName;

    /**
     * @return Name of the stored procedure for a SQL Database source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> sqlReaderStoredProcedureName() {
        return Optional.ofNullable(this.sqlReaderStoredProcedureName);
    }

    /**
     * Value and type setting for stored procedure parameters. Example: &#34;{Parameter1: {value: &#34;1&#34;, type: &#34;int&#34;}}&#34;.
     * 
     */
    @Import(name="storedProcedureParameters")
    private @Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters;

    /**
     * @return Value and type setting for stored procedure parameters. Example: &#34;{Parameter1: {value: &#34;1&#34;, type: &#34;int&#34;}}&#34;.
     * 
     */
    public Optional<Map<String,StoredProcedureParameterResponse>> storedProcedureParameters() {
        return Optional.ofNullable(this.storedProcedureParameters);
    }

    /**
     * Copy source type.
     * Expected value is &#39;SqlServerSource&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Copy source type.
     * Expected value is &#39;SqlServerSource&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private SqlServerSourceResponse() {}

    private SqlServerSourceResponse(SqlServerSourceResponse $) {
        this.additionalColumns = $.additionalColumns;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.partitionOption = $.partitionOption;
        this.partitionSettings = $.partitionSettings;
        this.produceAdditionalTypes = $.produceAdditionalTypes;
        this.queryTimeout = $.queryTimeout;
        this.sourceRetryCount = $.sourceRetryCount;
        this.sourceRetryWait = $.sourceRetryWait;
        this.sqlReaderQuery = $.sqlReaderQuery;
        this.sqlReaderStoredProcedureName = $.sqlReaderStoredProcedureName;
        this.storedProcedureParameters = $.storedProcedureParameters;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlServerSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlServerSourceResponse $;

        public Builder() {
            $ = new SqlServerSourceResponse();
        }

        public Builder(SqlServerSourceResponse defaults) {
            $ = new SqlServerSourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalColumns Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
         * 
         * @return builder
         * 
         */
        public Builder additionalColumns(@Nullable Object additionalColumns) {
            $.additionalColumns = additionalColumns;
            return this;
        }

        /**
         * @param disableMetricsCollection If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        /**
         * @param partitionOption The partition mechanism that will be used for Sql read in parallel. Possible values include: &#34;None&#34;, &#34;PhysicalPartitionsOfTable&#34;, &#34;DynamicRange&#34;.
         * 
         * @return builder
         * 
         */
        public Builder partitionOption(@Nullable Object partitionOption) {
            $.partitionOption = partitionOption;
            return this;
        }

        /**
         * @param partitionSettings The settings that will be leveraged for Sql source partitioning.
         * 
         * @return builder
         * 
         */
        public Builder partitionSettings(@Nullable SqlPartitionSettingsResponse partitionSettings) {
            $.partitionSettings = partitionSettings;
            return this;
        }

        /**
         * @param produceAdditionalTypes Which additional types to produce.
         * 
         * @return builder
         * 
         */
        public Builder produceAdditionalTypes(@Nullable Object produceAdditionalTypes) {
            $.produceAdditionalTypes = produceAdditionalTypes;
            return this;
        }

        /**
         * @param queryTimeout Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder queryTimeout(@Nullable Object queryTimeout) {
            $.queryTimeout = queryTimeout;
            return this;
        }

        /**
         * @param sourceRetryCount Source retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            $.sourceRetryCount = sourceRetryCount;
            return this;
        }

        /**
         * @param sourceRetryWait Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            $.sourceRetryWait = sourceRetryWait;
            return this;
        }

        /**
         * @param sqlReaderQuery SQL reader query. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sqlReaderQuery(@Nullable Object sqlReaderQuery) {
            $.sqlReaderQuery = sqlReaderQuery;
            return this;
        }

        /**
         * @param sqlReaderStoredProcedureName Name of the stored procedure for a SQL Database source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sqlReaderStoredProcedureName(@Nullable Object sqlReaderStoredProcedureName) {
            $.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
            return this;
        }

        /**
         * @param storedProcedureParameters Value and type setting for stored procedure parameters. Example: &#34;{Parameter1: {value: &#34;1&#34;, type: &#34;int&#34;}}&#34;.
         * 
         * @return builder
         * 
         */
        public Builder storedProcedureParameters(@Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters) {
            $.storedProcedureParameters = storedProcedureParameters;
            return this;
        }

        /**
         * @param type Copy source type.
         * Expected value is &#39;SqlServerSource&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public SqlServerSourceResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
