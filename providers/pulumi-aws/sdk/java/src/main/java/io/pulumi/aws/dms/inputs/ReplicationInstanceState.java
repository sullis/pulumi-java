// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dms.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicationInstanceState extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationInstanceState Empty = new ReplicationInstanceState();

    /**
     * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
     * 
     */
    @Import(name="allocatedStorage")
      private final @Nullable Output<Integer> allocatedStorage;

    public Output<Integer> allocatedStorage() {
        return this.allocatedStorage == null ? Codegen.empty() : this.allocatedStorage;
    }

    /**
     * Indicates that major version upgrades are allowed.
     * 
     */
    @Import(name="allowMajorVersionUpgrade")
      private final @Nullable Output<Boolean> allowMajorVersionUpgrade;

    public Output<Boolean> allowMajorVersionUpgrade() {
        return this.allowMajorVersionUpgrade == null ? Codegen.empty() : this.allowMajorVersionUpgrade;
    }

    /**
     * Indicates whether the changes should be applied immediately or during the next maintenance window. Only used when updating an existing resource.
     * 
     */
    @Import(name="applyImmediately")
      private final @Nullable Output<Boolean> applyImmediately;

    public Output<Boolean> applyImmediately() {
        return this.applyImmediately == null ? Codegen.empty() : this.applyImmediately;
    }

    /**
     * Indicates that minor engine upgrades will be applied automatically to the replication instance during the maintenance window.
     * 
     */
    @Import(name="autoMinorVersionUpgrade")
      private final @Nullable Output<Boolean> autoMinorVersionUpgrade;

    public Output<Boolean> autoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade == null ? Codegen.empty() : this.autoMinorVersionUpgrade;
    }

    /**
     * The EC2 Availability Zone that the replication instance will be created in.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> availabilityZone() {
        return this.availabilityZone == null ? Codegen.empty() : this.availabilityZone;
    }

    /**
     * The engine version number of the replication instance.
     * 
     */
    @Import(name="engineVersion")
      private final @Nullable Output<String> engineVersion;

    public Output<String> engineVersion() {
        return this.engineVersion == null ? Codegen.empty() : this.engineVersion;
    }

    /**
     * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kms_key_arn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
     * 
     */
    @Import(name="kmsKeyArn")
      private final @Nullable Output<String> kmsKeyArn;

    public Output<String> kmsKeyArn() {
        return this.kmsKeyArn == null ? Codegen.empty() : this.kmsKeyArn;
    }

    /**
     * Specifies if the replication instance is a multi-az deployment. You cannot set the `availability_zone` parameter if the `multi_az` parameter is set to `true`.
     * 
     */
    @Import(name="multiAz")
      private final @Nullable Output<Boolean> multiAz;

    public Output<Boolean> multiAz() {
        return this.multiAz == null ? Codegen.empty() : this.multiAz;
    }

    /**
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * 
     */
    @Import(name="preferredMaintenanceWindow")
      private final @Nullable Output<String> preferredMaintenanceWindow;

    public Output<String> preferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow == null ? Codegen.empty() : this.preferredMaintenanceWindow;
    }

    /**
     * Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address.
     * 
     */
    @Import(name="publiclyAccessible")
      private final @Nullable Output<Boolean> publiclyAccessible;

    public Output<Boolean> publiclyAccessible() {
        return this.publiclyAccessible == null ? Codegen.empty() : this.publiclyAccessible;
    }

    /**
     * The Amazon Resource Name (ARN) of the replication instance.
     * 
     */
    @Import(name="replicationInstanceArn")
      private final @Nullable Output<String> replicationInstanceArn;

    public Output<String> replicationInstanceArn() {
        return this.replicationInstanceArn == null ? Codegen.empty() : this.replicationInstanceArn;
    }

    /**
     * The compute and memory capacity of the replication instance as specified by the replication instance class. See [AWS DMS User Guide](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.Types.html) for available instance sizes and advice on which one to choose.
     * 
     */
    @Import(name="replicationInstanceClass")
      private final @Nullable Output<String> replicationInstanceClass;

    public Output<String> replicationInstanceClass() {
        return this.replicationInstanceClass == null ? Codegen.empty() : this.replicationInstanceClass;
    }

    /**
     * The replication instance identifier. This parameter is stored as a lowercase string.
     * 
     */
    @Import(name="replicationInstanceId")
      private final @Nullable Output<String> replicationInstanceId;

    public Output<String> replicationInstanceId() {
        return this.replicationInstanceId == null ? Codegen.empty() : this.replicationInstanceId;
    }

    /**
     * A list of the private IP addresses of the replication instance.
     * 
     */
    @Import(name="replicationInstancePrivateIps")
      private final @Nullable Output<List<String>> replicationInstancePrivateIps;

    public Output<List<String>> replicationInstancePrivateIps() {
        return this.replicationInstancePrivateIps == null ? Codegen.empty() : this.replicationInstancePrivateIps;
    }

    /**
     * A list of the public IP addresses of the replication instance.
     * 
     */
    @Import(name="replicationInstancePublicIps")
      private final @Nullable Output<List<String>> replicationInstancePublicIps;

    public Output<List<String>> replicationInstancePublicIps() {
        return this.replicationInstancePublicIps == null ? Codegen.empty() : this.replicationInstancePublicIps;
    }

    /**
     * A subnet group to associate with the replication instance.
     * 
     */
    @Import(name="replicationSubnetGroupId")
      private final @Nullable Output<String> replicationSubnetGroupId;

    public Output<String> replicationSubnetGroupId() {
        return this.replicationSubnetGroupId == null ? Codegen.empty() : this.replicationSubnetGroupId;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * A list of VPC security group IDs to be used with the replication instance. The VPC security groups must work with the VPC containing the replication instance.
     * 
     */
    @Import(name="vpcSecurityGroupIds")
      private final @Nullable Output<List<String>> vpcSecurityGroupIds;

    public Output<List<String>> vpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds == null ? Codegen.empty() : this.vpcSecurityGroupIds;
    }

    public ReplicationInstanceState(
        @Nullable Output<Integer> allocatedStorage,
        @Nullable Output<Boolean> allowMajorVersionUpgrade,
        @Nullable Output<Boolean> applyImmediately,
        @Nullable Output<Boolean> autoMinorVersionUpgrade,
        @Nullable Output<String> availabilityZone,
        @Nullable Output<String> engineVersion,
        @Nullable Output<String> kmsKeyArn,
        @Nullable Output<Boolean> multiAz,
        @Nullable Output<String> preferredMaintenanceWindow,
        @Nullable Output<Boolean> publiclyAccessible,
        @Nullable Output<String> replicationInstanceArn,
        @Nullable Output<String> replicationInstanceClass,
        @Nullable Output<String> replicationInstanceId,
        @Nullable Output<List<String>> replicationInstancePrivateIps,
        @Nullable Output<List<String>> replicationInstancePublicIps,
        @Nullable Output<String> replicationSubnetGroupId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<List<String>> vpcSecurityGroupIds) {
        this.allocatedStorage = allocatedStorage;
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
        this.applyImmediately = applyImmediately;
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        this.availabilityZone = availabilityZone;
        this.engineVersion = engineVersion;
        this.kmsKeyArn = kmsKeyArn;
        this.multiAz = multiAz;
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        this.publiclyAccessible = publiclyAccessible;
        this.replicationInstanceArn = replicationInstanceArn;
        this.replicationInstanceClass = replicationInstanceClass;
        this.replicationInstanceId = replicationInstanceId;
        this.replicationInstancePrivateIps = replicationInstancePrivateIps;
        this.replicationInstancePublicIps = replicationInstancePublicIps;
        this.replicationSubnetGroupId = replicationSubnetGroupId;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
    }

    private ReplicationInstanceState() {
        this.allocatedStorage = Codegen.empty();
        this.allowMajorVersionUpgrade = Codegen.empty();
        this.applyImmediately = Codegen.empty();
        this.autoMinorVersionUpgrade = Codegen.empty();
        this.availabilityZone = Codegen.empty();
        this.engineVersion = Codegen.empty();
        this.kmsKeyArn = Codegen.empty();
        this.multiAz = Codegen.empty();
        this.preferredMaintenanceWindow = Codegen.empty();
        this.publiclyAccessible = Codegen.empty();
        this.replicationInstanceArn = Codegen.empty();
        this.replicationInstanceClass = Codegen.empty();
        this.replicationInstanceId = Codegen.empty();
        this.replicationInstancePrivateIps = Codegen.empty();
        this.replicationInstancePublicIps = Codegen.empty();
        this.replicationSubnetGroupId = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.vpcSecurityGroupIds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationInstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> allocatedStorage;
        private @Nullable Output<Boolean> allowMajorVersionUpgrade;
        private @Nullable Output<Boolean> applyImmediately;
        private @Nullable Output<Boolean> autoMinorVersionUpgrade;
        private @Nullable Output<String> availabilityZone;
        private @Nullable Output<String> engineVersion;
        private @Nullable Output<String> kmsKeyArn;
        private @Nullable Output<Boolean> multiAz;
        private @Nullable Output<String> preferredMaintenanceWindow;
        private @Nullable Output<Boolean> publiclyAccessible;
        private @Nullable Output<String> replicationInstanceArn;
        private @Nullable Output<String> replicationInstanceClass;
        private @Nullable Output<String> replicationInstanceId;
        private @Nullable Output<List<String>> replicationInstancePrivateIps;
        private @Nullable Output<List<String>> replicationInstancePublicIps;
        private @Nullable Output<String> replicationSubnetGroupId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<List<String>> vpcSecurityGroupIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationInstanceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedStorage = defaults.allocatedStorage;
    	      this.allowMajorVersionUpgrade = defaults.allowMajorVersionUpgrade;
    	      this.applyImmediately = defaults.applyImmediately;
    	      this.autoMinorVersionUpgrade = defaults.autoMinorVersionUpgrade;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.engineVersion = defaults.engineVersion;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.multiAz = defaults.multiAz;
    	      this.preferredMaintenanceWindow = defaults.preferredMaintenanceWindow;
    	      this.publiclyAccessible = defaults.publiclyAccessible;
    	      this.replicationInstanceArn = defaults.replicationInstanceArn;
    	      this.replicationInstanceClass = defaults.replicationInstanceClass;
    	      this.replicationInstanceId = defaults.replicationInstanceId;
    	      this.replicationInstancePrivateIps = defaults.replicationInstancePrivateIps;
    	      this.replicationInstancePublicIps = defaults.replicationInstancePublicIps;
    	      this.replicationSubnetGroupId = defaults.replicationSubnetGroupId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
        }

        public Builder allocatedStorage(@Nullable Output<Integer> allocatedStorage) {
            this.allocatedStorage = allocatedStorage;
            return this;
        }
        public Builder allocatedStorage(@Nullable Integer allocatedStorage) {
            this.allocatedStorage = Codegen.ofNullable(allocatedStorage);
            return this;
        }
        public Builder allowMajorVersionUpgrade(@Nullable Output<Boolean> allowMajorVersionUpgrade) {
            this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
            return this;
        }
        public Builder allowMajorVersionUpgrade(@Nullable Boolean allowMajorVersionUpgrade) {
            this.allowMajorVersionUpgrade = Codegen.ofNullable(allowMajorVersionUpgrade);
            return this;
        }
        public Builder applyImmediately(@Nullable Output<Boolean> applyImmediately) {
            this.applyImmediately = applyImmediately;
            return this;
        }
        public Builder applyImmediately(@Nullable Boolean applyImmediately) {
            this.applyImmediately = Codegen.ofNullable(applyImmediately);
            return this;
        }
        public Builder autoMinorVersionUpgrade(@Nullable Output<Boolean> autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            return this;
        }
        public Builder autoMinorVersionUpgrade(@Nullable Boolean autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = Codegen.ofNullable(autoMinorVersionUpgrade);
            return this;
        }
        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Codegen.ofNullable(availabilityZone);
            return this;
        }
        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public Builder engineVersion(@Nullable String engineVersion) {
            this.engineVersion = Codegen.ofNullable(engineVersion);
            return this;
        }
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Codegen.ofNullable(kmsKeyArn);
            return this;
        }
        public Builder multiAz(@Nullable Output<Boolean> multiAz) {
            this.multiAz = multiAz;
            return this;
        }
        public Builder multiAz(@Nullable Boolean multiAz) {
            this.multiAz = Codegen.ofNullable(multiAz);
            return this;
        }
        public Builder preferredMaintenanceWindow(@Nullable Output<String> preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }
        public Builder preferredMaintenanceWindow(@Nullable String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = Codegen.ofNullable(preferredMaintenanceWindow);
            return this;
        }
        public Builder publiclyAccessible(@Nullable Output<Boolean> publiclyAccessible) {
            this.publiclyAccessible = publiclyAccessible;
            return this;
        }
        public Builder publiclyAccessible(@Nullable Boolean publiclyAccessible) {
            this.publiclyAccessible = Codegen.ofNullable(publiclyAccessible);
            return this;
        }
        public Builder replicationInstanceArn(@Nullable Output<String> replicationInstanceArn) {
            this.replicationInstanceArn = replicationInstanceArn;
            return this;
        }
        public Builder replicationInstanceArn(@Nullable String replicationInstanceArn) {
            this.replicationInstanceArn = Codegen.ofNullable(replicationInstanceArn);
            return this;
        }
        public Builder replicationInstanceClass(@Nullable Output<String> replicationInstanceClass) {
            this.replicationInstanceClass = replicationInstanceClass;
            return this;
        }
        public Builder replicationInstanceClass(@Nullable String replicationInstanceClass) {
            this.replicationInstanceClass = Codegen.ofNullable(replicationInstanceClass);
            return this;
        }
        public Builder replicationInstanceId(@Nullable Output<String> replicationInstanceId) {
            this.replicationInstanceId = replicationInstanceId;
            return this;
        }
        public Builder replicationInstanceId(@Nullable String replicationInstanceId) {
            this.replicationInstanceId = Codegen.ofNullable(replicationInstanceId);
            return this;
        }
        public Builder replicationInstancePrivateIps(@Nullable Output<List<String>> replicationInstancePrivateIps) {
            this.replicationInstancePrivateIps = replicationInstancePrivateIps;
            return this;
        }
        public Builder replicationInstancePrivateIps(@Nullable List<String> replicationInstancePrivateIps) {
            this.replicationInstancePrivateIps = Codegen.ofNullable(replicationInstancePrivateIps);
            return this;
        }
        public Builder replicationInstancePrivateIps(String... replicationInstancePrivateIps) {
            return replicationInstancePrivateIps(List.of(replicationInstancePrivateIps));
        }
        public Builder replicationInstancePublicIps(@Nullable Output<List<String>> replicationInstancePublicIps) {
            this.replicationInstancePublicIps = replicationInstancePublicIps;
            return this;
        }
        public Builder replicationInstancePublicIps(@Nullable List<String> replicationInstancePublicIps) {
            this.replicationInstancePublicIps = Codegen.ofNullable(replicationInstancePublicIps);
            return this;
        }
        public Builder replicationInstancePublicIps(String... replicationInstancePublicIps) {
            return replicationInstancePublicIps(List.of(replicationInstancePublicIps));
        }
        public Builder replicationSubnetGroupId(@Nullable Output<String> replicationSubnetGroupId) {
            this.replicationSubnetGroupId = replicationSubnetGroupId;
            return this;
        }
        public Builder replicationSubnetGroupId(@Nullable String replicationSubnetGroupId) {
            this.replicationSubnetGroupId = Codegen.ofNullable(replicationSubnetGroupId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder vpcSecurityGroupIds(@Nullable Output<List<String>> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }
        public Builder vpcSecurityGroupIds(@Nullable List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Codegen.ofNullable(vpcSecurityGroupIds);
            return this;
        }
        public Builder vpcSecurityGroupIds(String... vpcSecurityGroupIds) {
            return vpcSecurityGroupIds(List.of(vpcSecurityGroupIds));
        }        public ReplicationInstanceState build() {
            return new ReplicationInstanceState(allocatedStorage, allowMajorVersionUpgrade, applyImmediately, autoMinorVersionUpgrade, availabilityZone, engineVersion, kmsKeyArn, multiAz, preferredMaintenanceWindow, publiclyAccessible, replicationInstanceArn, replicationInstanceClass, replicationInstanceId, replicationInstancePrivateIps, replicationInstancePublicIps, replicationSubnetGroupId, tags, tagsAll, vpcSecurityGroupIds);
        }
    }
}
