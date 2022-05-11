// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.eventhub.inputs.GetClusterArgs;
import com.pulumi.azurenative.eventhub.inputs.GetConsumerGroupArgs;
import com.pulumi.azurenative.eventhub.inputs.GetDisasterRecoveryConfigArgs;
import com.pulumi.azurenative.eventhub.inputs.GetEventHubArgs;
import com.pulumi.azurenative.eventhub.inputs.GetEventHubAuthorizationRuleArgs;
import com.pulumi.azurenative.eventhub.inputs.GetNamespaceArgs;
import com.pulumi.azurenative.eventhub.inputs.GetNamespaceAuthorizationRuleArgs;
import com.pulumi.azurenative.eventhub.inputs.GetNamespaceIpFilterRuleArgs;
import com.pulumi.azurenative.eventhub.inputs.GetNamespaceNetworkRuleSetArgs;
import com.pulumi.azurenative.eventhub.inputs.GetNamespaceVirtualNetworkRuleArgs;
import com.pulumi.azurenative.eventhub.inputs.GetPrivateEndpointConnectionArgs;
import com.pulumi.azurenative.eventhub.inputs.GetSchemaRegistryArgs;
import com.pulumi.azurenative.eventhub.inputs.ListDisasterRecoveryConfigKeysArgs;
import com.pulumi.azurenative.eventhub.inputs.ListEventHubKeysArgs;
import com.pulumi.azurenative.eventhub.inputs.ListNamespaceKeysArgs;
import com.pulumi.azurenative.eventhub.outputs.GetClusterResult;
import com.pulumi.azurenative.eventhub.outputs.GetConsumerGroupResult;
import com.pulumi.azurenative.eventhub.outputs.GetDisasterRecoveryConfigResult;
import com.pulumi.azurenative.eventhub.outputs.GetEventHubAuthorizationRuleResult;
import com.pulumi.azurenative.eventhub.outputs.GetEventHubResult;
import com.pulumi.azurenative.eventhub.outputs.GetNamespaceAuthorizationRuleResult;
import com.pulumi.azurenative.eventhub.outputs.GetNamespaceIpFilterRuleResult;
import com.pulumi.azurenative.eventhub.outputs.GetNamespaceNetworkRuleSetResult;
import com.pulumi.azurenative.eventhub.outputs.GetNamespaceResult;
import com.pulumi.azurenative.eventhub.outputs.GetNamespaceVirtualNetworkRuleResult;
import com.pulumi.azurenative.eventhub.outputs.GetPrivateEndpointConnectionResult;
import com.pulumi.azurenative.eventhub.outputs.GetSchemaRegistryResult;
import com.pulumi.azurenative.eventhub.outputs.ListDisasterRecoveryConfigKeysResult;
import com.pulumi.azurenative.eventhub.outputs.ListEventHubKeysResult;
import com.pulumi.azurenative.eventhub.outputs.ListNamespaceKeysResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class EventhubFunctions {
    /**
     * Single Event Hubs Cluster resource in List or Get operations.
     * API Version: 2018-01-01-preview.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args) {
        return getCluster(args, InvokeOptions.Empty);
    }
    /**
     * Single Event Hubs Cluster resource in List or Get operations.
     * API Version: 2018-01-01-preview.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Single item in List or Get Consumer group operation
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetConsumerGroupResult> getConsumerGroup(GetConsumerGroupArgs args) {
        return getConsumerGroup(args, InvokeOptions.Empty);
    }
    /**
     * Single item in List or Get Consumer group operation
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetConsumerGroupResult> getConsumerGroup(GetConsumerGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:getConsumerGroup", TypeShape.of(GetConsumerGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Single item in List or Get Alias(Disaster Recovery configuration) operation
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetDisasterRecoveryConfigResult> getDisasterRecoveryConfig(GetDisasterRecoveryConfigArgs args) {
        return getDisasterRecoveryConfig(args, InvokeOptions.Empty);
    }
    /**
     * Single item in List or Get Alias(Disaster Recovery configuration) operation
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetDisasterRecoveryConfigResult> getDisasterRecoveryConfig(GetDisasterRecoveryConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:getDisasterRecoveryConfig", TypeShape.of(GetDisasterRecoveryConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Single item in List or Get Event Hub operation
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetEventHubResult> getEventHub(GetEventHubArgs args) {
        return getEventHub(args, InvokeOptions.Empty);
    }
    /**
     * Single item in List or Get Event Hub operation
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetEventHubResult> getEventHub(GetEventHubArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:getEventHub", TypeShape.of(GetEventHubResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Single item in a List or Get AuthorizationRule operation
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetEventHubAuthorizationRuleResult> getEventHubAuthorizationRule(GetEventHubAuthorizationRuleArgs args) {
        return getEventHubAuthorizationRule(args, InvokeOptions.Empty);
    }
    /**
     * Single item in a List or Get AuthorizationRule operation
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetEventHubAuthorizationRuleResult> getEventHubAuthorizationRule(GetEventHubAuthorizationRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:getEventHubAuthorizationRule", TypeShape.of(GetEventHubAuthorizationRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Single Namespace item in List or Get Operation
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetNamespaceResult> getNamespace(GetNamespaceArgs args) {
        return getNamespace(args, InvokeOptions.Empty);
    }
    /**
     * Single Namespace item in List or Get Operation
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetNamespaceResult> getNamespace(GetNamespaceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:getNamespace", TypeShape.of(GetNamespaceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Single item in a List or Get AuthorizationRule operation
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetNamespaceAuthorizationRuleResult> getNamespaceAuthorizationRule(GetNamespaceAuthorizationRuleArgs args) {
        return getNamespaceAuthorizationRule(args, InvokeOptions.Empty);
    }
    /**
     * Single item in a List or Get AuthorizationRule operation
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetNamespaceAuthorizationRuleResult> getNamespaceAuthorizationRule(GetNamespaceAuthorizationRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:getNamespaceAuthorizationRule", TypeShape.of(GetNamespaceAuthorizationRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Single item in a List or Get IpFilterRules operation
     * API Version: 2018-01-01-preview.
     * 
     */
    public static CompletableFuture<GetNamespaceIpFilterRuleResult> getNamespaceIpFilterRule(GetNamespaceIpFilterRuleArgs args) {
        return getNamespaceIpFilterRule(args, InvokeOptions.Empty);
    }
    /**
     * Single item in a List or Get IpFilterRules operation
     * API Version: 2018-01-01-preview.
     * 
     */
    public static CompletableFuture<GetNamespaceIpFilterRuleResult> getNamespaceIpFilterRule(GetNamespaceIpFilterRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:getNamespaceIpFilterRule", TypeShape.of(GetNamespaceIpFilterRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Description of NetworkRuleSet resource.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetNamespaceNetworkRuleSetResult> getNamespaceNetworkRuleSet(GetNamespaceNetworkRuleSetArgs args) {
        return getNamespaceNetworkRuleSet(args, InvokeOptions.Empty);
    }
    /**
     * Description of NetworkRuleSet resource.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetNamespaceNetworkRuleSetResult> getNamespaceNetworkRuleSet(GetNamespaceNetworkRuleSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:getNamespaceNetworkRuleSet", TypeShape.of(GetNamespaceNetworkRuleSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Single item in a List or Get VirtualNetworkRules operation
     * API Version: 2018-01-01-preview.
     * 
     */
    public static CompletableFuture<GetNamespaceVirtualNetworkRuleResult> getNamespaceVirtualNetworkRule(GetNamespaceVirtualNetworkRuleArgs args) {
        return getNamespaceVirtualNetworkRule(args, InvokeOptions.Empty);
    }
    /**
     * Single item in a List or Get VirtualNetworkRules operation
     * API Version: 2018-01-01-preview.
     * 
     */
    public static CompletableFuture<GetNamespaceVirtualNetworkRuleResult> getNamespaceVirtualNetworkRule(GetNamespaceVirtualNetworkRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:getNamespaceVirtualNetworkRule", TypeShape.of(GetNamespaceVirtualNetworkRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Properties of the PrivateEndpointConnection.
     * API Version: 2018-01-01-preview.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    /**
     * Properties of the PrivateEndpointConnection.
     * API Version: 2018-01-01-preview.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Single item in List or Get Schema Group operation
     * API Version: 2021-11-01.
     * 
     */
    public static CompletableFuture<GetSchemaRegistryResult> getSchemaRegistry(GetSchemaRegistryArgs args) {
        return getSchemaRegistry(args, InvokeOptions.Empty);
    }
    /**
     * Single item in List or Get Schema Group operation
     * API Version: 2021-11-01.
     * 
     */
    public static CompletableFuture<GetSchemaRegistryResult> getSchemaRegistry(GetSchemaRegistryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:getSchemaRegistry", TypeShape.of(GetSchemaRegistryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Namespace/EventHub Connection String
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<ListDisasterRecoveryConfigKeysResult> listDisasterRecoveryConfigKeys(ListDisasterRecoveryConfigKeysArgs args) {
        return listDisasterRecoveryConfigKeys(args, InvokeOptions.Empty);
    }
    /**
     * Namespace/EventHub Connection String
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<ListDisasterRecoveryConfigKeysResult> listDisasterRecoveryConfigKeys(ListDisasterRecoveryConfigKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:listDisasterRecoveryConfigKeys", TypeShape.of(ListDisasterRecoveryConfigKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Namespace/EventHub Connection String
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<ListEventHubKeysResult> listEventHubKeys(ListEventHubKeysArgs args) {
        return listEventHubKeys(args, InvokeOptions.Empty);
    }
    /**
     * Namespace/EventHub Connection String
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<ListEventHubKeysResult> listEventHubKeys(ListEventHubKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:listEventHubKeys", TypeShape.of(ListEventHubKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Namespace/EventHub Connection String
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<ListNamespaceKeysResult> listNamespaceKeys(ListNamespaceKeysArgs args) {
        return listNamespaceKeys(args, InvokeOptions.Empty);
    }
    /**
     * Namespace/EventHub Connection String
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<ListNamespaceKeysResult> listNamespaceKeys(ListNamespaceKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:listNamespaceKeys", TypeShape.of(ListNamespaceKeysResult.class), args, Utilities.withVersion(options));
    }
}
