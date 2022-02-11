// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.mediaconnect.inputs.GetFlowEntitlementArgs;
import io.pulumi.awsnative.mediaconnect.outputs.GetFlowEntitlementResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFlowEntitlement {
    public static CompletableFuture<GetFlowEntitlementResult> invokeAsync(GetFlowEntitlementArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:mediaconnect:getFlowEntitlement", TypeShape.of(GetFlowEntitlementResult.class), args == null ? GetFlowEntitlementArgs.Empty : args, Utilities.withVersion(options));
    }
}
