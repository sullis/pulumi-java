// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.SqlUpsertSettingsResponse;
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
 * A copy activity SQL server sink.
 * 
 */
public final class SqlServerSinkResponse extends com.pulumi.resources.InvokeArgs {

    public static final SqlServerSinkResponse Empty = new SqlServerSinkResponse();

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
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Object maxConcurrentConnections;

    /**
     * @return The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="preCopyScript")
    private @Nullable Object preCopyScript;

    /**
     * @return SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> preCopyScript() {
        return Optional.ofNullable(this.preCopyScript);
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
    private @Nullable Object sinkRetryCount;

    /**
     * @return Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> sinkRetryCount() {
        return Optional.ofNullable(this.sinkRetryCount);
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
    private @Nullable Object sinkRetryWait;

    /**
     * @return Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Object> sinkRetryWait() {
        return Optional.ofNullable(this.sinkRetryWait);
    }

    /**
     * SQL writer stored procedure name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sqlWriterStoredProcedureName")
    private @Nullable Object sqlWriterStoredProcedureName;

    /**
     * @return SQL writer stored procedure name. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> sqlWriterStoredProcedureName() {
        return Optional.ofNullable(this.sqlWriterStoredProcedureName);
    }

    /**
     * SQL writer table type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sqlWriterTableType")
    private @Nullable Object sqlWriterTableType;

    /**
     * @return SQL writer table type. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> sqlWriterTableType() {
        return Optional.ofNullable(this.sqlWriterTableType);
    }

    /**
     * Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="sqlWriterUseTableLock")
    private @Nullable Object sqlWriterUseTableLock;

    /**
     * @return Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> sqlWriterUseTableLock() {
        return Optional.ofNullable(this.sqlWriterUseTableLock);
    }

    /**
     * SQL stored procedure parameters.
     * 
     */
    @Import(name="storedProcedureParameters")
    private @Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters;

    /**
     * @return SQL stored procedure parameters.
     * 
     */
    public Optional<Map<String,StoredProcedureParameterResponse>> storedProcedureParameters() {
        return Optional.ofNullable(this.storedProcedureParameters);
    }

    /**
     * The stored procedure parameter name of the table type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="storedProcedureTableTypeParameterName")
    private @Nullable Object storedProcedureTableTypeParameterName;

    /**
     * @return The stored procedure parameter name of the table type. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> storedProcedureTableTypeParameterName() {
        return Optional.ofNullable(this.storedProcedureTableTypeParameterName);
    }

    /**
     * The option to handle sink table, such as autoCreate. For now only &#39;autoCreate&#39; value is supported. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tableOption")
    private @Nullable Object tableOption;

    /**
     * @return The option to handle sink table, such as autoCreate. For now only &#39;autoCreate&#39; value is supported. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> tableOption() {
        return Optional.ofNullable(this.tableOption);
    }

    /**
     * Copy sink type.
     * Expected value is &#39;SqlServerSink&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Copy sink type.
     * Expected value is &#39;SqlServerSink&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * SQL upsert settings.
     * 
     */
    @Import(name="upsertSettings")
    private @Nullable SqlUpsertSettingsResponse upsertSettings;

    /**
     * @return SQL upsert settings.
     * 
     */
    public Optional<SqlUpsertSettingsResponse> upsertSettings() {
        return Optional.ofNullable(this.upsertSettings);
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
    private @Nullable Object writeBatchSize;

    /**
     * @return Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    public Optional<Object> writeBatchSize() {
        return Optional.ofNullable(this.writeBatchSize);
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
    private @Nullable Object writeBatchTimeout;

    /**
     * @return Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Object> writeBatchTimeout() {
        return Optional.ofNullable(this.writeBatchTimeout);
    }

    /**
     * Write behavior when copying data into sql server. Type: SqlWriteBehaviorEnum (or Expression with resultType SqlWriteBehaviorEnum)
     * 
     */
    @Import(name="writeBehavior")
    private @Nullable Object writeBehavior;

    /**
     * @return Write behavior when copying data into sql server. Type: SqlWriteBehaviorEnum (or Expression with resultType SqlWriteBehaviorEnum)
     * 
     */
    public Optional<Object> writeBehavior() {
        return Optional.ofNullable(this.writeBehavior);
    }

    private SqlServerSinkResponse() {}

    private SqlServerSinkResponse(SqlServerSinkResponse $) {
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.preCopyScript = $.preCopyScript;
        this.sinkRetryCount = $.sinkRetryCount;
        this.sinkRetryWait = $.sinkRetryWait;
        this.sqlWriterStoredProcedureName = $.sqlWriterStoredProcedureName;
        this.sqlWriterTableType = $.sqlWriterTableType;
        this.sqlWriterUseTableLock = $.sqlWriterUseTableLock;
        this.storedProcedureParameters = $.storedProcedureParameters;
        this.storedProcedureTableTypeParameterName = $.storedProcedureTableTypeParameterName;
        this.tableOption = $.tableOption;
        this.type = $.type;
        this.upsertSettings = $.upsertSettings;
        this.writeBatchSize = $.writeBatchSize;
        this.writeBatchTimeout = $.writeBatchTimeout;
        this.writeBehavior = $.writeBehavior;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlServerSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlServerSinkResponse $;

        public Builder() {
            $ = new SqlServerSinkResponse();
        }

        public Builder(SqlServerSinkResponse defaults) {
            $ = new SqlServerSinkResponse(Objects.requireNonNull(defaults));
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
         * @param maxConcurrentConnections The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        /**
         * @param preCopyScript SQL pre-copy script. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder preCopyScript(@Nullable Object preCopyScript) {
            $.preCopyScript = preCopyScript;
            return this;
        }

        /**
         * @param sinkRetryCount Sink retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sinkRetryCount(@Nullable Object sinkRetryCount) {
            $.sinkRetryCount = sinkRetryCount;
            return this;
        }

        /**
         * @param sinkRetryWait Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sinkRetryWait(@Nullable Object sinkRetryWait) {
            $.sinkRetryWait = sinkRetryWait;
            return this;
        }

        /**
         * @param sqlWriterStoredProcedureName SQL writer stored procedure name. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sqlWriterStoredProcedureName(@Nullable Object sqlWriterStoredProcedureName) {
            $.sqlWriterStoredProcedureName = sqlWriterStoredProcedureName;
            return this;
        }

        /**
         * @param sqlWriterTableType SQL writer table type. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sqlWriterTableType(@Nullable Object sqlWriterTableType) {
            $.sqlWriterTableType = sqlWriterTableType;
            return this;
        }

        /**
         * @param sqlWriterUseTableLock Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder sqlWriterUseTableLock(@Nullable Object sqlWriterUseTableLock) {
            $.sqlWriterUseTableLock = sqlWriterUseTableLock;
            return this;
        }

        /**
         * @param storedProcedureParameters SQL stored procedure parameters.
         * 
         * @return builder
         * 
         */
        public Builder storedProcedureParameters(@Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters) {
            $.storedProcedureParameters = storedProcedureParameters;
            return this;
        }

        /**
         * @param storedProcedureTableTypeParameterName The stored procedure parameter name of the table type. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder storedProcedureTableTypeParameterName(@Nullable Object storedProcedureTableTypeParameterName) {
            $.storedProcedureTableTypeParameterName = storedProcedureTableTypeParameterName;
            return this;
        }

        /**
         * @param tableOption The option to handle sink table, such as autoCreate. For now only &#39;autoCreate&#39; value is supported. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder tableOption(@Nullable Object tableOption) {
            $.tableOption = tableOption;
            return this;
        }

        /**
         * @param type Copy sink type.
         * Expected value is &#39;SqlServerSink&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param upsertSettings SQL upsert settings.
         * 
         * @return builder
         * 
         */
        public Builder upsertSettings(@Nullable SqlUpsertSettingsResponse upsertSettings) {
            $.upsertSettings = upsertSettings;
            return this;
        }

        /**
         * @param writeBatchSize Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
         * 
         * @return builder
         * 
         */
        public Builder writeBatchSize(@Nullable Object writeBatchSize) {
            $.writeBatchSize = writeBatchSize;
            return this;
        }

        /**
         * @param writeBatchTimeout Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder writeBatchTimeout(@Nullable Object writeBatchTimeout) {
            $.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        /**
         * @param writeBehavior Write behavior when copying data into sql server. Type: SqlWriteBehaviorEnum (or Expression with resultType SqlWriteBehaviorEnum)
         * 
         * @return builder
         * 
         */
        public Builder writeBehavior(@Nullable Object writeBehavior) {
            $.writeBehavior = writeBehavior;
            return this;
        }

        public SqlServerSinkResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
