// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.configuration.inputs.GetOrganizationConformancePackArgs;
import io.pulumi.awsnative.configuration.outputs.GetOrganizationConformancePackResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOrganizationConformancePack {
    private GetOrganizationConformancePack() {}
    public interface BuilderApplicator {
        public void apply(GetOrganizationConformancePackArgs.Builder a);
    }
    private static GetOrganizationConformancePackArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetOrganizationConformancePackArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource schema for AWS::Config::OrganizationConformancePack.
 * 
     */
    public static CompletableFuture<GetOrganizationConformancePackResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource schema for AWS::Config::OrganizationConformancePack.
     * 
     */
    public static CompletableFuture<GetOrganizationConformancePackResult> invokeAsync(GetOrganizationConformancePackArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:configuration:getOrganizationConformancePack", TypeShape.of(GetOrganizationConformancePackResult.class), args == null ? GetOrganizationConformancePackArgs.Empty : args, Utilities.withVersion(options));
    }
}