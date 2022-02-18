// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appstream;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.appstream.AppBlockArgs;
import io.pulumi.awsnative.appstream.outputs.AppBlockS3Location;
import io.pulumi.awsnative.appstream.outputs.AppBlockScriptDetails;
import io.pulumi.awsnative.appstream.outputs.AppBlockTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::AppStream::AppBlock
 * 
 */
@ResourceType(type="aws-native:appstream:AppBlock")
public class AppBlock extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="setupScriptDetails", type=AppBlockScriptDetails.class, parameters={})
    private Output<AppBlockScriptDetails> setupScriptDetails;

    public Output<AppBlockScriptDetails> getSetupScriptDetails() {
        return this.setupScriptDetails;
    }
    @OutputExport(name="sourceS3Location", type=AppBlockS3Location.class, parameters={})
    private Output<AppBlockS3Location> sourceS3Location;

    public Output<AppBlockS3Location> getSourceS3Location() {
        return this.sourceS3Location;
    }
    @OutputExport(name="tags", type=List.class, parameters={AppBlockTag.class})
    private Output</* @Nullable */ List<AppBlockTag>> tags;

    public Output</* @Nullable */ List<AppBlockTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppBlock(String name, AppBlockArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appstream:AppBlock", name, args == null ? AppBlockArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AppBlock(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appstream:AppBlock", name, null, makeResourceOptions(options, id));
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
    public static AppBlock get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AppBlock(name, id, options);
    }
}
