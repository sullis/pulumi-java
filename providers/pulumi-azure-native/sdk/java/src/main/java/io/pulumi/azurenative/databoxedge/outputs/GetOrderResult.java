// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.AddressResponse;
import io.pulumi.azurenative.databoxedge.outputs.ContactDetailsResponse;
import io.pulumi.azurenative.databoxedge.outputs.OrderStatusResponse;
import io.pulumi.azurenative.databoxedge.outputs.TrackingInfoResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetOrderResult {
    /**
     * The contact details.
     * 
     */
    private final ContactDetailsResponse contactInformation;
    /**
     * Current status of the order.
     * 
     */
    private final OrderStatusResponse currentStatus;
    /**
     * Tracking information for the package delivered to the customer whether it has an original or a replacement device.
     * 
     */
    private final List<TrackingInfoResponse> deliveryTrackingInfo;
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * The object name.
     * 
     */
    private final String name;
    /**
     * List of status changes in the order.
     * 
     */
    private final List<OrderStatusResponse> orderHistory;
    /**
     * Tracking information for the package returned from the customer whether it has an original or a replacement device.
     * 
     */
    private final List<TrackingInfoResponse> returnTrackingInfo;
    /**
     * Serial number of the device.
     * 
     */
    private final String serialNumber;
    /**
     * ShipmentType of the order
     * 
     */
    private final @Nullable String shipmentType;
    /**
     * The shipping address.
     * 
     */
    private final @Nullable AddressResponse shippingAddress;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"contactInformation","currentStatus","deliveryTrackingInfo","id","name","orderHistory","returnTrackingInfo","serialNumber","shipmentType","shippingAddress","type"})
    private GetOrderResult(
        ContactDetailsResponse contactInformation,
        OrderStatusResponse currentStatus,
        List<TrackingInfoResponse> deliveryTrackingInfo,
        String id,
        String name,
        List<OrderStatusResponse> orderHistory,
        List<TrackingInfoResponse> returnTrackingInfo,
        String serialNumber,
        @Nullable String shipmentType,
        @Nullable AddressResponse shippingAddress,
        String type) {
        this.contactInformation = Objects.requireNonNull(contactInformation);
        this.currentStatus = Objects.requireNonNull(currentStatus);
        this.deliveryTrackingInfo = Objects.requireNonNull(deliveryTrackingInfo);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.orderHistory = Objects.requireNonNull(orderHistory);
        this.returnTrackingInfo = Objects.requireNonNull(returnTrackingInfo);
        this.serialNumber = Objects.requireNonNull(serialNumber);
        this.shipmentType = shipmentType;
        this.shippingAddress = shippingAddress;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The contact details.
     * 
     */
    public ContactDetailsResponse getContactInformation() {
        return this.contactInformation;
    }
    /**
     * Current status of the order.
     * 
     */
    public OrderStatusResponse getCurrentStatus() {
        return this.currentStatus;
    }
    /**
     * Tracking information for the package delivered to the customer whether it has an original or a replacement device.
     * 
     */
    public List<TrackingInfoResponse> getDeliveryTrackingInfo() {
        return this.deliveryTrackingInfo;
    }
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The object name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * List of status changes in the order.
     * 
     */
    public List<OrderStatusResponse> getOrderHistory() {
        return this.orderHistory;
    }
    /**
     * Tracking information for the package returned from the customer whether it has an original or a replacement device.
     * 
     */
    public List<TrackingInfoResponse> getReturnTrackingInfo() {
        return this.returnTrackingInfo;
    }
    /**
     * Serial number of the device.
     * 
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * ShipmentType of the order
     * 
     */
    public Optional<String> getShipmentType() {
        return Optional.ofNullable(this.shipmentType);
    }
    /**
     * The shipping address.
     * 
     */
    public Optional<AddressResponse> getShippingAddress() {
        return Optional.ofNullable(this.shippingAddress);
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactDetailsResponse contactInformation;
        private OrderStatusResponse currentStatus;
        private List<TrackingInfoResponse> deliveryTrackingInfo;
        private String id;
        private String name;
        private List<OrderStatusResponse> orderHistory;
        private List<TrackingInfoResponse> returnTrackingInfo;
        private String serialNumber;
        private @Nullable String shipmentType;
        private @Nullable AddressResponse shippingAddress;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactInformation = defaults.contactInformation;
    	      this.currentStatus = defaults.currentStatus;
    	      this.deliveryTrackingInfo = defaults.deliveryTrackingInfo;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.orderHistory = defaults.orderHistory;
    	      this.returnTrackingInfo = defaults.returnTrackingInfo;
    	      this.serialNumber = defaults.serialNumber;
    	      this.shipmentType = defaults.shipmentType;
    	      this.shippingAddress = defaults.shippingAddress;
    	      this.type = defaults.type;
        }

        public Builder setContactInformation(ContactDetailsResponse contactInformation) {
            this.contactInformation = Objects.requireNonNull(contactInformation);
            return this;
        }

        public Builder setCurrentStatus(OrderStatusResponse currentStatus) {
            this.currentStatus = Objects.requireNonNull(currentStatus);
            return this;
        }

        public Builder setDeliveryTrackingInfo(List<TrackingInfoResponse> deliveryTrackingInfo) {
            this.deliveryTrackingInfo = Objects.requireNonNull(deliveryTrackingInfo);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOrderHistory(List<OrderStatusResponse> orderHistory) {
            this.orderHistory = Objects.requireNonNull(orderHistory);
            return this;
        }

        public Builder setReturnTrackingInfo(List<TrackingInfoResponse> returnTrackingInfo) {
            this.returnTrackingInfo = Objects.requireNonNull(returnTrackingInfo);
            return this;
        }

        public Builder setSerialNumber(String serialNumber) {
            this.serialNumber = Objects.requireNonNull(serialNumber);
            return this;
        }

        public Builder setShipmentType(@Nullable String shipmentType) {
            this.shipmentType = shipmentType;
            return this;
        }

        public Builder setShippingAddress(@Nullable AddressResponse shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetOrderResult build() {
            return new GetOrderResult(contactInformation, currentStatus, deliveryTrackingInfo, id, name, orderHistory, returnTrackingInfo, serialNumber, shipmentType, shippingAddress, type);
        }
    }
}
