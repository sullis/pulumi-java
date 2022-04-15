// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acm;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.acm.CertificateValidationArgs;
import io.pulumi.aws.acm.inputs.CertificateValidationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource represents a successful validation of an ACM certificate in concert
 * with other resources.
 * 
 * Most commonly, this resource is used together with `aws.route53.Record` and
 * `aws.acm.Certificate` to request a DNS validated certificate,
 * deploy the required validation records and wait for validation to complete.
 * 
 * > **WARNING:** This resource implements a part of the validation workflow. It does not represent a real-world entity in AWS, therefore changing or deleting this resource on its own has no immediate effect.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:acm/certificateValidation:CertificateValidation")
public class CertificateValidation extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the certificate that is being validated.
     * 
     */
    @Export(name="certificateArn", type=String.class, parameters={})
    private Output<String> certificateArn;

    /**
     * @return The ARN of the certificate that is being validated.
     * 
     */
    public Output<String> certificateArn() {
        return this.certificateArn;
    }
    /**
     * List of FQDNs that implement the validation. Only valid for DNS validation method ACM certificates. If this is set, the resource can implement additional sanity checks and has an explicit dependency on the resource that is implementing the validation
     * 
     */
    @Export(name="validationRecordFqdns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> validationRecordFqdns;

    /**
     * @return List of FQDNs that implement the validation. Only valid for DNS validation method ACM certificates. If this is set, the resource can implement additional sanity checks and has an explicit dependency on the resource that is implementing the validation
     * 
     */
    public Output</* @Nullable */ List<String>> validationRecordFqdns() {
        return this.validationRecordFqdns;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertificateValidation(String name) {
        this(name, CertificateValidationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertificateValidation(String name, CertificateValidationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertificateValidation(String name, CertificateValidationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:acm/certificateValidation:CertificateValidation", name, args == null ? CertificateValidationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CertificateValidation(String name, Output<String> id, @Nullable CertificateValidationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:acm/certificateValidation:CertificateValidation", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static CertificateValidation get(String name, Output<String> id, @Nullable CertificateValidationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CertificateValidation(name, id, state, options);
    }
}
