// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Sch;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.Sch.inputs.GetServiceConnectorArgs;
import com.pulumi.oci.Sch.inputs.GetServiceConnectorPlainArgs;
import com.pulumi.oci.Sch.inputs.GetServiceConnectorsArgs;
import com.pulumi.oci.Sch.inputs.GetServiceConnectorsPlainArgs;
import com.pulumi.oci.Sch.outputs.GetServiceConnectorResult;
import com.pulumi.oci.Sch.outputs.GetServiceConnectorsResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class SchFunctions {
    /**
     * This data source provides details about a specific Service Connector resource in Oracle Cloud Infrastructure Service Connector Hub service.
     * 
     * Gets the specified service connector&#39;s configuration information.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetServiceConnectorResult> getServiceConnector(GetServiceConnectorArgs args) {
        return getServiceConnector(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Service Connector resource in Oracle Cloud Infrastructure Service Connector Hub service.
     * 
     * Gets the specified service connector&#39;s configuration information.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetServiceConnectorResult> getServiceConnectorPlain(GetServiceConnectorPlainArgs args) {
        return getServiceConnectorPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Service Connector resource in Oracle Cloud Infrastructure Service Connector Hub service.
     * 
     * Gets the specified service connector&#39;s configuration information.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetServiceConnectorResult> getServiceConnector(GetServiceConnectorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:Sch/getServiceConnector:getServiceConnector", TypeShape.of(GetServiceConnectorResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Service Connector resource in Oracle Cloud Infrastructure Service Connector Hub service.
     * 
     * Gets the specified service connector&#39;s configuration information.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetServiceConnectorResult> getServiceConnectorPlain(GetServiceConnectorPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Sch/getServiceConnector:getServiceConnector", TypeShape.of(GetServiceConnectorResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Service Connectors in Oracle Cloud Infrastructure Service Connector Hub service.
     * 
     * Lists service connectors in the specified compartment.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetServiceConnectorsResult> getServiceConnectors(GetServiceConnectorsArgs args) {
        return getServiceConnectors(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Service Connectors in Oracle Cloud Infrastructure Service Connector Hub service.
     * 
     * Lists service connectors in the specified compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetServiceConnectorsResult> getServiceConnectorsPlain(GetServiceConnectorsPlainArgs args) {
        return getServiceConnectorsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Service Connectors in Oracle Cloud Infrastructure Service Connector Hub service.
     * 
     * Lists service connectors in the specified compartment.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetServiceConnectorsResult> getServiceConnectors(GetServiceConnectorsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:Sch/getServiceConnectors:getServiceConnectors", TypeShape.of(GetServiceConnectorsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Service Connectors in Oracle Cloud Infrastructure Service Connector Hub service.
     * 
     * Lists service connectors in the specified compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetServiceConnectorsResult> getServiceConnectorsPlain(GetServiceConnectorsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Sch/getServiceConnectors:getServiceConnectors", TypeShape.of(GetServiceConnectorsResult.class), args, Utilities.withVersion(options));
    }
}
