// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.privateca_v1.inputs.GetCertificateTemplateIamPolicyArgs;
import io.pulumi.googlenative.privateca_v1.outputs.GetCertificateTemplateIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCertificateTemplateIamPolicy {
    private GetCertificateTemplateIamPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetCertificateTemplateIamPolicyArgs.Builder a);
    }
    private static GetCertificateTemplateIamPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetCertificateTemplateIamPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
 * 
     */
    public static CompletableFuture<GetCertificateTemplateIamPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetCertificateTemplateIamPolicyResult> invokeAsync(GetCertificateTemplateIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:privateca/v1:getCertificateTemplateIamPolicy", TypeShape.of(GetCertificateTemplateIamPolicyResult.class), args == null ? GetCertificateTemplateIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}