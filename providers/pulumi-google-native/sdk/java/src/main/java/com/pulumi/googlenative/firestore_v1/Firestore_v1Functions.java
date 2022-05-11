// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firestore_v1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.firestore_v1.inputs.GetIndexArgs;
import com.pulumi.googlenative.firestore_v1.outputs.GetIndexResult;
import java.util.concurrent.CompletableFuture;

public final class Firestore_v1Functions {
    /**
     * Gets a composite index.
     * 
     */
    public static CompletableFuture<GetIndexResult> getIndex(GetIndexArgs args) {
        return getIndex(args, InvokeOptions.Empty);
    }
    /**
     * Gets a composite index.
     * 
     */
    public static CompletableFuture<GetIndexResult> getIndex(GetIndexArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:firestore/v1:getIndex", TypeShape.of(GetIndexResult.class), args, Utilities.withVersion(options));
    }
}
