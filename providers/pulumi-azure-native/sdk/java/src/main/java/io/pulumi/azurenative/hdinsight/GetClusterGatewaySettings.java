// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hdinsight.inputs.GetClusterGatewaySettingsArgs;
import io.pulumi.azurenative.hdinsight.outputs.GetClusterGatewaySettingsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetClusterGatewaySettings {
/**
 * Gateway settings.
 * API Version: 2018-06-01-preview.
 * 
 *
 * Gateway settings.
 * 
 */
    public static CompletableFuture<GetClusterGatewaySettingsResult> invokeAsync(GetClusterGatewaySettingsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hdinsight:getClusterGatewaySettings", TypeShape.of(GetClusterGatewaySettingsResult.class), args == null ? GetClusterGatewaySettingsArgs.Empty : args, Utilities.withVersion(options));
    }
}
