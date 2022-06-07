// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_v2;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.deploymentmanager_v2.inputs.GetDeploymentArgs;
import com.pulumi.googlenative.deploymentmanager_v2.inputs.GetDeploymentIamPolicyArgs;
import com.pulumi.googlenative.deploymentmanager_v2.inputs.GetDeploymentIamPolicyPlainArgs;
import com.pulumi.googlenative.deploymentmanager_v2.inputs.GetDeploymentPlainArgs;
import com.pulumi.googlenative.deploymentmanager_v2.outputs.GetDeploymentIamPolicyResult;
import com.pulumi.googlenative.deploymentmanager_v2.outputs.GetDeploymentResult;
import java.util.concurrent.CompletableFuture;

public final class Deploymentmanager_v2Functions {
    /**
     * Gets information about a specific deployment.
     * 
     */
    public static Output<GetDeploymentResult> getDeployment(GetDeploymentArgs args) {
        return getDeployment(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about a specific deployment.
     * 
     */
    public static CompletableFuture<GetDeploymentResult> getDeploymentPlain(GetDeploymentPlainArgs args) {
        return getDeploymentPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about a specific deployment.
     * 
     */
    public static Output<GetDeploymentResult> getDeployment(GetDeploymentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:deploymentmanager/v2:getDeployment", TypeShape.of(GetDeploymentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about a specific deployment.
     * 
     */
    public static CompletableFuture<GetDeploymentResult> getDeploymentPlain(GetDeploymentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:deploymentmanager/v2:getDeployment", TypeShape.of(GetDeploymentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
     * 
     */
    public static Output<GetDeploymentIamPolicyResult> getDeploymentIamPolicy(GetDeploymentIamPolicyArgs args) {
        return getDeploymentIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
     * 
     */
    public static CompletableFuture<GetDeploymentIamPolicyResult> getDeploymentIamPolicyPlain(GetDeploymentIamPolicyPlainArgs args) {
        return getDeploymentIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
     * 
     */
    public static Output<GetDeploymentIamPolicyResult> getDeploymentIamPolicy(GetDeploymentIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:deploymentmanager/v2:getDeploymentIamPolicy", TypeShape.of(GetDeploymentIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
     * 
     */
    public static CompletableFuture<GetDeploymentIamPolicyResult> getDeploymentIamPolicyPlain(GetDeploymentIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:deploymentmanager/v2:getDeploymentIamPolicy", TypeShape.of(GetDeploymentIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
