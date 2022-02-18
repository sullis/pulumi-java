// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.inputs.GetSubnetArgs;
import io.pulumi.awsnative.ec2.outputs.GetSubnetResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSubnet {
/**
 * Resource Type definition for AWS::EC2::Subnet
 * 
 */
    public static CompletableFuture<GetSubnetResult> invokeAsync(GetSubnetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getSubnet", TypeShape.of(GetSubnetResult.class), args == null ? GetSubnetArgs.Empty : args, Utilities.withVersion(options));
    }
}
