// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.inputs.ListScheduleApplicableArgs;
import io.pulumi.azurenative.devtestlab.outputs.ListScheduleApplicableResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListScheduleApplicable {
    private ListScheduleApplicable() {}
    public interface BuilderApplicator {
        public void apply(ListScheduleApplicableArgs.Builder a);
    }
    private static ListScheduleApplicableArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListScheduleApplicableArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The response of a list operation.
 * API Version: 2018-09-15.
 * 
     *
     * The response of a list operation.
 * 
     */
    public static CompletableFuture<ListScheduleApplicableResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The response of a list operation.
     * API Version: 2018-09-15.
     * 
     *
         * The response of a list operation.
     * 
     */
    public static CompletableFuture<ListScheduleApplicableResult> invokeAsync(ListScheduleApplicableArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:listScheduleApplicable", TypeShape.of(ListScheduleApplicableResult.class), args == null ? ListScheduleApplicableArgs.Empty : args, Utilities.withVersion(options));
    }
}