// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.kendra.inputs.GetFaqArgs;
import io.pulumi.awsnative.kendra.outputs.GetFaqResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFaq {
/**
 * A Kendra FAQ resource
 * 
 */
    public static CompletableFuture<GetFaqResult> invokeAsync(GetFaqArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:kendra:getFaq", TypeShape.of(GetFaqResult.class), args == null ? GetFaqArgs.Empty : args, Utilities.withVersion(options));
    }
}
