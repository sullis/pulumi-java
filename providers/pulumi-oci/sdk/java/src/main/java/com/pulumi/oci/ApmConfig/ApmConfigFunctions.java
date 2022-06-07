// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApmConfig;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.ApmConfig.inputs.GetConfigArgs;
import com.pulumi.oci.ApmConfig.inputs.GetConfigPlainArgs;
import com.pulumi.oci.ApmConfig.inputs.GetConfigsArgs;
import com.pulumi.oci.ApmConfig.inputs.GetConfigsPlainArgs;
import com.pulumi.oci.ApmConfig.outputs.GetConfigResult;
import com.pulumi.oci.ApmConfig.outputs.GetConfigsResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class ApmConfigFunctions {
    /**
     * This data source provides details about a specific Config resource in Oracle Cloud Infrastructure Apm Config service.
     * 
     * Get the configuration of the item identified by the OCID.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetConfigResult> getConfig(GetConfigArgs args) {
        return getConfig(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Config resource in Oracle Cloud Infrastructure Apm Config service.
     * 
     * Get the configuration of the item identified by the OCID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetConfigResult> getConfigPlain(GetConfigPlainArgs args) {
        return getConfigPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Config resource in Oracle Cloud Infrastructure Apm Config service.
     * 
     * Get the configuration of the item identified by the OCID.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetConfigResult> getConfig(GetConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:ApmConfig/getConfig:getConfig", TypeShape.of(GetConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Config resource in Oracle Cloud Infrastructure Apm Config service.
     * 
     * Get the configuration of the item identified by the OCID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetConfigResult> getConfigPlain(GetConfigPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:ApmConfig/getConfig:getConfig", TypeShape.of(GetConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Configs in Oracle Cloud Infrastructure Apm Config service.
     * 
     * Returns all configured items optionally filtered by configuration type
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetConfigsResult> getConfigs(GetConfigsArgs args) {
        return getConfigs(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Configs in Oracle Cloud Infrastructure Apm Config service.
     * 
     * Returns all configured items optionally filtered by configuration type
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetConfigsResult> getConfigsPlain(GetConfigsPlainArgs args) {
        return getConfigsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Configs in Oracle Cloud Infrastructure Apm Config service.
     * 
     * Returns all configured items optionally filtered by configuration type
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetConfigsResult> getConfigs(GetConfigsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:ApmConfig/getConfigs:getConfigs", TypeShape.of(GetConfigsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Configs in Oracle Cloud Infrastructure Apm Config service.
     * 
     * Returns all configured items optionally filtered by configuration type
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetConfigsResult> getConfigsPlain(GetConfigsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:ApmConfig/getConfigs:getConfigs", TypeShape.of(GetConfigsResult.class), args, Utilities.withVersion(options));
    }
}
