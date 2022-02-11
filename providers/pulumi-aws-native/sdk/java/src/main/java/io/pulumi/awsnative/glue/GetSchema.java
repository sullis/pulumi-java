// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.glue.inputs.GetSchemaArgs;
import io.pulumi.awsnative.glue.outputs.GetSchemaResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSchema {
    public static CompletableFuture<GetSchemaResult> invokeAsync(GetSchemaArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:glue:getSchema", TypeShape.of(GetSchemaResult.class), args == null ? GetSchemaArgs.Empty : args, Utilities.withVersion(options));
    }
}
