// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.m365securityandcompliance;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.m365securityandcompliance.inputs.GetPrivateEndpointConnectionsForSCCPowershellArgs;
import io.pulumi.azurenative.m365securityandcompliance.outputs.GetPrivateEndpointConnectionsForSCCPowershellResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrivateEndpointConnectionsForSCCPowershell {
/**
 * The Private Endpoint Connection resource.
 * API Version: 2021-03-25-preview.
 * 
 *
 * The Private Endpoint Connection resource.
 * 
 */
    public static CompletableFuture<GetPrivateEndpointConnectionsForSCCPowershellResult> invokeAsync(GetPrivateEndpointConnectionsForSCCPowershellArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:m365securityandcompliance:getPrivateEndpointConnectionsForSCCPowershell", TypeShape.of(GetPrivateEndpointConnectionsForSCCPowershellResult.class), args == null ? GetPrivateEndpointConnectionsForSCCPowershellArgs.Empty : args, Utilities.withVersion(options));
    }
}
