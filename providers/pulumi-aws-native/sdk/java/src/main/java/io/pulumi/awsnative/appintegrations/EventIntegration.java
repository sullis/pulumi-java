// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appintegrations;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.appintegrations.EventIntegrationArgs;
import io.pulumi.awsnative.appintegrations.outputs.EventIntegrationAssociation;
import io.pulumi.awsnative.appintegrations.outputs.EventIntegrationEventFilter;
import io.pulumi.awsnative.appintegrations.outputs.EventIntegrationTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:appintegrations:EventIntegration")
public class EventIntegration extends io.pulumi.resources.CustomResource {
    @OutputExport(name="associations", type=List.class, parameters={EventIntegrationAssociation.class})
    private Output<List<EventIntegrationAssociation>> associations;

    public Output<List<EventIntegrationAssociation>> getAssociations() {
        return this.associations;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="eventBridgeBus", type=String.class, parameters={})
    private Output<String> eventBridgeBus;

    public Output<String> getEventBridgeBus() {
        return this.eventBridgeBus;
    }
    @OutputExport(name="eventFilter", type=EventIntegrationEventFilter.class, parameters={})
    private Output<EventIntegrationEventFilter> eventFilter;

    public Output<EventIntegrationEventFilter> getEventFilter() {
        return this.eventFilter;
    }
    @OutputExport(name="eventIntegrationArn", type=String.class, parameters={})
    private Output<String> eventIntegrationArn;

    public Output<String> getEventIntegrationArn() {
        return this.eventIntegrationArn;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="tags", type=List.class, parameters={EventIntegrationTag.class})
    private Output</* @Nullable */ List<EventIntegrationTag>> tags;

    public Output</* @Nullable */ List<EventIntegrationTag>> getTags() {
        return this.tags;
    }

    public EventIntegration(String name, EventIntegrationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appintegrations:EventIntegration", name, args == null ? EventIntegrationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EventIntegration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appintegrations:EventIntegration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static EventIntegration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventIntegration(name, id, options);
    }
}
