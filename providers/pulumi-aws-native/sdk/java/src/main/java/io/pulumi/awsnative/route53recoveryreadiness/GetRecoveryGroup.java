// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53recoveryreadiness.inputs.GetRecoveryGroupArgs;
import io.pulumi.awsnative.route53recoveryreadiness.outputs.GetRecoveryGroupResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRecoveryGroup {
    public static CompletableFuture<GetRecoveryGroupResult> invokeAsync(GetRecoveryGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:route53recoveryreadiness:getRecoveryGroup", TypeShape.of(GetRecoveryGroupResult.class), args == null ? GetRecoveryGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
