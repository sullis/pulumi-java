// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.GetWebAppSlotConfigurationNamesArgs;
import io.pulumi.azurenative.web.outputs.GetWebAppSlotConfigurationNamesResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWebAppSlotConfigurationNames {
/**
 * Slot Config names azure resource.
 * API Version: 2020-12-01.
 * 
 *
 * Slot Config names azure resource.
 * 
 */
    public static CompletableFuture<GetWebAppSlotConfigurationNamesResult> invokeAsync(GetWebAppSlotConfigurationNamesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:getWebAppSlotConfigurationNames", TypeShape.of(GetWebAppSlotConfigurationNamesResult.class), args == null ? GetWebAppSlotConfigurationNamesArgs.Empty : args, Utilities.withVersion(options));
    }
}
