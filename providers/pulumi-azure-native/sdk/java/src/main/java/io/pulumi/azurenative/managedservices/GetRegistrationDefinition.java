// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.managedservices.inputs.GetRegistrationDefinitionArgs;
import io.pulumi.azurenative.managedservices.outputs.GetRegistrationDefinitionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegistrationDefinition {
    private GetRegistrationDefinition() {}
    public interface BuilderApplicator {
        public void apply(GetRegistrationDefinitionArgs.Builder a);
    }
    private static GetRegistrationDefinitionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRegistrationDefinitionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Registration definition.
 * API Version: 2019-09-01.
 * 
     *
     * Registration definition.
 * 
     */
    public static CompletableFuture<GetRegistrationDefinitionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Registration definition.
     * API Version: 2019-09-01.
     * 
     *
         * Registration definition.
     * 
     */
    public static CompletableFuture<GetRegistrationDefinitionResult> invokeAsync(GetRegistrationDefinitionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:managedservices:getRegistrationDefinition", TypeShape.of(GetRegistrationDefinitionResult.class), args == null ? GetRegistrationDefinitionArgs.Empty : args, Utilities.withVersion(options));
    }
}