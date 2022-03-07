// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.datasync.inputs.GetLocationFSxWindowsArgs;
import io.pulumi.awsnative.datasync.outputs.GetLocationFSxWindowsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLocationFSxWindows {
    private GetLocationFSxWindows() {}
    public interface BuilderApplicator {
        public void apply(GetLocationFSxWindowsArgs.Builder a);
    }
    private static GetLocationFSxWindowsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetLocationFSxWindowsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource schema for AWS::DataSync::LocationFSxWindows.
 * 
     */
    public static CompletableFuture<GetLocationFSxWindowsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource schema for AWS::DataSync::LocationFSxWindows.
     * 
     */
    public static CompletableFuture<GetLocationFSxWindowsResult> invokeAsync(GetLocationFSxWindowsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:datasync:getLocationFSxWindows", TypeShape.of(GetLocationFSxWindowsResult.class), args == null ? GetLocationFSxWindowsArgs.Empty : args, Utilities.withVersion(options));
    }
}