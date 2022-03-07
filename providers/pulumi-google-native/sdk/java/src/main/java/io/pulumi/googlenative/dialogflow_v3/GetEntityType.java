// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v3.inputs.GetEntityTypeArgs;
import io.pulumi.googlenative.dialogflow_v3.outputs.GetEntityTypeResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEntityType {
    private GetEntityType() {}
    public interface BuilderApplicator {
        public void apply(GetEntityTypeArgs.Builder a);
    }
    private static GetEntityTypeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetEntityTypeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Retrieves the specified entity type.
 * 
     */
    public static CompletableFuture<GetEntityTypeResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Retrieves the specified entity type.
     * 
     */
    public static CompletableFuture<GetEntityTypeResult> invokeAsync(GetEntityTypeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3:getEntityType", TypeShape.of(GetEntityTypeResult.class), args == null ? GetEntityTypeArgs.Empty : args, Utilities.withVersion(options));
    }
}