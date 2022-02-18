// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lightsail.inputs.GetStaticIpArgs;
import io.pulumi.awsnative.lightsail.outputs.GetStaticIpResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetStaticIp {
/**
 * Resource Type definition for AWS::Lightsail::StaticIp
 * 
 */
    public static CompletableFuture<GetStaticIpResult> invokeAsync(GetStaticIpArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:lightsail:getStaticIp", TypeShape.of(GetStaticIpResult.class), args == null ? GetStaticIpArgs.Empty : args, Utilities.withVersion(options));
    }
}
