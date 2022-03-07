// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.ListStaticSiteConfiguredRolesArgs;
import io.pulumi.azurenative.web.outputs.ListStaticSiteConfiguredRolesResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListStaticSiteConfiguredRoles {
    private ListStaticSiteConfiguredRoles() {}
    public interface BuilderApplicator {
        public void apply(ListStaticSiteConfiguredRolesArgs.Builder a);
    }
    private static ListStaticSiteConfiguredRolesArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListStaticSiteConfiguredRolesArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * String list resource.
 * API Version: 2020-12-01.
 * 
     *
     * String list resource.
 * 
     */
    public static CompletableFuture<ListStaticSiteConfiguredRolesResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
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