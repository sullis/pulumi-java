// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.eks.inputs.GetAddonArgs;
import io.pulumi.awsnative.eks.outputs.GetAddonResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAddon {
    public static CompletableFuture<GetAddonResult> invokeAsync(GetAddonArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:eks:getAddon", TypeShape.of(GetAddonResult.class), args == null ? GetAddonArgs.Empty : args, Utilities.withVersion(options));
    }
}
