// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.attestation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.attestation.inputs.GetAttestationProviderArgs;
import io.pulumi.azurenative.attestation.outputs.GetAttestationProviderResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAttestationProvider {
    private GetAttestationProvider() {}
    public interface BuilderApplicator {
        public void apply(GetAttestationProviderArgs.Builder a);
    }
    private static GetAttestationProviderArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAttestationProviderArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Attestation service response message.
 * API Version: 2020-10-01.
 * 
     *
     * Attestation service response message.
 * 
     */
    public static CompletableFuture<GetAttestationProviderResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Attestation service response message.
     * API Version: 2020-10-01.
     * 
     *
         * Attestation service response message.
     * 
     */
    public static CompletableFuture<GetAttestationProviderResult> invokeAsync(GetAttestationProviderArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:attestation:getAttestationProvider", TypeShape.of(GetAttestationProviderResult.class), args == null ? GetAttestationProviderArgs.Empty : args, Utilities.withVersion(options));
    }
}