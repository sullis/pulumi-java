// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.inputs.GetFavoriteArgs;
import io.pulumi.azurenative.insights.outputs.GetFavoriteResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFavorite {
/**
 * Properties that define a favorite that is associated to an Application Insights component.
 * API Version: 2015-05-01.
 * 
 *
 * Properties that define a favorite that is associated to an Application Insights component.
 * 
 */
    public static CompletableFuture<GetFavoriteResult> invokeAsync(GetFavoriteArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getFavorite", TypeShape.of(GetFavoriteResult.class), args == null ? GetFavoriteArgs.Empty : args, Utilities.withVersion(options));
    }
}
