// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.inputs.GetLogAnalyticExportRequestRateByIntervalArgs;
import io.pulumi.azurenative.compute.outputs.GetLogAnalyticExportRequestRateByIntervalResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLogAnalyticExportRequestRateByInterval {
/**
 * LogAnalytics operation status response
 * API Version: 2020-12-01.
 * 
 *
 * LogAnalytics operation status response
 * 
 */
    public static CompletableFuture<GetLogAnalyticExportRequestRateByIntervalResult> invokeAsync(GetLogAnalyticExportRequestRateByIntervalArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getLogAnalyticExportRequestRateByInterval", TypeShape.of(GetLogAnalyticExportRequestRateByIntervalResult.class), args == null ? GetLogAnalyticExportRequestRateByIntervalArgs.Empty : args, Utilities.withVersion(options));
    }
}
