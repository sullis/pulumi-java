// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.DWCopyCommandSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.PolybaseSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlDWUpsertSettingsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SqlDWSinkResponse {
    /**
     * Indicates to use Copy Command to copy data into SQL Data Warehouse. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object allowCopyCommand;
    /**
     * Indicates to use PolyBase to copy data into SQL Data Warehouse when applicable. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object allowPolyBase;
    /**
     * Specifies Copy Command related settings when allowCopyCommand is true.
     * 
     */
    private final @Nullable DWCopyCommandSettingsResponse copyCommandSettings;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * Specifies PolyBase-related settings when allowPolyBase is true.
     * 
     */
    private final @Nullable PolybaseSettingsResponse polyBaseSettings;
    /**
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object preCopyScript;
    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object sinkRetryCount;
    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object sinkRetryWait;
    /**
     * Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object sqlWriterUseTableLock;
    /**
     * The option to handle sink table, such as autoCreate. For now only 'autoCreate' value is supported. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object tableOption;
    /**
     * Copy sink type.
     * Expected value is 'SqlDWSink'.
     * 
     */
    private final String type;
    /**
     * SQL DW upsert settings.
     * 
     */
    private final @Nullable SqlDWUpsertSettingsResponse upsertSettings;
    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    private final @Nullable Object writeBatchSize;
    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object writeBatchTimeout;
    /**
     * Write behavior when copying data into azure SQL DW. Type: SqlDWWriteBehaviorEnum (or Expression with resultType SqlDWWriteBehaviorEnum)
     * 
     */
    private final @Nullable Object writeBehavior;

    @OutputCustomType.Constructor({"allowCopyCommand","allowPolyBase","copyCommandSettings","disableMetricsCollection","maxConcurrentConnections","polyBaseSettings","preCopyScript","sinkRetryCount","sinkRetryWait","sqlWriterUseTableLock","tableOption","type","upsertSettings","writeBatchSize","writeBatchTimeout","writeBehavior"})
    private SqlDWSinkResponse(
        @Nullable Object allowCopyCommand,
        @Nullable Object allowPolyBase,
        @Nullable DWCopyCommandSettingsResponse copyCommandSettings,
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        @Nullable PolybaseSettingsResponse polyBaseSettings,
        @Nullable Object preCopyScript,
        @Nullable Object sinkRetryCount,
        @Nullable Object sinkRetryWait,
        @Nullable Object sqlWriterUseTableLock,
        @Nullable Object tableOption,
        String type,
        @Nullable SqlDWUpsertSettingsResponse upsertSettings,
        @Nullable Object writeBatchSize,
        @Nullable Object writeBatchTimeout,
        @Nullable Object writeBehavior) {
        this.allowCopyCommand = allowCopyCommand;
        this.allowPolyBase = allowPolyBase;
        this.copyCommandSettings = copyCommandSettings;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.polyBaseSettings = polyBaseSettings;
        this.preCopyScript = preCopyScript;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.sqlWriterUseTableLock = sqlWriterUseTableLock;
        this.tableOption = tableOption;
        this.type = Objects.requireNonNull(type);
        this.upsertSettings = upsertSettings;
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
        this.writeBehavior = writeBehavior;
    }

    /**
     * Indicates to use Copy Command to copy data into SQL Data Warehouse. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> getAllowCopyCommand() {
        return Optional.ofNullable(this.allowCopyCommand);
    }
    /**
     * Indicates to use PolyBase to copy data into SQL Data Warehouse when applicable. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> getAllowPolyBase() {
        return Optional.ofNullable(this.allowPolyBase);
    }
    /**
     * Specifies Copy Command related settings when allowCopyCommand is true.
     * 
     */
    public Optional<DWCopyCommandSettingsResponse> getCopyCommandSettings() {
        return Optional.ofNullable(this.copyCommandSettings);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * Specifies PolyBase-related settings when allowPolyBase is true.
     * 
     */
    public Optional<PolybaseSettingsResponse> getPolyBaseSettings() {
        return Optional.ofNullable(this.polyBaseSettings);
    }
    /**
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getPreCopyScript() {
        return Optional.ofNullable(this.preCopyScript);
    }
    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> getSinkRetryCount() {
        return Optional.ofNullable(this.sinkRetryCount);
    }
    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Object> getSinkRetryWait() {
        return Optional.ofNullable(this.sinkRetryWait);
    }
    /**
     * Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> getSqlWriterUseTableLock() {
        return Optional.ofNullable(this.sqlWriterUseTableLock);
    }
    /**
     * The option to handle sink table, such as autoCreate. For now only 'autoCreate' value is supported. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getTableOption() {
        return Optional.ofNullable(this.tableOption);
    }
    /**
     * Copy sink type.
     * Expected value is 'SqlDWSink'.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * SQL DW upsert settings.
     * 
     */
    public Optional<SqlDWUpsertSettingsResponse> getUpsertSettings() {
        return Optional.ofNullable(this.upsertSettings);
    }
    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    public Optional<Object> getWriteBatchSize() {
        return Optional.ofNullable(this.writeBatchSize);
    }
    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Object> getWriteBatchTimeout() {
        return Optional.ofNullable(this.writeBatchTimeout);
    }
    /**
     * Write behavior when copying data into azure SQL DW. Type: SqlDWWriteBehaviorEnum (or Expression with resultType SqlDWWriteBehaviorEnum)
     * 
     */
    public Optional<Object> getWriteBehavior() {
        return Optional.ofNullable(this.writeBehavior);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlDWSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object allowCopyCommand;
        private @Nullable Object allowPolyBase;
        private @Nullable DWCopyCommandSettingsResponse copyCommandSettings;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable PolybaseSettingsResponse polyBaseSettings;
        private @Nullable Object preCopyScript;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private @Nullable Object sqlWriterUseTableLock;
        private @Nullable Object tableOption;
        private String type;
        private @Nullable SqlDWUpsertSettingsResponse upsertSettings;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;
        private @Nullable Object writeBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlDWSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCopyCommand = defaults.allowCopyCommand;
    	      this.allowPolyBase = defaults.allowPolyBase;
    	      this.copyCommandSettings = defaults.copyCommandSettings;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.polyBaseSettings = defaults.polyBaseSettings;
    	      this.preCopyScript = defaults.preCopyScript;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.sqlWriterUseTableLock = defaults.sqlWriterUseTableLock;
    	      this.tableOption = defaults.tableOption;
    	      this.type = defaults.type;
    	      this.upsertSettings = defaults.upsertSettings;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
    	      this.writeBehavior = defaults.writeBehavior;
        }

        public Builder setAllowCopyCommand(@Nullable Object allowCopyCommand) {
            this.allowCopyCommand = allowCopyCommand;
            return this;
        }

        public Builder setAllowPolyBase(@Nullable Object allowPolyBase) {
            this.allowPolyBase = allowPolyBase;
            return this;
        }

        public Builder setCopyCommandSettings(@Nullable DWCopyCommandSettingsResponse copyCommandSettings) {
            this.copyCommandSettings = copyCommandSettings;
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

        public Builder setPolyBaseSettings(@Nullable PolybaseSettingsResponse polyBaseSettings) {
            this.polyBaseSettings = polyBaseSettings;
            return this;
        }

        public Builder setPreCopyScript(@Nullable Object preCopyScript) {
            this.preCopyScript = preCopyScript;
            return this;
        }

        public Builder setSinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder setSinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder setSqlWriterUseTableLock(@Nullable Object sqlWriterUseTableLock) {
            this.sqlWriterUseTableLock = sqlWriterUseTableLock;
            return this;
        }

        public Builder setTableOption(@Nullable Object tableOption) {
            this.tableOption = tableOption;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUpsertSettings(@Nullable SqlDWUpsertSettingsResponse upsertSettings) {
            this.upsertSettings = upsertSettings;
            return this;
        }

        public Builder setWriteBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder setWriteBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        public Builder setWriteBehavior(@Nullable Object writeBehavior) {
            this.writeBehavior = writeBehavior;
            return this;
        }

        public SqlDWSinkResponse build() {
            return new SqlDWSinkResponse(allowCopyCommand, allowPolyBase, copyCommandSettings, disableMetricsCollection, maxConcurrentConnections, polyBaseSettings, preCopyScript, sinkRetryCount, sinkRetryWait, sqlWriterUseTableLock, tableOption, type, upsertSettings, writeBatchSize, writeBatchTimeout, writeBehavior);
        }
    }
}
