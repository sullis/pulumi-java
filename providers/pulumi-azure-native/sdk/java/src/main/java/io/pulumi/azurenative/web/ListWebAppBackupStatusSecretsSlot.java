// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.ListWebAppBackupStatusSecretsSlotArgs;
import io.pulumi.azurenative.web.outputs.ListWebAppBackupStatusSecretsSlotResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListWebAppBackupStatusSecretsSlot {
    private ListWebAppBackupStatusSecretsSlot() {}
    public interface BuilderApplicator {
        public void apply(ListWebAppBackupStatusSecretsSlotArgs.Builder a);
    }
    private static ListWebAppBackupStatusSecretsSlotArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListWebAppBackupStatusSecretsSlotArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Backup description.
 * API Version: 2020-12-01.
 * 
     *
     * Backup description.
 * 
     */
    public static CompletableFuture<ListWebAppBackupStatusSecretsSlotResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Backup description.
     * API Version: 2020-12-01.
     * 
     *
         * Backup description.
     * 
     */
    public static CompletableFuture<ListWebAppBackupStatusSecretsSlotResult> invokeAsync(ListWebAppBackupStatusSecretsSlotArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:listWebAppBackupStatusSecretsSlot", TypeShape.of(ListWebAppBackupStatusSecretsSlotResult.class), args == null ? ListWebAppBackupStatusSecretsSlotArgs.Empty : args, Utilities.withVersion(options));
    }
}