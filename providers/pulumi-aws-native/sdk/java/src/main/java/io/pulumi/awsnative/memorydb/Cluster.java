// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.memorydb.ClusterArgs;
import io.pulumi.awsnative.memorydb.outputs.ClusterEndpoint;
import io.pulumi.awsnative.memorydb.outputs.ClusterTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:memorydb:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    @OutputExport(name="aCLName", type=String.class, parameters={})
    private Output<String> aCLName;

    public Output<String> getACLName() {
        return this.aCLName;
    }
    @OutputExport(name="aRN", type=String.class, parameters={})
    private Output<String> aRN;

    public Output<String> getARN() {
        return this.aRN;
    }
    @OutputExport(name="autoMinorVersionUpgrade", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoMinorVersionUpgrade;

    public Output</* @Nullable */ Boolean> getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }
    @OutputExport(name="clusterEndpoint", type=ClusterEndpoint.class, parameters={})
    private Output</* @Nullable */ ClusterEndpoint> clusterEndpoint;

    public Output</* @Nullable */ ClusterEndpoint> getClusterEndpoint() {
        return this.clusterEndpoint;
    }
    @OutputExport(name="clusterName", type=String.class, parameters={})
    private Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="engineVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> engineVersion;

    public Output</* @Nullable */ String> getEngineVersion() {
        return this.engineVersion;
    }
    @OutputExport(name="finalSnapshotName", type=String.class, parameters={})
    private Output</* @Nullable */ String> finalSnapshotName;

    public Output</* @Nullable */ String> getFinalSnapshotName() {
        return this.finalSnapshotName;
    }
    @OutputExport(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    public Output</* @Nullable */ String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    @OutputExport(name="maintenanceWindow", type=String.class, parameters={})
    private Output</* @Nullable */ String> maintenanceWindow;

    public Output</* @Nullable */ String> getMaintenanceWindow() {
        return this.maintenanceWindow;
    }
    @OutputExport(name="nodeType", type=String.class, parameters={})
    private Output<String> nodeType;

    public Output<String> getNodeType() {
        return this.nodeType;
    }
    @OutputExport(name="numReplicasPerShard", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> numReplicasPerShard;

    public Output</* @Nullable */ Integer> getNumReplicasPerShard() {
        return this.numReplicasPerShard;
    }
    @OutputExport(name="numShards", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> numShards;

    public Output</* @Nullable */ Integer> getNumShards() {
        return this.numShards;
    }
    @OutputExport(name="parameterGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> parameterGroupName;

    public Output</* @Nullable */ String> getParameterGroupName() {
        return this.parameterGroupName;
    }
    @OutputExport(name="parameterGroupStatus", type=String.class, parameters={})
    private Output<String> parameterGroupStatus;

    public Output<String> getParameterGroupStatus() {
        return this.parameterGroupStatus;
    }
    @OutputExport(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    public Output</* @Nullable */ Integer> getPort() {
        return this.port;
    }
    @OutputExport(name="securityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> securityGroupIds;

    public Output</* @Nullable */ List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    @OutputExport(name="snapshotArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> snapshotArns;

    public Output</* @Nullable */ List<String>> getSnapshotArns() {
        return this.snapshotArns;
    }
    @OutputExport(name="snapshotName", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotName;

    public Output</* @Nullable */ String> getSnapshotName() {
        return this.snapshotName;
    }
    @OutputExport(name="snapshotRetentionLimit", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> snapshotRetentionLimit;

    public Output</* @Nullable */ Integer> getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }
    @OutputExport(name="snapshotWindow", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotWindow;

    public Output</* @Nullable */ String> getSnapshotWindow() {
        return this.snapshotWindow;
    }
    @OutputExport(name="snsTopicArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> snsTopicArn;

    public Output</* @Nullable */ String> getSnsTopicArn() {
        return this.snsTopicArn;
    }
    @OutputExport(name="snsTopicStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> snsTopicStatus;

    public Output</* @Nullable */ String> getSnsTopicStatus() {
        return this.snsTopicStatus;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }
    @OutputExport(name="subnetGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> subnetGroupName;

    public Output</* @Nullable */ String> getSubnetGroupName() {
        return this.subnetGroupName;
    }
    @OutputExport(name="tLSEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> tLSEnabled;

    public Output</* @Nullable */ Boolean> getTLSEnabled() {
        return this.tLSEnabled;
    }
    @OutputExport(name="tags", type=List.class, parameters={ClusterTag.class})
    private Output</* @Nullable */ List<ClusterTag>> tags;

    public Output</* @Nullable */ List<ClusterTag>> getTags() {
        return this.tags;
    }

    public Cluster(String name, ClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:memorydb:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Cluster(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:memorydb:Cluster", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Cluster get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}
