// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.communication;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.communication.inputs.GetCommunicationServiceArgs;
import com.pulumi.azurenative.communication.inputs.GetCommunicationServicePlainArgs;
import com.pulumi.azurenative.communication.inputs.ListCommunicationServiceKeysArgs;
import com.pulumi.azurenative.communication.inputs.ListCommunicationServiceKeysPlainArgs;
import com.pulumi.azurenative.communication.outputs.GetCommunicationServiceResult;
import com.pulumi.azurenative.communication.outputs.ListCommunicationServiceKeysResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CommunicationFunctions {
    /**
     * A class representing a CommunicationService resource.
     * API Version: 2020-08-20.
     * 
     */
    public static Output<GetCommunicationServiceResult> getCommunicationService(GetCommunicationServiceArgs args) {
        return getCommunicationService(args, InvokeOptions.Empty);
    }
    /**
     * A class representing a CommunicationService resource.
     * API Version: 2020-08-20.
     * 
     */
    public static CompletableFuture<GetCommunicationServiceResult> getCommunicationServicePlain(GetCommunicationServicePlainArgs args) {
        return getCommunicationServicePlain(args, InvokeOptions.Empty);
    }
    /**
     * A class representing a CommunicationService resource.
     * API Version: 2020-08-20.
     * 
     */
    public static Output<GetCommunicationServiceResult> getCommunicationService(GetCommunicationServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:communication:getCommunicationService", TypeShape.of(GetCommunicationServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A class representing a CommunicationService resource.
     * API Version: 2020-08-20.
     * 
     */
    public static CompletableFuture<GetCommunicationServiceResult> getCommunicationServicePlain(GetCommunicationServicePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:communication:getCommunicationService", TypeShape.of(GetCommunicationServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A class representing the access keys of a CommunicationService.
     * API Version: 2020-08-20.
     * 
     */
    public static Output<ListCommunicationServiceKeysResult> listCommunicationServiceKeys(ListCommunicationServiceKeysArgs args) {
        return listCommunicationServiceKeys(args, InvokeOptions.Empty);
    }
    /**
     * A class representing the access keys of a CommunicationService.
     * API Version: 2020-08-20.
     * 
     */
    public static CompletableFuture<ListCommunicationServiceKeysResult> listCommunicationServiceKeysPlain(ListCommunicationServiceKeysPlainArgs args) {
        return listCommunicationServiceKeysPlain(args, InvokeOptions.Empty);
    }
    /**
     * A class representing the access keys of a CommunicationService.
     * API Version: 2020-08-20.
     * 
     */
    public static Output<ListCommunicationServiceKeysResult> listCommunicationServiceKeys(ListCommunicationServiceKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:communication:listCommunicationServiceKeys", TypeShape.of(ListCommunicationServiceKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A class representing the access keys of a CommunicationService.
     * API Version: 2020-08-20.
     * 
     */
    public static CompletableFuture<ListCommunicationServiceKeysResult> listCommunicationServiceKeysPlain(ListCommunicationServiceKeysPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:communication:listCommunicationServiceKeys", TypeShape.of(ListCommunicationServiceKeysResult.class), args, Utilities.withVersion(options));
    }
}
