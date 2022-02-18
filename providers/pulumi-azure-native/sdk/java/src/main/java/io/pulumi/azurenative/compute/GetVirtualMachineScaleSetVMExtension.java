// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.inputs.GetVirtualMachineScaleSetVMExtensionArgs;
import io.pulumi.azurenative.compute.outputs.GetVirtualMachineScaleSetVMExtensionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVirtualMachineScaleSetVMExtension {
/**
 * Describes a VMSS VM Extension.
 * API Version: 2021-03-01.
 * 
 *
 * Describes a VMSS VM Extension.
 * 
 */
    public static CompletableFuture<GetVirtualMachineScaleSetVMExtensionResult> invokeAsync(GetVirtualMachineScaleSetVMExtensionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getVirtualMachineScaleSetVMExtension", TypeShape.of(GetVirtualMachineScaleSetVMExtensionResult.class), args == null ? GetVirtualMachineScaleSetVMExtensionArgs.Empty : args, Utilities.withVersion(options));
    }
}
