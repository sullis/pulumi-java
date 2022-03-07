// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appstream;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.appstream.inputs.GetAppBlockArgs;
import io.pulumi.awsnative.appstream.outputs.GetAppBlockResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAppBlock {
    private GetAppBlock() {}
    public interface BuilderApplicator {
        public void apply(GetAppBlockArgs.Builder a);
    }
    private static GetAppBlockArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAppBlockArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type definition for AWS::AppStream::AppBlock
 * 
     */
    public static CompletableFuture<GetAppBlockResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type definition for AWS::AppStream::AppBlock
     * 
     */
    public static CompletableFuture<GetAppBlockResult> invokeAsync(GetAppBlockArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:appstream:getAppBlock", TypeShape.of(GetAppBlockResult.class), args == null ? GetAppBlockArgs.Empty : args, Utilities.withVersion(options));
    }
}