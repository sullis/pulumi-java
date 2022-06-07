// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.certificateregistration;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.certificateregistration.inputs.GetAppServiceCertificateOrderArgs;
import com.pulumi.azurenative.certificateregistration.inputs.GetAppServiceCertificateOrderCertificateArgs;
import com.pulumi.azurenative.certificateregistration.inputs.GetAppServiceCertificateOrderCertificatePlainArgs;
import com.pulumi.azurenative.certificateregistration.inputs.GetAppServiceCertificateOrderPlainArgs;
import com.pulumi.azurenative.certificateregistration.outputs.GetAppServiceCertificateOrderCertificateResult;
import com.pulumi.azurenative.certificateregistration.outputs.GetAppServiceCertificateOrderResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CertificateregistrationFunctions {
    /**
     * SSL certificate purchase order.
     * API Version: 2020-10-01.
     * 
     */
    public static Output<GetAppServiceCertificateOrderResult> getAppServiceCertificateOrder(GetAppServiceCertificateOrderArgs args) {
        return getAppServiceCertificateOrder(args, InvokeOptions.Empty);
    }
    /**
     * SSL certificate purchase order.
     * API Version: 2020-10-01.
     * 
     */
    public static CompletableFuture<GetAppServiceCertificateOrderResult> getAppServiceCertificateOrderPlain(GetAppServiceCertificateOrderPlainArgs args) {
        return getAppServiceCertificateOrderPlain(args, InvokeOptions.Empty);
    }
    /**
     * SSL certificate purchase order.
     * API Version: 2020-10-01.
     * 
     */
    public static Output<GetAppServiceCertificateOrderResult> getAppServiceCertificateOrder(GetAppServiceCertificateOrderArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:certificateregistration:getAppServiceCertificateOrder", TypeShape.of(GetAppServiceCertificateOrderResult.class), args, Utilities.withVersion(options));
    }
    /**
     * SSL certificate purchase order.
     * API Version: 2020-10-01.
     * 
     */
    public static CompletableFuture<GetAppServiceCertificateOrderResult> getAppServiceCertificateOrderPlain(GetAppServiceCertificateOrderPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:certificateregistration:getAppServiceCertificateOrder", TypeShape.of(GetAppServiceCertificateOrderResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Key Vault container ARM resource for a certificate that is purchased through Azure.
     * API Version: 2020-10-01.
     * 
     */
    public static Output<GetAppServiceCertificateOrderCertificateResult> getAppServiceCertificateOrderCertificate(GetAppServiceCertificateOrderCertificateArgs args) {
        return getAppServiceCertificateOrderCertificate(args, InvokeOptions.Empty);
    }
    /**
     * Key Vault container ARM resource for a certificate that is purchased through Azure.
     * API Version: 2020-10-01.
     * 
     */
    public static CompletableFuture<GetAppServiceCertificateOrderCertificateResult> getAppServiceCertificateOrderCertificatePlain(GetAppServiceCertificateOrderCertificatePlainArgs args) {
        return getAppServiceCertificateOrderCertificatePlain(args, InvokeOptions.Empty);
    }
    /**
     * Key Vault container ARM resource for a certificate that is purchased through Azure.
     * API Version: 2020-10-01.
     * 
     */
    public static Output<GetAppServiceCertificateOrderCertificateResult> getAppServiceCertificateOrderCertificate(GetAppServiceCertificateOrderCertificateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:certificateregistration:getAppServiceCertificateOrderCertificate", TypeShape.of(GetAppServiceCertificateOrderCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Key Vault container ARM resource for a certificate that is purchased through Azure.
     * API Version: 2020-10-01.
     * 
     */
    public static CompletableFuture<GetAppServiceCertificateOrderCertificateResult> getAppServiceCertificateOrderCertificatePlain(GetAppServiceCertificateOrderCertificatePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:certificateregistration:getAppServiceCertificateOrderCertificate", TypeShape.of(GetAppServiceCertificateOrderCertificateResult.class), args, Utilities.withVersion(options));
    }
}
