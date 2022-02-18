// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storsimple.inputs.GetManagerArgs;
import io.pulumi.azurenative.storsimple.outputs.GetManagerResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetManager {
/**
 * The StorSimple Manager.
 * API Version: 2017-06-01.
 * 
 *
 * The StorSimple Manager.
 * 
 */
    public static CompletableFuture<GetManagerResult> invokeAsync(GetManagerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:storsimple:getManager", TypeShape.of(GetManagerResult.class), args == null ? GetManagerArgs.Empty : args, Utilities.withVersion(options));
    }
}
