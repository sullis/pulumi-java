// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.outputs.GetAccountIdResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAccountId {
    public static CompletableFuture<GetAccountIdResult> invokeAsync(@Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:index:getAccountId", TypeShape.of(GetAccountIdResult.class), io.pulumi.resources.InvokeArgs.Empty, Utilities.withVersion(options));
    }
}
