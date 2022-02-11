// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codeguruprofiler;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.codeguruprofiler.inputs.GetProfilingGroupArgs;
import io.pulumi.awsnative.codeguruprofiler.outputs.GetProfilingGroupResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProfilingGroup {
    public static CompletableFuture<GetProfilingGroupResult> invokeAsync(GetProfilingGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:codeguruprofiler:getProfilingGroup", TypeShape.of(GetProfilingGroupResult.class), args == null ? GetProfilingGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
