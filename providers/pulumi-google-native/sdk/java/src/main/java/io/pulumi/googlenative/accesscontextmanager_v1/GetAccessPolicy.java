// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.GetAccessPolicyArgs;
import io.pulumi.googlenative.accesscontextmanager_v1.outputs.GetAccessPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAccessPolicy {
    private GetAccessPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetAccessPolicyArgs.Builder a);
    }
    private static GetAccessPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAccessPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns an access policy based on the name.
 * 
     */
    public static CompletableFuture<GetAccessPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns an access policy based on the name.
     * 
     */
    public static CompletableFuture<GetAccessPolicyResult> invokeAsync(GetAccessPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:accesscontextmanager/v1:getAccessPolicy", TypeShape.of(GetAccessPolicyResult.class), args == null ? GetAccessPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}