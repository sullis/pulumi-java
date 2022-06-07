// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.servicemanagement_v1.inputs.GetConfigArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.GetConfigPlainArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.GetRolloutArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.GetRolloutPlainArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.GetServiceArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.GetServiceConsumerIamPolicyArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.GetServiceConsumerIamPolicyPlainArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.GetServiceIamPolicyArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.GetServiceIamPolicyPlainArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.GetServicePlainArgs;
import com.pulumi.googlenative.servicemanagement_v1.outputs.GetConfigResult;
import com.pulumi.googlenative.servicemanagement_v1.outputs.GetRolloutResult;
import com.pulumi.googlenative.servicemanagement_v1.outputs.GetServiceConsumerIamPolicyResult;
import com.pulumi.googlenative.servicemanagement_v1.outputs.GetServiceIamPolicyResult;
import com.pulumi.googlenative.servicemanagement_v1.outputs.GetServiceResult;
import java.util.concurrent.CompletableFuture;

public final class Servicemanagement_v1Functions {
    /**
     * Gets a service configuration (version) for a managed service.
     * 
     */
    public static Output<GetConfigResult> getConfig(GetConfigArgs args) {
        return getConfig(args, InvokeOptions.Empty);
    }
    /**
     * Gets a service configuration (version) for a managed service.
     * 
     */
    public static CompletableFuture<GetConfigResult> getConfigPlain(GetConfigPlainArgs args) {
        return getConfigPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a service configuration (version) for a managed service.
     * 
     */
    public static Output<GetConfigResult> getConfig(GetConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:servicemanagement/v1:getConfig", TypeShape.of(GetConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a service configuration (version) for a managed service.
     * 
     */
    public static CompletableFuture<GetConfigResult> getConfigPlain(GetConfigPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:servicemanagement/v1:getConfig", TypeShape.of(GetConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a service configuration rollout.
     * 
     */
    public static Output<GetRolloutResult> getRollout(GetRolloutArgs args) {
        return getRollout(args, InvokeOptions.Empty);
    }
    /**
     * Gets a service configuration rollout.
     * 
     */
    public static CompletableFuture<GetRolloutResult> getRolloutPlain(GetRolloutPlainArgs args) {
        return getRolloutPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a service configuration rollout.
     * 
     */
    public static Output<GetRolloutResult> getRollout(GetRolloutArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:servicemanagement/v1:getRollout", TypeShape.of(GetRolloutResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a service configuration rollout.
     * 
     */
    public static CompletableFuture<GetRolloutResult> getRolloutPlain(GetRolloutPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:servicemanagement/v1:getRollout", TypeShape.of(GetRolloutResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a managed service. Authentication is required unless the service is public.
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args) {
        return getService(args, InvokeOptions.Empty);
    }
    /**
     * Gets a managed service. Authentication is required unless the service is public.
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain(GetServicePlainArgs args) {
        return getServicePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a managed service. Authentication is required unless the service is public.
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:servicemanagement/v1:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a managed service. Authentication is required unless the service is public.
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain(GetServicePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:servicemanagement/v1:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetServiceConsumerIamPolicyResult> getServiceConsumerIamPolicy(GetServiceConsumerIamPolicyArgs args) {
        return getServiceConsumerIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceConsumerIamPolicyResult> getServiceConsumerIamPolicyPlain(GetServiceConsumerIamPolicyPlainArgs args) {
        return getServiceConsumerIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetServiceConsumerIamPolicyResult> getServiceConsumerIamPolicy(GetServiceConsumerIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:servicemanagement/v1:getServiceConsumerIamPolicy", TypeShape.of(GetServiceConsumerIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceConsumerIamPolicyResult> getServiceConsumerIamPolicyPlain(GetServiceConsumerIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:servicemanagement/v1:getServiceConsumerIamPolicy", TypeShape.of(GetServiceConsumerIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetServiceIamPolicyResult> getServiceIamPolicy(GetServiceIamPolicyArgs args) {
        return getServiceIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceIamPolicyResult> getServiceIamPolicyPlain(GetServiceIamPolicyPlainArgs args) {
        return getServiceIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetServiceIamPolicyResult> getServiceIamPolicy(GetServiceIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:servicemanagement/v1:getServiceIamPolicy", TypeShape.of(GetServiceIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceIamPolicyResult> getServiceIamPolicyPlain(GetServiceIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:servicemanagement/v1:getServiceIamPolicy", TypeShape.of(GetServiceIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
