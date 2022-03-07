// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventhub.inputs.GetEventHubArgs;
import io.pulumi.azurenative.eventhub.outputs.GetEventHubResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEventHub {
    private GetEventHub() {}
    public interface BuilderApplicator {
        public void apply(GetEventHubArgs.Builder a);
    }
    private static GetEventHubArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetEventHubArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Single item in List or Get Event Hub operation
 * API Version: 2017-04-01.
 * 
     *
     * Single item in List or Get Event Hub operation
 * 
     */
    public static CompletableFuture<GetEventHubResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Single item in List or Get Event Hub operation
     * API Version: 2017-04-01.
     * 
     *
         * Single item in List or Get Event Hub operation
     * 
     */
    public static CompletableFuture<GetEventHubResult> invokeAsync(GetEventHubArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:getEventHub", TypeShape.of(GetEventHubResult.class), args == null ? GetEventHubArgs.Empty : args, Utilities.withVersion(options));
    }
}