// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azurearcdata.inputs.GetDataControllerArgs;
import io.pulumi.azurenative.azurearcdata.outputs.GetDataControllerResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDataController {
/**
 * Data controller resource
 * API Version: 2021-06-01-preview.
 * 
 *
 * Data controller resource
 * 
 */
    public static CompletableFuture<GetDataControllerResult> invokeAsync(GetDataControllerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:azurearcdata:getDataController", TypeShape.of(GetDataControllerResult.class), args == null ? GetDataControllerArgs.Empty : args, Utilities.withVersion(options));
    }
}
