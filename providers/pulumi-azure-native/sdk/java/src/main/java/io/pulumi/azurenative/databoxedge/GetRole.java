// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.inputs.GetRoleArgs;
import io.pulumi.azurenative.databoxedge.outputs.GetRoleResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

@Deprecated /* Please use one of the variants: CloudEdgeManagementRole, IoTRole, KubernetesRole, MECRole. */
public class GetRole {
/**
 * Compute role.
 * API Version: 2020-12-01.
 * 
 *
 * Compute role.
 * 
 * @deprecated
 * Please use one of the variants: CloudEdgeManagementRole, IoTRole, KubernetesRole, MECRole.
 * 
 */
    @Deprecated /* Please use one of the variants: CloudEdgeManagementRole, IoTRole, KubernetesRole, MECRole. */
    public static CompletableFuture<GetRoleResult> invokeAsync(GetRoleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getRole", TypeShape.of(GetRoleResult.class), args == null ? GetRoleArgs.Empty : args, Utilities.withVersion(options));
    }
}
