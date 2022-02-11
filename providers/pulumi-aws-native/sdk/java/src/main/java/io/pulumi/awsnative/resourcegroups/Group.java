// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resourcegroups;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.resourcegroups.GroupArgs;
import io.pulumi.awsnative.resourcegroups.outputs.GroupConfigurationItem;
import io.pulumi.awsnative.resourcegroups.outputs.GroupResourceQuery;
import io.pulumi.awsnative.resourcegroups.outputs.GroupTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:resourcegroups:Group")
public class Group extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="configuration", type=List.class, parameters={GroupConfigurationItem.class})
    private Output</* @Nullable */ List<GroupConfigurationItem>> configuration;

    public Output</* @Nullable */ List<GroupConfigurationItem>> getConfiguration() {
        return this.configuration;
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
    @OutputExport(name="resourceQuery", type=GroupResourceQuery.class, parameters={})
    private Output</* @Nullable */ GroupResourceQuery> resourceQuery;

    public Output</* @Nullable */ GroupResourceQuery> getResourceQuery() {
        return this.resourceQuery;
    }
    @OutputExport(name="resources", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> resources;

    public Output</* @Nullable */ List<String>> getResources() {
        return this.resources;
    }
    @OutputExport(name="tags", type=List.class, parameters={GroupTag.class})
    private Output</* @Nullable */ List<GroupTag>> tags;

    public Output</* @Nullable */ List<GroupTag>> getTags() {
        return this.tags;
    }

    public Group(String name, @Nullable GroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:resourcegroups:Group", name, args == null ? GroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Group(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:resourcegroups:Group", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Group get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Group(name, id, options);
    }
}
