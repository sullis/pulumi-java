// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.nimblestudio.inputs.GetLaunchProfileArgs;
import io.pulumi.awsnative.nimblestudio.outputs.GetLaunchProfileResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLaunchProfile {
    private GetLaunchProfile() {}
    public interface BuilderApplicator {
        public void apply(GetLaunchProfileArgs.Builder a);
    }
    private static GetLaunchProfileArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetLaunchProfileArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Represents a launch profile which delegates access to a collection of studio components to studio users
 * 
     */
    public static CompletableFuture<GetLaunchProfileResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Represents a launch profile which delegates access to a collection of studio components to studio users
     * 
     */
    public static CompletableFuture<GetLaunchProfileResult> invokeAsync(GetLaunchProfileArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:nimblestudio:getLaunchProfile", TypeShape.of(GetLaunchProfileResult.class), args == null ? GetLaunchProfileArgs.Empty : args, Utilities.withVersion(options));
    }
}