// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.rds.inputs.GetGlobalClusterArgs;
import io.pulumi.awsnative.rds.outputs.GetGlobalClusterResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGlobalCluster {
/**
 * Resource Type definition for AWS::RDS::GlobalCluster
 * 
 */
    public static CompletableFuture<GetGlobalClusterResult> invokeAsync(GetGlobalClusterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:rds:getGlobalCluster", TypeShape.of(GetGlobalClusterResult.class), args == null ? GetGlobalClusterArgs.Empty : args, Utilities.withVersion(options));
    }
}
