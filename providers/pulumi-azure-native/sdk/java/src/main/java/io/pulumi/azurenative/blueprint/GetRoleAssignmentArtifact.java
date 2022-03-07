// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.blueprint.inputs.GetRoleAssignmentArtifactArgs;
import io.pulumi.azurenative.blueprint.outputs.GetRoleAssignmentArtifactResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRoleAssignmentArtifact {
    private GetRoleAssignmentArtifact() {}
    public interface BuilderApplicator {
        public void apply(GetRoleAssignmentArtifactArgs.Builder a);
    }
    private static GetRoleAssignmentArtifactArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRoleAssignmentArtifactArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Blueprint artifact that applies a Role assignment.
 * API Version: 2018-11-01-preview.
 * 
     *
     * Blueprint artifact that applies a Role assignment.
 * 
     */
    public static CompletableFuture<GetRoleAssignmentArtifactResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Blueprint artifact that applies a Role assignment.
     * API Version: 2018-11-01-preview.
     * 
     *
         * Blueprint artifact that applies a Role assignment.
     * 
     */
    public static CompletableFuture<GetRoleAssignmentArtifactResult> invokeAsync(GetRoleAssignmentArtifactArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:blueprint:getRoleAssignmentArtifact", TypeShape.of(GetRoleAssignmentArtifactResult.class), args == null ? GetRoleAssignmentArtifactArgs.Empty : args, Utilities.withVersion(options));
    }
}