// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebaseappcheck_v1beta;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.firebaseappcheck_v1beta.inputs.GetDebugTokenArgs;
import com.pulumi.googlenative.firebaseappcheck_v1beta.outputs.GetDebugTokenResult;
import java.util.concurrent.CompletableFuture;

public final class Firebaseappcheck_v1betaFunctions {
    /**
     * Gets the specified DebugToken. For security reasons, the `token` field is never populated in the response.
     * 
     */
    public static CompletableFuture<GetDebugTokenResult> getDebugToken(GetDebugTokenArgs args) {
        return getDebugToken(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified DebugToken. For security reasons, the `token` field is never populated in the response.
     * 
     */
    public static CompletableFuture<GetDebugTokenResult> getDebugToken(GetDebugTokenArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:firebaseappcheck/v1beta:getDebugToken", TypeShape.of(GetDebugTokenResult.class), args, Utilities.withVersion(options));
    }
}
