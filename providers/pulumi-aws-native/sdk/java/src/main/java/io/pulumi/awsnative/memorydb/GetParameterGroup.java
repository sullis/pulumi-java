// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.memorydb.inputs.GetParameterGroupArgs;
import io.pulumi.awsnative.memorydb.outputs.GetParameterGroupResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetParameterGroup {
/**
 * The AWS::MemoryDB::ParameterGroup resource creates an Amazon MemoryDB ParameterGroup.
 * 
 */
    public static CompletableFuture<GetParameterGroupResult> invokeAsync(GetParameterGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:memorydb:getParameterGroup", TypeShape.of(GetParameterGroupResult.class), args == null ? GetParameterGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
