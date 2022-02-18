// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.batch.inputs.GetCertificateArgs;
import io.pulumi.azurenative.batch.outputs.GetCertificateResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCertificate {
/**
 * Contains information about a certificate.
 * API Version: 2021-01-01.
 * 
 *
 * Contains information about a certificate.
 * 
 */
    public static CompletableFuture<GetCertificateResult> invokeAsync(GetCertificateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:batch:getCertificate", TypeShape.of(GetCertificateResult.class), args == null ? GetCertificateArgs.Empty : args, Utilities.withVersion(options));
    }
}
