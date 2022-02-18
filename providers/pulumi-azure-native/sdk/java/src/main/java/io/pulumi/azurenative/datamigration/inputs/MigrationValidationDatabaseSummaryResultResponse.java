// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Migration Validation Database level summary result
 * 
 */
public final class MigrationValidationDatabaseSummaryResultResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrationValidationDatabaseSummaryResultResponse Empty = new MigrationValidationDatabaseSummaryResultResponse();

    /**
     * Validation end time
     * 
     */
    @InputImport(name="endedOn", required=true)
    private final String endedOn;

    public String getEndedOn() {
        return this.endedOn;
    }

    /**
     * Result identifier
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Migration Identifier
     * 
     */
    @InputImport(name="migrationId", required=true)
    private final String migrationId;

    public String getMigrationId() {
        return this.migrationId;
    }

    /**
     * Name of the source database
     * 
     */
    @InputImport(name="sourceDatabaseName", required=true)
    private final String sourceDatabaseName;

    public String getSourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    /**
     * Validation start time
     * 
     */
    @InputImport(name="startedOn", required=true)
    private final String startedOn;

    public String getStartedOn() {
        return this.startedOn;
    }

    /**
     * Current status of validation at the database level
     * 
     */
    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    /**
     * Name of the target database
     * 
     */
    @InputImport(name="targetDatabaseName", required=true)
    private final String targetDatabaseName;

    public String getTargetDatabaseName() {
        return this.targetDatabaseName;
    }

    public MigrationValidationDatabaseSummaryResultResponse(
        String endedOn,
        String id,
        String migrationId,
        String sourceDatabaseName,
        String startedOn,
        String status,
        String targetDatabaseName) {
        this.endedOn = Objects.requireNonNull(endedOn, "expected parameter 'endedOn' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.migrationId = Objects.requireNonNull(migrationId, "expected parameter 'migrationId' to be non-null");
        this.sourceDatabaseName = Objects.requireNonNull(sourceDatabaseName, "expected parameter 'sourceDatabaseName' to be non-null");
        this.startedOn = Objects.requireNonNull(startedOn, "expected parameter 'startedOn' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.targetDatabaseName = Objects.requireNonNull(targetDatabaseName, "expected parameter 'targetDatabaseName' to be non-null");
    }

    private MigrationValidationDatabaseSummaryResultResponse() {
        this.endedOn = null;
        this.id = null;
        this.migrationId = null;
        this.sourceDatabaseName = null;
        this.startedOn = null;
        this.status = null;
        this.targetDatabaseName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationValidationDatabaseSummaryResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endedOn;
        private String id;
        private String migrationId;
        private String sourceDatabaseName;
        private String startedOn;
        private String status;
        private String targetDatabaseName;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationValidationDatabaseSummaryResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endedOn = defaults.endedOn;
    	      this.id = defaults.id;
    	      this.migrationId = defaults.migrationId;
    	      this.sourceDatabaseName = defaults.sourceDatabaseName;
    	      this.startedOn = defaults.startedOn;
    	      this.status = defaults.status;
    	      this.targetDatabaseName = defaults.targetDatabaseName;
        }

        public Builder setEndedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMigrationId(String migrationId) {
            this.migrationId = Objects.requireNonNull(migrationId);
            return this;
        }

        public Builder setSourceDatabaseName(String sourceDatabaseName) {
            this.sourceDatabaseName = Objects.requireNonNull(sourceDatabaseName);
            return this;
        }

        public Builder setStartedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTargetDatabaseName(String targetDatabaseName) {
            this.targetDatabaseName = Objects.requireNonNull(targetDatabaseName);
            return this;
        }

        public MigrationValidationDatabaseSummaryResultResponse build() {
            return new MigrationValidationDatabaseSummaryResultResponse(endedOn, id, migrationId, sourceDatabaseName, startedOn, status, targetDatabaseName);
        }
    }
}
