// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetEncryptionProtectorArgs;
import io.pulumi.azurenative.sql.outputs.GetEncryptionProtectorResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEncryptionProtector {
/**
 * The server encryption protector.
 * API Version: 2020-11-01-preview.
 * 
 *
 * The server encryption protector.
 * 
 */
    public static CompletableFuture<GetEncryptionProtectorResult> invokeAsync(GetEncryptionProtectorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getEncryptionProtector", TypeShape.of(GetEncryptionProtectorResult.class), args == null ? GetEncryptionProtectorArgs.Empty : args, Utilities.withVersion(options));
    }
}
