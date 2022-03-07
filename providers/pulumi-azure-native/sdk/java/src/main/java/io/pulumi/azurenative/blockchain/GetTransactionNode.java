// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.blockchain.inputs.GetTransactionNodeArgs;
import io.pulumi.azurenative.blockchain.outputs.GetTransactionNodeResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTransactionNode {
    private GetTransactionNode() {}
    public interface BuilderApplicator {
        public void apply(GetTransactionNodeArgs.Builder a);
    }
    private static GetTransactionNodeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTransactionNodeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Payload of the transaction node which is the request/response of the resource provider.
 * API Version: 2018-06-01-preview.
 * 
     *
     * Payload of the transaction node which is the request/response of the resource provider.
 * 
     */
    public static CompletableFuture<GetTransactionNodeResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Payload of the transaction node which is the request/response of the resource provider.
     * API Version: 2018-06-01-preview.
     * 
     *
         * Payload of the transaction node which is the request/response of the resource provider.
     * 
     */
    public static CompletableFuture<GetTransactionNodeResult> invokeAsync(GetTransactionNodeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:blockchain:getTransactionNode", TypeShape.of(GetTransactionNodeResult.class), args == null ? GetTransactionNodeArgs.Empty : args, Utilities.withVersion(options));
    }
}