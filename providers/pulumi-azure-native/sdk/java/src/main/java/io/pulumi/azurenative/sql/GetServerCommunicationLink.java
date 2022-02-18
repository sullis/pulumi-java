// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetServerCommunicationLinkArgs;
import io.pulumi.azurenative.sql.outputs.GetServerCommunicationLinkResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServerCommunicationLink {
/**
 * Server communication link.
 * API Version: 2014-04-01.
 * 
 *
 * Server communication link.
 * 
 */
    public static CompletableFuture<GetServerCommunicationLinkResult> invokeAsync(GetServerCommunicationLinkArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getServerCommunicationLink", TypeShape.of(GetServerCommunicationLinkResult.class), args == null ? GetServerCommunicationLinkArgs.Empty : args, Utilities.withVersion(options));
    }
}
