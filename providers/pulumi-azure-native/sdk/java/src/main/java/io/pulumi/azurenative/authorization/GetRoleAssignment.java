// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.authorization.inputs.GetRoleAssignmentArgs;
import io.pulumi.azurenative.authorization.outputs.GetRoleAssignmentResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRoleAssignment {
    private GetRoleAssignment() {}
    public interface BuilderApplicator {
        public void apply(GetRoleAssignmentArgs.Builder a);
    }
    private static GetRoleAssignmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRoleAssignmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Role Assignments
 * API Version: 2020-08-01-preview.
 * 
     *
     * Role Assignments
 * 
     */
    public static CompletableFuture<GetRoleAssignmentResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Role Assignments
     * API Version: 2020-08-01-preview.
     * 
     *
         * Role Assignments
     * 
     */
    public static CompletableFuture<GetRoleAssignmentResult> invokeAsync(GetRoleAssignmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getRoleAssignment", TypeShape.of(GetRoleAssignmentResult.class), args == null ? GetRoleAssignmentArgs.Empty : args, Utilities.withVersion(options));
    }
}