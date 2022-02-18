// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.rds.inputs.GetDBProxyArgs;
import io.pulumi.awsnative.rds.outputs.GetDBProxyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDBProxy {
/**
 * Resource schema for AWS::RDS::DBProxy
 * 
 */
    public static CompletableFuture<GetDBProxyResult> invokeAsync(GetDBProxyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:rds:getDBProxy", TypeShape.of(GetDBProxyResult.class), args == null ? GetDBProxyArgs.Empty : args, Utilities.withVersion(options));
    }
}
