// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.inputs.GetRosettaNetProcessConfigurationArgs;
import io.pulumi.azurenative.logic.outputs.GetRosettaNetProcessConfigurationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRosettaNetProcessConfiguration {
/**
 * The integration account RosettaNet process configuration.
 * API Version: 2016-06-01.
 * 
 *
 * The integration account RosettaNet process configuration.
 * 
 */
    public static CompletableFuture<GetRosettaNetProcessConfigurationResult> invokeAsync(GetRosettaNetProcessConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:logic:getRosettaNetProcessConfiguration", TypeShape.of(GetRosettaNetProcessConfigurationResult.class), args == null ? GetRosettaNetProcessConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}
