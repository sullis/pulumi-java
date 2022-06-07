// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.avs;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.avs.inputs.GetPrivateCloudArgs;
import com.pulumi.azure.avs.inputs.GetPrivateCloudPlainArgs;
import com.pulumi.azure.avs.outputs.GetPrivateCloudResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AvsFunctions {
    public static Output<GetPrivateCloudResult> getPrivateCloud(GetPrivateCloudArgs args) {
        return getPrivateCloud(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPrivateCloudResult> getPrivateCloudPlain(GetPrivateCloudPlainArgs args) {
        return getPrivateCloudPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetPrivateCloudResult> getPrivateCloud(GetPrivateCloudArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:avs/getPrivateCloud:getPrivateCloud", TypeShape.of(GetPrivateCloudResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetPrivateCloudResult> getPrivateCloudPlain(GetPrivateCloudPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:avs/getPrivateCloud:getPrivateCloud", TypeShape.of(GetPrivateCloudResult.class), args, Utilities.withVersion(options));
    }
}
