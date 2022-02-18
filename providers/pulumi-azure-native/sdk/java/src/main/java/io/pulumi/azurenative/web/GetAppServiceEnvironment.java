// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.GetAppServiceEnvironmentArgs;
import io.pulumi.azurenative.web.outputs.GetAppServiceEnvironmentResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAppServiceEnvironment {
/**
 * App Service Environment ARM resource.
 * API Version: 2020-12-01.
 * 
 *
 * App Service Environment ARM resource.
 * 
 */
    public static CompletableFuture<GetAppServiceEnvironmentResult> invokeAsync(GetAppServiceEnvironmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:getAppServiceEnvironment", TypeShape.of(GetAppServiceEnvironmentResult.class), args == null ? GetAppServiceEnvironmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
