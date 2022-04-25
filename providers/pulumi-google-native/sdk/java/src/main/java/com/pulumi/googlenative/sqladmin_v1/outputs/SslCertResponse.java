// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SslCertResponse {
    /**
     * @return PEM representation.
     * 
     */
    private final String cert;
    /**
     * @return Serial number, as extracted from the certificate.
     * 
     */
    private final String certSerialNumber;
    /**
     * @return User supplied name. Constrained to [a-zA-Z.-_ ]+.
     * 
     */
    private final String commonName;
    /**
     * @return The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`
     * 
     */
    private final String createTime;
    /**
     * @return The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    private final String expirationTime;
    /**
     * @return Name of the database instance.
     * 
     */
    private final String instance;
    /**
     * @return This is always `sql#sslCert`.
     * 
     */
    private final String kind;
    /**
     * @return The URI of this resource.
     * 
     */
    private final String selfLink;
    /**
     * @return Sha1 Fingerprint.
     * 
     */
    private final String sha1Fingerprint;

    @CustomType.Constructor
    private SslCertResponse(
        @CustomType.Parameter("cert") String cert,
        @CustomType.Parameter("certSerialNumber") String certSerialNumber,
        @CustomType.Parameter("commonName") String commonName,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("expirationTime") String expirationTime,
        @CustomType.Parameter("instance") String instance,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("sha1Fingerprint") String sha1Fingerprint) {
        this.cert = cert;
        this.certSerialNumber = certSerialNumber;
        this.commonName = commonName;
        this.createTime = createTime;
        this.expirationTime = expirationTime;
        this.instance = instance;
        this.kind = kind;
        this.selfLink = selfLink;
        this.sha1Fingerprint = sha1Fingerprint;
    }

    /**
     * @return PEM representation.
     * 
     */
    public String cert() {
        return this.cert;
    }
    /**
     * @return Serial number, as extracted from the certificate.
     * 
     */
    public String certSerialNumber() {
        return this.certSerialNumber;
    }
    /**
     * @return User supplied name. Constrained to [a-zA-Z.-_ ]+.
     * 
     */
    public String commonName() {
        return this.commonName;
    }
    /**
     * @return The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    public String expirationTime() {
        return this.expirationTime;
    }
    /**
     * @return Name of the database instance.
     * 
     */
    public String instance() {
        return this.instance;
    }
    /**
     * @return This is always `sql#sslCert`.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The URI of this resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return Sha1 Fingerprint.
     * 
     */
    public String sha1Fingerprint() {
        return this.sha1Fingerprint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslCertResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cert;
        private String certSerialNumber;
        private String commonName;
        private String createTime;
        private String expirationTime;
        private String instance;
        private String kind;
        private String selfLink;
        private String sha1Fingerprint;

        public Builder() {
    	      // Empty
        }

        public Builder(SslCertResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.certSerialNumber = defaults.certSerialNumber;
    	      this.commonName = defaults.commonName;
    	      this.createTime = defaults.createTime;
    	      this.expirationTime = defaults.expirationTime;
    	      this.instance = defaults.instance;
    	      this.kind = defaults.kind;
    	      this.selfLink = defaults.selfLink;
    	      this.sha1Fingerprint = defaults.sha1Fingerprint;
        }

        public Builder cert(String cert) {
            this.cert = Objects.requireNonNull(cert);
            return this;
        }
        public Builder certSerialNumber(String certSerialNumber) {
            this.certSerialNumber = Objects.requireNonNull(certSerialNumber);
            return this;
        }
        public Builder commonName(String commonName) {
            this.commonName = Objects.requireNonNull(commonName);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }
        public Builder instance(String instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder sha1Fingerprint(String sha1Fingerprint) {
            this.sha1Fingerprint = Objects.requireNonNull(sha1Fingerprint);
            return this;
        }        public SslCertResponse build() {
            return new SslCertResponse(cert, certSerialNumber, commonName, createTime, expirationTime, instance, kind, selfLink, sha1Fingerprint);
        }
    }
}
