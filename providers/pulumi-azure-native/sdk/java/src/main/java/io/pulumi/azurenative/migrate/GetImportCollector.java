// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.migrate.inputs.GetImportCollectorArgs;
import io.pulumi.azurenative.migrate.outputs.GetImportCollectorResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetImportCollector {
/**
 * API Version: 2019-10-01.
 * 
 */
    public static CompletableFuture<GetImportCollectorResult> invokeAsync(GetImportCollectorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getImportCollector", TypeShape.of(GetImportCollectorResult.class), args == null ? GetImportCollectorArgs.Empty : args, Utilities.withVersion(options));
    }
}
