// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.organizations.inputs.GetDelegatedAdministratorsArgs;
import io.pulumi.aws.organizations.outputs.GetDelegatedAdministratorsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDelegatedAdministrators {
    private GetDelegatedAdministrators() {}
    public interface BuilderApplicator {
        public void apply(GetDelegatedAdministratorsArgs.Builder a);
    }
    private static GetDelegatedAdministratorsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDelegatedAdministratorsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Get a list the AWS accounts that are designated as delegated administrators in this organization
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getDelegatedAdministrators.
 * 
     *
     * A collection of values returned by getDelegatedAdministrators.
 * 
     */
    public static CompletableFuture<GetDelegatedAdministratorsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Get a list the AWS accounts that are designated as delegated administrators in this organization
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getDelegatedAdministrators.
     * 
     *
         * A collection of values returned by getDelegatedAdministrators.
     * 
     */
    public static CompletableFuture<GetDelegatedAdministratorsResult> invokeAsync(@Nullable GetDelegatedAdministratorsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:organizations/getDelegatedAdministrators:getDelegatedAdministrators", TypeShape.of(GetDelegatedAdministratorsResult.class), args == null ? GetDelegatedAdministratorsArgs.Empty : args, Utilities.withVersion(options));
    }
}