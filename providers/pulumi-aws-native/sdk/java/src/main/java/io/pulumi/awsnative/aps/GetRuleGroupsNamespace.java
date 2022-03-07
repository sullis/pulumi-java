// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.aps;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.aps.inputs.GetRuleGroupsNamespaceArgs;
import io.pulumi.awsnative.aps.outputs.GetRuleGroupsNamespaceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRuleGroupsNamespace {
    private GetRuleGroupsNamespace() {}
    public interface BuilderApplicator {
        public void apply(GetRuleGroupsNamespaceArgs.Builder a);
    }
    private static GetRuleGroupsNamespaceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRuleGroupsNamespaceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * RuleGroupsNamespace schema for cloudformation.
 * 
     */
    public static CompletableFuture<GetRuleGroupsNamespaceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * RuleGroupsNamespace schema for cloudformation.
     * 
     */
    public static CompletableFuture<GetRuleGroupsNamespaceResult> invokeAsync(GetRuleGroupsNamespaceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:aps:getRuleGroupsNamespace", TypeShape.of(GetRuleGroupsNamespaceResult.class), args == null ? GetRuleGroupsNamespaceArgs.Empty : args, Utilities.withVersion(options));
    }
}