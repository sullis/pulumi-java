// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SqlPartitionSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.StoredProcedureParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity Azure SQL source.
 * 
 */
public final class AzureSqlSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureSqlSourceArgs Empty = new AzureSqlSourceArgs();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @InputImport(name="additionalColumns")
    private final @Nullable Input<Object> additionalColumns;

    public Input<Object> getAdditionalColumns() {
        return this.additionalColumns == null ? Input.empty() : this.additionalColumns;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
    private final @Nullable Input<Object> disableMetricsCollection;

    public Input<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Input.empty() : this.disableMetricsCollection;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
    private final @Nullable Input<Object> maxConcurrentConnections;

    public Input<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Input.empty() : this.maxConcurrentConnections;
    }

    /**
     * The partition mechanism that will be used for Sql read in parallel. Possible values include: "None", "PhysicalPartitionsOfTable", "DynamicRange".
     * 
     */
    @InputImport(name="partitionOption")
    private final @Nullable Input<Object> partitionOption;

    public Input<Object> getPartitionOption() {
        return this.partitionOption == null ? Input.empty() : this.partitionOption;
    }

    /**
     * The settings that will be leveraged for Sql source partitioning.
     * 
     */
    @InputImport(name="partitionSettings")
    private final @Nullable Input<SqlPartitionSettingsArgs> partitionSettings;

    public Input<SqlPartitionSettingsArgs> getPartitionSettings() {
        return this.partitionSettings == null ? Input.empty() : this.partitionSettings;
    }

    /**
     * Which additional types to produce.
     * 
     */
    @InputImport(name="produceAdditionalTypes")
    private final @Nullable Input<Object> produceAdditionalTypes;

    public Input<Object> getProduceAdditionalTypes() {
        return this.produceAdditionalTypes == null ? Input.empty() : this.produceAdditionalTypes;
    }

    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="queryTimeout")
    private final @Nullable Input<Object> queryTimeout;

    public Input<Object> getQueryTimeout() {
        return this.queryTimeout == null ? Input.empty() : this.queryTimeout;
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sourceRetryCount")
    private final @Nullable Input<Object> sourceRetryCount;

    public Input<Object> getSourceRetryCount() {
        return this.sourceRetryCount == null ? Input.empty() : this.sourceRetryCount;
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sourceRetryWait")
    private final @Nullable Input<Object> sourceRetryWait;

    public Input<Object> getSourceRetryWait() {
        return this.sourceRetryWait == null ? Input.empty() : this.sourceRetryWait;
    }

    /**
     * SQL reader query. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="sqlReaderQuery")
    private final @Nullable Input<Object> sqlReaderQuery;

    public Input<Object> getSqlReaderQuery() {
        return this.sqlReaderQuery == null ? Input.empty() : this.sqlReaderQuery;
    }

    /**
     * Name of the stored procedure for a SQL Database source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="sqlReaderStoredProcedureName")
    private final @Nullable Input<Object> sqlReaderStoredProcedureName;

    public Input<Object> getSqlReaderStoredProcedureName() {
        return this.sqlReaderStoredProcedureName == null ? Input.empty() : this.sqlReaderStoredProcedureName;
    }

    /**
     * Value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}".
     * 
     */
    @InputImport(name="storedProcedureParameters")
    private final @Nullable Input<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters;

    public Input<Map<String,StoredProcedureParameterArgs>> getStoredProcedureParameters() {
        return this.storedProcedureParameters == null ? Input.empty() : this.storedProcedureParameters;
    }

    /**
     * Copy source type.
     * Expected value is 'AzureSqlSource'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public AzureSqlSourceArgs(
        @Nullable Input<Object> additionalColumns,
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<Object> partitionOption,
        @Nullable Input<SqlPartitionSettingsArgs> partitionSettings,
        @Nullable Input<Object> produceAdditionalTypes,
        @Nullable Input<Object> queryTimeout,
        @Nullable Input<Object> sourceRetryCount,
        @Nullable Input<Object> sourceRetryWait,
        @Nullable Input<Object> sqlReaderQuery,
        @Nullable Input<Object> sqlReaderStoredProcedureName,
        @Nullable Input<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters,
        Input<String> type) {
        this.additionalColumns = additionalColumns;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.partitionOption = partitionOption;
        this.partitionSettings = partitionSettings;
        this.produceAdditionalTypes = produceAdditionalTypes;
        this.queryTimeout = queryTimeout;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.sqlReaderQuery = sqlReaderQuery;
        this.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
        this.storedProcedureParameters = storedProcedureParameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureSqlSourceArgs() {
        this.additionalColumns = Input.empty();
        this.disableMetricsCollection = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.partitionOption = Input.empty();
        this.partitionSettings = Input.empty();
        this.produceAdditionalTypes = Input.empty();
        this.queryTimeout = Input.empty();
        this.sourceRetryCount = Input.empty();
        this.sourceRetryWait = Input.empty();
        this.sqlReaderQuery = Input.empty();
        this.sqlReaderStoredProcedureName = Input.empty();
        this.storedProcedureParameters = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> additionalColumns;
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<Object> partitionOption;
        private @Nullable Input<SqlPartitionSettingsArgs> partitionSettings;
        private @Nullable Input<Object> produceAdditionalTypes;
        private @Nullable Input<Object> queryTimeout;
        private @Nullable Input<Object> sourceRetryCount;
        private @Nullable Input<Object> sourceRetryWait;
        private @Nullable Input<Object> sqlReaderQuery;
        private @Nullable Input<Object> sqlReaderStoredProcedureName;
        private @Nullable Input<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.partitionOption = defaults.partitionOption;
    	      this.partitionSettings = defaults.partitionSettings;
    	      this.produceAdditionalTypes = defaults.produceAdditionalTypes;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.sqlReaderQuery = defaults.sqlReaderQuery;
    	      this.sqlReaderStoredProcedureName = defaults.sqlReaderStoredProcedureName;
    	      this.storedProcedureParameters = defaults.storedProcedureParameters;
    	      this.type = defaults.type;
        }

        public Builder setAdditionalColumns(@Nullable Input<Object> additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }

        public Builder setAdditionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = Input.ofNullable(additionalColumns);
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Input<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Input.ofNullable(disableMetricsCollection);
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Input<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Input.ofNullable(maxConcurrentConnections);
            return this;
        }

        public Builder setPartitionOption(@Nullable Input<Object> partitionOption) {
            this.partitionOption = partitionOption;
            return this;
        }

        public Builder setPartitionOption(@Nullable Object partitionOption) {
            this.partitionOption = Input.ofNullable(partitionOption);
            return this;
        }

        public Builder setPartitionSettings(@Nullable Input<SqlPartitionSettingsArgs> partitionSettings) {
            this.partitionSettings = partitionSettings;
            return this;
        }

        public Builder setPartitionSettings(@Nullable SqlPartitionSettingsArgs partitionSettings) {
            this.partitionSettings = Input.ofNullable(partitionSettings);
            return this;
        }

        public Builder setProduceAdditionalTypes(@Nullable Input<Object> produceAdditionalTypes) {
            this.produceAdditionalTypes = produceAdditionalTypes;
            return this;
        }

        public Builder setProduceAdditionalTypes(@Nullable Object produceAdditionalTypes) {
            this.produceAdditionalTypes = Input.ofNullable(produceAdditionalTypes);
            return this;
        }

        public Builder setQueryTimeout(@Nullable Input<Object> queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }

        public Builder setQueryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = Input.ofNullable(queryTimeout);
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Input<Object> sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = Input.ofNullable(sourceRetryCount);
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Input<Object> sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = Input.ofNullable(sourceRetryWait);
            return this;
        }

        public Builder setSqlReaderQuery(@Nullable Input<Object> sqlReaderQuery) {
            this.sqlReaderQuery = sqlReaderQuery;
            return this;
        }

        public Builder setSqlReaderQuery(@Nullable Object sqlReaderQuery) {
            this.sqlReaderQuery = Input.ofNullable(sqlReaderQuery);
            return this;
        }

        public Builder setSqlReaderStoredProcedureName(@Nullable Input<Object> sqlReaderStoredProcedureName) {
            this.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
            return this;
        }

        public Builder setSqlReaderStoredProcedureName(@Nullable Object sqlReaderStoredProcedureName) {
            this.sqlReaderStoredProcedureName = Input.ofNullable(sqlReaderStoredProcedureName);
            return this;
        }

        public Builder setStoredProcedureParameters(@Nullable Input<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters) {
            this.storedProcedureParameters = storedProcedureParameters;
            return this;
        }

        public Builder setStoredProcedureParameters(@Nullable Map<String,StoredProcedureParameterArgs> storedProcedureParameters) {
            this.storedProcedureParameters = Input.ofNullable(storedProcedureParameters);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public AzureSqlSourceArgs build() {
            return new AzureSqlSourceArgs(additionalColumns, disableMetricsCollection, maxConcurrentConnections, partitionOption, partitionSettings, produceAdditionalTypes, queryTimeout, sourceRetryCount, sourceRetryWait, sqlReaderQuery, sqlReaderStoredProcedureName, storedProcedureParameters, type);
        }
    }
}
