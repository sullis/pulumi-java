// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.location.inputs.GetTrackerConsumerArgs;
import io.pulumi.awsnative.location.outputs.GetTrackerConsumerResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTrackerConsumer {
    public static CompletableFuture<GetTrackerConsumerResult> invokeAsync(GetTrackerConsumerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:location:getTrackerConsumer", TypeShape.of(GetTrackerConsumerResult.class), args == null ? GetTrackerConsumerArgs.Empty : args, Utilities.withVersion(options));
    }
}
