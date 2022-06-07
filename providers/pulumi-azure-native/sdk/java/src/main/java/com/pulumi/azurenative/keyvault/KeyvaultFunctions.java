// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.keyvault.inputs.GetKeyArgs;
import com.pulumi.azurenative.keyvault.inputs.GetKeyPlainArgs;
import com.pulumi.azurenative.keyvault.inputs.GetMHSMPrivateEndpointConnectionArgs;
import com.pulumi.azurenative.keyvault.inputs.GetMHSMPrivateEndpointConnectionPlainArgs;
import com.pulumi.azurenative.keyvault.inputs.GetManagedHsmArgs;
import com.pulumi.azurenative.keyvault.inputs.GetManagedHsmPlainArgs;
import com.pulumi.azurenative.keyvault.inputs.GetPrivateEndpointConnectionArgs;
import com.pulumi.azurenative.keyvault.inputs.GetPrivateEndpointConnectionPlainArgs;
import com.pulumi.azurenative.keyvault.inputs.GetSecretArgs;
import com.pulumi.azurenative.keyvault.inputs.GetSecretPlainArgs;
import com.pulumi.azurenative.keyvault.inputs.GetVaultArgs;
import com.pulumi.azurenative.keyvault.inputs.GetVaultPlainArgs;
import com.pulumi.azurenative.keyvault.outputs.GetKeyResult;
import com.pulumi.azurenative.keyvault.outputs.GetMHSMPrivateEndpointConnectionResult;
import com.pulumi.azurenative.keyvault.outputs.GetManagedHsmResult;
import com.pulumi.azurenative.keyvault.outputs.GetPrivateEndpointConnectionResult;
import com.pulumi.azurenative.keyvault.outputs.GetSecretResult;
import com.pulumi.azurenative.keyvault.outputs.GetVaultResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class KeyvaultFunctions {
    /**
     * The key resource.
     * API Version: 2019-09-01.
     * 
     */
    public static Output<GetKeyResult> getKey(GetKeyArgs args) {
        return getKey(args, InvokeOptions.Empty);
    }
    /**
     * The key resource.
     * API Version: 2019-09-01.
     * 
     */
    public static CompletableFuture<GetKeyResult> getKeyPlain(GetKeyPlainArgs args) {
        return getKeyPlain(args, InvokeOptions.Empty);
    }
    /**
     * The key resource.
     * API Version: 2019-09-01.
     * 
     */
    public static Output<GetKeyResult> getKey(GetKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:keyvault:getKey", TypeShape.of(GetKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The key resource.
     * API Version: 2019-09-01.
     * 
     */
    public static CompletableFuture<GetKeyResult> getKeyPlain(GetKeyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:keyvault:getKey", TypeShape.of(GetKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Private endpoint connection resource.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static Output<GetMHSMPrivateEndpointConnectionResult> getMHSMPrivateEndpointConnection(GetMHSMPrivateEndpointConnectionArgs args) {
        return getMHSMPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    /**
     * Private endpoint connection resource.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetMHSMPrivateEndpointConnectionResult> getMHSMPrivateEndpointConnectionPlain(GetMHSMPrivateEndpointConnectionPlainArgs args) {
        return getMHSMPrivateEndpointConnectionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Private endpoint connection resource.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static Output<GetMHSMPrivateEndpointConnectionResult> getMHSMPrivateEndpointConnection(GetMHSMPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:keyvault:getMHSMPrivateEndpointConnection", TypeShape.of(GetMHSMPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Private endpoint connection resource.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetMHSMPrivateEndpointConnectionResult> getMHSMPrivateEndpointConnectionPlain(GetMHSMPrivateEndpointConnectionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:keyvault:getMHSMPrivateEndpointConnection", TypeShape.of(GetMHSMPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource information with extended details.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static Output<GetManagedHsmResult> getManagedHsm(GetManagedHsmArgs args) {
        return getManagedHsm(args, InvokeOptions.Empty);
    }
    /**
     * Resource information with extended details.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetManagedHsmResult> getManagedHsmPlain(GetManagedHsmPlainArgs args) {
        return getManagedHsmPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource information with extended details.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static Output<GetManagedHsmResult> getManagedHsm(GetManagedHsmArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:keyvault:getManagedHsm", TypeShape.of(GetManagedHsmResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource information with extended details.
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetManagedHsmResult> getManagedHsmPlain(GetManagedHsmPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:keyvault:getManagedHsm", TypeShape.of(GetManagedHsmResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Private endpoint connection resource.
     * API Version: 2019-09-01.
     * 
     */
    public static Output<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    /**
     * Private endpoint connection resource.
     * API Version: 2019-09-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnectionPlain(GetPrivateEndpointConnectionPlainArgs args) {
        return getPrivateEndpointConnectionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Private endpoint connection resource.
     * API Version: 2019-09-01.
     * 
     */
    public static Output<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:keyvault:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Private endpoint connection resource.
     * API Version: 2019-09-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnectionPlain(GetPrivateEndpointConnectionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:keyvault:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource information with extended details.
     * API Version: 2019-09-01.
     * 
     */
    public static Output<GetSecretResult> getSecret(GetSecretArgs args) {
        return getSecret(args, InvokeOptions.Empty);
    }
    /**
     * Resource information with extended details.
     * API Version: 2019-09-01.
     * 
     */
    public static CompletableFuture<GetSecretResult> getSecretPlain(GetSecretPlainArgs args) {
        return getSecretPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource information with extended details.
     * API Version: 2019-09-01.
     * 
     */
    public static Output<GetSecretResult> getSecret(GetSecretArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:keyvault:getSecret", TypeShape.of(GetSecretResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource information with extended details.
     * API Version: 2019-09-01.
     * 
     */
    public static CompletableFuture<GetSecretResult> getSecretPlain(GetSecretPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:keyvault:getSecret", TypeShape.of(GetSecretResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource information with extended details.
     * API Version: 2019-09-01.
     * 
     */
    public static Output<GetVaultResult> getVault(GetVaultArgs args) {
        return getVault(args, InvokeOptions.Empty);
    }
    /**
     * Resource information with extended details.
     * API Version: 2019-09-01.
     * 
     */
    public static CompletableFuture<GetVaultResult> getVaultPlain(GetVaultPlainArgs args) {
        return getVaultPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource information with extended details.
     * API Version: 2019-09-01.
     * 
     */
    public static Output<GetVaultResult> getVault(GetVaultArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:keyvault:getVault", TypeShape.of(GetVaultResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource information with extended details.
     * API Version: 2019-09-01.
     * 
     */
    public static CompletableFuture<GetVaultResult> getVaultPlain(GetVaultPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:keyvault:getVault", TypeShape.of(GetVaultResult.class), args, Utilities.withVersion(options));
    }
}
