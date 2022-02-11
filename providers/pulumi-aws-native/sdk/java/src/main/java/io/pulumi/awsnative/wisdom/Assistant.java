// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wisdom;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.wisdom.AssistantArgs;
import io.pulumi.awsnative.wisdom.enums.AssistantType;
import io.pulumi.awsnative.wisdom.outputs.AssistantServerSideEncryptionConfiguration;
import io.pulumi.awsnative.wisdom.outputs.AssistantTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:wisdom:Assistant")
public class Assistant extends io.pulumi.resources.CustomResource {
    @OutputExport(name="assistantArn", type=String.class, parameters={})
    private Output<String> assistantArn;

    public Output<String> getAssistantArn() {
        return this.assistantArn;
    }
    @OutputExport(name="assistantId", type=String.class, parameters={})
    private Output<String> assistantId;

    public Output<String> getAssistantId() {
        return this.assistantId;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="serverSideEncryptionConfiguration", type=AssistantServerSideEncryptionConfiguration.class, parameters={})
    private Output</* @Nullable */ AssistantServerSideEncryptionConfiguration> serverSideEncryptionConfiguration;

    public Output</* @Nullable */ AssistantServerSideEncryptionConfiguration> getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }
    @OutputExport(name="tags", type=List.class, parameters={AssistantTag.class})
    private Output</* @Nullable */ List<AssistantTag>> tags;

    public Output</* @Nullable */ List<AssistantTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=AssistantType.class, parameters={})
    private Output<AssistantType> type;

    public Output<AssistantType> getType() {
        return this.type;
    }

    public Assistant(String name, AssistantArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:wisdom:Assistant", name, args == null ? AssistantArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Assistant(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:wisdom:Assistant", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Assistant get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Assistant(name, id, options);
    }
}
