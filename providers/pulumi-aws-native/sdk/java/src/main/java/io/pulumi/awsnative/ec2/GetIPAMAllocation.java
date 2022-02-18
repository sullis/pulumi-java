// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.inputs.GetIPAMAllocationArgs;
import io.pulumi.awsnative.ec2.outputs.GetIPAMAllocationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIPAMAllocation {
/**
 * Resource Schema of AWS::EC2::IPAMAllocation Type
 * 
 */
    public static CompletableFuture<GetIPAMAllocationResult> invokeAsync(GetIPAMAllocationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getIPAMAllocation", TypeShape.of(GetIPAMAllocationResult.class), args == null ? GetIPAMAllocationArgs.Empty : args, Utilities.withVersion(options));
    }
}
