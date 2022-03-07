// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetGeoBackupPolicyArgs;
import io.pulumi.azurenative.sql.outputs.GetGeoBackupPolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGeoBackupPolicy {
    private GetGeoBackupPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetGeoBackupPolicyArgs.Builder a);
    }
    private static GetGeoBackupPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetGeoBackupPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A database geo backup policy.
 * API Version: 2014-04-01.
 * 
     *
     * A database geo backup policy.
 * 
     */
    public static CompletableFuture<GetGeoBackupPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A database geo backup policy.
     * API Version: 2014-04-01.
     * 
     *
         * A database geo backup policy.
     * 
     */
    public static CompletableFuture<GetGeoBackupPolicyResult> invokeAsync(GetGeoBackupPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getGeoBackupPolicy", TypeShape.of(GetGeoBackupPolicyResult.class), args == null ? GetGeoBackupPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}