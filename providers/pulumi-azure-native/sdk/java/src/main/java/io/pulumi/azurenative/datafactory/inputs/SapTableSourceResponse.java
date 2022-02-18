// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SapTablePartitionSettingsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity source for SAP Table source.
 * 
 */
public final class SapTableSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SapTableSourceResponse Empty = new SapTableSourceResponse();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @InputImport(name="additionalColumns")
    private final @Nullable Object additionalColumns;

    public Optional<Object> getAdditionalColumns() {
        return this.additionalColumns == null ? Optional.empty() : Optional.ofNullable(this.additionalColumns);
    }

    /**
     * Specifies the maximum number of rows that will be retrieved at a time when retrieving data from SAP Table. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="batchSize")
    private final @Nullable Object batchSize;

    public Optional<Object> getBatchSize() {
        return this.batchSize == null ? Optional.empty() : Optional.ofNullable(this.batchSize);
    }

    /**
     * Specifies the custom RFC function module that will be used to read data from SAP Table. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="customRfcReadTableFunctionModule")
    private final @Nullable Object customRfcReadTableFunctionModule;

    public Optional<Object> getCustomRfcReadTableFunctionModule() {
        return this.customRfcReadTableFunctionModule == null ? Optional.empty() : Optional.ofNullable(this.customRfcReadTableFunctionModule);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
    private final @Nullable Object disableMetricsCollection;

    public Optional<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Optional.empty() : Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
    private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * The partition mechanism that will be used for SAP table read in parallel. Possible values include: "None", "PartitionOnInt", "PartitionOnCalendarYear", "PartitionOnCalendarMonth", "PartitionOnCalendarDate", "PartitionOnTime".
     * 
     */
    @InputImport(name="partitionOption")
    private final @Nullable Object partitionOption;

    public Optional<Object> getPartitionOption() {
        return this.partitionOption == null ? Optional.empty() : Optional.ofNullable(this.partitionOption);
    }

    /**
     * The settings that will be leveraged for SAP table source partitioning.
     * 
     */
    @InputImport(name="partitionSettings")
    private final @Nullable SapTablePartitionSettingsResponse partitionSettings;

    public Optional<SapTablePartitionSettingsResponse> getPartitionSettings() {
        return this.partitionSettings == null ? Optional.empty() : Optional.ofNullable(this.partitionSettings);
    }

    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="queryTimeout")
    private final @Nullable Object queryTimeout;

    public Optional<Object> getQueryTimeout() {
        return this.queryTimeout == null ? Optional.empty() : Optional.ofNullable(this.queryTimeout);
    }

    /**
     * The fields of the SAP table that will be retrieved. For example, column0, column1. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="rfcTableFields")
    private final @Nullable Object rfcTableFields;

    public Optional<Object> getRfcTableFields() {
        return this.rfcTableFields == null ? Optional.empty() : Optional.ofNullable(this.rfcTableFields);
    }

    /**
     * The options for the filtering of the SAP Table. For example, COLUMN0 EQ SOME VALUE. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="rfcTableOptions")
    private final @Nullable Object rfcTableOptions;

    public Optional<Object> getRfcTableOptions() {
        return this.rfcTableOptions == null ? Optional.empty() : Optional.ofNullable(this.rfcTableOptions);
    }

    /**
     * The number of rows to be retrieved. Type: integer(or Expression with resultType integer).
     * 
     */
    @InputImport(name="rowCount")
    private final @Nullable Object rowCount;

    public Optional<Object> getRowCount() {
        return this.rowCount == null ? Optional.empty() : Optional.ofNullable(this.rowCount);
    }

    /**
     * The number of rows that will be skipped. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="rowSkips")
    private final @Nullable Object rowSkips;

    public Optional<Object> getRowSkips() {
        return this.rowSkips == null ? Optional.empty() : Optional.ofNullable(this.rowSkips);
    }

    /**
     * The single character that will be used as delimiter passed to SAP RFC as well as splitting the output data retrieved. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="sapDataColumnDelimiter")
    private final @Nullable Object sapDataColumnDelimiter;

    public Optional<Object> getSapDataColumnDelimiter() {
        return this.sapDataColumnDelimiter == null ? Optional.empty() : Optional.ofNullable(this.sapDataColumnDelimiter);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sourceRetryCount")
    private final @Nullable Object sourceRetryCount;

    public Optional<Object> getSourceRetryCount() {
        return this.sourceRetryCount == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sourceRetryWait")
    private final @Nullable Object sourceRetryWait;

    public Optional<Object> getSourceRetryWait() {
        return this.sourceRetryWait == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * Copy source type.
     * Expected value is 'SapTableSource'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public SapTableSourceResponse(
        @Nullable Object additionalColumns,
        @Nullable Object batchSize,
        @Nullable Object customRfcReadTableFunctionModule,
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object partitionOption,
        @Nullable SapTablePartitionSettingsResponse partitionSettings,
        @Nullable Object queryTimeout,
        @Nullable Object rfcTableFields,
        @Nullable Object rfcTableOptions,
        @Nullable Object rowCount,
        @Nullable Object rowSkips,
        @Nullable Object sapDataColumnDelimiter,
        @Nullable Object sourceRetryCount,
        @Nullable Object sourceRetryWait,
        String type) {
        this.additionalColumns = additionalColumns;
        this.batchSize = batchSize;
        this.customRfcReadTableFunctionModule = customRfcReadTableFunctionModule;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.partitionOption = partitionOption;
        this.partitionSettings = partitionSettings;
        this.queryTimeout = queryTimeout;
        this.rfcTableFields = rfcTableFields;
        this.rfcTableOptions = rfcTableOptions;
        this.rowCount = rowCount;
        this.rowSkips = rowSkips;
        this.sapDataColumnDelimiter = sapDataColumnDelimiter;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SapTableSourceResponse() {
        this.additionalColumns = null;
        this.batchSize = null;
        this.customRfcReadTableFunctionModule = null;
        this.disableMetricsCollection = null;
        this.maxConcurrentConnections = null;
        this.partitionOption = null;
        this.partitionSettings = null;
        this.queryTimeout = null;
        this.rfcTableFields = null;
        this.rfcTableOptions = null;
        this.rowCount = null;
        this.rowSkips = null;
        this.sapDataColumnDelimiter = null;
        this.sourceRetryCount = null;
        this.sourceRetryWait = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapTableSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object batchSize;
        private @Nullable Object customRfcReadTableFunctionModule;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object partitionOption;
        private @Nullable SapTablePartitionSettingsResponse partitionSettings;
        private @Nullable Object queryTimeout;
        private @Nullable Object rfcTableFields;
        private @Nullable Object rfcTableOptions;
        private @Nullable Object rowCount;
        private @Nullable Object rowSkips;
        private @Nullable Object sapDataColumnDelimiter;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SapTableSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.batchSize = defaults.batchSize;
    	      this.customRfcReadTableFunctionModule = defaults.customRfcReadTableFunctionModule;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.partitionOption = defaults.partitionOption;
    	      this.partitionSettings = defaults.partitionSettings;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.rfcTableFields = defaults.rfcTableFields;
    	      this.rfcTableOptions = defaults.rfcTableOptions;
    	      this.rowCount = defaults.rowCount;
    	      this.rowSkips = defaults.rowSkips;
    	      this.sapDataColumnDelimiter = defaults.sapDataColumnDelimiter;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder setAdditionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }

        public Builder setBatchSize(@Nullable Object batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        public Builder setCustomRfcReadTableFunctionModule(@Nullable Object customRfcReadTableFunctionModule) {
            this.customRfcReadTableFunctionModule = customRfcReadTableFunctionModule;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setPartitionOption(@Nullable Object partitionOption) {
            this.partitionOption = partitionOption;
            return this;
        }

        public Builder setPartitionSettings(@Nullable SapTablePartitionSettingsResponse partitionSettings) {
            this.partitionSettings = partitionSettings;
            return this;
        }

        public Builder setQueryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }

        public Builder setRfcTableFields(@Nullable Object rfcTableFields) {
            this.rfcTableFields = rfcTableFields;
            return this;
        }

        public Builder setRfcTableOptions(@Nullable Object rfcTableOptions) {
            this.rfcTableOptions = rfcTableOptions;
            return this;
        }

        public Builder setRowCount(@Nullable Object rowCount) {
            this.rowCount = rowCount;
            return this;
        }

        public Builder setRowSkips(@Nullable Object rowSkips) {
            this.rowSkips = rowSkips;
            return this;
        }

        public Builder setSapDataColumnDelimiter(@Nullable Object sapDataColumnDelimiter) {
            this.sapDataColumnDelimiter = sapDataColumnDelimiter;
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public SapTableSourceResponse build() {
            return new SapTableSourceResponse(additionalColumns, batchSize, customRfcReadTableFunctionModule, disableMetricsCollection, maxConcurrentConnections, partitionOption, partitionSettings, queryTimeout, rfcTableFields, rfcTableOptions, rowCount, rowSkips, sapDataColumnDelimiter, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
