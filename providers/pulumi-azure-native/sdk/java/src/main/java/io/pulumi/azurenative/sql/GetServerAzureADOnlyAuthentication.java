// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetServerAzureADOnlyAuthenticationArgs;
import io.pulumi.azurenative.sql.outputs.GetServerAzureADOnlyAuthenticationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServerAzureADOnlyAuthentication {
    private GetServerAzureADOnlyAuthentication() {}
    public interface BuilderApplicator {
        public void apply(GetServerAzureADOnlyAuthenticationArgs.Builder a);
    }
    private static GetServerAzureADOnlyAuthenticationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetServerAzureADOnlyAuthenticationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Azure Active Directory only authentication.
 * API Version: 2020-11-01-preview.
 * 
     *
     * Azure Active Directory only authentication.
 * 
     */
    public static CompletableFuture<GetServerAzureADOnlyAuthenticationResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Azure Active Directory only authentication.
     * API Version: 2020-11-01-preview.
     * 
     *
         * Azure Active Directory only authentication.
     * 
     */
    public static CompletableFuture<GetServerAzureADOnlyAuthenticationResult> invokeAsync(GetServerAzureADOnlyAuthenticationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getServerAzureADOnlyAuthentication", TypeShape.of(GetServerAzureADOnlyAuthenticationResult.class), args == null ? GetServerAzureADOnlyAuthenticationArgs.Empty : args, Utilities.withVersion(options));
    }
}