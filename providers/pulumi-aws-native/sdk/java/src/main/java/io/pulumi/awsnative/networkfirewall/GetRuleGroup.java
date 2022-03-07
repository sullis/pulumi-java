// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.networkfirewall.inputs.GetRuleGroupArgs;
import io.pulumi.awsnative.networkfirewall.outputs.GetRuleGroupResult;
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
     * Resource type definition for AWS::NetworkFirewall::RuleGroup
 * 
     */
    public static CompletableFuture<GetRuleGroupResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource type definition for AWS::NetworkFirewall::RuleGroup
     * 
     */
    public static CompletableFuture<GetRuleGroupResult> invokeAsync(GetRuleGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:networkfirewall:getRuleGroup", TypeShape.of(GetRuleGroupResult.class), args == null ? GetRuleGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}