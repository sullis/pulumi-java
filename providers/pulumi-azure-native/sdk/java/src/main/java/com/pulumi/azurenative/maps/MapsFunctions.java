// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.maps;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.maps.inputs.GetAccountArgs;
import com.pulumi.azurenative.maps.inputs.GetCreatorArgs;
import com.pulumi.azurenative.maps.inputs.GetPrivateAtlaseArgs;
import com.pulumi.azurenative.maps.inputs.ListAccountKeysArgs;
import com.pulumi.azurenative.maps.inputs.ListAccountSasArgs;
import com.pulumi.azurenative.maps.outputs.GetAccountResult;
import com.pulumi.azurenative.maps.outputs.GetCreatorResult;
import com.pulumi.azurenative.maps.outputs.GetPrivateAtlaseResult;
import com.pulumi.azurenative.maps.outputs.ListAccountKeysResult;
import com.pulumi.azurenative.maps.outputs.ListAccountSasResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class MapsFunctions {
    /**
     * An Azure resource which represents access to a suite of Maps REST APIs.
     * API Version: 2018-05-01.
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    /**
     * An Azure resource which represents access to a suite of Maps REST APIs.
     * API Version: 2018-05-01.
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:maps:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An Azure resource which represents Maps Creator product and provides ability to manage private location data.
     * API Version: 2020-02-01-preview.
     * 
     */
    public static CompletableFuture<GetCreatorResult> getCreator(GetCreatorArgs args) {
        return getCreator(args, InvokeOptions.Empty);
    }
    /**
     * An Azure resource which represents Maps Creator product and provides ability to manage private location data.
     * API Version: 2020-02-01-preview.
     * 
     */
    public static CompletableFuture<GetCreatorResult> getCreator(GetCreatorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:maps:getCreator", TypeShape.of(GetCreatorResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An Azure resource which represents which will provision the ability to create private location data.
     * API Version: 2020-02-01-preview.
     * 
     */
    public static CompletableFuture<GetPrivateAtlaseResult> getPrivateAtlase(GetPrivateAtlaseArgs args) {
        return getPrivateAtlase(args, InvokeOptions.Empty);
    }
    /**
     * An Azure resource which represents which will provision the ability to create private location data.
     * API Version: 2020-02-01-preview.
     * 
     */
    public static CompletableFuture<GetPrivateAtlaseResult> getPrivateAtlase(GetPrivateAtlaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:maps:getPrivateAtlase", TypeShape.of(GetPrivateAtlaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The set of keys which can be used to access the Maps REST APIs. Two keys are provided for key rotation without interruption.
     * API Version: 2018-05-01.
     * 
     */
    public static CompletableFuture<ListAccountKeysResult> listAccountKeys(ListAccountKeysArgs args) {
        return listAccountKeys(args, InvokeOptions.Empty);
    }
    /**
     * The set of keys which can be used to access the Maps REST APIs. Two keys are provided for key rotation without interruption.
     * API Version: 2018-05-01.
     * 
     */
    public static CompletableFuture<ListAccountKeysResult> listAccountKeys(ListAccountKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:maps:listAccountKeys", TypeShape.of(ListAccountKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A new Sas token which can be used to access the Maps REST APIs and is controlled by the specified Managed identity permissions on Azure (IAM) Role Based Access Control.
     * API Version: 2021-12-01-preview.
     * 
     */
    public static CompletableFuture<ListAccountSasResult> listAccountSas(ListAccountSasArgs args) {
        return listAccountSas(args, InvokeOptions.Empty);
    }
    /**
     * A new Sas token which can be used to access the Maps REST APIs and is controlled by the specified Managed identity permissions on Azure (IAM) Role Based Access Control.
     * API Version: 2021-12-01-preview.
     * 
     */
    public static CompletableFuture<ListAccountSasResult> listAccountSas(ListAccountSasArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:maps:listAccountSas", TypeShape.of(ListAccountSasResult.class), args, Utilities.withVersion(options));
    }
}
