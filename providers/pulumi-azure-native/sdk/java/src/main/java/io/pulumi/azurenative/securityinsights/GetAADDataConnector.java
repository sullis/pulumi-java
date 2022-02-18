// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.inputs.GetAADDataConnectorArgs;
import io.pulumi.azurenative.securityinsights.outputs.GetAADDataConnectorResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAADDataConnector {
/**
 * Represents AAD (Azure Active Directory) data connector.
 * API Version: 2020-01-01.
 * 
 *
 * Represents AAD (Azure Active Directory) data connector.
 * 
 */
    public static CompletableFuture<GetAADDataConnectorResult> invokeAsync(GetAADDataConnectorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityinsights:getAADDataConnector", TypeShape.of(GetAADDataConnectorResult.class), args == null ? GetAADDataConnectorArgs.Empty : args, Utilities.withVersion(options));
    }
}
