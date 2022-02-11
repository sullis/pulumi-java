// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudfront.inputs.GetResponseHeadersPolicyArgs;
import io.pulumi.awsnative.cloudfront.outputs.GetResponseHeadersPolicyResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResponseHeadersPolicy {
    public static CompletableFuture<GetResponseHeadersPolicyResult> invokeAsync(GetResponseHeadersPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getResponseHeadersPolicy", TypeShape.of(GetResponseHeadersPolicyResult.class), args == null ? GetResponseHeadersPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
