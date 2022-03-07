// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.notificationhubs.inputs.GetNamespaceAuthorizationRuleArgs;
import io.pulumi.azurenative.notificationhubs.outputs.GetNamespaceAuthorizationRuleResult;
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
     * Description of a Namespace AuthorizationRules.
 * API Version: 2017-04-01.
 * 
     *
     * Description of a Namespace AuthorizationRules.
 * 
     */
    public static CompletableFuture<GetNamespaceAuthorizationRuleResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Description of a Namespace AuthorizationRules.
     * API Version: 2017-04-01.
     * 
     *
         * Description of a Namespace AuthorizationRules.
     * 
     */
    public static CompletableFuture<GetNamespaceAuthorizationRuleResult> invokeAsync(GetNamespaceAuthorizationRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:notificationhubs:getNamespaceAuthorizationRule", TypeShape.of(GetNamespaceAuthorizationRuleResult.class), args == null ? GetNamespaceAuthorizationRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}