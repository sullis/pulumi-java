// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.mediaconnect.inputs.GetFlowArgs;
import io.pulumi.awsnative.mediaconnect.outputs.GetFlowResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFlow {
/**
 * Resource schema for AWS::MediaConnect::Flow
 * 
 */
    public static CompletableFuture<GetFlowResult> invokeAsync(GetFlowArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:mediaconnect:getFlow", TypeShape.of(GetFlowResult.class), args == null ? GetFlowArgs.Empty : args, Utilities.withVersion(options));
    }
}
