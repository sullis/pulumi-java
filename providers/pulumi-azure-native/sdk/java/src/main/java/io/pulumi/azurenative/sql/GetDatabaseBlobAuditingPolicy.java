// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetDatabaseBlobAuditingPolicyArgs;
import io.pulumi.azurenative.sql.outputs.GetDatabaseBlobAuditingPolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDatabaseBlobAuditingPolicy {
    private GetDatabaseBlobAuditingPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetDatabaseBlobAuditingPolicyArgs.Builder a);
    }
    private static GetDatabaseBlobAuditingPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDatabaseBlobAuditingPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A database blob auditing policy.
 * API Version: 2020-11-01-preview.
 * 
     *
     * A database blob auditing policy.
 * 
     */
    public static CompletableFuture<GetDatabaseBlobAuditingPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A database blob auditing policy.
     * API Version: 2020-11-01-preview.
     * 
     *
         * A database blob auditing policy.
     * 
     */
    public static CompletableFuture<GetDatabaseBlobAuditingPolicyResult> invokeAsync(GetDatabaseBlobAuditingPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getDatabaseBlobAuditingPolicy", TypeShape.of(GetDatabaseBlobAuditingPolicyResult.class), args == null ? GetDatabaseBlobAuditingPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}