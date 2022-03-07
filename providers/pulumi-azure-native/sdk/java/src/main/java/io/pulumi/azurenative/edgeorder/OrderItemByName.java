// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.edgeorder.OrderItemByNameArgs;
import io.pulumi.azurenative.edgeorder.outputs.AddressDetailsResponse;
import io.pulumi.azurenative.edgeorder.outputs.OrderItemDetailsResponse;
import io.pulumi.azurenative.edgeorder.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Represents order item contract
 * API Version: 2021-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:edgeorder:OrderItemByName TestOrderItemName01 /subscriptions/fa68082f-8ff7-4a25-95c7-ce9da541242f/resourceGroups/TestRG/providers/Microsoft.EdgeOrder/orderItems/TestOrderItemName01 
 * ```
 * 
 */
@ResourceType(type="azure-native:edgeorder:OrderItemByName")
public class OrderItemByName extends io.pulumi.resources.CustomResource {
    /**
     * Represents shipping and return address for order item
     * 
     */
    @OutputExport(name="addressDetails", type=AddressDetailsResponse.class, parameters={})
    private Output<AddressDetailsResponse> addressDetails;

    /**
     * @return Represents shipping and return address for order item
     * 
     */
    public Output<AddressDetailsResponse> getAddressDetails() {
        return this.addressDetails;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Id of the order to which order item belongs to
     * 
     */
    @OutputExport(name="orderId", type=String.class, parameters={})
    private Output<String> orderId;

    /**
     * @return Id of the order to which order item belongs to
     * 
     */
    public Output<String> getOrderId() {
        return this.orderId;
    }
    /**
     * Represents order item details.
     * 
     */
    @OutputExport(name="orderItemDetails", type=OrderItemDetailsResponse.class, parameters={})
    private Output<OrderItemDetailsResponse> orderItemDetails;

    /**
     * @return Represents order item details.
     * 
     */
    public Output<OrderItemDetailsResponse> getOrderItemDetails() {
        return this.orderItemDetails;
    }
    /**
     * Start time of order item
     * 
     */
    @OutputExport(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return Start time of order item
     * 
     */
    public Output<String> getStartTime() {
        return this.startTime;
    }
    /**
     * Represents resource creation and update time
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Represents resource creation and update time
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(OrderItemByNameArgs.Builder a);
    }
    private static io.pulumi.azurenative.edgeorder.OrderItemByNameArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.edgeorder.OrderItemByNameArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public OrderItemByName(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrderItemByName(String name) {
        this(name, OrderItemByNameArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrderItemByName(String name, OrderItemByNameArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrderItemByName(String name, OrderItemByNameArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:edgeorder:OrderItemByName", name, args == null ? OrderItemByNameArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private OrderItemByName(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:edgeorder:OrderItemByName", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:edgeorder/v20201201preview:OrderItemByName").build()),
                Input.of(Alias.builder().setType("azure-native:edgeorder/v20211201:OrderItemByName").build())
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
    public static OrderItemByName get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new OrderItemByName(name, id, options);
    }
}