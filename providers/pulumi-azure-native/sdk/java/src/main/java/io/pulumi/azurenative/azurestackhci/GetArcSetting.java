// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestackhci;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azurestackhci.inputs.GetArcSettingArgs;
import io.pulumi.azurenative.azurestackhci.outputs.GetArcSettingResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetArcSetting {
    private GetArcSetting() {}
    public interface BuilderApplicator {
        public void apply(GetArcSettingArgs.Builder a);
    }
    private static GetArcSettingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetArcSettingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * ArcSetting details.
 * API Version: 2021-01-01-preview.
 * 
     *
     * ArcSetting details.
 * 
     */
    public static CompletableFuture<GetArcSettingResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * ArcSetting details.
     * API Version: 2021-01-01-preview.
     * 
     *
         * ArcSetting details.
     * 
     */
    public static CompletableFuture<GetArcSettingResult> invokeAsync(GetArcSettingArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:azurestackhci:getArcSetting", TypeShape.of(GetArcSettingResult.class), args == null ? GetArcSettingArgs.Empty : args, Utilities.withVersion(options));
    }
}