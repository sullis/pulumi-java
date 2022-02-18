// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.inputs.GetBlobContainerDataSetArgs;
import io.pulumi.azurenative.datashare.outputs.GetBlobContainerDataSetResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBlobContainerDataSet {
/**
 * An Azure storage blob container data set.
 * API Version: 2020-09-01.
 * 
 *
 * An Azure storage blob container data set.
 * 
 */
    public static CompletableFuture<GetBlobContainerDataSetResult> invokeAsync(GetBlobContainerDataSetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datashare:getBlobContainerDataSet", TypeShape.of(GetBlobContainerDataSetResult.class), args == null ? GetBlobContainerDataSetArgs.Empty : args, Utilities.withVersion(options));
    }
}
