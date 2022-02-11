// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudfront.inputs.GetRealtimeLogConfigArgs;
import io.pulumi.awsnative.cloudfront.outputs.GetRealtimeLogConfigResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRealtimeLogConfig {
    public static CompletableFuture<GetRealtimeLogConfigResult> invokeAsync(GetRealtimeLogConfigArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getRealtimeLogConfig", TypeShape.of(GetRealtimeLogConfigResult.class), args == null ? GetRealtimeLogConfigArgs.Empty : args, Utilities.withVersion(options));
    }
}
