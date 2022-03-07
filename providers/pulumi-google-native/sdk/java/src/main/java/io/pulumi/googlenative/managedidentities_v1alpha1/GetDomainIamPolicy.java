// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1alpha1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.managedidentities_v1alpha1.inputs.GetDomainIamPolicyArgs;
import io.pulumi.googlenative.managedidentities_v1alpha1.outputs.GetDomainIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDomainIamPolicy {
    private GetDomainIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetDomainIamPolicyArgs.Builder a);
    }
    private static GetDomainIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDomainIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
     */
    public static CompletableFuture<GetDomainIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetDomainIamPolicyResult> invokeAsync(GetDomainIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1alpha1:getDomainIamPolicy", TypeShape.of(GetDomainIamPolicyResult.class), args == null ? GetDomainIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}