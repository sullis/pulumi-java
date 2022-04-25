// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotState extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotState Empty = new SnapshotState();

    /**
     * Specifies the allocated storage size in gigabytes (GB).
     * 
     */
    @Import(name="allocatedStorage")
    private @Nullable Output<Integer> allocatedStorage;

    /**
     * @return Specifies the allocated storage size in gigabytes (GB).
     * 
     */
    public Optional<Output<Integer>> allocatedStorage() {
        return Optional.ofNullable(this.allocatedStorage);
    }

    /**
     * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     * 
     */
    @Import(name="availabilityZone")
    private @Nullable Output<String> availabilityZone;

    /**
     * @return Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     * 
     */
    public Optional<Output<String>> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    /**
     * The DB Instance Identifier from which to take the snapshot.
     * 
     */
    @Import(name="dbInstanceIdentifier")
    private @Nullable Output<String> dbInstanceIdentifier;

    /**
     * @return The DB Instance Identifier from which to take the snapshot.
     * 
     */
    public Optional<Output<String>> dbInstanceIdentifier() {
        return Optional.ofNullable(this.dbInstanceIdentifier);
    }

    /**
     * The Amazon Resource Name (ARN) for the DB snapshot.
     * 
     */
    @Import(name="dbSnapshotArn")
    private @Nullable Output<String> dbSnapshotArn;

    /**
     * @return The Amazon Resource Name (ARN) for the DB snapshot.
     * 
     */
    public Optional<Output<String>> dbSnapshotArn() {
        return Optional.ofNullable(this.dbSnapshotArn);
    }

    /**
     * The Identifier for the snapshot.
     * 
     */
    @Import(name="dbSnapshotIdentifier")
    private @Nullable Output<String> dbSnapshotIdentifier;

    /**
     * @return The Identifier for the snapshot.
     * 
     */
    public Optional<Output<String>> dbSnapshotIdentifier() {
        return Optional.ofNullable(this.dbSnapshotIdentifier);
    }

    /**
     * Specifies whether the DB snapshot is encrypted.
     * 
     */
    @Import(name="encrypted")
    private @Nullable Output<Boolean> encrypted;

    /**
     * @return Specifies whether the DB snapshot is encrypted.
     * 
     */
    public Optional<Output<Boolean>> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }

    /**
     * Specifies the name of the database engine.
     * 
     */
    @Import(name="engine")
    private @Nullable Output<String> engine;

    /**
     * @return Specifies the name of the database engine.
     * 
     */
    public Optional<Output<String>> engine() {
        return Optional.ofNullable(this.engine);
    }

    /**
     * Specifies the version of the database engine.
     * 
     */
    @Import(name="engineVersion")
    private @Nullable Output<String> engineVersion;

    /**
     * @return Specifies the version of the database engine.
     * 
     */
    public Optional<Output<String>> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    /**
     * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * 
     */
    @Import(name="iops")
    private @Nullable Output<Integer> iops;

    /**
     * @return Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * 
     */
    public Optional<Output<Integer>> iops() {
        return Optional.ofNullable(this.iops);
    }

    /**
     * The ARN for the KMS encryption key.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The ARN for the KMS encryption key.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * License model information for the restored DB instance.
     * 
     */
    @Import(name="licenseModel")
    private @Nullable Output<String> licenseModel;

    /**
     * @return License model information for the restored DB instance.
     * 
     */
    public Optional<Output<String>> licenseModel() {
        return Optional.ofNullable(this.licenseModel);
    }

    /**
     * Provides the option group name for the DB snapshot.
     * 
     */
    @Import(name="optionGroupName")
    private @Nullable Output<String> optionGroupName;

    /**
     * @return Provides the option group name for the DB snapshot.
     * 
     */
    public Optional<Output<String>> optionGroupName() {
        return Optional.ofNullable(this.optionGroupName);
    }

    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="snapshotType")
    private @Nullable Output<String> snapshotType;

    public Optional<Output<String>> snapshotType() {
        return Optional.ofNullable(this.snapshotType);
    }

    /**
     * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
     * 
     */
    @Import(name="sourceDbSnapshotIdentifier")
    private @Nullable Output<String> sourceDbSnapshotIdentifier;

    /**
     * @return The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
     * 
     */
    public Optional<Output<String>> sourceDbSnapshotIdentifier() {
        return Optional.ofNullable(this.sourceDbSnapshotIdentifier);
    }

    /**
     * The region that the DB snapshot was created in or copied from.
     * 
     */
    @Import(name="sourceRegion")
    private @Nullable Output<String> sourceRegion;

    /**
     * @return The region that the DB snapshot was created in or copied from.
     * 
     */
    public Optional<Output<String>> sourceRegion() {
        return Optional.ofNullable(this.sourceRegion);
    }

    /**
     * Specifies the status of this DB snapshot.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Specifies the status of this DB snapshot.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Specifies the storage type associated with DB snapshot.
     * 
     */
    @Import(name="storageType")
    private @Nullable Output<String> storageType;

    /**
     * @return Specifies the storage type associated with DB snapshot.
     * 
     */
    public Optional<Output<String>> storageType() {
        return Optional.ofNullable(this.storageType);
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Provides the VPC ID associated with the DB snapshot.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return Provides the VPC ID associated with the DB snapshot.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private SnapshotState() {}

    private SnapshotState(SnapshotState $) {
        this.allocatedStorage = $.allocatedStorage;
        this.availabilityZone = $.availabilityZone;
        this.dbInstanceIdentifier = $.dbInstanceIdentifier;
        this.dbSnapshotArn = $.dbSnapshotArn;
        this.dbSnapshotIdentifier = $.dbSnapshotIdentifier;
        this.encrypted = $.encrypted;
        this.engine = $.engine;
        this.engineVersion = $.engineVersion;
        this.iops = $.iops;
        this.kmsKeyId = $.kmsKeyId;
        this.licenseModel = $.licenseModel;
        this.optionGroupName = $.optionGroupName;
        this.port = $.port;
        this.snapshotType = $.snapshotType;
        this.sourceDbSnapshotIdentifier = $.sourceDbSnapshotIdentifier;
        this.sourceRegion = $.sourceRegion;
        this.status = $.status;
        this.storageType = $.storageType;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotState $;

        public Builder() {
            $ = new SnapshotState();
        }

        public Builder(SnapshotState defaults) {
            $ = new SnapshotState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocatedStorage Specifies the allocated storage size in gigabytes (GB).
         * 
         * @return builder
         * 
         */
        public Builder allocatedStorage(@Nullable Output<Integer> allocatedStorage) {
            $.allocatedStorage = allocatedStorage;
            return this;
        }

        /**
         * @param allocatedStorage Specifies the allocated storage size in gigabytes (GB).
         * 
         * @return builder
         * 
         */
        public Builder allocatedStorage(Integer allocatedStorage) {
            return allocatedStorage(Output.of(allocatedStorage));
        }

        /**
         * @param availabilityZone Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * @param availabilityZone Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(String availabilityZone) {
            return availabilityZone(Output.of(availabilityZone));
        }

        /**
         * @param dbInstanceIdentifier The DB Instance Identifier from which to take the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceIdentifier(@Nullable Output<String> dbInstanceIdentifier) {
            $.dbInstanceIdentifier = dbInstanceIdentifier;
            return this;
        }

        /**
         * @param dbInstanceIdentifier The DB Instance Identifier from which to take the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceIdentifier(String dbInstanceIdentifier) {
            return dbInstanceIdentifier(Output.of(dbInstanceIdentifier));
        }

        /**
         * @param dbSnapshotArn The Amazon Resource Name (ARN) for the DB snapshot.
         * 
         * @return builder
         * 
         */
        public Builder dbSnapshotArn(@Nullable Output<String> dbSnapshotArn) {
            $.dbSnapshotArn = dbSnapshotArn;
            return this;
        }

        /**
         * @param dbSnapshotArn The Amazon Resource Name (ARN) for the DB snapshot.
         * 
         * @return builder
         * 
         */
        public Builder dbSnapshotArn(String dbSnapshotArn) {
            return dbSnapshotArn(Output.of(dbSnapshotArn));
        }

        /**
         * @param dbSnapshotIdentifier The Identifier for the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder dbSnapshotIdentifier(@Nullable Output<String> dbSnapshotIdentifier) {
            $.dbSnapshotIdentifier = dbSnapshotIdentifier;
            return this;
        }

        /**
         * @param dbSnapshotIdentifier The Identifier for the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder dbSnapshotIdentifier(String dbSnapshotIdentifier) {
            return dbSnapshotIdentifier(Output.of(dbSnapshotIdentifier));
        }

        /**
         * @param encrypted Specifies whether the DB snapshot is encrypted.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        /**
         * @param encrypted Specifies whether the DB snapshot is encrypted.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(Boolean encrypted) {
            return encrypted(Output.of(encrypted));
        }

        /**
         * @param engine Specifies the name of the database engine.
         * 
         * @return builder
         * 
         */
        public Builder engine(@Nullable Output<String> engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param engine Specifies the name of the database engine.
         * 
         * @return builder
         * 
         */
        public Builder engine(String engine) {
            return engine(Output.of(engine));
        }

        /**
         * @param engineVersion Specifies the version of the database engine.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        /**
         * @param engineVersion Specifies the version of the database engine.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(String engineVersion) {
            return engineVersion(Output.of(engineVersion));
        }

        /**
         * @param iops Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder iops(@Nullable Output<Integer> iops) {
            $.iops = iops;
            return this;
        }

        /**
         * @param iops Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder iops(Integer iops) {
            return iops(Output.of(iops));
        }

        /**
         * @param kmsKeyId The ARN for the KMS encryption key.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The ARN for the KMS encryption key.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param licenseModel License model information for the restored DB instance.
         * 
         * @return builder
         * 
         */
        public Builder licenseModel(@Nullable Output<String> licenseModel) {
            $.licenseModel = licenseModel;
            return this;
        }

        /**
         * @param licenseModel License model information for the restored DB instance.
         * 
         * @return builder
         * 
         */
        public Builder licenseModel(String licenseModel) {
            return licenseModel(Output.of(licenseModel));
        }

        /**
         * @param optionGroupName Provides the option group name for the DB snapshot.
         * 
         * @return builder
         * 
         */
        public Builder optionGroupName(@Nullable Output<String> optionGroupName) {
            $.optionGroupName = optionGroupName;
            return this;
        }

        /**
         * @param optionGroupName Provides the option group name for the DB snapshot.
         * 
         * @return builder
         * 
         */
        public Builder optionGroupName(String optionGroupName) {
            return optionGroupName(Output.of(optionGroupName));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder snapshotType(@Nullable Output<String> snapshotType) {
            $.snapshotType = snapshotType;
            return this;
        }

        public Builder snapshotType(String snapshotType) {
            return snapshotType(Output.of(snapshotType));
        }

        /**
         * @param sourceDbSnapshotIdentifier The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
         * 
         * @return builder
         * 
         */
        public Builder sourceDbSnapshotIdentifier(@Nullable Output<String> sourceDbSnapshotIdentifier) {
            $.sourceDbSnapshotIdentifier = sourceDbSnapshotIdentifier;
            return this;
        }

        /**
         * @param sourceDbSnapshotIdentifier The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
         * 
         * @return builder
         * 
         */
        public Builder sourceDbSnapshotIdentifier(String sourceDbSnapshotIdentifier) {
            return sourceDbSnapshotIdentifier(Output.of(sourceDbSnapshotIdentifier));
        }

        /**
         * @param sourceRegion The region that the DB snapshot was created in or copied from.
         * 
         * @return builder
         * 
         */
        public Builder sourceRegion(@Nullable Output<String> sourceRegion) {
            $.sourceRegion = sourceRegion;
            return this;
        }

        /**
         * @param sourceRegion The region that the DB snapshot was created in or copied from.
         * 
         * @return builder
         * 
         */
        public Builder sourceRegion(String sourceRegion) {
            return sourceRegion(Output.of(sourceRegion));
        }

        /**
         * @param status Specifies the status of this DB snapshot.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Specifies the status of this DB snapshot.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param storageType Specifies the storage type associated with DB snapshot.
         * 
         * @return builder
         * 
         */
        public Builder storageType(@Nullable Output<String> storageType) {
            $.storageType = storageType;
            return this;
        }

        /**
         * @param storageType Specifies the storage type associated with DB snapshot.
         * 
         * @return builder
         * 
         */
        public Builder storageType(String storageType) {
            return storageType(Output.of(storageType));
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param vpcId Provides the VPC ID associated with the DB snapshot.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId Provides the VPC ID associated with the DB snapshot.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public SnapshotState build() {
            return $;
        }
    }

}
