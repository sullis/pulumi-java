// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.inputs.GetIntegrationAccountSessionArgs;
import io.pulumi.azurenative.logic.outputs.GetIntegrationAccountSessionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIntegrationAccountSession {
/**
 * The integration account session.
 * API Version: 2019-05-01.
 * 
 *
 * The integration account session.
 * 
 */
    public static CompletableFuture<GetIntegrationAccountSessionResult> invokeAsync(GetIntegrationAccountSessionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:logic:getIntegrationAccountSession", TypeShape.of(GetIntegrationAccountSessionResult.class), args == null ? GetIntegrationAccountSessionArgs.Empty : args, Utilities.withVersion(options));
    }
}
