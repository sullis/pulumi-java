// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.labservices.inputs.GetLabAccountArgs;
import io.pulumi.azurenative.labservices.outputs.GetLabAccountResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLabAccount {
/**
 * Represents a lab account.
 * API Version: 2018-10-15.
 * 
 *
 * Represents a lab account.
 * 
 */
    public static CompletableFuture<GetLabAccountResult> invokeAsync(GetLabAccountArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getLabAccount", TypeShape.of(GetLabAccountResult.class), args == null ? GetLabAccountArgs.Empty : args, Utilities.withVersion(options));
    }
}
