// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.efs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.efs.inputs.GetAccessPointArgs;
import io.pulumi.awsnative.efs.outputs.GetAccessPointResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAccessPoint {
    public static CompletableFuture<GetAccessPointResult> invokeAsync(GetAccessPointArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:efs:getAccessPoint", TypeShape.of(GetAccessPointResult.class), args == null ? GetAccessPointArgs.Empty : args, Utilities.withVersion(options));
    }
}
