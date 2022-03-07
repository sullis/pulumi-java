// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.inputs.GetIncidentCommentArgs;
import io.pulumi.azurenative.securityinsights.outputs.GetIncidentCommentResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIncidentComment {
    private GetIncidentComment() {}
    public interface BuilderApplicator {
        public void apply(GetIncidentCommentArgs.Builder a);
    }
    private static GetIncidentCommentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetIncidentCommentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Represents an incident comment
 * API Version: 2021-03-01-preview.
 * 
     *
     * Represents an incident comment
 * 
     */
    public static CompletableFuture<GetIncidentCommentResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Represents an incident comment
     * API Version: 2021-03-01-preview.
     * 
     *
         * Represents an incident comment
     * 
     */
    public static CompletableFuture<GetIncidentCommentResult> invokeAsync(GetIncidentCommentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityinsights:getIncidentComment", TypeShape.of(GetIncidentCommentResult.class), args == null ? GetIncidentCommentArgs.Empty : args, Utilities.withVersion(options));
    }
}