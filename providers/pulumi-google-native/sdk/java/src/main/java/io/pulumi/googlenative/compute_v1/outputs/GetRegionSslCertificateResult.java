// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.SslCertificateManagedSslCertificateResponse;
import io.pulumi.googlenative.compute_v1.outputs.SslCertificateSelfManagedSslCertificateResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetRegionSslCertificateResult {
    /**
     * A value read into memory from a certificate file. The certificate file must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * 
     */
    private final String certificate;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Expire time of the certificate. RFC3339
     * 
     */
    private final String expireTime;
    /**
     * Type of the resource. Always compute#sslCertificate for SSL certificates.
     * 
     */
    private final String kind;
    /**
     * Configuration and status of a managed SSL certificate.
     * 
     */
    private final SslCertificateManagedSslCertificateResponse managed;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * A value read into memory from a write-only private key file. The private key file must be in PEM format. For security, only insert requests include this field.
     * 
     */
    private final String privateKey;
    /**
     * URL of the region where the regional SSL Certificate resides. This field is not applicable to global SSL Certificate.
     * 
     */
    private final String region;
    /**
     * [Output only] Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Configuration and status of a self-managed SSL certificate.
     * 
     */
    private final SslCertificateSelfManagedSslCertificateResponse selfManaged;
    /**
     * Domains associated with the certificate via Subject Alternative Name.
     * 
     */
    private final List<String> subjectAlternativeNames;
    /**
     * (Optional) Specifies the type of SSL certificate, either "SELF_MANAGED" or "MANAGED". If not specified, the certificate is self-managed and the fields certificate and private_key are used.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"certificate","creationTimestamp","description","expireTime","kind","managed","name","privateKey","region","selfLink","selfManaged","subjectAlternativeNames","type"})
    private GetRegionSslCertificateResult(
        String certificate,
        String creationTimestamp,
        String description,
        String expireTime,
        String kind,
        SslCertificateManagedSslCertificateResponse managed,
        String name,
        String privateKey,
        String region,
        String selfLink,
        SslCertificateSelfManagedSslCertificateResponse selfManaged,
        List<String> subjectAlternativeNames,
        String type) {
        this.certificate = Objects.requireNonNull(certificate);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.expireTime = Objects.requireNonNull(expireTime);
        this.kind = Objects.requireNonNull(kind);
        this.managed = Objects.requireNonNull(managed);
        this.name = Objects.requireNonNull(name);
        this.privateKey = Objects.requireNonNull(privateKey);
        this.region = Objects.requireNonNull(region);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.selfManaged = Objects.requireNonNull(selfManaged);
        this.subjectAlternativeNames = Objects.requireNonNull(subjectAlternativeNames);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * A value read into memory from a certificate file. The certificate file must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * 
    */
    public String getCertificate() {
        return this.certificate;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Expire time of the certificate. RFC3339
     * 
    */
    public String getExpireTime() {
        return this.expireTime;
    }
    /**
     * Type of the resource. Always compute#sslCertificate for SSL certificates.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Configuration and status of a managed SSL certificate.
     * 
    */
    public SslCertificateManagedSslCertificateResponse getManaged() {
        return this.managed;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A value read into memory from a write-only private key file. The private key file must be in PEM format. For security, only insert requests include this field.
     * 
    */
    public String getPrivateKey() {
        return this.privateKey;
    }
    /**
     * URL of the region where the regional SSL Certificate resides. This field is not applicable to global SSL Certificate.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * [Output only] Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Configuration and status of a self-managed SSL certificate.
     * 
    */
    public SslCertificateSelfManagedSslCertificateResponse getSelfManaged() {
        return this.selfManaged;
    }
    /**
     * Domains associated with the certificate via Subject Alternative Name.
     * 
    */
    public List<String> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }
    /**
     * (Optional) Specifies the type of SSL certificate, either "SELF_MANAGED" or "MANAGED". If not specified, the certificate is self-managed and the fields certificate and private_key are used.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionSslCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificate;
        private String creationTimestamp;
        private String description;
        private String expireTime;
        private String kind;
        private SslCertificateManagedSslCertificateResponse managed;
        private String name;
        private String privateKey;
        private String region;
        private String selfLink;
        private SslCertificateSelfManagedSslCertificateResponse selfManaged;
        private List<String> subjectAlternativeNames;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionSslCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.expireTime = defaults.expireTime;
    	      this.kind = defaults.kind;
    	      this.managed = defaults.managed;
    	      this.name = defaults.name;
    	      this.privateKey = defaults.privateKey;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.selfManaged = defaults.selfManaged;
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.type = defaults.type;
        }

        public Builder setCertificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setExpireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setManaged(SslCertificateManagedSslCertificateResponse managed) {
            this.managed = Objects.requireNonNull(managed);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSelfManaged(SslCertificateSelfManagedSslCertificateResponse selfManaged) {
            this.selfManaged = Objects.requireNonNull(selfManaged);
            return this;
        }

        public Builder setSubjectAlternativeNames(List<String> subjectAlternativeNames) {
            this.subjectAlternativeNames = Objects.requireNonNull(subjectAlternativeNames);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetRegionSslCertificateResult build() {
            return new GetRegionSslCertificateResult(certificate, creationTimestamp, description, expireTime, kind, managed, name, privateKey, region, selfLink, selfManaged, subjectAlternativeNames, type);
        }
    }
}