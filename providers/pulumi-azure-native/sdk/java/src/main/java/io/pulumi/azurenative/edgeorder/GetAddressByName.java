// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.edgeorder.inputs.GetAddressByNameArgs;
import io.pulumi.azurenative.edgeorder.outputs.GetAddressByNameResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAddressByName {
/**
 * Address Resource.
 * API Version: 2021-12-01.
 * 
 *
 * Address Resource.
 * 
 */
    public static CompletableFuture<GetAddressByNameResult> invokeAsync(GetAddressByNameArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:edgeorder:getAddressByName", TypeShape.of(GetAddressByNameResult.class), args == null ? GetAddressByNameArgs.Empty : args, Utilities.withVersion(options));
    }
}
