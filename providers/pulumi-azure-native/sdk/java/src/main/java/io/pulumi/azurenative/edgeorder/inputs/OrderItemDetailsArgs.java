// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.enums.OrderItemType;
import io.pulumi.azurenative.edgeorder.inputs.PreferencesArgs;
import io.pulumi.azurenative.edgeorder.inputs.ProductDetailsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Order item details
 * 
 */
public final class OrderItemDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrderItemDetailsArgs Empty = new OrderItemDetailsArgs();

    /**
     * Additional notification email list
     * 
     */
    @InputImport(name="notificationEmailList")
      private final @Nullable Input<List<String>> notificationEmailList;

    public Input<List<String>> getNotificationEmailList() {
        return this.notificationEmailList == null ? Input.empty() : this.notificationEmailList;
    }

    /**
     * Order item type.
     * 
     */
    @InputImport(name="orderItemType", required=true)
      private final Input<Either<String,OrderItemType>> orderItemType;

    public Input<Either<String,OrderItemType>> getOrderItemType() {
        return this.orderItemType;
    }

    /**
     * Customer notification Preferences
     * 
     */
    @InputImport(name="preferences")
      private final @Nullable Input<PreferencesArgs> preferences;

    public Input<PreferencesArgs> getPreferences() {
        return this.preferences == null ? Input.empty() : this.preferences;
    }

    /**
     * Unique identifier for configuration.
     * 
     */
    @InputImport(name="productDetails", required=true)
      private final Input<ProductDetailsArgs> productDetails;

    public Input<ProductDetailsArgs> getProductDetails() {
        return this.productDetails;
    }

    public OrderItemDetailsArgs(
        @Nullable Input<List<String>> notificationEmailList,
        Input<Either<String,OrderItemType>> orderItemType,
        @Nullable Input<PreferencesArgs> preferences,
        Input<ProductDetailsArgs> productDetails) {
        this.notificationEmailList = notificationEmailList;
        this.orderItemType = Objects.requireNonNull(orderItemType, "expected parameter 'orderItemType' to be non-null");
        this.preferences = preferences;
        this.productDetails = Objects.requireNonNull(productDetails, "expected parameter 'productDetails' to be non-null");
    }

    private OrderItemDetailsArgs() {
        this.notificationEmailList = Input.empty();
        this.orderItemType = Input.empty();
        this.preferences = Input.empty();
        this.productDetails = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrderItemDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> notificationEmailList;
        private Input<Either<String,OrderItemType>> orderItemType;
        private @Nullable Input<PreferencesArgs> preferences;
        private Input<ProductDetailsArgs> productDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(OrderItemDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notificationEmailList = defaults.notificationEmailList;
    	      this.orderItemType = defaults.orderItemType;
    	      this.preferences = defaults.preferences;
    	      this.productDetails = defaults.productDetails;
        }

        public Builder setNotificationEmailList(@Nullable Input<List<String>> notificationEmailList) {
            this.notificationEmailList = notificationEmailList;
            return this;
        }

        public Builder setNotificationEmailList(@Nullable List<String> notificationEmailList) {
            this.notificationEmailList = Input.ofNullable(notificationEmailList);
            return this;
        }

        public Builder setOrderItemType(Input<Either<String,OrderItemType>> orderItemType) {
            this.orderItemType = Objects.requireNonNull(orderItemType);
            return this;
        }

        public Builder setOrderItemType(Either<String,OrderItemType> orderItemType) {
            this.orderItemType = Input.of(Objects.requireNonNull(orderItemType));
            return this;
        }

        public Builder setPreferences(@Nullable Input<PreferencesArgs> preferences) {
            this.preferences = preferences;
            return this;
        }

        public Builder setPreferences(@Nullable PreferencesArgs preferences) {
            this.preferences = Input.ofNullable(preferences);
            return this;
        }

        public Builder setProductDetails(Input<ProductDetailsArgs> productDetails) {
            this.productDetails = Objects.requireNonNull(productDetails);
            return this;
        }

        public Builder setProductDetails(ProductDetailsArgs productDetails) {
            this.productDetails = Input.of(Objects.requireNonNull(productDetails));
            return this;
        }
        public OrderItemDetailsArgs build() {
            return new OrderItemDetailsArgs(notificationEmailList, orderItemType, preferences, productDetails);
        }
    }
}