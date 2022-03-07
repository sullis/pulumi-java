// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datacatalog_v1beta1.inputs.GetTaxonomyIamPolicyArgs;
import io.pulumi.googlenative.datacatalog_v1beta1.outputs.GetTaxonomyIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTaxonomyIamPolicy {
    private GetTaxonomyIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetTaxonomyIamPolicyArgs.Builder a);
    }
    private static GetTaxonomyIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTaxonomyIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the IAM policy for a taxonomy or a policy tag.
 * 
     */
    public static CompletableFuture<GetTaxonomyIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the IAM policy for a taxonomy or a policy tag.
     * 
     */
    public static CompletableFuture<GetTaxonomyIamPolicyResult> invokeAsync(GetTaxonomyIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datacatalog/v1beta1:getTaxonomyIamPolicy", TypeShape.of(GetTaxonomyIamPolicyResult.class), args == null ? GetTaxonomyIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}