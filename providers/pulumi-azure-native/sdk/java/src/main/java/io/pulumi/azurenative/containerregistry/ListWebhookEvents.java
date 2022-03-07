// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.inputs.ListWebhookEventsArgs;
import io.pulumi.azurenative.containerregistry.outputs.ListWebhookEventsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListWebhookEvents {
    private ListWebhookEvents() {}
    public interface BuilderApplicator {
        public void apply(ListWebhookEventsArgs.Builder a);
    }
    private static ListWebhookEventsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListWebhookEventsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The result of a request to list events for a webhook.
 * API Version: 2019-05-01.
 * 
     *
     * The result of a request to list events for a webhook.
 * 
     */
    public static CompletableFuture<ListWebhookEventsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The result of a request to list events for a webhook.
     * API Version: 2019-05-01.
     * 
     *
         * The result of a request to list events for a webhook.
     * 
     */
    public static CompletableFuture<ListWebhookEventsResult> invokeAsync(ListWebhookEventsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:listWebhookEvents", TypeShape.of(ListWebhookEventsResult.class), args == null ? ListWebhookEventsArgs.Empty : args, Utilities.withVersion(options));
    }
}