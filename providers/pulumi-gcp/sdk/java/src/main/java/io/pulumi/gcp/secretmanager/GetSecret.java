// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.secretmanager.inputs.GetSecretArgs;
import io.pulumi.gcp.secretmanager.outputs.GetSecretResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSecret {
/**
 * Use this data source to get information about a Secret Manager Secret
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getSecret.
 * 
 *
 * A collection of values returned by getSecret.
 * 
 */
    public static CompletableFuture<GetSecretResult> invokeAsync(GetSecretArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:secretmanager/getSecret:getSecret", TypeShape.of(GetSecretResult.class), args == null ? GetSecretArgs.Empty : args, Utilities.withVersion(options));
    }
}
