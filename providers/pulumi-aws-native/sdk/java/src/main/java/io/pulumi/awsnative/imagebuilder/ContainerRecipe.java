// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.imagebuilder.ContainerRecipeArgs;
import io.pulumi.awsnative.imagebuilder.enums.ContainerRecipeContainerType;
import io.pulumi.awsnative.imagebuilder.enums.ContainerRecipePlatformOverride;
import io.pulumi.awsnative.imagebuilder.outputs.ContainerRecipeComponentConfiguration;
import io.pulumi.awsnative.imagebuilder.outputs.ContainerRecipeInstanceConfiguration;
import io.pulumi.awsnative.imagebuilder.outputs.ContainerRecipeTargetContainerRepository;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:imagebuilder:ContainerRecipe")
public class ContainerRecipe extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="components", type=List.class, parameters={ContainerRecipeComponentConfiguration.class})
    private Output</* @Nullable */ List<ContainerRecipeComponentConfiguration>> components;

    public Output</* @Nullable */ List<ContainerRecipeComponentConfiguration>> getComponents() {
        return this.components;
    }
    @OutputExport(name="containerType", type=ContainerRecipeContainerType.class, parameters={})
    private Output</* @Nullable */ ContainerRecipeContainerType> containerType;

    public Output</* @Nullable */ ContainerRecipeContainerType> getContainerType() {
        return this.containerType;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="dockerfileTemplateData", type=String.class, parameters={})
    private Output</* @Nullable */ String> dockerfileTemplateData;

    public Output</* @Nullable */ String> getDockerfileTemplateData() {
        return this.dockerfileTemplateData;
    }
    @OutputExport(name="dockerfileTemplateUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> dockerfileTemplateUri;

    public Output</* @Nullable */ String> getDockerfileTemplateUri() {
        return this.dockerfileTemplateUri;
    }
    @OutputExport(name="imageOsVersionOverride", type=String.class, parameters={})
    private Output</* @Nullable */ String> imageOsVersionOverride;

    public Output</* @Nullable */ String> getImageOsVersionOverride() {
        return this.imageOsVersionOverride;
    }
    @OutputExport(name="instanceConfiguration", type=ContainerRecipeInstanceConfiguration.class, parameters={})
    private Output</* @Nullable */ ContainerRecipeInstanceConfiguration> instanceConfiguration;

    public Output</* @Nullable */ ContainerRecipeInstanceConfiguration> getInstanceConfiguration() {
        return this.instanceConfiguration;
    }
    @OutputExport(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    public Output</* @Nullable */ String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="parentImage", type=String.class, parameters={})
    private Output</* @Nullable */ String> parentImage;

    public Output</* @Nullable */ String> getParentImage() {
        return this.parentImage;
    }
    @OutputExport(name="platformOverride", type=ContainerRecipePlatformOverride.class, parameters={})
    private Output</* @Nullable */ ContainerRecipePlatformOverride> platformOverride;

    public Output</* @Nullable */ ContainerRecipePlatformOverride> getPlatformOverride() {
        return this.platformOverride;
    }
    @OutputExport(name="tags", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> tags;

    public Output</* @Nullable */ Object> getTags() {
        return this.tags;
    }
    @OutputExport(name="targetRepository", type=ContainerRecipeTargetContainerRepository.class, parameters={})
    private Output</* @Nullable */ ContainerRecipeTargetContainerRepository> targetRepository;

    public Output</* @Nullable */ ContainerRecipeTargetContainerRepository> getTargetRepository() {
        return this.targetRepository;
    }
    @OutputExport(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    public Output</* @Nullable */ String> getVersion() {
        return this.version;
    }
    @OutputExport(name="workingDirectory", type=String.class, parameters={})
    private Output</* @Nullable */ String> workingDirectory;

    public Output</* @Nullable */ String> getWorkingDirectory() {
        return this.workingDirectory;
    }

    public ContainerRecipe(String name, @Nullable ContainerRecipeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:imagebuilder:ContainerRecipe", name, args == null ? ContainerRecipeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ContainerRecipe(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:imagebuilder:ContainerRecipe", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ContainerRecipe get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ContainerRecipe(name, id, options);
    }
}
