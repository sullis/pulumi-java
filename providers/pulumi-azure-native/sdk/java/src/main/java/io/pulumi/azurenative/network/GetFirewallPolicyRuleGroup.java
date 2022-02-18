// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetFirewallPolicyRuleGroupArgs;
import io.pulumi.azurenative.network.outputs.GetFirewallPolicyRuleGroupResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFirewallPolicyRuleGroup {
/**
 * Rule Group resource.
 * API Version: 2020-04-01.
 * 
 *
 * Rule Group resource.
 * 
 */
    public static CompletableFuture<GetFirewallPolicyRuleGroupResult> invokeAsync(GetFirewallPolicyRuleGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getFirewallPolicyRuleGroup", TypeShape.of(GetFirewallPolicyRuleGroupResult.class), args == null ? GetFirewallPolicyRuleGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
