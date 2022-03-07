// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acm;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.acm.CertificateArgs;
import io.pulumi.aws.acm.inputs.CertificateState;
import io.pulumi.aws.acm.outputs.CertificateDomainValidationOption;
import io.pulumi.aws.acm.outputs.CertificateOptions;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The ACM certificate resource allows requesting and management of certificates
 * from the Amazon Certificate Manager.
 * 
 * It deals with requesting certificates and managing their attributes and life-cycle.
 * This resource does not deal with validation of a certificate but can provide inputs
 * for other resources implementing the validation. It does not wait for a certificate to be issued.
 * Use a `aws.acm.CertificateValidation` resource for this.
 * 
 * Most commonly, this resource is used together with `aws.route53.Record` and
 * `aws.acm.CertificateValidation` to request a DNS validated certificate,
 * deploy the required validation records and wait for validation to complete.
 * 
 * Domain validation through E-Mail is also supported but should be avoided as it requires a manual step outside
 * of this provider.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Certificates can be imported using their ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:acm/certificate:Certificate cert arn:aws:acm:eu-central-1:123456789012:certificate/7e7a28d2-163f-4b8f-b9cd-822f96c08d6a
 * ```
 * 
 */
@ResourceType(type="aws:acm/certificate:Certificate")
public class Certificate extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the certificate
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the certificate
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * ARN of an ACM PCA
     * 
     */
    @OutputExport(name="certificateAuthorityArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateAuthorityArn;

    /**
     * @return ARN of an ACM PCA
     * 
     */
    public Output</* @Nullable */ String> getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }
    /**
     * The certificate's PEM-formatted public key
     * 
     */
    @OutputExport(name="certificateBody", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateBody;

    /**
     * @return The certificate's PEM-formatted public key
     * 
     */
    public Output</* @Nullable */ String> getCertificateBody() {
        return this.certificateBody;
    }
    /**
     * The certificate's PEM-formatted chain
     * * Creating a private CA issued certificate
     * 
     */
    @OutputExport(name="certificateChain", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateChain;

    /**
     * @return The certificate's PEM-formatted chain
     * * Creating a private CA issued certificate
     * 
     */
    public Output</* @Nullable */ String> getCertificateChain() {
        return this.certificateChain;
    }
    /**
     * A domain name for which the certificate should be issued
     * 
     */
    @OutputExport(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return A domain name for which the certificate should be issued
     * 
     */
    public Output<String> getDomainName() {
        return this.domainName;
    }
    /**
     * Set of domain validation objects which can be used to complete certificate validation. Can have more than one element, e.g., if SANs are defined. Only set if `DNS`-validation was used.
     * 
     */
    @OutputExport(name="domainValidationOptions", type=List.class, parameters={CertificateDomainValidationOption.class})
    private Output<List<CertificateDomainValidationOption>> domainValidationOptions;

    /**
     * @return Set of domain validation objects which can be used to complete certificate validation. Can have more than one element, e.g., if SANs are defined. Only set if `DNS`-validation was used.
     * 
     */
    public Output<List<CertificateDomainValidationOption>> getDomainValidationOptions() {
        return this.domainValidationOptions;
    }
    /**
     * Configuration block used to set certificate options. Detailed below.
     * * Importing an existing certificate
     * 
     */
    @OutputExport(name="options", type=CertificateOptions.class, parameters={})
    private Output</* @Nullable */ CertificateOptions> options;

    /**
     * @return Configuration block used to set certificate options. Detailed below.
     * * Importing an existing certificate
     * 
     */
    public Output</* @Nullable */ CertificateOptions> getOptions() {
        return this.options;
    }
    /**
     * The certificate's PEM-formatted private key
     * 
     */
    @OutputExport(name="privateKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateKey;

    /**
     * @return The certificate's PEM-formatted private key
     * 
     */
    public Output</* @Nullable */ String> getPrivateKey() {
        return this.privateKey;
    }
    /**
     * Status of the certificate.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the certificate.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Set of domains that should be SANs in the issued certificate. To remove all elements of a previously configured list, set this value equal to an empty list (`[]`).
     * 
     */
    @OutputExport(name="subjectAlternativeNames", type=List.class, parameters={String.class})
    private Output<List<String>> subjectAlternativeNames;

    /**
     * @return Set of domains that should be SANs in the issued certificate. To remove all elements of a previously configured list, set this value equal to an empty list (`[]`).
     * 
     */
    public Output<List<String>> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }
    /**
     * A map of tags to assign to the resource..
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource..
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * A list of addresses that received a validation E-Mail. Only set if `EMAIL`-validation was used.
     * 
     */
    @OutputExport(name="validationEmails", type=List.class, parameters={String.class})
    private Output<List<String>> validationEmails;

    /**
     * @return A list of addresses that received a validation E-Mail. Only set if `EMAIL`-validation was used.
     * 
     */
    public Output<List<String>> getValidationEmails() {
        return this.validationEmails;
    }
    /**
     * Which method to use for validation. `DNS` or `EMAIL` are valid, `NONE` can be used for certificates that were imported into ACM and then into the provider.
     * 
     */
    @OutputExport(name="validationMethod", type=String.class, parameters={})
    private Output<String> validationMethod;

    /**
     * @return Which method to use for validation. `DNS` or `EMAIL` are valid, `NONE` can be used for certificates that were imported into ACM and then into the provider.
     * 
     */
    public Output<String> getValidationMethod() {
        return this.validationMethod;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable CertificateArgs.Builder a);
    }
    private static io.pulumi.aws.acm.CertificateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.acm.CertificateArgs.builder();
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
    public Certificate(String name, @Nullable CertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certificate(String name, @Nullable CertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:acm/certificate:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Certificate(String name, Input<String> id, @Nullable CertificateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:acm/certificate:Certificate", name, state, makeResourceOptions(options, id));
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
    public static Certificate get(String name, Input<String> id, @Nullable CertificateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, state, options);
    }
}