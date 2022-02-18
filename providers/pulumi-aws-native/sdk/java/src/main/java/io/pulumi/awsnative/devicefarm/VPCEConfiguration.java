// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devicefarm;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.devicefarm.VPCEConfigurationArgs;
import io.pulumi.awsnative.devicefarm.outputs.VPCEConfigurationTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * AWS::DeviceFarm::VPCEConfiguration creates a new Device Farm VPCE Configuration
 * 
 */
@ResourceType(type="aws-native:devicefarm:VPCEConfiguration")
public class VPCEConfiguration extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="serviceDnsName", type=String.class, parameters={})
    private Output<String> serviceDnsName;

    public Output<String> getServiceDnsName() {
        return this.serviceDnsName;
    }
    @OutputExport(name="tags", type=List.class, parameters={VPCEConfigurationTag.class})
    private Output</* @Nullable */ List<VPCEConfigurationTag>> tags;

    public Output</* @Nullable */ List<VPCEConfigurationTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="vpceConfigurationDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpceConfigurationDescription;

    public Output</* @Nullable */ String> getVpceConfigurationDescription() {
        return this.vpceConfigurationDescription;
    }
    @OutputExport(name="vpceConfigurationName", type=String.class, parameters={})
    private Output<String> vpceConfigurationName;

    public Output<String> getVpceConfigurationName() {
        return this.vpceConfigurationName;
    }
    @OutputExport(name="vpceServiceName", type=String.class, parameters={})
    private Output<String> vpceServiceName;

    public Output<String> getVpceServiceName() {
        return this.vpceServiceName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VPCEConfiguration(String name, VPCEConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:devicefarm:VPCEConfiguration", name, args == null ? VPCEConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VPCEConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:devicefarm:VPCEConfiguration", name, null, makeResourceOptions(options, id));
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
    public static VPCEConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VPCEConfiguration(name, id, options);
    }
}
