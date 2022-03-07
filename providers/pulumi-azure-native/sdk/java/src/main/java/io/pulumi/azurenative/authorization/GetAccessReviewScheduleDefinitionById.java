// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.authorization.inputs.GetAccessReviewScheduleDefinitionByIdArgs;
import io.pulumi.azurenative.authorization.outputs.GetAccessReviewScheduleDefinitionByIdResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAccessReviewScheduleDefinitionById {
    private GetAccessReviewScheduleDefinitionById() {}
    public interface BuilderApplicator {
        public void apply(GetAccessReviewScheduleDefinitionByIdArgs.Builder a);
    }
    private static GetAccessReviewScheduleDefinitionByIdArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAccessReviewScheduleDefinitionByIdArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Access Review Schedule Definition.
 * API Version: 2021-03-01-preview.
 * 
     *
     * Access Review Schedule Definition.
 * 
     */
    public static CompletableFuture<GetAccessReviewScheduleDefinitionByIdResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Access Review Schedule Definition.
     * API Version: 2021-03-01-preview.
     * 
     *
         * Access Review Schedule Definition.
     * 
     */
    public static CompletableFuture<GetAccessReviewScheduleDefinitionByIdResult> invokeAsync(GetAccessReviewScheduleDefinitionByIdArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getAccessReviewScheduleDefinitionById", TypeShape.of(GetAccessReviewScheduleDefinitionByIdResult.class), args == null ? GetAccessReviewScheduleDefinitionByIdArgs.Empty : args, Utilities.withVersion(options));
    }
}