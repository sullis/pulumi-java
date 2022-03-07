// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.organizations.FolderArgs;
import io.pulumi.gcp.organizations.inputs.FolderState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Allows management of a Google Cloud Platform folder. For more information see
 * [the official documentation](https://cloud.google.com/resource-manager/docs/creating-managing-folders)
 * and
 * [API](https://cloud.google.com/resource-manager/reference/rest/v2/folders).
 * 
 * A folder can contain projects, other folders, or a combination of both. You can use folders to group projects under an organization in a hierarchy. For example, your organization might contain multiple departments, each with its own set of Cloud Platform resources. Folders allows you to group these resources on a per-department basis. Folders are used to group resources that share common IAM policies.
 * 
 * Folders created live inside an Organization. See the [Organization documentation](https://cloud.google.com/resource-manager/docs/quickstarts) for more details.
 * 
 * The service account used to run the provider when creating a `gcp.organizations.Folder`
 * resource must have `roles/resourcemanager.folderCreator`. See the
 * [Access Control for Folders Using IAM](https://cloud.google.com/resource-manager/docs/access-control-folders)
 * doc for more information.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Folders can be imported using the folder's id, e.g. # Both syntaxes are valid
 * 
 * ```sh
 *  $ pulumi import gcp:organizations/folder:Folder department1 1234567
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:organizations/folder:Folder department1 folders/1234567
 * ```
 * 
 */
@ResourceType(type="gcp:organizations/folder:Folder")
public class Folder extends io.pulumi.resources.CustomResource {
    /**
     * Timestamp when the Folder was created. Assigned by the server.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Timestamp when the Folder was created. Assigned by the server.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The folder’s display name.
     * A folder’s display name must be unique amongst its siblings, e.g. no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The folder’s display name.
     * A folder’s display name must be unique amongst its siblings, e.g. no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The folder id from the name "folders/{folder_id}"
     * 
     */
    @OutputExport(name="folderId", type=String.class, parameters={})
    private Output<String> folderId;

    /**
     * @return The folder id from the name "folders/{folder_id}"
     * 
     */
    public Output<String> getFolderId() {
        return this.folderId;
    }
    /**
     * The lifecycle state of the folder such as `ACTIVE` or `DELETE_REQUESTED`.
     * 
     */
    @OutputExport(name="lifecycleState", type=String.class, parameters={})
    private Output<String> lifecycleState;

    /**
     * @return The lifecycle state of the folder such as `ACTIVE` or `DELETE_REQUESTED`.
     * 
     */
    public Output<String> getLifecycleState() {
        return this.lifecycleState;
    }
    /**
     * The resource name of the Folder. Its format is folders/{folder_id}.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the Folder. Its format is folders/{folder_id}.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The resource name of the parent Folder or Organization.
     * Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
     * 
     */
    @OutputExport(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The resource name of the parent Folder or Organization.
     * Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
     * 
     */
    public Output<String> getParent() {
        return this.parent;
    }

    public interface BuilderApplicator {
        public void apply(FolderArgs.Builder a);
    }
    private static io.pulumi.gcp.organizations.FolderArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.organizations.FolderArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Folder(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Folder(String name) {
        this(name, FolderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Folder(String name, FolderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Folder(String name, FolderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/folder:Folder", name, args == null ? FolderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Folder(String name, Input<String> id, @Nullable FolderState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/folder:Folder", name, state, makeResourceOptions(options, id));
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
    public static Folder get(String name, Input<String> id, @Nullable FolderState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Folder(name, id, state, options);
    }
}