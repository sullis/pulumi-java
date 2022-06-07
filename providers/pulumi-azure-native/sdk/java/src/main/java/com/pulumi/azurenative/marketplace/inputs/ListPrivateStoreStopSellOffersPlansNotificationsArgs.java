// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.marketplace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListPrivateStoreStopSellOffersPlansNotificationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListPrivateStoreStopSellOffersPlansNotificationsArgs Empty = new ListPrivateStoreStopSellOffersPlansNotificationsArgs();

    /**
     * The store ID - must use the tenant ID
     * 
     */
    @Import(name="privateStoreId", required=true)
    private Output<String> privateStoreId;

    /**
     * @return The store ID - must use the tenant ID
     * 
     */
    public Output<String> privateStoreId() {
        return this.privateStoreId;
    }

    @Import(name="subscriptions")
    private @Nullable Output<List<String>> subscriptions;

    public Optional<Output<List<String>>> subscriptions() {
        return Optional.ofNullable(this.subscriptions);
    }

    private ListPrivateStoreStopSellOffersPlansNotificationsArgs() {}

    private ListPrivateStoreStopSellOffersPlansNotificationsArgs(ListPrivateStoreStopSellOffersPlansNotificationsArgs $) {
        this.privateStoreId = $.privateStoreId;
        this.subscriptions = $.subscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListPrivateStoreStopSellOffersPlansNotificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListPrivateStoreStopSellOffersPlansNotificationsArgs $;

        public Builder() {
            $ = new ListPrivateStoreStopSellOffersPlansNotificationsArgs();
        }

        public Builder(ListPrivateStoreStopSellOffersPlansNotificationsArgs defaults) {
            $ = new ListPrivateStoreStopSellOffersPlansNotificationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateStoreId The store ID - must use the tenant ID
         * 
         * @return builder
         * 
         */
        public Builder privateStoreId(Output<String> privateStoreId) {
            $.privateStoreId = privateStoreId;
            return this;
        }

        /**
         * @param privateStoreId The store ID - must use the tenant ID
         * 
         * @return builder
         * 
         */
        public Builder privateStoreId(String privateStoreId) {
            return privateStoreId(Output.of(privateStoreId));
        }

        public Builder subscriptions(@Nullable Output<List<String>> subscriptions) {
            $.subscriptions = subscriptions;
            return this;
        }

        public Builder subscriptions(List<String> subscriptions) {
            return subscriptions(Output.of(subscriptions));
        }

        public Builder subscriptions(String... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }

        public ListPrivateStoreStopSellOffersPlansNotificationsArgs build() {
            $.privateStoreId = Objects.requireNonNull($.privateStoreId, "expected parameter 'privateStoreId' to be non-null");
            return $;
        }
    }

}
