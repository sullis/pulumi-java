// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbilling_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudbilling_v1.inputs.GetBillingAccountArgs;
import io.pulumi.googlenative.cloudbilling_v1.outputs.GetBillingAccountResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBillingAccount {
    private GetBillingAccount() {}
    public interface BuilderApplicator {
        public void apply(GetBillingAccountArgs.Builder a);
    }
    private static GetBillingAccountArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetBillingAccountArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets information about a billing account. The current authenticated user must be a [viewer of the billing account](https://cloud.google.com/billing/docs/how-to/billing-access).
 * 
     */
    public static CompletableFuture<GetBillingAccountResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets information about a billing account. The current authenticated user must be a [viewer of the billing account](https://cloud.google.com/billing/docs/how-to/billing-access).
     * 
     */
    public static CompletableFuture<GetBillingAccountResult> invokeAsync(GetBillingAccountArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudbilling/v1:getBillingAccount", TypeShape.of(GetBillingAccountResult.class), args == null ? GetBillingAccountArgs.Empty : args, Utilities.withVersion(options));
    }
}