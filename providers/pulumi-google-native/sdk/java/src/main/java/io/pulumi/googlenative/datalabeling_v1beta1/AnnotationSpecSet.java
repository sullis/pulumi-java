// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datalabeling_v1beta1.AnnotationSpecSetArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1AnnotationSpecResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates an annotation spec set by providing a set of labels.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:datalabeling/v1beta1:AnnotationSpecSet")
public class AnnotationSpecSet extends io.pulumi.resources.CustomResource {
    /**
     * The array of AnnotationSpecs that you define when you create the AnnotationSpecSet. These are the possible labels for the labeling task.
     * 
     */
    @OutputExport(name="annotationSpecs", type=List.class, parameters={GoogleCloudDatalabelingV1beta1AnnotationSpecResponse.class})
    private Output<List<GoogleCloudDatalabelingV1beta1AnnotationSpecResponse>> annotationSpecs;

    /**
     * @return The array of AnnotationSpecs that you define when you create the AnnotationSpecSet. These are the possible labels for the labeling task.
     * 
     */
    public Output<List<GoogleCloudDatalabelingV1beta1AnnotationSpecResponse>> getAnnotationSpecs() {
        return this.annotationSpecs;
    }
    /**
     * The names of any related resources that are blocking changes to the annotation spec set.
     * 
     */
    @OutputExport(name="blockingResources", type=List.class, parameters={String.class})
    private Output<List<String>> blockingResources;

    /**
     * @return The names of any related resources that are blocking changes to the annotation spec set.
     * 
     */
    public Output<List<String>> getBlockingResources() {
        return this.blockingResources;
    }
    /**
     * Optional. User-provided description of the annotation specification set. The description can be up to 10,000 characters long.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. User-provided description of the annotation specification set. The description can be up to 10,000 characters long.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The display name for AnnotationSpecSet that you define when you create it. Maximum of 64 characters.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name for AnnotationSpecSet that you define when you create it. Maximum of 64 characters.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The AnnotationSpecSet resource name in the following format: "projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}"
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The AnnotationSpecSet resource name in the following format: "projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}"
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(AnnotationSpecSetArgs.Builder a);
    }
    private static io.pulumi.googlenative.datalabeling_v1beta1.AnnotationSpecSetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.datalabeling_v1beta1.AnnotationSpecSetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AnnotationSpecSet(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AnnotationSpecSet(String name) {
        this(name, AnnotationSpecSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AnnotationSpecSet(String name, AnnotationSpecSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AnnotationSpecSet(String name, AnnotationSpecSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datalabeling/v1beta1:AnnotationSpecSet", name, args == null ? AnnotationSpecSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AnnotationSpecSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datalabeling/v1beta1:AnnotationSpecSet", name, null, makeResourceOptions(options, id));
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
    public static AnnotationSpecSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AnnotationSpecSet(name, id, options);
    }
}