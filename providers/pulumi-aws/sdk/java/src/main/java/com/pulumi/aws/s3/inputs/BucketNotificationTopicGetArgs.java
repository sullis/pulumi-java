// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketNotificationTopicGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketNotificationTopicGetArgs Empty = new BucketNotificationTopicGetArgs();

    /**
     * [Event](http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-event-types-and-destinations) for which to send notifications.
     * 
     */
    @Import(name="events", required=true)
    private Output<List<String>> events;

    /**
     * @return [Event](http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-event-types-and-destinations) for which to send notifications.
     * 
     */
    public Output<List<String>> events() {
        return this.events;
    }

    /**
     * Object key name prefix.
     * 
     */
    @Import(name="filterPrefix")
    private @Nullable Output<String> filterPrefix;

    /**
     * @return Object key name prefix.
     * 
     */
    public Optional<Output<String>> filterPrefix() {
        return Optional.ofNullable(this.filterPrefix);
    }

    /**
     * Object key name suffix.
     * 
     */
    @Import(name="filterSuffix")
    private @Nullable Output<String> filterSuffix;

    /**
     * @return Object key name suffix.
     * 
     */
    public Optional<Output<String>> filterSuffix() {
        return Optional.ofNullable(this.filterSuffix);
    }

    /**
     * Unique identifier for each of the notification configurations.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Unique identifier for each of the notification configurations.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * SNS topic ARN.
     * 
     */
    @Import(name="topicArn", required=true)
    private Output<String> topicArn;

    /**
     * @return SNS topic ARN.
     * 
     */
    public Output<String> topicArn() {
        return this.topicArn;
    }

    private BucketNotificationTopicGetArgs() {}

    private BucketNotificationTopicGetArgs(BucketNotificationTopicGetArgs $) {
        this.events = $.events;
        this.filterPrefix = $.filterPrefix;
        this.filterSuffix = $.filterSuffix;
        this.id = $.id;
        this.topicArn = $.topicArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketNotificationTopicGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketNotificationTopicGetArgs $;

        public Builder() {
            $ = new BucketNotificationTopicGetArgs();
        }

        public Builder(BucketNotificationTopicGetArgs defaults) {
            $ = new BucketNotificationTopicGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param events [Event](http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-event-types-and-destinations) for which to send notifications.
         * 
         * @return builder
         * 
         */
        public Builder events(Output<List<String>> events) {
            $.events = events;
            return this;
        }

        /**
         * @param events [Event](http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-event-types-and-destinations) for which to send notifications.
         * 
         * @return builder
         * 
         */
        public Builder events(List<String> events) {
            return events(Output.of(events));
        }

        /**
         * @param events [Event](http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-event-types-and-destinations) for which to send notifications.
         * 
         * @return builder
         * 
         */
        public Builder events(String... events) {
            return events(List.of(events));
        }

        /**
         * @param filterPrefix Object key name prefix.
         * 
         * @return builder
         * 
         */
        public Builder filterPrefix(@Nullable Output<String> filterPrefix) {
            $.filterPrefix = filterPrefix;
            return this;
        }

        /**
         * @param filterPrefix Object key name prefix.
         * 
         * @return builder
         * 
         */
        public Builder filterPrefix(String filterPrefix) {
            return filterPrefix(Output.of(filterPrefix));
        }

        /**
         * @param filterSuffix Object key name suffix.
         * 
         * @return builder
         * 
         */
        public Builder filterSuffix(@Nullable Output<String> filterSuffix) {
            $.filterSuffix = filterSuffix;
            return this;
        }

        /**
         * @param filterSuffix Object key name suffix.
         * 
         * @return builder
         * 
         */
        public Builder filterSuffix(String filterSuffix) {
            return filterSuffix(Output.of(filterSuffix));
        }

        /**
         * @param id Unique identifier for each of the notification configurations.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Unique identifier for each of the notification configurations.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param topicArn SNS topic ARN.
         * 
         * @return builder
         * 
         */
        public Builder topicArn(Output<String> topicArn) {
            $.topicArn = topicArn;
            return this;
        }

        /**
         * @param topicArn SNS topic ARN.
         * 
         * @return builder
         * 
         */
        public Builder topicArn(String topicArn) {
            return topicArn(Output.of(topicArn));
        }

        public BucketNotificationTopicGetArgs build() {
            $.events = Objects.requireNonNull($.events, "expected parameter 'events' to be non-null");
            $.topicArn = Objects.requireNonNull($.topicArn, "expected parameter 'topicArn' to be non-null");
            return $;
        }
    }

}
