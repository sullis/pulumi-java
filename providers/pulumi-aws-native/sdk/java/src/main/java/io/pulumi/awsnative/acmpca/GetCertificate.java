// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.acmpca.inputs.GetCertificateArgs;
import io.pulumi.awsnative.acmpca.outputs.GetCertificateResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCertificate {
    public static CompletableFuture<GetCertificateResult> invokeAsync(GetCertificateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:acmpca:getCertificate", TypeShape.of(GetCertificateResult.class), args == null ? GetCertificateArgs.Empty : args, Utilities.withVersion(options));
    }
}
