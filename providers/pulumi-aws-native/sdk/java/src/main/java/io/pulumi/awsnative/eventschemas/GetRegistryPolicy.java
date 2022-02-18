// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eventschemas;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.eventschemas.inputs.GetRegistryPolicyArgs;
import io.pulumi.awsnative.eventschemas.outputs.GetRegistryPolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegistryPolicy {
/**
 * Resource Type definition for AWS::EventSchemas::RegistryPolicy
 * 
 */
    public static CompletableFuture<GetRegistryPolicyResult> invokeAsync(GetRegistryPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:eventschemas:getRegistryPolicy", TypeShape.of(GetRegistryPolicyResult.class), args == null ? GetRegistryPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
