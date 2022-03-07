// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.inputs.ListBuildTaskSourceRepositoryPropertiesArgs;
import io.pulumi.azurenative.containerregistry.outputs.ListBuildTaskSourceRepositoryPropertiesResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListBuildTaskSourceRepositoryProperties {
    private ListBuildTaskSourceRepositoryProperties() {}
    public interface BuilderApplicator {
        public void apply(ListBuildTaskSourceRepositoryPropertiesArgs.Builder a);
    }
    private static ListBuildTaskSourceRepositoryPropertiesArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListBuildTaskSourceRepositoryPropertiesArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The properties of the source code repository.
 * API Version: 2018-02-01-preview.
 * 
     *
     * The properties of the source code repository.
 * 
     */
    public static CompletableFuture<ListBuildTaskSourceRepositoryPropertiesResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The properties of the source code repository.
     * API Version: 2018-02-01-preview.
     * 
     *
         * The properties of the source code repository.
     * 
     */
    public static CompletableFuture<ListBuildTaskSourceRepositoryPropertiesResult> invokeAsync(ListBuildTaskSourceRepositoryPropertiesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:listBuildTaskSourceRepositoryProperties", TypeShape.of(ListBuildTaskSourceRepositoryPropertiesResult.class), args == null ? ListBuildTaskSourceRepositoryPropertiesArgs.Empty : args, Utilities.withVersion(options));
    }
}