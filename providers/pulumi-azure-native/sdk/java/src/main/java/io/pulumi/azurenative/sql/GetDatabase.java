// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetDatabaseArgs;
import io.pulumi.azurenative.sql.outputs.GetDatabaseResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDatabase {
/**
 * A database resource.
 * API Version: 2020-11-01-preview.
 * 
 *
 * A database resource.
 * 
 */
    public static CompletableFuture<GetDatabaseResult> invokeAsync(GetDatabaseArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getDatabase", TypeShape.of(GetDatabaseResult.class), args == null ? GetDatabaseArgs.Empty : args, Utilities.withVersion(options));
    }
}
