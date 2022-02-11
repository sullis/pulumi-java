// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotsitewise.ProjectArgs;
import io.pulumi.awsnative.iotsitewise.outputs.ProjectTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:iotsitewise:Project")
public class Project extends io.pulumi.resources.CustomResource {
    @OutputExport(name="assetIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> assetIds;

    public Output</* @Nullable */ List<String>> getAssetIds() {
        return this.assetIds;
    }
    @OutputExport(name="portalId", type=String.class, parameters={})
    private Output<String> portalId;

    public Output<String> getPortalId() {
        return this.portalId;
    }
    @OutputExport(name="projectArn", type=String.class, parameters={})
    private Output<String> projectArn;

    public Output<String> getProjectArn() {
        return this.projectArn;
    }
    @OutputExport(name="projectDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> projectDescription;

    public Output</* @Nullable */ String> getProjectDescription() {
        return this.projectDescription;
    }
    @OutputExport(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    public Output<String> getProjectId() {
        return this.projectId;
    }
    @OutputExport(name="projectName", type=String.class, parameters={})
    private Output<String> projectName;

    public Output<String> getProjectName() {
        return this.projectName;
    }
    @OutputExport(name="tags", type=List.class, parameters={ProjectTag.class})
    private Output</* @Nullable */ List<ProjectTag>> tags;

    public Output</* @Nullable */ List<ProjectTag>> getTags() {
        return this.tags;
    }

    public Project(String name, ProjectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:Project", name, args == null ? ProjectArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Project(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:Project", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Project get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Project(name, id, options);
    }
}
