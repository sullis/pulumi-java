// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.inputs.ListDatastoreSecretsArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.ListDatastoreSecretsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListDatastoreSecrets {
/**
 * Base definition for datastore secrets.
 * API Version: 2021-03-01-preview.
 * 
 *
 * Base definition for datastore secrets.
 * 
 */
    public static CompletableFuture<ListDatastoreSecretsResult> invokeAsync(ListDatastoreSecretsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearningservices:listDatastoreSecrets", TypeShape.of(ListDatastoreSecretsResult.class), args == null ? ListDatastoreSecretsArgs.Empty : args, Utilities.withVersion(options));
    }
}
