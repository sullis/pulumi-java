// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.AliasArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1CertificateResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an alias from a key/certificate pair. The structure of the request is controlled by the `format` query parameter: - `keycertfile` - Separate PEM-encoded key and certificate files are uploaded. Set `Content-Type: multipart/form-data` and include the `keyFile`, `certFile`, and `password` (if keys are encrypted) fields in the request body. If uploading to a truststore, omit `keyFile`. - `pkcs12` - A PKCS12 file is uploaded. Set `Content-Type: multipart/form-data`, provide the file in the `file` field, and include the `password` field if the file is encrypted in the request body. - `selfsignedcert` - A new private key and certificate are generated. Set `Content-Type: application/json` and include CertificateGenerationSpec in the request body.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:apigee/v1:Alias")
public class Alias extends io.pulumi.resources.CustomResource {
    /**
     * Resource ID for this alias. Values must match the regular expression `[^/]{1,255}`.
     * 
     */
    @OutputExport(name="alias", type=String.class, parameters={})
    private Output<String> alias;

    /**
     * @return Resource ID for this alias. Values must match the regular expression `[^/]{1,255}`.
     * 
     */
    public Output<String> getAlias() {
        return this.alias;
    }
    /**
     * Chain of certificates under this alias.
     * 
     */
    @OutputExport(name="certsInfo", type=GoogleCloudApigeeV1CertificateResponse.class, parameters={})
    private Output<GoogleCloudApigeeV1CertificateResponse> certsInfo;

    /**
     * @return Chain of certificates under this alias.
     * 
     */
    public Output<GoogleCloudApigeeV1CertificateResponse> getCertsInfo() {
        return this.certsInfo;
    }
    /**
     * Type of alias.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of alias.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(AliasArgs.Builder a);
    }
    private static io.pulumi.googlenative.apigee_v1.AliasArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.apigee_v1.AliasArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Alias(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Alias(String name) {
        this(name, AliasArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Alias(String name, AliasArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Alias(String name, AliasArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Alias", name, args == null ? AliasArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Alias(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Alias", name, null, makeResourceOptions(options, id));
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
    public static Alias get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Alias(name, id, options);
    }
}