// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.wafv2.inputs.GetRuleGroupArgs;
import io.pulumi.awsnative.wafv2.outputs.GetRuleGroupResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRuleGroup {
    private GetRuleGroup() {}
    public interface BuilderApplicator {
        public void apply(GetRuleGroupArgs.Builder a);
    }
    private static GetRuleGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRuleGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Contains the Rules that identify the requests that you want to allow, block, or count. In a RuleGroup, you also specify a default action (ALLOW or BLOCK), and the action for each Rule that you add to a RuleGroup, for example, block requests from specified IP addresses or block requests from specified referrers. You also associate the RuleGroup with a CloudFront distribution to identify the requests that you want AWS WAF to filter. If you add more than one Rule to a RuleGroup, a request needs to match only one of the specifications to be allowed, blocked, or counted.
 * 
     */
    public static CompletableFuture<GetRuleGroupResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Contains the Rules that identify the requests that you want to allow, block, or count. In a RuleGroup, you also specify a default action (ALLOW or BLOCK), and the action for each Rule that you add to a RuleGroup, for example, block requests from specified IP addresses or block requests from specified referrers. You also associate the RuleGroup with a CloudFront distribution to identify the requests that you want AWS WAF to filter. If you add more than one Rule to a RuleGroup, a request needs to match only one of the specifications to be allowed, blocked, or counted.
     * 
     */
    public static CompletableFuture<GetRuleGroupResult> invokeAsync(GetRuleGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:wafv2:getRuleGroup", TypeShape.of(GetRuleGroupResult.class), args == null ? GetRuleGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}