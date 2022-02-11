// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.redshift.EventSubscriptionArgs;
import io.pulumi.awsnative.redshift.enums.EventSubscriptionEventCategoriesItem;
import io.pulumi.awsnative.redshift.enums.EventSubscriptionSeverity;
import io.pulumi.awsnative.redshift.enums.EventSubscriptionSourceType;
import io.pulumi.awsnative.redshift.enums.EventSubscriptionStatus;
import io.pulumi.awsnative.redshift.outputs.EventSubscriptionTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:redshift:EventSubscription")
public class EventSubscription extends io.pulumi.resources.CustomResource {
    @OutputExport(name="custSubscriptionId", type=String.class, parameters={})
    private Output<String> custSubscriptionId;

    public Output<String> getCustSubscriptionId() {
        return this.custSubscriptionId;
    }
    @OutputExport(name="customerAwsId", type=String.class, parameters={})
    private Output<String> customerAwsId;

    public Output<String> getCustomerAwsId() {
        return this.customerAwsId;
    }
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    @OutputExport(name="eventCategories", type=List.class, parameters={EventSubscriptionEventCategoriesItem.class})
    private Output</* @Nullable */ List<EventSubscriptionEventCategoriesItem>> eventCategories;

    public Output</* @Nullable */ List<EventSubscriptionEventCategoriesItem>> getEventCategories() {
        return this.eventCategories;
    }
    @OutputExport(name="eventCategoriesList", type=List.class, parameters={String.class})
    private Output<List<String>> eventCategoriesList;

    public Output<List<String>> getEventCategoriesList() {
        return this.eventCategoriesList;
    }
    @OutputExport(name="severity", type=EventSubscriptionSeverity.class, parameters={})
    private Output</* @Nullable */ EventSubscriptionSeverity> severity;

    public Output</* @Nullable */ EventSubscriptionSeverity> getSeverity() {
        return this.severity;
    }
    @OutputExport(name="snsTopicArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> snsTopicArn;

    public Output</* @Nullable */ String> getSnsTopicArn() {
        return this.snsTopicArn;
    }
    @OutputExport(name="sourceIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> sourceIds;

    public Output</* @Nullable */ List<String>> getSourceIds() {
        return this.sourceIds;
    }
    @OutputExport(name="sourceIdsList", type=List.class, parameters={String.class})
    private Output<List<String>> sourceIdsList;

    public Output<List<String>> getSourceIdsList() {
        return this.sourceIdsList;
    }
    @OutputExport(name="sourceType", type=EventSubscriptionSourceType.class, parameters={})
    private Output</* @Nullable */ EventSubscriptionSourceType> sourceType;

    public Output</* @Nullable */ EventSubscriptionSourceType> getSourceType() {
        return this.sourceType;
    }
    @OutputExport(name="status", type=EventSubscriptionStatus.class, parameters={})
    private Output<EventSubscriptionStatus> status;

    public Output<EventSubscriptionStatus> getStatus() {
        return this.status;
    }
    @OutputExport(name="subscriptionCreationTime", type=String.class, parameters={})
    private Output<String> subscriptionCreationTime;

    public Output<String> getSubscriptionCreationTime() {
        return this.subscriptionCreationTime;
    }
    @OutputExport(name="subscriptionName", type=String.class, parameters={})
    private Output<String> subscriptionName;

    public Output<String> getSubscriptionName() {
        return this.subscriptionName;
    }
    @OutputExport(name="tags", type=List.class, parameters={EventSubscriptionTag.class})
    private Output</* @Nullable */ List<EventSubscriptionTag>> tags;

    public Output</* @Nullable */ List<EventSubscriptionTag>> getTags() {
        return this.tags;
    }

    public EventSubscription(String name, EventSubscriptionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:redshift:EventSubscription", name, args == null ? EventSubscriptionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EventSubscription(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:redshift:EventSubscription", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static EventSubscription get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventSubscription(name, id, options);
    }
}
