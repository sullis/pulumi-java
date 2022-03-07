// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.connectedvmwarevsphere.inputs.GetGuestAgentArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.GetGuestAgentResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGuestAgent {
    private GetGuestAgent() {}
    public interface BuilderApplicator {
        public void apply(GetGuestAgentArgs.Builder a);
    }
    private static GetGuestAgentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetGuestAgentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Defines the GuestAgent.
 * API Version: 2020-10-01-preview.
 * 
     *
     * Defines the GuestAgent.
 * 
     */
    public static CompletableFuture<GetGuestAgentResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Defines the GuestAgent.
     * API Version: 2020-10-01-preview.
     * 
     *
         * Defines the GuestAgent.
     * 
     */
    public static CompletableFuture<GetGuestAgentResult> invokeAsync(GetGuestAgentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:connectedvmwarevsphere:getGuestAgent", TypeShape.of(GetGuestAgentResult.class), args == null ? GetGuestAgentArgs.Empty : args, Utilities.withVersion(options));
    }
}