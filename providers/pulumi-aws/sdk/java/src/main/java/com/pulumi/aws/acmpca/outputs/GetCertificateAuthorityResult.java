// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acmpca.outputs;

import com.pulumi.aws.acmpca.outputs.GetCertificateAuthorityRevocationConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetCertificateAuthorityResult {
    private final String arn;
    /**
     * @return Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
     * 
     */
    private final String certificate;
    /**
     * @return Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
     * 
     */
    private final String certificateChain;
    /**
     * @return The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
     * 
     */
    private final String certificateSigningRequest;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     * 
     */
    private final String notAfter;
    /**
     * @return Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     * 
     */
    private final String notBefore;
    /**
     * @return Nested attribute containing revocation configuration.
     * * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
     * * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
     * * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
     * * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
     * * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
     * * `revocation_configuration.0.crl_configuration.0.s3_object_acl` - Whether the CRL is publicly readable or privately held in the CRL Amazon S3 bucket.
     * 
     */
    private final List<GetCertificateAuthorityRevocationConfiguration> revocationConfigurations;
    /**
     * @return Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
     * 
     */
    private final String serial;
    /**
     * @return Status of the certificate authority.
     * 
     */
    private final String status;
    /**
     * @return Specifies a key-value map of user-defined tags that are attached to the certificate authority.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return The type of the certificate authority.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetCertificateAuthorityResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("certificate") String certificate,
        @CustomType.Parameter("certificateChain") String certificateChain,
        @CustomType.Parameter("certificateSigningRequest") String certificateSigningRequest,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("notAfter") String notAfter,
        @CustomType.Parameter("notBefore") String notBefore,
        @CustomType.Parameter("revocationConfigurations") List<GetCertificateAuthorityRevocationConfiguration> revocationConfigurations,
        @CustomType.Parameter("serial") String serial,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.arn = arn;
        this.certificate = certificate;
        this.certificateChain = certificateChain;
        this.certificateSigningRequest = certificateSigningRequest;
        this.id = id;
        this.notAfter = notAfter;
        this.notBefore = notBefore;
        this.revocationConfigurations = revocationConfigurations;
        this.serial = serial;
        this.status = status;
        this.tags = tags;
        this.type = type;
    }

    public String arn() {
        return this.arn;
    }
    /**
     * @return Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
     * 
     */
    public String certificate() {
        return this.certificate;
    }
    /**
     * @return Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
     * 
     */
    public String certificateChain() {
        return this.certificateChain;
    }
    /**
     * @return The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
     * 
     */
    public String certificateSigningRequest() {
        return this.certificateSigningRequest;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     * 
     */
    public String notAfter() {
        return this.notAfter;
    }
    /**
     * @return Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     * 
     */
    public String notBefore() {
        return this.notBefore;
    }
    /**
     * @return Nested attribute containing revocation configuration.
     * * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
     * * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
     * * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
     * * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
     * * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
     * * `revocation_configuration.0.crl_configuration.0.s3_object_acl` - Whether the CRL is publicly readable or privately held in the CRL Amazon S3 bucket.
     * 
     */
    public List<GetCertificateAuthorityRevocationConfiguration> revocationConfigurations() {
        return this.revocationConfigurations;
    }
    /**
     * @return Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
     * 
     */
    public String serial() {
        return this.serial;
    }
    /**
     * @return Status of the certificate authority.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Specifies a key-value map of user-defined tags that are attached to the certificate authority.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The type of the certificate authority.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateAuthorityResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String certificate;
        private String certificateChain;
        private String certificateSigningRequest;
        private String id;
        private String notAfter;
        private String notBefore;
        private List<GetCertificateAuthorityRevocationConfiguration> revocationConfigurations;
        private String serial;
        private String status;
        private Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateAuthorityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.certificate = defaults.certificate;
    	      this.certificateChain = defaults.certificateChain;
    	      this.certificateSigningRequest = defaults.certificateSigningRequest;
    	      this.id = defaults.id;
    	      this.notAfter = defaults.notAfter;
    	      this.notBefore = defaults.notBefore;
    	      this.revocationConfigurations = defaults.revocationConfigurations;
    	      this.serial = defaults.serial;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder certificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        public Builder certificateChain(String certificateChain) {
            this.certificateChain = Objects.requireNonNull(certificateChain);
            return this;
        }
        public Builder certificateSigningRequest(String certificateSigningRequest) {
            this.certificateSigningRequest = Objects.requireNonNull(certificateSigningRequest);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder notAfter(String notAfter) {
            this.notAfter = Objects.requireNonNull(notAfter);
            return this;
        }
        public Builder notBefore(String notBefore) {
            this.notBefore = Objects.requireNonNull(notBefore);
            return this;
        }
        public Builder revocationConfigurations(List<GetCertificateAuthorityRevocationConfiguration> revocationConfigurations) {
            this.revocationConfigurations = Objects.requireNonNull(revocationConfigurations);
            return this;
        }
        public Builder revocationConfigurations(GetCertificateAuthorityRevocationConfiguration... revocationConfigurations) {
            return revocationConfigurations(List.of(revocationConfigurations));
        }
        public Builder serial(String serial) {
            this.serial = Objects.requireNonNull(serial);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetCertificateAuthorityResult build() {
            return new GetCertificateAuthorityResult(arn, certificate, certificateChain, certificateSigningRequest, id, notAfter, notBefore, revocationConfigurations, serial, status, tags, type);
        }
    }
}
