// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lightsail.inputs.GetContainerArgs;
import io.pulumi.awsnative.lightsail.outputs.GetContainerResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetContainer {
    private GetContainer() {}
    public interface BuilderApplicator {
        public void apply(GetContainerArgs.Builder a);
    }
    private static GetContainerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetContainerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type definition for AWS::Lightsail::Container
 * 
     */
    public static CompletableFuture<GetContainerResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type definition for AWS::Lightsail::Container
     * 
     */
    public static CompletableFuture<GetContainerResult> invokeAsync(GetContainerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:lightsail:getContainer", TypeShape.of(GetContainerResult.class), args == null ? GetContainerArgs.Empty : args, Utilities.withVersion(options));
    }
}