// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.panorama.inputs.GetPackageVersionArgs;
import io.pulumi.awsnative.panorama.outputs.GetPackageVersionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPackageVersion {
    public static CompletableFuture<GetPackageVersionResult> invokeAsync(GetPackageVersionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:panorama:getPackageVersion", TypeShape.of(GetPackageVersionResult.class), args == null ? GetPackageVersionArgs.Empty : args, Utilities.withVersion(options));
    }
}
