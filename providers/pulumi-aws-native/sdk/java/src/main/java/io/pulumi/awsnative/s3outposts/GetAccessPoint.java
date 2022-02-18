// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3outposts;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.s3outposts.inputs.GetAccessPointArgs;
import io.pulumi.awsnative.s3outposts.outputs.GetAccessPointResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAccessPoint {
/**
 * Resource Type Definition for AWS::S3Outposts::AccessPoint
 * 
 */
    public static CompletableFuture<GetAccessPointResult> invokeAsync(GetAccessPointArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:s3outposts:getAccessPoint", TypeShape.of(GetAccessPointResult.class), args == null ? GetAccessPointArgs.Empty : args, Utilities.withVersion(options));
    }
}
