// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.acmpca.inputs.GetPermissionArgs;
import io.pulumi.awsnative.acmpca.outputs.GetPermissionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPermission {
    private GetPermission() {}
    public interface BuilderApplicator {
        public void apply(GetPermissionArgs.Builder a);
    }
    private static GetPermissionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPermissionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Permission set on private certificate authority
 * 
     */
    public static CompletableFuture<GetPermissionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Permission set on private certificate authority
     * 
     */
    public static CompletableFuture<GetPermissionResult> invokeAsync(GetPermissionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:acmpca:getPermission", TypeShape.of(GetPermissionResult.class), args == null ? GetPermissionArgs.Empty : args, Utilities.withVersion(options));
    }
}