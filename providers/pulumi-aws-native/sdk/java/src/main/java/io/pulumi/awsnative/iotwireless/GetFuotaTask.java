// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotwireless.inputs.GetFuotaTaskArgs;
import io.pulumi.awsnative.iotwireless.outputs.GetFuotaTaskResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFuotaTask {
/**
 * Create and manage FUOTA tasks.
 * 
 */
    public static CompletableFuture<GetFuotaTaskResult> invokeAsync(GetFuotaTaskArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotwireless:getFuotaTask", TypeShape.of(GetFuotaTaskResult.class), args == null ? GetFuotaTaskArgs.Empty : args, Utilities.withVersion(options));
    }
}
