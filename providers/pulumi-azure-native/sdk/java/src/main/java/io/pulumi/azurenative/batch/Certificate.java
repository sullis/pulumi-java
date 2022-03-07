// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.batch.CertificateArgs;
import io.pulumi.azurenative.batch.outputs.DeleteCertificateErrorResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Contains information about a certificate.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:batch:Certificate sha1-0a0e4f50d51beadeac1d35afc5116098e7902e6e /subscriptions/subid/resourceGroups/default-azurebatch-japaneast/providers/Microsoft.Batch/batchAccounts/samplecct/certificates/sha1-0a0e4f50d51beadeac1d35afc5116098e7902e6e 
 * ```
 * 
 */
@ResourceType(type="azure-native:batch:Certificate")
public class Certificate extends io.pulumi.resources.CustomResource {
    /**
     * This is only returned when the certificate provisioningState is 'Failed'.
     * 
     */
    @OutputExport(name="deleteCertificateError", type=DeleteCertificateErrorResponse.class, parameters={})
    private Output<DeleteCertificateErrorResponse> deleteCertificateError;

    /**
     * @return This is only returned when the certificate provisioningState is 'Failed'.
     * 
     */
    public Output<DeleteCertificateErrorResponse> getDeleteCertificateError() {
        return this.deleteCertificateError;
    }
    /**
     * The ETag of the resource, used for concurrency statements.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The ETag of the resource, used for concurrency statements.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     * 
     */
    @OutputExport(name="format", type=String.class, parameters={})
    private Output</* @Nullable */ String> format;

    /**
     * @return The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     * 
     */
    public Output</* @Nullable */ String> getFormat() {
        return this.format;
    }
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The previous provisioned state of the resource
     * 
     */
    @OutputExport(name="previousProvisioningState", type=String.class, parameters={})
    private Output<String> previousProvisioningState;

    /**
     * @return The previous provisioned state of the resource
     * 
     */
    public Output<String> getPreviousProvisioningState() {
        return this.previousProvisioningState;
    }
    @OutputExport(name="previousProvisioningStateTransitionTime", type=String.class, parameters={})
    private Output<String> previousProvisioningStateTransitionTime;

    public Output<String> getPreviousProvisioningStateTransitionTime() {
        return this.previousProvisioningStateTransitionTime;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="provisioningStateTransitionTime", type=String.class, parameters={})
    private Output<String> provisioningStateTransitionTime;

    public Output<String> getProvisioningStateTransitionTime() {
        return this.provisioningStateTransitionTime;
    }
    /**
     * The public key of the certificate.
     * 
     */
    @OutputExport(name="publicData", type=String.class, parameters={})
    private Output<String> publicData;

    /**
     * @return The public key of the certificate.
     * 
     */
    public Output<String> getPublicData() {
        return this.publicData;
    }
    /**
     * This must match the thumbprint from the name.
     * 
     */
    @OutputExport(name="thumbprint", type=String.class, parameters={})
    private Output</* @Nullable */ String> thumbprint;

    /**
     * @return This must match the thumbprint from the name.
     * 
     */
    public Output</* @Nullable */ String> getThumbprint() {
        return this.thumbprint;
    }
    /**
     * This must match the first portion of the certificate name. Currently required to be 'SHA1'.
     * 
     */
    @OutputExport(name="thumbprintAlgorithm", type=String.class, parameters={})
    private Output</* @Nullable */ String> thumbprintAlgorithm;

    /**
     * @return This must match the first portion of the certificate name. Currently required to be 'SHA1'.
     * 
     */
    public Output</* @Nullable */ String> getThumbprintAlgorithm() {
        return this.thumbprintAlgorithm;
    }
    /**
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(CertificateArgs.Builder a);
    }
    private static io.pulumi.azurenative.batch.CertificateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.batch.CertificateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Certificate(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Certificate(String name) {
        this(name, CertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Certificate(String name, CertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certificate(String name, CertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:batch:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Certificate(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:batch:Certificate", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:batch/v20170901:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20181201:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20190401:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20190801:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20200301:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20200501:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20200901:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20210101:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20210601:Certificate").build())
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
    public static Certificate get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, options);
    }
}