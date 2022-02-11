// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.connect.ContactFlowArgs;
import io.pulumi.awsnative.connect.enums.ContactFlowState;
import io.pulumi.awsnative.connect.enums.ContactFlowType;
import io.pulumi.awsnative.connect.outputs.ContactFlowTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:connect:ContactFlow")
public class ContactFlow extends io.pulumi.resources.CustomResource {
    @OutputExport(name="contactFlowArn", type=String.class, parameters={})
    private Output<String> contactFlowArn;

    public Output<String> getContactFlowArn() {
        return this.contactFlowArn;
    }
    @OutputExport(name="content", type=String.class, parameters={})
    private Output<String> content;

    public Output<String> getContent() {
        return this.content;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="instanceArn", type=String.class, parameters={})
    private Output<String> instanceArn;

    public Output<String> getInstanceArn() {
        return this.instanceArn;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="state", type=ContactFlowState.class, parameters={})
    private Output</* @Nullable */ ContactFlowState> state;

    public Output</* @Nullable */ ContactFlowState> getState() {
        return this.state;
    }
    @OutputExport(name="tags", type=List.class, parameters={ContactFlowTag.class})
    private Output</* @Nullable */ List<ContactFlowTag>> tags;

    public Output</* @Nullable */ List<ContactFlowTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=ContactFlowType.class, parameters={})
    private Output</* @Nullable */ ContactFlowType> type;

    public Output</* @Nullable */ ContactFlowType> getType() {
        return this.type;
    }

    public ContactFlow(String name, ContactFlowArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:connect:ContactFlow", name, args == null ? ContactFlowArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ContactFlow(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:connect:ContactFlow", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ContactFlow get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ContactFlow(name, id, options);
    }
}
