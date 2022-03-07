// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.recoveryservices.inputs.GetProtectedItemArgs;
import io.pulumi.azurenative.recoveryservices.outputs.GetProtectedItemResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProtectedItem {
    private GetProtectedItem() {}
    public interface BuilderApplicator {
        public void apply(GetProtectedItemArgs.Builder a);
    }
    private static GetProtectedItemArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetProtectedItemArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Base class for backup items.
 * API Version: 2021-02-01.
 * 
     *
     * Base class for backup items.
 * 
     */
    public static CompletableFuture<GetProtectedItemResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Base class for backup items.
     * API Version: 2021-02-01.
     * 
     *
         * Base class for backup items.
     * 
     */
    public static CompletableFuture<GetProtectedItemResult> invokeAsync(GetProtectedItemArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:recoveryservices:getProtectedItem", TypeShape.of(GetProtectedItemResult.class), args == null ? GetProtectedItemArgs.Empty : args, Utilities.withVersion(options));
    }
}