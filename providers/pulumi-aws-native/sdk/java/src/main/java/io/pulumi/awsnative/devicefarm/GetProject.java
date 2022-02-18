// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devicefarm;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.devicefarm.inputs.GetProjectArgs;
import io.pulumi.awsnative.devicefarm.outputs.GetProjectResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProject {
/**
 * AWS::DeviceFarm::Project creates a new Device Farm Project
 * 
 */
    public static CompletableFuture<GetProjectResult> invokeAsync(GetProjectArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:devicefarm:getProject", TypeShape.of(GetProjectResult.class), args == null ? GetProjectArgs.Empty : args, Utilities.withVersion(options));
    }
}
