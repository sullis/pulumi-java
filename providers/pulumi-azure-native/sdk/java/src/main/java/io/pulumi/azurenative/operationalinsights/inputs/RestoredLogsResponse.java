// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Restore parameters.
 * 
 */
public final class RestoredLogsResponse extends io.pulumi.resources.InvokeArgs {

    public static final RestoredLogsResponse Empty = new RestoredLogsResponse();

    /**
     * The timestamp to end the restore by (UTC).
     * 
     */
    @InputImport(name="endRestoreTime")
      private final @Nullable String endRestoreTime;

    public Optional<String> getEndRestoreTime() {
        return this.endRestoreTime == null ? Optional.empty() : Optional.ofNullable(this.endRestoreTime);
    }

    /**
     * The table to restore data from.
     * 
     */
    @InputImport(name="sourceTable", required=true)
      private final String sourceTable;

    public String getSourceTable() {
        return this.sourceTable;
    }

    /**
     * The timestamp to start the restore from (UTC).
     * 
     */
    @InputImport(name="startRestoreTime")
      private final @Nullable String startRestoreTime;

    public Optional<String> getStartRestoreTime() {
        return this.startRestoreTime == null ? Optional.empty() : Optional.ofNullable(this.startRestoreTime);
    }

    public RestoredLogsResponse(
        @Nullable String endRestoreTime,
        String sourceTable,
        @Nullable String startRestoreTime) {
        this.endRestoreTime = endRestoreTime;
        this.sourceTable = Objects.requireNonNull(sourceTable, "expected parameter 'sourceTable' to be non-null");
        this.startRestoreTime = startRestoreTime;
    }

    private RestoredLogsResponse() {
        this.endRestoreTime = null;
        this.sourceTable = null;
        this.startRestoreTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestoredLogsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endRestoreTime;
        private String sourceTable;
        private @Nullable String startRestoreTime;

        public Builder() {
    	      // Empty
        }

        public Builder(RestoredLogsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endRestoreTime = defaults.endRestoreTime;
    	      this.sourceTable = defaults.sourceTable;
    	      this.startRestoreTime = defaults.startRestoreTime;
        }

        public Builder setEndRestoreTime(@Nullable String endRestoreTime) {
            this.endRestoreTime = endRestoreTime;
            return this;
        }

        public Builder setSourceTable(String sourceTable) {
            this.sourceTable = Objects.requireNonNull(sourceTable);
            return this;
        }

        public Builder setStartRestoreTime(@Nullable String startRestoreTime) {
            this.startRestoreTime = startRestoreTime;
            return this;
        }
        public RestoredLogsResponse build() {
            return new RestoredLogsResponse(endRestoreTime, sourceTable, startRestoreTime);
        }
    }
}