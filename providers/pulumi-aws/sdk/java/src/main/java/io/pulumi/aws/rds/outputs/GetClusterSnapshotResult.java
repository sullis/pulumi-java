// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterSnapshotResult {
    /**
     * Specifies the allocated storage size in gigabytes (GB).
     * 
     */
    private final Integer allocatedStorage;
    /**
     * List of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
     * 
     */
    private final List<String> availabilityZones;
    /**
     * Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
     * 
     */
    private final @Nullable String dbClusterIdentifier;
    /**
     * The Amazon Resource Name (ARN) for the DB Cluster Snapshot.
     * 
     */
    private final String dbClusterSnapshotArn;
    private final @Nullable String dbClusterSnapshotIdentifier;
    /**
     * Specifies the name of the database engine.
     * 
     */
    private final String engine;
    /**
     * Version of the database engine for this DB cluster snapshot.
     * 
     */
    private final String engineVersion;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable Boolean includePublic;
    private final @Nullable Boolean includeShared;
    /**
     * If storage_encrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
     * 
     */
    private final String kmsKeyId;
    /**
     * License model information for the restored DB cluster.
     * 
     */
    private final String licenseModel;
    private final @Nullable Boolean mostRecent;
    /**
     * Port that the DB cluster was listening on at the time of the snapshot.
     * 
     */
    private final Integer port;
    /**
     * Time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * 
     */
    private final String snapshotCreateTime;
    private final @Nullable String snapshotType;
    private final String sourceDbClusterSnapshotArn;
    /**
     * The status of this DB Cluster Snapshot.
     * 
     */
    private final String status;
    /**
     * Specifies whether the DB cluster snapshot is encrypted.
     * 
     */
    private final Boolean storageEncrypted;
    /**
     * A map of tags for the resource.
     * 
     */
    private final Map<String,String> tags;
    /**
     * The VPC ID associated with the DB cluster snapshot.
     * 
     */
    private final String vpcId;

    @CustomType.Constructor
    private GetClusterSnapshotResult(
        @CustomType.Parameter("allocatedStorage") Integer allocatedStorage,
        @CustomType.Parameter("availabilityZones") List<String> availabilityZones,
        @CustomType.Parameter("dbClusterIdentifier") @Nullable String dbClusterIdentifier,
        @CustomType.Parameter("dbClusterSnapshotArn") String dbClusterSnapshotArn,
        @CustomType.Parameter("dbClusterSnapshotIdentifier") @Nullable String dbClusterSnapshotIdentifier,
        @CustomType.Parameter("engine") String engine,
        @CustomType.Parameter("engineVersion") String engineVersion,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("includePublic") @Nullable Boolean includePublic,
        @CustomType.Parameter("includeShared") @Nullable Boolean includeShared,
        @CustomType.Parameter("kmsKeyId") String kmsKeyId,
        @CustomType.Parameter("licenseModel") String licenseModel,
        @CustomType.Parameter("mostRecent") @Nullable Boolean mostRecent,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("snapshotCreateTime") String snapshotCreateTime,
        @CustomType.Parameter("snapshotType") @Nullable String snapshotType,
        @CustomType.Parameter("sourceDbClusterSnapshotArn") String sourceDbClusterSnapshotArn,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("storageEncrypted") Boolean storageEncrypted,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("vpcId") String vpcId) {
        this.allocatedStorage = allocatedStorage;
        this.availabilityZones = availabilityZones;
        this.dbClusterIdentifier = dbClusterIdentifier;
        this.dbClusterSnapshotArn = dbClusterSnapshotArn;
        this.dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.id = id;
        this.includePublic = includePublic;
        this.includeShared = includeShared;
        this.kmsKeyId = kmsKeyId;
        this.licenseModel = licenseModel;
        this.mostRecent = mostRecent;
        this.port = port;
        this.snapshotCreateTime = snapshotCreateTime;
        this.snapshotType = snapshotType;
        this.sourceDbClusterSnapshotArn = sourceDbClusterSnapshotArn;
        this.status = status;
        this.storageEncrypted = storageEncrypted;
        this.tags = tags;
        this.vpcId = vpcId;
    }

    /**
     * Specifies the allocated storage size in gigabytes (GB).
     * 
    */
    public Integer allocatedStorage() {
        return this.allocatedStorage;
    }
    /**
     * List of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
     * 
    */
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }
    /**
     * Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
     * 
    */
    public Optional<String> dbClusterIdentifier() {
        return Optional.ofNullable(this.dbClusterIdentifier);
    }
    /**
     * The Amazon Resource Name (ARN) for the DB Cluster Snapshot.
     * 
    */
    public String dbClusterSnapshotArn() {
        return this.dbClusterSnapshotArn;
    }
    public Optional<String> dbClusterSnapshotIdentifier() {
        return Optional.ofNullable(this.dbClusterSnapshotIdentifier);
    }
    /**
     * Specifies the name of the database engine.
     * 
    */
    public String engine() {
        return this.engine;
    }
    /**
     * Version of the database engine for this DB cluster snapshot.
     * 
    */
    public String engineVersion() {
        return this.engineVersion;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> includePublic() {
        return Optional.ofNullable(this.includePublic);
    }
    public Optional<Boolean> includeShared() {
        return Optional.ofNullable(this.includeShared);
    }
    /**
     * If storage_encrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
     * 
    */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * License model information for the restored DB cluster.
     * 
    */
    public String licenseModel() {
        return this.licenseModel;
    }
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }
    /**
     * Port that the DB cluster was listening on at the time of the snapshot.
     * 
    */
    public Integer port() {
        return this.port;
    }
    /**
     * Time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * 
    */
    public String snapshotCreateTime() {
        return this.snapshotCreateTime;
    }
    public Optional<String> snapshotType() {
        return Optional.ofNullable(this.snapshotType);
    }
    public String sourceDbClusterSnapshotArn() {
        return this.sourceDbClusterSnapshotArn;
    }
    /**
     * The status of this DB Cluster Snapshot.
     * 
    */
    public String status() {
        return this.status;
    }
    /**
     * Specifies whether the DB cluster snapshot is encrypted.
     * 
    */
    public Boolean storageEncrypted() {
        return this.storageEncrypted;
    }
    /**
     * A map of tags for the resource.
     * 
    */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * The VPC ID associated with the DB cluster snapshot.
     * 
    */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterSnapshotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer allocatedStorage;
        private List<String> availabilityZones;
        private @Nullable String dbClusterIdentifier;
        private String dbClusterSnapshotArn;
        private @Nullable String dbClusterSnapshotIdentifier;
        private String engine;
        private String engineVersion;
        private String id;
        private @Nullable Boolean includePublic;
        private @Nullable Boolean includeShared;
        private String kmsKeyId;
        private String licenseModel;
        private @Nullable Boolean mostRecent;
        private Integer port;
        private String snapshotCreateTime;
        private @Nullable String snapshotType;
        private String sourceDbClusterSnapshotArn;
        private String status;
        private Boolean storageEncrypted;
        private Map<String,String> tags;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterSnapshotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedStorage = defaults.allocatedStorage;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.dbClusterIdentifier = defaults.dbClusterIdentifier;
    	      this.dbClusterSnapshotArn = defaults.dbClusterSnapshotArn;
    	      this.dbClusterSnapshotIdentifier = defaults.dbClusterSnapshotIdentifier;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.id = defaults.id;
    	      this.includePublic = defaults.includePublic;
    	      this.includeShared = defaults.includeShared;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.licenseModel = defaults.licenseModel;
    	      this.mostRecent = defaults.mostRecent;
    	      this.port = defaults.port;
    	      this.snapshotCreateTime = defaults.snapshotCreateTime;
    	      this.snapshotType = defaults.snapshotType;
    	      this.sourceDbClusterSnapshotArn = defaults.sourceDbClusterSnapshotArn;
    	      this.status = defaults.status;
    	      this.storageEncrypted = defaults.storageEncrypted;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder allocatedStorage(Integer allocatedStorage) {
            this.allocatedStorage = Objects.requireNonNull(allocatedStorage);
            return this;
        }
        public Builder availabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder dbClusterIdentifier(@Nullable String dbClusterIdentifier) {
            this.dbClusterIdentifier = dbClusterIdentifier;
            return this;
        }
        public Builder dbClusterSnapshotArn(String dbClusterSnapshotArn) {
            this.dbClusterSnapshotArn = Objects.requireNonNull(dbClusterSnapshotArn);
            return this;
        }
        public Builder dbClusterSnapshotIdentifier(@Nullable String dbClusterSnapshotIdentifier) {
            this.dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier;
            return this;
        }
        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder includePublic(@Nullable Boolean includePublic) {
            this.includePublic = includePublic;
            return this;
        }
        public Builder includeShared(@Nullable Boolean includeShared) {
            this.includeShared = includeShared;
            return this;
        }
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        public Builder licenseModel(String licenseModel) {
            this.licenseModel = Objects.requireNonNull(licenseModel);
            return this;
        }
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder snapshotCreateTime(String snapshotCreateTime) {
            this.snapshotCreateTime = Objects.requireNonNull(snapshotCreateTime);
            return this;
        }
        public Builder snapshotType(@Nullable String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }
        public Builder sourceDbClusterSnapshotArn(String sourceDbClusterSnapshotArn) {
            this.sourceDbClusterSnapshotArn = Objects.requireNonNull(sourceDbClusterSnapshotArn);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder storageEncrypted(Boolean storageEncrypted) {
            this.storageEncrypted = Objects.requireNonNull(storageEncrypted);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }        public GetClusterSnapshotResult build() {
            return new GetClusterSnapshotResult(allocatedStorage, availabilityZones, dbClusterIdentifier, dbClusterSnapshotArn, dbClusterSnapshotIdentifier, engine, engineVersion, id, includePublic, includeShared, kmsKeyId, licenseModel, mostRecent, port, snapshotCreateTime, snapshotType, sourceDbClusterSnapshotArn, status, storageEncrypted, tags, vpcId);
        }
    }
}
