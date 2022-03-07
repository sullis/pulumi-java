// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.essentialcontacts_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum FolderContactNotificationCategorySubscriptionsItem {
        /**
         * Notification category is unrecognized or unspecified.
         * 
         */
        NotificationCategoryUnspecified("NOTIFICATION_CATEGORY_UNSPECIFIED"),
        /**
         * All notifications related to the resource, including notifications pertaining to categories added in the future.
         * 
         */
        All("ALL"),
        /**
         * Notifications related to imminent account suspension.
         * 
         */
        Suspension("SUSPENSION"),
        /**
         * Notifications related to security/privacy incidents, notifications, and vulnerabilities.
         * 
         */
        Security("SECURITY"),
        /**
         * Notifications related to technical events and issues such as outages, errors, or bugs.
         * 
         */
        Technical("TECHNICAL"),
        /**
         * Notifications related to billing and payments notifications, price updates, errors, or credits.
         * 
         */
        Billing("BILLING"),
        /**
         * Notifications related to enforcement actions, regulatory compliance, or government notices.
         * 
         */
        Legal("LEGAL"),
        /**
         * Notifications related to new versions, product terms updates, or deprecations.
         * 
         */
        ProductUpdates("PRODUCT_UPDATES"),
        /**
         * Child category of TECHNICAL. If assigned, technical incident notifications will go to these contacts instead of TECHNICAL.
         * 
         */
        TechnicalIncidents("TECHNICAL_INCIDENTS");

        private final String value;

        FolderContactNotificationCategorySubscriptionsItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FolderContactNotificationCategorySubscriptionsItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }