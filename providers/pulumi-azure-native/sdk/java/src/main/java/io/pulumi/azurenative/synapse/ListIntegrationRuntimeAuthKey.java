// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.inputs.ListIntegrationRuntimeAuthKeyArgs;
import io.pulumi.azurenative.synapse.outputs.ListIntegrationRuntimeAuthKeyResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListIntegrationRuntimeAuthKey {
/**
 * The integration runtime authentication keys.
 * API Version: 2021-03-01.
 * 
 *
 * The integration runtime authentication keys.
 * 
 */
    public static CompletableFuture<ListIntegrationRuntimeAuthKeyResult> invokeAsync(ListIntegrationRuntimeAuthKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:synapse:listIntegrationRuntimeAuthKey", TypeShape.of(ListIntegrationRuntimeAuthKeyResult.class), args == null ? ListIntegrationRuntimeAuthKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}
