// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.authorization.inputs.GetAccessReviewHistoryDefinitionByIdArgs;
import com.pulumi.azurenative.authorization.inputs.GetAccessReviewHistoryDefinitionByIdPlainArgs;
import com.pulumi.azurenative.authorization.inputs.GetAccessReviewScheduleDefinitionByIdArgs;
import com.pulumi.azurenative.authorization.inputs.GetAccessReviewScheduleDefinitionByIdPlainArgs;
import com.pulumi.azurenative.authorization.inputs.GetClientTokenArgs;
import com.pulumi.azurenative.authorization.inputs.GetClientTokenPlainArgs;
import com.pulumi.azurenative.authorization.inputs.GetManagementLockAtResourceGroupLevelArgs;
import com.pulumi.azurenative.authorization.inputs.GetManagementLockAtResourceGroupLevelPlainArgs;
import com.pulumi.azurenative.authorization.inputs.GetManagementLockAtResourceLevelArgs;
import com.pulumi.azurenative.authorization.inputs.GetManagementLockAtResourceLevelPlainArgs;
import com.pulumi.azurenative.authorization.inputs.GetManagementLockAtSubscriptionLevelArgs;
import com.pulumi.azurenative.authorization.inputs.GetManagementLockAtSubscriptionLevelPlainArgs;
import com.pulumi.azurenative.authorization.inputs.GetManagementLockByScopeArgs;
import com.pulumi.azurenative.authorization.inputs.GetManagementLockByScopePlainArgs;
import com.pulumi.azurenative.authorization.inputs.GetPolicyAssignmentArgs;
import com.pulumi.azurenative.authorization.inputs.GetPolicyAssignmentPlainArgs;
import com.pulumi.azurenative.authorization.inputs.GetPolicyDefinitionArgs;
import com.pulumi.azurenative.authorization.inputs.GetPolicyDefinitionAtManagementGroupArgs;
import com.pulumi.azurenative.authorization.inputs.GetPolicyDefinitionAtManagementGroupPlainArgs;
import com.pulumi.azurenative.authorization.inputs.GetPolicyDefinitionPlainArgs;
import com.pulumi.azurenative.authorization.inputs.GetPolicyExemptionArgs;
import com.pulumi.azurenative.authorization.inputs.GetPolicyExemptionPlainArgs;
import com.pulumi.azurenative.authorization.inputs.GetPolicySetDefinitionArgs;
import com.pulumi.azurenative.authorization.inputs.GetPolicySetDefinitionAtManagementGroupArgs;
import com.pulumi.azurenative.authorization.inputs.GetPolicySetDefinitionAtManagementGroupPlainArgs;
import com.pulumi.azurenative.authorization.inputs.GetPolicySetDefinitionPlainArgs;
import com.pulumi.azurenative.authorization.inputs.GetPrivateLinkAssociationArgs;
import com.pulumi.azurenative.authorization.inputs.GetPrivateLinkAssociationPlainArgs;
import com.pulumi.azurenative.authorization.inputs.GetResourceManagementPrivateLinkArgs;
import com.pulumi.azurenative.authorization.inputs.GetResourceManagementPrivateLinkPlainArgs;
import com.pulumi.azurenative.authorization.inputs.GetRoleAssignmentArgs;
import com.pulumi.azurenative.authorization.inputs.GetRoleAssignmentPlainArgs;
import com.pulumi.azurenative.authorization.inputs.GetRoleDefinitionArgs;
import com.pulumi.azurenative.authorization.inputs.GetRoleDefinitionPlainArgs;
import com.pulumi.azurenative.authorization.inputs.GetRoleManagementPolicyAssignmentArgs;
import com.pulumi.azurenative.authorization.inputs.GetRoleManagementPolicyAssignmentPlainArgs;
import com.pulumi.azurenative.authorization.outputs.GetAccessReviewHistoryDefinitionByIdResult;
import com.pulumi.azurenative.authorization.outputs.GetAccessReviewScheduleDefinitionByIdResult;
import com.pulumi.azurenative.authorization.outputs.GetClientConfigResult;
import com.pulumi.azurenative.authorization.outputs.GetClientTokenResult;
import com.pulumi.azurenative.authorization.outputs.GetManagementLockAtResourceGroupLevelResult;
import com.pulumi.azurenative.authorization.outputs.GetManagementLockAtResourceLevelResult;
import com.pulumi.azurenative.authorization.outputs.GetManagementLockAtSubscriptionLevelResult;
import com.pulumi.azurenative.authorization.outputs.GetManagementLockByScopeResult;
import com.pulumi.azurenative.authorization.outputs.GetPolicyAssignmentResult;
import com.pulumi.azurenative.authorization.outputs.GetPolicyDefinitionAtManagementGroupResult;
import com.pulumi.azurenative.authorization.outputs.GetPolicyDefinitionResult;
import com.pulumi.azurenative.authorization.outputs.GetPolicyExemptionResult;
import com.pulumi.azurenative.authorization.outputs.GetPolicySetDefinitionAtManagementGroupResult;
import com.pulumi.azurenative.authorization.outputs.GetPolicySetDefinitionResult;
import com.pulumi.azurenative.authorization.outputs.GetPrivateLinkAssociationResult;
import com.pulumi.azurenative.authorization.outputs.GetResourceManagementPrivateLinkResult;
import com.pulumi.azurenative.authorization.outputs.GetRoleAssignmentResult;
import com.pulumi.azurenative.authorization.outputs.GetRoleDefinitionResult;
import com.pulumi.azurenative.authorization.outputs.GetRoleManagementPolicyAssignmentResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class AuthorizationFunctions {
    /**
     * Access Review History Definition.
     * API Version: 2021-11-16-preview.
     * 
     */
    public static Output<GetAccessReviewHistoryDefinitionByIdResult> getAccessReviewHistoryDefinitionById(GetAccessReviewHistoryDefinitionByIdArgs args) {
        return getAccessReviewHistoryDefinitionById(args, InvokeOptions.Empty);
    }
    /**
     * Access Review History Definition.
     * API Version: 2021-11-16-preview.
     * 
     */
    public static CompletableFuture<GetAccessReviewHistoryDefinitionByIdResult> getAccessReviewHistoryDefinitionByIdPlain(GetAccessReviewHistoryDefinitionByIdPlainArgs args) {
        return getAccessReviewHistoryDefinitionByIdPlain(args, InvokeOptions.Empty);
    }
    /**
     * Access Review History Definition.
     * API Version: 2021-11-16-preview.
     * 
     */
    public static Output<GetAccessReviewHistoryDefinitionByIdResult> getAccessReviewHistoryDefinitionById(GetAccessReviewHistoryDefinitionByIdArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getAccessReviewHistoryDefinitionById", TypeShape.of(GetAccessReviewHistoryDefinitionByIdResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Access Review History Definition.
     * API Version: 2021-11-16-preview.
     * 
     */
    public static CompletableFuture<GetAccessReviewHistoryDefinitionByIdResult> getAccessReviewHistoryDefinitionByIdPlain(GetAccessReviewHistoryDefinitionByIdPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getAccessReviewHistoryDefinitionById", TypeShape.of(GetAccessReviewHistoryDefinitionByIdResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Access Review Schedule Definition.
     * API Version: 2021-03-01-preview.
     * 
     */
    public static Output<GetAccessReviewScheduleDefinitionByIdResult> getAccessReviewScheduleDefinitionById(GetAccessReviewScheduleDefinitionByIdArgs args) {
        return getAccessReviewScheduleDefinitionById(args, InvokeOptions.Empty);
    }
    /**
     * Access Review Schedule Definition.
     * API Version: 2021-03-01-preview.
     * 
     */
    public static CompletableFuture<GetAccessReviewScheduleDefinitionByIdResult> getAccessReviewScheduleDefinitionByIdPlain(GetAccessReviewScheduleDefinitionByIdPlainArgs args) {
        return getAccessReviewScheduleDefinitionByIdPlain(args, InvokeOptions.Empty);
    }
    /**
     * Access Review Schedule Definition.
     * API Version: 2021-03-01-preview.
     * 
     */
    public static Output<GetAccessReviewScheduleDefinitionByIdResult> getAccessReviewScheduleDefinitionById(GetAccessReviewScheduleDefinitionByIdArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getAccessReviewScheduleDefinitionById", TypeShape.of(GetAccessReviewScheduleDefinitionByIdResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Access Review Schedule Definition.
     * API Version: 2021-03-01-preview.
     * 
     */
    public static CompletableFuture<GetAccessReviewScheduleDefinitionByIdResult> getAccessReviewScheduleDefinitionByIdPlain(GetAccessReviewScheduleDefinitionByIdPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getAccessReviewScheduleDefinitionById", TypeShape.of(GetAccessReviewScheduleDefinitionByIdResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this function to access the current configuration of the native Azure provider.
     * 
     */
    public static Output<GetClientConfigResult> getClientConfig() {
        return getClientConfig(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this function to access the current configuration of the native Azure provider.
     * 
     */
    public static CompletableFuture<GetClientConfigResult> getClientConfigPlain() {
        return getClientConfigPlain(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this function to access the current configuration of the native Azure provider.
     * 
     */
    public static Output<GetClientConfigResult> getClientConfig(InvokeArgs args) {
        return getClientConfig(args, InvokeOptions.Empty);
    }
    /**
     * Use this function to access the current configuration of the native Azure provider.
     * 
     */
    public static CompletableFuture<GetClientConfigResult> getClientConfigPlain(InvokeArgs args) {
        return getClientConfigPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this function to access the current configuration of the native Azure provider.
     * 
     */
    public static Output<GetClientConfigResult> getClientConfig(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getClientConfig", TypeShape.of(GetClientConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this function to access the current configuration of the native Azure provider.
     * 
     */
    public static CompletableFuture<GetClientConfigResult> getClientConfigPlain(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getClientConfig", TypeShape.of(GetClientConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this function to get an Azure authentication token for the current login context.
     * 
     */
    public static Output<GetClientTokenResult> getClientToken() {
        return getClientToken(GetClientTokenArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this function to get an Azure authentication token for the current login context.
     * 
     */
    public static CompletableFuture<GetClientTokenResult> getClientTokenPlain() {
        return getClientTokenPlain(GetClientTokenPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this function to get an Azure authentication token for the current login context.
     * 
     */
    public static Output<GetClientTokenResult> getClientToken(GetClientTokenArgs args) {
        return getClientToken(args, InvokeOptions.Empty);
    }
    /**
     * Use this function to get an Azure authentication token for the current login context.
     * 
     */
    public static CompletableFuture<GetClientTokenResult> getClientTokenPlain(GetClientTokenPlainArgs args) {
        return getClientTokenPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this function to get an Azure authentication token for the current login context.
     * 
     */
    public static Output<GetClientTokenResult> getClientToken(GetClientTokenArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getClientToken", TypeShape.of(GetClientTokenResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this function to get an Azure authentication token for the current login context.
     * 
     */
    public static CompletableFuture<GetClientTokenResult> getClientTokenPlain(GetClientTokenPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getClientToken", TypeShape.of(GetClientTokenResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The lock information.
     * API Version: 2017-04-01.
     * 
     */
    public static Output<GetManagementLockAtResourceGroupLevelResult> getManagementLockAtResourceGroupLevel(GetManagementLockAtResourceGroupLevelArgs args) {
        return getManagementLockAtResourceGroupLevel(args, InvokeOptions.Empty);
    }
    /**
     * The lock information.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetManagementLockAtResourceGroupLevelResult> getManagementLockAtResourceGroupLevelPlain(GetManagementLockAtResourceGroupLevelPlainArgs args) {
        return getManagementLockAtResourceGroupLevelPlain(args, InvokeOptions.Empty);
    }
    /**
     * The lock information.
     * API Version: 2017-04-01.
     * 
     */
    public static Output<GetManagementLockAtResourceGroupLevelResult> getManagementLockAtResourceGroupLevel(GetManagementLockAtResourceGroupLevelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getManagementLockAtResourceGroupLevel", TypeShape.of(GetManagementLockAtResourceGroupLevelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The lock information.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetManagementLockAtResourceGroupLevelResult> getManagementLockAtResourceGroupLevelPlain(GetManagementLockAtResourceGroupLevelPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getManagementLockAtResourceGroupLevel", TypeShape.of(GetManagementLockAtResourceGroupLevelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The lock information.
     * API Version: 2017-04-01.
     * 
     */
    public static Output<GetManagementLockAtResourceLevelResult> getManagementLockAtResourceLevel(GetManagementLockAtResourceLevelArgs args) {
        return getManagementLockAtResourceLevel(args, InvokeOptions.Empty);
    }
    /**
     * The lock information.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetManagementLockAtResourceLevelResult> getManagementLockAtResourceLevelPlain(GetManagementLockAtResourceLevelPlainArgs args) {
        return getManagementLockAtResourceLevelPlain(args, InvokeOptions.Empty);
    }
    /**
     * The lock information.
     * API Version: 2017-04-01.
     * 
     */
    public static Output<GetManagementLockAtResourceLevelResult> getManagementLockAtResourceLevel(GetManagementLockAtResourceLevelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getManagementLockAtResourceLevel", TypeShape.of(GetManagementLockAtResourceLevelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The lock information.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetManagementLockAtResourceLevelResult> getManagementLockAtResourceLevelPlain(GetManagementLockAtResourceLevelPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getManagementLockAtResourceLevel", TypeShape.of(GetManagementLockAtResourceLevelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The lock information.
     * API Version: 2017-04-01.
     * 
     */
    public static Output<GetManagementLockAtSubscriptionLevelResult> getManagementLockAtSubscriptionLevel(GetManagementLockAtSubscriptionLevelArgs args) {
        return getManagementLockAtSubscriptionLevel(args, InvokeOptions.Empty);
    }
    /**
     * The lock information.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetManagementLockAtSubscriptionLevelResult> getManagementLockAtSubscriptionLevelPlain(GetManagementLockAtSubscriptionLevelPlainArgs args) {
        return getManagementLockAtSubscriptionLevelPlain(args, InvokeOptions.Empty);
    }
    /**
     * The lock information.
     * API Version: 2017-04-01.
     * 
     */
    public static Output<GetManagementLockAtSubscriptionLevelResult> getManagementLockAtSubscriptionLevel(GetManagementLockAtSubscriptionLevelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getManagementLockAtSubscriptionLevel", TypeShape.of(GetManagementLockAtSubscriptionLevelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The lock information.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetManagementLockAtSubscriptionLevelResult> getManagementLockAtSubscriptionLevelPlain(GetManagementLockAtSubscriptionLevelPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getManagementLockAtSubscriptionLevel", TypeShape.of(GetManagementLockAtSubscriptionLevelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The lock information.
     * API Version: 2017-04-01.
     * 
     */
    public static Output<GetManagementLockByScopeResult> getManagementLockByScope(GetManagementLockByScopeArgs args) {
        return getManagementLockByScope(args, InvokeOptions.Empty);
    }
    /**
     * The lock information.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetManagementLockByScopeResult> getManagementLockByScopePlain(GetManagementLockByScopePlainArgs args) {
        return getManagementLockByScopePlain(args, InvokeOptions.Empty);
    }
    /**
     * The lock information.
     * API Version: 2017-04-01.
     * 
     */
    public static Output<GetManagementLockByScopeResult> getManagementLockByScope(GetManagementLockByScopeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getManagementLockByScope", TypeShape.of(GetManagementLockByScopeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The lock information.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetManagementLockByScopeResult> getManagementLockByScopePlain(GetManagementLockByScopePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getManagementLockByScope", TypeShape.of(GetManagementLockByScopeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The policy assignment.
     * API Version: 2020-09-01.
     * 
     */
    public static Output<GetPolicyAssignmentResult> getPolicyAssignment(GetPolicyAssignmentArgs args) {
        return getPolicyAssignment(args, InvokeOptions.Empty);
    }
    /**
     * The policy assignment.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetPolicyAssignmentResult> getPolicyAssignmentPlain(GetPolicyAssignmentPlainArgs args) {
        return getPolicyAssignmentPlain(args, InvokeOptions.Empty);
    }
    /**
     * The policy assignment.
     * API Version: 2020-09-01.
     * 
     */
    public static Output<GetPolicyAssignmentResult> getPolicyAssignment(GetPolicyAssignmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getPolicyAssignment", TypeShape.of(GetPolicyAssignmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The policy assignment.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetPolicyAssignmentResult> getPolicyAssignmentPlain(GetPolicyAssignmentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getPolicyAssignment", TypeShape.of(GetPolicyAssignmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The policy definition.
     * API Version: 2020-09-01.
     * 
     */
    public static Output<GetPolicyDefinitionResult> getPolicyDefinition(GetPolicyDefinitionArgs args) {
        return getPolicyDefinition(args, InvokeOptions.Empty);
    }
    /**
     * The policy definition.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetPolicyDefinitionResult> getPolicyDefinitionPlain(GetPolicyDefinitionPlainArgs args) {
        return getPolicyDefinitionPlain(args, InvokeOptions.Empty);
    }
    /**
     * The policy definition.
     * API Version: 2020-09-01.
     * 
     */
    public static Output<GetPolicyDefinitionResult> getPolicyDefinition(GetPolicyDefinitionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getPolicyDefinition", TypeShape.of(GetPolicyDefinitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The policy definition.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetPolicyDefinitionResult> getPolicyDefinitionPlain(GetPolicyDefinitionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getPolicyDefinition", TypeShape.of(GetPolicyDefinitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The policy definition.
     * API Version: 2020-09-01.
     * 
     */
    public static Output<GetPolicyDefinitionAtManagementGroupResult> getPolicyDefinitionAtManagementGroup(GetPolicyDefinitionAtManagementGroupArgs args) {
        return getPolicyDefinitionAtManagementGroup(args, InvokeOptions.Empty);
    }
    /**
     * The policy definition.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetPolicyDefinitionAtManagementGroupResult> getPolicyDefinitionAtManagementGroupPlain(GetPolicyDefinitionAtManagementGroupPlainArgs args) {
        return getPolicyDefinitionAtManagementGroupPlain(args, InvokeOptions.Empty);
    }
    /**
     * The policy definition.
     * API Version: 2020-09-01.
     * 
     */
    public static Output<GetPolicyDefinitionAtManagementGroupResult> getPolicyDefinitionAtManagementGroup(GetPolicyDefinitionAtManagementGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getPolicyDefinitionAtManagementGroup", TypeShape.of(GetPolicyDefinitionAtManagementGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The policy definition.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetPolicyDefinitionAtManagementGroupResult> getPolicyDefinitionAtManagementGroupPlain(GetPolicyDefinitionAtManagementGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getPolicyDefinitionAtManagementGroup", TypeShape.of(GetPolicyDefinitionAtManagementGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The policy exemption.
     * API Version: 2020-07-01-preview.
     * 
     */
    public static Output<GetPolicyExemptionResult> getPolicyExemption(GetPolicyExemptionArgs args) {
        return getPolicyExemption(args, InvokeOptions.Empty);
    }
    /**
     * The policy exemption.
     * API Version: 2020-07-01-preview.
     * 
     */
    public static CompletableFuture<GetPolicyExemptionResult> getPolicyExemptionPlain(GetPolicyExemptionPlainArgs args) {
        return getPolicyExemptionPlain(args, InvokeOptions.Empty);
    }
    /**
     * The policy exemption.
     * API Version: 2020-07-01-preview.
     * 
     */
    public static Output<GetPolicyExemptionResult> getPolicyExemption(GetPolicyExemptionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getPolicyExemption", TypeShape.of(GetPolicyExemptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The policy exemption.
     * API Version: 2020-07-01-preview.
     * 
     */
    public static CompletableFuture<GetPolicyExemptionResult> getPolicyExemptionPlain(GetPolicyExemptionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getPolicyExemption", TypeShape.of(GetPolicyExemptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The policy set definition.
     * API Version: 2020-09-01.
     * 
     */
    public static Output<GetPolicySetDefinitionResult> getPolicySetDefinition(GetPolicySetDefinitionArgs args) {
        return getPolicySetDefinition(args, InvokeOptions.Empty);
    }
    /**
     * The policy set definition.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetPolicySetDefinitionResult> getPolicySetDefinitionPlain(GetPolicySetDefinitionPlainArgs args) {
        return getPolicySetDefinitionPlain(args, InvokeOptions.Empty);
    }
    /**
     * The policy set definition.
     * API Version: 2020-09-01.
     * 
     */
    public static Output<GetPolicySetDefinitionResult> getPolicySetDefinition(GetPolicySetDefinitionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getPolicySetDefinition", TypeShape.of(GetPolicySetDefinitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The policy set definition.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetPolicySetDefinitionResult> getPolicySetDefinitionPlain(GetPolicySetDefinitionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getPolicySetDefinition", TypeShape.of(GetPolicySetDefinitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The policy set definition.
     * API Version: 2020-09-01.
     * 
     */
    public static Output<GetPolicySetDefinitionAtManagementGroupResult> getPolicySetDefinitionAtManagementGroup(GetPolicySetDefinitionAtManagementGroupArgs args) {
        return getPolicySetDefinitionAtManagementGroup(args, InvokeOptions.Empty);
    }
    /**
     * The policy set definition.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetPolicySetDefinitionAtManagementGroupResult> getPolicySetDefinitionAtManagementGroupPlain(GetPolicySetDefinitionAtManagementGroupPlainArgs args) {
        return getPolicySetDefinitionAtManagementGroupPlain(args, InvokeOptions.Empty);
    }
    /**
     * The policy set definition.
     * API Version: 2020-09-01.
     * 
     */
    public static Output<GetPolicySetDefinitionAtManagementGroupResult> getPolicySetDefinitionAtManagementGroup(GetPolicySetDefinitionAtManagementGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getPolicySetDefinitionAtManagementGroup", TypeShape.of(GetPolicySetDefinitionAtManagementGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The policy set definition.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetPolicySetDefinitionAtManagementGroupResult> getPolicySetDefinitionAtManagementGroupPlain(GetPolicySetDefinitionAtManagementGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getPolicySetDefinitionAtManagementGroup", TypeShape.of(GetPolicySetDefinitionAtManagementGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-05-01.
     * 
     */
    public static Output<GetPrivateLinkAssociationResult> getPrivateLinkAssociation(GetPrivateLinkAssociationArgs args) {
        return getPrivateLinkAssociation(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetPrivateLinkAssociationResult> getPrivateLinkAssociationPlain(GetPrivateLinkAssociationPlainArgs args) {
        return getPrivateLinkAssociationPlain(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2020-05-01.
     * 
     */
    public static Output<GetPrivateLinkAssociationResult> getPrivateLinkAssociation(GetPrivateLinkAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getPrivateLinkAssociation", TypeShape.of(GetPrivateLinkAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetPrivateLinkAssociationResult> getPrivateLinkAssociationPlain(GetPrivateLinkAssociationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getPrivateLinkAssociation", TypeShape.of(GetPrivateLinkAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-05-01.
     * 
     */
    public static Output<GetResourceManagementPrivateLinkResult> getResourceManagementPrivateLink(GetResourceManagementPrivateLinkArgs args) {
        return getResourceManagementPrivateLink(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetResourceManagementPrivateLinkResult> getResourceManagementPrivateLinkPlain(GetResourceManagementPrivateLinkPlainArgs args) {
        return getResourceManagementPrivateLinkPlain(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2020-05-01.
     * 
     */
    public static Output<GetResourceManagementPrivateLinkResult> getResourceManagementPrivateLink(GetResourceManagementPrivateLinkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getResourceManagementPrivateLink", TypeShape.of(GetResourceManagementPrivateLinkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetResourceManagementPrivateLinkResult> getResourceManagementPrivateLinkPlain(GetResourceManagementPrivateLinkPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getResourceManagementPrivateLink", TypeShape.of(GetResourceManagementPrivateLinkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Role Assignments
     * API Version: 2020-10-01-preview.
     * 
     */
    public static Output<GetRoleAssignmentResult> getRoleAssignment(GetRoleAssignmentArgs args) {
        return getRoleAssignment(args, InvokeOptions.Empty);
    }
    /**
     * Role Assignments
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetRoleAssignmentResult> getRoleAssignmentPlain(GetRoleAssignmentPlainArgs args) {
        return getRoleAssignmentPlain(args, InvokeOptions.Empty);
    }
    /**
     * Role Assignments
     * API Version: 2020-10-01-preview.
     * 
     */
    public static Output<GetRoleAssignmentResult> getRoleAssignment(GetRoleAssignmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getRoleAssignment", TypeShape.of(GetRoleAssignmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Role Assignments
     * API Version: 2020-10-01-preview.
     * 
     */
    public static CompletableFuture<GetRoleAssignmentResult> getRoleAssignmentPlain(GetRoleAssignmentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getRoleAssignment", TypeShape.of(GetRoleAssignmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Role definition.
     * API Version: 2018-01-01-preview.
     * 
     */
    public static Output<GetRoleDefinitionResult> getRoleDefinition(GetRoleDefinitionArgs args) {
        return getRoleDefinition(args, InvokeOptions.Empty);
    }
    /**
     * Role definition.
     * API Version: 2018-01-01-preview.
     * 
     */
    public static CompletableFuture<GetRoleDefinitionResult> getRoleDefinitionPlain(GetRoleDefinitionPlainArgs args) {
        return getRoleDefinitionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Role definition.
     * API Version: 2018-01-01-preview.
     * 
     */
    public static Output<GetRoleDefinitionResult> getRoleDefinition(GetRoleDefinitionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getRoleDefinition", TypeShape.of(GetRoleDefinitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Role definition.
     * API Version: 2018-01-01-preview.
     * 
     */
    public static CompletableFuture<GetRoleDefinitionResult> getRoleDefinitionPlain(GetRoleDefinitionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getRoleDefinition", TypeShape.of(GetRoleDefinitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Role management policy
     * API Version: 2020-10-01.
     * 
     */
    public static Output<GetRoleManagementPolicyAssignmentResult> getRoleManagementPolicyAssignment(GetRoleManagementPolicyAssignmentArgs args) {
        return getRoleManagementPolicyAssignment(args, InvokeOptions.Empty);
    }
    /**
     * Role management policy
     * API Version: 2020-10-01.
     * 
     */
    public static CompletableFuture<GetRoleManagementPolicyAssignmentResult> getRoleManagementPolicyAssignmentPlain(GetRoleManagementPolicyAssignmentPlainArgs args) {
        return getRoleManagementPolicyAssignmentPlain(args, InvokeOptions.Empty);
    }
    /**
     * Role management policy
     * API Version: 2020-10-01.
     * 
     */
    public static Output<GetRoleManagementPolicyAssignmentResult> getRoleManagementPolicyAssignment(GetRoleManagementPolicyAssignmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:authorization:getRoleManagementPolicyAssignment", TypeShape.of(GetRoleManagementPolicyAssignmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Role management policy
     * API Version: 2020-10-01.
     * 
     */
    public static CompletableFuture<GetRoleManagementPolicyAssignmentResult> getRoleManagementPolicyAssignmentPlain(GetRoleManagementPolicyAssignmentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getRoleManagementPolicyAssignment", TypeShape.of(GetRoleManagementPolicyAssignmentResult.class), args, Utilities.withVersion(options));
    }
}
