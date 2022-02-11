// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.timestream.inputs.GetTableArgs;
import io.pulumi.awsnative.timestream.outputs.GetTableResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTable {
    public static CompletableFuture<GetTableResult> invokeAsync(GetTableArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:timestream:getTable", TypeShape.of(GetTableResult.class), args == null ? GetTableArgs.Empty : args, Utilities.withVersion(options));
    }
}
