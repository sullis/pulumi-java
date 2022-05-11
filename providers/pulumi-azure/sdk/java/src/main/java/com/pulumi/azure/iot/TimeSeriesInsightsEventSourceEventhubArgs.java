// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TimeSeriesInsightsEventSourceEventhubArgs extends com.pulumi.resources.ResourceArgs {

    public static final TimeSeriesInsightsEventSourceEventhubArgs Empty = new TimeSeriesInsightsEventSourceEventhubArgs();

    /**
     * Specifies the name of the EventHub Consumer Group that holds the partitions from which events will be read.
     * 
     */
    @Import(name="consumerGroupName", required=true)
    private Output<String> consumerGroupName;

    /**
     * @return Specifies the name of the EventHub Consumer Group that holds the partitions from which events will be read.
     * 
     */
    public Output<String> consumerGroupName() {
        return this.consumerGroupName;
    }

    /**
     * Specifies the id of the IoT Time Series Insights Environment that the Event Source should be associated with. Changing this forces a new resource to created.
     * 
     */
    @Import(name="environmentId", required=true)
    private Output<String> environmentId;

    /**
     * @return Specifies the id of the IoT Time Series Insights Environment that the Event Source should be associated with. Changing this forces a new resource to created.
     * 
     */
    public Output<String> environmentId() {
        return this.environmentId;
    }

    /**
     * Specifies the resource id where events will be coming from.
     * 
     */
    @Import(name="eventSourceResourceId", required=true)
    private Output<String> eventSourceResourceId;

    /**
     * @return Specifies the resource id where events will be coming from.
     * 
     */
    public Output<String> eventSourceResourceId() {
        return this.eventSourceResourceId;
    }

    /**
     * Specifies the name of the EventHub which will be associated with this resource.
     * 
     */
    @Import(name="eventhubName", required=true)
    private Output<String> eventhubName;

    /**
     * @return Specifies the name of the EventHub which will be associated with this resource.
     * 
     */
    public Output<String> eventhubName() {
        return this.eventhubName;
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the Azure IoT Time Series Insights EventHub Event Source. Changing this forces a new resource to be created. Must be globally unique.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Azure IoT Time Series Insights EventHub Event Source. Changing this forces a new resource to be created. Must be globally unique.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the EventHub Namespace name.
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    /**
     * @return Specifies the EventHub Namespace name.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * Specifies the value of the Shared Access Policy key that grants the Time Series Insights service read access to the EventHub.
     * 
     */
    @Import(name="sharedAccessKey", required=true)
    private Output<String> sharedAccessKey;

    /**
     * @return Specifies the value of the Shared Access Policy key that grants the Time Series Insights service read access to the EventHub.
     * 
     */
    public Output<String> sharedAccessKey() {
        return this.sharedAccessKey;
    }

    /**
     * Specifies the name of the Shared Access key that grants the Event Source access to the EventHub.
     * 
     */
    @Import(name="sharedAccessKeyName", required=true)
    private Output<String> sharedAccessKeyName;

    /**
     * @return Specifies the name of the Shared Access key that grants the Event Source access to the EventHub.
     * 
     */
    public Output<String> sharedAccessKeyName() {
        return this.sharedAccessKeyName;
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies the value that will be used as the event source&#39;s timestamp. This value defaults to the event creation time.
     * 
     */
    @Import(name="timestampPropertyName")
    private @Nullable Output<String> timestampPropertyName;

    /**
     * @return Specifies the value that will be used as the event source&#39;s timestamp. This value defaults to the event creation time.
     * 
     */
    public Optional<Output<String>> timestampPropertyName() {
        return Optional.ofNullable(this.timestampPropertyName);
    }

    private TimeSeriesInsightsEventSourceEventhubArgs() {}

    private TimeSeriesInsightsEventSourceEventhubArgs(TimeSeriesInsightsEventSourceEventhubArgs $) {
        this.consumerGroupName = $.consumerGroupName;
        this.environmentId = $.environmentId;
        this.eventSourceResourceId = $.eventSourceResourceId;
        this.eventhubName = $.eventhubName;
        this.location = $.location;
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.sharedAccessKey = $.sharedAccessKey;
        this.sharedAccessKeyName = $.sharedAccessKeyName;
        this.tags = $.tags;
        this.timestampPropertyName = $.timestampPropertyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TimeSeriesInsightsEventSourceEventhubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeSeriesInsightsEventSourceEventhubArgs $;

        public Builder() {
            $ = new TimeSeriesInsightsEventSourceEventhubArgs();
        }

        public Builder(TimeSeriesInsightsEventSourceEventhubArgs defaults) {
            $ = new TimeSeriesInsightsEventSourceEventhubArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consumerGroupName Specifies the name of the EventHub Consumer Group that holds the partitions from which events will be read.
         * 
         * @return builder
         * 
         */
        public Builder consumerGroupName(Output<String> consumerGroupName) {
            $.consumerGroupName = consumerGroupName;
            return this;
        }

        /**
         * @param consumerGroupName Specifies the name of the EventHub Consumer Group that holds the partitions from which events will be read.
         * 
         * @return builder
         * 
         */
        public Builder consumerGroupName(String consumerGroupName) {
            return consumerGroupName(Output.of(consumerGroupName));
        }

        /**
         * @param environmentId Specifies the id of the IoT Time Series Insights Environment that the Event Source should be associated with. Changing this forces a new resource to created.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        /**
         * @param environmentId Specifies the id of the IoT Time Series Insights Environment that the Event Source should be associated with. Changing this forces a new resource to created.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        /**
         * @param eventSourceResourceId Specifies the resource id where events will be coming from.
         * 
         * @return builder
         * 
         */
        public Builder eventSourceResourceId(Output<String> eventSourceResourceId) {
            $.eventSourceResourceId = eventSourceResourceId;
            return this;
        }

        /**
         * @param eventSourceResourceId Specifies the resource id where events will be coming from.
         * 
         * @return builder
         * 
         */
        public Builder eventSourceResourceId(String eventSourceResourceId) {
            return eventSourceResourceId(Output.of(eventSourceResourceId));
        }

        /**
         * @param eventhubName Specifies the name of the EventHub which will be associated with this resource.
         * 
         * @return builder
         * 
         */
        public Builder eventhubName(Output<String> eventhubName) {
            $.eventhubName = eventhubName;
            return this;
        }

        /**
         * @param eventhubName Specifies the name of the EventHub which will be associated with this resource.
         * 
         * @return builder
         * 
         */
        public Builder eventhubName(String eventhubName) {
            return eventhubName(Output.of(eventhubName));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the Azure IoT Time Series Insights EventHub Event Source. Changing this forces a new resource to be created. Must be globally unique.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Azure IoT Time Series Insights EventHub Event Source. Changing this forces a new resource to be created. Must be globally unique.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceName Specifies the EventHub Namespace name.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName Specifies the EventHub Namespace name.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param sharedAccessKey Specifies the value of the Shared Access Policy key that grants the Time Series Insights service read access to the EventHub.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessKey(Output<String> sharedAccessKey) {
            $.sharedAccessKey = sharedAccessKey;
            return this;
        }

        /**
         * @param sharedAccessKey Specifies the value of the Shared Access Policy key that grants the Time Series Insights service read access to the EventHub.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessKey(String sharedAccessKey) {
            return sharedAccessKey(Output.of(sharedAccessKey));
        }

        /**
         * @param sharedAccessKeyName Specifies the name of the Shared Access key that grants the Event Source access to the EventHub.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessKeyName(Output<String> sharedAccessKeyName) {
            $.sharedAccessKeyName = sharedAccessKeyName;
            return this;
        }

        /**
         * @param sharedAccessKeyName Specifies the name of the Shared Access key that grants the Event Source access to the EventHub.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessKeyName(String sharedAccessKeyName) {
            return sharedAccessKeyName(Output.of(sharedAccessKeyName));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param timestampPropertyName Specifies the value that will be used as the event source&#39;s timestamp. This value defaults to the event creation time.
         * 
         * @return builder
         * 
         */
        public Builder timestampPropertyName(@Nullable Output<String> timestampPropertyName) {
            $.timestampPropertyName = timestampPropertyName;
            return this;
        }

        /**
         * @param timestampPropertyName Specifies the value that will be used as the event source&#39;s timestamp. This value defaults to the event creation time.
         * 
         * @return builder
         * 
         */
        public Builder timestampPropertyName(String timestampPropertyName) {
            return timestampPropertyName(Output.of(timestampPropertyName));
        }

        public TimeSeriesInsightsEventSourceEventhubArgs build() {
            $.consumerGroupName = Objects.requireNonNull($.consumerGroupName, "expected parameter 'consumerGroupName' to be non-null");
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.eventSourceResourceId = Objects.requireNonNull($.eventSourceResourceId, "expected parameter 'eventSourceResourceId' to be non-null");
            $.eventhubName = Objects.requireNonNull($.eventhubName, "expected parameter 'eventhubName' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.sharedAccessKey = Objects.requireNonNull($.sharedAccessKey, "expected parameter 'sharedAccessKey' to be non-null");
            $.sharedAccessKeyName = Objects.requireNonNull($.sharedAccessKeyName, "expected parameter 'sharedAccessKeyName' to be non-null");
            return $;
        }
    }

}
