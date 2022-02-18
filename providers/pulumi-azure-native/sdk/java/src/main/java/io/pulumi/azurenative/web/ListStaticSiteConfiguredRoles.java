// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.ListStaticSiteConfiguredRolesArgs;
import io.pulumi.azurenative.web.outputs.ListStaticSiteConfiguredRolesResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListStaticSiteConfiguredRoles {
/**
 * String list resource.
 * API Version: 2020-12-01.
 * 
 *
 * String list resource.
 * 
 */
    public static CompletableFuture<ListStaticSiteConfiguredRolesResult> invokeAsync(ListStaticSiteConfiguredRolesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:listStaticSiteConfiguredRoles", TypeShape.of(ListStaticSiteConfiguredRolesResult.class), args == null ? ListStaticSiteConfiguredRolesArgs.Empty : args, Utilities.withVersion(options));
    }
}
