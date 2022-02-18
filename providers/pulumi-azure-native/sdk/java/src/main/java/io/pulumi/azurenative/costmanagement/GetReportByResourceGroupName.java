// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.costmanagement.inputs.GetReportByResourceGroupNameArgs;
import io.pulumi.azurenative.costmanagement.outputs.GetReportByResourceGroupNameResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetReportByResourceGroupName {
/**
 * A report resource.
 * API Version: 2018-08-01-preview.
 * 
 *
 * A report resource.
 * 
 */
    public static CompletableFuture<GetReportByResourceGroupNameResult> invokeAsync(GetReportByResourceGroupNameArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:costmanagement:getReportByResourceGroupName", TypeShape.of(GetReportByResourceGroupNameResult.class), args == null ? GetReportByResourceGroupNameArgs.Empty : args, Utilities.withVersion(options));
    }
}
