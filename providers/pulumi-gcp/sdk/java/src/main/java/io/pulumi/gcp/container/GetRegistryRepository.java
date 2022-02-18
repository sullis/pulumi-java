// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.container.inputs.GetRegistryRepositoryArgs;
import io.pulumi.gcp.container.outputs.GetRegistryRepositoryResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegistryRepository {
/**
 * This data source fetches the project name, and provides the appropriate URLs to use for container registry for this project.
 * 
 * The URLs are computed entirely offline - as long as the project exists, they will be valid, but this data source does not contact Google Container Registry (GCR) at any point.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getRegistryRepository.
 * 
 *
 * A collection of values returned by getRegistryRepository.
 * 
 */
    public static CompletableFuture<GetRegistryRepositoryResult> invokeAsync(@Nullable GetRegistryRepositoryArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:container/getRegistryRepository:getRegistryRepository", TypeShape.of(GetRegistryRepositoryResult.class), args == null ? GetRegistryRepositoryArgs.Empty : args, Utilities.withVersion(options));
    }
}
