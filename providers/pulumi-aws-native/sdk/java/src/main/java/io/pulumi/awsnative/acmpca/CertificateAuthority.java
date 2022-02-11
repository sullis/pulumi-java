// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.acmpca.CertificateAuthorityArgs;
import io.pulumi.awsnative.acmpca.outputs.CertificateAuthorityCsrExtensions;
import io.pulumi.awsnative.acmpca.outputs.CertificateAuthorityRevocationConfiguration;
import io.pulumi.awsnative.acmpca.outputs.CertificateAuthoritySubject;
import io.pulumi.awsnative.acmpca.outputs.CertificateAuthorityTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:acmpca:CertificateAuthority")
public class CertificateAuthority extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="certificateSigningRequest", type=String.class, parameters={})
    private Output<String> certificateSigningRequest;

    public Output<String> getCertificateSigningRequest() {
        return this.certificateSigningRequest;
    }
    @OutputExport(name="csrExtensions", type=CertificateAuthorityCsrExtensions.class, parameters={})
    private Output</* @Nullable */ CertificateAuthorityCsrExtensions> csrExtensions;

    public Output</* @Nullable */ CertificateAuthorityCsrExtensions> getCsrExtensions() {
        return this.csrExtensions;
    }
    @OutputExport(name="keyAlgorithm", type=String.class, parameters={})
    private Output<String> keyAlgorithm;

    public Output<String> getKeyAlgorithm() {
        return this.keyAlgorithm;
    }
    @OutputExport(name="keyStorageSecurityStandard", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyStorageSecurityStandard;

    public Output</* @Nullable */ String> getKeyStorageSecurityStandard() {
        return this.keyStorageSecurityStandard;
    }
    @OutputExport(name="revocationConfiguration", type=CertificateAuthorityRevocationConfiguration.class, parameters={})
    private Output</* @Nullable */ CertificateAuthorityRevocationConfiguration> revocationConfiguration;

    public Output</* @Nullable */ CertificateAuthorityRevocationConfiguration> getRevocationConfiguration() {
        return this.revocationConfiguration;
    }
    @OutputExport(name="signingAlgorithm", type=String.class, parameters={})
    private Output<String> signingAlgorithm;

    public Output<String> getSigningAlgorithm() {
        return this.signingAlgorithm;
    }
    @OutputExport(name="subject", type=CertificateAuthoritySubject.class, parameters={})
    private Output<CertificateAuthoritySubject> subject;

    public Output<CertificateAuthoritySubject> getSubject() {
        return this.subject;
    }
    @OutputExport(name="tags", type=List.class, parameters={CertificateAuthorityTag.class})
    private Output</* @Nullable */ List<CertificateAuthorityTag>> tags;

    public Output</* @Nullable */ List<CertificateAuthorityTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public CertificateAuthority(String name, CertificateAuthorityArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:acmpca:CertificateAuthority", name, args == null ? CertificateAuthorityArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CertificateAuthority(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:acmpca:CertificateAuthority", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static CertificateAuthority get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CertificateAuthority(name, id, options);
    }
}
