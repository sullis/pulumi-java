// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.avs.inputs.GetScriptExecutionLogsArgs;
import io.pulumi.azurenative.avs.outputs.GetScriptExecutionLogsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetScriptExecutionLogs {
    private GetScriptExecutionLogs() {}
    public interface BuilderApplicator {
        public void apply(GetScriptExecutionLogsArgs.Builder a);
    }
    private static GetScriptExecutionLogsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetScriptExecutionLogsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * An instance of a script executed by a user - custom or AVS
 * API Version: 2021-06-01.
 * 
     *
     * An instance of a script executed by a user - custom or AVS
 * 
     */
    public static CompletableFuture<GetScriptExecutionLogsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * An instance of a script executed by a user - custom or AVS
     * API Version: 2021-06-01.
     * 
     *
         * An instance of a script executed by a user - custom or AVS
     * 
     */
    public static CompletableFuture<GetScriptExecutionLogsResult> invokeAsync(GetScriptExecutionLogsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getScriptExecutionLogs", TypeShape.of(GetScriptExecutionLogsResult.class), args == null ? GetScriptExecutionLogsArgs.Empty : args, Utilities.withVersion(options));
    }
}