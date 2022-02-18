// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storsimple.inputs.ListDeviceFailoverTarsArgs;
import io.pulumi.azurenative.storsimple.outputs.ListDeviceFailoverTarsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListDeviceFailoverTars {
/**
 * The list of all devices in a resource and their eligibility status as a failover target device.
 * API Version: 2017-06-01.
 * 
 *
 * The list of all devices in a resource and their eligibility status as a failover target device.
 * 
 */
    public static CompletableFuture<ListDeviceFailoverTarsResult> invokeAsync(ListDeviceFailoverTarsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:storsimple:listDeviceFailoverTars", TypeShape.of(ListDeviceFailoverTarsResult.class), args == null ? ListDeviceFailoverTarsArgs.Empty : args, Utilities.withVersion(options));
    }
}
