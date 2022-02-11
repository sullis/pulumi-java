// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iot.inputs.GetFleetMetricArgs;
import io.pulumi.awsnative.iot.outputs.GetFleetMetricResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFleetMetric {
    public static CompletableFuture<GetFleetMetricResult> invokeAsync(GetFleetMetricArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iot:getFleetMetric", TypeShape.of(GetFleetMetricResult.class), args == null ? GetFleetMetricArgs.Empty : args, Utilities.withVersion(options));
    }
}
