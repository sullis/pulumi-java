// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.redshift.ClusterArgs;
import io.pulumi.awsnative.redshift.outputs.ClusterEndpoint;
import io.pulumi.awsnative.redshift.outputs.ClusterLoggingProperties;
import io.pulumi.awsnative.redshift.outputs.ClusterTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An example resource schema demonstrating some basic constructs and validation rules.
 * 
 */
@ResourceType(type="aws-native:redshift:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    /**
     * Major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster. Default value is True
     * 
     */
    @OutputExport(name="allowVersionUpgrade", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowVersionUpgrade;

    /**
     * @return Major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster. Default value is True
     * 
     */
    public Output</* @Nullable */ Boolean> getAllowVersionUpgrade() {
        return this.allowVersionUpgrade;
    }
    /**
     * The value represents how the cluster is configured to use AQUA (Advanced Query Accelerator) after the cluster is restored. Possible values include the following.
     * 
     * enabled - Use AQUA if it is available for the current Region and Amazon Redshift node type.
     * disabled - Don't use AQUA.
     * auto - Amazon Redshift determines whether to use AQUA.
     * 
     */
    @OutputExport(name="aquaConfigurationStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> aquaConfigurationStatus;

    /**
     * @return The value represents how the cluster is configured to use AQUA (Advanced Query Accelerator) after the cluster is restored. Possible values include the following.
     * 
     * enabled - Use AQUA if it is available for the current Region and Amazon Redshift node type.
     * disabled - Don't use AQUA.
     * auto - Amazon Redshift determines whether to use AQUA.
     * 
     */
    public Output</* @Nullable */ String> getAquaConfigurationStatus() {
        return this.aquaConfigurationStatus;
    }
    /**
     * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Default value is 1
     * 
     */
    @OutputExport(name="automatedSnapshotRetentionPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> automatedSnapshotRetentionPeriod;

    /**
     * @return The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Default value is 1
     * 
     */
    public Output</* @Nullable */ Integer> getAutomatedSnapshotRetentionPeriod() {
        return this.automatedSnapshotRetentionPeriod;
    }
    /**
     * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. Default: A random, system-chosen Availability Zone in the region that is specified by the endpoint
     * 
     */
    @OutputExport(name="availabilityZone", type=String.class, parameters={})
    private Output</* @Nullable */ String> availabilityZone;

    /**
     * @return The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. Default: A random, system-chosen Availability Zone in the region that is specified by the endpoint
     * 
     */
    public Output</* @Nullable */ String> getAvailabilityZone() {
        return this.availabilityZone;
    }
    /**
     * The option to enable relocation for an Amazon Redshift cluster between Availability Zones after the cluster modification is complete.
     * 
     */
    @OutputExport(name="availabilityZoneRelocation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> availabilityZoneRelocation;

    /**
     * @return The option to enable relocation for an Amazon Redshift cluster between Availability Zones after the cluster modification is complete.
     * 
     */
    public Output</* @Nullable */ Boolean> getAvailabilityZoneRelocation() {
        return this.availabilityZoneRelocation;
    }
    /**
     * The availability zone relocation status of the cluster
     * 
     */
    @OutputExport(name="availabilityZoneRelocationStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> availabilityZoneRelocationStatus;

    /**
     * @return The availability zone relocation status of the cluster
     * 
     */
    public Output</* @Nullable */ String> getAvailabilityZoneRelocationStatus() {
        return this.availabilityZoneRelocationStatus;
    }
    /**
     * A boolean value indicating whether the resize operation is using the classic resize process. If you don't provide this parameter or set the value to false , the resize type is elastic.
     * 
     */
    @OutputExport(name="classic", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> classic;

    /**
     * @return A boolean value indicating whether the resize operation is using the classic resize process. If you don't provide this parameter or set the value to false , the resize type is elastic.
     * 
     */
    public Output</* @Nullable */ Boolean> getClassic() {
        return this.classic;
    }
    /**
     * A unique identifier for the cluster. You use this identifier to refer to the cluster for any subsequent cluster operations such as deleting or modifying. All alphabetical characters must be lower case, no hypens at the end, no two consecutive hyphens. Cluster name should be unique for all clusters within an AWS account
     * 
     */
    @OutputExport(name="clusterIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterIdentifier;

    /**
     * @return A unique identifier for the cluster. You use this identifier to refer to the cluster for any subsequent cluster operations such as deleting or modifying. All alphabetical characters must be lower case, no hypens at the end, no two consecutive hyphens. Cluster name should be unique for all clusters within an AWS account
     * 
     */
    public Output</* @Nullable */ String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }
    /**
     * The name of the parameter group to be associated with this cluster.
     * 
     */
    @OutputExport(name="clusterParameterGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterParameterGroupName;

    /**
     * @return The name of the parameter group to be associated with this cluster.
     * 
     */
    public Output</* @Nullable */ String> getClusterParameterGroupName() {
        return this.clusterParameterGroupName;
    }
    /**
     * A list of security groups to be associated with this cluster.
     * 
     */
    @OutputExport(name="clusterSecurityGroups", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> clusterSecurityGroups;

    /**
     * @return A list of security groups to be associated with this cluster.
     * 
     */
    public Output</* @Nullable */ List<String>> getClusterSecurityGroups() {
        return this.clusterSecurityGroups;
    }
    /**
     * The name of a cluster subnet group to be associated with this cluster.
     * 
     */
    @OutputExport(name="clusterSubnetGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterSubnetGroupName;

    /**
     * @return The name of a cluster subnet group to be associated with this cluster.
     * 
     */
    public Output</* @Nullable */ String> getClusterSubnetGroupName() {
        return this.clusterSubnetGroupName;
    }
    /**
     * The type of the cluster. When cluster type is specified as single-node, the NumberOfNodes parameter is not required and if multi-node, the NumberOfNodes parameter is required
     * 
     */
    @OutputExport(name="clusterType", type=String.class, parameters={})
    private Output<String> clusterType;

    /**
     * @return The type of the cluster. When cluster type is specified as single-node, the NumberOfNodes parameter is not required and if multi-node, the NumberOfNodes parameter is required
     * 
     */
    public Output<String> getClusterType() {
        return this.clusterType;
    }
    /**
     * The version of the Amazon Redshift engine software that you want to deploy on the cluster.The version selected runs on all the nodes in the cluster.
     * 
     */
    @OutputExport(name="clusterVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterVersion;

    /**
     * @return The version of the Amazon Redshift engine software that you want to deploy on the cluster.The version selected runs on all the nodes in the cluster.
     * 
     */
    public Output</* @Nullable */ String> getClusterVersion() {
        return this.clusterVersion;
    }
    /**
     * The name of the first database to be created when the cluster is created. To create additional databases after the cluster is created, connect to the cluster with a SQL client and use SQL commands to create a database.
     * 
     */
    @OutputExport(name="dBName", type=String.class, parameters={})
    private Output<String> dBName;

    /**
     * @return The name of the first database to be created when the cluster is created. To create additional databases after the cluster is created, connect to the cluster with a SQL client and use SQL commands to create a database.
     * 
     */
    public Output<String> getDBName() {
        return this.dBName;
    }
    /**
     * A boolean indicating whether to enable the deferred maintenance window.
     * 
     */
    @OutputExport(name="deferMaintenance", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deferMaintenance;

    /**
     * @return A boolean indicating whether to enable the deferred maintenance window.
     * 
     */
    public Output</* @Nullable */ Boolean> getDeferMaintenance() {
        return this.deferMaintenance;
    }
    /**
     * An integer indicating the duration of the maintenance window in days. If you specify a duration, you can't specify an end time. The duration must be 45 days or less.
     * 
     */
    @OutputExport(name="deferMaintenanceDuration", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> deferMaintenanceDuration;

    /**
     * @return An integer indicating the duration of the maintenance window in days. If you specify a duration, you can't specify an end time. The duration must be 45 days or less.
     * 
     */
    public Output</* @Nullable */ Integer> getDeferMaintenanceDuration() {
        return this.deferMaintenanceDuration;
    }
    /**
     * A timestamp indicating end time for the deferred maintenance window. If you specify an end time, you can't specify a duration.
     * 
     */
    @OutputExport(name="deferMaintenanceEndTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> deferMaintenanceEndTime;

    /**
     * @return A timestamp indicating end time for the deferred maintenance window. If you specify an end time, you can't specify a duration.
     * 
     */
    public Output</* @Nullable */ String> getDeferMaintenanceEndTime() {
        return this.deferMaintenanceEndTime;
    }
    /**
     * A unique identifier for the deferred maintenance window.
     * 
     */
    @OutputExport(name="deferMaintenanceIdentifier", type=String.class, parameters={})
    private Output<String> deferMaintenanceIdentifier;

    /**
     * @return A unique identifier for the deferred maintenance window.
     * 
     */
    public Output<String> getDeferMaintenanceIdentifier() {
        return this.deferMaintenanceIdentifier;
    }
    /**
     * A timestamp indicating the start time for the deferred maintenance window.
     * 
     */
    @OutputExport(name="deferMaintenanceStartTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> deferMaintenanceStartTime;

    /**
     * @return A timestamp indicating the start time for the deferred maintenance window.
     * 
     */
    public Output</* @Nullable */ String> getDeferMaintenanceStartTime() {
        return this.deferMaintenanceStartTime;
    }
    /**
     * The destination AWS Region that you want to copy snapshots to. Constraints: Must be the name of a valid AWS Region. For more information, see Regions and Endpoints in the Amazon Web Services [https://docs.aws.amazon.com/general/latest/gr/rande.html#redshift_region] General Reference
     * 
     */
    @OutputExport(name="destinationRegion", type=String.class, parameters={})
    private Output</* @Nullable */ String> destinationRegion;

    /**
     * @return The destination AWS Region that you want to copy snapshots to. Constraints: Must be the name of a valid AWS Region. For more information, see Regions and Endpoints in the Amazon Web Services [https://docs.aws.amazon.com/general/latest/gr/rande.html#redshift_region] General Reference
     * 
     */
    public Output</* @Nullable */ String> getDestinationRegion() {
        return this.destinationRegion;
    }
    /**
     * The Elastic IP (EIP) address for the cluster.
     * 
     */
    @OutputExport(name="elasticIp", type=String.class, parameters={})
    private Output</* @Nullable */ String> elasticIp;

    /**
     * @return The Elastic IP (EIP) address for the cluster.
     * 
     */
    public Output</* @Nullable */ String> getElasticIp() {
        return this.elasticIp;
    }
    /**
     * If true, the data in the cluster is encrypted at rest.
     * 
     */
    @OutputExport(name="encrypted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> encrypted;

    /**
     * @return If true, the data in the cluster is encrypted at rest.
     * 
     */
    public Output</* @Nullable */ Boolean> getEncrypted() {
        return this.encrypted;
    }
    @OutputExport(name="endpoint", type=ClusterEndpoint.class, parameters={})
    private Output</* @Nullable */ ClusterEndpoint> endpoint;

    public Output</* @Nullable */ ClusterEndpoint> getEndpoint() {
        return this.endpoint;
    }
    /**
     * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide.
     * 
     * If this option is true , enhanced VPC routing is enabled.
     * 
     * Default: false
     * 
     */
    @OutputExport(name="enhancedVpcRouting", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enhancedVpcRouting;

    /**
     * @return An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide.
     * 
     * If this option is true , enhanced VPC routing is enabled.
     * 
     * Default: false
     * 
     */
    public Output</* @Nullable */ Boolean> getEnhancedVpcRouting() {
        return this.enhancedVpcRouting;
    }
    /**
     * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve the data encryption keys stored in an HSM
     * 
     */
    @OutputExport(name="hsmClientCertificateIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> hsmClientCertificateIdentifier;

    /**
     * @return Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve the data encryption keys stored in an HSM
     * 
     */
    public Output</* @Nullable */ String> getHsmClientCertificateIdentifier() {
        return this.hsmClientCertificateIdentifier;
    }
    /**
     * Specifies the name of the HSM configuration that contains the information the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
     * 
     */
    @OutputExport(name="hsmConfigurationIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> hsmConfigurationIdentifier;

    /**
     * @return Specifies the name of the HSM configuration that contains the information the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
     * 
     */
    public Output</* @Nullable */ String> getHsmConfigurationIdentifier() {
        return this.hsmConfigurationIdentifier;
    }
    /**
     * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up to 10 IAM roles in a single request
     * 
     */
    @OutputExport(name="iamRoles", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> iamRoles;

    /**
     * @return A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up to 10 IAM roles in a single request
     * 
     */
    public Output</* @Nullable */ List<String>> getIamRoles() {
        return this.iamRoles;
    }
    /**
     * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in the cluster.
     * 
     */
    @OutputExport(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in the cluster.
     * 
     */
    public Output</* @Nullable */ String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    @OutputExport(name="loggingProperties", type=ClusterLoggingProperties.class, parameters={})
    private Output</* @Nullable */ ClusterLoggingProperties> loggingProperties;

    public Output</* @Nullable */ ClusterLoggingProperties> getLoggingProperties() {
        return this.loggingProperties;
    }
    /**
     * The name for the maintenance track that you want to assign for the cluster. This name change is asynchronous. The new track name stays in the PendingModifiedValues for the cluster until the next maintenance window. When the maintenance track changes, the cluster is switched to the latest cluster release available for the maintenance track. At this point, the maintenance track name is applied.
     * 
     */
    @OutputExport(name="maintenanceTrackName", type=String.class, parameters={})
    private Output</* @Nullable */ String> maintenanceTrackName;

    /**
     * @return The name for the maintenance track that you want to assign for the cluster. This name change is asynchronous. The new track name stays in the PendingModifiedValues for the cluster until the next maintenance window. When the maintenance track changes, the cluster is switched to the latest cluster release available for the maintenance track. At this point, the maintenance track name is applied.
     * 
     */
    public Output</* @Nullable */ String> getMaintenanceTrackName() {
        return this.maintenanceTrackName;
    }
    /**
     * The number of days to retain newly copied snapshots in the destination AWS Region after they are copied from the source AWS Region. If the value is -1, the manual snapshot is retained indefinitely.
     * 
     * The value must be either -1 or an integer between 1 and 3,653.
     * 
     */
    @OutputExport(name="manualSnapshotRetentionPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> manualSnapshotRetentionPeriod;

    /**
     * @return The number of days to retain newly copied snapshots in the destination AWS Region after they are copied from the source AWS Region. If the value is -1, the manual snapshot is retained indefinitely.
     * 
     * The value must be either -1 or an integer between 1 and 3,653.
     * 
     */
    public Output</* @Nullable */ Integer> getManualSnapshotRetentionPeriod() {
        return this.manualSnapshotRetentionPeriod;
    }
    /**
     * The password associated with the master user account for the cluster that is being created. Password must be between 8 and 64 characters in length, should have at least one uppercase letter.Must contain at least one lowercase letter.Must contain one number.Can be any printable ASCII character.
     * 
     */
    @OutputExport(name="masterUserPassword", type=String.class, parameters={})
    private Output<String> masterUserPassword;

    /**
     * @return The password associated with the master user account for the cluster that is being created. Password must be between 8 and 64 characters in length, should have at least one uppercase letter.Must contain at least one lowercase letter.Must contain one number.Can be any printable ASCII character.
     * 
     */
    public Output<String> getMasterUserPassword() {
        return this.masterUserPassword;
    }
    /**
     * The user name associated with the master user account for the cluster that is being created. The user name can't be PUBLIC and first character must be a letter.
     * 
     */
    @OutputExport(name="masterUsername", type=String.class, parameters={})
    private Output<String> masterUsername;

    /**
     * @return The user name associated with the master user account for the cluster that is being created. The user name can't be PUBLIC and first character must be a letter.
     * 
     */
    public Output<String> getMasterUsername() {
        return this.masterUsername;
    }
    /**
     * The node type to be provisioned for the cluster.Valid Values: ds2.xlarge | ds2.8xlarge | dc1.large | dc1.8xlarge | dc2.large | dc2.8xlarge | ra3.4xlarge | ra3.16xlarge
     * 
     */
    @OutputExport(name="nodeType", type=String.class, parameters={})
    private Output<String> nodeType;

    /**
     * @return The node type to be provisioned for the cluster.Valid Values: ds2.xlarge | ds2.8xlarge | dc1.large | dc1.8xlarge | dc2.large | dc2.8xlarge | ra3.4xlarge | ra3.16xlarge
     * 
     */
    public Output<String> getNodeType() {
        return this.nodeType;
    }
    /**
     * The number of compute nodes in the cluster. This parameter is required when the ClusterType parameter is specified as multi-node.
     * 
     */
    @OutputExport(name="numberOfNodes", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> numberOfNodes;

    /**
     * @return The number of compute nodes in the cluster. This parameter is required when the ClusterType parameter is specified as multi-node.
     * 
     */
    public Output</* @Nullable */ Integer> getNumberOfNodes() {
        return this.numberOfNodes;
    }
    @OutputExport(name="ownerAccount", type=String.class, parameters={})
    private Output</* @Nullable */ String> ownerAccount;

    public Output</* @Nullable */ String> getOwnerAccount() {
        return this.ownerAccount;
    }
    /**
     * The port number on which the cluster accepts incoming connections. The cluster is accessible only via the JDBC and ODBC connection strings
     * 
     */
    @OutputExport(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return The port number on which the cluster accepts incoming connections. The cluster is accessible only via the JDBC and ODBC connection strings
     * 
     */
    public Output</* @Nullable */ Integer> getPort() {
        return this.port;
    }
    /**
     * The weekly time range (in UTC) during which automated cluster maintenance can occur.
     * 
     */
    @OutputExport(name="preferredMaintenanceWindow", type=String.class, parameters={})
    private Output</* @Nullable */ String> preferredMaintenanceWindow;

    /**
     * @return The weekly time range (in UTC) during which automated cluster maintenance can occur.
     * 
     */
    public Output</* @Nullable */ String> getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }
    /**
     * If true, the cluster can be accessed from a public network.
     * 
     */
    @OutputExport(name="publiclyAccessible", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publiclyAccessible;

    /**
     * @return If true, the cluster can be accessed from a public network.
     * 
     */
    public Output</* @Nullable */ Boolean> getPubliclyAccessible() {
        return this.publiclyAccessible;
    }
    /**
     * The Redshift operation to be performed. Resource Action supports pause-cluster, resume-cluster APIs
     * 
     */
    @OutputExport(name="resourceAction", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceAction;

    /**
     * @return The Redshift operation to be performed. Resource Action supports pause-cluster, resume-cluster APIs
     * 
     */
    public Output</* @Nullable */ String> getResourceAction() {
        return this.resourceAction;
    }
    /**
     * The identifier of the database revision. You can retrieve this value from the response to the DescribeClusterDbRevisions request.
     * 
     */
    @OutputExport(name="revisionTarget", type=String.class, parameters={})
    private Output</* @Nullable */ String> revisionTarget;

    /**
     * @return The identifier of the database revision. You can retrieve this value from the response to the DescribeClusterDbRevisions request.
     * 
     */
    public Output</* @Nullable */ String> getRevisionTarget() {
        return this.revisionTarget;
    }
    /**
     * A boolean indicating if we want to rotate Encryption Keys.
     * 
     */
    @OutputExport(name="rotateEncryptionKey", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> rotateEncryptionKey;

    /**
     * @return A boolean indicating if we want to rotate Encryption Keys.
     * 
     */
    public Output</* @Nullable */ Boolean> getRotateEncryptionKey() {
        return this.rotateEncryptionKey;
    }
    /**
     * The name of the cluster the source snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name.
     * 
     */
    @OutputExport(name="snapshotClusterIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotClusterIdentifier;

    /**
     * @return The name of the cluster the source snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name.
     * 
     */
    public Output</* @Nullable */ String> getSnapshotClusterIdentifier() {
        return this.snapshotClusterIdentifier;
    }
    /**
     * The name of the snapshot copy grant to use when snapshots of an AWS KMS-encrypted cluster are copied to the destination region.
     * 
     */
    @OutputExport(name="snapshotCopyGrantName", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotCopyGrantName;

    /**
     * @return The name of the snapshot copy grant to use when snapshots of an AWS KMS-encrypted cluster are copied to the destination region.
     * 
     */
    public Output</* @Nullable */ String> getSnapshotCopyGrantName() {
        return this.snapshotCopyGrantName;
    }
    /**
     * Indicates whether to apply the snapshot retention period to newly copied manual snapshots instead of automated snapshots.
     * 
     */
    @OutputExport(name="snapshotCopyManual", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> snapshotCopyManual;

    /**
     * @return Indicates whether to apply the snapshot retention period to newly copied manual snapshots instead of automated snapshots.
     * 
     */
    public Output</* @Nullable */ Boolean> getSnapshotCopyManual() {
        return this.snapshotCopyManual;
    }
    /**
     * The number of days to retain automated snapshots in the destination region after they are copied from the source region.
     * 
     *  Default is 7.
     * 
     *  Constraints: Must be at least 1 and no more than 35.
     * 
     */
    @OutputExport(name="snapshotCopyRetentionPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> snapshotCopyRetentionPeriod;

    /**
     * @return The number of days to retain automated snapshots in the destination region after they are copied from the source region.
     * 
     *  Default is 7.
     * 
     *  Constraints: Must be at least 1 and no more than 35.
     * 
     */
    public Output</* @Nullable */ Integer> getSnapshotCopyRetentionPeriod() {
        return this.snapshotCopyRetentionPeriod;
    }
    /**
     * The name of the snapshot from which to create the new cluster. This parameter isn't case sensitive.
     * 
     */
    @OutputExport(name="snapshotIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotIdentifier;

    /**
     * @return The name of the snapshot from which to create the new cluster. This parameter isn't case sensitive.
     * 
     */
    public Output</* @Nullable */ String> getSnapshotIdentifier() {
        return this.snapshotIdentifier;
    }
    /**
     * The list of tags for the cluster parameter group.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={ClusterTag.class})
    private Output</* @Nullable */ List<ClusterTag>> tags;

    /**
     * @return The list of tags for the cluster parameter group.
     * 
     */
    public Output</* @Nullable */ List<ClusterTag>> getTags() {
        return this.tags;
    }
    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
     * 
     */
    @OutputExport(name="vpcSecurityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> vpcSecurityGroupIds;

    /**
     * @return A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
     * 
     */
    public Output</* @Nullable */ List<String>> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:redshift:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Cluster(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:redshift:Cluster", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cluster get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}
