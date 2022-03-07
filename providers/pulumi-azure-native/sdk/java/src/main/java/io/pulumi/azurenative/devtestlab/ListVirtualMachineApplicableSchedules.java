// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.inputs.ListVirtualMachineApplicableSchedulesArgs;
import io.pulumi.azurenative.devtestlab.outputs.ListVirtualMachineApplicableSchedulesResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListVirtualMachineApplicableSchedules {
    private ListVirtualMachineApplicableSchedules() {}
    public interface BuilderApplicator {
        public void apply(ListVirtualMachineApplicableSchedulesArgs.Builder a);
    }
    private static ListVirtualMachineApplicableSchedulesArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListVirtualMachineApplicableSchedulesArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Schedules applicable to a virtual machine. The schedules may have been defined on a VM or on lab level.
 * API Version: 2018-09-15.
 * 
     *
     * Schedules applicable to a virtual machine. The schedules may have been defined on a VM or on lab level.
 * 
     */
    public static CompletableFuture<ListVirtualMachineApplicableSchedulesResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Schedules applicable to a virtual machine. The schedules may have been defined on a VM or on lab level.
     * API Version: 2018-09-15.
     * 
     *
         * Schedules applicable to a virtual machine. The schedules may have been defined on a VM or on lab level.
     * 
     */
    public static CompletableFuture<ListVirtualMachineApplicableSchedulesResult> invokeAsync(ListVirtualMachineApplicableSchedulesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:listVirtualMachineApplicableSchedules", TypeShape.of(ListVirtualMachineApplicableSchedulesResult.class), args == null ? ListVirtualMachineApplicableSchedulesArgs.Empty : args, Utilities.withVersion(options));
    }
}