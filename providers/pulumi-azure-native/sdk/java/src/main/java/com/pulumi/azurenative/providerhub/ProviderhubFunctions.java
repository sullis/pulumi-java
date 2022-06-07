// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.providerhub.inputs.GetDefaultRolloutArgs;
import com.pulumi.azurenative.providerhub.inputs.GetDefaultRolloutPlainArgs;
import com.pulumi.azurenative.providerhub.inputs.GetNotificationRegistrationArgs;
import com.pulumi.azurenative.providerhub.inputs.GetNotificationRegistrationPlainArgs;
import com.pulumi.azurenative.providerhub.inputs.GetProviderRegistrationArgs;
import com.pulumi.azurenative.providerhub.inputs.GetProviderRegistrationPlainArgs;
import com.pulumi.azurenative.providerhub.inputs.GetResourceTypeRegistrationArgs;
import com.pulumi.azurenative.providerhub.inputs.GetResourceTypeRegistrationPlainArgs;
import com.pulumi.azurenative.providerhub.inputs.GetSkusArgs;
import com.pulumi.azurenative.providerhub.inputs.GetSkusNestedResourceTypeFirstArgs;
import com.pulumi.azurenative.providerhub.inputs.GetSkusNestedResourceTypeFirstPlainArgs;
import com.pulumi.azurenative.providerhub.inputs.GetSkusNestedResourceTypeSecondArgs;
import com.pulumi.azurenative.providerhub.inputs.GetSkusNestedResourceTypeSecondPlainArgs;
import com.pulumi.azurenative.providerhub.inputs.GetSkusNestedResourceTypeThirdArgs;
import com.pulumi.azurenative.providerhub.inputs.GetSkusNestedResourceTypeThirdPlainArgs;
import com.pulumi.azurenative.providerhub.inputs.GetSkusPlainArgs;
import com.pulumi.azurenative.providerhub.outputs.GetDefaultRolloutResult;
import com.pulumi.azurenative.providerhub.outputs.GetNotificationRegistrationResult;
import com.pulumi.azurenative.providerhub.outputs.GetProviderRegistrationResult;
import com.pulumi.azurenative.providerhub.outputs.GetResourceTypeRegistrationResult;
import com.pulumi.azurenative.providerhub.outputs.GetSkusNestedResourceTypeFirstResult;
import com.pulumi.azurenative.providerhub.outputs.GetSkusNestedResourceTypeSecondResult;
import com.pulumi.azurenative.providerhub.outputs.GetSkusNestedResourceTypeThirdResult;
import com.pulumi.azurenative.providerhub.outputs.GetSkusResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ProviderhubFunctions {
    /**
     * Default rollout definition.
     * API Version: 2020-11-20.
     * 
     */
    public static Output<GetDefaultRolloutResult> getDefaultRollout(GetDefaultRolloutArgs args) {
        return getDefaultRollout(args, InvokeOptions.Empty);
    }
    /**
     * Default rollout definition.
     * API Version: 2020-11-20.
     * 
     */
    public static CompletableFuture<GetDefaultRolloutResult> getDefaultRolloutPlain(GetDefaultRolloutPlainArgs args) {
        return getDefaultRolloutPlain(args, InvokeOptions.Empty);
    }
    /**
     * Default rollout definition.
     * API Version: 2020-11-20.
     * 
     */
    public static Output<GetDefaultRolloutResult> getDefaultRollout(GetDefaultRolloutArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:providerhub:getDefaultRollout", TypeShape.of(GetDefaultRolloutResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Default rollout definition.
     * API Version: 2020-11-20.
     * 
     */
    public static CompletableFuture<GetDefaultRolloutResult> getDefaultRolloutPlain(GetDefaultRolloutPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:providerhub:getDefaultRollout", TypeShape.of(GetDefaultRolloutResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The notification registration definition.
     * API Version: 2020-11-20.
     * 
     */
    public static Output<GetNotificationRegistrationResult> getNotificationRegistration(GetNotificationRegistrationArgs args) {
        return getNotificationRegistration(args, InvokeOptions.Empty);
    }
    /**
     * The notification registration definition.
     * API Version: 2020-11-20.
     * 
     */
    public static CompletableFuture<GetNotificationRegistrationResult> getNotificationRegistrationPlain(GetNotificationRegistrationPlainArgs args) {
        return getNotificationRegistrationPlain(args, InvokeOptions.Empty);
    }
    /**
     * The notification registration definition.
     * API Version: 2020-11-20.
     * 
     */
    public static Output<GetNotificationRegistrationResult> getNotificationRegistration(GetNotificationRegistrationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:providerhub:getNotificationRegistration", TypeShape.of(GetNotificationRegistrationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The notification registration definition.
     * API Version: 2020-11-20.
     * 
     */
    public static CompletableFuture<GetNotificationRegistrationResult> getNotificationRegistrationPlain(GetNotificationRegistrationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:providerhub:getNotificationRegistration", TypeShape.of(GetNotificationRegistrationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static Output<GetProviderRegistrationResult> getProviderRegistration(GetProviderRegistrationArgs args) {
        return getProviderRegistration(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static CompletableFuture<GetProviderRegistrationResult> getProviderRegistrationPlain(GetProviderRegistrationPlainArgs args) {
        return getProviderRegistrationPlain(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static Output<GetProviderRegistrationResult> getProviderRegistration(GetProviderRegistrationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:providerhub:getProviderRegistration", TypeShape.of(GetProviderRegistrationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static CompletableFuture<GetProviderRegistrationResult> getProviderRegistrationPlain(GetProviderRegistrationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:providerhub:getProviderRegistration", TypeShape.of(GetProviderRegistrationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static Output<GetResourceTypeRegistrationResult> getResourceTypeRegistration(GetResourceTypeRegistrationArgs args) {
        return getResourceTypeRegistration(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static CompletableFuture<GetResourceTypeRegistrationResult> getResourceTypeRegistrationPlain(GetResourceTypeRegistrationPlainArgs args) {
        return getResourceTypeRegistrationPlain(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static Output<GetResourceTypeRegistrationResult> getResourceTypeRegistration(GetResourceTypeRegistrationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:providerhub:getResourceTypeRegistration", TypeShape.of(GetResourceTypeRegistrationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static CompletableFuture<GetResourceTypeRegistrationResult> getResourceTypeRegistrationPlain(GetResourceTypeRegistrationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:providerhub:getResourceTypeRegistration", TypeShape.of(GetResourceTypeRegistrationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static Output<GetSkusResult> getSkus(GetSkusArgs args) {
        return getSkus(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static CompletableFuture<GetSkusResult> getSkusPlain(GetSkusPlainArgs args) {
        return getSkusPlain(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static Output<GetSkusResult> getSkus(GetSkusArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:providerhub:getSkus", TypeShape.of(GetSkusResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static CompletableFuture<GetSkusResult> getSkusPlain(GetSkusPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:providerhub:getSkus", TypeShape.of(GetSkusResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static Output<GetSkusNestedResourceTypeFirstResult> getSkusNestedResourceTypeFirst(GetSkusNestedResourceTypeFirstArgs args) {
        return getSkusNestedResourceTypeFirst(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static CompletableFuture<GetSkusNestedResourceTypeFirstResult> getSkusNestedResourceTypeFirstPlain(GetSkusNestedResourceTypeFirstPlainArgs args) {
        return getSkusNestedResourceTypeFirstPlain(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static Output<GetSkusNestedResourceTypeFirstResult> getSkusNestedResourceTypeFirst(GetSkusNestedResourceTypeFirstArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:providerhub:getSkusNestedResourceTypeFirst", TypeShape.of(GetSkusNestedResourceTypeFirstResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static CompletableFuture<GetSkusNestedResourceTypeFirstResult> getSkusNestedResourceTypeFirstPlain(GetSkusNestedResourceTypeFirstPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:providerhub:getSkusNestedResourceTypeFirst", TypeShape.of(GetSkusNestedResourceTypeFirstResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static Output<GetSkusNestedResourceTypeSecondResult> getSkusNestedResourceTypeSecond(GetSkusNestedResourceTypeSecondArgs args) {
        return getSkusNestedResourceTypeSecond(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static CompletableFuture<GetSkusNestedResourceTypeSecondResult> getSkusNestedResourceTypeSecondPlain(GetSkusNestedResourceTypeSecondPlainArgs args) {
        return getSkusNestedResourceTypeSecondPlain(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static Output<GetSkusNestedResourceTypeSecondResult> getSkusNestedResourceTypeSecond(GetSkusNestedResourceTypeSecondArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:providerhub:getSkusNestedResourceTypeSecond", TypeShape.of(GetSkusNestedResourceTypeSecondResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static CompletableFuture<GetSkusNestedResourceTypeSecondResult> getSkusNestedResourceTypeSecondPlain(GetSkusNestedResourceTypeSecondPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:providerhub:getSkusNestedResourceTypeSecond", TypeShape.of(GetSkusNestedResourceTypeSecondResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static Output<GetSkusNestedResourceTypeThirdResult> getSkusNestedResourceTypeThird(GetSkusNestedResourceTypeThirdArgs args) {
        return getSkusNestedResourceTypeThird(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static CompletableFuture<GetSkusNestedResourceTypeThirdResult> getSkusNestedResourceTypeThirdPlain(GetSkusNestedResourceTypeThirdPlainArgs args) {
        return getSkusNestedResourceTypeThirdPlain(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static Output<GetSkusNestedResourceTypeThirdResult> getSkusNestedResourceTypeThird(GetSkusNestedResourceTypeThirdArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:providerhub:getSkusNestedResourceTypeThird", TypeShape.of(GetSkusNestedResourceTypeThirdResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-11-20.
     * 
     */
    public static CompletableFuture<GetSkusNestedResourceTypeThirdResult> getSkusNestedResourceTypeThirdPlain(GetSkusNestedResourceTypeThirdPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:providerhub:getSkusNestedResourceTypeThird", TypeShape.of(GetSkusNestedResourceTypeThirdResult.class), args, Utilities.withVersion(options));
    }
}
