// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.appengine.inputs.GetDefaultServiceAccountArgs;
import io.pulumi.gcp.appengine.outputs.GetDefaultServiceAccountResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDefaultServiceAccount {
/**
 * Use this data source to retrieve the default App Engine service account for the specified project.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getDefaultServiceAccount.
 * 
 *
 * A collection of values returned by getDefaultServiceAccount.
 * 
 */
    public static CompletableFuture<GetDefaultServiceAccountResult> invokeAsync(@Nullable GetDefaultServiceAccountArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:appengine/getDefaultServiceAccount:getDefaultServiceAccount", TypeShape.of(GetDefaultServiceAccountResult.class), args == null ? GetDefaultServiceAccountArgs.Empty : args, Utilities.withVersion(options));
    }
}
