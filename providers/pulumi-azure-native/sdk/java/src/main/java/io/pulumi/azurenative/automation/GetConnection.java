// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.inputs.GetConnectionArgs;
import io.pulumi.azurenative.automation.outputs.GetConnectionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConnection {
/**
 * Definition of the connection.
 * API Version: 2019-06-01.
 * 
 *
 * Definition of the connection.
 * 
 */
    public static CompletableFuture<GetConnectionResult> invokeAsync(GetConnectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getConnection", TypeShape.of(GetConnectionResult.class), args == null ? GetConnectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
