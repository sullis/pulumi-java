// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.inputs.GetAzsArgs;
import io.pulumi.awsnative.outputs.GetAzsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAzs {
    public static CompletableFuture<GetAzsResult> invokeAsync(@Nullable GetAzsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:index:getAzs", TypeShape.of(GetAzsResult.class), args == null ? GetAzsArgs.Empty : args, Utilities.withVersion(options));
    }
}
