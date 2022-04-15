// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dax;

import io.pulumi.aws.dax.inputs.ClusterServerSideEncryptionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * List of Availability Zones in which the
     * nodes will be created
     * 
     */
    @Import(name="availabilityZones")
      private final @Nullable Output<List<String>> availabilityZones;

    public Output<List<String>> availabilityZones() {
        return this.availabilityZones == null ? Codegen.empty() : this.availabilityZones;
    }

    /**
     * The type of encryption the
     * cluster's endpoint should support. Valid values are: `NONE` and `TLS`.
     * Default value is `NONE`.
     * 
     */
    @Import(name="clusterEndpointEncryptionType")
      private final @Nullable Output<String> clusterEndpointEncryptionType;

    public Output<String> clusterEndpointEncryptionType() {
        return this.clusterEndpointEncryptionType == null ? Codegen.empty() : this.clusterEndpointEncryptionType;
    }

    /**
     * Group identifier. DAX converts this name to
     * lowercase
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * Description for the cluster
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A valid Amazon Resource Name (ARN) that identifies
     * an IAM role. At runtime, DAX will assume this role and use the role's
     * permissions to access DynamoDB on your behalf
     * 
     */
    @Import(name="iamRoleArn", required=true)
      private final Output<String> iamRoleArn;

    public Output<String> iamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * Specifies the weekly time range for when
     * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
     * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
     * `sun:05:00-sun:09:00`
     * 
     */
    @Import(name="maintenanceWindow")
      private final @Nullable Output<String> maintenanceWindow;

    public Output<String> maintenanceWindow() {
        return this.maintenanceWindow == null ? Codegen.empty() : this.maintenanceWindow;
    }

    /**
     * The compute and memory capacity of the nodes. See
     * [Nodes](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.concepts.cluster.html#DAX.concepts.nodes) for supported node types
     * 
     */
    @Import(name="nodeType", required=true)
      private final Output<String> nodeType;

    public Output<String> nodeType() {
        return this.nodeType;
    }

    /**
     * An Amazon Resource Name (ARN) of an
     * SNS topic to send DAX notifications to. Example:
     * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
     * 
     */
    @Import(name="notificationTopicArn")
      private final @Nullable Output<String> notificationTopicArn;

    public Output<String> notificationTopicArn() {
        return this.notificationTopicArn == null ? Codegen.empty() : this.notificationTopicArn;
    }

    /**
     * Name of the parameter group to associate
     * with this DAX cluster
     * 
     */
    @Import(name="parameterGroupName")
      private final @Nullable Output<String> parameterGroupName;

    public Output<String> parameterGroupName() {
        return this.parameterGroupName == null ? Codegen.empty() : this.parameterGroupName;
    }

    /**
     * The number of nodes in the DAX cluster. A
     * replication factor of 1 will create a single-node cluster, without any read
     * replicas
     * 
     */
    @Import(name="replicationFactor", required=true)
      private final Output<Integer> replicationFactor;

    public Output<Integer> replicationFactor() {
        return this.replicationFactor;
    }

    /**
     * One or more VPC security groups associated
     * with the cluster
     * 
     */
    @Import(name="securityGroupIds")
      private final @Nullable Output<List<String>> securityGroupIds;

    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds == null ? Codegen.empty() : this.securityGroupIds;
    }

    /**
     * Encrypt at rest options
     * 
     */
    @Import(name="serverSideEncryption")
      private final @Nullable Output<ClusterServerSideEncryptionArgs> serverSideEncryption;

    public Output<ClusterServerSideEncryptionArgs> serverSideEncryption() {
        return this.serverSideEncryption == null ? Codegen.empty() : this.serverSideEncryption;
    }

    /**
     * Name of the subnet group to be used for the
     * cluster
     * 
     */
    @Import(name="subnetGroupName")
      private final @Nullable Output<String> subnetGroupName;

    public Output<String> subnetGroupName() {
        return this.subnetGroupName == null ? Codegen.empty() : this.subnetGroupName;
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

    public ClusterArgs(
        @Nullable Output<List<String>> availabilityZones,
        @Nullable Output<String> clusterEndpointEncryptionType,
        Output<String> clusterName,
        @Nullable Output<String> description,
        Output<String> iamRoleArn,
        @Nullable Output<String> maintenanceWindow,
        Output<String> nodeType,
        @Nullable Output<String> notificationTopicArn,
        @Nullable Output<String> parameterGroupName,
        Output<Integer> replicationFactor,
        @Nullable Output<List<String>> securityGroupIds,
        @Nullable Output<ClusterServerSideEncryptionArgs> serverSideEncryption,
        @Nullable Output<String> subnetGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.availabilityZones = availabilityZones;
        this.clusterEndpointEncryptionType = clusterEndpointEncryptionType;
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.description = description;
        this.iamRoleArn = Objects.requireNonNull(iamRoleArn, "expected parameter 'iamRoleArn' to be non-null");
        this.maintenanceWindow = maintenanceWindow;
        this.nodeType = Objects.requireNonNull(nodeType, "expected parameter 'nodeType' to be non-null");
        this.notificationTopicArn = notificationTopicArn;
        this.parameterGroupName = parameterGroupName;
        this.replicationFactor = Objects.requireNonNull(replicationFactor, "expected parameter 'replicationFactor' to be non-null");
        this.securityGroupIds = securityGroupIds;
        this.serverSideEncryption = serverSideEncryption;
        this.subnetGroupName = subnetGroupName;
        this.tags = tags;
    }

    private ClusterArgs() {
        this.availabilityZones = Codegen.empty();
        this.clusterEndpointEncryptionType = Codegen.empty();
        this.clusterName = Codegen.empty();
        this.description = Codegen.empty();
        this.iamRoleArn = Codegen.empty();
        this.maintenanceWindow = Codegen.empty();
        this.nodeType = Codegen.empty();
        this.notificationTopicArn = Codegen.empty();
        this.parameterGroupName = Codegen.empty();
        this.replicationFactor = Codegen.empty();
        this.securityGroupIds = Codegen.empty();
        this.serverSideEncryption = Codegen.empty();
        this.subnetGroupName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> availabilityZones;
        private @Nullable Output<String> clusterEndpointEncryptionType;
        private Output<String> clusterName;
        private @Nullable Output<String> description;
        private Output<String> iamRoleArn;
        private @Nullable Output<String> maintenanceWindow;
        private Output<String> nodeType;
        private @Nullable Output<String> notificationTopicArn;
        private @Nullable Output<String> parameterGroupName;
        private Output<Integer> replicationFactor;
        private @Nullable Output<List<String>> securityGroupIds;
        private @Nullable Output<ClusterServerSideEncryptionArgs> serverSideEncryption;
        private @Nullable Output<String> subnetGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.clusterEndpointEncryptionType = defaults.clusterEndpointEncryptionType;
    	      this.clusterName = defaults.clusterName;
    	      this.description = defaults.description;
    	      this.iamRoleArn = defaults.iamRoleArn;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.nodeType = defaults.nodeType;
    	      this.notificationTopicArn = defaults.notificationTopicArn;
    	      this.parameterGroupName = defaults.parameterGroupName;
    	      this.replicationFactor = defaults.replicationFactor;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.serverSideEncryption = defaults.serverSideEncryption;
    	      this.subnetGroupName = defaults.subnetGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder availabilityZones(@Nullable Output<List<String>> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }
        public Builder availabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = Codegen.ofNullable(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder clusterEndpointEncryptionType(@Nullable Output<String> clusterEndpointEncryptionType) {
            this.clusterEndpointEncryptionType = clusterEndpointEncryptionType;
            return this;
        }
        public Builder clusterEndpointEncryptionType(@Nullable String clusterEndpointEncryptionType) {
            this.clusterEndpointEncryptionType = Codegen.ofNullable(clusterEndpointEncryptionType);
            return this;
        }
        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder iamRoleArn(Output<String> iamRoleArn) {
            this.iamRoleArn = Objects.requireNonNull(iamRoleArn);
            return this;
        }
        public Builder iamRoleArn(String iamRoleArn) {
            this.iamRoleArn = Output.of(Objects.requireNonNull(iamRoleArn));
            return this;
        }
        public Builder maintenanceWindow(@Nullable Output<String> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }
        public Builder maintenanceWindow(@Nullable String maintenanceWindow) {
            this.maintenanceWindow = Codegen.ofNullable(maintenanceWindow);
            return this;
        }
        public Builder nodeType(Output<String> nodeType) {
            this.nodeType = Objects.requireNonNull(nodeType);
            return this;
        }
        public Builder nodeType(String nodeType) {
            this.nodeType = Output.of(Objects.requireNonNull(nodeType));
            return this;
        }
        public Builder notificationTopicArn(@Nullable Output<String> notificationTopicArn) {
            this.notificationTopicArn = notificationTopicArn;
            return this;
        }
        public Builder notificationTopicArn(@Nullable String notificationTopicArn) {
            this.notificationTopicArn = Codegen.ofNullable(notificationTopicArn);
            return this;
        }
        public Builder parameterGroupName(@Nullable Output<String> parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }
        public Builder parameterGroupName(@Nullable String parameterGroupName) {
            this.parameterGroupName = Codegen.ofNullable(parameterGroupName);
            return this;
        }
        public Builder replicationFactor(Output<Integer> replicationFactor) {
            this.replicationFactor = Objects.requireNonNull(replicationFactor);
            return this;
        }
        public Builder replicationFactor(Integer replicationFactor) {
            this.replicationFactor = Output.of(Objects.requireNonNull(replicationFactor));
            return this;
        }
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Codegen.ofNullable(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder serverSideEncryption(@Nullable Output<ClusterServerSideEncryptionArgs> serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }
        public Builder serverSideEncryption(@Nullable ClusterServerSideEncryptionArgs serverSideEncryption) {
            this.serverSideEncryption = Codegen.ofNullable(serverSideEncryption);
            return this;
        }
        public Builder subnetGroupName(@Nullable Output<String> subnetGroupName) {
            this.subnetGroupName = subnetGroupName;
            return this;
        }
        public Builder subnetGroupName(@Nullable String subnetGroupName) {
            this.subnetGroupName = Codegen.ofNullable(subnetGroupName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ClusterArgs build() {
            return new ClusterArgs(availabilityZones, clusterEndpointEncryptionType, clusterName, description, iamRoleArn, maintenanceWindow, nodeType, notificationTopicArn, parameterGroupName, replicationFactor, securityGroupIds, serverSideEncryption, subnetGroupName, tags);
        }
    }
}
