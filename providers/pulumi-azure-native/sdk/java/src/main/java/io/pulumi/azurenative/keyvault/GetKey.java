// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.keyvault.inputs.GetKeyArgs;
import io.pulumi.azurenative.keyvault.outputs.GetKeyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetKey {
    private GetKey() {}
    public interface BuilderApplicator {
        public void apply(GetKeyArgs.Builder a);
    }
    private static GetKeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetKeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The key resource.
 * API Version: 2019-09-01.
 * 
     *
     * The key resource.
 * 
     */
    public static CompletableFuture<GetKeyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The key resource.
     * API Version: 2019-09-01.
     * 
     *
         * The key resource.
     * 
     */
    public static CompletableFuture<GetKeyResult> invokeAsync(GetKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:keyvault:getKey", TypeShape.of(GetKeyResult.class), args == null ? GetKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}