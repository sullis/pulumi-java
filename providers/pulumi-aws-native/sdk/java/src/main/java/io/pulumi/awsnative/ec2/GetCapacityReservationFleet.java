// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.inputs.GetCapacityReservationFleetArgs;
import io.pulumi.awsnative.ec2.outputs.GetCapacityReservationFleetResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCapacityReservationFleet {
/**
 * Resource Type definition for AWS::EC2::CapacityReservationFleet
 * 
 */
    public static CompletableFuture<GetCapacityReservationFleetResult> invokeAsync(GetCapacityReservationFleetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getCapacityReservationFleet", TypeShape.of(GetCapacityReservationFleetResult.class), args == null ? GetCapacityReservationFleetArgs.Empty : args, Utilities.withVersion(options));
    }
}
