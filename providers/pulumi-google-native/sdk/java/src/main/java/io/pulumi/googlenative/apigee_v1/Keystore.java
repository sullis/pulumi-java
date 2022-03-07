// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.KeystoreArgs;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a keystore or truststore. - Keystore: Contains certificates and their associated keys. - Truststore: Contains trusted certificates used to validate a server's certificate. These certificates are typically self-signed certificates or certificates that are not signed by a trusted CA.
 * 
 */
@ResourceType(type="google-native:apigee/v1:Keystore")
public class Keystore extends io.pulumi.resources.CustomResource {
    /**
     * Aliases in this keystore.
     * 
     */
    @OutputExport(name="aliases", type=List.class, parameters={String.class})
    private Output<List<String>> aliases;

    /**
     * @return Aliases in this keystore.
     * 
     */
    public Output<List<String>> getAliases() {
        return this.aliases;
    }
    /**
     * Resource ID for this keystore. Values must match the regular expression `[\w[:space:]-.]{1,255}`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource ID for this keystore. Values must match the regular expression `[\w[:space:]-.]{1,255}`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(KeystoreArgs.Builder a);
    }
    private static io.pulumi.googlenative.apigee_v1.KeystoreArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.apigee_v1.KeystoreArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Keystore(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Keystore(String name) {
        this(name, KeystoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Keystore(String name, KeystoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Keystore(String name, KeystoreArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Keystore", name, args == null ? KeystoreArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Keystore(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Keystore", name, null, makeResourceOptions(options, id));
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
    public static Keystore get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Keystore(name, id, options);
    }
}