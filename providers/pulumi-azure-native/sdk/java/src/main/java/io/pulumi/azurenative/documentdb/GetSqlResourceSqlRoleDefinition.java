// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.inputs.GetSqlResourceSqlRoleDefinitionArgs;
import io.pulumi.azurenative.documentdb.outputs.GetSqlResourceSqlRoleDefinitionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSqlResourceSqlRoleDefinition {
/**
 * An Azure Cosmos DB SQL Role Definition.
 * API Version: 2021-03-01-preview.
 * 
 *
 * An Azure Cosmos DB SQL Role Definition.
 * 
 */
    public static CompletableFuture<GetSqlResourceSqlRoleDefinitionResult> invokeAsync(GetSqlResourceSqlRoleDefinitionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:documentdb:getSqlResourceSqlRoleDefinition", TypeShape.of(GetSqlResourceSqlRoleDefinitionResult.class), args == null ? GetSqlResourceSqlRoleDefinitionArgs.Empty : args, Utilities.withVersion(options));
    }
}
