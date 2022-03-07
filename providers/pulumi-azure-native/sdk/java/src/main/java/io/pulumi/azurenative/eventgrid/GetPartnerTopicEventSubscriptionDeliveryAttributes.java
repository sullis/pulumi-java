// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventgrid.inputs.GetPartnerTopicEventSubscriptionDeliveryAttributesArgs;
import io.pulumi.azurenative.eventgrid.outputs.GetPartnerTopicEventSubscriptionDeliveryAttributesResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPartnerTopicEventSubscriptionDeliveryAttributes {
    private GetPartnerTopicEventSubscriptionDeliveryAttributes() {}
    public interface BuilderApplicator {
        public void apply(GetPartnerTopicEventSubscriptionDeliveryAttributesArgs.Builder a);
    }
    private static GetPartnerTopicEventSubscriptionDeliveryAttributesArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPartnerTopicEventSubscriptionDeliveryAttributesArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Result of the Get delivery attributes operation.
 * API Version: 2021-06-01-preview.
 * 
     *
     * Result of the Get delivery attributes operation.
 * 
     */
    public static CompletableFuture<GetPartnerTopicEventSubscriptionDeliveryAttributesResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Result of the Get delivery attributes operation.
     * API Version: 2021-06-01-preview.
     * 
     *
         * Result of the Get delivery attributes operation.
     * 
     */
    public static CompletableFuture<GetPartnerTopicEventSubscriptionDeliveryAttributesResult> invokeAsync(GetPartnerTopicEventSubscriptionDeliveryAttributesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getPartnerTopicEventSubscriptionDeliveryAttributes", TypeShape.of(GetPartnerTopicEventSubscriptionDeliveryAttributesResult.class), args == null ? GetPartnerTopicEventSubscriptionDeliveryAttributesArgs.Empty : args, Utilities.withVersion(options));
    }
}