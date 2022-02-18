// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetInboundNatRuleArgs;
import io.pulumi.azurenative.network.outputs.GetInboundNatRuleResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInboundNatRule {
/**
 * Inbound NAT rule of the load balancer.
 * API Version: 2020-11-01.
 * 
 *
 * Inbound NAT rule of the load balancer.
 * 
 */
    public static CompletableFuture<GetInboundNatRuleResult> invokeAsync(GetInboundNatRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getInboundNatRule", TypeShape.of(GetInboundNatRuleResult.class), args == null ? GetInboundNatRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
