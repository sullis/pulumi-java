// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotcoredeviceadvisor;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotcoredeviceadvisor.inputs.GetSuiteDefinitionArgs;
import io.pulumi.awsnative.iotcoredeviceadvisor.outputs.GetSuiteDefinitionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSuiteDefinition {
/**
 * An example resource schema demonstrating some basic constructs and validation rules.
 * 
 */
    public static CompletableFuture<GetSuiteDefinitionResult> invokeAsync(GetSuiteDefinitionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotcoredeviceadvisor:getSuiteDefinition", TypeShape.of(GetSuiteDefinitionResult.class), args == null ? GetSuiteDefinitionArgs.Empty : args, Utilities.withVersion(options));
    }
}
