// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.eks.FargateProfileArgs;
import io.pulumi.awsnative.eks.outputs.FargateProfileSelector;
import io.pulumi.awsnative.eks.outputs.FargateProfileTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:eks:FargateProfile")
public class FargateProfile extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="clusterName", type=String.class, parameters={})
    private Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }
    @OutputExport(name="fargateProfileName", type=String.class, parameters={})
    private Output</* @Nullable */ String> fargateProfileName;

    public Output</* @Nullable */ String> getFargateProfileName() {
        return this.fargateProfileName;
    }
    @OutputExport(name="podExecutionRoleArn", type=String.class, parameters={})
    private Output<String> podExecutionRoleArn;

    public Output<String> getPodExecutionRoleArn() {
        return this.podExecutionRoleArn;
    }
    @OutputExport(name="selectors", type=List.class, parameters={FargateProfileSelector.class})
    private Output<List<FargateProfileSelector>> selectors;

    public Output<List<FargateProfileSelector>> getSelectors() {
        return this.selectors;
    }
    @OutputExport(name="subnets", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> subnets;

    public Output</* @Nullable */ List<String>> getSubnets() {
        return this.subnets;
    }
    @OutputExport(name="tags", type=List.class, parameters={FargateProfileTag.class})
    private Output</* @Nullable */ List<FargateProfileTag>> tags;

    public Output</* @Nullable */ List<FargateProfileTag>> getTags() {
        return this.tags;
    }

    public FargateProfile(String name, FargateProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:eks:FargateProfile", name, args == null ? FargateProfileArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FargateProfile(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:eks:FargateProfile", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static FargateProfile get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FargateProfile(name, id, options);
    }
}
