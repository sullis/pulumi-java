// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmcontacts;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ssmcontacts.inputs.GetContactChannelArgs;
import io.pulumi.awsnative.ssmcontacts.outputs.GetContactChannelResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetContactChannel {
    public static CompletableFuture<GetContactChannelResult> invokeAsync(GetContactChannelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ssmcontacts:getContactChannel", TypeShape.of(GetContactChannelResult.class), args == null ? GetContactChannelArgs.Empty : args, Utilities.withVersion(options));
    }
}
