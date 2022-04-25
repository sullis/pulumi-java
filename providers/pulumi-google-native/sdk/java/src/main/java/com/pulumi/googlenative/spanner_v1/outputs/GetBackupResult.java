// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.spanner_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.spanner_v1.outputs.EncryptionInfoResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBackupResult {
    /**
     * @return The time the CreateBackup request is received. If the request does not specify `version_time`, the `version_time` of the backup will be equivalent to the `create_time`.
     * 
     */
    private final String createTime;
    /**
     * @return Required for the CreateBackup operation. Name of the database from which this backup was created. This needs to be in the same instance as the backup. Values are of the form `projects//instances//databases/`.
     * 
     */
    private final String database;
    /**
     * @return The database dialect information for the backup.
     * 
     */
    private final String databaseDialect;
    /**
     * @return The encryption information for the backup.
     * 
     */
    private final EncryptionInfoResponse encryptionInfo;
    /**
     * @return Required for the CreateBackup operation. The expiration time of the backup, with microseconds granularity that must be at least 6 hours and at most 366 days from the time the CreateBackup request is processed. Once the `expire_time` has passed, the backup is eligible to be automatically deleted by Cloud Spanner to free the resources used by the backup.
     * 
     */
    private final String expireTime;
    /**
     * @return Output only for the CreateBackup operation. Required for the UpdateBackup operation. A globally unique identifier for the backup which cannot be changed. Values are of the form `projects//instances//backups/a-z*[a-z0-9]` The final segment of the name must be between 2 and 60 characters in length. The backup is stored in the location(s) specified in the instance configuration of the instance containing the backup, identified by the prefix of the backup name of the form `projects//instances/`.
     * 
     */
    private final String name;
    /**
     * @return The names of the restored databases that reference the backup. The database names are of the form `projects//instances//databases/`. Referencing databases may exist in different instances. The existence of any referencing database prevents the backup from being deleted. When a restored database from the backup enters the `READY` state, the reference to the backup is removed.
     * 
     */
    private final List<String> referencingDatabases;
    /**
     * @return Size of the backup in bytes.
     * 
     */
    private final String sizeBytes;
    /**
     * @return The current state of the backup.
     * 
     */
    private final String state;
    /**
     * @return The backup will contain an externally consistent copy of the database at the timestamp specified by `version_time`. If `version_time` is not specified, the system will set `version_time` to the `create_time` of the backup.
     * 
     */
    private final String versionTime;

    @CustomType.Constructor
    private GetBackupResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("database") String database,
        @CustomType.Parameter("databaseDialect") String databaseDialect,
        @CustomType.Parameter("encryptionInfo") EncryptionInfoResponse encryptionInfo,
        @CustomType.Parameter("expireTime") String expireTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("referencingDatabases") List<String> referencingDatabases,
        @CustomType.Parameter("sizeBytes") String sizeBytes,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("versionTime") String versionTime) {
        this.createTime = createTime;
        this.database = database;
        this.databaseDialect = databaseDialect;
        this.encryptionInfo = encryptionInfo;
        this.expireTime = expireTime;
        this.name = name;
        this.referencingDatabases = referencingDatabases;
        this.sizeBytes = sizeBytes;
        this.state = state;
        this.versionTime = versionTime;
    }

    /**
     * @return The time the CreateBackup request is received. If the request does not specify `version_time`, the `version_time` of the backup will be equivalent to the `create_time`.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Required for the CreateBackup operation. Name of the database from which this backup was created. This needs to be in the same instance as the backup. Values are of the form `projects//instances//databases/`.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return The database dialect information for the backup.
     * 
     */
    public String databaseDialect() {
        return this.databaseDialect;
    }
    /**
     * @return The encryption information for the backup.
     * 
     */
    public EncryptionInfoResponse encryptionInfo() {
        return this.encryptionInfo;
    }
    /**
     * @return Required for the CreateBackup operation. The expiration time of the backup, with microseconds granularity that must be at least 6 hours and at most 366 days from the time the CreateBackup request is processed. Once the `expire_time` has passed, the backup is eligible to be automatically deleted by Cloud Spanner to free the resources used by the backup.
     * 
     */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * @return Output only for the CreateBackup operation. Required for the UpdateBackup operation. A globally unique identifier for the backup which cannot be changed. Values are of the form `projects//instances//backups/a-z*[a-z0-9]` The final segment of the name must be between 2 and 60 characters in length. The backup is stored in the location(s) specified in the instance configuration of the instance containing the backup, identified by the prefix of the backup name of the form `projects//instances/`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The names of the restored databases that reference the backup. The database names are of the form `projects//instances//databases/`. Referencing databases may exist in different instances. The existence of any referencing database prevents the backup from being deleted. When a restored database from the backup enters the `READY` state, the reference to the backup is removed.
     * 
     */
    public List<String> referencingDatabases() {
        return this.referencingDatabases;
    }
    /**
     * @return Size of the backup in bytes.
     * 
     */
    public String sizeBytes() {
        return this.sizeBytes;
    }
    /**
     * @return The current state of the backup.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The backup will contain an externally consistent copy of the database at the timestamp specified by `version_time`. If `version_time` is not specified, the system will set `version_time` to the `create_time` of the backup.
     * 
     */
    public String versionTime() {
        return this.versionTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String database;
        private String databaseDialect;
        private EncryptionInfoResponse encryptionInfo;
        private String expireTime;
        private String name;
        private List<String> referencingDatabases;
        private String sizeBytes;
        private String state;
        private String versionTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.database = defaults.database;
    	      this.databaseDialect = defaults.databaseDialect;
    	      this.encryptionInfo = defaults.encryptionInfo;
    	      this.expireTime = defaults.expireTime;
    	      this.name = defaults.name;
    	      this.referencingDatabases = defaults.referencingDatabases;
    	      this.sizeBytes = defaults.sizeBytes;
    	      this.state = defaults.state;
    	      this.versionTime = defaults.versionTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder databaseDialect(String databaseDialect) {
            this.databaseDialect = Objects.requireNonNull(databaseDialect);
            return this;
        }
        public Builder encryptionInfo(EncryptionInfoResponse encryptionInfo) {
            this.encryptionInfo = Objects.requireNonNull(encryptionInfo);
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
        public Builder referencingDatabases(List<String> referencingDatabases) {
            this.referencingDatabases = Objects.requireNonNull(referencingDatabases);
            return this;
        }
        public Builder referencingDatabases(String... referencingDatabases) {
            return referencingDatabases(List.of(referencingDatabases));
        }
        public Builder sizeBytes(String sizeBytes) {
            this.sizeBytes = Objects.requireNonNull(sizeBytes);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder versionTime(String versionTime) {
            this.versionTime = Objects.requireNonNull(versionTime);
            return this;
        }        public GetBackupResult build() {
            return new GetBackupResult(createTime, database, databaseDialect, encryptionInfo, expireTime, name, referencingDatabases, sizeBytes, state, versionTime);
        }
    }
}
