// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ssmincidents.inputs.GetReplicationSetArgs;
import io.pulumi.awsnative.ssmincidents.outputs.GetReplicationSetResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetReplicationSet {
    public static CompletableFuture<GetReplicationSetResult> invokeAsync(GetReplicationSetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ssmincidents:getReplicationSet", TypeShape.of(GetReplicationSetResult.class), args == null ? GetReplicationSetArgs.Empty : args, Utilities.withVersion(options));
    }
}
