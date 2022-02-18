// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.signer;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.signer.inputs.GetProfilePermissionArgs;
import io.pulumi.awsnative.signer.outputs.GetProfilePermissionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProfilePermission {
/**
 * An example resource schema demonstrating some basic constructs and validation rules.
 * 
 */
    public static CompletableFuture<GetProfilePermissionResult> invokeAsync(GetProfilePermissionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:signer:getProfilePermission", TypeShape.of(GetProfilePermissionResult.class), args == null ? GetProfilePermissionArgs.Empty : args, Utilities.withVersion(options));
    }
}
