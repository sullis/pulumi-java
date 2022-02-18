// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.GetWebAppHostNameBindingArgs;
import io.pulumi.azurenative.web.outputs.GetWebAppHostNameBindingResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWebAppHostNameBinding {
/**
 * A hostname binding object.
 * API Version: 2020-12-01.
 * 
 *
 * A hostname binding object.
 * 
 */
    public static CompletableFuture<GetWebAppHostNameBindingResult> invokeAsync(GetWebAppHostNameBindingArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:getWebAppHostNameBinding", TypeShape.of(GetWebAppHostNameBindingResult.class), args == null ? GetWebAppHostNameBindingArgs.Empty : args, Utilities.withVersion(options));
    }
}
