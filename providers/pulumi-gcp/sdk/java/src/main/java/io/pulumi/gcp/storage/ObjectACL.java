// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.storage.ObjectACLArgs;
import io.pulumi.gcp.storage.inputs.ObjectACLState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Authoritatively manages the access control list (ACL) for an object in a Google
 * Cloud Storage (GCS) bucket. Removing a `gcp.storage.ObjectACL` sets the
 * acl to the `private` [predefined ACL](https://cloud.google.com/storage/docs/access-control#predefined-acl).
 * 
 * For more information see
 * [the official documentation](https://cloud.google.com/storage/docs/access-control/lists)
 * and
 * [API](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls).
 * 
 * > Want fine-grained control over object ACLs? Use `gcp.storage.ObjectAccessControl` to control individual
 * role entity pairs.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:storage/objectACL:ObjectACL")
public class ObjectACL extends io.pulumi.resources.CustomResource {
    /**
     * The name of the bucket the object is stored in.
     * 
     */
    @OutputExport(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The name of the bucket the object is stored in.
     * 
     */
    public Output<String> getBucket() {
        return this.bucket;
    }
    /**
     * The name of the object to apply the acl to.
     * 
     */
    @OutputExport(name="object", type=String.class, parameters={})
    private Output<String> object;

    /**
     * @return The name of the object to apply the acl to.
     * 
     */
    public Output<String> getObject() {
        return this.object;
    }
    /**
     * The "canned" [predefined ACL](https://cloud.google.com/storage/docs/access-control#predefined-acl) to apply. Must be set if `role_entity` is not.
     * 
     */
    @OutputExport(name="predefinedAcl", type=String.class, parameters={})
    private Output</* @Nullable */ String> predefinedAcl;

    /**
     * @return The "canned" [predefined ACL](https://cloud.google.com/storage/docs/access-control#predefined-acl) to apply. Must be set if `role_entity` is not.
     * 
     */
    public Output</* @Nullable */ String> getPredefinedAcl() {
        return this.predefinedAcl;
    }
    /**
     * List of role/entity pairs in the form `ROLE:entity`. See [GCS Object ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls) for more details.
     * Must be set if `predefined_acl` is not.
     * 
     */
    @OutputExport(name="roleEntities", type=List.class, parameters={String.class})
    private Output<List<String>> roleEntities;

    /**
     * @return List of role/entity pairs in the form `ROLE:entity`. See [GCS Object ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls) for more details.
     * Must be set if `predefined_acl` is not.
     * 
     */
    public Output<List<String>> getRoleEntities() {
        return this.roleEntities;
    }

    public interface BuilderApplicator {
        public void apply(ObjectACLArgs.Builder a);
    }
    private static io.pulumi.gcp.storage.ObjectACLArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.storage.ObjectACLArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ObjectACL(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ObjectACL(String name) {
        this(name, ObjectACLArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ObjectACL(String name, ObjectACLArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ObjectACL(String name, ObjectACLArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/objectACL:ObjectACL", name, args == null ? ObjectACLArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ObjectACL(String name, Input<String> id, @Nullable ObjectACLState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/objectACL:ObjectACL", name, state, makeResourceOptions(options, id));
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
    public static ObjectACL get(String name, Input<String> id, @Nullable ObjectACLState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ObjectACL(name, id, state, options);
    }
}