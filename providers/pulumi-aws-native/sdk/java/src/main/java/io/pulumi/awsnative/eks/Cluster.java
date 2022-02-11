// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.eks.ClusterArgs;
import io.pulumi.awsnative.eks.outputs.ClusterEncryptionConfig;
import io.pulumi.awsnative.eks.outputs.ClusterKubernetesNetworkConfig;
import io.pulumi.awsnative.eks.outputs.ClusterLogging;
import io.pulumi.awsnative.eks.outputs.ClusterResourcesVpcConfig;
import io.pulumi.awsnative.eks.outputs.ClusterTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:eks:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="certificateAuthorityData", type=String.class, parameters={})
    private Output<String> certificateAuthorityData;

    public Output<String> getCertificateAuthorityData() {
        return this.certificateAuthorityData;
    }
    @OutputExport(name="clusterSecurityGroupId", type=String.class, parameters={})
    private Output<String> clusterSecurityGroupId;

    public Output<String> getClusterSecurityGroupId() {
        return this.clusterSecurityGroupId;
    }
    @OutputExport(name="encryptionConfig", type=List.class, parameters={ClusterEncryptionConfig.class})
    private Output</* @Nullable */ List<ClusterEncryptionConfig>> encryptionConfig;

    public Output</* @Nullable */ List<ClusterEncryptionConfig>> getEncryptionConfig() {
        return this.encryptionConfig;
    }
    @OutputExport(name="encryptionConfigKeyArn", type=String.class, parameters={})
    private Output<String> encryptionConfigKeyArn;

    public Output<String> getEncryptionConfigKeyArn() {
        return this.encryptionConfigKeyArn;
    }
    @OutputExport(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint;
    }
    @OutputExport(name="kubernetesNetworkConfig", type=ClusterKubernetesNetworkConfig.class, parameters={})
    private Output</* @Nullable */ ClusterKubernetesNetworkConfig> kubernetesNetworkConfig;

    public Output</* @Nullable */ ClusterKubernetesNetworkConfig> getKubernetesNetworkConfig() {
        return this.kubernetesNetworkConfig;
    }
    @OutputExport(name="logging", type=ClusterLogging.class, parameters={})
    private Output</* @Nullable */ ClusterLogging> logging;

    public Output</* @Nullable */ ClusterLogging> getLogging() {
        return this.logging;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="openIdConnectIssuerUrl", type=String.class, parameters={})
    private Output<String> openIdConnectIssuerUrl;

    public Output<String> getOpenIdConnectIssuerUrl() {
        return this.openIdConnectIssuerUrl;
    }
    @OutputExport(name="resourcesVpcConfig", type=ClusterResourcesVpcConfig.class, parameters={})
    private Output<ClusterResourcesVpcConfig> resourcesVpcConfig;

    public Output<ClusterResourcesVpcConfig> getResourcesVpcConfig() {
        return this.resourcesVpcConfig;
    }
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    @OutputExport(name="tags", type=List.class, parameters={ClusterTag.class})
    private Output</* @Nullable */ List<ClusterTag>> tags;

    public Output</* @Nullable */ List<ClusterTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    public Output</* @Nullable */ String> getVersion() {
        return this.version;
    }

    public Cluster(String name, ClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:eks:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Cluster(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:eks:Cluster", name, null, makeResourceOptions(options, id));
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
