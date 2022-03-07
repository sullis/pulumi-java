// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.privateca_v1.inputs.GetCertificateTemplateArgs;
import io.pulumi.googlenative.privateca_v1.outputs.GetCertificateTemplateResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCertificateTemplate {
    private GetCertificateTemplate() {}
    public interface BuilderApplicator {
        public void apply(GetCertificateTemplateArgs.Builder a);
    }
    private static GetCertificateTemplateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetCertificateTemplateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns a CertificateTemplate.
 * 
     */
    public static CompletableFuture<GetCertificateTemplateResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns a CertificateTemplate.
     * 
     */
    public static CompletableFuture<GetCertificateTemplateResult> invokeAsync(GetCertificateTemplateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:privateca/v1:getCertificateTemplate", TypeShape.of(GetCertificateTemplateResult.class), args == null ? GetCertificateTemplateArgs.Empty : args, Utilities.withVersion(options));
    }
}