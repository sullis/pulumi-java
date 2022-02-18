// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appplatform.inputs.ListServiceTestKeysArgs;
import io.pulumi.azurenative.appplatform.outputs.ListServiceTestKeysResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListServiceTestKeys {
/**
 * Test keys payload
 * API Version: 2020-07-01.
 * 
 *
 * Test keys payload
 * 
 */
    public static CompletableFuture<ListServiceTestKeysResult> invokeAsync(ListServiceTestKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:listServiceTestKeys", TypeShape.of(ListServiceTestKeysResult.class), args == null ? ListServiceTestKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
