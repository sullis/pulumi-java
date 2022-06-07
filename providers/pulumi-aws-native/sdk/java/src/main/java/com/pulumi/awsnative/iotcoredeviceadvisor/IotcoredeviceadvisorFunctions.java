// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotcoredeviceadvisor;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.iotcoredeviceadvisor.inputs.GetSuiteDefinitionArgs;
import com.pulumi.awsnative.iotcoredeviceadvisor.inputs.GetSuiteDefinitionPlainArgs;
import com.pulumi.awsnative.iotcoredeviceadvisor.outputs.GetSuiteDefinitionResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class IotcoredeviceadvisorFunctions {
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static Output<GetSuiteDefinitionResult> getSuiteDefinition(GetSuiteDefinitionArgs args) {
        return getSuiteDefinition(args, InvokeOptions.Empty);
    }
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static CompletableFuture<GetSuiteDefinitionResult> getSuiteDefinitionPlain(GetSuiteDefinitionPlainArgs args) {
        return getSuiteDefinitionPlain(args, InvokeOptions.Empty);
    }
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static Output<GetSuiteDefinitionResult> getSuiteDefinition(GetSuiteDefinitionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:iotcoredeviceadvisor:getSuiteDefinition", TypeShape.of(GetSuiteDefinitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static CompletableFuture<GetSuiteDefinitionResult> getSuiteDefinitionPlain(GetSuiteDefinitionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotcoredeviceadvisor:getSuiteDefinition", TypeShape.of(GetSuiteDefinitionResult.class), args, Utilities.withVersion(options));
    }
}
