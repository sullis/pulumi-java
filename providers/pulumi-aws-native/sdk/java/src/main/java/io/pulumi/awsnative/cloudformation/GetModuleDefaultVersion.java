// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudformation.inputs.GetModuleDefaultVersionArgs;
import io.pulumi.awsnative.cloudformation.outputs.GetModuleDefaultVersionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetModuleDefaultVersion {
/**
 * A module that has been registered in the CloudFormation registry as the default version
 * 
 */
    public static CompletableFuture<GetModuleDefaultVersionResult> invokeAsync(GetModuleDefaultVersionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudformation:getModuleDefaultVersion", TypeShape.of(GetModuleDefaultVersionResult.class), args == null ? GetModuleDefaultVersionArgs.Empty : args, Utilities.withVersion(options));
    }
}
