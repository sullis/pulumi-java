// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.nimblestudio.inputs.GetStudioComponentArgs;
import io.pulumi.awsnative.nimblestudio.outputs.GetStudioComponentResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetStudioComponent {
    public static CompletableFuture<GetStudioComponentResult> invokeAsync(GetStudioComponentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:nimblestudio:getStudioComponent", TypeShape.of(GetStudioComponentResult.class), args == null ? GetStudioComponentArgs.Empty : args, Utilities.withVersion(options));
    }
}
