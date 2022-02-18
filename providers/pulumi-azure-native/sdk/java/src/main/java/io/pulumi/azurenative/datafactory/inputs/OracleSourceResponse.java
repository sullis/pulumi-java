// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.OraclePartitionSettingsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Oracle source.
 * 
 */
public final class OracleSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final OracleSourceResponse Empty = new OracleSourceResponse();

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
     * Oracle reader query. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="oracleReaderQuery")
    private final @Nullable Object oracleReaderQuery;

    public Optional<Object> getOracleReaderQuery() {
        return this.oracleReaderQuery == null ? Optional.empty() : Optional.ofNullable(this.oracleReaderQuery);
    }

    /**
     * The partition mechanism that will be used for Oracle read in parallel. Possible values include: "None", "PhysicalPartitionsOfTable", "DynamicRange".
     * 
     */
    @InputImport(name="partitionOption")
    private final @Nullable Object partitionOption;

    public Optional<Object> getPartitionOption() {
        return this.partitionOption == null ? Optional.empty() : Optional.ofNullable(this.partitionOption);
    }

    /**
     * The settings that will be leveraged for Oracle source partitioning.
     * 
     */
    @InputImport(name="partitionSettings")
    private final @Nullable OraclePartitionSettingsResponse partitionSettings;

    public Optional<OraclePartitionSettingsResponse> getPartitionSettings() {
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
     * Expected value is 'OracleSource'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public OracleSourceResponse(
        @Nullable Object additionalColumns,
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object oracleReaderQuery,
        @Nullable Object partitionOption,
        @Nullable OraclePartitionSettingsResponse partitionSettings,
        @Nullable Object queryTimeout,
        @Nullable Object sourceRetryCount,
        @Nullable Object sourceRetryWait,
        String type) {
        this.additionalColumns = additionalColumns;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.oracleReaderQuery = oracleReaderQuery;
        this.partitionOption = partitionOption;
        this.partitionSettings = partitionSettings;
        this.queryTimeout = queryTimeout;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private OracleSourceResponse() {
        this.additionalColumns = null;
        this.disableMetricsCollection = null;
        this.maxConcurrentConnections = null;
        this.oracleReaderQuery = null;
        this.partitionOption = null;
        this.partitionSettings = null;
        this.queryTimeout = null;
        this.sourceRetryCount = null;
        this.sourceRetryWait = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object oracleReaderQuery;
        private @Nullable Object partitionOption;
        private @Nullable OraclePartitionSettingsResponse partitionSettings;
        private @Nullable Object queryTimeout;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.oracleReaderQuery = defaults.oracleReaderQuery;
    	      this.partitionOption = defaults.partitionOption;
    	      this.partitionSettings = defaults.partitionSettings;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder setAdditionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = additionalColumns;
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

        public Builder setOracleReaderQuery(@Nullable Object oracleReaderQuery) {
            this.oracleReaderQuery = oracleReaderQuery;
            return this;
        }

        public Builder setPartitionOption(@Nullable Object partitionOption) {
            this.partitionOption = partitionOption;
            return this;
        }

        public Builder setPartitionSettings(@Nullable OraclePartitionSettingsResponse partitionSettings) {
            this.partitionSettings = partitionSettings;
            return this;
        }

        public Builder setQueryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = queryTimeout;
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

        public OracleSourceResponse build() {
            return new OracleSourceResponse(additionalColumns, disableMetricsCollection, maxConcurrentConnections, oracleReaderQuery, partitionOption, partitionSettings, queryTimeout, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
