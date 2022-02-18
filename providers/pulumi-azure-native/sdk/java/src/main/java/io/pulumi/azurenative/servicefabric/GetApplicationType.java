// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicefabric.inputs.GetApplicationTypeArgs;
import io.pulumi.azurenative.servicefabric.outputs.GetApplicationTypeResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetApplicationType {
/**
 * The application type name resource
 * API Version: 2020-03-01.
 * 
 *
 * The application type name resource
 * 
 */
    public static CompletableFuture<GetApplicationTypeResult> invokeAsync(GetApplicationTypeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabric:getApplicationType", TypeShape.of(GetApplicationTypeResult.class), args == null ? GetApplicationTypeArgs.Empty : args, Utilities.withVersion(options));
    }
}
