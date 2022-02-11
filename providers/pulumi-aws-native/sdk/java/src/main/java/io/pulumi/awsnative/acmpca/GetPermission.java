// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.acmpca.inputs.GetPermissionArgs;
import io.pulumi.awsnative.acmpca.outputs.GetPermissionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPermission {
    public static CompletableFuture<GetPermissionResult> invokeAsync(GetPermissionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:acmpca:getPermission", TypeShape.of(GetPermissionResult.class), args == null ? GetPermissionArgs.Empty : args, Utilities.withVersion(options));
    }
}
