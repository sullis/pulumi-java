// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.authorization.inputs.GetPolicyExemptionArgs;
import io.pulumi.azurenative.authorization.outputs.GetPolicyExemptionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPolicyExemption {
/**
 * The policy exemption.
 * API Version: 2020-07-01-preview.
 * 
 *
 * The policy exemption.
 * 
 */
    public static CompletableFuture<GetPolicyExemptionResult> invokeAsync(GetPolicyExemptionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getPolicyExemption", TypeShape.of(GetPolicyExemptionResult.class), args == null ? GetPolicyExemptionArgs.Empty : args, Utilities.withVersion(options));
    }
}
