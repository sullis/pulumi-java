// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DWCopyCommandSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.PolybaseSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.SqlDWUpsertSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity SQL Data Warehouse sink.
 * 
 */
public final class SqlDWSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlDWSinkArgs Empty = new SqlDWSinkArgs();

    /**
     * Indicates to use Copy Command to copy data into SQL Data Warehouse. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="allowCopyCommand")
    private final @Nullable Input<Object> allowCopyCommand;

    public Input<Object> getAllowCopyCommand() {
        return this.allowCopyCommand == null ? Input.empty() : this.allowCopyCommand;
    }

    /**
     * Indicates to use PolyBase to copy data into SQL Data Warehouse when applicable. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="allowPolyBase")
    private final @Nullable Input<Object> allowPolyBase;

    public Input<Object> getAllowPolyBase() {
        return this.allowPolyBase == null ? Input.empty() : this.allowPolyBase;
    }

    /**
     * Specifies Copy Command related settings when allowCopyCommand is true.
     * 
     */
    @InputImport(name="copyCommandSettings")
    private final @Nullable Input<DWCopyCommandSettingsArgs> copyCommandSettings;

    public Input<DWCopyCommandSettingsArgs> getCopyCommandSettings() {
        return this.copyCommandSettings == null ? Input.empty() : this.copyCommandSettings;
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
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
    private final @Nullable Input<Object> maxConcurrentConnections;

    public Input<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Input.empty() : this.maxConcurrentConnections;
    }

    /**
     * Specifies PolyBase-related settings when allowPolyBase is true.
     * 
     */
    @InputImport(name="polyBaseSettings")
    private final @Nullable Input<PolybaseSettingsArgs> polyBaseSettings;

    public Input<PolybaseSettingsArgs> getPolyBaseSettings() {
        return this.polyBaseSettings == null ? Input.empty() : this.polyBaseSettings;
    }

    /**
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="preCopyScript")
    private final @Nullable Input<Object> preCopyScript;

    public Input<Object> getPreCopyScript() {
        return this.preCopyScript == null ? Input.empty() : this.preCopyScript;
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sinkRetryCount")
    private final @Nullable Input<Object> sinkRetryCount;

    public Input<Object> getSinkRetryCount() {
        return this.sinkRetryCount == null ? Input.empty() : this.sinkRetryCount;
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sinkRetryWait")
    private final @Nullable Input<Object> sinkRetryWait;

    public Input<Object> getSinkRetryWait() {
        return this.sinkRetryWait == null ? Input.empty() : this.sinkRetryWait;
    }

    /**
     * Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="sqlWriterUseTableLock")
    private final @Nullable Input<Object> sqlWriterUseTableLock;

    public Input<Object> getSqlWriterUseTableLock() {
        return this.sqlWriterUseTableLock == null ? Input.empty() : this.sqlWriterUseTableLock;
    }

    /**
     * The option to handle sink table, such as autoCreate. For now only 'autoCreate' value is supported. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="tableOption")
    private final @Nullable Input<Object> tableOption;

    public Input<Object> getTableOption() {
        return this.tableOption == null ? Input.empty() : this.tableOption;
    }

    /**
     * Copy sink type.
     * Expected value is 'SqlDWSink'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * SQL DW upsert settings.
     * 
     */
    @InputImport(name="upsertSettings")
    private final @Nullable Input<SqlDWUpsertSettingsArgs> upsertSettings;

    public Input<SqlDWUpsertSettingsArgs> getUpsertSettings() {
        return this.upsertSettings == null ? Input.empty() : this.upsertSettings;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @InputImport(name="writeBatchSize")
    private final @Nullable Input<Object> writeBatchSize;

    public Input<Object> getWriteBatchSize() {
        return this.writeBatchSize == null ? Input.empty() : this.writeBatchSize;
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="writeBatchTimeout")
    private final @Nullable Input<Object> writeBatchTimeout;

    public Input<Object> getWriteBatchTimeout() {
        return this.writeBatchTimeout == null ? Input.empty() : this.writeBatchTimeout;
    }

    /**
     * Write behavior when copying data into azure SQL DW. Type: SqlDWWriteBehaviorEnum (or Expression with resultType SqlDWWriteBehaviorEnum)
     * 
     */
    @InputImport(name="writeBehavior")
    private final @Nullable Input<Object> writeBehavior;

    public Input<Object> getWriteBehavior() {
        return this.writeBehavior == null ? Input.empty() : this.writeBehavior;
    }

    public SqlDWSinkArgs(
        @Nullable Input<Object> allowCopyCommand,
        @Nullable Input<Object> allowPolyBase,
        @Nullable Input<DWCopyCommandSettingsArgs> copyCommandSettings,
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<PolybaseSettingsArgs> polyBaseSettings,
        @Nullable Input<Object> preCopyScript,
        @Nullable Input<Object> sinkRetryCount,
        @Nullable Input<Object> sinkRetryWait,
        @Nullable Input<Object> sqlWriterUseTableLock,
        @Nullable Input<Object> tableOption,
        Input<String> type,
        @Nullable Input<SqlDWUpsertSettingsArgs> upsertSettings,
        @Nullable Input<Object> writeBatchSize,
        @Nullable Input<Object> writeBatchTimeout,
        @Nullable Input<Object> writeBehavior) {
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
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.upsertSettings = upsertSettings;
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
        this.writeBehavior = writeBehavior;
    }

    private SqlDWSinkArgs() {
        this.allowCopyCommand = Input.empty();
        this.allowPolyBase = Input.empty();
        this.copyCommandSettings = Input.empty();
        this.disableMetricsCollection = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.polyBaseSettings = Input.empty();
        this.preCopyScript = Input.empty();
        this.sinkRetryCount = Input.empty();
        this.sinkRetryWait = Input.empty();
        this.sqlWriterUseTableLock = Input.empty();
        this.tableOption = Input.empty();
        this.type = Input.empty();
        this.upsertSettings = Input.empty();
        this.writeBatchSize = Input.empty();
        this.writeBatchTimeout = Input.empty();
        this.writeBehavior = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlDWSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> allowCopyCommand;
        private @Nullable Input<Object> allowPolyBase;
        private @Nullable Input<DWCopyCommandSettingsArgs> copyCommandSettings;
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<PolybaseSettingsArgs> polyBaseSettings;
        private @Nullable Input<Object> preCopyScript;
        private @Nullable Input<Object> sinkRetryCount;
        private @Nullable Input<Object> sinkRetryWait;
        private @Nullable Input<Object> sqlWriterUseTableLock;
        private @Nullable Input<Object> tableOption;
        private Input<String> type;
        private @Nullable Input<SqlDWUpsertSettingsArgs> upsertSettings;
        private @Nullable Input<Object> writeBatchSize;
        private @Nullable Input<Object> writeBatchTimeout;
        private @Nullable Input<Object> writeBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlDWSinkArgs defaults) {
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

        public Builder setAllowCopyCommand(@Nullable Input<Object> allowCopyCommand) {
            this.allowCopyCommand = allowCopyCommand;
            return this;
        }

        public Builder setAllowCopyCommand(@Nullable Object allowCopyCommand) {
            this.allowCopyCommand = Input.ofNullable(allowCopyCommand);
            return this;
        }

        public Builder setAllowPolyBase(@Nullable Input<Object> allowPolyBase) {
            this.allowPolyBase = allowPolyBase;
            return this;
        }

        public Builder setAllowPolyBase(@Nullable Object allowPolyBase) {
            this.allowPolyBase = Input.ofNullable(allowPolyBase);
            return this;
        }

        public Builder setCopyCommandSettings(@Nullable Input<DWCopyCommandSettingsArgs> copyCommandSettings) {
            this.copyCommandSettings = copyCommandSettings;
            return this;
        }

        public Builder setCopyCommandSettings(@Nullable DWCopyCommandSettingsArgs copyCommandSettings) {
            this.copyCommandSettings = Input.ofNullable(copyCommandSettings);
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

        public Builder setPolyBaseSettings(@Nullable Input<PolybaseSettingsArgs> polyBaseSettings) {
            this.polyBaseSettings = polyBaseSettings;
            return this;
        }

        public Builder setPolyBaseSettings(@Nullable PolybaseSettingsArgs polyBaseSettings) {
            this.polyBaseSettings = Input.ofNullable(polyBaseSettings);
            return this;
        }

        public Builder setPreCopyScript(@Nullable Input<Object> preCopyScript) {
            this.preCopyScript = preCopyScript;
            return this;
        }

        public Builder setPreCopyScript(@Nullable Object preCopyScript) {
            this.preCopyScript = Input.ofNullable(preCopyScript);
            return this;
        }

        public Builder setSinkRetryCount(@Nullable Input<Object> sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder setSinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = Input.ofNullable(sinkRetryCount);
            return this;
        }

        public Builder setSinkRetryWait(@Nullable Input<Object> sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder setSinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = Input.ofNullable(sinkRetryWait);
            return this;
        }

        public Builder setSqlWriterUseTableLock(@Nullable Input<Object> sqlWriterUseTableLock) {
            this.sqlWriterUseTableLock = sqlWriterUseTableLock;
            return this;
        }

        public Builder setSqlWriterUseTableLock(@Nullable Object sqlWriterUseTableLock) {
            this.sqlWriterUseTableLock = Input.ofNullable(sqlWriterUseTableLock);
            return this;
        }

        public Builder setTableOption(@Nullable Input<Object> tableOption) {
            this.tableOption = tableOption;
            return this;
        }

        public Builder setTableOption(@Nullable Object tableOption) {
            this.tableOption = Input.ofNullable(tableOption);
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

        public Builder setUpsertSettings(@Nullable Input<SqlDWUpsertSettingsArgs> upsertSettings) {
            this.upsertSettings = upsertSettings;
            return this;
        }

        public Builder setUpsertSettings(@Nullable SqlDWUpsertSettingsArgs upsertSettings) {
            this.upsertSettings = Input.ofNullable(upsertSettings);
            return this;
        }

        public Builder setWriteBatchSize(@Nullable Input<Object> writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder setWriteBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = Input.ofNullable(writeBatchSize);
            return this;
        }

        public Builder setWriteBatchTimeout(@Nullable Input<Object> writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        public Builder setWriteBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = Input.ofNullable(writeBatchTimeout);
            return this;
        }

        public Builder setWriteBehavior(@Nullable Input<Object> writeBehavior) {
            this.writeBehavior = writeBehavior;
            return this;
        }

        public Builder setWriteBehavior(@Nullable Object writeBehavior) {
            this.writeBehavior = Input.ofNullable(writeBehavior);
            return this;
        }

        public SqlDWSinkArgs build() {
            return new SqlDWSinkArgs(allowCopyCommand, allowPolyBase, copyCommandSettings, disableMetricsCollection, maxConcurrentConnections, polyBaseSettings, preCopyScript, sinkRetryCount, sinkRetryWait, sqlWriterUseTableLock, tableOption, type, upsertSettings, writeBatchSize, writeBatchTimeout, writeBehavior);
        }
    }
}
