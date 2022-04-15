// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devicefarm;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.devicefarm.DevicePoolArgs;
import io.pulumi.awsnative.devicefarm.outputs.DevicePoolRule;
import io.pulumi.awsnative.devicefarm.outputs.DevicePoolTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * AWS::DeviceFarm::DevicePool creates a new Device Pool for a given DF Project
 * 
 */
@ResourceType(type="aws-native:devicefarm:DevicePool")
public class DevicePool extends io.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    @Export(name="maxDevices", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxDevices;

    public Output</* @Nullable */ Integer> maxDevices() {
        return this.maxDevices;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="projectArn", type=String.class, parameters={})
    private Output<String> projectArn;

    public Output<String> projectArn() {
        return this.projectArn;
    }
    @Export(name="rules", type=List.class, parameters={DevicePoolRule.class})
    private Output<List<DevicePoolRule>> rules;

    public Output<List<DevicePoolRule>> rules() {
        return this.rules;
    }
    @Export(name="tags", type=List.class, parameters={DevicePoolTag.class})
    private Output</* @Nullable */ List<DevicePoolTag>> tags;

    public Output</* @Nullable */ List<DevicePoolTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DevicePool(String name) {
        this(name, DevicePoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DevicePool(String name, DevicePoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DevicePool(String name, DevicePoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:devicefarm:DevicePool", name, args == null ? DevicePoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DevicePool(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:devicefarm:DevicePool", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static DevicePool get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DevicePool(name, id, options);
    }
}
