// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.ListActiveSecurityAdminRuleArgs;
import io.pulumi.azurenative.network.outputs.ListActiveSecurityAdminRuleResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListActiveSecurityAdminRule {
/**
 * Result of the request to list active security admin rules. It contains a list of active security admin rules and a skiptoken to get the next set of results.
 * API Version: 2021-02-01-preview.
 * 
 *
 * Result of the request to list active security admin rules. It contains a list of active security admin rules and a skiptoken to get the next set of results.
 * 
 */
    public static CompletableFuture<ListActiveSecurityAdminRuleResult> invokeAsync(ListActiveSecurityAdminRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:listActiveSecurityAdminRule", TypeShape.of(ListActiveSecurityAdminRuleResult.class), args == null ? ListActiveSecurityAdminRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
