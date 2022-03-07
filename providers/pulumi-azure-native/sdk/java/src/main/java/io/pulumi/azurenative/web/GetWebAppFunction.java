// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.GetWebAppFunctionArgs;
import io.pulumi.azurenative.web.outputs.GetWebAppFunctionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWebAppFunction {
    private GetWebAppFunction() {}
    public interface BuilderApplicator {
        public void apply(GetWebAppFunctionArgs.Builder a);
    }
    private static GetWebAppFunctionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetWebAppFunctionArgs.builder();
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
    public static CompletableFuture<GetWebAppFunctionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
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
    public static CompletableFuture<GetWebAppFunctionResult> invokeAsync(GetWebAppFunctionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:getWebAppFunction", TypeShape.of(GetWebAppFunctionResult.class), args == null ? GetWebAppFunctionArgs.Empty : args, Utilities.withVersion(options));
    }
}