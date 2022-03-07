// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.privateca_v1beta1.outputs.X509ExtensionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SubjectAltNamesResponse {
    /**
     * Contains additional subject alternative name values.
     * 
     */
    private final List<X509ExtensionResponse> customSans;
    /**
     * Contains only valid, fully-qualified host names.
     * 
     */
    private final List<String> dnsNames;
    /**
     * Contains only valid RFC 2822 E-mail addresses.
     * 
     */
    private final List<String> emailAddresses;
    /**
     * Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
     * 
     */
    private final List<String> ipAddresses;
    /**
     * Contains only valid RFC 3986 URIs.
     * 
     */
    private final List<String> uris;

    @OutputCustomType.Constructor({"customSans","dnsNames","emailAddresses","ipAddresses","uris"})
    private SubjectAltNamesResponse(
        List<X509ExtensionResponse> customSans,
        List<String> dnsNames,
        List<String> emailAddresses,
        List<String> ipAddresses,
        List<String> uris) {
        this.customSans = Objects.requireNonNull(customSans);
        this.dnsNames = Objects.requireNonNull(dnsNames);
        this.emailAddresses = Objects.requireNonNull(emailAddresses);
        this.ipAddresses = Objects.requireNonNull(ipAddresses);
        this.uris = Objects.requireNonNull(uris);
    }

    /**
     * Contains additional subject alternative name values.
     * 
    */
    public List<X509ExtensionResponse> getCustomSans() {
        return this.customSans;
    }
    /**
     * Contains only valid, fully-qualified host names.
     * 
    */
    public List<String> getDnsNames() {
        return this.dnsNames;
    }
    /**
     * Contains only valid RFC 2822 E-mail addresses.
     * 
    */
    public List<String> getEmailAddresses() {
        return this.emailAddresses;
    }
    /**
     * Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
     * 
    */
    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }
    /**
     * Contains only valid RFC 3986 URIs.
     * 
    */
    public List<String> getUris() {
        return this.uris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectAltNamesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<X509ExtensionResponse> customSans;
        private List<String> dnsNames;
        private List<String> emailAddresses;
        private List<String> ipAddresses;
        private List<String> uris;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectAltNamesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customSans = defaults.customSans;
    	      this.dnsNames = defaults.dnsNames;
    	      this.emailAddresses = defaults.emailAddresses;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.uris = defaults.uris;
        }

        public Builder setCustomSans(List<X509ExtensionResponse> customSans) {
            this.customSans = Objects.requireNonNull(customSans);
            return this;
        }

        public Builder setDnsNames(List<String> dnsNames) {
            this.dnsNames = Objects.requireNonNull(dnsNames);
            return this;
        }

        public Builder setEmailAddresses(List<String> emailAddresses) {
            this.emailAddresses = Objects.requireNonNull(emailAddresses);
            return this;
        }

        public Builder setIpAddresses(List<String> ipAddresses) {
            this.ipAddresses = Objects.requireNonNull(ipAddresses);
            return this;
        }

        public Builder setUris(List<String> uris) {
            this.uris = Objects.requireNonNull(uris);
            return this;
        }
        public SubjectAltNamesResponse build() {
            return new SubjectAltNamesResponse(customSans, dnsNames, emailAddresses, ipAddresses, uris);
        }
    }
}