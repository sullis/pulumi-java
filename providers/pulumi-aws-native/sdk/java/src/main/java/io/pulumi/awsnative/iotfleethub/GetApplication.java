// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotfleethub;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotfleethub.inputs.GetApplicationArgs;
import io.pulumi.awsnative.iotfleethub.outputs.GetApplicationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetApplication {
/**
 * Resource schema for AWS::IoTFleetHub::Application
 * 
 */
    public static CompletableFuture<GetApplicationResult> invokeAsync(GetApplicationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotfleethub:getApplication", TypeShape.of(GetApplicationResult.class), args == null ? GetApplicationArgs.Empty : args, Utilities.withVersion(options));
    }
}
