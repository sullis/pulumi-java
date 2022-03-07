// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.intune;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.intune.inputs.GetAndroidMAMPolicyByNameArgs;
import io.pulumi.azurenative.intune.outputs.GetAndroidMAMPolicyByNameResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAndroidMAMPolicyByName {
    private GetAndroidMAMPolicyByName() {}
    public interface BuilderApplicator {
        public void apply(GetAndroidMAMPolicyByNameArgs.Builder a);
    }
    private static GetAndroidMAMPolicyByNameArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAndroidMAMPolicyByNameArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Android Policy entity for Intune MAM.
 * API Version: 2015-01-14-preview.
 * 
     *
     * Android Policy entity for Intune MAM.
 * 
     */
    public static CompletableFuture<GetAndroidMAMPolicyByNameResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Android Policy entity for Intune MAM.
     * API Version: 2015-01-14-preview.
     * 
     *
         * Android Policy entity for Intune MAM.
     * 
     */
    public static CompletableFuture<GetAndroidMAMPolicyByNameResult> invokeAsync(GetAndroidMAMPolicyByNameArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:intune:getAndroidMAMPolicyByName", TypeShape.of(GetAndroidMAMPolicyByNameResult.class), args == null ? GetAndroidMAMPolicyByNameArgs.Empty : args, Utilities.withVersion(options));
    }
}