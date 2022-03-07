// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigtableadmin_v2.inputs.GetAppProfileArgs;
import io.pulumi.googlenative.bigtableadmin_v2.outputs.GetAppProfileResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAppProfile {
    private GetAppProfile() {}
    public interface BuilderApplicator {
        public void apply(GetAppProfileArgs.Builder a);
    }
    private static GetAppProfileArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAppProfileArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets information about an app profile.
 * 
     */
    public static CompletableFuture<GetAppProfileResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets information about an app profile.
     * 
     */
    public static CompletableFuture<GetAppProfileResult> invokeAsync(GetAppProfileArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigtableadmin/v2:getAppProfile", TypeShape.of(GetAppProfileResult.class), args == null ? GetAppProfileArgs.Empty : args, Utilities.withVersion(options));
    }
}