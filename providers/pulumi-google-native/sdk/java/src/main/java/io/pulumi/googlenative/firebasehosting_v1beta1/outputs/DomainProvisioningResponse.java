// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.firebasehosting_v1beta1.outputs.CertDnsChallengeResponse;
import io.pulumi.googlenative.firebasehosting_v1beta1.outputs.CertHttpChallengeResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DomainProvisioningResponse {
    /**
     * The TXT records (for the certificate challenge) that were found at the last DNS fetch.
     * 
     */
    private final List<String> certChallengeDiscoveredTxt;
    /**
     * The DNS challenge for generating a certificate.
     * 
     */
    private final CertDnsChallengeResponse certChallengeDns;
    /**
     * The HTTP challenge for generating a certificate.
     * 
     */
    private final CertHttpChallengeResponse certChallengeHttp;
    /**
     * The certificate provisioning status; updated when Firebase Hosting provisions an SSL certificate for the domain.
     * 
     */
    private final String certStatus;
    /**
     * The IPs found at the last DNS fetch.
     * 
     */
    private final List<String> discoveredIps;
    /**
     * The time at which the last DNS fetch occurred.
     * 
     */
    private final String dnsFetchTime;
    /**
     * The DNS record match status as of the last DNS fetch.
     * 
     */
    private final String dnsStatus;
    /**
     * The list of IPs to which the domain is expected to resolve.
     * 
     */
    private final List<String> expectedIps;

    @OutputCustomType.Constructor({"certChallengeDiscoveredTxt","certChallengeDns","certChallengeHttp","certStatus","discoveredIps","dnsFetchTime","dnsStatus","expectedIps"})
    private DomainProvisioningResponse(
        List<String> certChallengeDiscoveredTxt,
        CertDnsChallengeResponse certChallengeDns,
        CertHttpChallengeResponse certChallengeHttp,
        String certStatus,
        List<String> discoveredIps,
        String dnsFetchTime,
        String dnsStatus,
        List<String> expectedIps) {
        this.certChallengeDiscoveredTxt = Objects.requireNonNull(certChallengeDiscoveredTxt);
        this.certChallengeDns = Objects.requireNonNull(certChallengeDns);
        this.certChallengeHttp = Objects.requireNonNull(certChallengeHttp);
        this.certStatus = Objects.requireNonNull(certStatus);
        this.discoveredIps = Objects.requireNonNull(discoveredIps);
        this.dnsFetchTime = Objects.requireNonNull(dnsFetchTime);
        this.dnsStatus = Objects.requireNonNull(dnsStatus);
        this.expectedIps = Objects.requireNonNull(expectedIps);
    }

    /**
     * The TXT records (for the certificate challenge) that were found at the last DNS fetch.
     * 
    */
    public List<String> getCertChallengeDiscoveredTxt() {
        return this.certChallengeDiscoveredTxt;
    }
    /**
     * The DNS challenge for generating a certificate.
     * 
    */
    public CertDnsChallengeResponse getCertChallengeDns() {
        return this.certChallengeDns;
    }
    /**
     * The HTTP challenge for generating a certificate.
     * 
    */
    public CertHttpChallengeResponse getCertChallengeHttp() {
        return this.certChallengeHttp;
    }
    /**
     * The certificate provisioning status; updated when Firebase Hosting provisions an SSL certificate for the domain.
     * 
    */
    public String getCertStatus() {
        return this.certStatus;
    }
    /**
     * The IPs found at the last DNS fetch.
     * 
    */
    public List<String> getDiscoveredIps() {
        return this.discoveredIps;
    }
    /**
     * The time at which the last DNS fetch occurred.
     * 
    */
    public String getDnsFetchTime() {
        return this.dnsFetchTime;
    }
    /**
     * The DNS record match status as of the last DNS fetch.
     * 
    */
    public String getDnsStatus() {
        return this.dnsStatus;
    }
    /**
     * The list of IPs to which the domain is expected to resolve.
     * 
    */
    public List<String> getExpectedIps() {
        return this.expectedIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainProvisioningResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> certChallengeDiscoveredTxt;
        private CertDnsChallengeResponse certChallengeDns;
        private CertHttpChallengeResponse certChallengeHttp;
        private String certStatus;
        private List<String> discoveredIps;
        private String dnsFetchTime;
        private String dnsStatus;
        private List<String> expectedIps;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainProvisioningResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certChallengeDiscoveredTxt = defaults.certChallengeDiscoveredTxt;
    	      this.certChallengeDns = defaults.certChallengeDns;
    	      this.certChallengeHttp = defaults.certChallengeHttp;
    	      this.certStatus = defaults.certStatus;
    	      this.discoveredIps = defaults.discoveredIps;
    	      this.dnsFetchTime = defaults.dnsFetchTime;
    	      this.dnsStatus = defaults.dnsStatus;
    	      this.expectedIps = defaults.expectedIps;
        }

        public Builder setCertChallengeDiscoveredTxt(List<String> certChallengeDiscoveredTxt) {
            this.certChallengeDiscoveredTxt = Objects.requireNonNull(certChallengeDiscoveredTxt);
            return this;
        }

        public Builder setCertChallengeDns(CertDnsChallengeResponse certChallengeDns) {
            this.certChallengeDns = Objects.requireNonNull(certChallengeDns);
            return this;
        }

        public Builder setCertChallengeHttp(CertHttpChallengeResponse certChallengeHttp) {
            this.certChallengeHttp = Objects.requireNonNull(certChallengeHttp);
            return this;
        }

        public Builder setCertStatus(String certStatus) {
            this.certStatus = Objects.requireNonNull(certStatus);
            return this;
        }

        public Builder setDiscoveredIps(List<String> discoveredIps) {
            this.discoveredIps = Objects.requireNonNull(discoveredIps);
            return this;
        }

        public Builder setDnsFetchTime(String dnsFetchTime) {
            this.dnsFetchTime = Objects.requireNonNull(dnsFetchTime);
            return this;
        }

        public Builder setDnsStatus(String dnsStatus) {
            this.dnsStatus = Objects.requireNonNull(dnsStatus);
            return this;
        }

        public Builder setExpectedIps(List<String> expectedIps) {
            this.expectedIps = Objects.requireNonNull(expectedIps);
            return this;
        }
        public DomainProvisioningResponse build() {
            return new DomainProvisioningResponse(certChallengeDiscoveredTxt, certChallengeDns, certChallengeHttp, certStatus, discoveredIps, dnsFetchTime, dnsStatus, expectedIps);
        }
    }
}