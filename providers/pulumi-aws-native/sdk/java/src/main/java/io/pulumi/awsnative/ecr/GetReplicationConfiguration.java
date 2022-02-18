// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ecr.inputs.GetReplicationConfigurationArgs;
import io.pulumi.awsnative.ecr.outputs.GetReplicationConfigurationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetReplicationConfiguration {
/**
 * The AWS::ECR::ReplicationConfiguration resource configures the replication destinations for an Amazon Elastic Container Registry (Amazon Private ECR). For more information, see https://docs.aws.amazon.com/AmazonECR/latest/userguide/replication.html
 * 
 */
    public static CompletableFuture<GetReplicationConfigurationResult> invokeAsync(GetReplicationConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ecr:getReplicationConfiguration", TypeShape.of(GetReplicationConfigurationResult.class), args == null ? GetReplicationConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}
