// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1beta1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.domains_v1beta1.inputs.GetRegistrationArgs;
import com.pulumi.googlenative.domains_v1beta1.inputs.GetRegistrationIamPolicyArgs;
import com.pulumi.googlenative.domains_v1beta1.outputs.GetRegistrationIamPolicyResult;
import com.pulumi.googlenative.domains_v1beta1.outputs.GetRegistrationResult;
import java.util.concurrent.CompletableFuture;

public final class Domains_v1beta1Functions {
    /**
     * Gets the details of a `Registration` resource.
     * 
     */
    public static CompletableFuture<GetRegistrationResult> getRegistration(GetRegistrationArgs args) {
        return getRegistration(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details of a `Registration` resource.
     * 
     */
    public static CompletableFuture<GetRegistrationResult> getRegistration(GetRegistrationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:domains/v1beta1:getRegistration", TypeShape.of(GetRegistrationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetRegistrationIamPolicyResult> getRegistrationIamPolicy(GetRegistrationIamPolicyArgs args) {
        return getRegistrationIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetRegistrationIamPolicyResult> getRegistrationIamPolicy(GetRegistrationIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:domains/v1beta1:getRegistrationIamPolicy", TypeShape.of(GetRegistrationIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
