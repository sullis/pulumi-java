// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.workspaces;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.workspaces.inputs.GetConnectionAliasArgs;
import io.pulumi.awsnative.workspaces.outputs.GetConnectionAliasResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConnectionAlias {
    private GetConnectionAlias() {}
    public interface BuilderApplicator {
        public void apply(GetConnectionAliasArgs.Builder a);
    }
    private static GetConnectionAliasArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetConnectionAliasArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type definition for AWS::WorkSpaces::ConnectionAlias
 * 
     */
    public static CompletableFuture<GetConnectionAliasResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type definition for AWS::WorkSpaces::ConnectionAlias
     * 
     */
    public static CompletableFuture<GetConnectionAliasResult> invokeAsync(GetConnectionAliasArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:workspaces:getConnectionAlias", TypeShape.of(GetConnectionAliasResult.class), args == null ? GetConnectionAliasArgs.Empty : args, Utilities.withVersion(options));
    }
}