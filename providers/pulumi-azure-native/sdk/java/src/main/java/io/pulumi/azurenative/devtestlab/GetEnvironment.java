// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.inputs.GetEnvironmentArgs;
import io.pulumi.azurenative.devtestlab.outputs.GetEnvironmentResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEnvironment {
/**
 * An environment, which is essentially an ARM template deployment.
 * API Version: 2018-09-15.
 * 
 *
 * An environment, which is essentially an ARM template deployment.
 * 
 */
    public static CompletableFuture<GetEnvironmentResult> invokeAsync(GetEnvironmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args == null ? GetEnvironmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
