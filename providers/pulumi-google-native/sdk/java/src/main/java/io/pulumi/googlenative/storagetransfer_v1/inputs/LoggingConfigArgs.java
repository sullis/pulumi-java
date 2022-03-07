// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.storagetransfer_v1.enums.LoggingConfigLogActionStatesItem;
import io.pulumi.googlenative.storagetransfer_v1.enums.LoggingConfigLogActionsItem;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the logging behavior for transfer operations. For cloud-to-cloud transfers, logs are sent to Cloud Logging. See [Read transfer logs](https://cloud.google.com/storage-transfer/docs/read-transfer-logs) for details. For transfers to or from a POSIX file system, logs are stored in the Cloud Storage bucket that is the source or sink of the transfer. See [Managing Transfer for on-premises jobs] (https://cloud.google.com/storage-transfer/docs/managing-on-prem-jobs#viewing-logs) for details.
 * 
 */
public final class LoggingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingConfigArgs Empty = new LoggingConfigArgs();

    /**
     * For transfers with a PosixFilesystem source, this option enables the Cloud Storage transfer logs for this transfer.
     * 
     */
    @InputImport(name="enableOnpremGcsTransferLogs")
      private final @Nullable Input<Boolean> enableOnpremGcsTransferLogs;

    public Input<Boolean> getEnableOnpremGcsTransferLogs() {
        return this.enableOnpremGcsTransferLogs == null ? Input.empty() : this.enableOnpremGcsTransferLogs;
    }

    /**
     * States in which `log_actions` are logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
     * 
     */
    @InputImport(name="logActionStates")
      private final @Nullable Input<List<LoggingConfigLogActionStatesItem>> logActionStates;

    public Input<List<LoggingConfigLogActionStatesItem>> getLogActionStates() {
        return this.logActionStates == null ? Input.empty() : this.logActionStates;
    }

    /**
     * Specifies the actions to be logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
     * 
     */
    @InputImport(name="logActions")
      private final @Nullable Input<List<LoggingConfigLogActionsItem>> logActions;

    public Input<List<LoggingConfigLogActionsItem>> getLogActions() {
        return this.logActions == null ? Input.empty() : this.logActions;
    }

    public LoggingConfigArgs(
        @Nullable Input<Boolean> enableOnpremGcsTransferLogs,
        @Nullable Input<List<LoggingConfigLogActionStatesItem>> logActionStates,
        @Nullable Input<List<LoggingConfigLogActionsItem>> logActions) {
        this.enableOnpremGcsTransferLogs = enableOnpremGcsTransferLogs;
        this.logActionStates = logActionStates;
        this.logActions = logActions;
    }

    private LoggingConfigArgs() {
        this.enableOnpremGcsTransferLogs = Input.empty();
        this.logActionStates = Input.empty();
        this.logActions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableOnpremGcsTransferLogs;
        private @Nullable Input<List<LoggingConfigLogActionStatesItem>> logActionStates;
        private @Nullable Input<List<LoggingConfigLogActionsItem>> logActions;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableOnpremGcsTransferLogs = defaults.enableOnpremGcsTransferLogs;
    	      this.logActionStates = defaults.logActionStates;
    	      this.logActions = defaults.logActions;
        }

        public Builder setEnableOnpremGcsTransferLogs(@Nullable Input<Boolean> enableOnpremGcsTransferLogs) {
            this.enableOnpremGcsTransferLogs = enableOnpremGcsTransferLogs;
            return this;
        }

        public Builder setEnableOnpremGcsTransferLogs(@Nullable Boolean enableOnpremGcsTransferLogs) {
            this.enableOnpremGcsTransferLogs = Input.ofNullable(enableOnpremGcsTransferLogs);
            return this;
        }

        public Builder setLogActionStates(@Nullable Input<List<LoggingConfigLogActionStatesItem>> logActionStates) {
            this.logActionStates = logActionStates;
            return this;
        }

        public Builder setLogActionStates(@Nullable List<LoggingConfigLogActionStatesItem> logActionStates) {
            this.logActionStates = Input.ofNullable(logActionStates);
            return this;
        }

        public Builder setLogActions(@Nullable Input<List<LoggingConfigLogActionsItem>> logActions) {
            this.logActions = logActions;
            return this;
        }

        public Builder setLogActions(@Nullable List<LoggingConfigLogActionsItem> logActions) {
            this.logActions = Input.ofNullable(logActions);
            return this;
        }
        public LoggingConfigArgs build() {
            return new LoggingConfigArgs(enableOnpremGcsTransferLogs, logActionStates, logActions);
        }
    }
}