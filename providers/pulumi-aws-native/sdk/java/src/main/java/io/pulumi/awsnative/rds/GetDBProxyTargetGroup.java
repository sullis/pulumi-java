// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.rds.inputs.GetDBProxyTargetGroupArgs;
import io.pulumi.awsnative.rds.outputs.GetDBProxyTargetGroupResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDBProxyTargetGroup {
    public static CompletableFuture<GetDBProxyTargetGroupResult> invokeAsync(GetDBProxyTargetGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:rds:getDBProxyTargetGroup", TypeShape.of(GetDBProxyTargetGroupResult.class), args == null ? GetDBProxyTargetGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
