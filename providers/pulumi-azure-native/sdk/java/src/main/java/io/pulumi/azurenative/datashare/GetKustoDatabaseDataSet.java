// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.inputs.GetKustoDatabaseDataSetArgs;
import io.pulumi.azurenative.datashare.outputs.GetKustoDatabaseDataSetResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetKustoDatabaseDataSet {
    private GetKustoDatabaseDataSet() {}
    public interface BuilderApplicator {
        public void apply(GetKustoDatabaseDataSetArgs.Builder a);
    }
    private static GetKustoDatabaseDataSetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetKustoDatabaseDataSetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A kusto database data set.
 * API Version: 2020-09-01.
 * 
     *
     * A kusto database data set.
 * 
     */
    public static CompletableFuture<GetKustoDatabaseDataSetResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A kusto database data set.
     * API Version: 2020-09-01.
     * 
     *
         * A kusto database data set.
     * 
     */
    public static CompletableFuture<GetKustoDatabaseDataSetResult> invokeAsync(GetKustoDatabaseDataSetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datashare:getKustoDatabaseDataSet", TypeShape.of(GetKustoDatabaseDataSetResult.class), args == null ? GetKustoDatabaseDataSetArgs.Empty : args, Utilities.withVersion(options));
    }
}