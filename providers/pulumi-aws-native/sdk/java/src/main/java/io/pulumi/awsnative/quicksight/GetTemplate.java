// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.quicksight.inputs.GetTemplateArgs;
import io.pulumi.awsnative.quicksight.outputs.GetTemplateResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTemplate {
/**
 * Definition of the AWS::QuickSight::Template Resource Type.
 * 
 */
    public static CompletableFuture<GetTemplateResult> invokeAsync(GetTemplateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:quicksight:getTemplate", TypeShape.of(GetTemplateResult.class), args == null ? GetTemplateArgs.Empty : args, Utilities.withVersion(options));
    }
}
