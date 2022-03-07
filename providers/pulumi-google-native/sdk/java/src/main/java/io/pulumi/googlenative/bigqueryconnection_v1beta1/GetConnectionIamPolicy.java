// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigqueryconnection_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigqueryconnection_v1beta1.inputs.GetConnectionIamPolicyArgs;
import io.pulumi.googlenative.bigqueryconnection_v1beta1.outputs.GetConnectionIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConnectionIamPolicy {
    private GetConnectionIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetConnectionIamPolicyArgs.Builder a);
    }
    private static GetConnectionIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetConnectionIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
     */
    public static CompletableFuture<GetConnectionIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetConnectionIamPolicyResult> invokeAsync(GetConnectionIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigqueryconnection/v1beta1:getConnectionIamPolicy", TypeShape.of(GetConnectionIamPolicyResult.class), args == null ? GetConnectionIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}