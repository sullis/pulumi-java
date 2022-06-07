// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.VisualBuilder;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.Utilities;
import com.pulumi.oci.VisualBuilder.inputs.GetVbInstanceApplicationsArgs;
import com.pulumi.oci.VisualBuilder.inputs.GetVbInstanceApplicationsPlainArgs;
import com.pulumi.oci.VisualBuilder.inputs.GetVbInstanceArgs;
import com.pulumi.oci.VisualBuilder.inputs.GetVbInstancePlainArgs;
import com.pulumi.oci.VisualBuilder.inputs.GetVbInstancesArgs;
import com.pulumi.oci.VisualBuilder.inputs.GetVbInstancesPlainArgs;
import com.pulumi.oci.VisualBuilder.outputs.GetVbInstanceApplicationsResult;
import com.pulumi.oci.VisualBuilder.outputs.GetVbInstanceResult;
import com.pulumi.oci.VisualBuilder.outputs.GetVbInstancesResult;
import java.util.concurrent.CompletableFuture;

public final class VisualBuilderFunctions {
    /**
     * This data source provides details about a specific Vb Instance resource in Oracle Cloud Infrastructure Visual Builder service.
     * 
     * Gets a VbInstance by identifier
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetVbInstanceResult> getVbInstance(GetVbInstanceArgs args) {
        return getVbInstance(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Vb Instance resource in Oracle Cloud Infrastructure Visual Builder service.
     * 
     * Gets a VbInstance by identifier
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetVbInstanceResult> getVbInstancePlain(GetVbInstancePlainArgs args) {
        return getVbInstancePlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Vb Instance resource in Oracle Cloud Infrastructure Visual Builder service.
     * 
     * Gets a VbInstance by identifier
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetVbInstanceResult> getVbInstance(GetVbInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:VisualBuilder/getVbInstance:getVbInstance", TypeShape.of(GetVbInstanceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Vb Instance resource in Oracle Cloud Infrastructure Visual Builder service.
     * 
     * Gets a VbInstance by identifier
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetVbInstanceResult> getVbInstancePlain(GetVbInstancePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:VisualBuilder/getVbInstance:getVbInstance", TypeShape.of(GetVbInstanceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of published and staged applications of a Visual Builder Instance in Oracle Cloud Infrastructure Visual Builder service.
     * 
     * Returns a list of published and staged applications of a Visual Builder instance.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetVbInstanceApplicationsResult> getVbInstanceApplications(GetVbInstanceApplicationsArgs args) {
        return getVbInstanceApplications(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of published and staged applications of a Visual Builder Instance in Oracle Cloud Infrastructure Visual Builder service.
     * 
     * Returns a list of published and staged applications of a Visual Builder instance.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetVbInstanceApplicationsResult> getVbInstanceApplicationsPlain(GetVbInstanceApplicationsPlainArgs args) {
        return getVbInstanceApplicationsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of published and staged applications of a Visual Builder Instance in Oracle Cloud Infrastructure Visual Builder service.
     * 
     * Returns a list of published and staged applications of a Visual Builder instance.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetVbInstanceApplicationsResult> getVbInstanceApplications(GetVbInstanceApplicationsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:VisualBuilder/getVbInstanceApplications:getVbInstanceApplications", TypeShape.of(GetVbInstanceApplicationsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of published and staged applications of a Visual Builder Instance in Oracle Cloud Infrastructure Visual Builder service.
     * 
     * Returns a list of published and staged applications of a Visual Builder instance.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetVbInstanceApplicationsResult> getVbInstanceApplicationsPlain(GetVbInstanceApplicationsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:VisualBuilder/getVbInstanceApplications:getVbInstanceApplications", TypeShape.of(GetVbInstanceApplicationsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Vb Instances in Oracle Cloud Infrastructure Visual Builder service.
     * 
     * Returns a list of Vb Instances.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetVbInstancesResult> getVbInstances(GetVbInstancesArgs args) {
        return getVbInstances(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Vb Instances in Oracle Cloud Infrastructure Visual Builder service.
     * 
     * Returns a list of Vb Instances.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetVbInstancesResult> getVbInstancesPlain(GetVbInstancesPlainArgs args) {
        return getVbInstancesPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Vb Instances in Oracle Cloud Infrastructure Visual Builder service.
     * 
     * Returns a list of Vb Instances.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetVbInstancesResult> getVbInstances(GetVbInstancesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:VisualBuilder/getVbInstances:getVbInstances", TypeShape.of(GetVbInstancesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Vb Instances in Oracle Cloud Infrastructure Visual Builder service.
     * 
     * Returns a list of Vb Instances.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetVbInstancesResult> getVbInstancesPlain(GetVbInstancesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:VisualBuilder/getVbInstances:getVbInstances", TypeShape.of(GetVbInstancesResult.class), args, Utilities.withVersion(options));
    }
}
