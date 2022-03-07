// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rum;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.rum.inputs.GetAppMonitorArgs;
import io.pulumi.awsnative.rum.outputs.GetAppMonitorResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAppMonitor {
    private GetAppMonitor() {}
    public interface BuilderApplicator {
        public void apply(GetAppMonitorArgs.Builder a);
    }
    private static GetAppMonitorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAppMonitorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type definition for AWS::RUM::AppMonitor
 * 
     */
    public static CompletableFuture<GetAppMonitorResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type definition for AWS::RUM::AppMonitor
     * 
     */
    public static CompletableFuture<GetAppMonitorResult> invokeAsync(GetAppMonitorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:rum:getAppMonitor", TypeShape.of(GetAppMonitorResult.class), args == null ? GetAppMonitorArgs.Empty : args, Utilities.withVersion(options));
    }
}