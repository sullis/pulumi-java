// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudidentity;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.cloudidentity.inputs.GetGroupsArgs;
import io.pulumi.gcp.cloudidentity.outputs.GetGroupsResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGroups {
    private GetGroups() {}
    public interface BuilderApplicator {
        public void apply(GetGroupsArgs.Builder a);
    }
    private static GetGroupsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetGroupsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Use this data source to get list of the Cloud Identity Groups under a customer or namespace.
 * 
 * https://cloud.google.com/identity/docs/concepts/overview#groups
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getGroups.
 * 
     *
     * A collection of values returned by getGroups.
 * 
     */
    public static CompletableFuture<GetGroupsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Use this data source to get list of the Cloud Identity Groups under a customer or namespace.
     * 
     * https://cloud.google.com/identity/docs/concepts/overview#groups
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getGroups.
     * 
     *
         * A collection of values returned by getGroups.
     * 
     */
    public static CompletableFuture<GetGroupsResult> invokeAsync(GetGroupsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:cloudidentity/getGroups:getGroups", TypeShape.of(GetGroupsResult.class), args == null ? GetGroupsArgs.Empty : args, Utilities.withVersion(options));
    }
}