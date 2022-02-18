// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb;

import io.pulumi.awsnative.memorydb.inputs.ClusterEndpointArgs;
import io.pulumi.awsnative.memorydb.inputs.ClusterTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * The name of the Access Control List to associate with the cluster.
     * 
     */
    @InputImport(name="aCLName", required=true)
    private final Input<String> aCLName;

    public Input<String> getACLName() {
        return this.aCLName;
    }

    /**
     * A flag that enables automatic minor version upgrade when set to true.
     * 
     * You cannot modify the value of AutoMinorVersionUpgrade after the cluster is created. To enable AutoMinorVersionUpgrade on a cluster you must set AutoMinorVersionUpgrade to true when you create a cluster.
     * 
     */
    @InputImport(name="autoMinorVersionUpgrade")
    private final @Nullable Input<Boolean> autoMinorVersionUpgrade;

    public Input<Boolean> getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade == null ? Input.empty() : this.autoMinorVersionUpgrade;
    }

    /**
     * The cluster endpoint.
     * 
     */
    @InputImport(name="clusterEndpoint")
    private final @Nullable Input<ClusterEndpointArgs> clusterEndpoint;

    public Input<ClusterEndpointArgs> getClusterEndpoint() {
        return this.clusterEndpoint == null ? Input.empty() : this.clusterEndpoint;
    }

    /**
     * The name of the cluster. This value must be unique as it also serves as the cluster identifier.
     * 
     */
    @InputImport(name="clusterName")
    private final @Nullable Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName == null ? Input.empty() : this.clusterName;
    }

    /**
     * An optional description of the cluster.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The Redis engine version used by the cluster.
     * 
     */
    @InputImport(name="engineVersion")
    private final @Nullable Input<String> engineVersion;

    public Input<String> getEngineVersion() {
        return this.engineVersion == null ? Input.empty() : this.engineVersion;
    }

    /**
     * The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot. MemoryDB creates the snapshot, and then deletes the cluster immediately afterward.
     * 
     */
    @InputImport(name="finalSnapshotName")
    private final @Nullable Input<String> finalSnapshotName;

    public Input<String> getFinalSnapshotName() {
        return this.finalSnapshotName == null ? Input.empty() : this.finalSnapshotName;
    }

    /**
     * The ID of the KMS key used to encrypt the cluster.
     * 
     */
    @InputImport(name="kmsKeyId")
    private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * 
     */
    @InputImport(name="maintenanceWindow")
    private final @Nullable Input<String> maintenanceWindow;

    public Input<String> getMaintenanceWindow() {
        return this.maintenanceWindow == null ? Input.empty() : this.maintenanceWindow;
    }

    /**
     * The compute and memory capacity of the nodes in the cluster.
     * 
     */
    @InputImport(name="nodeType", required=true)
    private final Input<String> nodeType;

    public Input<String> getNodeType() {
        return this.nodeType;
    }

    /**
     * The number of replicas to apply to each shard. The limit is 5.
     * 
     */
    @InputImport(name="numReplicasPerShard")
    private final @Nullable Input<Integer> numReplicasPerShard;

    public Input<Integer> getNumReplicasPerShard() {
        return this.numReplicasPerShard == null ? Input.empty() : this.numReplicasPerShard;
    }

    /**
     * The number of shards the cluster will contain.
     * 
     */
    @InputImport(name="numShards")
    private final @Nullable Input<Integer> numShards;

    public Input<Integer> getNumShards() {
        return this.numShards == null ? Input.empty() : this.numShards;
    }

    /**
     * The name of the parameter group associated with the cluster.
     * 
     */
    @InputImport(name="parameterGroupName")
    private final @Nullable Input<String> parameterGroupName;

    public Input<String> getParameterGroupName() {
        return this.parameterGroupName == null ? Input.empty() : this.parameterGroupName;
    }

    /**
     * The port number on which each member of the cluster accepts connections.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * One or more Amazon VPC security groups associated with this cluster.
     * 
     */
    @InputImport(name="securityGroupIds")
    private final @Nullable Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Input.empty() : this.securityGroupIds;
    }

    /**
     * A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in Amazon S3. The snapshot files are used to populate the new cluster. The Amazon S3 object name in the ARN cannot contain any commas.
     * 
     */
    @InputImport(name="snapshotArns")
    private final @Nullable Input<List<String>> snapshotArns;

    public Input<List<String>> getSnapshotArns() {
        return this.snapshotArns == null ? Input.empty() : this.snapshotArns;
    }

    /**
     * The name of a snapshot from which to restore data into the new cluster. The snapshot status changes to restoring while the new cluster is being created.
     * 
     */
    @InputImport(name="snapshotName")
    private final @Nullable Input<String> snapshotName;

    public Input<String> getSnapshotName() {
        return this.snapshotName == null ? Input.empty() : this.snapshotName;
    }

    /**
     * The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.
     * 
     */
    @InputImport(name="snapshotRetentionLimit")
    private final @Nullable Input<Integer> snapshotRetentionLimit;

    public Input<Integer> getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit == null ? Input.empty() : this.snapshotRetentionLimit;
    }

    /**
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your cluster.
     * 
     */
    @InputImport(name="snapshotWindow")
    private final @Nullable Input<String> snapshotWindow;

    public Input<String> getSnapshotWindow() {
        return this.snapshotWindow == null ? Input.empty() : this.snapshotWindow;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which notifications are sent.
     * 
     */
    @InputImport(name="snsTopicArn")
    private final @Nullable Input<String> snsTopicArn;

    public Input<String> getSnsTopicArn() {
        return this.snsTopicArn == null ? Input.empty() : this.snsTopicArn;
    }

    /**
     * The status of the Amazon SNS notification topic. Notifications are sent only if the status is enabled.
     * 
     */
    @InputImport(name="snsTopicStatus")
    private final @Nullable Input<String> snsTopicStatus;

    public Input<String> getSnsTopicStatus() {
        return this.snsTopicStatus == null ? Input.empty() : this.snsTopicStatus;
    }

    /**
     * The name of the subnet group to be used for the cluster.
     * 
     */
    @InputImport(name="subnetGroupName")
    private final @Nullable Input<String> subnetGroupName;

    public Input<String> getSubnetGroupName() {
        return this.subnetGroupName == null ? Input.empty() : this.subnetGroupName;
    }

    /**
     * A flag that enables in-transit encryption when set to true.
     * 
     * You cannot modify the value of TransitEncryptionEnabled after the cluster is created. To enable in-transit encryption on a cluster you must set TransitEncryptionEnabled to true when you create a cluster.
     * 
     */
    @InputImport(name="tLSEnabled")
    private final @Nullable Input<Boolean> tLSEnabled;

    public Input<Boolean> getTLSEnabled() {
        return this.tLSEnabled == null ? Input.empty() : this.tLSEnabled;
    }

    /**
     * An array of key-value pairs to apply to this cluster.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<ClusterTagArgs>> tags;

    public Input<List<ClusterTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ClusterArgs(
        Input<String> aCLName,
        @Nullable Input<Boolean> autoMinorVersionUpgrade,
        @Nullable Input<ClusterEndpointArgs> clusterEndpoint,
        @Nullable Input<String> clusterName,
        @Nullable Input<String> description,
        @Nullable Input<String> engineVersion,
        @Nullable Input<String> finalSnapshotName,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<String> maintenanceWindow,
        Input<String> nodeType,
        @Nullable Input<Integer> numReplicasPerShard,
        @Nullable Input<Integer> numShards,
        @Nullable Input<String> parameterGroupName,
        @Nullable Input<Integer> port,
        @Nullable Input<List<String>> securityGroupIds,
        @Nullable Input<List<String>> snapshotArns,
        @Nullable Input<String> snapshotName,
        @Nullable Input<Integer> snapshotRetentionLimit,
        @Nullable Input<String> snapshotWindow,
        @Nullable Input<String> snsTopicArn,
        @Nullable Input<String> snsTopicStatus,
        @Nullable Input<String> subnetGroupName,
        @Nullable Input<Boolean> tLSEnabled,
        @Nullable Input<List<ClusterTagArgs>> tags) {
        this.aCLName = Objects.requireNonNull(aCLName, "expected parameter 'aCLName' to be non-null");
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        this.clusterEndpoint = clusterEndpoint;
        this.clusterName = clusterName;
        this.description = description;
        this.engineVersion = engineVersion;
        this.finalSnapshotName = finalSnapshotName;
        this.kmsKeyId = kmsKeyId;
        this.maintenanceWindow = maintenanceWindow;
        this.nodeType = Objects.requireNonNull(nodeType, "expected parameter 'nodeType' to be non-null");
        this.numReplicasPerShard = numReplicasPerShard;
        this.numShards = numShards;
        this.parameterGroupName = parameterGroupName;
        this.port = port;
        this.securityGroupIds = securityGroupIds;
        this.snapshotArns = snapshotArns;
        this.snapshotName = snapshotName;
        this.snapshotRetentionLimit = snapshotRetentionLimit;
        this.snapshotWindow = snapshotWindow;
        this.snsTopicArn = snsTopicArn;
        this.snsTopicStatus = snsTopicStatus;
        this.subnetGroupName = subnetGroupName;
        this.tLSEnabled = tLSEnabled;
        this.tags = tags;
    }

    private ClusterArgs() {
        this.aCLName = Input.empty();
        this.autoMinorVersionUpgrade = Input.empty();
        this.clusterEndpoint = Input.empty();
        this.clusterName = Input.empty();
        this.description = Input.empty();
        this.engineVersion = Input.empty();
        this.finalSnapshotName = Input.empty();
        this.kmsKeyId = Input.empty();
        this.maintenanceWindow = Input.empty();
        this.nodeType = Input.empty();
        this.numReplicasPerShard = Input.empty();
        this.numShards = Input.empty();
        this.parameterGroupName = Input.empty();
        this.port = Input.empty();
        this.securityGroupIds = Input.empty();
        this.snapshotArns = Input.empty();
        this.snapshotName = Input.empty();
        this.snapshotRetentionLimit = Input.empty();
        this.snapshotWindow = Input.empty();
        this.snsTopicArn = Input.empty();
        this.snsTopicStatus = Input.empty();
        this.subnetGroupName = Input.empty();
        this.tLSEnabled = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> aCLName;
        private @Nullable Input<Boolean> autoMinorVersionUpgrade;
        private @Nullable Input<ClusterEndpointArgs> clusterEndpoint;
        private @Nullable Input<String> clusterName;
        private @Nullable Input<String> description;
        private @Nullable Input<String> engineVersion;
        private @Nullable Input<String> finalSnapshotName;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<String> maintenanceWindow;
        private Input<String> nodeType;
        private @Nullable Input<Integer> numReplicasPerShard;
        private @Nullable Input<Integer> numShards;
        private @Nullable Input<String> parameterGroupName;
        private @Nullable Input<Integer> port;
        private @Nullable Input<List<String>> securityGroupIds;
        private @Nullable Input<List<String>> snapshotArns;
        private @Nullable Input<String> snapshotName;
        private @Nullable Input<Integer> snapshotRetentionLimit;
        private @Nullable Input<String> snapshotWindow;
        private @Nullable Input<String> snsTopicArn;
        private @Nullable Input<String> snsTopicStatus;
        private @Nullable Input<String> subnetGroupName;
        private @Nullable Input<Boolean> tLSEnabled;
        private @Nullable Input<List<ClusterTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aCLName = defaults.aCLName;
    	      this.autoMinorVersionUpgrade = defaults.autoMinorVersionUpgrade;
    	      this.clusterEndpoint = defaults.clusterEndpoint;
    	      this.clusterName = defaults.clusterName;
    	      this.description = defaults.description;
    	      this.engineVersion = defaults.engineVersion;
    	      this.finalSnapshotName = defaults.finalSnapshotName;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.nodeType = defaults.nodeType;
    	      this.numReplicasPerShard = defaults.numReplicasPerShard;
    	      this.numShards = defaults.numShards;
    	      this.parameterGroupName = defaults.parameterGroupName;
    	      this.port = defaults.port;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.snapshotArns = defaults.snapshotArns;
    	      this.snapshotName = defaults.snapshotName;
    	      this.snapshotRetentionLimit = defaults.snapshotRetentionLimit;
    	      this.snapshotWindow = defaults.snapshotWindow;
    	      this.snsTopicArn = defaults.snsTopicArn;
    	      this.snsTopicStatus = defaults.snsTopicStatus;
    	      this.subnetGroupName = defaults.subnetGroupName;
    	      this.tLSEnabled = defaults.tLSEnabled;
    	      this.tags = defaults.tags;
        }

        public Builder setACLName(Input<String> aCLName) {
            this.aCLName = Objects.requireNonNull(aCLName);
            return this;
        }

        public Builder setACLName(String aCLName) {
            this.aCLName = Input.of(Objects.requireNonNull(aCLName));
            return this;
        }

        public Builder setAutoMinorVersionUpgrade(@Nullable Input<Boolean> autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            return this;
        }

        public Builder setAutoMinorVersionUpgrade(@Nullable Boolean autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = Input.ofNullable(autoMinorVersionUpgrade);
            return this;
        }

        public Builder setClusterEndpoint(@Nullable Input<ClusterEndpointArgs> clusterEndpoint) {
            this.clusterEndpoint = clusterEndpoint;
            return this;
        }

        public Builder setClusterEndpoint(@Nullable ClusterEndpointArgs clusterEndpoint) {
            this.clusterEndpoint = Input.ofNullable(clusterEndpoint);
            return this;
        }

        public Builder setClusterName(@Nullable Input<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public Builder setClusterName(@Nullable String clusterName) {
            this.clusterName = Input.ofNullable(clusterName);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEngineVersion(@Nullable Input<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        public Builder setEngineVersion(@Nullable String engineVersion) {
            this.engineVersion = Input.ofNullable(engineVersion);
            return this;
        }

        public Builder setFinalSnapshotName(@Nullable Input<String> finalSnapshotName) {
            this.finalSnapshotName = finalSnapshotName;
            return this;
        }

        public Builder setFinalSnapshotName(@Nullable String finalSnapshotName) {
            this.finalSnapshotName = Input.ofNullable(finalSnapshotName);
            return this;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setMaintenanceWindow(@Nullable Input<String> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder setMaintenanceWindow(@Nullable String maintenanceWindow) {
            this.maintenanceWindow = Input.ofNullable(maintenanceWindow);
            return this;
        }

        public Builder setNodeType(Input<String> nodeType) {
            this.nodeType = Objects.requireNonNull(nodeType);
            return this;
        }

        public Builder setNodeType(String nodeType) {
            this.nodeType = Input.of(Objects.requireNonNull(nodeType));
            return this;
        }

        public Builder setNumReplicasPerShard(@Nullable Input<Integer> numReplicasPerShard) {
            this.numReplicasPerShard = numReplicasPerShard;
            return this;
        }

        public Builder setNumReplicasPerShard(@Nullable Integer numReplicasPerShard) {
            this.numReplicasPerShard = Input.ofNullable(numReplicasPerShard);
            return this;
        }

        public Builder setNumShards(@Nullable Input<Integer> numShards) {
            this.numShards = numShards;
            return this;
        }

        public Builder setNumShards(@Nullable Integer numShards) {
            this.numShards = Input.ofNullable(numShards);
            return this;
        }

        public Builder setParameterGroupName(@Nullable Input<String> parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }

        public Builder setParameterGroupName(@Nullable String parameterGroupName) {
            this.parameterGroupName = Input.ofNullable(parameterGroupName);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable Input<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Input.ofNullable(securityGroupIds);
            return this;
        }

        public Builder setSnapshotArns(@Nullable Input<List<String>> snapshotArns) {
            this.snapshotArns = snapshotArns;
            return this;
        }

        public Builder setSnapshotArns(@Nullable List<String> snapshotArns) {
            this.snapshotArns = Input.ofNullable(snapshotArns);
            return this;
        }

        public Builder setSnapshotName(@Nullable Input<String> snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }

        public Builder setSnapshotName(@Nullable String snapshotName) {
            this.snapshotName = Input.ofNullable(snapshotName);
            return this;
        }

        public Builder setSnapshotRetentionLimit(@Nullable Input<Integer> snapshotRetentionLimit) {
            this.snapshotRetentionLimit = snapshotRetentionLimit;
            return this;
        }

        public Builder setSnapshotRetentionLimit(@Nullable Integer snapshotRetentionLimit) {
            this.snapshotRetentionLimit = Input.ofNullable(snapshotRetentionLimit);
            return this;
        }

        public Builder setSnapshotWindow(@Nullable Input<String> snapshotWindow) {
            this.snapshotWindow = snapshotWindow;
            return this;
        }

        public Builder setSnapshotWindow(@Nullable String snapshotWindow) {
            this.snapshotWindow = Input.ofNullable(snapshotWindow);
            return this;
        }

        public Builder setSnsTopicArn(@Nullable Input<String> snsTopicArn) {
            this.snsTopicArn = snsTopicArn;
            return this;
        }

        public Builder setSnsTopicArn(@Nullable String snsTopicArn) {
            this.snsTopicArn = Input.ofNullable(snsTopicArn);
            return this;
        }

        public Builder setSnsTopicStatus(@Nullable Input<String> snsTopicStatus) {
            this.snsTopicStatus = snsTopicStatus;
            return this;
        }

        public Builder setSnsTopicStatus(@Nullable String snsTopicStatus) {
            this.snsTopicStatus = Input.ofNullable(snsTopicStatus);
            return this;
        }

        public Builder setSubnetGroupName(@Nullable Input<String> subnetGroupName) {
            this.subnetGroupName = subnetGroupName;
            return this;
        }

        public Builder setSubnetGroupName(@Nullable String subnetGroupName) {
            this.subnetGroupName = Input.ofNullable(subnetGroupName);
            return this;
        }

        public Builder setTLSEnabled(@Nullable Input<Boolean> tLSEnabled) {
            this.tLSEnabled = tLSEnabled;
            return this;
        }

        public Builder setTLSEnabled(@Nullable Boolean tLSEnabled) {
            this.tLSEnabled = Input.ofNullable(tLSEnabled);
            return this;
        }

        public Builder setTags(@Nullable Input<List<ClusterTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ClusterTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ClusterArgs build() {
            return new ClusterArgs(aCLName, autoMinorVersionUpgrade, clusterEndpoint, clusterName, description, engineVersion, finalSnapshotName, kmsKeyId, maintenanceWindow, nodeType, numReplicasPerShard, numShards, parameterGroupName, port, securityGroupIds, snapshotArns, snapshotName, snapshotRetentionLimit, snapshotWindow, snsTopicArn, snsTopicStatus, subnetGroupName, tLSEnabled, tags);
        }
    }
}
