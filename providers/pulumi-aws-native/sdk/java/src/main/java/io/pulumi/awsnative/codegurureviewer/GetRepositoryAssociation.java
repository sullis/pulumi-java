// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codegurureviewer;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.codegurureviewer.inputs.GetRepositoryAssociationArgs;
import io.pulumi.awsnative.codegurureviewer.outputs.GetRepositoryAssociationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRepositoryAssociation {
    private GetRepositoryAssociation() {}
    public interface BuilderApplicator {
        public void apply(GetRepositoryAssociationArgs.Builder a);
    }
    private static GetRepositoryAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRepositoryAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * This resource schema represents the RepositoryAssociation resource in the Amazon CodeGuru Reviewer service.
 * 
     */
    public static CompletableFuture<GetRepositoryAssociationResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * This resource schema represents the RepositoryAssociation resource in the Amazon CodeGuru Reviewer service.
     * 
     */
    public static CompletableFuture<GetRepositoryAssociationResult> invokeAsync(GetRepositoryAssociationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:codegurureviewer:getRepositoryAssociation", TypeShape.of(GetRepositoryAssociationResult.class), args == null ? GetRepositoryAssociationArgs.Empty : args, Utilities.withVersion(options));
    }
}