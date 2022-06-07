// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy_v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.clouddeploy_v1.inputs.GetDeliveryPipelineArgs;
import com.pulumi.googlenative.clouddeploy_v1.inputs.GetDeliveryPipelineIamPolicyArgs;
import com.pulumi.googlenative.clouddeploy_v1.inputs.GetDeliveryPipelineIamPolicyPlainArgs;
import com.pulumi.googlenative.clouddeploy_v1.inputs.GetDeliveryPipelinePlainArgs;
import com.pulumi.googlenative.clouddeploy_v1.inputs.GetReleaseArgs;
import com.pulumi.googlenative.clouddeploy_v1.inputs.GetReleasePlainArgs;
import com.pulumi.googlenative.clouddeploy_v1.inputs.GetRolloutArgs;
import com.pulumi.googlenative.clouddeploy_v1.inputs.GetRolloutPlainArgs;
import com.pulumi.googlenative.clouddeploy_v1.inputs.GetTargetArgs;
import com.pulumi.googlenative.clouddeploy_v1.inputs.GetTargetIamPolicyArgs;
import com.pulumi.googlenative.clouddeploy_v1.inputs.GetTargetIamPolicyPlainArgs;
import com.pulumi.googlenative.clouddeploy_v1.inputs.GetTargetPlainArgs;
import com.pulumi.googlenative.clouddeploy_v1.outputs.GetDeliveryPipelineIamPolicyResult;
import com.pulumi.googlenative.clouddeploy_v1.outputs.GetDeliveryPipelineResult;
import com.pulumi.googlenative.clouddeploy_v1.outputs.GetReleaseResult;
import com.pulumi.googlenative.clouddeploy_v1.outputs.GetRolloutResult;
import com.pulumi.googlenative.clouddeploy_v1.outputs.GetTargetIamPolicyResult;
import com.pulumi.googlenative.clouddeploy_v1.outputs.GetTargetResult;
import java.util.concurrent.CompletableFuture;

public final class Clouddeploy_v1Functions {
    /**
     * Gets details of a single DeliveryPipeline.
     * 
     */
    public static Output<GetDeliveryPipelineResult> getDeliveryPipeline(GetDeliveryPipelineArgs args) {
        return getDeliveryPipeline(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single DeliveryPipeline.
     * 
     */
    public static CompletableFuture<GetDeliveryPipelineResult> getDeliveryPipelinePlain(GetDeliveryPipelinePlainArgs args) {
        return getDeliveryPipelinePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single DeliveryPipeline.
     * 
     */
    public static Output<GetDeliveryPipelineResult> getDeliveryPipeline(GetDeliveryPipelineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:clouddeploy/v1:getDeliveryPipeline", TypeShape.of(GetDeliveryPipelineResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single DeliveryPipeline.
     * 
     */
    public static CompletableFuture<GetDeliveryPipelineResult> getDeliveryPipelinePlain(GetDeliveryPipelinePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:clouddeploy/v1:getDeliveryPipeline", TypeShape.of(GetDeliveryPipelineResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetDeliveryPipelineIamPolicyResult> getDeliveryPipelineIamPolicy(GetDeliveryPipelineIamPolicyArgs args) {
        return getDeliveryPipelineIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetDeliveryPipelineIamPolicyResult> getDeliveryPipelineIamPolicyPlain(GetDeliveryPipelineIamPolicyPlainArgs args) {
        return getDeliveryPipelineIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetDeliveryPipelineIamPolicyResult> getDeliveryPipelineIamPolicy(GetDeliveryPipelineIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:clouddeploy/v1:getDeliveryPipelineIamPolicy", TypeShape.of(GetDeliveryPipelineIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetDeliveryPipelineIamPolicyResult> getDeliveryPipelineIamPolicyPlain(GetDeliveryPipelineIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:clouddeploy/v1:getDeliveryPipelineIamPolicy", TypeShape.of(GetDeliveryPipelineIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Release.
     * 
     */
    public static Output<GetReleaseResult> getRelease(GetReleaseArgs args) {
        return getRelease(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Release.
     * 
     */
    public static CompletableFuture<GetReleaseResult> getReleasePlain(GetReleasePlainArgs args) {
        return getReleasePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Release.
     * 
     */
    public static Output<GetReleaseResult> getRelease(GetReleaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:clouddeploy/v1:getRelease", TypeShape.of(GetReleaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Release.
     * 
     */
    public static CompletableFuture<GetReleaseResult> getReleasePlain(GetReleasePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:clouddeploy/v1:getRelease", TypeShape.of(GetReleaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Rollout.
     * 
     */
    public static Output<GetRolloutResult> getRollout(GetRolloutArgs args) {
        return getRollout(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Rollout.
     * 
     */
    public static CompletableFuture<GetRolloutResult> getRolloutPlain(GetRolloutPlainArgs args) {
        return getRolloutPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Rollout.
     * 
     */
    public static Output<GetRolloutResult> getRollout(GetRolloutArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:clouddeploy/v1:getRollout", TypeShape.of(GetRolloutResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Rollout.
     * 
     */
    public static CompletableFuture<GetRolloutResult> getRolloutPlain(GetRolloutPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:clouddeploy/v1:getRollout", TypeShape.of(GetRolloutResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Target.
     * 
     */
    public static Output<GetTargetResult> getTarget(GetTargetArgs args) {
        return getTarget(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Target.
     * 
     */
    public static CompletableFuture<GetTargetResult> getTargetPlain(GetTargetPlainArgs args) {
        return getTargetPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Target.
     * 
     */
    public static Output<GetTargetResult> getTarget(GetTargetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:clouddeploy/v1:getTarget", TypeShape.of(GetTargetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Target.
     * 
     */
    public static CompletableFuture<GetTargetResult> getTargetPlain(GetTargetPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:clouddeploy/v1:getTarget", TypeShape.of(GetTargetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetTargetIamPolicyResult> getTargetIamPolicy(GetTargetIamPolicyArgs args) {
        return getTargetIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetTargetIamPolicyResult> getTargetIamPolicyPlain(GetTargetIamPolicyPlainArgs args) {
        return getTargetIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetTargetIamPolicyResult> getTargetIamPolicy(GetTargetIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:clouddeploy/v1:getTargetIamPolicy", TypeShape.of(GetTargetIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetTargetIamPolicyResult> getTargetIamPolicyPlain(GetTargetIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:clouddeploy/v1:getTargetIamPolicy", TypeShape.of(GetTargetIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
