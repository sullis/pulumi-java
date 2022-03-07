// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.mixedreality;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.mixedreality.inputs.ListObjectAnchorsAccountKeysArgs;
import io.pulumi.azurenative.mixedreality.outputs.ListObjectAnchorsAccountKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListObjectAnchorsAccountKeys {
    private ListObjectAnchorsAccountKeys() {}
    public interface BuilderApplicator {
        public void apply(ListObjectAnchorsAccountKeysArgs.Builder a);
    }
    private static ListObjectAnchorsAccountKeysArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListObjectAnchorsAccountKeysArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Developer Keys of account
 * API Version: 2021-03-01-preview.
 * 
     *
     * Developer Keys of account
 * 
     */
    public static CompletableFuture<ListObjectAnchorsAccountKeysResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Developer Keys of account
     * API Version: 2021-03-01-preview.
     * 
     *
         * Developer Keys of account
     * 
     */
    public static CompletableFuture<ListObjectAnchorsAccountKeysResult> invokeAsync(ListObjectAnchorsAccountKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:mixedreality:listObjectAnchorsAccountKeys", TypeShape.of(ListObjectAnchorsAccountKeysResult.class), args == null ? ListObjectAnchorsAccountKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}