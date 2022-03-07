// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventgrid.inputs.ListDomainSharedAccessKeysArgs;
import io.pulumi.azurenative.eventgrid.outputs.ListDomainSharedAccessKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListDomainSharedAccessKeys {
    private ListDomainSharedAccessKeys() {}
    public interface BuilderApplicator {
        public void apply(ListDomainSharedAccessKeysArgs.Builder a);
    }
    private static ListDomainSharedAccessKeysArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListDomainSharedAccessKeysArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Shared access keys of the Domain.
 * API Version: 2020-06-01.
 * 
     *
     * Shared access keys of the Domain.
 * 
     */
    public static CompletableFuture<ListDomainSharedAccessKeysResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Shared access keys of the Domain.
     * API Version: 2020-06-01.
     * 
     *
         * Shared access keys of the Domain.
     * 
     */
    public static CompletableFuture<ListDomainSharedAccessKeysResult> invokeAsync(ListDomainSharedAccessKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:listDomainSharedAccessKeys", TypeShape.of(ListDomainSharedAccessKeysResult.class), args == null ? ListDomainSharedAccessKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}