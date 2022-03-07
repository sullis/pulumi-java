// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.inputs.GetStorageAccountArgs;
import io.pulumi.azurenative.databoxedge.outputs.GetStorageAccountResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetStorageAccount {
    private GetStorageAccount() {}
    public interface BuilderApplicator {
        public void apply(GetStorageAccountArgs.Builder a);
    }
    private static GetStorageAccountArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetStorageAccountArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Represents a Storage Account on the  Data Box Edge/Gateway device.
 * API Version: 2020-12-01.
 * 
     *
     * Represents a Storage Account on the  Data Box Edge/Gateway device.
 * 
     */
    public static CompletableFuture<GetStorageAccountResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Represents a Storage Account on the  Data Box Edge/Gateway device.
     * API Version: 2020-12-01.
     * 
     *
         * Represents a Storage Account on the  Data Box Edge/Gateway device.
     * 
     */
    public static CompletableFuture<GetStorageAccountResult> invokeAsync(GetStorageAccountArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getStorageAccount", TypeShape.of(GetStorageAccountResult.class), args == null ? GetStorageAccountArgs.Empty : args, Utilities.withVersion(options));
    }
}