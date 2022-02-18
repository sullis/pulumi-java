// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.notebooks.EnvironmentArgs;
import io.pulumi.gcp.notebooks.inputs.EnvironmentState;
import io.pulumi.gcp.notebooks.outputs.EnvironmentContainerImage;
import io.pulumi.gcp.notebooks.outputs.EnvironmentVmImage;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A Cloud AI Platform Notebook environment.
 * 
 * To get more information about Environment, see:
 * 
 * * [API documentation](https://cloud.google.com/ai-platform/notebooks/docs/reference/rest)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/ai-platform-notebooks)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Environment can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:notebooks/environment:Environment default projects/{{project}}/locations/{{location}}/environments/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:notebooks/environment:Environment default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:notebooks/environment:Environment default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:notebooks/environment:Environment")
public class Environment extends io.pulumi.resources.CustomResource {
    /**
     * Use a container image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="containerImage", type=EnvironmentContainerImage.class, parameters={})
    private Output</* @Nullable */ EnvironmentContainerImage> containerImage;

    /**
     * @return Use a container image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ EnvironmentContainerImage> getContainerImage() {
        return this.containerImage;
    }
    /**
     * Instance creation time
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Instance creation time
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * A brief description of this environment.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A brief description of this environment.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Display name of this environment for the UI.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Display name of this environment for the UI.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * A reference to the zone where the machine resides.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return A reference to the zone where the machine resides.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name specified for the Environment instance.
     * Format: projects/{project_id}/locations/{location}/environments/{environmentId}
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name specified for the Environment instance.
     * Format: projects/{project_id}/locations/{location}/environments/{environmentId}
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Path to a Bash script that automatically runs after a notebook instance fully boots up.
     * The path must be a URL or Cloud Storage path. Example: "gs://path-to-file/file-name"
     * 
     */
    @OutputExport(name="postStartupScript", type=String.class, parameters={})
    private Output</* @Nullable */ String> postStartupScript;

    /**
     * @return Path to a Bash script that automatically runs after a notebook instance fully boots up.
     * The path must be a URL or Cloud Storage path. Example: "gs://path-to-file/file-name"
     * 
     */
    public Output</* @Nullable */ String> getPostStartupScript() {
        return this.postStartupScript;
    }
    /**
     * The name of the Google Cloud project that this VM image belongs to.
     * Format: projects/{project_id}
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The name of the Google Cloud project that this VM image belongs to.
     * Format: projects/{project_id}
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Use a Compute Engine VM image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="vmImage", type=EnvironmentVmImage.class, parameters={})
    private Output</* @Nullable */ EnvironmentVmImage> vmImage;

    /**
     * @return Use a Compute Engine VM image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ EnvironmentVmImage> getVmImage() {
        return this.vmImage;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Environment(String name, EnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/environment:Environment", name, args == null ? EnvironmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Environment(String name, Input<String> id, @Nullable EnvironmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/environment:Environment", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Environment get(String name, Input<String> id, @Nullable EnvironmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Environment(name, id, state, options);
    }
}
