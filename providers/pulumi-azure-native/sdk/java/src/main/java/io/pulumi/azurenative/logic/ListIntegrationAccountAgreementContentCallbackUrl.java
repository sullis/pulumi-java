// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.inputs.ListIntegrationAccountAgreementContentCallbackUrlArgs;
import io.pulumi.azurenative.logic.outputs.ListIntegrationAccountAgreementContentCallbackUrlResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListIntegrationAccountAgreementContentCallbackUrl {
/**
 * The workflow trigger callback URL.
 * API Version: 2019-05-01.
 * 
 *
 * The workflow trigger callback URL.
 * 
 */
    public static CompletableFuture<ListIntegrationAccountAgreementContentCallbackUrlResult> invokeAsync(ListIntegrationAccountAgreementContentCallbackUrlArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:logic:listIntegrationAccountAgreementContentCallbackUrl", TypeShape.of(ListIntegrationAccountAgreementContentCallbackUrlResult.class), args == null ? ListIntegrationAccountAgreementContentCallbackUrlArgs.Empty : args, Utilities.withVersion(options));
    }
}
