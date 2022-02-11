// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.datasync.inputs.GetLocationEFSArgs;
import io.pulumi.awsnative.datasync.outputs.GetLocationEFSResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLocationEFS {
    public static CompletableFuture<GetLocationEFSResult> invokeAsync(GetLocationEFSArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:datasync:getLocationEFS", TypeShape.of(GetLocationEFSResult.class), args == null ? GetLocationEFSArgs.Empty : args, Utilities.withVersion(options));
    }
}
