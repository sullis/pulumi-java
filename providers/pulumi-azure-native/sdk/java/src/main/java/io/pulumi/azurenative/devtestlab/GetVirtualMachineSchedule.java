// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.inputs.GetVirtualMachineScheduleArgs;
import io.pulumi.azurenative.devtestlab.outputs.GetVirtualMachineScheduleResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVirtualMachineSchedule {
    private GetVirtualMachineSchedule() {}
    public interface BuilderApplicator {
        public void apply(GetVirtualMachineScheduleArgs.Builder a);
    }
    private static GetVirtualMachineScheduleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetVirtualMachineScheduleArgs.builder();
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
    public static CompletableFuture<GetVirtualMachineScheduleResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
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
    public static CompletableFuture<GetVirtualMachineScheduleResult> invokeAsync(GetVirtualMachineScheduleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getVirtualMachineSchedule", TypeShape.of(GetVirtualMachineScheduleResult.class), args == null ? GetVirtualMachineScheduleArgs.Empty : args, Utilities.withVersion(options));
    }
}