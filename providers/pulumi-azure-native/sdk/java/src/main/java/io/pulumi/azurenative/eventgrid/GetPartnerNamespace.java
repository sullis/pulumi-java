// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventgrid.inputs.GetPartnerNamespaceArgs;
import io.pulumi.azurenative.eventgrid.outputs.GetPartnerNamespaceResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPartnerNamespace {
/**
 * EventGrid Partner Namespace.
 * API Version: 2021-06-01-preview.
 * 
 *
 * EventGrid Partner Namespace.
 * 
 */
    public static CompletableFuture<GetPartnerNamespaceResult> invokeAsync(GetPartnerNamespaceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getPartnerNamespace", TypeShape.of(GetPartnerNamespaceResult.class), args == null ? GetPartnerNamespaceArgs.Empty : args, Utilities.withVersion(options));
    }
}
