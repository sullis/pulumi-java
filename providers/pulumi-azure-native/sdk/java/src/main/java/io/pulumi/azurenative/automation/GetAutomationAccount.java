// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.inputs.GetAutomationAccountArgs;
import io.pulumi.azurenative.automation.outputs.GetAutomationAccountResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAutomationAccount {
    private GetAutomationAccount() {}
    public interface BuilderApplicator {
        public void apply(GetAutomationAccountArgs.Builder a);
    }
    private static GetAutomationAccountArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAutomationAccountArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Definition of the automation account type.
 * API Version: 2021-06-22.
 * 
     *
     * Definition of the automation account type.
 * 
     */
    public static CompletableFuture<GetAutomationAccountResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Definition of the automation account type.
     * API Version: 2021-06-22.
     * 
     *
         * Definition of the automation account type.
     * 
     */
    public static CompletableFuture<GetAutomationAccountResult> invokeAsync(GetAutomationAccountArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getAutomationAccount", TypeShape.of(GetAutomationAccountResult.class), args == null ? GetAutomationAccountArgs.Empty : args, Utilities.withVersion(options));
    }
}