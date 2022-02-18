// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.scheduler.inputs.GetJobCollectionArgs;
import io.pulumi.azurenative.scheduler.outputs.GetJobCollectionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetJobCollection {
/**
 * API Version: 2016-03-01.
 * 
 */
    public static CompletableFuture<GetJobCollectionResult> invokeAsync(GetJobCollectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:scheduler:getJobCollection", TypeShape.of(GetJobCollectionResult.class), args == null ? GetJobCollectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
