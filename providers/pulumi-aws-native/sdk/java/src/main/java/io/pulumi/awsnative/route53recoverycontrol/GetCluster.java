// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53recoverycontrol.inputs.GetClusterArgs;
import io.pulumi.awsnative.route53recoverycontrol.outputs.GetClusterResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCluster {
    public static CompletableFuture<GetClusterResult> invokeAsync(GetClusterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:route53recoverycontrol:getCluster", TypeShape.of(GetClusterResult.class), args == null ? GetClusterArgs.Empty : args, Utilities.withVersion(options));
    }
}
