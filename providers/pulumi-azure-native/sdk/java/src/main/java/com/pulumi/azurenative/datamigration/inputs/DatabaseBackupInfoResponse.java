// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Information about backup files when existing backup mode is used.
 * 
 */
public final class DatabaseBackupInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final DatabaseBackupInfoResponse Empty = new DatabaseBackupInfoResponse();

    /**
     * The list of backup files for the current database.
     * 
     */
    @Import(name="backupFiles", required=true)
    private List<String> backupFiles;

    /**
     * @return The list of backup files for the current database.
     * 
     */
    public List<String> backupFiles() {
        return this.backupFiles;
    }

    /**
     * Date and time when the backup operation finished.
     * 
     */
    @Import(name="backupFinishDate", required=true)
    private String backupFinishDate;

    /**
     * @return Date and time when the backup operation finished.
     * 
     */
    public String backupFinishDate() {
        return this.backupFinishDate;
    }

    /**
     * Backup Type.
     * 
     */
    @Import(name="backupType", required=true)
    private String backupType;

    /**
     * @return Backup Type.
     * 
     */
    public String backupType() {
        return this.backupType;
    }

    /**
     * Database name.
     * 
     */
    @Import(name="databaseName", required=true)
    private String databaseName;

    /**
     * @return Database name.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Number of files in the backup set.
     * 
     */
    @Import(name="familyCount", required=true)
    private Integer familyCount;

    /**
     * @return Number of files in the backup set.
     * 
     */
    public Integer familyCount() {
        return this.familyCount;
    }

    /**
     * Whether the backup set is compressed
     * 
     */
    @Import(name="isCompressed", required=true)
    private Boolean isCompressed;

    /**
     * @return Whether the backup set is compressed
     * 
     */
    public Boolean isCompressed() {
        return this.isCompressed;
    }

    /**
     * Database was damaged when backed up, but the backup operation was requested to continue despite errors.
     * 
     */
    @Import(name="isDamaged", required=true)
    private Boolean isDamaged;

    /**
     * @return Database was damaged when backed up, but the backup operation was requested to continue despite errors.
     * 
     */
    public Boolean isDamaged() {
        return this.isDamaged;
    }

    /**
     * Position of current database backup in the file.
     * 
     */
    @Import(name="position", required=true)
    private Integer position;

    /**
     * @return Position of current database backup in the file.
     * 
     */
    public Integer position() {
        return this.position;
    }

    private DatabaseBackupInfoResponse() {}

    private DatabaseBackupInfoResponse(DatabaseBackupInfoResponse $) {
        this.backupFiles = $.backupFiles;
        this.backupFinishDate = $.backupFinishDate;
        this.backupType = $.backupType;
        this.databaseName = $.databaseName;
        this.familyCount = $.familyCount;
        this.isCompressed = $.isCompressed;
        this.isDamaged = $.isDamaged;
        this.position = $.position;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseBackupInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseBackupInfoResponse $;

        public Builder() {
            $ = new DatabaseBackupInfoResponse();
        }

        public Builder(DatabaseBackupInfoResponse defaults) {
            $ = new DatabaseBackupInfoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupFiles The list of backup files for the current database.
         * 
         * @return builder
         * 
         */
        public Builder backupFiles(List<String> backupFiles) {
            $.backupFiles = backupFiles;
            return this;
        }

        /**
         * @param backupFiles The list of backup files for the current database.
         * 
         * @return builder
         * 
         */
        public Builder backupFiles(String... backupFiles) {
            return backupFiles(List.of(backupFiles));
        }

        /**
         * @param backupFinishDate Date and time when the backup operation finished.
         * 
         * @return builder
         * 
         */
        public Builder backupFinishDate(String backupFinishDate) {
            $.backupFinishDate = backupFinishDate;
            return this;
        }

        /**
         * @param backupType Backup Type.
         * 
         * @return builder
         * 
         */
        public Builder backupType(String backupType) {
            $.backupType = backupType;
            return this;
        }

        /**
         * @param databaseName Database name.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param familyCount Number of files in the backup set.
         * 
         * @return builder
         * 
         */
        public Builder familyCount(Integer familyCount) {
            $.familyCount = familyCount;
            return this;
        }

        /**
         * @param isCompressed Whether the backup set is compressed
         * 
         * @return builder
         * 
         */
        public Builder isCompressed(Boolean isCompressed) {
            $.isCompressed = isCompressed;
            return this;
        }

        /**
         * @param isDamaged Database was damaged when backed up, but the backup operation was requested to continue despite errors.
         * 
         * @return builder
         * 
         */
        public Builder isDamaged(Boolean isDamaged) {
            $.isDamaged = isDamaged;
            return this;
        }

        /**
         * @param position Position of current database backup in the file.
         * 
         * @return builder
         * 
         */
        public Builder position(Integer position) {
            $.position = position;
            return this;
        }

        public DatabaseBackupInfoResponse build() {
            $.backupFiles = Objects.requireNonNull($.backupFiles, "expected parameter 'backupFiles' to be non-null");
            $.backupFinishDate = Objects.requireNonNull($.backupFinishDate, "expected parameter 'backupFinishDate' to be non-null");
            $.backupType = Objects.requireNonNull($.backupType, "expected parameter 'backupType' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.familyCount = Objects.requireNonNull($.familyCount, "expected parameter 'familyCount' to be non-null");
            $.isCompressed = Objects.requireNonNull($.isCompressed, "expected parameter 'isCompressed' to be non-null");
            $.isDamaged = Objects.requireNonNull($.isDamaged, "expected parameter 'isDamaged' to be non-null");
            $.position = Objects.requireNonNull($.position, "expected parameter 'position' to be non-null");
            return $;
        }
    }

}
