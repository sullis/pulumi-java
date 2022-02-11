// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudwatch;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudwatch.CompositeAlarmArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:cloudwatch:CompositeAlarm")
public class CompositeAlarm extends io.pulumi.resources.CustomResource {
    @OutputExport(name="actionsEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> actionsEnabled;

    public Output</* @Nullable */ Boolean> getActionsEnabled() {
        return this.actionsEnabled;
    }
    @OutputExport(name="alarmActions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> alarmActions;

    public Output</* @Nullable */ List<String>> getAlarmActions() {
        return this.alarmActions;
    }
    @OutputExport(name="alarmDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> alarmDescription;

    public Output</* @Nullable */ String> getAlarmDescription() {
        return this.alarmDescription;
    }
    @OutputExport(name="alarmName", type=String.class, parameters={})
    private Output<String> alarmName;

    public Output<String> getAlarmName() {
        return this.alarmName;
    }
    @OutputExport(name="alarmRule", type=String.class, parameters={})
    private Output<String> alarmRule;

    public Output<String> getAlarmRule() {
        return this.alarmRule;
    }
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="insufficientDataActions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> insufficientDataActions;

    public Output</* @Nullable */ List<String>> getInsufficientDataActions() {
        return this.insufficientDataActions;
    }
    @OutputExport(name="oKActions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> oKActions;

    public Output</* @Nullable */ List<String>> getOKActions() {
        return this.oKActions;
    }

    public CompositeAlarm(String name, CompositeAlarmArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudwatch:CompositeAlarm", name, args == null ? CompositeAlarmArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CompositeAlarm(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudwatch:CompositeAlarm", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static CompositeAlarm get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CompositeAlarm(name, id, options);
    }
}
