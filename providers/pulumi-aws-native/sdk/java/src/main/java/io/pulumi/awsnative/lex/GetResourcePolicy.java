// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lex.inputs.GetResourcePolicyArgs;
import io.pulumi.awsnative.lex.outputs.GetResourcePolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResourcePolicy {
/**
 * A resource policy with specified policy statements that attaches to a Lex bot or bot alias.
 * 
 */
    public static CompletableFuture<GetResourcePolicyResult> invokeAsync(GetResourcePolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:lex:getResourcePolicy", TypeShape.of(GetResourcePolicyResult.class), args == null ? GetResourcePolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
