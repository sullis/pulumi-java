// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.keyvault.KeyArgs;
import io.pulumi.azurenative.keyvault.outputs.KeyAttributesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The key resource.
 * API Version: 2019-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:keyvault:Key sample-key-name /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/sample-group/providers/Microsoft.KeyVault/vaults/sample-vault-name/keys/sample-key-name 
 * ```
 * 
 */
@ResourceType(type="azure-native:keyvault:Key")
public class Key extends io.pulumi.resources.CustomResource {
    /**
     * The attributes of the key.
     * 
     */
    @OutputExport(name="attributes", type=KeyAttributesResponse.class, parameters={})
    private Output</* @Nullable */ KeyAttributesResponse> attributes;

    /**
     * @return The attributes of the key.
     * 
     */
    public Output</* @Nullable */ KeyAttributesResponse> getAttributes() {
        return this.attributes;
    }
    /**
     * The elliptic curve name. For valid values, see JsonWebKeyCurveName.
     * 
     */
    @OutputExport(name="curveName", type=String.class, parameters={})
    private Output</* @Nullable */ String> curveName;

    /**
     * @return The elliptic curve name. For valid values, see JsonWebKeyCurveName.
     * 
     */
    public Output</* @Nullable */ String> getCurveName() {
        return this.curveName;
    }
    @OutputExport(name="keyOps", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> keyOps;

    public Output</* @Nullable */ List<String>> getKeyOps() {
        return this.keyOps;
    }
    /**
     * The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     * 
     */
    @OutputExport(name="keySize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> keySize;

    /**
     * @return The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     * 
     */
    public Output</* @Nullable */ Integer> getKeySize() {
        return this.keySize;
    }
    /**
     * The URI to retrieve the current version of the key.
     * 
     */
    @OutputExport(name="keyUri", type=String.class, parameters={})
    private Output<String> keyUri;

    /**
     * @return The URI to retrieve the current version of the key.
     * 
     */
    public Output<String> getKeyUri() {
        return this.keyUri;
    }
    /**
     * The URI to retrieve the specific version of the key.
     * 
     */
    @OutputExport(name="keyUriWithVersion", type=String.class, parameters={})
    private Output<String> keyUriWithVersion;

    /**
     * @return The URI to retrieve the specific version of the key.
     * 
     */
    public Output<String> getKeyUriWithVersion() {
        return this.keyUriWithVersion;
    }
    /**
     * The type of the key. For valid values, see JsonWebKeyType.
     * 
     */
    @OutputExport(name="kty", type=String.class, parameters={})
    private Output</* @Nullable */ String> kty;

    /**
     * @return The type of the key. For valid values, see JsonWebKeyType.
     * 
     */
    public Output</* @Nullable */ String> getKty() {
        return this.kty;
    }
    /**
     * Azure location of the key vault resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Azure location of the key vault resource.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Name of the key vault resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the key vault resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Tags assigned to the key vault resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tags;

    /**
     * @return Tags assigned to the key vault resource.
     * 
     */
    public Output<Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type of the key vault resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type of the key vault resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(KeyArgs.Builder a);
    }
    private static io.pulumi.azurenative.keyvault.KeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.keyvault.KeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Key(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Key(String name) {
        this(name, KeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Key(String name, KeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Key(String name, KeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:keyvault:Key", name, args == null ? KeyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Key(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:keyvault:Key", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:keyvault/v20190901:Key").build()),
                Input.of(Alias.builder().setType("azure-native:keyvault/v20200401preview:Key").build()),
                Input.of(Alias.builder().setType("azure-native:keyvault/v20210401preview:Key").build()),
                Input.of(Alias.builder().setType("azure-native:keyvault/v20210601preview:Key").build()),
                Input.of(Alias.builder().setType("azure-native:keyvault/v20211001:Key").build()),
                Input.of(Alias.builder().setType("azure-native:keyvault/v20211101preview:Key").build())
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
    public static Key get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Key(name, id, options);
    }
}