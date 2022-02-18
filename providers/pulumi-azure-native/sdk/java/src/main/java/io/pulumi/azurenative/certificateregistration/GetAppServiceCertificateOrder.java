// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.certificateregistration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.certificateregistration.inputs.GetAppServiceCertificateOrderArgs;
import io.pulumi.azurenative.certificateregistration.outputs.GetAppServiceCertificateOrderResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAppServiceCertificateOrder {
/**
 * SSL certificate purchase order.
 * API Version: 2020-10-01.
 * 
 *
 * SSL certificate purchase order.
 * 
 */
    public static CompletableFuture<GetAppServiceCertificateOrderResult> invokeAsync(GetAppServiceCertificateOrderArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:certificateregistration:getAppServiceCertificateOrder", TypeShape.of(GetAppServiceCertificateOrderResult.class), args == null ? GetAppServiceCertificateOrderArgs.Empty : args, Utilities.withVersion(options));
    }
}
