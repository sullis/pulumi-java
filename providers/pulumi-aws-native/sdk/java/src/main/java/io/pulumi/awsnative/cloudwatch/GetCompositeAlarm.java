// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudwatch;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudwatch.inputs.GetCompositeAlarmArgs;
import io.pulumi.awsnative.cloudwatch.outputs.GetCompositeAlarmResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCompositeAlarm {
/**
 * The AWS::CloudWatch::CompositeAlarm type specifies an alarm which aggregates the states of other Alarms (Metric or Composite Alarms) as defined by the AlarmRule expression
 * 
 */
    public static CompletableFuture<GetCompositeAlarmResult> invokeAsync(GetCompositeAlarmArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudwatch:getCompositeAlarm", TypeShape.of(GetCompositeAlarmResult.class), args == null ? GetCompositeAlarmArgs.Empty : args, Utilities.withVersion(options));
    }
}
