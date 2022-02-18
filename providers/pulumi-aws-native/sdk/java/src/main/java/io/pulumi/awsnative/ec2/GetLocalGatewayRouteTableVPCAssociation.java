// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.inputs.GetLocalGatewayRouteTableVPCAssociationArgs;
import io.pulumi.awsnative.ec2.outputs.GetLocalGatewayRouteTableVPCAssociationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLocalGatewayRouteTableVPCAssociation {
/**
 * Describes an association between a local gateway route table and a VPC.
 * 
 */
    public static CompletableFuture<GetLocalGatewayRouteTableVPCAssociationResult> invokeAsync(GetLocalGatewayRouteTableVPCAssociationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getLocalGatewayRouteTableVPCAssociation", TypeShape.of(GetLocalGatewayRouteTableVPCAssociationResult.class), args == null ? GetLocalGatewayRouteTableVPCAssociationArgs.Empty : args, Utilities.withVersion(options));
    }
}
