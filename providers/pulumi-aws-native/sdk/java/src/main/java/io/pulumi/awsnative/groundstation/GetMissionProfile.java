// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.groundstation.inputs.GetMissionProfileArgs;
import io.pulumi.awsnative.groundstation.outputs.GetMissionProfileResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMissionProfile {
    public static CompletableFuture<GetMissionProfileResult> invokeAsync(GetMissionProfileArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:groundstation:getMissionProfile", TypeShape.of(GetMissionProfileResult.class), args == null ? GetMissionProfileArgs.Empty : args, Utilities.withVersion(options));
    }
}
