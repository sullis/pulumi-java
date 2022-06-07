// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.orbital;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.orbital.inputs.GetContactArgs;
import com.pulumi.azurenative.orbital.inputs.GetContactPlainArgs;
import com.pulumi.azurenative.orbital.inputs.GetContactProfileArgs;
import com.pulumi.azurenative.orbital.inputs.GetContactProfilePlainArgs;
import com.pulumi.azurenative.orbital.inputs.GetSpacecraftArgs;
import com.pulumi.azurenative.orbital.inputs.GetSpacecraftPlainArgs;
import com.pulumi.azurenative.orbital.inputs.ListSpacecraftAvailableContactsArgs;
import com.pulumi.azurenative.orbital.inputs.ListSpacecraftAvailableContactsPlainArgs;
import com.pulumi.azurenative.orbital.outputs.GetContactProfileResult;
import com.pulumi.azurenative.orbital.outputs.GetContactResult;
import com.pulumi.azurenative.orbital.outputs.GetSpacecraftResult;
import com.pulumi.azurenative.orbital.outputs.ListSpacecraftAvailableContactsResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class OrbitalFunctions {
    /**
     * Customer creates a contact resource for a spacecraft resource.
     * API Version: 2021-04-04-preview.
     * 
     */
    public static Output<GetContactResult> getContact(GetContactArgs args) {
        return getContact(args, InvokeOptions.Empty);
    }
    /**
     * Customer creates a contact resource for a spacecraft resource.
     * API Version: 2021-04-04-preview.
     * 
     */
    public static CompletableFuture<GetContactResult> getContactPlain(GetContactPlainArgs args) {
        return getContactPlain(args, InvokeOptions.Empty);
    }
    /**
     * Customer creates a contact resource for a spacecraft resource.
     * API Version: 2021-04-04-preview.
     * 
     */
    public static Output<GetContactResult> getContact(GetContactArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:orbital:getContact", TypeShape.of(GetContactResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Customer creates a contact resource for a spacecraft resource.
     * API Version: 2021-04-04-preview.
     * 
     */
    public static CompletableFuture<GetContactResult> getContactPlain(GetContactPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:orbital:getContact", TypeShape.of(GetContactResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Customer creates a Contact Profile Resource, which will contain all of the configurations required for scheduling a contact.
     * API Version: 2021-04-04-preview.
     * 
     */
    public static Output<GetContactProfileResult> getContactProfile(GetContactProfileArgs args) {
        return getContactProfile(args, InvokeOptions.Empty);
    }
    /**
     * Customer creates a Contact Profile Resource, which will contain all of the configurations required for scheduling a contact.
     * API Version: 2021-04-04-preview.
     * 
     */
    public static CompletableFuture<GetContactProfileResult> getContactProfilePlain(GetContactProfilePlainArgs args) {
        return getContactProfilePlain(args, InvokeOptions.Empty);
    }
    /**
     * Customer creates a Contact Profile Resource, which will contain all of the configurations required for scheduling a contact.
     * API Version: 2021-04-04-preview.
     * 
     */
    public static Output<GetContactProfileResult> getContactProfile(GetContactProfileArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:orbital:getContactProfile", TypeShape.of(GetContactProfileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Customer creates a Contact Profile Resource, which will contain all of the configurations required for scheduling a contact.
     * API Version: 2021-04-04-preview.
     * 
     */
    public static CompletableFuture<GetContactProfileResult> getContactProfilePlain(GetContactProfilePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:orbital:getContactProfile", TypeShape.of(GetContactProfileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Customer creates a spacecraft resource to schedule a contact.
     * API Version: 2021-04-04-preview.
     * 
     */
    public static Output<GetSpacecraftResult> getSpacecraft(GetSpacecraftArgs args) {
        return getSpacecraft(args, InvokeOptions.Empty);
    }
    /**
     * Customer creates a spacecraft resource to schedule a contact.
     * API Version: 2021-04-04-preview.
     * 
     */
    public static CompletableFuture<GetSpacecraftResult> getSpacecraftPlain(GetSpacecraftPlainArgs args) {
        return getSpacecraftPlain(args, InvokeOptions.Empty);
    }
    /**
     * Customer creates a spacecraft resource to schedule a contact.
     * API Version: 2021-04-04-preview.
     * 
     */
    public static Output<GetSpacecraftResult> getSpacecraft(GetSpacecraftArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:orbital:getSpacecraft", TypeShape.of(GetSpacecraftResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Customer creates a spacecraft resource to schedule a contact.
     * API Version: 2021-04-04-preview.
     * 
     */
    public static CompletableFuture<GetSpacecraftResult> getSpacecraftPlain(GetSpacecraftPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:orbital:getSpacecraft", TypeShape.of(GetSpacecraftResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Response for the ListAvailableContacts API service call.
     * API Version: 2021-04-04-preview.
     * 
     */
    public static Output<ListSpacecraftAvailableContactsResult> listSpacecraftAvailableContacts(ListSpacecraftAvailableContactsArgs args) {
        return listSpacecraftAvailableContacts(args, InvokeOptions.Empty);
    }
    /**
     * Response for the ListAvailableContacts API service call.
     * API Version: 2021-04-04-preview.
     * 
     */
    public static CompletableFuture<ListSpacecraftAvailableContactsResult> listSpacecraftAvailableContactsPlain(ListSpacecraftAvailableContactsPlainArgs args) {
        return listSpacecraftAvailableContactsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Response for the ListAvailableContacts API service call.
     * API Version: 2021-04-04-preview.
     * 
     */
    public static Output<ListSpacecraftAvailableContactsResult> listSpacecraftAvailableContacts(ListSpacecraftAvailableContactsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:orbital:listSpacecraftAvailableContacts", TypeShape.of(ListSpacecraftAvailableContactsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Response for the ListAvailableContacts API service call.
     * API Version: 2021-04-04-preview.
     * 
     */
    public static CompletableFuture<ListSpacecraftAvailableContactsResult> listSpacecraftAvailableContactsPlain(ListSpacecraftAvailableContactsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:orbital:listSpacecraftAvailableContacts", TypeShape.of(ListSpacecraftAvailableContactsResult.class), args, Utilities.withVersion(options));
    }
}
