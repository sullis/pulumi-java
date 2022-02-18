// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ARecordResponse;
import io.pulumi.azurenative.network.outputs.AaaaRecordResponse;
import io.pulumi.azurenative.network.outputs.CaaRecordResponse;
import io.pulumi.azurenative.network.outputs.CnameRecordResponse;
import io.pulumi.azurenative.network.outputs.MxRecordResponse;
import io.pulumi.azurenative.network.outputs.NsRecordResponse;
import io.pulumi.azurenative.network.outputs.PtrRecordResponse;
import io.pulumi.azurenative.network.outputs.SoaRecordResponse;
import io.pulumi.azurenative.network.outputs.SrvRecordResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.TxtRecordResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRecordSetResult {
    /**
     * The list of A records in the record set.
     * 
     */
    private final @Nullable List<ARecordResponse> aRecords;
    /**
     * The list of AAAA records in the record set.
     * 
     */
    private final @Nullable List<AaaaRecordResponse> aaaaRecords;
    /**
     * The list of CAA records in the record set.
     * 
     */
    private final @Nullable List<CaaRecordResponse> caaRecords;
    /**
     * The CNAME record in the  record set.
     * 
     */
    private final @Nullable CnameRecordResponse cnameRecord;
    /**
     * The etag of the record set.
     * 
     */
    private final @Nullable String etag;
    /**
     * Fully qualified domain name of the record set.
     * 
     */
    private final String fqdn;
    /**
     * The ID of the record set.
     * 
     */
    private final String id;
    /**
     * The metadata attached to the record set.
     * 
     */
    private final @Nullable Map<String,String> metadata;
    /**
     * The list of MX records in the record set.
     * 
     */
    private final @Nullable List<MxRecordResponse> mxRecords;
    /**
     * The name of the record set.
     * 
     */
    private final String name;
    /**
     * The list of NS records in the record set.
     * 
     */
    private final @Nullable List<NsRecordResponse> nsRecords;
    /**
     * provisioning State of the record set.
     * 
     */
    private final String provisioningState;
    /**
     * The list of PTR records in the record set.
     * 
     */
    private final @Nullable List<PtrRecordResponse> ptrRecords;
    /**
     * The SOA record in the record set.
     * 
     */
    private final @Nullable SoaRecordResponse soaRecord;
    /**
     * The list of SRV records in the record set.
     * 
     */
    private final @Nullable List<SrvRecordResponse> srvRecords;
    /**
     * A reference to an azure resource from where the dns resource value is taken.
     * 
     */
    private final @Nullable SubResourceResponse targetResource;
    /**
     * The TTL (time-to-live) of the records in the record set.
     * 
     */
    private final @Nullable Double ttl;
    /**
     * The list of TXT records in the record set.
     * 
     */
    private final @Nullable List<TxtRecordResponse> txtRecords;
    /**
     * The type of the record set.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"aRecords","aaaaRecords","caaRecords","cnameRecord","etag","fqdn","id","metadata","mxRecords","name","nsRecords","provisioningState","ptrRecords","soaRecord","srvRecords","targetResource","ttl","txtRecords","type"})
    private GetRecordSetResult(
        @Nullable List<ARecordResponse> aRecords,
        @Nullable List<AaaaRecordResponse> aaaaRecords,
        @Nullable List<CaaRecordResponse> caaRecords,
        @Nullable CnameRecordResponse cnameRecord,
        @Nullable String etag,
        String fqdn,
        String id,
        @Nullable Map<String,String> metadata,
        @Nullable List<MxRecordResponse> mxRecords,
        String name,
        @Nullable List<NsRecordResponse> nsRecords,
        String provisioningState,
        @Nullable List<PtrRecordResponse> ptrRecords,
        @Nullable SoaRecordResponse soaRecord,
        @Nullable List<SrvRecordResponse> srvRecords,
        @Nullable SubResourceResponse targetResource,
        @Nullable Double ttl,
        @Nullable List<TxtRecordResponse> txtRecords,
        String type) {
        this.aRecords = aRecords;
        this.aaaaRecords = aaaaRecords;
        this.caaRecords = caaRecords;
        this.cnameRecord = cnameRecord;
        this.etag = etag;
        this.fqdn = Objects.requireNonNull(fqdn);
        this.id = Objects.requireNonNull(id);
        this.metadata = metadata;
        this.mxRecords = mxRecords;
        this.name = Objects.requireNonNull(name);
        this.nsRecords = nsRecords;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.ptrRecords = ptrRecords;
        this.soaRecord = soaRecord;
        this.srvRecords = srvRecords;
        this.targetResource = targetResource;
        this.ttl = ttl;
        this.txtRecords = txtRecords;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The list of A records in the record set.
     * 
     */
    public List<ARecordResponse> getARecords() {
        return this.aRecords == null ? List.of() : this.aRecords;
    }
    /**
     * The list of AAAA records in the record set.
     * 
     */
    public List<AaaaRecordResponse> getAaaaRecords() {
        return this.aaaaRecords == null ? List.of() : this.aaaaRecords;
    }
    /**
     * The list of CAA records in the record set.
     * 
     */
    public List<CaaRecordResponse> getCaaRecords() {
        return this.caaRecords == null ? List.of() : this.caaRecords;
    }
    /**
     * The CNAME record in the  record set.
     * 
     */
    public Optional<CnameRecordResponse> getCnameRecord() {
        return Optional.ofNullable(this.cnameRecord);
    }
    /**
     * The etag of the record set.
     * 
     */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Fully qualified domain name of the record set.
     * 
     */
    public String getFqdn() {
        return this.fqdn;
    }
    /**
     * The ID of the record set.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The metadata attached to the record set.
     * 
     */
    public Map<String,String> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    /**
     * The list of MX records in the record set.
     * 
     */
    public List<MxRecordResponse> getMxRecords() {
        return this.mxRecords == null ? List.of() : this.mxRecords;
    }
    /**
     * The name of the record set.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The list of NS records in the record set.
     * 
     */
    public List<NsRecordResponse> getNsRecords() {
        return this.nsRecords == null ? List.of() : this.nsRecords;
    }
    /**
     * provisioning State of the record set.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The list of PTR records in the record set.
     * 
     */
    public List<PtrRecordResponse> getPtrRecords() {
        return this.ptrRecords == null ? List.of() : this.ptrRecords;
    }
    /**
     * The SOA record in the record set.
     * 
     */
    public Optional<SoaRecordResponse> getSoaRecord() {
        return Optional.ofNullable(this.soaRecord);
    }
    /**
     * The list of SRV records in the record set.
     * 
     */
    public List<SrvRecordResponse> getSrvRecords() {
        return this.srvRecords == null ? List.of() : this.srvRecords;
    }
    /**
     * A reference to an azure resource from where the dns resource value is taken.
     * 
     */
    public Optional<SubResourceResponse> getTargetResource() {
        return Optional.ofNullable(this.targetResource);
    }
    /**
     * The TTL (time-to-live) of the records in the record set.
     * 
     */
    public Optional<Double> getTtl() {
        return Optional.ofNullable(this.ttl);
    }
    /**
     * The list of TXT records in the record set.
     * 
     */
    public List<TxtRecordResponse> getTxtRecords() {
        return this.txtRecords == null ? List.of() : this.txtRecords;
    }
    /**
     * The type of the record set.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRecordSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ARecordResponse> aRecords;
        private @Nullable List<AaaaRecordResponse> aaaaRecords;
        private @Nullable List<CaaRecordResponse> caaRecords;
        private @Nullable CnameRecordResponse cnameRecord;
        private @Nullable String etag;
        private String fqdn;
        private String id;
        private @Nullable Map<String,String> metadata;
        private @Nullable List<MxRecordResponse> mxRecords;
        private String name;
        private @Nullable List<NsRecordResponse> nsRecords;
        private String provisioningState;
        private @Nullable List<PtrRecordResponse> ptrRecords;
        private @Nullable SoaRecordResponse soaRecord;
        private @Nullable List<SrvRecordResponse> srvRecords;
        private @Nullable SubResourceResponse targetResource;
        private @Nullable Double ttl;
        private @Nullable List<TxtRecordResponse> txtRecords;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRecordSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aRecords = defaults.aRecords;
    	      this.aaaaRecords = defaults.aaaaRecords;
    	      this.caaRecords = defaults.caaRecords;
    	      this.cnameRecord = defaults.cnameRecord;
    	      this.etag = defaults.etag;
    	      this.fqdn = defaults.fqdn;
    	      this.id = defaults.id;
    	      this.metadata = defaults.metadata;
    	      this.mxRecords = defaults.mxRecords;
    	      this.name = defaults.name;
    	      this.nsRecords = defaults.nsRecords;
    	      this.provisioningState = defaults.provisioningState;
    	      this.ptrRecords = defaults.ptrRecords;
    	      this.soaRecord = defaults.soaRecord;
    	      this.srvRecords = defaults.srvRecords;
    	      this.targetResource = defaults.targetResource;
    	      this.ttl = defaults.ttl;
    	      this.txtRecords = defaults.txtRecords;
    	      this.type = defaults.type;
        }

        public Builder setARecords(@Nullable List<ARecordResponse> aRecords) {
            this.aRecords = aRecords;
            return this;
        }

        public Builder setAaaaRecords(@Nullable List<AaaaRecordResponse> aaaaRecords) {
            this.aaaaRecords = aaaaRecords;
            return this;
        }

        public Builder setCaaRecords(@Nullable List<CaaRecordResponse> caaRecords) {
            this.caaRecords = caaRecords;
            return this;
        }

        public Builder setCnameRecord(@Nullable CnameRecordResponse cnameRecord) {
            this.cnameRecord = cnameRecord;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setFqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMxRecords(@Nullable List<MxRecordResponse> mxRecords) {
            this.mxRecords = mxRecords;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNsRecords(@Nullable List<NsRecordResponse> nsRecords) {
            this.nsRecords = nsRecords;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPtrRecords(@Nullable List<PtrRecordResponse> ptrRecords) {
            this.ptrRecords = ptrRecords;
            return this;
        }

        public Builder setSoaRecord(@Nullable SoaRecordResponse soaRecord) {
            this.soaRecord = soaRecord;
            return this;
        }

        public Builder setSrvRecords(@Nullable List<SrvRecordResponse> srvRecords) {
            this.srvRecords = srvRecords;
            return this;
        }

        public Builder setTargetResource(@Nullable SubResourceResponse targetResource) {
            this.targetResource = targetResource;
            return this;
        }

        public Builder setTtl(@Nullable Double ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder setTxtRecords(@Nullable List<TxtRecordResponse> txtRecords) {
            this.txtRecords = txtRecords;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetRecordSetResult build() {
            return new GetRecordSetResult(aRecords, aaaaRecords, caaRecords, cnameRecord, etag, fqdn, id, metadata, mxRecords, name, nsRecords, provisioningState, ptrRecords, soaRecord, srvRecords, targetResource, ttl, txtRecords, type);
        }
    }
}
