// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.ServerKeyArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A server key.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:ServerKey sqlcrudtest-4645 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/sqlcrudtest-7398/providers/Microsoft.Sql/servers/sqlcrudtest-4645/keys/someVault_someKey_01234567890123456789012345678901 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:ServerKey")
public class ServerKey extends io.pulumi.resources.CustomResource {
    /**
     * Key auto rotation opt-in flag. Either true or false.
     * 
     */
    @OutputExport(name="autoRotationEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> autoRotationEnabled;

    /**
     * @return Key auto rotation opt-in flag. Either true or false.
     * 
     */
    public Output<Boolean> getAutoRotationEnabled() {
        return this.autoRotationEnabled;
    }
    /**
     * The server key creation date.
     * 
     */
    @OutputExport(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The server key creation date.
     * 
     */
    public Output<String> getCreationDate() {
        return this.creationDate;
    }
    /**
     * Kind of encryption protector. This is metadata used for the Azure portal experience.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of encryption protector. This is metadata used for the Azure portal experience.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Subregion of the server key.
     * 
     */
    @OutputExport(name="subregion", type=String.class, parameters={})
    private Output<String> subregion;

    /**
     * @return Subregion of the server key.
     * 
     */
    public Output<String> getSubregion() {
        return this.subregion;
    }
    /**
     * Thumbprint of the server key.
     * 
     */
    @OutputExport(name="thumbprint", type=String.class, parameters={})
    private Output<String> thumbprint;

    /**
     * @return Thumbprint of the server key.
     * 
     */
    public Output<String> getThumbprint() {
        return this.thumbprint;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ServerKeyArgs.Builder a);
    }
    private static io.pulumi.azurenative.sql.ServerKeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.sql.ServerKeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ServerKey(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerKey(String name) {
        this(name, ServerKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerKey(String name, ServerKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerKey(String name, ServerKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerKey", name, args == null ? ServerKeyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServerKey(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerKey", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20150501preview:ServerKey").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200202preview:ServerKey").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200801preview:ServerKey").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20201101preview:ServerKey").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210201preview:ServerKey").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:ServerKey").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:ServerKey").build())
            ))
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
    public static ServerKey get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServerKey(name, id, options);
    }
}