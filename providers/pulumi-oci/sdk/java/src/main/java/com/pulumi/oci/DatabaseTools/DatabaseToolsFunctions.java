// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseTools;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.DatabaseTools.inputs.GetDatabaseToolsConnectionArgs;
import com.pulumi.oci.DatabaseTools.inputs.GetDatabaseToolsConnectionPlainArgs;
import com.pulumi.oci.DatabaseTools.inputs.GetDatabaseToolsConnectionsArgs;
import com.pulumi.oci.DatabaseTools.inputs.GetDatabaseToolsConnectionsPlainArgs;
import com.pulumi.oci.DatabaseTools.inputs.GetDatabaseToolsEndpointServiceArgs;
import com.pulumi.oci.DatabaseTools.inputs.GetDatabaseToolsEndpointServicePlainArgs;
import com.pulumi.oci.DatabaseTools.inputs.GetDatabaseToolsEndpointServicesArgs;
import com.pulumi.oci.DatabaseTools.inputs.GetDatabaseToolsEndpointServicesPlainArgs;
import com.pulumi.oci.DatabaseTools.inputs.GetDatabaseToolsPrivateEndpointArgs;
import com.pulumi.oci.DatabaseTools.inputs.GetDatabaseToolsPrivateEndpointPlainArgs;
import com.pulumi.oci.DatabaseTools.inputs.GetDatabaseToolsPrivateEndpointsArgs;
import com.pulumi.oci.DatabaseTools.inputs.GetDatabaseToolsPrivateEndpointsPlainArgs;
import com.pulumi.oci.DatabaseTools.outputs.GetDatabaseToolsConnectionResult;
import com.pulumi.oci.DatabaseTools.outputs.GetDatabaseToolsConnectionsResult;
import com.pulumi.oci.DatabaseTools.outputs.GetDatabaseToolsEndpointServiceResult;
import com.pulumi.oci.DatabaseTools.outputs.GetDatabaseToolsEndpointServicesResult;
import com.pulumi.oci.DatabaseTools.outputs.GetDatabaseToolsPrivateEndpointResult;
import com.pulumi.oci.DatabaseTools.outputs.GetDatabaseToolsPrivateEndpointsResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class DatabaseToolsFunctions {
    /**
     * This data source provides details about a specific Database Tools Connection resource in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Gets a DatabaseToolsConnection by identifier
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetDatabaseToolsConnectionResult> getDatabaseToolsConnection(GetDatabaseToolsConnectionArgs args) {
        return getDatabaseToolsConnection(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Database Tools Connection resource in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Gets a DatabaseToolsConnection by identifier
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDatabaseToolsConnectionResult> getDatabaseToolsConnectionPlain(GetDatabaseToolsConnectionPlainArgs args) {
        return getDatabaseToolsConnectionPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Database Tools Connection resource in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Gets a DatabaseToolsConnection by identifier
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetDatabaseToolsConnectionResult> getDatabaseToolsConnection(GetDatabaseToolsConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:DatabaseTools/getDatabaseToolsConnection:getDatabaseToolsConnection", TypeShape.of(GetDatabaseToolsConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Database Tools Connection resource in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Gets a DatabaseToolsConnection by identifier
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDatabaseToolsConnectionResult> getDatabaseToolsConnectionPlain(GetDatabaseToolsConnectionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:DatabaseTools/getDatabaseToolsConnection:getDatabaseToolsConnection", TypeShape.of(GetDatabaseToolsConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Database Tools Connections in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Returns a list of DatabaseToolsConnections.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetDatabaseToolsConnectionsResult> getDatabaseToolsConnections(GetDatabaseToolsConnectionsArgs args) {
        return getDatabaseToolsConnections(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Database Tools Connections in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Returns a list of DatabaseToolsConnections.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDatabaseToolsConnectionsResult> getDatabaseToolsConnectionsPlain(GetDatabaseToolsConnectionsPlainArgs args) {
        return getDatabaseToolsConnectionsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Database Tools Connections in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Returns a list of DatabaseToolsConnections.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetDatabaseToolsConnectionsResult> getDatabaseToolsConnections(GetDatabaseToolsConnectionsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:DatabaseTools/getDatabaseToolsConnections:getDatabaseToolsConnections", TypeShape.of(GetDatabaseToolsConnectionsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Database Tools Connections in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Returns a list of DatabaseToolsConnections.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDatabaseToolsConnectionsResult> getDatabaseToolsConnectionsPlain(GetDatabaseToolsConnectionsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:DatabaseTools/getDatabaseToolsConnections:getDatabaseToolsConnections", TypeShape.of(GetDatabaseToolsConnectionsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Database Tools Endpoint Service resource in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Gets a DatabaseToolsEndpointService by identifier
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetDatabaseToolsEndpointServiceResult> getDatabaseToolsEndpointService(GetDatabaseToolsEndpointServiceArgs args) {
        return getDatabaseToolsEndpointService(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Database Tools Endpoint Service resource in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Gets a DatabaseToolsEndpointService by identifier
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDatabaseToolsEndpointServiceResult> getDatabaseToolsEndpointServicePlain(GetDatabaseToolsEndpointServicePlainArgs args) {
        return getDatabaseToolsEndpointServicePlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Database Tools Endpoint Service resource in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Gets a DatabaseToolsEndpointService by identifier
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetDatabaseToolsEndpointServiceResult> getDatabaseToolsEndpointService(GetDatabaseToolsEndpointServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:DatabaseTools/getDatabaseToolsEndpointService:getDatabaseToolsEndpointService", TypeShape.of(GetDatabaseToolsEndpointServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Database Tools Endpoint Service resource in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Gets a DatabaseToolsEndpointService by identifier
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDatabaseToolsEndpointServiceResult> getDatabaseToolsEndpointServicePlain(GetDatabaseToolsEndpointServicePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:DatabaseTools/getDatabaseToolsEndpointService:getDatabaseToolsEndpointService", TypeShape.of(GetDatabaseToolsEndpointServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Database Tools Endpoint Services in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Returns a list of DatabaseToolsEndpointServices.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetDatabaseToolsEndpointServicesResult> getDatabaseToolsEndpointServices(GetDatabaseToolsEndpointServicesArgs args) {
        return getDatabaseToolsEndpointServices(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Database Tools Endpoint Services in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Returns a list of DatabaseToolsEndpointServices.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDatabaseToolsEndpointServicesResult> getDatabaseToolsEndpointServicesPlain(GetDatabaseToolsEndpointServicesPlainArgs args) {
        return getDatabaseToolsEndpointServicesPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Database Tools Endpoint Services in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Returns a list of DatabaseToolsEndpointServices.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetDatabaseToolsEndpointServicesResult> getDatabaseToolsEndpointServices(GetDatabaseToolsEndpointServicesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:DatabaseTools/getDatabaseToolsEndpointServices:getDatabaseToolsEndpointServices", TypeShape.of(GetDatabaseToolsEndpointServicesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Database Tools Endpoint Services in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Returns a list of DatabaseToolsEndpointServices.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDatabaseToolsEndpointServicesResult> getDatabaseToolsEndpointServicesPlain(GetDatabaseToolsEndpointServicesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:DatabaseTools/getDatabaseToolsEndpointServices:getDatabaseToolsEndpointServices", TypeShape.of(GetDatabaseToolsEndpointServicesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Database Tools Private Endpoint resource in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Gets a DatabaseToolsPrivateEndpoint by identifier
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetDatabaseToolsPrivateEndpointResult> getDatabaseToolsPrivateEndpoint(GetDatabaseToolsPrivateEndpointArgs args) {
        return getDatabaseToolsPrivateEndpoint(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Database Tools Private Endpoint resource in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Gets a DatabaseToolsPrivateEndpoint by identifier
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDatabaseToolsPrivateEndpointResult> getDatabaseToolsPrivateEndpointPlain(GetDatabaseToolsPrivateEndpointPlainArgs args) {
        return getDatabaseToolsPrivateEndpointPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Database Tools Private Endpoint resource in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Gets a DatabaseToolsPrivateEndpoint by identifier
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetDatabaseToolsPrivateEndpointResult> getDatabaseToolsPrivateEndpoint(GetDatabaseToolsPrivateEndpointArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:DatabaseTools/getDatabaseToolsPrivateEndpoint:getDatabaseToolsPrivateEndpoint", TypeShape.of(GetDatabaseToolsPrivateEndpointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Database Tools Private Endpoint resource in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Gets a DatabaseToolsPrivateEndpoint by identifier
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDatabaseToolsPrivateEndpointResult> getDatabaseToolsPrivateEndpointPlain(GetDatabaseToolsPrivateEndpointPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:DatabaseTools/getDatabaseToolsPrivateEndpoint:getDatabaseToolsPrivateEndpoint", TypeShape.of(GetDatabaseToolsPrivateEndpointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Database Tools Private Endpoints in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Returns a list of DatabaseToolsPrivateEndpoints.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetDatabaseToolsPrivateEndpointsResult> getDatabaseToolsPrivateEndpoints(GetDatabaseToolsPrivateEndpointsArgs args) {
        return getDatabaseToolsPrivateEndpoints(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Database Tools Private Endpoints in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Returns a list of DatabaseToolsPrivateEndpoints.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDatabaseToolsPrivateEndpointsResult> getDatabaseToolsPrivateEndpointsPlain(GetDatabaseToolsPrivateEndpointsPlainArgs args) {
        return getDatabaseToolsPrivateEndpointsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Database Tools Private Endpoints in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Returns a list of DatabaseToolsPrivateEndpoints.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetDatabaseToolsPrivateEndpointsResult> getDatabaseToolsPrivateEndpoints(GetDatabaseToolsPrivateEndpointsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:DatabaseTools/getDatabaseToolsPrivateEndpoints:getDatabaseToolsPrivateEndpoints", TypeShape.of(GetDatabaseToolsPrivateEndpointsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Database Tools Private Endpoints in Oracle Cloud Infrastructure Database Tools service.
     * 
     * Returns a list of DatabaseToolsPrivateEndpoints.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDatabaseToolsPrivateEndpointsResult> getDatabaseToolsPrivateEndpointsPlain(GetDatabaseToolsPrivateEndpointsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:DatabaseTools/getDatabaseToolsPrivateEndpoints:getDatabaseToolsPrivateEndpoints", TypeShape.of(GetDatabaseToolsPrivateEndpointsResult.class), args, Utilities.withVersion(options));
    }
}
