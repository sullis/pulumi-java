// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.inputs.GetSqlPoolSensitivityLabelArgs;
import io.pulumi.azurenative.synapse.outputs.GetSqlPoolSensitivityLabelResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSqlPoolSensitivityLabel {
/**
 * A sensitivity label.
 * API Version: 2021-03-01.
 * 
 *
 * A sensitivity label.
 * 
 */
    public static CompletableFuture<GetSqlPoolSensitivityLabelResult> invokeAsync(GetSqlPoolSensitivityLabelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:synapse:getSqlPoolSensitivityLabel", TypeShape.of(GetSqlPoolSensitivityLabelResult.class), args == null ? GetSqlPoolSensitivityLabelArgs.Empty : args, Utilities.withVersion(options));
    }
}
