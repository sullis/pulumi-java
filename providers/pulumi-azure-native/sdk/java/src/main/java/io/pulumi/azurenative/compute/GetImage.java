// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.inputs.GetImageArgs;
import io.pulumi.azurenative.compute.outputs.GetImageResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetImage {
    private GetImage() {}
    public interface BuilderApplicator {
        public void apply(GetImageArgs.Builder a);
    }
    private static GetImageArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetImageArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The source user image virtual hard disk. The virtual hard disk will be copied before being attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not exist.
 * API Version: 2020-12-01.
 * 
     *
     * The source user image virtual hard disk. The virtual hard disk will be copied before being attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not exist.
 * 
     */
    public static CompletableFuture<GetImageResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The source user image virtual hard disk. The virtual hard disk will be copied before being attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not exist.
     * API Version: 2020-12-01.
     * 
     *
         * The source user image virtual hard disk. The virtual hard disk will be copied before being attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not exist.
     * 
     */
    public static CompletableFuture<GetImageResult> invokeAsync(GetImageArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getImage", TypeShape.of(GetImageResult.class), args == null ? GetImageArgs.Empty : args, Utilities.withVersion(options));
    }
}