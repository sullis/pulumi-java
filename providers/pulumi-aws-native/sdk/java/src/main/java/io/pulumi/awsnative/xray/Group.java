// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.xray;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.xray.GroupArgs;
import io.pulumi.awsnative.xray.outputs.GroupInsightsConfiguration;
import io.pulumi.awsnative.xray.outputs.TagsItemProperties;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This schema provides construct and validation rules for AWS-XRay Group resource parameters.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:xray:Group")
public class Group extends io.pulumi.resources.CustomResource {
    /**
     * The filter expression defining criteria by which to group traces.
     * 
     */
    @OutputExport(name="filterExpression", type=String.class, parameters={})
    private Output</* @Nullable */ String> filterExpression;

    /**
     * @return The filter expression defining criteria by which to group traces.
     * 
     */
    public Output</* @Nullable */ String> getFilterExpression() {
        return this.filterExpression;
    }
    /**
     * The ARN of the group that was generated on creation.
     * 
     */
    @OutputExport(name="groupARN", type=String.class, parameters={})
    private Output<String> groupARN;

    /**
     * @return The ARN of the group that was generated on creation.
     * 
     */
    public Output<String> getGroupARN() {
        return this.groupARN;
    }
    /**
     * The case-sensitive name of the new group. Names must be unique.
     * 
     */
    @OutputExport(name="groupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> groupName;

    /**
     * @return The case-sensitive name of the new group. Names must be unique.
     * 
     */
    public Output</* @Nullable */ String> getGroupName() {
        return this.groupName;
    }
    @OutputExport(name="insightsConfiguration", type=GroupInsightsConfiguration.class, parameters={})
    private Output</* @Nullable */ GroupInsightsConfiguration> insightsConfiguration;

    public Output</* @Nullable */ GroupInsightsConfiguration> getInsightsConfiguration() {
        return this.insightsConfiguration;
    }
    @OutputExport(name="tags", type=List.class, parameters={TagsItemProperties.class})
    private Output</* @Nullable */ List<TagsItemProperties>> tags;

    public Output</* @Nullable */ List<TagsItemProperties>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable GroupArgs.Builder a);
    }
    private static io.pulumi.awsnative.xray.GroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.xray.GroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Group(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Group(String name) {
        this(name, GroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Group(String name, @Nullable GroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Group(String name, @Nullable GroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:xray:Group", name, args == null ? GroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Group(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:xray:Group", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Group get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Group(name, id, options);
    }
}