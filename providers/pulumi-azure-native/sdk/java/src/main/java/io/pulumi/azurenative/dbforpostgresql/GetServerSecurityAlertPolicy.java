// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbforpostgresql.inputs.GetServerSecurityAlertPolicyArgs;
import io.pulumi.azurenative.dbforpostgresql.outputs.GetServerSecurityAlertPolicyResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServerSecurityAlertPolicy {
/**
 * A server security alert policy.
 * API Version: 2017-12-01.
 * 
 *
 * A server security alert policy.
 * 
 */
    public static CompletableFuture<GetServerSecurityAlertPolicyResult> invokeAsync(GetServerSecurityAlertPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dbforpostgresql:getServerSecurityAlertPolicy", TypeShape.of(GetServerSecurityAlertPolicyResult.class), args == null ? GetServerSecurityAlertPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
