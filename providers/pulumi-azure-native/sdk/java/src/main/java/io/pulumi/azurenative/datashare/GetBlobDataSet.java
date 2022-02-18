// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.inputs.GetBlobDataSetArgs;
import io.pulumi.azurenative.datashare.outputs.GetBlobDataSetResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBlobDataSet {
/**
 * An Azure storage blob data set.
 * API Version: 2020-09-01.
 * 
 *
 * An Azure storage blob data set.
 * 
 */
    public static CompletableFuture<GetBlobDataSetResult> invokeAsync(GetBlobDataSetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datashare:getBlobDataSet", TypeShape.of(GetBlobDataSetResult.class), args == null ? GetBlobDataSetArgs.Empty : args, Utilities.withVersion(options));
    }
}
