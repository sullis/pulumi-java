// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.inputs.GetTransitGatewayConnectArgs;
import io.pulumi.awsnative.ec2.outputs.GetTransitGatewayConnectResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTransitGatewayConnect {
/**
 * The AWS::EC2::TransitGatewayConnect type
 * 
 */
    public static CompletableFuture<GetTransitGatewayConnectResult> invokeAsync(GetTransitGatewayConnectArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getTransitGatewayConnect", TypeShape.of(GetTransitGatewayConnectResult.class), args == null ? GetTransitGatewayConnectArgs.Empty : args, Utilities.withVersion(options));
    }
}
