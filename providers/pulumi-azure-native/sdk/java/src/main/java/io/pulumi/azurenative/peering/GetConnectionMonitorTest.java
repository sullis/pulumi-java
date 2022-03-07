// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.peering.inputs.GetConnectionMonitorTestArgs;
import io.pulumi.azurenative.peering.outputs.GetConnectionMonitorTestResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConnectionMonitorTest {
    private GetConnectionMonitorTest() {}
    public interface BuilderApplicator {
        public void apply(GetConnectionMonitorTestArgs.Builder a);
    }
    private static GetConnectionMonitorTestArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetConnectionMonitorTestArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The Connection Monitor Test class.
 * API Version: 2021-06-01.
 * 
     *
     * The Connection Monitor Test class.
 * 
     */
    public static CompletableFuture<GetConnectionMonitorTestResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The Connection Monitor Test class.
     * API Version: 2021-06-01.
     * 
     *
         * The Connection Monitor Test class.
     * 
     */
    public static CompletableFuture<GetConnectionMonitorTestResult> invokeAsync(GetConnectionMonitorTestArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:peering:getConnectionMonitorTest", TypeShape.of(GetConnectionMonitorTestResult.class), args == null ? GetConnectionMonitorTestArgs.Empty : args, Utilities.withVersion(options));
    }
}