// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.robomaker.FleetArgs;
import io.pulumi.awsnative.robomaker.outputs.FleetTags;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * AWS::RoboMaker::Fleet resource creates an AWS RoboMaker fleet. Fleets contain robots and can receive deployments.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:robomaker:Fleet")
public class Fleet extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name of the fleet.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the fleet.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="tags", type=FleetTags.class, parameters={})
    private Output</* @Nullable */ FleetTags> tags;

    public Output</* @Nullable */ FleetTags> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Fleet(String name, @Nullable FleetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:robomaker:Fleet", name, args == null ? FleetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Fleet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:robomaker:Fleet", name, null, makeResourceOptions(options, id));
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
    public static Fleet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Fleet(name, id, options);
    }
}
