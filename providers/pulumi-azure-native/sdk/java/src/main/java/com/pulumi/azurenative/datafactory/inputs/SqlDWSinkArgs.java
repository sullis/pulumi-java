// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.DWCopyCommandSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.PolybaseSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.SqlDWUpsertSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity SQL Data Warehouse sink.
 * 
 */
public final class SqlDWSinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlDWSinkArgs Empty = new SqlDWSinkArgs();

    /**
     * Indicates to use Copy Command to copy data into SQL Data Warehouse. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="allowCopyCommand")
    private @Nullable Output<Object> allowCopyCommand;

    /**
     * @return Indicates to use Copy Command to copy data into SQL Data Warehouse. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> allowCopyCommand() {
        return Optional.ofNullable(this.allowCopyCommand);
    }

    /**
     * Indicates to use PolyBase to copy data into SQL Data Warehouse when applicable. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="allowPolyBase")
    private @Nullable Output<Object> allowPolyBase;

    /**
     * @return Indicates to use PolyBase to copy data into SQL Data Warehouse when applicable. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> allowPolyBase() {
        return Optional.ofNullable(this.allowPolyBase);
    }

    /**
     * Specifies Copy Command related settings when allowCopyCommand is true.
     * 
     */
    @Import(name="copyCommandSettings")
    private @Nullable Output<DWCopyCommandSettingsArgs> copyCommandSettings;

    /**
     * @return Specifies Copy Command related settings when allowCopyCommand is true.
     * 
     */
    public Optional<Output<DWCopyCommandSettingsArgs>> copyCommandSettings() {
        return Optional.ofNullable(this.copyCommandSettings);
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
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Output<Object> maxConcurrentConnections;

    /**
     * @return The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Specifies PolyBase-related settings when allowPolyBase is true.
     * 
     */
    @Import(name="polyBaseSettings")
    private @Nullable Output<PolybaseSettingsArgs> polyBaseSettings;

    /**
     * @return Specifies PolyBase-related settings when allowPolyBase is true.
     * 
     */
    public Optional<Output<PolybaseSettingsArgs>> polyBaseSettings() {
        return Optional.ofNullable(this.polyBaseSettings);
    }

    /**
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="preCopyScript")
    private @Nullable Output<Object> preCopyScript;

    /**
     * @return SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> preCopyScript() {
        return Optional.ofNullable(this.preCopyScript);
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
    private @Nullable Output<Object> sinkRetryCount;

    /**
     * @return Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> sinkRetryCount() {
        return Optional.ofNullable(this.sinkRetryCount);
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
    private @Nullable Output<Object> sinkRetryWait;

    /**
     * @return Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> sinkRetryWait() {
        return Optional.ofNullable(this.sinkRetryWait);
    }

    /**
     * Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="sqlWriterUseTableLock")
    private @Nullable Output<Object> sqlWriterUseTableLock;

    /**
     * @return Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> sqlWriterUseTableLock() {
        return Optional.ofNullable(this.sqlWriterUseTableLock);
    }

    /**
     * The option to handle sink table, such as autoCreate. For now only &#39;autoCreate&#39; value is supported. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tableOption")
    private @Nullable Output<Object> tableOption;

    /**
     * @return The option to handle sink table, such as autoCreate. For now only &#39;autoCreate&#39; value is supported. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> tableOption() {
        return Optional.ofNullable(this.tableOption);
    }

    /**
     * Copy sink type.
     * Expected value is &#39;SqlDWSink&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Copy sink type.
     * Expected value is &#39;SqlDWSink&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * SQL DW upsert settings.
     * 
     */
    @Import(name="upsertSettings")
    private @Nullable Output<SqlDWUpsertSettingsArgs> upsertSettings;

    /**
     * @return SQL DW upsert settings.
     * 
     */
    public Optional<Output<SqlDWUpsertSettingsArgs>> upsertSettings() {
        return Optional.ofNullable(this.upsertSettings);
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
    private @Nullable Output<Object> writeBatchSize;

    /**
     * @return Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    public Optional<Output<Object>> writeBatchSize() {
        return Optional.ofNullable(this.writeBatchSize);
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
    private @Nullable Output<Object> writeBatchTimeout;

    /**
     * @return Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> writeBatchTimeout() {
        return Optional.ofNullable(this.writeBatchTimeout);
    }

    /**
     * Write behavior when copying data into azure SQL DW. Type: SqlDWWriteBehaviorEnum (or Expression with resultType SqlDWWriteBehaviorEnum)
     * 
     */
    @Import(name="writeBehavior")
    private @Nullable Output<Object> writeBehavior;

    /**
     * @return Write behavior when copying data into azure SQL DW. Type: SqlDWWriteBehaviorEnum (or Expression with resultType SqlDWWriteBehaviorEnum)
     * 
     */
    public Optional<Output<Object>> writeBehavior() {
        return Optional.ofNullable(this.writeBehavior);
    }

    private SqlDWSinkArgs() {}

    private SqlDWSinkArgs(SqlDWSinkArgs $) {
        this.allowCopyCommand = $.allowCopyCommand;
        this.allowPolyBase = $.allowPolyBase;
        this.copyCommandSettings = $.copyCommandSettings;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.polyBaseSettings = $.polyBaseSettings;
        this.preCopyScript = $.preCopyScript;
        this.sinkRetryCount = $.sinkRetryCount;
        this.sinkRetryWait = $.sinkRetryWait;
        this.sqlWriterUseTableLock = $.sqlWriterUseTableLock;
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
    public static Builder builder(SqlDWSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlDWSinkArgs $;

        public Builder() {
            $ = new SqlDWSinkArgs();
        }

        public Builder(SqlDWSinkArgs defaults) {
            $ = new SqlDWSinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowCopyCommand Indicates to use Copy Command to copy data into SQL Data Warehouse. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder allowCopyCommand(@Nullable Output<Object> allowCopyCommand) {
            $.allowCopyCommand = allowCopyCommand;
            return this;
        }

        /**
         * @param allowCopyCommand Indicates to use Copy Command to copy data into SQL Data Warehouse. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder allowCopyCommand(Object allowCopyCommand) {
            return allowCopyCommand(Output.of(allowCopyCommand));
        }

        /**
         * @param allowPolyBase Indicates to use PolyBase to copy data into SQL Data Warehouse when applicable. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder allowPolyBase(@Nullable Output<Object> allowPolyBase) {
            $.allowPolyBase = allowPolyBase;
            return this;
        }

        /**
         * @param allowPolyBase Indicates to use PolyBase to copy data into SQL Data Warehouse when applicable. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder allowPolyBase(Object allowPolyBase) {
            return allowPolyBase(Output.of(allowPolyBase));
        }

        /**
         * @param copyCommandSettings Specifies Copy Command related settings when allowCopyCommand is true.
         * 
         * @return builder
         * 
         */
        public Builder copyCommandSettings(@Nullable Output<DWCopyCommandSettingsArgs> copyCommandSettings) {
            $.copyCommandSettings = copyCommandSettings;
            return this;
        }

        /**
         * @param copyCommandSettings Specifies Copy Command related settings when allowCopyCommand is true.
         * 
         * @return builder
         * 
         */
        public Builder copyCommandSettings(DWCopyCommandSettingsArgs copyCommandSettings) {
            return copyCommandSettings(Output.of(copyCommandSettings));
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
         * @param maxConcurrentConnections The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(Object maxConcurrentConnections) {
            return maxConcurrentConnections(Output.of(maxConcurrentConnections));
        }

        /**
         * @param polyBaseSettings Specifies PolyBase-related settings when allowPolyBase is true.
         * 
         * @return builder
         * 
         */
        public Builder polyBaseSettings(@Nullable Output<PolybaseSettingsArgs> polyBaseSettings) {
            $.polyBaseSettings = polyBaseSettings;
            return this;
        }

        /**
         * @param polyBaseSettings Specifies PolyBase-related settings when allowPolyBase is true.
         * 
         * @return builder
         * 
         */
        public Builder polyBaseSettings(PolybaseSettingsArgs polyBaseSettings) {
            return polyBaseSettings(Output.of(polyBaseSettings));
        }

        /**
         * @param preCopyScript SQL pre-copy script. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder preCopyScript(@Nullable Output<Object> preCopyScript) {
            $.preCopyScript = preCopyScript;
            return this;
        }

        /**
         * @param preCopyScript SQL pre-copy script. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder preCopyScript(Object preCopyScript) {
            return preCopyScript(Output.of(preCopyScript));
        }

        /**
         * @param sinkRetryCount Sink retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sinkRetryCount(@Nullable Output<Object> sinkRetryCount) {
            $.sinkRetryCount = sinkRetryCount;
            return this;
        }

        /**
         * @param sinkRetryCount Sink retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sinkRetryCount(Object sinkRetryCount) {
            return sinkRetryCount(Output.of(sinkRetryCount));
        }

        /**
         * @param sinkRetryWait Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sinkRetryWait(@Nullable Output<Object> sinkRetryWait) {
            $.sinkRetryWait = sinkRetryWait;
            return this;
        }

        /**
         * @param sinkRetryWait Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sinkRetryWait(Object sinkRetryWait) {
            return sinkRetryWait(Output.of(sinkRetryWait));
        }

        /**
         * @param sqlWriterUseTableLock Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder sqlWriterUseTableLock(@Nullable Output<Object> sqlWriterUseTableLock) {
            $.sqlWriterUseTableLock = sqlWriterUseTableLock;
            return this;
        }

        /**
         * @param sqlWriterUseTableLock Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder sqlWriterUseTableLock(Object sqlWriterUseTableLock) {
            return sqlWriterUseTableLock(Output.of(sqlWriterUseTableLock));
        }

        /**
         * @param tableOption The option to handle sink table, such as autoCreate. For now only &#39;autoCreate&#39; value is supported. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder tableOption(@Nullable Output<Object> tableOption) {
            $.tableOption = tableOption;
            return this;
        }

        /**
         * @param tableOption The option to handle sink table, such as autoCreate. For now only &#39;autoCreate&#39; value is supported. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder tableOption(Object tableOption) {
            return tableOption(Output.of(tableOption));
        }

        /**
         * @param type Copy sink type.
         * Expected value is &#39;SqlDWSink&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Copy sink type.
         * Expected value is &#39;SqlDWSink&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param upsertSettings SQL DW upsert settings.
         * 
         * @return builder
         * 
         */
        public Builder upsertSettings(@Nullable Output<SqlDWUpsertSettingsArgs> upsertSettings) {
            $.upsertSettings = upsertSettings;
            return this;
        }

        /**
         * @param upsertSettings SQL DW upsert settings.
         * 
         * @return builder
         * 
         */
        public Builder upsertSettings(SqlDWUpsertSettingsArgs upsertSettings) {
            return upsertSettings(Output.of(upsertSettings));
        }

        /**
         * @param writeBatchSize Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
         * 
         * @return builder
         * 
         */
        public Builder writeBatchSize(@Nullable Output<Object> writeBatchSize) {
            $.writeBatchSize = writeBatchSize;
            return this;
        }

        /**
         * @param writeBatchSize Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
         * 
         * @return builder
         * 
         */
        public Builder writeBatchSize(Object writeBatchSize) {
            return writeBatchSize(Output.of(writeBatchSize));
        }

        /**
         * @param writeBatchTimeout Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder writeBatchTimeout(@Nullable Output<Object> writeBatchTimeout) {
            $.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        /**
         * @param writeBatchTimeout Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder writeBatchTimeout(Object writeBatchTimeout) {
            return writeBatchTimeout(Output.of(writeBatchTimeout));
        }

        /**
         * @param writeBehavior Write behavior when copying data into azure SQL DW. Type: SqlDWWriteBehaviorEnum (or Expression with resultType SqlDWWriteBehaviorEnum)
         * 
         * @return builder
         * 
         */
        public Builder writeBehavior(@Nullable Output<Object> writeBehavior) {
            $.writeBehavior = writeBehavior;
            return this;
        }

        /**
         * @param writeBehavior Write behavior when copying data into azure SQL DW. Type: SqlDWWriteBehaviorEnum (or Expression with resultType SqlDWWriteBehaviorEnum)
         * 
         * @return builder
         * 
         */
        public Builder writeBehavior(Object writeBehavior) {
            return writeBehavior(Output.of(writeBehavior));
        }

        public SqlDWSinkArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
