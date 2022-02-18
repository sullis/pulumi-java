// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.security.inputs.GetIngestionSettingArgs;
import io.pulumi.azurenative.security.outputs.GetIngestionSettingResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIngestionSetting {
/**
 * Configures how to correlate scan data and logs with resources associated with the subscription.
 * API Version: 2021-01-15-preview.
 * 
 *
 * Configures how to correlate scan data and logs with resources associated with the subscription.
 * 
 */
    public static CompletableFuture<GetIngestionSettingResult> invokeAsync(GetIngestionSettingArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:security:getIngestionSetting", TypeShape.of(GetIngestionSettingResult.class), args == null ? GetIngestionSettingArgs.Empty : args, Utilities.withVersion(options));
    }
}
