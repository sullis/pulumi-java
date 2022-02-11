// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.inputs.GetSubnetRouteTableAssociationArgs;
import io.pulumi.awsnative.ec2.outputs.GetSubnetRouteTableAssociationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSubnetRouteTableAssociation {
    public static CompletableFuture<GetSubnetRouteTableAssociationResult> invokeAsync(GetSubnetRouteTableAssociationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getSubnetRouteTableAssociation", TypeShape.of(GetSubnetRouteTableAssociationResult.class), args == null ? GetSubnetRouteTableAssociationArgs.Empty : args, Utilities.withVersion(options));
    }
}
