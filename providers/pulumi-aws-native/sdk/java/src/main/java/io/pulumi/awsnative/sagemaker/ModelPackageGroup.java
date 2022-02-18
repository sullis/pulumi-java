// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.ModelPackageGroupArgs;
import io.pulumi.awsnative.sagemaker.enums.ModelPackageGroupStatus;
import io.pulumi.awsnative.sagemaker.outputs.ModelPackageGroupTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SageMaker::ModelPackageGroup
 * 
 */
@ResourceType(type="aws-native:sagemaker:ModelPackageGroup")
public class ModelPackageGroup extends io.pulumi.resources.CustomResource {
    /**
     * The time at which the model package group was created.
     * 
     */
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time at which the model package group was created.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    @OutputExport(name="modelPackageGroupArn", type=String.class, parameters={})
    private Output<String> modelPackageGroupArn;

    public Output<String> getModelPackageGroupArn() {
        return this.modelPackageGroupArn;
    }
    @OutputExport(name="modelPackageGroupDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> modelPackageGroupDescription;

    public Output</* @Nullable */ String> getModelPackageGroupDescription() {
        return this.modelPackageGroupDescription;
    }
    @OutputExport(name="modelPackageGroupName", type=String.class, parameters={})
    private Output<String> modelPackageGroupName;

    public Output<String> getModelPackageGroupName() {
        return this.modelPackageGroupName;
    }
    @OutputExport(name="modelPackageGroupPolicy", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> modelPackageGroupPolicy;

    public Output</* @Nullable */ Object> getModelPackageGroupPolicy() {
        return this.modelPackageGroupPolicy;
    }
    /**
     * The status of a modelpackage group job.
     * 
     */
    @OutputExport(name="modelPackageGroupStatus", type=ModelPackageGroupStatus.class, parameters={})
    private Output<ModelPackageGroupStatus> modelPackageGroupStatus;

    /**
     * @return The status of a modelpackage group job.
     * 
     */
    public Output<ModelPackageGroupStatus> getModelPackageGroupStatus() {
        return this.modelPackageGroupStatus;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={ModelPackageGroupTag.class})
    private Output</* @Nullable */ List<ModelPackageGroupTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<ModelPackageGroupTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ModelPackageGroup(String name, @Nullable ModelPackageGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:ModelPackageGroup", name, args == null ? ModelPackageGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ModelPackageGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:ModelPackageGroup", name, null, makeResourceOptions(options, id));
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
    public static ModelPackageGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ModelPackageGroup(name, id, options);
    }
}
