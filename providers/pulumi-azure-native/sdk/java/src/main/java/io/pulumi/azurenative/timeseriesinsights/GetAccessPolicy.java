// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.timeseriesinsights.inputs.GetAccessPolicyArgs;
import io.pulumi.azurenative.timeseriesinsights.outputs.GetAccessPolicyResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAccessPolicy {
/**
 * An access policy is used to grant users and applications access to the environment. Roles are assigned to service principals in Azure Active Directory. These roles define the actions the principal can perform through the Time Series Insights data plane APIs.
 * API Version: 2020-05-15.
 * 
 *
 * An access policy is used to grant users and applications access to the environment. Roles are assigned to service principals in Azure Active Directory. These roles define the actions the principal can perform through the Time Series Insights data plane APIs.
 * 
 */
    public static CompletableFuture<GetAccessPolicyResult> invokeAsync(GetAccessPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:timeseriesinsights:getAccessPolicy", TypeShape.of(GetAccessPolicyResult.class), args == null ? GetAccessPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
