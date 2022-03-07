// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.inputs.ListLocalUserKeysArgs;
import io.pulumi.azurenative.storage.outputs.ListLocalUserKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListLocalUserKeys {
    private ListLocalUserKeys() {}
    public interface BuilderApplicator {
        public void apply(ListLocalUserKeysArgs.Builder a);
    }
    private static ListLocalUserKeysArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListLocalUserKeysArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The Storage Account Local User keys.
 * API Version: 2021-08-01.
 * 
     *
     * The Storage Account Local User keys.
 * 
     */
    public static CompletableFuture<ListLocalUserKeysResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The Storage Account Local User keys.
     * API Version: 2021-08-01.
     * 
     *
         * The Storage Account Local User keys.
     * 
     */
    public static CompletableFuture<ListLocalUserKeysResult> invokeAsync(ListLocalUserKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:storage:listLocalUserKeys", TypeShape.of(ListLocalUserKeysResult.class), args == null ? ListLocalUserKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}