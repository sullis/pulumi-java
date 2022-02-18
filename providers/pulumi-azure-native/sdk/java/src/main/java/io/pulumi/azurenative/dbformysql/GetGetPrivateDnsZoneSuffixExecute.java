// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbformysql.inputs.GetGetPrivateDnsZoneSuffixExecuteArgs;
import io.pulumi.azurenative.dbformysql.outputs.GetGetPrivateDnsZoneSuffixExecuteResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGetPrivateDnsZoneSuffixExecute {
/**
 * The response of get private dns zone suffix.
 * API Version: 2021-05-01-preview.
 * 
 *
 * The response of get private dns zone suffix.
 * 
 */
    public static CompletableFuture<GetGetPrivateDnsZoneSuffixExecuteResult> invokeAsync(@Nullable GetGetPrivateDnsZoneSuffixExecuteArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dbformysql:getGetPrivateDnsZoneSuffixExecute", TypeShape.of(GetGetPrivateDnsZoneSuffixExecuteResult.class), args == null ? GetGetPrivateDnsZoneSuffixExecuteArgs.Empty : args, Utilities.withVersion(options));
    }
}
