// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.osconfig_v1.inputs.GetOsPolicyAssignmentArgs;
import com.pulumi.googlenative.osconfig_v1.inputs.GetPatchDeploymentArgs;
import com.pulumi.googlenative.osconfig_v1.outputs.GetOsPolicyAssignmentResult;
import com.pulumi.googlenative.osconfig_v1.outputs.GetPatchDeploymentResult;
import java.util.concurrent.CompletableFuture;

public final class Osconfig_v1Functions {
    /**
     * Retrieve an existing OS policy assignment. This method always returns the latest revision. In order to retrieve a previous revision of the assignment, also provide the revision ID in the `name` parameter.
     * 
     */
    public static CompletableFuture<GetOsPolicyAssignmentResult> getOsPolicyAssignment(GetOsPolicyAssignmentArgs args) {
        return getOsPolicyAssignment(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve an existing OS policy assignment. This method always returns the latest revision. In order to retrieve a previous revision of the assignment, also provide the revision ID in the `name` parameter.
     * 
     */
    public static CompletableFuture<GetOsPolicyAssignmentResult> getOsPolicyAssignment(GetOsPolicyAssignmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:osconfig/v1:getOsPolicyAssignment", TypeShape.of(GetOsPolicyAssignmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get an OS Config patch deployment.
     * 
     */
    public static CompletableFuture<GetPatchDeploymentResult> getPatchDeployment(GetPatchDeploymentArgs args) {
        return getPatchDeployment(args, InvokeOptions.Empty);
    }
    /**
     * Get an OS Config patch deployment.
     * 
     */
    public static CompletableFuture<GetPatchDeploymentResult> getPatchDeployment(GetPatchDeploymentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:osconfig/v1:getPatchDeployment", TypeShape.of(GetPatchDeploymentResult.class), args, Utilities.withVersion(options));
    }
}
