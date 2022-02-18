// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotwireless.inputs.GetServiceProfileArgs;
import io.pulumi.awsnative.iotwireless.outputs.GetServiceProfileResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServiceProfile {
/**
 * An example resource schema demonstrating some basic constructs and validation rules.
 * 
 */
    public static CompletableFuture<GetServiceProfileResult> invokeAsync(GetServiceProfileArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotwireless:getServiceProfile", TypeShape.of(GetServiceProfileResult.class), args == null ? GetServiceProfileArgs.Empty : args, Utilities.withVersion(options));
    }
}
