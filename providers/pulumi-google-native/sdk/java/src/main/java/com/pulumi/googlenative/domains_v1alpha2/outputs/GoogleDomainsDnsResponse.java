// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1alpha2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.domains_v1alpha2.outputs.DsRecordResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleDomainsDnsResponse {
    /**
     * @return The list of DS records published for this domain. The list is automatically populated when `ds_state` is `DS_RECORDS_PUBLISHED`, otherwise it remains empty.
     * 
     */
    private final List<DsRecordResponse> dsRecords;
    /**
     * @return The state of DS records for this domain. Used to enable or disable automatic DNSSEC.
     * 
     */
    private final String dsState;
    /**
     * @return A list of name servers that store the DNS zone for this domain. Each name server is a domain name, with Unicode domain names expressed in Punycode format. This field is automatically populated with the name servers assigned to the Google Domains DNS zone.
     * 
     */
    private final List<String> nameServers;

    @CustomType.Constructor
    private GoogleDomainsDnsResponse(
        @CustomType.Parameter("dsRecords") List<DsRecordResponse> dsRecords,
        @CustomType.Parameter("dsState") String dsState,
        @CustomType.Parameter("nameServers") List<String> nameServers) {
        this.dsRecords = dsRecords;
        this.dsState = dsState;
        this.nameServers = nameServers;
    }

    /**
     * @return The list of DS records published for this domain. The list is automatically populated when `ds_state` is `DS_RECORDS_PUBLISHED`, otherwise it remains empty.
     * 
     */
    public List<DsRecordResponse> dsRecords() {
        return this.dsRecords;
    }
    /**
     * @return The state of DS records for this domain. Used to enable or disable automatic DNSSEC.
     * 
     */
    public String dsState() {
        return this.dsState;
    }
    /**
     * @return A list of name servers that store the DNS zone for this domain. Each name server is a domain name, with Unicode domain names expressed in Punycode format. This field is automatically populated with the name servers assigned to the Google Domains DNS zone.
     * 
     */
    public List<String> nameServers() {
        return this.nameServers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDomainsDnsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DsRecordResponse> dsRecords;
        private String dsState;
        private List<String> nameServers;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDomainsDnsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dsRecords = defaults.dsRecords;
    	      this.dsState = defaults.dsState;
    	      this.nameServers = defaults.nameServers;
        }

        public Builder dsRecords(List<DsRecordResponse> dsRecords) {
            this.dsRecords = Objects.requireNonNull(dsRecords);
            return this;
        }
        public Builder dsRecords(DsRecordResponse... dsRecords) {
            return dsRecords(List.of(dsRecords));
        }
        public Builder dsState(String dsState) {
            this.dsState = Objects.requireNonNull(dsState);
            return this;
        }
        public Builder nameServers(List<String> nameServers) {
            this.nameServers = Objects.requireNonNull(nameServers);
            return this;
        }
        public Builder nameServers(String... nameServers) {
            return nameServers(List.of(nameServers));
        }        public GoogleDomainsDnsResponse build() {
            return new GoogleDomainsDnsResponse(dsRecords, dsState, nameServers);
        }
    }
}
