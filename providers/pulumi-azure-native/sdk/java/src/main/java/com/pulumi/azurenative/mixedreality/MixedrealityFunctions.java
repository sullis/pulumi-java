// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mixedreality;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.mixedreality.inputs.GetObjectAnchorsAccountArgs;
import com.pulumi.azurenative.mixedreality.inputs.GetObjectAnchorsAccountPlainArgs;
import com.pulumi.azurenative.mixedreality.inputs.GetRemoteRenderingAccountArgs;
import com.pulumi.azurenative.mixedreality.inputs.GetRemoteRenderingAccountPlainArgs;
import com.pulumi.azurenative.mixedreality.inputs.GetSpatialAnchorsAccountArgs;
import com.pulumi.azurenative.mixedreality.inputs.GetSpatialAnchorsAccountPlainArgs;
import com.pulumi.azurenative.mixedreality.inputs.ListObjectAnchorsAccountKeysArgs;
import com.pulumi.azurenative.mixedreality.inputs.ListObjectAnchorsAccountKeysPlainArgs;
import com.pulumi.azurenative.mixedreality.inputs.ListRemoteRenderingAccountKeysArgs;
import com.pulumi.azurenative.mixedreality.inputs.ListRemoteRenderingAccountKeysPlainArgs;
import com.pulumi.azurenative.mixedreality.inputs.ListSpatialAnchorsAccountKeysArgs;
import com.pulumi.azurenative.mixedreality.inputs.ListSpatialAnchorsAccountKeysPlainArgs;
import com.pulumi.azurenative.mixedreality.outputs.GetObjectAnchorsAccountResult;
import com.pulumi.azurenative.mixedreality.outputs.GetRemoteRenderingAccountResult;
import com.pulumi.azurenative.mixedreality.outputs.GetSpatialAnchorsAccountResult;
import com.pulumi.azurenative.mixedreality.outputs.ListObjectAnchorsAccountKeysResult;
import com.pulumi.azurenative.mixedreality.outputs.ListRemoteRenderingAccountKeysResult;
import com.pulumi.azurenative.mixedreality.outputs.ListSpatialAnchorsAccountKeysResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class MixedrealityFunctions {
    /**
     * ObjectAnchorsAccount Response.
     * API Version: 2021-03-01-preview.
     * 
     */
    public static Output<GetObjectAnchorsAccountResult> getObjectAnchorsAccount(GetObjectAnchorsAccountArgs args) {
        return getObjectAnchorsAccount(args, InvokeOptions.Empty);
    }
    /**
     * ObjectAnchorsAccount Response.
     * API Version: 2021-03-01-preview.
     * 
     */
    public static CompletableFuture<GetObjectAnchorsAccountResult> getObjectAnchorsAccountPlain(GetObjectAnchorsAccountPlainArgs args) {
        return getObjectAnchorsAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * ObjectAnchorsAccount Response.
     * API Version: 2021-03-01-preview.
     * 
     */
    public static Output<GetObjectAnchorsAccountResult> getObjectAnchorsAccount(GetObjectAnchorsAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:mixedreality:getObjectAnchorsAccount", TypeShape.of(GetObjectAnchorsAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ObjectAnchorsAccount Response.
     * API Version: 2021-03-01-preview.
     * 
     */
    public static CompletableFuture<GetObjectAnchorsAccountResult> getObjectAnchorsAccountPlain(GetObjectAnchorsAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:mixedreality:getObjectAnchorsAccount", TypeShape.of(GetObjectAnchorsAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * RemoteRenderingAccount Response.
     * API Version: 2021-01-01.
     * 
     */
    public static Output<GetRemoteRenderingAccountResult> getRemoteRenderingAccount(GetRemoteRenderingAccountArgs args) {
        return getRemoteRenderingAccount(args, InvokeOptions.Empty);
    }
    /**
     * RemoteRenderingAccount Response.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetRemoteRenderingAccountResult> getRemoteRenderingAccountPlain(GetRemoteRenderingAccountPlainArgs args) {
        return getRemoteRenderingAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * RemoteRenderingAccount Response.
     * API Version: 2021-01-01.
     * 
     */
    public static Output<GetRemoteRenderingAccountResult> getRemoteRenderingAccount(GetRemoteRenderingAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:mixedreality:getRemoteRenderingAccount", TypeShape.of(GetRemoteRenderingAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * RemoteRenderingAccount Response.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetRemoteRenderingAccountResult> getRemoteRenderingAccountPlain(GetRemoteRenderingAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:mixedreality:getRemoteRenderingAccount", TypeShape.of(GetRemoteRenderingAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * SpatialAnchorsAccount Response.
     * API Version: 2021-01-01.
     * 
     */
    public static Output<GetSpatialAnchorsAccountResult> getSpatialAnchorsAccount(GetSpatialAnchorsAccountArgs args) {
        return getSpatialAnchorsAccount(args, InvokeOptions.Empty);
    }
    /**
     * SpatialAnchorsAccount Response.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetSpatialAnchorsAccountResult> getSpatialAnchorsAccountPlain(GetSpatialAnchorsAccountPlainArgs args) {
        return getSpatialAnchorsAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * SpatialAnchorsAccount Response.
     * API Version: 2021-01-01.
     * 
     */
    public static Output<GetSpatialAnchorsAccountResult> getSpatialAnchorsAccount(GetSpatialAnchorsAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:mixedreality:getSpatialAnchorsAccount", TypeShape.of(GetSpatialAnchorsAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * SpatialAnchorsAccount Response.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetSpatialAnchorsAccountResult> getSpatialAnchorsAccountPlain(GetSpatialAnchorsAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:mixedreality:getSpatialAnchorsAccount", TypeShape.of(GetSpatialAnchorsAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Developer Keys of account
     * API Version: 2021-03-01-preview.
     * 
     */
    public static Output<ListObjectAnchorsAccountKeysResult> listObjectAnchorsAccountKeys(ListObjectAnchorsAccountKeysArgs args) {
        return listObjectAnchorsAccountKeys(args, InvokeOptions.Empty);
    }
    /**
     * Developer Keys of account
     * API Version: 2021-03-01-preview.
     * 
     */
    public static CompletableFuture<ListObjectAnchorsAccountKeysResult> listObjectAnchorsAccountKeysPlain(ListObjectAnchorsAccountKeysPlainArgs args) {
        return listObjectAnchorsAccountKeysPlain(args, InvokeOptions.Empty);
    }
    /**
     * Developer Keys of account
     * API Version: 2021-03-01-preview.
     * 
     */
    public static Output<ListObjectAnchorsAccountKeysResult> listObjectAnchorsAccountKeys(ListObjectAnchorsAccountKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:mixedreality:listObjectAnchorsAccountKeys", TypeShape.of(ListObjectAnchorsAccountKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Developer Keys of account
     * API Version: 2021-03-01-preview.
     * 
     */
    public static CompletableFuture<ListObjectAnchorsAccountKeysResult> listObjectAnchorsAccountKeysPlain(ListObjectAnchorsAccountKeysPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:mixedreality:listObjectAnchorsAccountKeys", TypeShape.of(ListObjectAnchorsAccountKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Developer Keys of account
     * API Version: 2021-01-01.
     * 
     */
    public static Output<ListRemoteRenderingAccountKeysResult> listRemoteRenderingAccountKeys(ListRemoteRenderingAccountKeysArgs args) {
        return listRemoteRenderingAccountKeys(args, InvokeOptions.Empty);
    }
    /**
     * Developer Keys of account
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<ListRemoteRenderingAccountKeysResult> listRemoteRenderingAccountKeysPlain(ListRemoteRenderingAccountKeysPlainArgs args) {
        return listRemoteRenderingAccountKeysPlain(args, InvokeOptions.Empty);
    }
    /**
     * Developer Keys of account
     * API Version: 2021-01-01.
     * 
     */
    public static Output<ListRemoteRenderingAccountKeysResult> listRemoteRenderingAccountKeys(ListRemoteRenderingAccountKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:mixedreality:listRemoteRenderingAccountKeys", TypeShape.of(ListRemoteRenderingAccountKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Developer Keys of account
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<ListRemoteRenderingAccountKeysResult> listRemoteRenderingAccountKeysPlain(ListRemoteRenderingAccountKeysPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:mixedreality:listRemoteRenderingAccountKeys", TypeShape.of(ListRemoteRenderingAccountKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Developer Keys of account
     * API Version: 2021-01-01.
     * 
     */
    public static Output<ListSpatialAnchorsAccountKeysResult> listSpatialAnchorsAccountKeys(ListSpatialAnchorsAccountKeysArgs args) {
        return listSpatialAnchorsAccountKeys(args, InvokeOptions.Empty);
    }
    /**
     * Developer Keys of account
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<ListSpatialAnchorsAccountKeysResult> listSpatialAnchorsAccountKeysPlain(ListSpatialAnchorsAccountKeysPlainArgs args) {
        return listSpatialAnchorsAccountKeysPlain(args, InvokeOptions.Empty);
    }
    /**
     * Developer Keys of account
     * API Version: 2021-01-01.
     * 
     */
    public static Output<ListSpatialAnchorsAccountKeysResult> listSpatialAnchorsAccountKeys(ListSpatialAnchorsAccountKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:mixedreality:listSpatialAnchorsAccountKeys", TypeShape.of(ListSpatialAnchorsAccountKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Developer Keys of account
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<ListSpatialAnchorsAccountKeysResult> listSpatialAnchorsAccountKeysPlain(ListSpatialAnchorsAccountKeysPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:mixedreality:listSpatialAnchorsAccountKeys", TypeShape.of(ListSpatialAnchorsAccountKeysResult.class), args, Utilities.withVersion(options));
    }
}
