// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.security.inputs.GetIotSecuritySolutionArgs;
import io.pulumi.azurenative.security.outputs.GetIotSecuritySolutionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIotSecuritySolution {
    private GetIotSecuritySolution() {}
    public interface BuilderApplicator {
        public void apply(GetIotSecuritySolutionArgs.Builder a);
    }
    private static GetIotSecuritySolutionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetIotSecuritySolutionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * IoT Security solution configuration and resource information.
 * API Version: 2019-08-01.
 * 
     *
     * IoT Security solution configuration and resource information.
 * 
     */
    public static CompletableFuture<GetIotSecuritySolutionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * IoT Security solution configuration and resource information.
     * API Version: 2019-08-01.
     * 
     *
         * IoT Security solution configuration and resource information.
     * 
     */
    public static CompletableFuture<GetIotSecuritySolutionResult> invokeAsync(GetIotSecuritySolutionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:security:getIotSecuritySolution", TypeShape.of(GetIotSecuritySolutionResult.class), args == null ? GetIotSecuritySolutionArgs.Empty : args, Utilities.withVersion(options));
    }
}