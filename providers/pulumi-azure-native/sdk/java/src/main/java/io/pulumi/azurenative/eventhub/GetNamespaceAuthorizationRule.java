// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventhub.inputs.GetNamespaceAuthorizationRuleArgs;
import io.pulumi.azurenative.eventhub.outputs.GetNamespaceAuthorizationRuleResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNamespaceAuthorizationRule {
    private GetNamespaceAuthorizationRule() {}
    public interface BuilderApplicator {
        public void apply(GetNamespaceAuthorizationRuleArgs.Builder a);
    }
    private static GetNamespaceAuthorizationRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetNamespaceAuthorizationRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Single item in a List or Get AuthorizationRule operation
 * API Version: 2017-04-01.
 * 
     *
     * Single item in a List or Get AuthorizationRule operation
 * 
     */
    public static CompletableFuture<GetNamespaceAuthorizationRuleResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Single item in a List or Get AuthorizationRule operation
     * API Version: 2017-04-01.
     * 
     *
         * Single item in a List or Get AuthorizationRule operation
     * 
     */
    public static CompletableFuture<GetNamespaceAuthorizationRuleResult> invokeAsync(GetNamespaceAuthorizationRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:getNamespaceAuthorizationRule", TypeShape.of(GetNamespaceAuthorizationRuleResult.class), args == null ? GetNamespaceAuthorizationRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}