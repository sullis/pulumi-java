// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.inputs.GetSecretArgs;
import io.pulumi.azurenative.devtestlab.outputs.GetSecretResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSecret {
/**
 * A secret.
 * API Version: 2018-09-15.
 * 
 *
 * A secret.
 * 
 */
    public static CompletableFuture<GetSecretResult> invokeAsync(GetSecretArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getSecret", TypeShape.of(GetSecretResult.class), args == null ? GetSecretArgs.Empty : args, Utilities.withVersion(options));
    }
}
