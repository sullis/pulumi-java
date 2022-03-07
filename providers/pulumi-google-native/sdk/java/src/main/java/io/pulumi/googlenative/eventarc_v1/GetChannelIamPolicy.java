// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.eventarc_v1.inputs.GetChannelIamPolicyArgs;
import io.pulumi.googlenative.eventarc_v1.outputs.GetChannelIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetChannelIamPolicy {
    private GetChannelIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetChannelIamPolicyArgs.Builder a);
    }
    private static GetChannelIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetChannelIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
     */
    public static CompletableFuture<GetChannelIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetChannelIamPolicyResult> invokeAsync(GetChannelIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:eventarc/v1:getChannelIamPolicy", TypeShape.of(GetChannelIamPolicyResult.class), args == null ? GetChannelIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}