// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.acmpca.inputs.GetCertificateAuthorityArgs;
import io.pulumi.awsnative.acmpca.outputs.GetCertificateAuthorityResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCertificateAuthority {
/**
 * Private certificate authority.
 * 
 */
    public static CompletableFuture<GetCertificateAuthorityResult> invokeAsync(GetCertificateAuthorityArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:acmpca:getCertificateAuthority", TypeShape.of(GetCertificateAuthorityResult.class), args == null ? GetCertificateAuthorityArgs.Empty : args, Utilities.withVersion(options));
    }
}
