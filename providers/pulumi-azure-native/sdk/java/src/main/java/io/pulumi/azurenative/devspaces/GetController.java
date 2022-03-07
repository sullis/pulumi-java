// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devspaces;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devspaces.inputs.GetControllerArgs;
import io.pulumi.azurenative.devspaces.outputs.GetControllerResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetController {
    private GetController() {}
    public interface BuilderApplicator {
        public void apply(GetControllerArgs.Builder a);
    }
    private static GetControllerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetControllerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * API Version: 2019-04-01.
 * 
     */
    public static CompletableFuture<GetControllerResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * API Version: 2019-04-01.
     * 
     */
    public static CompletableFuture<GetControllerResult> invokeAsync(GetControllerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devspaces:getController", TypeShape.of(GetControllerResult.class), args == null ? GetControllerArgs.Empty : args, Utilities.withVersion(options));
    }
}