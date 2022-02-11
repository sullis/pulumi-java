// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.synthetics;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.synthetics.inputs.GetCanaryArgs;
import io.pulumi.awsnative.synthetics.outputs.GetCanaryResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCanary {
    public static CompletableFuture<GetCanaryResult> invokeAsync(GetCanaryArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:synthetics:getCanary", TypeShape.of(GetCanaryResult.class), args == null ? GetCanaryArgs.Empty : args, Utilities.withVersion(options));
    }
}
