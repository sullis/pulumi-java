// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.streamanalytics.inputs.GetInputArgs;
import io.pulumi.azurenative.streamanalytics.outputs.GetInputResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInput {
/**
 * An input object, containing all information associated with the named input. All inputs are contained under a streaming job.
 * API Version: 2016-03-01.
 * 
 *
 * An input object, containing all information associated with the named input. All inputs are contained under a streaming job.
 * 
 */
    public static CompletableFuture<GetInputResult> invokeAsync(GetInputArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:streamanalytics:getInput", TypeShape.of(GetInputResult.class), args == null ? GetInputArgs.Empty : args, Utilities.withVersion(options));
    }
}
