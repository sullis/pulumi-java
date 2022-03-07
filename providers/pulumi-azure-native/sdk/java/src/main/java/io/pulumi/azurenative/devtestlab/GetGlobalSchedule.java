// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.inputs.GetGlobalScheduleArgs;
import io.pulumi.azurenative.devtestlab.outputs.GetGlobalScheduleResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGlobalSchedule {
    private GetGlobalSchedule() {}
    public interface BuilderApplicator {
        public void apply(GetGlobalScheduleArgs.Builder a);
    }
    private static GetGlobalScheduleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetGlobalScheduleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A schedule.
 * API Version: 2018-09-15.
 * 
     *
     * A schedule.
 * 
     */
    public static CompletableFuture<GetGlobalScheduleResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A schedule.
     * API Version: 2018-09-15.
     * 
     *
         * A schedule.
     * 
     */
    public static CompletableFuture<GetGlobalScheduleResult> invokeAsync(GetGlobalScheduleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getGlobalSchedule", TypeShape.of(GetGlobalScheduleResult.class), args == null ? GetGlobalScheduleArgs.Empty : args, Utilities.withVersion(options));
    }
}