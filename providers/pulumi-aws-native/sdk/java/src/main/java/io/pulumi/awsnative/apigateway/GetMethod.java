// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.inputs.GetMethodArgs;
import io.pulumi.awsnative.apigateway.outputs.GetMethodResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMethod {
    public static CompletableFuture<GetMethodResult> invokeAsync(GetMethodArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:apigateway:getMethod", TypeShape.of(GetMethodResult.class), args == null ? GetMethodArgs.Empty : args, Utilities.withVersion(options));
    }
}
