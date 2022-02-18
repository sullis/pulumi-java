// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.inputs.GetMonitoringScheduleArgs;
import io.pulumi.awsnative.sagemaker.outputs.GetMonitoringScheduleResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMonitoringSchedule {
/**
 * Resource Type definition for AWS::SageMaker::MonitoringSchedule
 * 
 */
    public static CompletableFuture<GetMonitoringScheduleResult> invokeAsync(GetMonitoringScheduleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:sagemaker:getMonitoringSchedule", TypeShape.of(GetMonitoringScheduleResult.class), args == null ? GetMonitoringScheduleArgs.Empty : args, Utilities.withVersion(options));
    }
}
