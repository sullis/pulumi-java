// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.robomaker.RobotArgs;
import io.pulumi.awsnative.robomaker.enums.RobotArchitecture;
import io.pulumi.awsnative.robomaker.outputs.RobotTags;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * AWS::RoboMaker::Robot resource creates an AWS RoboMaker fleet.
 * 
 */
@ResourceType(type="aws-native:robomaker:Robot")
public class Robot extends io.pulumi.resources.CustomResource {
    /**
     * The target architecture of the robot.
     * 
     */
    @Export(name="architecture", type=RobotArchitecture.class, parameters={})
    private Output<RobotArchitecture> architecture;

    /**
     * @return The target architecture of the robot.
     * 
     */
    public Output<RobotArchitecture> architecture() {
        return this.architecture;
    }
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The Amazon Resource Name (ARN) of the fleet.
     * 
     */
    @Export(name="fleet", type=String.class, parameters={})
    private Output</* @Nullable */ String> fleet;

    /**
     * @return The Amazon Resource Name (ARN) of the fleet.
     * 
     */
    public Output</* @Nullable */ String> fleet() {
        return this.fleet;
    }
    /**
     * The Greengrass group id.
     * 
     */
    @Export(name="greengrassGroupId", type=String.class, parameters={})
    private Output<String> greengrassGroupId;

    /**
     * @return The Greengrass group id.
     * 
     */
    public Output<String> greengrassGroupId() {
        return this.greengrassGroupId;
    }
    /**
     * The name for the robot.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name for the robot.
     * 
     */
    public Output</* @Nullable */ String> name() {
        return this.name;
    }
    @Export(name="tags", type=RobotTags.class, parameters={})
    private Output</* @Nullable */ RobotTags> tags;

    public Output</* @Nullable */ RobotTags> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Robot(String name) {
        this(name, RobotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Robot(String name, RobotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Robot(String name, RobotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:robomaker:Robot", name, args == null ? RobotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Robot(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:robomaker:Robot", name, null, makeResourceOptions(options, id));
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
    public static Robot get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Robot(name, id, options);
    }
}
