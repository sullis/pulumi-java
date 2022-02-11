// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inspectorv2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.inspectorv2.inputs.GetFilterArgs;
import io.pulumi.awsnative.inspectorv2.outputs.GetFilterResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFilter {
    public static CompletableFuture<GetFilterResult> invokeAsync(GetFilterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:inspectorv2:getFilter", TypeShape.of(GetFilterResult.class), args == null ? GetFilterArgs.Empty : args, Utilities.withVersion(options));
    }
}
