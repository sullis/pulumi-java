// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.batch;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.batch.inputs.GetSchedulingPolicyArgs;
import io.pulumi.awsnative.batch.outputs.GetSchedulingPolicyResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSchedulingPolicy {
    public static CompletableFuture<GetSchedulingPolicyResult> invokeAsync(GetSchedulingPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:batch:getSchedulingPolicy", TypeShape.of(GetSchedulingPolicyResult.class), args == null ? GetSchedulingPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
