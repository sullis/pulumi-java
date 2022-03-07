// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v3;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudresourcemanager_v3.ProjectArgs;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Request that a new project be created. The result is an `Operation` which can be used to track the creation process. This process usually takes a few seconds, but can sometimes take much longer. The tracking `Operation` is automatically deleted after a few hours, so there is no need to call `DeleteOperation`.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:cloudresourcemanager/v3:Project")
public class Project extends io.pulumi.resources.CustomResource {
    /**
     * Creation time.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Creation time.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The time at which this resource was requested for deletion.
     * 
     */
    @OutputExport(name="deleteTime", type=String.class, parameters={})
    private Output<String> deleteTime;

    /**
     * @return The time at which this resource was requested for deletion.
     * 
     */
    public Output<String> getDeleteTime() {
        return this.deleteTime;
    }
    /**
     * Optional. A user-assigned display name of the project. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, single-quote, double-quote, space, and exclamation point. Example: `My Project`
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Optional. A user-assigned display name of the project. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, single-quote, double-quote, space, and exclamation point. Example: `My Project`
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * A checksum computed by the server based on the current value of the Project resource. This may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A checksum computed by the server based on the current value of the Project resource. This may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Optional. The labels associated with this project. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: \[a-z\](\[-a-z0-9\]*\[a-z0-9\])?. Label values must be between 0 and 63 characters long and must conform to the regular expression (\[a-z\](\[-a-z0-9\]*\[a-z0-9\])?)?. No more than 256 labels can be associated with a given resource. Clients should store labels in a representation such as JSON that does not depend on specific characters being disallowed. Example: `"myBusinessDimension" : "businessValue"`
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. The labels associated with this project. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: \[a-z\](\[-a-z0-9\]*\[a-z0-9\])?. Label values must be between 0 and 63 characters long and must conform to the regular expression (\[a-z\](\[-a-z0-9\]*\[a-z0-9\])?)?. No more than 256 labels can be associated with a given resource. Clients should store labels in a representation such as JSON that does not depend on specific characters being disallowed. Example: `"myBusinessDimension" : "businessValue"`
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The unique resource name of the project. It is an int64 generated number prefixed by "projects/". Example: `projects/415104041262`
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique resource name of the project. It is an int64 generated number prefixed by "projects/". Example: `projects/415104041262`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optional. A reference to a parent Resource. eg., `organizations/123` or `folders/876`.
     * 
     */
    @OutputExport(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return Optional. A reference to a parent Resource. eg., `organizations/123` or `folders/876`.
     * 
     */
    public Output<String> getParent() {
        return this.parent;
    }
    /**
     * Immutable. The unique, user-assigned id of the project. It must be 6 to 30 lowercase ASCII letters, digits, or hyphens. It must start with a letter. Trailing hyphens are prohibited. Example: `tokyo-rain-123`
     * 
     */
    @OutputExport(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return Immutable. The unique, user-assigned id of the project. It must be 6 to 30 lowercase ASCII letters, digits, or hyphens. It must start with a letter. Trailing hyphens are prohibited. Example: `tokyo-rain-123`
     * 
     */
    public Output<String> getProjectId() {
        return this.projectId;
    }
    /**
     * The project lifecycle state.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The project lifecycle state.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The most recent time this resource was modified.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The most recent time this resource was modified.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ProjectArgs.Builder a);
    }
    private static io.pulumi.googlenative.cloudresourcemanager_v3.ProjectArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.cloudresourcemanager_v3.ProjectArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Project(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Project(String name) {
        this(name, ProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Project(String name, @Nullable ProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Project(String name, @Nullable ProjectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudresourcemanager/v3:Project", name, args == null ? ProjectArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Project(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudresourcemanager/v3:Project", name, null, makeResourceOptions(options, id));
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
    public static Project get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Project(name, id, options);
    }
}