// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cognitiveservices.inputs.GetAccountArgs;
import io.pulumi.azurenative.cognitiveservices.outputs.GetAccountResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAccount {
/**
 * Cognitive Services Account is an Azure resource representing the provisioned account, its type, location and SKU.
 * API Version: 2017-04-18.
 * 
 *
 * Cognitive Services Account is an Azure resource representing the provisioned account, its type, location and SKU.
 * 
 */
    public static CompletableFuture<GetAccountResult> invokeAsync(GetAccountArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cognitiveservices:getAccount", TypeShape.of(GetAccountResult.class), args == null ? GetAccountArgs.Empty : args, Utilities.withVersion(options));
    }
}
