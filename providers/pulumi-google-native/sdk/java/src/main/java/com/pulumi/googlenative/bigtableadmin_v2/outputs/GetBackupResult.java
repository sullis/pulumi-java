// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigtableadmin_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.bigtableadmin_v2.outputs.EncryptionInfoResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBackupResult {
    /**
     * @return The encryption information for the backup.
     * 
     */
    private final EncryptionInfoResponse encryptionInfo;
    /**
     * @return `end_time` is the time that the backup was finished. The row data in the backup will be no newer than this timestamp.
     * 
     */
    private final String endTime;
    /**
     * @return The expiration time of the backup, with microseconds granularity that must be at least 6 hours and at most 30 days from the time the request is received. Once the `expire_time` has passed, Cloud Bigtable will delete the backup and free the resources used by the backup.
     * 
     */
    private final String expireTime;
    /**
     * @return A globally unique identifier for the backup which cannot be changed. Values are of the form `projects/{project}/instances/{instance}/clusters/{cluster}/ backups/_a-zA-Z0-9*` The final segment of the name must be between 1 and 50 characters in length. The backup is stored in the cluster identified by the prefix of the backup name of the form `projects/{project}/instances/{instance}/clusters/{cluster}`.
     * 
     */
    private final String name;
    /**
     * @return Size of the backup in bytes.
     * 
     */
    private final String sizeBytes;
    /**
     * @return Immutable. Name of the table from which this backup was created. This needs to be in the same instance as the backup. Values are of the form `projects/{project}/instances/{instance}/tables/{source_table}`.
     * 
     */
    private final String sourceTable;
    /**
     * @return `start_time` is the time that the backup was started (i.e. approximately the time the CreateBackup request is received). The row data in this backup will be no older than this timestamp.
     * 
     */
    private final String startTime;
    /**
     * @return The current state of the backup.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetBackupResult(
        @CustomType.Parameter("encryptionInfo") EncryptionInfoResponse encryptionInfo,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("expireTime") String expireTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("sizeBytes") String sizeBytes,
        @CustomType.Parameter("sourceTable") String sourceTable,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("state") String state) {
        this.encryptionInfo = encryptionInfo;
        this.endTime = endTime;
        this.expireTime = expireTime;
        this.name = name;
        this.sizeBytes = sizeBytes;
        this.sourceTable = sourceTable;
        this.startTime = startTime;
        this.state = state;
    }

    /**
     * @return The encryption information for the backup.
     * 
     */
    public EncryptionInfoResponse encryptionInfo() {
        return this.encryptionInfo;
    }
    /**
     * @return `end_time` is the time that the backup was finished. The row data in the backup will be no newer than this timestamp.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return The expiration time of the backup, with microseconds granularity that must be at least 6 hours and at most 30 days from the time the request is received. Once the `expire_time` has passed, Cloud Bigtable will delete the backup and free the resources used by the backup.
     * 
     */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * @return A globally unique identifier for the backup which cannot be changed. Values are of the form `projects/{project}/instances/{instance}/clusters/{cluster}/ backups/_a-zA-Z0-9*` The final segment of the name must be between 1 and 50 characters in length. The backup is stored in the cluster identified by the prefix of the backup name of the form `projects/{project}/instances/{instance}/clusters/{cluster}`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Size of the backup in bytes.
     * 
     */
    public String sizeBytes() {
        return this.sizeBytes;
    }
    /**
     * @return Immutable. Name of the table from which this backup was created. This needs to be in the same instance as the backup. Values are of the form `projects/{project}/instances/{instance}/tables/{source_table}`.
     * 
     */
    public String sourceTable() {
        return this.sourceTable;
    }
    /**
     * @return `start_time` is the time that the backup was started (i.e. approximately the time the CreateBackup request is received). The row data in this backup will be no older than this timestamp.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return The current state of the backup.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionInfoResponse encryptionInfo;
        private String endTime;
        private String expireTime;
        private String name;
        private String sizeBytes;
        private String sourceTable;
        private String startTime;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionInfo = defaults.encryptionInfo;
    	      this.endTime = defaults.endTime;
    	      this.expireTime = defaults.expireTime;
    	      this.name = defaults.name;
    	      this.sizeBytes = defaults.sizeBytes;
    	      this.sourceTable = defaults.sourceTable;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
        }

        public Builder encryptionInfo(EncryptionInfoResponse encryptionInfo) {
            this.encryptionInfo = Objects.requireNonNull(encryptionInfo);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder sizeBytes(String sizeBytes) {
            this.sizeBytes = Objects.requireNonNull(sizeBytes);
            return this;
        }
        public Builder sourceTable(String sourceTable) {
            this.sourceTable = Objects.requireNonNull(sourceTable);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetBackupResult build() {
            return new GetBackupResult(encryptionInfo, endTime, expireTime, name, sizeBytes, sourceTable, startTime, state);
        }
    }
}
