// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networkconnectivity_v1.inputs.GetHubIamPolicyArgs;
import io.pulumi.googlenative.networkconnectivity_v1.outputs.GetHubIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHubIamPolicy {
    private GetHubIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetHubIamPolicyArgs.Builder a);
    }
    private static GetHubIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetHubIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
     */
    public static CompletableFuture<GetHubIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetHubIamPolicyResult> invokeAsync(GetHubIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkconnectivity/v1:getHubIamPolicy", TypeShape.of(GetHubIamPolicyResult.class), args == null ? GetHubIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}