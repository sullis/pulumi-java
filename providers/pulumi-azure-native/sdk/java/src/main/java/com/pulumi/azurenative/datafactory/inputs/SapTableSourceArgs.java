// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.SapTablePartitionSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity source for SAP Table source.
 * 
 */
public final class SapTableSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SapTableSourceArgs Empty = new SapTableSourceArgs();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @Import(name="additionalColumns")
    private @Nullable Output<Object> additionalColumns;

    /**
     * @return Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    public Optional<Output<Object>> additionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }

    /**
     * Specifies the maximum number of rows that will be retrieved at a time when retrieving data from SAP Table. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="batchSize")
    private @Nullable Output<Object> batchSize;

    /**
     * @return Specifies the maximum number of rows that will be retrieved at a time when retrieving data from SAP Table. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> batchSize() {
        return Optional.ofNullable(this.batchSize);
    }

    /**
     * Specifies the custom RFC function module that will be used to read data from SAP Table. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="customRfcReadTableFunctionModule")
    private @Nullable Output<Object> customRfcReadTableFunctionModule;

    /**
     * @return Specifies the custom RFC function module that will be used to read data from SAP Table. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> customRfcReadTableFunctionModule() {
        return Optional.ofNullable(this.customRfcReadTableFunctionModule);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
    private @Nullable Output<Object> disableMetricsCollection;

    /**
     * @return If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Output<Object> maxConcurrentConnections;

    /**
     * @return The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * The partition mechanism that will be used for SAP table read in parallel. Possible values include: &#34;None&#34;, &#34;PartitionOnInt&#34;, &#34;PartitionOnCalendarYear&#34;, &#34;PartitionOnCalendarMonth&#34;, &#34;PartitionOnCalendarDate&#34;, &#34;PartitionOnTime&#34;.
     * 
     */
    @Import(name="partitionOption")
    private @Nullable Output<Object> partitionOption;

    /**
     * @return The partition mechanism that will be used for SAP table read in parallel. Possible values include: &#34;None&#34;, &#34;PartitionOnInt&#34;, &#34;PartitionOnCalendarYear&#34;, &#34;PartitionOnCalendarMonth&#34;, &#34;PartitionOnCalendarDate&#34;, &#34;PartitionOnTime&#34;.
     * 
     */
    public Optional<Output<Object>> partitionOption() {
        return Optional.ofNullable(this.partitionOption);
    }

    /**
     * The settings that will be leveraged for SAP table source partitioning.
     * 
     */
    @Import(name="partitionSettings")
    private @Nullable Output<SapTablePartitionSettingsArgs> partitionSettings;

    /**
     * @return The settings that will be leveraged for SAP table source partitioning.
     * 
     */
    public Optional<Output<SapTablePartitionSettingsArgs>> partitionSettings() {
        return Optional.ofNullable(this.partitionSettings);
    }

    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="queryTimeout")
    private @Nullable Output<Object> queryTimeout;

    /**
     * @return Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> queryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }

    /**
     * The fields of the SAP table that will be retrieved. For example, column0, column1. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="rfcTableFields")
    private @Nullable Output<Object> rfcTableFields;

    /**
     * @return The fields of the SAP table that will be retrieved. For example, column0, column1. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> rfcTableFields() {
        return Optional.ofNullable(this.rfcTableFields);
    }

    /**
     * The options for the filtering of the SAP Table. For example, COLUMN0 EQ SOME VALUE. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="rfcTableOptions")
    private @Nullable Output<Object> rfcTableOptions;

    /**
     * @return The options for the filtering of the SAP Table. For example, COLUMN0 EQ SOME VALUE. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> rfcTableOptions() {
        return Optional.ofNullable(this.rfcTableOptions);
    }

    /**
     * The number of rows to be retrieved. Type: integer(or Expression with resultType integer).
     * 
     */
    @Import(name="rowCount")
    private @Nullable Output<Object> rowCount;

    /**
     * @return The number of rows to be retrieved. Type: integer(or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> rowCount() {
        return Optional.ofNullable(this.rowCount);
    }

    /**
     * The number of rows that will be skipped. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="rowSkips")
    private @Nullable Output<Object> rowSkips;

    /**
     * @return The number of rows that will be skipped. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> rowSkips() {
        return Optional.ofNullable(this.rowSkips);
    }

    /**
     * The single character that will be used as delimiter passed to SAP RFC as well as splitting the output data retrieved. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sapDataColumnDelimiter")
    private @Nullable Output<Object> sapDataColumnDelimiter;

    /**
     * @return The single character that will be used as delimiter passed to SAP RFC as well as splitting the output data retrieved. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> sapDataColumnDelimiter() {
        return Optional.ofNullable(this.sapDataColumnDelimiter);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
    private @Nullable Output<Object> sourceRetryCount;

    /**
     * @return Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> sourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
    private @Nullable Output<Object> sourceRetryWait;

    /**
     * @return Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> sourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * Copy source type.
     * Expected value is &#39;SapTableSource&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Copy source type.
     * Expected value is &#39;SapTableSource&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private SapTableSourceArgs() {}

    private SapTableSourceArgs(SapTableSourceArgs $) {
        this.additionalColumns = $.additionalColumns;
        this.batchSize = $.batchSize;
        this.customRfcReadTableFunctionModule = $.customRfcReadTableFunctionModule;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.partitionOption = $.partitionOption;
        this.partitionSettings = $.partitionSettings;
        this.queryTimeout = $.queryTimeout;
        this.rfcTableFields = $.rfcTableFields;
        this.rfcTableOptions = $.rfcTableOptions;
        this.rowCount = $.rowCount;
        this.rowSkips = $.rowSkips;
        this.sapDataColumnDelimiter = $.sapDataColumnDelimiter;
        this.sourceRetryCount = $.sourceRetryCount;
        this.sourceRetryWait = $.sourceRetryWait;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SapTableSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SapTableSourceArgs $;

        public Builder() {
            $ = new SapTableSourceArgs();
        }

        public Builder(SapTableSourceArgs defaults) {
            $ = new SapTableSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalColumns Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
         * 
         * @return builder
         * 
         */
        public Builder additionalColumns(@Nullable Output<Object> additionalColumns) {
            $.additionalColumns = additionalColumns;
            return this;
        }

        /**
         * @param additionalColumns Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
         * 
         * @return builder
         * 
         */
        public Builder additionalColumns(Object additionalColumns) {
            return additionalColumns(Output.of(additionalColumns));
        }

        /**
         * @param batchSize Specifies the maximum number of rows that will be retrieved at a time when retrieving data from SAP Table. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder batchSize(@Nullable Output<Object> batchSize) {
            $.batchSize = batchSize;
            return this;
        }

        /**
         * @param batchSize Specifies the maximum number of rows that will be retrieved at a time when retrieving data from SAP Table. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder batchSize(Object batchSize) {
            return batchSize(Output.of(batchSize));
        }

        /**
         * @param customRfcReadTableFunctionModule Specifies the custom RFC function module that will be used to read data from SAP Table. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder customRfcReadTableFunctionModule(@Nullable Output<Object> customRfcReadTableFunctionModule) {
            $.customRfcReadTableFunctionModule = customRfcReadTableFunctionModule;
            return this;
        }

        /**
         * @param customRfcReadTableFunctionModule Specifies the custom RFC function module that will be used to read data from SAP Table. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder customRfcReadTableFunctionModule(Object customRfcReadTableFunctionModule) {
            return customRfcReadTableFunctionModule(Output.of(customRfcReadTableFunctionModule));
        }

        /**
         * @param disableMetricsCollection If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        /**
         * @param disableMetricsCollection If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableMetricsCollection(Object disableMetricsCollection) {
            return disableMetricsCollection(Output.of(disableMetricsCollection));
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(Object maxConcurrentConnections) {
            return maxConcurrentConnections(Output.of(maxConcurrentConnections));
        }

        /**
         * @param partitionOption The partition mechanism that will be used for SAP table read in parallel. Possible values include: &#34;None&#34;, &#34;PartitionOnInt&#34;, &#34;PartitionOnCalendarYear&#34;, &#34;PartitionOnCalendarMonth&#34;, &#34;PartitionOnCalendarDate&#34;, &#34;PartitionOnTime&#34;.
         * 
         * @return builder
         * 
         */
        public Builder partitionOption(@Nullable Output<Object> partitionOption) {
            $.partitionOption = partitionOption;
            return this;
        }

        /**
         * @param partitionOption The partition mechanism that will be used for SAP table read in parallel. Possible values include: &#34;None&#34;, &#34;PartitionOnInt&#34;, &#34;PartitionOnCalendarYear&#34;, &#34;PartitionOnCalendarMonth&#34;, &#34;PartitionOnCalendarDate&#34;, &#34;PartitionOnTime&#34;.
         * 
         * @return builder
         * 
         */
        public Builder partitionOption(Object partitionOption) {
            return partitionOption(Output.of(partitionOption));
        }

        /**
         * @param partitionSettings The settings that will be leveraged for SAP table source partitioning.
         * 
         * @return builder
         * 
         */
        public Builder partitionSettings(@Nullable Output<SapTablePartitionSettingsArgs> partitionSettings) {
            $.partitionSettings = partitionSettings;
            return this;
        }

        /**
         * @param partitionSettings The settings that will be leveraged for SAP table source partitioning.
         * 
         * @return builder
         * 
         */
        public Builder partitionSettings(SapTablePartitionSettingsArgs partitionSettings) {
            return partitionSettings(Output.of(partitionSettings));
        }

        /**
         * @param queryTimeout Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder queryTimeout(@Nullable Output<Object> queryTimeout) {
            $.queryTimeout = queryTimeout;
            return this;
        }

        /**
         * @param queryTimeout Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder queryTimeout(Object queryTimeout) {
            return queryTimeout(Output.of(queryTimeout));
        }

        /**
         * @param rfcTableFields The fields of the SAP table that will be retrieved. For example, column0, column1. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder rfcTableFields(@Nullable Output<Object> rfcTableFields) {
            $.rfcTableFields = rfcTableFields;
            return this;
        }

        /**
         * @param rfcTableFields The fields of the SAP table that will be retrieved. For example, column0, column1. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder rfcTableFields(Object rfcTableFields) {
            return rfcTableFields(Output.of(rfcTableFields));
        }

        /**
         * @param rfcTableOptions The options for the filtering of the SAP Table. For example, COLUMN0 EQ SOME VALUE. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder rfcTableOptions(@Nullable Output<Object> rfcTableOptions) {
            $.rfcTableOptions = rfcTableOptions;
            return this;
        }

        /**
         * @param rfcTableOptions The options for the filtering of the SAP Table. For example, COLUMN0 EQ SOME VALUE. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder rfcTableOptions(Object rfcTableOptions) {
            return rfcTableOptions(Output.of(rfcTableOptions));
        }

        /**
         * @param rowCount The number of rows to be retrieved. Type: integer(or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder rowCount(@Nullable Output<Object> rowCount) {
            $.rowCount = rowCount;
            return this;
        }

        /**
         * @param rowCount The number of rows to be retrieved. Type: integer(or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder rowCount(Object rowCount) {
            return rowCount(Output.of(rowCount));
        }

        /**
         * @param rowSkips The number of rows that will be skipped. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder rowSkips(@Nullable Output<Object> rowSkips) {
            $.rowSkips = rowSkips;
            return this;
        }

        /**
         * @param rowSkips The number of rows that will be skipped. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder rowSkips(Object rowSkips) {
            return rowSkips(Output.of(rowSkips));
        }

        /**
         * @param sapDataColumnDelimiter The single character that will be used as delimiter passed to SAP RFC as well as splitting the output data retrieved. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sapDataColumnDelimiter(@Nullable Output<Object> sapDataColumnDelimiter) {
            $.sapDataColumnDelimiter = sapDataColumnDelimiter;
            return this;
        }

        /**
         * @param sapDataColumnDelimiter The single character that will be used as delimiter passed to SAP RFC as well as splitting the output data retrieved. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sapDataColumnDelimiter(Object sapDataColumnDelimiter) {
            return sapDataColumnDelimiter(Output.of(sapDataColumnDelimiter));
        }

        /**
         * @param sourceRetryCount Source retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryCount(@Nullable Output<Object> sourceRetryCount) {
            $.sourceRetryCount = sourceRetryCount;
            return this;
        }

        /**
         * @param sourceRetryCount Source retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryCount(Object sourceRetryCount) {
            return sourceRetryCount(Output.of(sourceRetryCount));
        }

        /**
         * @param sourceRetryWait Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryWait(@Nullable Output<Object> sourceRetryWait) {
            $.sourceRetryWait = sourceRetryWait;
            return this;
        }

        /**
         * @param sourceRetryWait Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryWait(Object sourceRetryWait) {
            return sourceRetryWait(Output.of(sourceRetryWait));
        }

        /**
         * @param type Copy source type.
         * Expected value is &#39;SapTableSource&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Copy source type.
         * Expected value is &#39;SapTableSource&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SapTableSourceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
