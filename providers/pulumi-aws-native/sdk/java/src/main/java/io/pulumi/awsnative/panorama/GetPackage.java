// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.panorama.inputs.GetPackageArgs;
import io.pulumi.awsnative.panorama.outputs.GetPackageResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPackage {
/**
 * Schema for Package CloudFormation Resource
 * 
 */
    public static CompletableFuture<GetPackageResult> invokeAsync(GetPackageArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:panorama:getPackage", TypeShape.of(GetPackageResult.class), args == null ? GetPackageArgs.Empty : args, Utilities.withVersion(options));
    }
}
