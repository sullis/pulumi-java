// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.blueprint.inputs.GetTemplateArtifactArgs;
import io.pulumi.azurenative.blueprint.outputs.GetTemplateArtifactResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTemplateArtifact {
    private GetTemplateArtifact() {}
    public interface BuilderApplicator {
        public void apply(GetTemplateArtifactArgs.Builder a);
    }
    private static GetTemplateArtifactArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTemplateArtifactArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Blueprint artifact that deploys a Resource Manager template.
 * API Version: 2018-11-01-preview.
 * 
     *
     * Blueprint artifact that deploys a Resource Manager template.
 * 
     */
    public static CompletableFuture<GetTemplateArtifactResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Blueprint artifact that deploys a Resource Manager template.
     * API Version: 2018-11-01-preview.
     * 
     *
         * Blueprint artifact that deploys a Resource Manager template.
     * 
     */
    public static CompletableFuture<GetTemplateArtifactResult> invokeAsync(GetTemplateArtifactArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:blueprint:getTemplateArtifact", TypeShape.of(GetTemplateArtifactResult.class), args == null ? GetTemplateArtifactArgs.Empty : args, Utilities.withVersion(options));
    }
}