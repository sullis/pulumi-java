// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.connect.inputs.GetUserHierarchyGroupArgs;
import io.pulumi.awsnative.connect.outputs.GetUserHierarchyGroupResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetUserHierarchyGroup {
/**
 * Resource Type definition for AWS::Connect::UserHierarchyGroup
 * 
 */
    public static CompletableFuture<GetUserHierarchyGroupResult> invokeAsync(GetUserHierarchyGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:connect:getUserHierarchyGroup", TypeShape.of(GetUserHierarchyGroupResult.class), args == null ? GetUserHierarchyGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
