// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.recoveryservices.inputs.GetVaultArgs;
import io.pulumi.azurenative.recoveryservices.outputs.GetVaultResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVault {
    private GetVault() {}
    public interface BuilderApplicator {
        public void apply(GetVaultArgs.Builder a);
    }
    private static GetVaultArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetVaultArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource information, as returned by the resource provider.
 * API Version: 2021-01-01.
 * 
     *
     * Resource information, as returned by the resource provider.
 * 
     */
    public static CompletableFuture<GetVaultResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource information, as returned by the resource provider.
     * API Version: 2021-01-01.
     * 
     *
         * Resource information, as returned by the resource provider.
     * 
     */
    public static CompletableFuture<GetVaultResult> invokeAsync(GetVaultArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:recoveryservices:getVault", TypeShape.of(GetVaultResult.class), args == null ? GetVaultArgs.Empty : args, Utilities.withVersion(options));
    }
}