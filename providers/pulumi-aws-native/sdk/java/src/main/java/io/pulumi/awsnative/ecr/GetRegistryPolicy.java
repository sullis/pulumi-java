// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ecr.inputs.GetRegistryPolicyArgs;
import io.pulumi.awsnative.ecr.outputs.GetRegistryPolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegistryPolicy {
/**
 * The AWS::ECR::RegistryPolicy is used to specify permissions for another AWS account and is used when configuring cross-account replication. For more information, see Registry permissions in the Amazon Elastic Container Registry User Guide: https://docs.aws.amazon.com/AmazonECR/latest/userguide/registry-permissions.html
 * 
 */
    public static CompletableFuture<GetRegistryPolicyResult> invokeAsync(GetRegistryPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ecr:getRegistryPolicy", TypeShape.of(GetRegistryPolicyResult.class), args == null ? GetRegistryPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
