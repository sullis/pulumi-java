// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.GetWebAppInstanceFunctionSlotArgs;
import io.pulumi.azurenative.web.outputs.GetWebAppInstanceFunctionSlotResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWebAppInstanceFunctionSlot {
    private GetWebAppInstanceFunctionSlot() {}
    public interface BuilderApplicator {
        public void apply(GetWebAppInstanceFunctionSlotArgs.Builder a);
    }
    private static GetWebAppInstanceFunctionSlotArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetWebAppInstanceFunctionSlotArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Function information.
 * API Version: 2020-12-01.
 * 
     *
     * Function information.
 * 
     */
    public static CompletableFuture<GetWebAppInstanceFunctionSlotResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Function information.
     * API Version: 2020-12-01.
     * 
     *
         * Function information.
     * 
     */
    public static CompletableFuture<GetWebAppInstanceFunctionSlotResult> invokeAsync(GetWebAppInstanceFunctionSlotArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:getWebAppInstanceFunctionSlot", TypeShape.of(GetWebAppInstanceFunctionSlotResult.class), args == null ? GetWebAppInstanceFunctionSlotArgs.Empty : args, Utilities.withVersion(options));
    }
}