// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha2;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.gkehub_v1alpha2.inputs.GetMembershipArgs;
import com.pulumi.googlenative.gkehub_v1alpha2.inputs.GetMembershipIamPolicyArgs;
import com.pulumi.googlenative.gkehub_v1alpha2.inputs.GetMembershipIamPolicyPlainArgs;
import com.pulumi.googlenative.gkehub_v1alpha2.inputs.GetMembershipPlainArgs;
import com.pulumi.googlenative.gkehub_v1alpha2.outputs.GetMembershipIamPolicyResult;
import com.pulumi.googlenative.gkehub_v1alpha2.outputs.GetMembershipResult;
import java.util.concurrent.CompletableFuture;

public final class Gkehub_v1alpha2Functions {
    /**
     * Gets the details of a Membership.
     * 
     */
    public static Output<GetMembershipResult> getMembership(GetMembershipArgs args) {
        return getMembership(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details of a Membership.
     * 
     */
    public static CompletableFuture<GetMembershipResult> getMembershipPlain(GetMembershipPlainArgs args) {
        return getMembershipPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details of a Membership.
     * 
     */
    public static Output<GetMembershipResult> getMembership(GetMembershipArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:gkehub/v1alpha2:getMembership", TypeShape.of(GetMembershipResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the details of a Membership.
     * 
     */
    public static CompletableFuture<GetMembershipResult> getMembershipPlain(GetMembershipPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkehub/v1alpha2:getMembership", TypeShape.of(GetMembershipResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetMembershipIamPolicyResult> getMembershipIamPolicy(GetMembershipIamPolicyArgs args) {
        return getMembershipIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetMembershipIamPolicyResult> getMembershipIamPolicyPlain(GetMembershipIamPolicyPlainArgs args) {
        return getMembershipIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetMembershipIamPolicyResult> getMembershipIamPolicy(GetMembershipIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:gkehub/v1alpha2:getMembershipIamPolicy", TypeShape.of(GetMembershipIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetMembershipIamPolicyResult> getMembershipIamPolicyPlain(GetMembershipIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkehub/v1alpha2:getMembershipIamPolicy", TypeShape.of(GetMembershipIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
