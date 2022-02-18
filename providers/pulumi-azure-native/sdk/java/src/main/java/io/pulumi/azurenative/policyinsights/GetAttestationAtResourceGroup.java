// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.policyinsights.inputs.GetAttestationAtResourceGroupArgs;
import io.pulumi.azurenative.policyinsights.outputs.GetAttestationAtResourceGroupResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAttestationAtResourceGroup {
/**
 * An attestation resource.
 * API Version: 2021-01-01.
 * 
 *
 * An attestation resource.
 * 
 */
    public static CompletableFuture<GetAttestationAtResourceGroupResult> invokeAsync(GetAttestationAtResourceGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:policyinsights:getAttestationAtResourceGroup", TypeShape.of(GetAttestationAtResourceGroupResult.class), args == null ? GetAttestationAtResourceGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
