// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dns_v1.inputs.GetResponsePolicyRuleArgs;
import io.pulumi.googlenative.dns_v1.outputs.GetResponsePolicyRuleResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResponsePolicyRule {
    private GetResponsePolicyRule() {}
    public interface BuilderApplicator {
        public void apply(GetResponsePolicyRuleArgs.Builder a);
    }
    private static GetResponsePolicyRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetResponsePolicyRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Fetches the representation of an existing Response Policy Rule.
 * 
     */
    public static CompletableFuture<GetResponsePolicyRuleResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Fetches the representation of an existing Response Policy Rule.
     * 
     */
    public static CompletableFuture<GetResponsePolicyRuleResult> invokeAsync(GetResponsePolicyRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dns/v1:getResponsePolicyRule", TypeShape.of(GetResponsePolicyRuleResult.class), args == null ? GetResponsePolicyRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}