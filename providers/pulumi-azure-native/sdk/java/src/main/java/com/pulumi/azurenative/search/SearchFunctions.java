// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.search;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.search.inputs.GetPrivateEndpointConnectionArgs;
import com.pulumi.azurenative.search.inputs.GetPrivateEndpointConnectionPlainArgs;
import com.pulumi.azurenative.search.inputs.GetServiceArgs;
import com.pulumi.azurenative.search.inputs.GetServicePlainArgs;
import com.pulumi.azurenative.search.inputs.GetSharedPrivateLinkResourceArgs;
import com.pulumi.azurenative.search.inputs.GetSharedPrivateLinkResourcePlainArgs;
import com.pulumi.azurenative.search.inputs.ListAdminKeyArgs;
import com.pulumi.azurenative.search.inputs.ListAdminKeyPlainArgs;
import com.pulumi.azurenative.search.inputs.ListQueryKeyBySearchServiceArgs;
import com.pulumi.azurenative.search.inputs.ListQueryKeyBySearchServicePlainArgs;
import com.pulumi.azurenative.search.outputs.GetPrivateEndpointConnectionResult;
import com.pulumi.azurenative.search.outputs.GetServiceResult;
import com.pulumi.azurenative.search.outputs.GetSharedPrivateLinkResourceResult;
import com.pulumi.azurenative.search.outputs.ListAdminKeyResult;
import com.pulumi.azurenative.search.outputs.ListQueryKeyBySearchServiceResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SearchFunctions {
    /**
     * Describes an existing Private Endpoint connection to the Azure Cognitive Search service.
     * API Version: 2020-08-01.
     * 
     */
    public static Output<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    /**
     * Describes an existing Private Endpoint connection to the Azure Cognitive Search service.
     * API Version: 2020-08-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnectionPlain(GetPrivateEndpointConnectionPlainArgs args) {
        return getPrivateEndpointConnectionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Describes an existing Private Endpoint connection to the Azure Cognitive Search service.
     * API Version: 2020-08-01.
     * 
     */
    public static Output<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:search:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes an existing Private Endpoint connection to the Azure Cognitive Search service.
     * API Version: 2020-08-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnectionPlain(GetPrivateEndpointConnectionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:search:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes an Azure Cognitive Search service and its current state.
     * API Version: 2020-08-01.
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args) {
        return getService(args, InvokeOptions.Empty);
    }
    /**
     * Describes an Azure Cognitive Search service and its current state.
     * API Version: 2020-08-01.
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain(GetServicePlainArgs args) {
        return getServicePlain(args, InvokeOptions.Empty);
    }
    /**
     * Describes an Azure Cognitive Search service and its current state.
     * API Version: 2020-08-01.
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:search:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes an Azure Cognitive Search service and its current state.
     * API Version: 2020-08-01.
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain(GetServicePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:search:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes a Shared Private Link Resource managed by the Azure Cognitive Search service.
     * API Version: 2020-08-01.
     * 
     */
    public static Output<GetSharedPrivateLinkResourceResult> getSharedPrivateLinkResource(GetSharedPrivateLinkResourceArgs args) {
        return getSharedPrivateLinkResource(args, InvokeOptions.Empty);
    }
    /**
     * Describes a Shared Private Link Resource managed by the Azure Cognitive Search service.
     * API Version: 2020-08-01.
     * 
     */
    public static CompletableFuture<GetSharedPrivateLinkResourceResult> getSharedPrivateLinkResourcePlain(GetSharedPrivateLinkResourcePlainArgs args) {
        return getSharedPrivateLinkResourcePlain(args, InvokeOptions.Empty);
    }
    /**
     * Describes a Shared Private Link Resource managed by the Azure Cognitive Search service.
     * API Version: 2020-08-01.
     * 
     */
    public static Output<GetSharedPrivateLinkResourceResult> getSharedPrivateLinkResource(GetSharedPrivateLinkResourceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:search:getSharedPrivateLinkResource", TypeShape.of(GetSharedPrivateLinkResourceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes a Shared Private Link Resource managed by the Azure Cognitive Search service.
     * API Version: 2020-08-01.
     * 
     */
    public static CompletableFuture<GetSharedPrivateLinkResourceResult> getSharedPrivateLinkResourcePlain(GetSharedPrivateLinkResourcePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:search:getSharedPrivateLinkResource", TypeShape.of(GetSharedPrivateLinkResourceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Response containing the primary and secondary admin API keys for a given Azure Cognitive Search service.
     * API Version: 2020-08-01.
     * 
     */
    public static Output<ListAdminKeyResult> listAdminKey(ListAdminKeyArgs args) {
        return listAdminKey(args, InvokeOptions.Empty);
    }
    /**
     * Response containing the primary and secondary admin API keys for a given Azure Cognitive Search service.
     * API Version: 2020-08-01.
     * 
     */
    public static CompletableFuture<ListAdminKeyResult> listAdminKeyPlain(ListAdminKeyPlainArgs args) {
        return listAdminKeyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Response containing the primary and secondary admin API keys for a given Azure Cognitive Search service.
     * API Version: 2020-08-01.
     * 
     */
    public static Output<ListAdminKeyResult> listAdminKey(ListAdminKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:search:listAdminKey", TypeShape.of(ListAdminKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Response containing the primary and secondary admin API keys for a given Azure Cognitive Search service.
     * API Version: 2020-08-01.
     * 
     */
    public static CompletableFuture<ListAdminKeyResult> listAdminKeyPlain(ListAdminKeyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:search:listAdminKey", TypeShape.of(ListAdminKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Response containing the query API keys for a given Azure Cognitive Search service.
     * API Version: 2020-08-01.
     * 
     */
    public static Output<ListQueryKeyBySearchServiceResult> listQueryKeyBySearchService(ListQueryKeyBySearchServiceArgs args) {
        return listQueryKeyBySearchService(args, InvokeOptions.Empty);
    }
    /**
     * Response containing the query API keys for a given Azure Cognitive Search service.
     * API Version: 2020-08-01.
     * 
     */
    public static CompletableFuture<ListQueryKeyBySearchServiceResult> listQueryKeyBySearchServicePlain(ListQueryKeyBySearchServicePlainArgs args) {
        return listQueryKeyBySearchServicePlain(args, InvokeOptions.Empty);
    }
    /**
     * Response containing the query API keys for a given Azure Cognitive Search service.
     * API Version: 2020-08-01.
     * 
     */
    public static Output<ListQueryKeyBySearchServiceResult> listQueryKeyBySearchService(ListQueryKeyBySearchServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:search:listQueryKeyBySearchService", TypeShape.of(ListQueryKeyBySearchServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Response containing the query API keys for a given Azure Cognitive Search service.
     * API Version: 2020-08-01.
     * 
     */
    public static CompletableFuture<ListQueryKeyBySearchServiceResult> listQueryKeyBySearchServicePlain(ListQueryKeyBySearchServicePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:search:listQueryKeyBySearchService", TypeShape.of(ListQueryKeyBySearchServiceResult.class), args, Utilities.withVersion(options));
    }
}
