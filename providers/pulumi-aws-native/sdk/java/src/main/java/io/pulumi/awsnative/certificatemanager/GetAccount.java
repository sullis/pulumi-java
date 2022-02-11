// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.certificatemanager;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.certificatemanager.inputs.GetAccountArgs;
import io.pulumi.awsnative.certificatemanager.outputs.GetAccountResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAccount {
    public static CompletableFuture<GetAccountResult> invokeAsync(GetAccountArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:certificatemanager:getAccount", TypeShape.of(GetAccountResult.class), args == null ? GetAccountArgs.Empty : args, Utilities.withVersion(options));
    }
}
