// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicebus.inputs.ListQueueKeysArgs;
import io.pulumi.azurenative.servicebus.outputs.ListQueueKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListQueueKeys {
    private ListQueueKeys() {}
    public interface BuilderApplicator {
        public void apply(ListQueueKeysArgs.Builder a);
    }
    private static ListQueueKeysArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListQueueKeysArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Namespace/ServiceBus Connection String
 * API Version: 2017-04-01.
 * 
     *
     * Namespace/ServiceBus Connection String
 * 
     */
    public static CompletableFuture<ListQueueKeysResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Namespace/ServiceBus Connection String
     * API Version: 2017-04-01.
     * 
     *
         * Namespace/ServiceBus Connection String
     * 
     */
    public static CompletableFuture<ListQueueKeysResult> invokeAsync(ListQueueKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:listQueueKeys", TypeShape.of(ListQueueKeysResult.class), args == null ? ListQueueKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}