// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.binaryauthorization_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.binaryauthorization_v1.inputs.GetPolicyIamPolicyArgs;
import io.pulumi.googlenative.binaryauthorization_v1.outputs.GetPolicyIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPolicyIamPolicy {
    private GetPolicyIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetPolicyIamPolicyArgs.Builder a);
    }
    private static GetPolicyIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPolicyIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
     */
    public static CompletableFuture<GetPolicyIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetPolicyIamPolicyResult> invokeAsync(@Nullable GetPolicyIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:binaryauthorization/v1:getPolicyIamPolicy", TypeShape.of(GetPolicyIamPolicyResult.class), args == null ? GetPolicyIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}