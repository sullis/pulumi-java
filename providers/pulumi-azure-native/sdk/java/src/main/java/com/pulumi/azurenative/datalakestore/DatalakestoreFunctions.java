// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakestore;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datalakestore.inputs.GetAccountArgs;
import com.pulumi.azurenative.datalakestore.inputs.GetFirewallRuleArgs;
import com.pulumi.azurenative.datalakestore.inputs.GetTrustedIdProviderArgs;
import com.pulumi.azurenative.datalakestore.inputs.GetVirtualNetworkRuleArgs;
import com.pulumi.azurenative.datalakestore.outputs.GetAccountResult;
import com.pulumi.azurenative.datalakestore.outputs.GetFirewallRuleResult;
import com.pulumi.azurenative.datalakestore.outputs.GetTrustedIdProviderResult;
import com.pulumi.azurenative.datalakestore.outputs.GetVirtualNetworkRuleResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DatalakestoreFunctions {
    /**
     * Data Lake Store account information.
     * API Version: 2016-11-01.
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    /**
     * Data Lake Store account information.
     * API Version: 2016-11-01.
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datalakestore:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data Lake Store firewall rule information.
     * API Version: 2016-11-01.
     * 
     */
    public static CompletableFuture<GetFirewallRuleResult> getFirewallRule(GetFirewallRuleArgs args) {
        return getFirewallRule(args, InvokeOptions.Empty);
    }
    /**
     * Data Lake Store firewall rule information.
     * API Version: 2016-11-01.
     * 
     */
    public static CompletableFuture<GetFirewallRuleResult> getFirewallRule(GetFirewallRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datalakestore:getFirewallRule", TypeShape.of(GetFirewallRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data Lake Store trusted identity provider information.
     * API Version: 2016-11-01.
     * 
     */
    public static CompletableFuture<GetTrustedIdProviderResult> getTrustedIdProvider(GetTrustedIdProviderArgs args) {
        return getTrustedIdProvider(args, InvokeOptions.Empty);
    }
    /**
     * Data Lake Store trusted identity provider information.
     * API Version: 2016-11-01.
     * 
     */
    public static CompletableFuture<GetTrustedIdProviderResult> getTrustedIdProvider(GetTrustedIdProviderArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datalakestore:getTrustedIdProvider", TypeShape.of(GetTrustedIdProviderResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data Lake Store virtual network rule information.
     * API Version: 2016-11-01.
     * 
     */
    public static CompletableFuture<GetVirtualNetworkRuleResult> getVirtualNetworkRule(GetVirtualNetworkRuleArgs args) {
        return getVirtualNetworkRule(args, InvokeOptions.Empty);
    }
    /**
     * Data Lake Store virtual network rule information.
     * API Version: 2016-11-01.
     * 
     */
    public static CompletableFuture<GetVirtualNetworkRuleResult> getVirtualNetworkRule(GetVirtualNetworkRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datalakestore:getVirtualNetworkRule", TypeShape.of(GetVirtualNetworkRuleResult.class), args, Utilities.withVersion(options));
    }
}
