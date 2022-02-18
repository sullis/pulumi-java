// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.inputs.GetCapacityReservationArgs;
import io.pulumi.azurenative.compute.outputs.GetCapacityReservationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCapacityReservation {
/**
 * Specifies information about the capacity reservation.
 * API Version: 2021-04-01.
 * 
 *
 * Specifies information about the capacity reservation.
 * 
 */
    public static CompletableFuture<GetCapacityReservationResult> invokeAsync(GetCapacityReservationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getCapacityReservation", TypeShape.of(GetCapacityReservationResult.class), args == null ? GetCapacityReservationArgs.Empty : args, Utilities.withVersion(options));
    }
}
