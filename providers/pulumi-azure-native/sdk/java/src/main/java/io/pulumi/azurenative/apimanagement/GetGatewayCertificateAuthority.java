// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.GetGatewayCertificateAuthorityArgs;
import io.pulumi.azurenative.apimanagement.outputs.GetGatewayCertificateAuthorityResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGatewayCertificateAuthority {
/**
 * Gateway certificate authority details.
 * API Version: 2020-12-01.
 * 
 *
 * Gateway certificate authority details.
 * 
 */
    public static CompletableFuture<GetGatewayCertificateAuthorityResult> invokeAsync(GetGatewayCertificateAuthorityArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:getGatewayCertificateAuthority", TypeShape.of(GetGatewayCertificateAuthorityResult.class), args == null ? GetGatewayCertificateAuthorityArgs.Empty : args, Utilities.withVersion(options));
    }
}
