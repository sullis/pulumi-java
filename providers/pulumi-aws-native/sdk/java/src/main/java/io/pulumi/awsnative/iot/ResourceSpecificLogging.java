// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iot.ResourceSpecificLoggingArgs;
import io.pulumi.awsnative.iot.enums.ResourceSpecificLoggingLogLevel;
import io.pulumi.awsnative.iot.enums.ResourceSpecificLoggingTargetType;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource-specific logging allows you to specify a logging level for a specific thing group.
 * 
 */
@ResourceType(type="aws-native:iot:ResourceSpecificLogging")
public class ResourceSpecificLogging extends io.pulumi.resources.CustomResource {
    /**
     * The log level for a specific target. Valid values are: ERROR, WARN, INFO, DEBUG, or DISABLED.
     * 
     */
    @OutputExport(name="logLevel", type=ResourceSpecificLoggingLogLevel.class, parameters={})
    private Output<ResourceSpecificLoggingLogLevel> logLevel;

    /**
     * @return The log level for a specific target. Valid values are: ERROR, WARN, INFO, DEBUG, or DISABLED.
     * 
     */
    public Output<ResourceSpecificLoggingLogLevel> getLogLevel() {
        return this.logLevel;
    }
    /**
     * Unique Id for a Target (TargetType:TargetName), this will be internally built to serve as primary identifier for a log target.
     * 
     */
    @OutputExport(name="targetId", type=String.class, parameters={})
    private Output<String> targetId;

    /**
     * @return Unique Id for a Target (TargetType:TargetName), this will be internally built to serve as primary identifier for a log target.
     * 
     */
    public Output<String> getTargetId() {
        return this.targetId;
    }
    /**
     * The target name.
     * 
     */
    @OutputExport(name="targetName", type=String.class, parameters={})
    private Output<String> targetName;

    /**
     * @return The target name.
     * 
     */
    public Output<String> getTargetName() {
        return this.targetName;
    }
    /**
     * The target type. Value must be THING_GROUP.
     * 
     */
    @OutputExport(name="targetType", type=ResourceSpecificLoggingTargetType.class, parameters={})
    private Output<ResourceSpecificLoggingTargetType> targetType;

    /**
     * @return The target type. Value must be THING_GROUP.
     * 
     */
    public Output<ResourceSpecificLoggingTargetType> getTargetType() {
        return this.targetType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceSpecificLogging(String name, ResourceSpecificLoggingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:ResourceSpecificLogging", name, args == null ? ResourceSpecificLoggingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResourceSpecificLogging(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:ResourceSpecificLogging", name, null, makeResourceOptions(options, id));
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
    public static ResourceSpecificLogging get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourceSpecificLogging(name, id, options);
    }
}
