// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.inputs.ListKeyByAutomationAccountArgs;
import io.pulumi.azurenative.automation.outputs.ListKeyByAutomationAccountResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListKeyByAutomationAccount {
    private ListKeyByAutomationAccount() {}
    public interface BuilderApplicator {
        public void apply(ListKeyByAutomationAccountArgs.Builder a);
    }
    private static ListKeyByAutomationAccountArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListKeyByAutomationAccountArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * API Version: 2021-06-22.
 * 
     */
    public static CompletableFuture<ListKeyByAutomationAccountResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * API Version: 2021-06-22.
     * 
     */
    public static CompletableFuture<ListKeyByAutomationAccountResult> invokeAsync(ListKeyByAutomationAccountArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:listKeyByAutomationAccount", TypeShape.of(ListKeyByAutomationAccountResult.class), args == null ? ListKeyByAutomationAccountArgs.Empty : args, Utilities.withVersion(options));
    }
}