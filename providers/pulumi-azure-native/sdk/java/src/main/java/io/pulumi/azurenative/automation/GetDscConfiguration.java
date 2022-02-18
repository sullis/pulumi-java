// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.inputs.GetDscConfigurationArgs;
import io.pulumi.azurenative.automation.outputs.GetDscConfigurationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDscConfiguration {
/**
 * Definition of the configuration type.
 * API Version: 2019-06-01.
 * 
 *
 * Definition of the configuration type.
 * 
 */
    public static CompletableFuture<GetDscConfigurationResult> invokeAsync(GetDscConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getDscConfiguration", TypeShape.of(GetDscConfigurationResult.class), args == null ? GetDscConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}
