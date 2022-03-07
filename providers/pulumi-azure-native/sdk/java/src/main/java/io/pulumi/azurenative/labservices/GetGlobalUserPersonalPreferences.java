// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.labservices.inputs.GetGlobalUserPersonalPreferencesArgs;
import io.pulumi.azurenative.labservices.outputs.GetGlobalUserPersonalPreferencesResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGlobalUserPersonalPreferences {
    private GetGlobalUserPersonalPreferences() {}
    public interface BuilderApplicator {
        public void apply(GetGlobalUserPersonalPreferencesArgs.Builder a);
    }
    private static GetGlobalUserPersonalPreferencesArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetGlobalUserPersonalPreferencesArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Represents the PersonalPreferences for the user
 * API Version: 2018-10-15.
 * 
     *
     * Represents the PersonalPreferences for the user
 * 
     */
    public static CompletableFuture<GetGlobalUserPersonalPreferencesResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Represents the PersonalPreferences for the user
     * API Version: 2018-10-15.
     * 
     *
         * Represents the PersonalPreferences for the user
     * 
     */
    public static CompletableFuture<GetGlobalUserPersonalPreferencesResult> invokeAsync(GetGlobalUserPersonalPreferencesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getGlobalUserPersonalPreferences", TypeShape.of(GetGlobalUserPersonalPreferencesResult.class), args == null ? GetGlobalUserPersonalPreferencesArgs.Empty : args, Utilities.withVersion(options));
    }
}