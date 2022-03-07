// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.metastore_v1alpha.inputs.GetServiceIamPolicyArgs;
import io.pulumi.googlenative.metastore_v1alpha.outputs.GetServiceIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServiceIamPolicy {
    private GetServiceIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetServiceIamPolicyArgs.Builder a);
    }
    private static GetServiceIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetServiceIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
     */
    public static CompletableFuture<GetServiceIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceIamPolicyResult> invokeAsync(GetServiceIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:metastore/v1alpha:getServiceIamPolicy", TypeShape.of(GetServiceIamPolicyResult.class), args == null ? GetServiceIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}