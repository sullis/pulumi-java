// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicedirectory_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.servicedirectory_v1.inputs.GetNamespaceArgs;
import io.pulumi.googlenative.servicedirectory_v1.outputs.GetNamespaceResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNamespace {
    private GetNamespace() {}
    public interface BuilderApplicator {
        public void apply(GetNamespaceArgs.Builder a);
    }
    private static GetNamespaceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetNamespaceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets a namespace.
 * 
     */
    public static CompletableFuture<GetNamespaceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets a namespace.
     * 
     */
    public static CompletableFuture<GetNamespaceResult> invokeAsync(GetNamespaceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:servicedirectory/v1:getNamespace", TypeShape.of(GetNamespaceResult.class), args == null ? GetNamespaceArgs.Empty : args, Utilities.withVersion(options));
    }
}