// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.security.inputs.GetAdaptiveApplicationControlArgs;
import io.pulumi.azurenative.security.outputs.GetAdaptiveApplicationControlResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAdaptiveApplicationControl {
    private GetAdaptiveApplicationControl() {}
    public interface BuilderApplicator {
        public void apply(GetAdaptiveApplicationControlArgs.Builder a);
    }
    private static GetAdaptiveApplicationControlArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAdaptiveApplicationControlArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * API Version: 2020-01-01.
 * 
     */
    public static CompletableFuture<GetAdaptiveApplicationControlResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * API Version: 2020-01-01.
     * 
     */
    public static CompletableFuture<GetAdaptiveApplicationControlResult> invokeAsync(GetAdaptiveApplicationControlArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:security:getAdaptiveApplicationControl", TypeShape.of(GetAdaptiveApplicationControlResult.class), args == null ? GetAdaptiveApplicationControlArgs.Empty : args, Utilities.withVersion(options));
    }
}