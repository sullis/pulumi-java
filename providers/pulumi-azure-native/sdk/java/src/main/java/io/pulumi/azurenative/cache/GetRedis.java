// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cache.inputs.GetRedisArgs;
import io.pulumi.azurenative.cache.outputs.GetRedisResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRedis {
/**
 * A single Redis item in List or Get Operation.
 * API Version: 2020-06-01.
 * 
 *
 * A single Redis item in List or Get Operation.
 * 
 */
    public static CompletableFuture<GetRedisResult> invokeAsync(GetRedisArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cache:getRedis", TypeShape.of(GetRedisResult.class), args == null ? GetRedisArgs.Empty : args, Utilities.withVersion(options));
    }
}
