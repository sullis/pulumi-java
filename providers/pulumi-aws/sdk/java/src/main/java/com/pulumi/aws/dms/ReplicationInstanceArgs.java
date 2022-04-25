// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReplicationInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplicationInstanceArgs Empty = new ReplicationInstanceArgs();

    /**
     * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
     * 
     */
    @Import(name="allocatedStorage")
    private @Nullable Output<Integer> allocatedStorage;

    /**
     * @return The amount of storage (in gigabytes) to be initially allocated for the replication instance.
     * 
     */
    public Optional<Output<Integer>> allocatedStorage() {
        return Optional.ofNullable(this.allocatedStorage);
    }

    /**
     * Indicates that major version upgrades are allowed.
     * 
     */
    @Import(name="allowMajorVersionUpgrade")
    private @Nullable Output<Boolean> allowMajorVersionUpgrade;

    /**
     * @return Indicates that major version upgrades are allowed.
     * 
     */
    public Optional<Output<Boolean>> allowMajorVersionUpgrade() {
        return Optional.ofNullable(this.allowMajorVersionUpgrade);
    }

    /**
     * Indicates whether the changes should be applied immediately or during the next maintenance window. Only used when updating an existing resource.
     * 
     */
    @Import(name="applyImmediately")
    private @Nullable Output<Boolean> applyImmediately;

    /**
     * @return Indicates whether the changes should be applied immediately or during the next maintenance window. Only used when updating an existing resource.
     * 
     */
    public Optional<Output<Boolean>> applyImmediately() {
        return Optional.ofNullable(this.applyImmediately);
    }

    /**
     * Indicates that minor engine upgrades will be applied automatically to the replication instance during the maintenance window.
     * 
     */
    @Import(name="autoMinorVersionUpgrade")
    private @Nullable Output<Boolean> autoMinorVersionUpgrade;

    /**
     * @return Indicates that minor engine upgrades will be applied automatically to the replication instance during the maintenance window.
     * 
     */
    public Optional<Output<Boolean>> autoMinorVersionUpgrade() {
        return Optional.ofNullable(this.autoMinorVersionUpgrade);
    }

    /**
     * The EC2 Availability Zone that the replication instance will be created in.
     * 
     */
    @Import(name="availabilityZone")
    private @Nullable Output<String> availabilityZone;

    /**
     * @return The EC2 Availability Zone that the replication instance will be created in.
     * 
     */
    public Optional<Output<String>> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    /**
     * The engine version number of the replication instance.
     * 
     */
    @Import(name="engineVersion")
    private @Nullable Output<String> engineVersion;

    /**
     * @return The engine version number of the replication instance.
     * 
     */
    public Optional<Output<String>> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    /**
     * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kms_key_arn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
     * 
     */
    @Import(name="kmsKeyArn")
    private @Nullable Output<String> kmsKeyArn;

    /**
     * @return The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kms_key_arn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
     * 
     */
    public Optional<Output<String>> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }

    /**
     * Specifies if the replication instance is a multi-az deployment. You cannot set the `availability_zone` parameter if the `multi_az` parameter is set to `true`.
     * 
     */
    @Import(name="multiAz")
    private @Nullable Output<Boolean> multiAz;

    /**
     * @return Specifies if the replication instance is a multi-az deployment. You cannot set the `availability_zone` parameter if the `multi_az` parameter is set to `true`.
     * 
     */
    public Optional<Output<Boolean>> multiAz() {
        return Optional.ofNullable(this.multiAz);
    }

    /**
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * 
     */
    @Import(name="preferredMaintenanceWindow")
    private @Nullable Output<String> preferredMaintenanceWindow;

    /**
     * @return The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * 
     */
    public Optional<Output<String>> preferredMaintenanceWindow() {
        return Optional.ofNullable(this.preferredMaintenanceWindow);
    }

    /**
     * Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address.
     * 
     */
    @Import(name="publiclyAccessible")
    private @Nullable Output<Boolean> publiclyAccessible;

    /**
     * @return Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address.
     * 
     */
    public Optional<Output<Boolean>> publiclyAccessible() {
        return Optional.ofNullable(this.publiclyAccessible);
    }

    /**
     * The compute and memory capacity of the replication instance as specified by the replication instance class. See [AWS DMS User Guide](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.Types.html) for available instance sizes and advice on which one to choose.
     * 
     */
    @Import(name="replicationInstanceClass", required=true)
    private Output<String> replicationInstanceClass;

    /**
     * @return The compute and memory capacity of the replication instance as specified by the replication instance class. See [AWS DMS User Guide](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.Types.html) for available instance sizes and advice on which one to choose.
     * 
     */
    public Output<String> replicationInstanceClass() {
        return this.replicationInstanceClass;
    }

    /**
     * The replication instance identifier. This parameter is stored as a lowercase string.
     * 
     */
    @Import(name="replicationInstanceId", required=true)
    private Output<String> replicationInstanceId;

    /**
     * @return The replication instance identifier. This parameter is stored as a lowercase string.
     * 
     */
    public Output<String> replicationInstanceId() {
        return this.replicationInstanceId;
    }

    /**
     * A subnet group to associate with the replication instance.
     * 
     */
    @Import(name="replicationSubnetGroupId")
    private @Nullable Output<String> replicationSubnetGroupId;

    /**
     * @return A subnet group to associate with the replication instance.
     * 
     */
    public Optional<Output<String>> replicationSubnetGroupId() {
        return Optional.ofNullable(this.replicationSubnetGroupId);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A list of VPC security group IDs to be used with the replication instance. The VPC security groups must work with the VPC containing the replication instance.
     * 
     */
    @Import(name="vpcSecurityGroupIds")
    private @Nullable Output<List<String>> vpcSecurityGroupIds;

    /**
     * @return A list of VPC security group IDs to be used with the replication instance. The VPC security groups must work with the VPC containing the replication instance.
     * 
     */
    public Optional<Output<List<String>>> vpcSecurityGroupIds() {
        return Optional.ofNullable(this.vpcSecurityGroupIds);
    }

    private ReplicationInstanceArgs() {}

    private ReplicationInstanceArgs(ReplicationInstanceArgs $) {
        this.allocatedStorage = $.allocatedStorage;
        this.allowMajorVersionUpgrade = $.allowMajorVersionUpgrade;
        this.applyImmediately = $.applyImmediately;
        this.autoMinorVersionUpgrade = $.autoMinorVersionUpgrade;
        this.availabilityZone = $.availabilityZone;
        this.engineVersion = $.engineVersion;
        this.kmsKeyArn = $.kmsKeyArn;
        this.multiAz = $.multiAz;
        this.preferredMaintenanceWindow = $.preferredMaintenanceWindow;
        this.publiclyAccessible = $.publiclyAccessible;
        this.replicationInstanceClass = $.replicationInstanceClass;
        this.replicationInstanceId = $.replicationInstanceId;
        this.replicationSubnetGroupId = $.replicationSubnetGroupId;
        this.tags = $.tags;
        this.vpcSecurityGroupIds = $.vpcSecurityGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationInstanceArgs $;

        public Builder() {
            $ = new ReplicationInstanceArgs();
        }

        public Builder(ReplicationInstanceArgs defaults) {
            $ = new ReplicationInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocatedStorage The amount of storage (in gigabytes) to be initially allocated for the replication instance.
         * 
         * @return builder
         * 
         */
        public Builder allocatedStorage(@Nullable Output<Integer> allocatedStorage) {
            $.allocatedStorage = allocatedStorage;
            return this;
        }

        /**
         * @param allocatedStorage The amount of storage (in gigabytes) to be initially allocated for the replication instance.
         * 
         * @return builder
         * 
         */
        public Builder allocatedStorage(Integer allocatedStorage) {
            return allocatedStorage(Output.of(allocatedStorage));
        }

        /**
         * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed.
         * 
         * @return builder
         * 
         */
        public Builder allowMajorVersionUpgrade(@Nullable Output<Boolean> allowMajorVersionUpgrade) {
            $.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
            return this;
        }

        /**
         * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed.
         * 
         * @return builder
         * 
         */
        public Builder allowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
            return allowMajorVersionUpgrade(Output.of(allowMajorVersionUpgrade));
        }

        /**
         * @param applyImmediately Indicates whether the changes should be applied immediately or during the next maintenance window. Only used when updating an existing resource.
         * 
         * @return builder
         * 
         */
        public Builder applyImmediately(@Nullable Output<Boolean> applyImmediately) {
            $.applyImmediately = applyImmediately;
            return this;
        }

        /**
         * @param applyImmediately Indicates whether the changes should be applied immediately or during the next maintenance window. Only used when updating an existing resource.
         * 
         * @return builder
         * 
         */
        public Builder applyImmediately(Boolean applyImmediately) {
            return applyImmediately(Output.of(applyImmediately));
        }

        /**
         * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to the replication instance during the maintenance window.
         * 
         * @return builder
         * 
         */
        public Builder autoMinorVersionUpgrade(@Nullable Output<Boolean> autoMinorVersionUpgrade) {
            $.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            return this;
        }

        /**
         * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to the replication instance during the maintenance window.
         * 
         * @return builder
         * 
         */
        public Builder autoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
            return autoMinorVersionUpgrade(Output.of(autoMinorVersionUpgrade));
        }

        /**
         * @param availabilityZone The EC2 Availability Zone that the replication instance will be created in.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * @param availabilityZone The EC2 Availability Zone that the replication instance will be created in.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(String availabilityZone) {
            return availabilityZone(Output.of(availabilityZone));
        }

        /**
         * @param engineVersion The engine version number of the replication instance.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        /**
         * @param engineVersion The engine version number of the replication instance.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(String engineVersion) {
            return engineVersion(Output.of(engineVersion));
        }

        /**
         * @param kmsKeyArn The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kms_key_arn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            $.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * @param kmsKeyArn The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kms_key_arn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyArn(String kmsKeyArn) {
            return kmsKeyArn(Output.of(kmsKeyArn));
        }

        /**
         * @param multiAz Specifies if the replication instance is a multi-az deployment. You cannot set the `availability_zone` parameter if the `multi_az` parameter is set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder multiAz(@Nullable Output<Boolean> multiAz) {
            $.multiAz = multiAz;
            return this;
        }

        /**
         * @param multiAz Specifies if the replication instance is a multi-az deployment. You cannot set the `availability_zone` parameter if the `multi_az` parameter is set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder multiAz(Boolean multiAz) {
            return multiAz(Output.of(multiAz));
        }

        /**
         * @param preferredMaintenanceWindow The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
         * 
         * @return builder
         * 
         */
        public Builder preferredMaintenanceWindow(@Nullable Output<String> preferredMaintenanceWindow) {
            $.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }

        /**
         * @param preferredMaintenanceWindow The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
         * 
         * @return builder
         * 
         */
        public Builder preferredMaintenanceWindow(String preferredMaintenanceWindow) {
            return preferredMaintenanceWindow(Output.of(preferredMaintenanceWindow));
        }

        /**
         * @param publiclyAccessible Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address.
         * 
         * @return builder
         * 
         */
        public Builder publiclyAccessible(@Nullable Output<Boolean> publiclyAccessible) {
            $.publiclyAccessible = publiclyAccessible;
            return this;
        }

        /**
         * @param publiclyAccessible Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address.
         * 
         * @return builder
         * 
         */
        public Builder publiclyAccessible(Boolean publiclyAccessible) {
            return publiclyAccessible(Output.of(publiclyAccessible));
        }

        /**
         * @param replicationInstanceClass The compute and memory capacity of the replication instance as specified by the replication instance class. See [AWS DMS User Guide](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.Types.html) for available instance sizes and advice on which one to choose.
         * 
         * @return builder
         * 
         */
        public Builder replicationInstanceClass(Output<String> replicationInstanceClass) {
            $.replicationInstanceClass = replicationInstanceClass;
            return this;
        }

        /**
         * @param replicationInstanceClass The compute and memory capacity of the replication instance as specified by the replication instance class. See [AWS DMS User Guide](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.Types.html) for available instance sizes and advice on which one to choose.
         * 
         * @return builder
         * 
         */
        public Builder replicationInstanceClass(String replicationInstanceClass) {
            return replicationInstanceClass(Output.of(replicationInstanceClass));
        }

        /**
         * @param replicationInstanceId The replication instance identifier. This parameter is stored as a lowercase string.
         * 
         * @return builder
         * 
         */
        public Builder replicationInstanceId(Output<String> replicationInstanceId) {
            $.replicationInstanceId = replicationInstanceId;
            return this;
        }

        /**
         * @param replicationInstanceId The replication instance identifier. This parameter is stored as a lowercase string.
         * 
         * @return builder
         * 
         */
        public Builder replicationInstanceId(String replicationInstanceId) {
            return replicationInstanceId(Output.of(replicationInstanceId));
        }

        /**
         * @param replicationSubnetGroupId A subnet group to associate with the replication instance.
         * 
         * @return builder
         * 
         */
        public Builder replicationSubnetGroupId(@Nullable Output<String> replicationSubnetGroupId) {
            $.replicationSubnetGroupId = replicationSubnetGroupId;
            return this;
        }

        /**
         * @param replicationSubnetGroupId A subnet group to associate with the replication instance.
         * 
         * @return builder
         * 
         */
        public Builder replicationSubnetGroupId(String replicationSubnetGroupId) {
            return replicationSubnetGroupId(Output.of(replicationSubnetGroupId));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcSecurityGroupIds A list of VPC security group IDs to be used with the replication instance. The VPC security groups must work with the VPC containing the replication instance.
         * 
         * @return builder
         * 
         */
        public Builder vpcSecurityGroupIds(@Nullable Output<List<String>> vpcSecurityGroupIds) {
            $.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        /**
         * @param vpcSecurityGroupIds A list of VPC security group IDs to be used with the replication instance. The VPC security groups must work with the VPC containing the replication instance.
         * 
         * @return builder
         * 
         */
        public Builder vpcSecurityGroupIds(List<String> vpcSecurityGroupIds) {
            return vpcSecurityGroupIds(Output.of(vpcSecurityGroupIds));
        }

        /**
         * @param vpcSecurityGroupIds A list of VPC security group IDs to be used with the replication instance. The VPC security groups must work with the VPC containing the replication instance.
         * 
         * @return builder
         * 
         */
        public Builder vpcSecurityGroupIds(String... vpcSecurityGroupIds) {
            return vpcSecurityGroupIds(List.of(vpcSecurityGroupIds));
        }

        public ReplicationInstanceArgs build() {
            $.replicationInstanceClass = Objects.requireNonNull($.replicationInstanceClass, "expected parameter 'replicationInstanceClass' to be non-null");
            $.replicationInstanceId = Objects.requireNonNull($.replicationInstanceId, "expected parameter 'replicationInstanceId' to be non-null");
            return $;
        }
    }

}
