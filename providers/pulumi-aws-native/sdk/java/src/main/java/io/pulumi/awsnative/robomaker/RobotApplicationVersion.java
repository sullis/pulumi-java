// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.robomaker.RobotApplicationVersionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:robomaker:RobotApplicationVersion")
public class RobotApplicationVersion extends io.pulumi.resources.CustomResource {
    @OutputExport(name="application", type=String.class, parameters={})
    private Output<String> application;

    public Output<String> getApplication() {
        return this.application;
    }
    @OutputExport(name="applicationVersion", type=String.class, parameters={})
    private Output<String> applicationVersion;

    public Output<String> getApplicationVersion() {
        return this.applicationVersion;
    }
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="currentRevisionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> currentRevisionId;

    public Output</* @Nullable */ String> getCurrentRevisionId() {
        return this.currentRevisionId;
    }

    public RobotApplicationVersion(String name, RobotApplicationVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:robomaker:RobotApplicationVersion", name, args == null ? RobotApplicationVersionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RobotApplicationVersion(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:robomaker:RobotApplicationVersion", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static RobotApplicationVersion get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RobotApplicationVersion(name, id, options);
    }
}
