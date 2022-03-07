// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.inputs.GetCloudServiceArgs;
import io.pulumi.azurenative.compute.outputs.GetCloudServiceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCloudService {
    private GetCloudService() {}
    public interface BuilderApplicator {
        public void apply(GetCloudServiceArgs.Builder a);
    }
    private static GetCloudServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetCloudServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Describes the cloud service.
 * API Version: 2021-03-01.
 * 
     *
     * Describes the cloud service.
 * 
     */
    public static CompletableFuture<GetCloudServiceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Describes the cloud service.
     * API Version: 2021-03-01.
     * 
     *
         * Describes the cloud service.
     * 
     */
    public static CompletableFuture<GetCloudServiceResult> invokeAsync(GetCloudServiceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getCloudService", TypeShape.of(GetCloudServiceResult.class), args == null ? GetCloudServiceArgs.Empty : args, Utilities.withVersion(options));
    }
}