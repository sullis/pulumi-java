// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A collective group of information about the record set information.
 * 
 */
public final class RecordSetResponse extends io.pulumi.resources.InvokeArgs {

    public static final RecordSetResponse Empty = new RecordSetResponse();

    /**
     * Fqdn that resolves to private endpoint ip address.
     * 
     */
    @InputImport(name="fqdn")
    private final @Nullable String fqdn;

    public Optional<String> getFqdn() {
        return this.fqdn == null ? Optional.empty() : Optional.ofNullable(this.fqdn);
    }

    /**
     * The private ip address of the private endpoint.
     * 
     */
    @InputImport(name="ipAddresses")
    private final @Nullable List<String> ipAddresses;

    public List<String> getIpAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }

    /**
     * The provisioning state of the recordset.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Recordset name.
     * 
     */
    @InputImport(name="recordSetName")
    private final @Nullable String recordSetName;

    public Optional<String> getRecordSetName() {
        return this.recordSetName == null ? Optional.empty() : Optional.ofNullable(this.recordSetName);
    }

    /**
     * Resource record type.
     * 
     */
    @InputImport(name="recordType")
    private final @Nullable String recordType;

    public Optional<String> getRecordType() {
        return this.recordType == null ? Optional.empty() : Optional.ofNullable(this.recordType);
    }

    /**
     * Recordset time to live.
     * 
     */
    @InputImport(name="ttl")
    private final @Nullable Integer ttl;

    public Optional<Integer> getTtl() {
        return this.ttl == null ? Optional.empty() : Optional.ofNullable(this.ttl);
    }

    public RecordSetResponse(
        @Nullable String fqdn,
        @Nullable List<String> ipAddresses,
        String provisioningState,
        @Nullable String recordSetName,
        @Nullable String recordType,
        @Nullable Integer ttl) {
        this.fqdn = fqdn;
        this.ipAddresses = ipAddresses;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.recordSetName = recordSetName;
        this.recordType = recordType;
        this.ttl = ttl;
    }

    private RecordSetResponse() {
        this.fqdn = null;
        this.ipAddresses = List.of();
        this.provisioningState = null;
        this.recordSetName = null;
        this.recordType = null;
        this.ttl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fqdn;
        private @Nullable List<String> ipAddresses;
        private String provisioningState;
        private @Nullable String recordSetName;
        private @Nullable String recordType;
        private @Nullable Integer ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(RecordSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdn = defaults.fqdn;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.provisioningState = defaults.provisioningState;
    	      this.recordSetName = defaults.recordSetName;
    	      this.recordType = defaults.recordType;
    	      this.ttl = defaults.ttl;
        }

        public Builder setFqdn(@Nullable String fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        public Builder setIpAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRecordSetName(@Nullable String recordSetName) {
            this.recordSetName = recordSetName;
            return this;
        }

        public Builder setRecordType(@Nullable String recordType) {
            this.recordType = recordType;
            return this;
        }

        public Builder setTtl(@Nullable Integer ttl) {
            this.ttl = ttl;
            return this;
        }

        public RecordSetResponse build() {
            return new RecordSetResponse(fqdn, ipAddresses, provisioningState, recordSetName, recordType, ttl);
        }
    }
}
