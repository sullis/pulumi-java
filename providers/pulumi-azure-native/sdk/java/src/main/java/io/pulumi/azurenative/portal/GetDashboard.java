// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.portal.inputs.GetDashboardArgs;
import io.pulumi.azurenative.portal.outputs.GetDashboardResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDashboard {
/**
 * The shared dashboard resource definition.
 * API Version: 2020-09-01-preview.
 * 
 *
 * The shared dashboard resource definition.
 * 
 */
    public static CompletableFuture<GetDashboardResult> invokeAsync(GetDashboardArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:portal:getDashboard", TypeShape.of(GetDashboardResult.class), args == null ? GetDashboardArgs.Empty : args, Utilities.withVersion(options));
    }
}
