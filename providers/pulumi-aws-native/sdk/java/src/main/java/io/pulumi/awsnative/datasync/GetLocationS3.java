// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.datasync.inputs.GetLocationS3Args;
import io.pulumi.awsnative.datasync.outputs.GetLocationS3Result;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLocationS3 {
    private GetLocationS3() {}
    public interface BuilderApplicator {
        public void apply(GetLocationS3Args.Builder a);
    }
    private static GetLocationS3Args buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetLocationS3Args.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource schema for AWS::DataSync::LocationS3
 * 
     */
    public static CompletableFuture<GetLocationS3Result> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource schema for AWS::DataSync::LocationS3
     * 
     */
    public static CompletableFuture<GetLocationS3Result> invokeAsync(GetLocationS3Args args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:datasync:getLocationS3", TypeShape.of(GetLocationS3Result.class), args == null ? GetLocationS3Args.Empty : args, Utilities.withVersion(options));
    }
}