// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.testbase.inputs;

import com.pulumi.azurenative.testbase.inputs.DistributionGroupListReceiverValueArgs;
import com.pulumi.azurenative.testbase.inputs.SubscriptionReceiverValueArgs;
import com.pulumi.azurenative.testbase.inputs.UserObjectReceiverValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A notification event receiver value.
 * 
 */
public final class NotificationReceiverValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationReceiverValueArgs Empty = new NotificationReceiverValueArgs();

    /**
     * The user object receiver value.
     * 
     */
    @Import(name="distributionGroupListReceiverValue")
    private @Nullable Output<DistributionGroupListReceiverValueArgs> distributionGroupListReceiverValue;

    /**
     * @return The user object receiver value.
     * 
     */
    public Optional<Output<DistributionGroupListReceiverValueArgs>> distributionGroupListReceiverValue() {
        return Optional.ofNullable(this.distributionGroupListReceiverValue);
    }

    /**
     * The user object receiver value.
     * 
     */
    @Import(name="subscriptionReceiverValue")
    private @Nullable Output<SubscriptionReceiverValueArgs> subscriptionReceiverValue;

    /**
     * @return The user object receiver value.
     * 
     */
    public Optional<Output<SubscriptionReceiverValueArgs>> subscriptionReceiverValue() {
        return Optional.ofNullable(this.subscriptionReceiverValue);
    }

    /**
     * The user object receiver value.
     * 
     */
    @Import(name="userObjectReceiverValue")
    private @Nullable Output<UserObjectReceiverValueArgs> userObjectReceiverValue;

    /**
     * @return The user object receiver value.
     * 
     */
    public Optional<Output<UserObjectReceiverValueArgs>> userObjectReceiverValue() {
        return Optional.ofNullable(this.userObjectReceiverValue);
    }

    private NotificationReceiverValueArgs() {}

    private NotificationReceiverValueArgs(NotificationReceiverValueArgs $) {
        this.distributionGroupListReceiverValue = $.distributionGroupListReceiverValue;
        this.subscriptionReceiverValue = $.subscriptionReceiverValue;
        this.userObjectReceiverValue = $.userObjectReceiverValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationReceiverValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationReceiverValueArgs $;

        public Builder() {
            $ = new NotificationReceiverValueArgs();
        }

        public Builder(NotificationReceiverValueArgs defaults) {
            $ = new NotificationReceiverValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param distributionGroupListReceiverValue The user object receiver value.
         * 
         * @return builder
         * 
         */
        public Builder distributionGroupListReceiverValue(@Nullable Output<DistributionGroupListReceiverValueArgs> distributionGroupListReceiverValue) {
            $.distributionGroupListReceiverValue = distributionGroupListReceiverValue;
            return this;
        }

        /**
         * @param distributionGroupListReceiverValue The user object receiver value.
         * 
         * @return builder
         * 
         */
        public Builder distributionGroupListReceiverValue(DistributionGroupListReceiverValueArgs distributionGroupListReceiverValue) {
            return distributionGroupListReceiverValue(Output.of(distributionGroupListReceiverValue));
        }

        /**
         * @param subscriptionReceiverValue The user object receiver value.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionReceiverValue(@Nullable Output<SubscriptionReceiverValueArgs> subscriptionReceiverValue) {
            $.subscriptionReceiverValue = subscriptionReceiverValue;
            return this;
        }

        /**
         * @param subscriptionReceiverValue The user object receiver value.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionReceiverValue(SubscriptionReceiverValueArgs subscriptionReceiverValue) {
            return subscriptionReceiverValue(Output.of(subscriptionReceiverValue));
        }

        /**
         * @param userObjectReceiverValue The user object receiver value.
         * 
         * @return builder
         * 
         */
        public Builder userObjectReceiverValue(@Nullable Output<UserObjectReceiverValueArgs> userObjectReceiverValue) {
            $.userObjectReceiverValue = userObjectReceiverValue;
            return this;
        }

        /**
         * @param userObjectReceiverValue The user object receiver value.
         * 
         * @return builder
         * 
         */
        public Builder userObjectReceiverValue(UserObjectReceiverValueArgs userObjectReceiverValue) {
            return userObjectReceiverValue(Output.of(userObjectReceiverValue));
        }

        public NotificationReceiverValueArgs build() {
            return $;
        }
    }

}
