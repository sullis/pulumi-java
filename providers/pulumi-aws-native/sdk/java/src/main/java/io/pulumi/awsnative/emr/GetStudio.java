// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.emr;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.emr.inputs.GetStudioArgs;
import io.pulumi.awsnative.emr.outputs.GetStudioResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetStudio {
/**
 * Resource schema for AWS::EMR::Studio
 * 
 */
    public static CompletableFuture<GetStudioResult> invokeAsync(GetStudioArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:emr:getStudio", TypeShape.of(GetStudioResult.class), args == null ? GetStudioArgs.Empty : args, Utilities.withVersion(options));
    }
}
