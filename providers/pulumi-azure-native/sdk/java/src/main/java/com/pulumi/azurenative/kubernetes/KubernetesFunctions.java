// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetes;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.kubernetes.inputs.GetConnectedClusterArgs;
import com.pulumi.azurenative.kubernetes.inputs.GetConnectedClusterPlainArgs;
import com.pulumi.azurenative.kubernetes.inputs.ListConnectedClusterUserCredentialArgs;
import com.pulumi.azurenative.kubernetes.inputs.ListConnectedClusterUserCredentialPlainArgs;
import com.pulumi.azurenative.kubernetes.inputs.ListConnectedClusterUserCredentialsArgs;
import com.pulumi.azurenative.kubernetes.inputs.ListConnectedClusterUserCredentialsPlainArgs;
import com.pulumi.azurenative.kubernetes.outputs.GetConnectedClusterResult;
import com.pulumi.azurenative.kubernetes.outputs.ListConnectedClusterUserCredentialResult;
import com.pulumi.azurenative.kubernetes.outputs.ListConnectedClusterUserCredentialsResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class KubernetesFunctions {
    /**
     * Represents a connected cluster.
     * API Version: 2021-03-01.
     * 
     */
    public static Output<GetConnectedClusterResult> getConnectedCluster(GetConnectedClusterArgs args) {
        return getConnectedCluster(args, InvokeOptions.Empty);
    }
    /**
     * Represents a connected cluster.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetConnectedClusterResult> getConnectedClusterPlain(GetConnectedClusterPlainArgs args) {
        return getConnectedClusterPlain(args, InvokeOptions.Empty);
    }
    /**
     * Represents a connected cluster.
     * API Version: 2021-03-01.
     * 
     */
    public static Output<GetConnectedClusterResult> getConnectedCluster(GetConnectedClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:kubernetes:getConnectedCluster", TypeShape.of(GetConnectedClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a connected cluster.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetConnectedClusterResult> getConnectedClusterPlain(GetConnectedClusterPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kubernetes:getConnectedCluster", TypeShape.of(GetConnectedClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The list of credential result response.
     * API Version: 2021-10-01.
     * 
     */
    public static Output<ListConnectedClusterUserCredentialResult> listConnectedClusterUserCredential(ListConnectedClusterUserCredentialArgs args) {
        return listConnectedClusterUserCredential(args, InvokeOptions.Empty);
    }
    /**
     * The list of credential result response.
     * API Version: 2021-10-01.
     * 
     */
    public static CompletableFuture<ListConnectedClusterUserCredentialResult> listConnectedClusterUserCredentialPlain(ListConnectedClusterUserCredentialPlainArgs args) {
        return listConnectedClusterUserCredentialPlain(args, InvokeOptions.Empty);
    }
    /**
     * The list of credential result response.
     * API Version: 2021-10-01.
     * 
     */
    public static Output<ListConnectedClusterUserCredentialResult> listConnectedClusterUserCredential(ListConnectedClusterUserCredentialArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:kubernetes:listConnectedClusterUserCredential", TypeShape.of(ListConnectedClusterUserCredentialResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The list of credential result response.
     * API Version: 2021-10-01.
     * 
     */
    public static CompletableFuture<ListConnectedClusterUserCredentialResult> listConnectedClusterUserCredentialPlain(ListConnectedClusterUserCredentialPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kubernetes:listConnectedClusterUserCredential", TypeShape.of(ListConnectedClusterUserCredentialResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The list of credential result response.
     * API Version: 2021-04-01-preview.
     * 
     */
    public static Output<ListConnectedClusterUserCredentialsResult> listConnectedClusterUserCredentials(ListConnectedClusterUserCredentialsArgs args) {
        return listConnectedClusterUserCredentials(args, InvokeOptions.Empty);
    }
    /**
     * The list of credential result response.
     * API Version: 2021-04-01-preview.
     * 
     */
    public static CompletableFuture<ListConnectedClusterUserCredentialsResult> listConnectedClusterUserCredentialsPlain(ListConnectedClusterUserCredentialsPlainArgs args) {
        return listConnectedClusterUserCredentialsPlain(args, InvokeOptions.Empty);
    }
    /**
     * The list of credential result response.
     * API Version: 2021-04-01-preview.
     * 
     */
    public static Output<ListConnectedClusterUserCredentialsResult> listConnectedClusterUserCredentials(ListConnectedClusterUserCredentialsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:kubernetes:listConnectedClusterUserCredentials", TypeShape.of(ListConnectedClusterUserCredentialsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The list of credential result response.
     * API Version: 2021-04-01-preview.
     * 
     */
    public static CompletableFuture<ListConnectedClusterUserCredentialsResult> listConnectedClusterUserCredentialsPlain(ListConnectedClusterUserCredentialsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kubernetes:listConnectedClusterUserCredentials", TypeShape.of(ListConnectedClusterUserCredentialsResult.class), args, Utilities.withVersion(options));
    }
}
