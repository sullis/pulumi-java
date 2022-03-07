// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.inputs.GetVariableArgs;
import io.pulumi.azurenative.automation.outputs.GetVariableResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVariable {
    private GetVariable() {}
    public interface BuilderApplicator {
        public void apply(GetVariableArgs.Builder a);
    }
    private static GetVariableArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetVariableArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Definition of the variable.
 * API Version: 2019-06-01.
 * 
     *
     * Definition of the variable.
 * 
     */
    public static CompletableFuture<GetVariableResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Definition of the variable.
     * API Version: 2019-06-01.
     * 
     *
         * Definition of the variable.
     * 
     */
    public static CompletableFuture<GetVariableResult> invokeAsync(GetVariableArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getVariable", TypeShape.of(GetVariableResult.class), args == null ? GetVariableArgs.Empty : args, Utilities.withVersion(options));
    }
}