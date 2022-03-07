// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.billing;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.billing.inputs.GetBillingRoleAssignmentByDepartmentArgs;
import io.pulumi.azurenative.billing.outputs.GetBillingRoleAssignmentByDepartmentResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBillingRoleAssignmentByDepartment {
    private GetBillingRoleAssignmentByDepartment() {}
    public interface BuilderApplicator {
        public void apply(GetBillingRoleAssignmentByDepartmentArgs.Builder a);
    }
    private static GetBillingRoleAssignmentByDepartmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetBillingRoleAssignmentByDepartmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The role assignment
 * API Version: 2019-10-01-preview.
 * 
     *
     * The role assignment
 * 
     */
    public static CompletableFuture<GetBillingRoleAssignmentByDepartmentResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The role assignment
     * API Version: 2019-10-01-preview.
     * 
     *
         * The role assignment
     * 
     */
    public static CompletableFuture<GetBillingRoleAssignmentByDepartmentResult> invokeAsync(GetBillingRoleAssignmentByDepartmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:billing:getBillingRoleAssignmentByDepartment", TypeShape.of(GetBillingRoleAssignmentByDepartmentResult.class), args == null ? GetBillingRoleAssignmentByDepartmentArgs.Empty : args, Utilities.withVersion(options));
    }
}