// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.agfoodplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.agfoodplatform.inputs.GetFarmBeatsModelArgs;
import io.pulumi.azurenative.agfoodplatform.outputs.GetFarmBeatsModelResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFarmBeatsModel {
/**
 * FarmBeats ARM Resource.
 * API Version: 2020-05-12-preview.
 * 
 *
 * FarmBeats ARM Resource.
 * 
 */
    public static CompletableFuture<GetFarmBeatsModelResult> invokeAsync(GetFarmBeatsModelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:agfoodplatform:getFarmBeatsModel", TypeShape.of(GetFarmBeatsModelResult.class), args == null ? GetFarmBeatsModelArgs.Empty : args, Utilities.withVersion(options));
    }
}
