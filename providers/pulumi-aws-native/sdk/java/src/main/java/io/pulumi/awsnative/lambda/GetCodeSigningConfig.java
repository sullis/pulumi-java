// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lambda.inputs.GetCodeSigningConfigArgs;
import io.pulumi.awsnative.lambda.outputs.GetCodeSigningConfigResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCodeSigningConfig {
    public static CompletableFuture<GetCodeSigningConfigResult> invokeAsync(GetCodeSigningConfigArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:lambda:getCodeSigningConfig", TypeShape.of(GetCodeSigningConfigResult.class), args == null ? GetCodeSigningConfigArgs.Empty : args, Utilities.withVersion(options));
    }
}
