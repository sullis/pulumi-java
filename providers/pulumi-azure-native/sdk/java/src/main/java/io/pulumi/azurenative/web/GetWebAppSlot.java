// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.GetWebAppSlotArgs;
import io.pulumi.azurenative.web.outputs.GetWebAppSlotResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWebAppSlot {
/**
 * A web app, a mobile app backend, or an API app.
 * API Version: 2020-12-01.
 * 
 *
 * A web app, a mobile app backend, or an API app.
 * 
 */
    public static CompletableFuture<GetWebAppSlotResult> invokeAsync(GetWebAppSlotArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:getWebAppSlot", TypeShape.of(GetWebAppSlotResult.class), args == null ? GetWebAppSlotArgs.Empty : args, Utilities.withVersion(options));
    }
}
