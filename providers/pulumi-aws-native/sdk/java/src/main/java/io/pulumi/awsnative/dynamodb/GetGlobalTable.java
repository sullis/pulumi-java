// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.dynamodb.inputs.GetGlobalTableArgs;
import io.pulumi.awsnative.dynamodb.outputs.GetGlobalTableResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGlobalTable {
    private GetGlobalTable() {}
    public interface BuilderApplicator {
        public void apply(GetGlobalTableArgs.Builder a);
    }
    private static GetGlobalTableArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetGlobalTableArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Version: None. Resource Type definition for AWS::DynamoDB::GlobalTable
 * 
     */
    public static CompletableFuture<GetGlobalTableResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Version: None. Resource Type definition for AWS::DynamoDB::GlobalTable
     * 
     */
    public static CompletableFuture<GetGlobalTableResult> invokeAsync(GetGlobalTableArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:dynamodb:getGlobalTable", TypeShape.of(GetGlobalTableResult.class), args == null ? GetGlobalTableArgs.Empty : args, Utilities.withVersion(options));
    }
}