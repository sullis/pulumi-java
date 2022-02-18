// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iot.inputs.GetTopicRuleDestinationArgs;
import io.pulumi.awsnative.iot.outputs.GetTopicRuleDestinationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTopicRuleDestination {
/**
 * Resource Type definition for AWS::IoT::TopicRuleDestination
 * 
 */
    public static CompletableFuture<GetTopicRuleDestinationResult> invokeAsync(GetTopicRuleDestinationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iot:getTopicRuleDestination", TypeShape.of(GetTopicRuleDestinationResult.class), args == null ? GetTopicRuleDestinationArgs.Empty : args, Utilities.withVersion(options));
    }
}
