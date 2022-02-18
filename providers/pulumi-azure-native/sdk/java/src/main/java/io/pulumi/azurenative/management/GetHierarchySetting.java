// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.management.inputs.GetHierarchySettingArgs;
import io.pulumi.azurenative.management.outputs.GetHierarchySettingResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHierarchySetting {
/**
 * Settings defined at the Management Group scope.
 * API Version: 2020-05-01.
 * 
 *
 * Settings defined at the Management Group scope.
 * 
 */
    public static CompletableFuture<GetHierarchySettingResult> invokeAsync(GetHierarchySettingArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:management:getHierarchySetting", TypeShape.of(GetHierarchySettingResult.class), args == null ? GetHierarchySettingArgs.Empty : args, Utilities.withVersion(options));
    }
}
