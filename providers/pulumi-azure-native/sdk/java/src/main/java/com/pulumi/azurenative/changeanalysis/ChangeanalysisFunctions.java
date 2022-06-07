// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.changeanalysis;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.changeanalysis.inputs.GetConfigurationProfileArgs;
import com.pulumi.azurenative.changeanalysis.inputs.GetConfigurationProfilePlainArgs;
import com.pulumi.azurenative.changeanalysis.outputs.GetConfigurationProfileResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ChangeanalysisFunctions {
    /**
     * A profile object that contains change analysis configuration, such as notification settings, for this subscription
     * API Version: 2020-04-01-preview.
     * 
     */
    public static Output<GetConfigurationProfileResult> getConfigurationProfile(GetConfigurationProfileArgs args) {
        return getConfigurationProfile(args, InvokeOptions.Empty);
    }
    /**
     * A profile object that contains change analysis configuration, such as notification settings, for this subscription
     * API Version: 2020-04-01-preview.
     * 
     */
    public static CompletableFuture<GetConfigurationProfileResult> getConfigurationProfilePlain(GetConfigurationProfilePlainArgs args) {
        return getConfigurationProfilePlain(args, InvokeOptions.Empty);
    }
    /**
     * A profile object that contains change analysis configuration, such as notification settings, for this subscription
     * API Version: 2020-04-01-preview.
     * 
     */
    public static Output<GetConfigurationProfileResult> getConfigurationProfile(GetConfigurationProfileArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:changeanalysis:getConfigurationProfile", TypeShape.of(GetConfigurationProfileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A profile object that contains change analysis configuration, such as notification settings, for this subscription
     * API Version: 2020-04-01-preview.
     * 
     */
    public static CompletableFuture<GetConfigurationProfileResult> getConfigurationProfilePlain(GetConfigurationProfilePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:changeanalysis:getConfigurationProfile", TypeShape.of(GetConfigurationProfileResult.class), args, Utilities.withVersion(options));
    }
}
