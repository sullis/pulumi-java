// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.spanner;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.spanner.DatabaseIAMPolicyArgs;
import io.pulumi.gcp.spanner.inputs.DatabaseIAMPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for a Spanner database. Each of these resources serves a different use case:
 * 
 * * `gcp.spanner.DatabaseIAMPolicy`: Authoritative. Sets the IAM policy for the database and replaces any existing policy already attached.
 * 
 * > **Warning:** It's entirely possibly to lock yourself out of your database using `gcp.spanner.DatabaseIAMPolicy`. Any permissions granted by default will be removed unless you include them in your config.
 * 
 * * `gcp.spanner.DatabaseIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the database are preserved.
 * * `gcp.spanner.DatabaseIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the database are preserved.
 * 
 * > **Note:** `gcp.spanner.DatabaseIAMPolicy` **cannot** be used in conjunction with `gcp.spanner.DatabaseIAMBinding` and `gcp.spanner.DatabaseIAMMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.spanner.DatabaseIAMBinding` resources **can be** used in conjunction with `gcp.spanner.DatabaseIAMMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_spanner\_database\_iam\_policy
 * 
 * ## google\_spanner\_database\_iam\_binding
 * 
 * ## google\_spanner\_database\_iam\_member
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* {{project}}/{{instance}}/{{database}} * {{instance}}/{{database}} (project is taken from provider project) IAM member imports use space-delimited identifiers; the resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:spanner/databaseIAMPolicy:DatabaseIAMPolicy database "project-name/instance-name/database-name roles/viewer user:foo@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiers; the resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:spanner/databaseIAMPolicy:DatabaseIAMPolicy database "project-name/instance-name/database-name roles/viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:spanner/databaseIAMPolicy:DatabaseIAMPolicy database project-name/instance-name/database-name
 * ```
 * 
 *  -> **Custom Roles:** If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:spanner/databaseIAMPolicy:DatabaseIAMPolicy")
public class DatabaseIAMPolicy extends io.pulumi.resources.CustomResource {
    /**
     * The name of the Spanner database.
     * 
     */
    @OutputExport(name="database", type=String.class, parameters={})
    private Output<String> database;

    /**
     * @return The name of the Spanner database.
     * 
     */
    public Output<String> getDatabase() {
        return this.database;
    }
    /**
     * (Computed) The etag of the database's IAM policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the database's IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The name of the Spanner instance the database belongs to.
     * 
     */
    @OutputExport(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    /**
     * @return The name of the Spanner instance the database belongs to.
     * 
     */
    public Output<String> getInstance() {
        return this.instance;
    }
    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @OutputExport(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> getPolicyData() {
        return this.policyData;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }

    public interface BuilderApplicator {
        public void apply(DatabaseIAMPolicyArgs.Builder a);
    }
    private static io.pulumi.gcp.spanner.DatabaseIAMPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.spanner.DatabaseIAMPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DatabaseIAMPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseIAMPolicy(String name) {
        this(name, DatabaseIAMPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseIAMPolicy(String name, DatabaseIAMPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseIAMPolicy(String name, DatabaseIAMPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:spanner/databaseIAMPolicy:DatabaseIAMPolicy", name, args == null ? DatabaseIAMPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DatabaseIAMPolicy(String name, Input<String> id, @Nullable DatabaseIAMPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:spanner/databaseIAMPolicy:DatabaseIAMPolicy", name, state, makeResourceOptions(options, id));
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
    public static DatabaseIAMPolicy get(String name, Input<String> id, @Nullable DatabaseIAMPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseIAMPolicy(name, id, state, options);
    }
}