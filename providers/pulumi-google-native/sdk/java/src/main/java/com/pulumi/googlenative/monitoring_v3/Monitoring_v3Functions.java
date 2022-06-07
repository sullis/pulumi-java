// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.monitoring_v3.inputs.GetAlertPolicyArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.GetAlertPolicyPlainArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.GetGroupArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.GetGroupPlainArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.GetMetricDescriptorArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.GetMetricDescriptorPlainArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.GetNotificationChannelArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.GetNotificationChannelPlainArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.GetServiceArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.GetServiceLevelObjectiveArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.GetServiceLevelObjectivePlainArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.GetServicePlainArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.GetUptimeCheckConfigArgs;
import com.pulumi.googlenative.monitoring_v3.inputs.GetUptimeCheckConfigPlainArgs;
import com.pulumi.googlenative.monitoring_v3.outputs.GetAlertPolicyResult;
import com.pulumi.googlenative.monitoring_v3.outputs.GetGroupResult;
import com.pulumi.googlenative.monitoring_v3.outputs.GetMetricDescriptorResult;
import com.pulumi.googlenative.monitoring_v3.outputs.GetNotificationChannelResult;
import com.pulumi.googlenative.monitoring_v3.outputs.GetServiceLevelObjectiveResult;
import com.pulumi.googlenative.monitoring_v3.outputs.GetServiceResult;
import com.pulumi.googlenative.monitoring_v3.outputs.GetUptimeCheckConfigResult;
import java.util.concurrent.CompletableFuture;

public final class Monitoring_v3Functions {
    /**
     * Gets a single alerting policy.
     * 
     */
    public static Output<GetAlertPolicyResult> getAlertPolicy(GetAlertPolicyArgs args) {
        return getAlertPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets a single alerting policy.
     * 
     */
    public static CompletableFuture<GetAlertPolicyResult> getAlertPolicyPlain(GetAlertPolicyPlainArgs args) {
        return getAlertPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a single alerting policy.
     * 
     */
    public static Output<GetAlertPolicyResult> getAlertPolicy(GetAlertPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:monitoring/v3:getAlertPolicy", TypeShape.of(GetAlertPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a single alerting policy.
     * 
     */
    public static CompletableFuture<GetAlertPolicyResult> getAlertPolicyPlain(GetAlertPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:monitoring/v3:getAlertPolicy", TypeShape.of(GetAlertPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a single group.
     * 
     */
    public static Output<GetGroupResult> getGroup(GetGroupArgs args) {
        return getGroup(args, InvokeOptions.Empty);
    }
    /**
     * Gets a single group.
     * 
     */
    public static CompletableFuture<GetGroupResult> getGroupPlain(GetGroupPlainArgs args) {
        return getGroupPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a single group.
     * 
     */
    public static Output<GetGroupResult> getGroup(GetGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:monitoring/v3:getGroup", TypeShape.of(GetGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a single group.
     * 
     */
    public static CompletableFuture<GetGroupResult> getGroupPlain(GetGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:monitoring/v3:getGroup", TypeShape.of(GetGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a single metric descriptor.
     * 
     */
    public static Output<GetMetricDescriptorResult> getMetricDescriptor(GetMetricDescriptorArgs args) {
        return getMetricDescriptor(args, InvokeOptions.Empty);
    }
    /**
     * Gets a single metric descriptor.
     * 
     */
    public static CompletableFuture<GetMetricDescriptorResult> getMetricDescriptorPlain(GetMetricDescriptorPlainArgs args) {
        return getMetricDescriptorPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a single metric descriptor.
     * 
     */
    public static Output<GetMetricDescriptorResult> getMetricDescriptor(GetMetricDescriptorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:monitoring/v3:getMetricDescriptor", TypeShape.of(GetMetricDescriptorResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a single metric descriptor.
     * 
     */
    public static CompletableFuture<GetMetricDescriptorResult> getMetricDescriptorPlain(GetMetricDescriptorPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:monitoring/v3:getMetricDescriptor", TypeShape.of(GetMetricDescriptorResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a single notification channel. The channel includes the relevant configuration details with which the channel was created. However, the response may truncate or omit passwords, API keys, or other private key matter and thus the response may not be 100% identical to the information that was supplied in the call to the create method.
     * 
     */
    public static Output<GetNotificationChannelResult> getNotificationChannel(GetNotificationChannelArgs args) {
        return getNotificationChannel(args, InvokeOptions.Empty);
    }
    /**
     * Gets a single notification channel. The channel includes the relevant configuration details with which the channel was created. However, the response may truncate or omit passwords, API keys, or other private key matter and thus the response may not be 100% identical to the information that was supplied in the call to the create method.
     * 
     */
    public static CompletableFuture<GetNotificationChannelResult> getNotificationChannelPlain(GetNotificationChannelPlainArgs args) {
        return getNotificationChannelPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a single notification channel. The channel includes the relevant configuration details with which the channel was created. However, the response may truncate or omit passwords, API keys, or other private key matter and thus the response may not be 100% identical to the information that was supplied in the call to the create method.
     * 
     */
    public static Output<GetNotificationChannelResult> getNotificationChannel(GetNotificationChannelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:monitoring/v3:getNotificationChannel", TypeShape.of(GetNotificationChannelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a single notification channel. The channel includes the relevant configuration details with which the channel was created. However, the response may truncate or omit passwords, API keys, or other private key matter and thus the response may not be 100% identical to the information that was supplied in the call to the create method.
     * 
     */
    public static CompletableFuture<GetNotificationChannelResult> getNotificationChannelPlain(GetNotificationChannelPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:monitoring/v3:getNotificationChannel", TypeShape.of(GetNotificationChannelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get the named Service.
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args) {
        return getService(args, InvokeOptions.Empty);
    }
    /**
     * Get the named Service.
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain(GetServicePlainArgs args) {
        return getServicePlain(args, InvokeOptions.Empty);
    }
    /**
     * Get the named Service.
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:monitoring/v3:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get the named Service.
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain(GetServicePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:monitoring/v3:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a ServiceLevelObjective by name.
     * 
     */
    public static Output<GetServiceLevelObjectiveResult> getServiceLevelObjective(GetServiceLevelObjectiveArgs args) {
        return getServiceLevelObjective(args, InvokeOptions.Empty);
    }
    /**
     * Get a ServiceLevelObjective by name.
     * 
     */
    public static CompletableFuture<GetServiceLevelObjectiveResult> getServiceLevelObjectivePlain(GetServiceLevelObjectivePlainArgs args) {
        return getServiceLevelObjectivePlain(args, InvokeOptions.Empty);
    }
    /**
     * Get a ServiceLevelObjective by name.
     * 
     */
    public static Output<GetServiceLevelObjectiveResult> getServiceLevelObjective(GetServiceLevelObjectiveArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:monitoring/v3:getServiceLevelObjective", TypeShape.of(GetServiceLevelObjectiveResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a ServiceLevelObjective by name.
     * 
     */
    public static CompletableFuture<GetServiceLevelObjectiveResult> getServiceLevelObjectivePlain(GetServiceLevelObjectivePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:monitoring/v3:getServiceLevelObjective", TypeShape.of(GetServiceLevelObjectiveResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a single Uptime check configuration.
     * 
     */
    public static Output<GetUptimeCheckConfigResult> getUptimeCheckConfig(GetUptimeCheckConfigArgs args) {
        return getUptimeCheckConfig(args, InvokeOptions.Empty);
    }
    /**
     * Gets a single Uptime check configuration.
     * 
     */
    public static CompletableFuture<GetUptimeCheckConfigResult> getUptimeCheckConfigPlain(GetUptimeCheckConfigPlainArgs args) {
        return getUptimeCheckConfigPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a single Uptime check configuration.
     * 
     */
    public static Output<GetUptimeCheckConfigResult> getUptimeCheckConfig(GetUptimeCheckConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:monitoring/v3:getUptimeCheckConfig", TypeShape.of(GetUptimeCheckConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a single Uptime check configuration.
     * 
     */
    public static CompletableFuture<GetUptimeCheckConfigResult> getUptimeCheckConfigPlain(GetUptimeCheckConfigPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:monitoring/v3:getUptimeCheckConfig", TypeShape.of(GetUptimeCheckConfigResult.class), args, Utilities.withVersion(options));
    }
}
