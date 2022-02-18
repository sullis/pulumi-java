// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.policyinsights.inputs.GetRemediationAtResourceGroupArgs;
import io.pulumi.azurenative.policyinsights.outputs.GetRemediationAtResourceGroupResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRemediationAtResourceGroup {
/**
 * The remediation definition.
 * API Version: 2019-07-01.
 * 
 *
 * The remediation definition.
 * 
 */
    public static CompletableFuture<GetRemediationAtResourceGroupResult> invokeAsync(GetRemediationAtResourceGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:policyinsights:getRemediationAtResourceGroup", TypeShape.of(GetRemediationAtResourceGroupResult.class), args == null ? GetRemediationAtResourceGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
