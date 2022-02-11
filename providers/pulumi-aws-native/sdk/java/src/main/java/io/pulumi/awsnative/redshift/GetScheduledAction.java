// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.redshift.inputs.GetScheduledActionArgs;
import io.pulumi.awsnative.redshift.outputs.GetScheduledActionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetScheduledAction {
    public static CompletableFuture<GetScheduledActionResult> invokeAsync(GetScheduledActionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:redshift:getScheduledAction", TypeShape.of(GetScheduledActionResult.class), args == null ? GetScheduledActionArgs.Empty : args, Utilities.withVersion(options));
    }
}
