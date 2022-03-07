// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.myedgeorder;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.myedgeorder.Utilities;
import io.pulumi.myedgeorder.inputs.ListProductFamiliesArgs;
import io.pulumi.myedgeorder.outputs.ListProductFamiliesResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListProductFamilies {
    private ListProductFamilies() {}
    public interface BuilderApplicator {
        public void apply(ListProductFamiliesArgs.Builder a);
    }
    private static ListProductFamiliesArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListProductFamiliesArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The list of product families.
 * API Version: 2020-12-01-preview.
 * 
     *
     * The list of product families.
 * 
     */
    public static CompletableFuture<ListProductFamiliesResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The list of product families.
     * API Version: 2020-12-01-preview.
     * 
     *
         * The list of product families.
     * 
     */
    public static CompletableFuture<ListProductFamiliesResult> invokeAsync(ListProductFamiliesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("myedgeorder::listProductFamilies", TypeShape.of(ListProductFamiliesResult.class), args == null ? ListProductFamiliesArgs.Empty : args, Utilities.withVersion(options));
    }
}