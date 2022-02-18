// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthbot;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.healthbot.inputs.GetBotArgs;
import io.pulumi.azurenative.healthbot.outputs.GetBotResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBot {
/**
 * HealthBot resource definition
 * API Version: 2020-12-08.
 * 
 *
 * HealthBot resource definition
 * 
 */
    public static CompletableFuture<GetBotResult> invokeAsync(GetBotArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:healthbot:getBot", TypeShape.of(GetBotResult.class), args == null ? GetBotArgs.Empty : args, Utilities.withVersion(options));
    }
}
