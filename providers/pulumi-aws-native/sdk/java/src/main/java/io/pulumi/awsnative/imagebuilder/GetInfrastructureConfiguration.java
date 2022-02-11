// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.imagebuilder.inputs.GetInfrastructureConfigurationArgs;
import io.pulumi.awsnative.imagebuilder.outputs.GetInfrastructureConfigurationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInfrastructureConfiguration {
    public static CompletableFuture<GetInfrastructureConfigurationResult> invokeAsync(GetInfrastructureConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:imagebuilder:getInfrastructureConfiguration", TypeShape.of(GetInfrastructureConfigurationResult.class), args == null ? GetInfrastructureConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}
