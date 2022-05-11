// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hanaonazure;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.hanaonazure.inputs.GetHanaInstanceArgs;
import com.pulumi.azurenative.hanaonazure.inputs.GetProviderInstanceArgs;
import com.pulumi.azurenative.hanaonazure.inputs.GetSapMonitorArgs;
import com.pulumi.azurenative.hanaonazure.outputs.GetHanaInstanceResult;
import com.pulumi.azurenative.hanaonazure.outputs.GetProviderInstanceResult;
import com.pulumi.azurenative.hanaonazure.outputs.GetSapMonitorResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class HanaonazureFunctions {
    /**
     * HANA instance info on Azure (ARM properties and HANA properties)
     * API Version: 2017-11-03-preview.
     * 
     */
    public static CompletableFuture<GetHanaInstanceResult> getHanaInstance(GetHanaInstanceArgs args) {
        return getHanaInstance(args, InvokeOptions.Empty);
    }
    /**
     * HANA instance info on Azure (ARM properties and HANA properties)
     * API Version: 2017-11-03-preview.
     * 
     */
    public static CompletableFuture<GetHanaInstanceResult> getHanaInstance(GetHanaInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hanaonazure:getHanaInstance", TypeShape.of(GetHanaInstanceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A provider instance associated with a SAP monitor.
     * API Version: 2020-02-07-preview.
     * 
     */
    public static CompletableFuture<GetProviderInstanceResult> getProviderInstance(GetProviderInstanceArgs args) {
        return getProviderInstance(args, InvokeOptions.Empty);
    }
    /**
     * A provider instance associated with a SAP monitor.
     * API Version: 2020-02-07-preview.
     * 
     */
    public static CompletableFuture<GetProviderInstanceResult> getProviderInstance(GetProviderInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hanaonazure:getProviderInstance", TypeShape.of(GetProviderInstanceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * SAP monitor info on Azure (ARM properties and SAP monitor properties)
     * API Version: 2020-02-07-preview.
     * 
     */
    public static CompletableFuture<GetSapMonitorResult> getSapMonitor(GetSapMonitorArgs args) {
        return getSapMonitor(args, InvokeOptions.Empty);
    }
    /**
     * SAP monitor info on Azure (ARM properties and SAP monitor properties)
     * API Version: 2020-02-07-preview.
     * 
     */
    public static CompletableFuture<GetSapMonitorResult> getSapMonitor(GetSapMonitorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hanaonazure:getSapMonitor", TypeShape.of(GetSapMonitorResult.class), args, Utilities.withVersion(options));
    }
}
