// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codegurureviewer;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.codegurureviewer.inputs.GetRepositoryAssociationArgs;
import io.pulumi.awsnative.codegurureviewer.outputs.GetRepositoryAssociationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRepositoryAssociation {
    public static CompletableFuture<GetRepositoryAssociationResult> invokeAsync(GetRepositoryAssociationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:codegurureviewer:getRepositoryAssociation", TypeShape.of(GetRepositoryAssociationResult.class), args == null ? GetRepositoryAssociationArgs.Empty : args, Utilities.withVersion(options));
    }
}
