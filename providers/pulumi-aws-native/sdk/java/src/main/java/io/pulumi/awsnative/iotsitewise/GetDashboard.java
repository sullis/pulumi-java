// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotsitewise.inputs.GetDashboardArgs;
import io.pulumi.awsnative.iotsitewise.outputs.GetDashboardResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDashboard {
    public static CompletableFuture<GetDashboardResult> invokeAsync(GetDashboardArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotsitewise:getDashboard", TypeShape.of(GetDashboardResult.class), args == null ? GetDashboardArgs.Empty : args, Utilities.withVersion(options));
    }
}
