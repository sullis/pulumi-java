// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybriddata;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybriddata.inputs.GetJobDefinitionArgs;
import io.pulumi.azurenative.hybriddata.outputs.GetJobDefinitionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetJobDefinition {
/**
 * Job Definition.
 * API Version: 2019-06-01.
 * 
 *
 * Job Definition.
 * 
 */
    public static CompletableFuture<GetJobDefinitionResult> invokeAsync(GetJobDefinitionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hybriddata:getJobDefinition", TypeShape.of(GetJobDefinitionResult.class), args == null ? GetJobDefinitionArgs.Empty : args, Utilities.withVersion(options));
    }
}
