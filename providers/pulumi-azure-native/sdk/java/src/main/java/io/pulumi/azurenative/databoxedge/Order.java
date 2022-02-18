// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.OrderArgs;
import io.pulumi.azurenative.databoxedge.outputs.AddressResponse;
import io.pulumi.azurenative.databoxedge.outputs.ContactDetailsResponse;
import io.pulumi.azurenative.databoxedge.outputs.OrderStatusResponse;
import io.pulumi.azurenative.databoxedge.outputs.TrackingInfoResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The order details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:databoxedge:Order default /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/GroupForEdgeAutomation/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/testedgedevice/orders/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:databoxedge:Order")
public class Order extends io.pulumi.resources.CustomResource {
    /**
     * The contact details.
     * 
     */
    @OutputExport(name="contactInformation", type=ContactDetailsResponse.class, parameters={})
    private Output<ContactDetailsResponse> contactInformation;

    /**
     * @return The contact details.
     * 
     */
    public Output<ContactDetailsResponse> getContactInformation() {
        return this.contactInformation;
    }
    /**
     * Current status of the order.
     * 
     */
    @OutputExport(name="currentStatus", type=OrderStatusResponse.class, parameters={})
    private Output<OrderStatusResponse> currentStatus;

    /**
     * @return Current status of the order.
     * 
     */
    public Output<OrderStatusResponse> getCurrentStatus() {
        return this.currentStatus;
    }
    /**
     * Tracking information for the package delivered to the customer whether it has an original or a replacement device.
     * 
     */
    @OutputExport(name="deliveryTrackingInfo", type=List.class, parameters={TrackingInfoResponse.class})
    private Output<List<TrackingInfoResponse>> deliveryTrackingInfo;

    /**
     * @return Tracking information for the package delivered to the customer whether it has an original or a replacement device.
     * 
     */
    public Output<List<TrackingInfoResponse>> getDeliveryTrackingInfo() {
        return this.deliveryTrackingInfo;
    }
    /**
     * The object name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The object name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * List of status changes in the order.
     * 
     */
    @OutputExport(name="orderHistory", type=List.class, parameters={OrderStatusResponse.class})
    private Output<List<OrderStatusResponse>> orderHistory;

    /**
     * @return List of status changes in the order.
     * 
     */
    public Output<List<OrderStatusResponse>> getOrderHistory() {
        return this.orderHistory;
    }
    /**
     * Tracking information for the package returned from the customer whether it has an original or a replacement device.
     * 
     */
    @OutputExport(name="returnTrackingInfo", type=List.class, parameters={TrackingInfoResponse.class})
    private Output<List<TrackingInfoResponse>> returnTrackingInfo;

    /**
     * @return Tracking information for the package returned from the customer whether it has an original or a replacement device.
     * 
     */
    public Output<List<TrackingInfoResponse>> getReturnTrackingInfo() {
        return this.returnTrackingInfo;
    }
    /**
     * Serial number of the device.
     * 
     */
    @OutputExport(name="serialNumber", type=String.class, parameters={})
    private Output<String> serialNumber;

    /**
     * @return Serial number of the device.
     * 
     */
    public Output<String> getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * ShipmentType of the order
     * 
     */
    @OutputExport(name="shipmentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> shipmentType;

    /**
     * @return ShipmentType of the order
     * 
     */
    public Output</* @Nullable */ String> getShipmentType() {
        return this.shipmentType;
    }
    /**
     * The shipping address.
     * 
     */
    @OutputExport(name="shippingAddress", type=AddressResponse.class, parameters={})
    private Output</* @Nullable */ AddressResponse> shippingAddress;

    /**
     * @return The shipping address.
     * 
     */
    public Output</* @Nullable */ AddressResponse> getShippingAddress() {
        return this.shippingAddress;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
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
    public Order(String name, OrderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:Order", name, args == null ? OrderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Order(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:Order", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20190301:Order").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20190701:Order").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20190801:Order").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200501preview:Order").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200901:Order").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200901preview:Order").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20201201:Order").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210201:Order").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210201preview:Order").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210601:Order").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210601preview:Order").build())
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
    public static Order get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Order(name, id, options);
    }
}
