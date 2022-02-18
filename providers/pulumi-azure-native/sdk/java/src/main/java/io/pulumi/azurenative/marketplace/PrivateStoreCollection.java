// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.marketplace;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.marketplace.PrivateStoreCollectionArgs;
import io.pulumi.azurenative.marketplace.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The Collection data structure.
 * API Version: 2021-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:marketplace:PrivateStoreCollection d0f5aa2c-ecc3-4d87-906a-f8c486dcc4f1 providers/Microsoft.Marketplace/privateStores/a0e28e55-90c4-41d8-8e34-bb7ef7775406/collections/d0f5aa2c-ecc3-4d87-906a-f8c486dcc4f1 
 * ```
 * 
 */
@ResourceType(type="azure-native:marketplace:PrivateStoreCollection")
public class PrivateStoreCollection extends io.pulumi.resources.CustomResource {
    /**
     * Indicating whether all subscriptions are selected (=true) or not (=false).
     * 
     */
    @OutputExport(name="allSubscriptions", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allSubscriptions;

    /**
     * @return Indicating whether all subscriptions are selected (=true) or not (=false).
     * 
     */
    public Output</* @Nullable */ Boolean> getAllSubscriptions() {
        return this.allSubscriptions;
    }
    /**
     * Gets or sets the association with Commercial's Billing Account.
     * 
     */
    @OutputExport(name="claim", type=String.class, parameters={})
    private Output</* @Nullable */ String> claim;

    /**
     * @return Gets or sets the association with Commercial's Billing Account.
     * 
     */
    public Output</* @Nullable */ String> getClaim() {
        return this.claim;
    }
    /**
     * Gets collection Id.
     * 
     */
    @OutputExport(name="collectionId", type=String.class, parameters={})
    private Output<String> collectionId;

    /**
     * @return Gets collection Id.
     * 
     */
    public Output<String> getCollectionId() {
        return this.collectionId;
    }
    /**
     * Gets or sets collection name.
     * 
     */
    @OutputExport(name="collectionName", type=String.class, parameters={})
    private Output</* @Nullable */ String> collectionName;

    /**
     * @return Gets or sets collection name.
     * 
     */
    public Output</* @Nullable */ String> getCollectionName() {
        return this.collectionName;
    }
    /**
     * Indicating whether the collection is enabled or disabled.
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Indicating whether the collection is enabled or disabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Gets the number of offers associated with the collection.
     * 
     */
    @OutputExport(name="numberOfOffers", type=Double.class, parameters={})
    private Output<Double> numberOfOffers;

    /**
     * @return Gets the number of offers associated with the collection.
     * 
     */
    public Output<Double> getNumberOfOffers() {
        return this.numberOfOffers;
    }
    /**
     * Gets or sets subscription ids list. Empty list indicates all subscriptions are selected, null indicates no update is done, explicit list indicates the explicit selected subscriptions. On insert, null is considered as bad request
     * 
     */
    @OutputExport(name="subscriptionsList", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> subscriptionsList;

    /**
     * @return Gets or sets subscription ids list. Empty list indicates all subscriptions are selected, null indicates no update is done, explicit list indicates the explicit selected subscriptions. On insert, null is considered as bad request
     * 
     */
    public Output</* @Nullable */ List<String>> getSubscriptionsList() {
        return this.subscriptionsList;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateStoreCollection(String name, PrivateStoreCollectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:marketplace:PrivateStoreCollection", name, args == null ? PrivateStoreCollectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateStoreCollection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:marketplace:PrivateStoreCollection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:marketplace/v20210601:PrivateStoreCollection").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PrivateStoreCollection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateStoreCollection(name, id, options);
    }
}
