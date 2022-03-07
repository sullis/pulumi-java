// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.inputs.GetSqlDBTableDataSetMappingArgs;
import io.pulumi.azurenative.datashare.outputs.GetSqlDBTableDataSetMappingResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSqlDBTableDataSetMapping {
    private GetSqlDBTableDataSetMapping() {}
    public interface BuilderApplicator {
        public void apply(GetSqlDBTableDataSetMappingArgs.Builder a);
    }
    private static GetSqlDBTableDataSetMappingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetSqlDBTableDataSetMappingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A SQL DB Table data set mapping.
 * API Version: 2020-09-01.
 * 
     *
     * A SQL DB Table data set mapping.
 * 
     */
    public static CompletableFuture<GetSqlDBTableDataSetMappingResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A SQL DB Table data set mapping.
     * API Version: 2020-09-01.
     * 
     *
         * A SQL DB Table data set mapping.
     * 
     */
    public static CompletableFuture<GetSqlDBTableDataSetMappingResult> invokeAsync(GetSqlDBTableDataSetMappingArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datashare:getSqlDBTableDataSetMapping", TypeShape.of(GetSqlDBTableDataSetMappingResult.class), args == null ? GetSqlDBTableDataSetMappingArgs.Empty : args, Utilities.withVersion(options));
    }
}