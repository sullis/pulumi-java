// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.IPAMScopeArgs;
import io.pulumi.awsnative.ec2.enums.IPAMScopeIpamScopeType;
import io.pulumi.awsnative.ec2.outputs.IPAMScopeTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:ec2:IPAMScope")
public class IPAMScope extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="ipamArn", type=String.class, parameters={})
    private Output<String> ipamArn;

    public Output<String> getIpamArn() {
        return this.ipamArn;
    }
    @OutputExport(name="ipamId", type=String.class, parameters={})
    private Output<String> ipamId;

    public Output<String> getIpamId() {
        return this.ipamId;
    }
    @OutputExport(name="ipamScopeId", type=String.class, parameters={})
    private Output<String> ipamScopeId;

    public Output<String> getIpamScopeId() {
        return this.ipamScopeId;
    }
    @OutputExport(name="ipamScopeType", type=IPAMScopeIpamScopeType.class, parameters={})
    private Output<IPAMScopeIpamScopeType> ipamScopeType;

    public Output<IPAMScopeIpamScopeType> getIpamScopeType() {
        return this.ipamScopeType;
    }
    @OutputExport(name="isDefault", type=Boolean.class, parameters={})
    private Output<Boolean> isDefault;

    public Output<Boolean> getIsDefault() {
        return this.isDefault;
    }
    @OutputExport(name="poolCount", type=Integer.class, parameters={})
    private Output<Integer> poolCount;

    public Output<Integer> getPoolCount() {
        return this.poolCount;
    }
    @OutputExport(name="tags", type=List.class, parameters={IPAMScopeTag.class})
    private Output</* @Nullable */ List<IPAMScopeTag>> tags;

    public Output</* @Nullable */ List<IPAMScopeTag>> getTags() {
        return this.tags;
    }

    public IPAMScope(String name, IPAMScopeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:IPAMScope", name, args == null ? IPAMScopeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IPAMScope(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:IPAMScope", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static IPAMScope get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IPAMScope(name, id, options);
    }
}
