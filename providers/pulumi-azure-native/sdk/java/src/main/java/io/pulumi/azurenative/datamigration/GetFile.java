// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datamigration.inputs.GetFileArgs;
import io.pulumi.azurenative.datamigration.outputs.GetFileResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFile {
/**
 * A file resource
 * API Version: 2018-07-15-preview.
 * 
 *
 * A file resource
 * 
 */
    public static CompletableFuture<GetFileResult> invokeAsync(GetFileArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datamigration:getFile", TypeShape.of(GetFileResult.class), args == null ? GetFileArgs.Empty : args, Utilities.withVersion(options));
    }
}
