// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.containerinstance.inputs.GetContainerGroupArgs;
import com.pulumi.azurenative.containerinstance.inputs.GetContainerGroupPlainArgs;
import com.pulumi.azurenative.containerinstance.outputs.GetContainerGroupResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ContainerinstanceFunctions {
    /**
     * A container group.
     * API Version: 2021-03-01.
     * 
     */
    public static Output<GetContainerGroupResult> getContainerGroup(GetContainerGroupArgs args) {
        return getContainerGroup(args, InvokeOptions.Empty);
    }
    /**
     * A container group.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetContainerGroupResult> getContainerGroupPlain(GetContainerGroupPlainArgs args) {
        return getContainerGroupPlain(args, InvokeOptions.Empty);
    }
    /**
     * A container group.
     * API Version: 2021-03-01.
     * 
     */
    public static Output<GetContainerGroupResult> getContainerGroup(GetContainerGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:containerinstance:getContainerGroup", TypeShape.of(GetContainerGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A container group.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetContainerGroupResult> getContainerGroupPlain(GetContainerGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerinstance:getContainerGroup", TypeShape.of(GetContainerGroupResult.class), args, Utilities.withVersion(options));
    }
}
