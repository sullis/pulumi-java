// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybriddata;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybriddata.inputs.GetDataStoreArgs;
import io.pulumi.azurenative.hybriddata.outputs.GetDataStoreResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDataStore {
    private GetDataStore() {}
    public interface BuilderApplicator {
        public void apply(GetDataStoreArgs.Builder a);
    }
    private static GetDataStoreArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDataStoreArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Data store.
 * API Version: 2019-06-01.
 * 
     *
     * Data store.
 * 
     */
    public static CompletableFuture<GetDataStoreResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Data store.
     * API Version: 2019-06-01.
     * 
     *
         * Data store.
     * 
     */
    public static CompletableFuture<GetDataStoreResult> invokeAsync(GetDataStoreArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hybriddata:getDataStore", TypeShape.of(GetDataStoreResult.class), args == null ? GetDataStoreArgs.Empty : args, Utilities.withVersion(options));
    }
}