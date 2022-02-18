// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.inputs.GetModelVersionArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.GetModelVersionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetModelVersion {
/**
 * Azure Resource Manager resource envelope.
 * API Version: 2021-03-01-preview.
 * 
 *
 * Azure Resource Manager resource envelope.
 * 
 */
    public static CompletableFuture<GetModelVersionResult> invokeAsync(GetModelVersionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearningservices:getModelVersion", TypeShape.of(GetModelVersionResult.class), args == null ? GetModelVersionArgs.Empty : args, Utilities.withVersion(options));
    }
}
