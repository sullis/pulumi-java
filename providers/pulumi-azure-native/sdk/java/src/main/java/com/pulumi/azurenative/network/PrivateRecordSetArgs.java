// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.ARecordArgs;
import com.pulumi.azurenative.network.inputs.AaaaRecordArgs;
import com.pulumi.azurenative.network.inputs.CnameRecordArgs;
import com.pulumi.azurenative.network.inputs.MxRecordArgs;
import com.pulumi.azurenative.network.inputs.PtrRecordArgs;
import com.pulumi.azurenative.network.inputs.SoaRecordArgs;
import com.pulumi.azurenative.network.inputs.SrvRecordArgs;
import com.pulumi.azurenative.network.inputs.TxtRecordArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateRecordSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateRecordSetArgs Empty = new PrivateRecordSetArgs();

    /**
     * The list of A records in the record set.
     * 
     */
    @Import(name="aRecords")
    private @Nullable Output<List<ARecordArgs>> aRecords;

    /**
     * @return The list of A records in the record set.
     * 
     */
    public Optional<Output<List<ARecordArgs>>> aRecords() {
        return Optional.ofNullable(this.aRecords);
    }

    /**
     * The list of AAAA records in the record set.
     * 
     */
    @Import(name="aaaaRecords")
    private @Nullable Output<List<AaaaRecordArgs>> aaaaRecords;

    /**
     * @return The list of AAAA records in the record set.
     * 
     */
    public Optional<Output<List<AaaaRecordArgs>>> aaaaRecords() {
        return Optional.ofNullable(this.aaaaRecords);
    }

    /**
     * The CNAME record in the record set.
     * 
     */
    @Import(name="cnameRecord")
    private @Nullable Output<CnameRecordArgs> cnameRecord;

    /**
     * @return The CNAME record in the record set.
     * 
     */
    public Optional<Output<CnameRecordArgs>> cnameRecord() {
        return Optional.ofNullable(this.cnameRecord);
    }

    /**
     * The metadata attached to the record set.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return The metadata attached to the record set.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The list of MX records in the record set.
     * 
     */
    @Import(name="mxRecords")
    private @Nullable Output<List<MxRecordArgs>> mxRecords;

    /**
     * @return The list of MX records in the record set.
     * 
     */
    public Optional<Output<List<MxRecordArgs>>> mxRecords() {
        return Optional.ofNullable(this.mxRecords);
    }

    /**
     * The name of the Private DNS zone (without a terminating dot).
     * 
     */
    @Import(name="privateZoneName", required=true)
    private Output<String> privateZoneName;

    /**
     * @return The name of the Private DNS zone (without a terminating dot).
     * 
     */
    public Output<String> privateZoneName() {
        return this.privateZoneName;
    }

    /**
     * The list of PTR records in the record set.
     * 
     */
    @Import(name="ptrRecords")
    private @Nullable Output<List<PtrRecordArgs>> ptrRecords;

    /**
     * @return The list of PTR records in the record set.
     * 
     */
    public Optional<Output<List<PtrRecordArgs>>> ptrRecords() {
        return Optional.ofNullable(this.ptrRecords);
    }

    /**
     * The type of DNS record in this record set. Record sets of type SOA can be updated but not created (they are created when the Private DNS zone is created).
     * 
     */
    @Import(name="recordType", required=true)
    private Output<String> recordType;

    /**
     * @return The type of DNS record in this record set. Record sets of type SOA can be updated but not created (they are created when the Private DNS zone is created).
     * 
     */
    public Output<String> recordType() {
        return this.recordType;
    }

    /**
     * The name of the record set, relative to the name of the zone.
     * 
     */
    @Import(name="relativeRecordSetName")
    private @Nullable Output<String> relativeRecordSetName;

    /**
     * @return The name of the record set, relative to the name of the zone.
     * 
     */
    public Optional<Output<String>> relativeRecordSetName() {
        return Optional.ofNullable(this.relativeRecordSetName);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SOA record in the record set.
     * 
     */
    @Import(name="soaRecord")
    private @Nullable Output<SoaRecordArgs> soaRecord;

    /**
     * @return The SOA record in the record set.
     * 
     */
    public Optional<Output<SoaRecordArgs>> soaRecord() {
        return Optional.ofNullable(this.soaRecord);
    }

    /**
     * The list of SRV records in the record set.
     * 
     */
    @Import(name="srvRecords")
    private @Nullable Output<List<SrvRecordArgs>> srvRecords;

    /**
     * @return The list of SRV records in the record set.
     * 
     */
    public Optional<Output<List<SrvRecordArgs>>> srvRecords() {
        return Optional.ofNullable(this.srvRecords);
    }

    /**
     * The TTL (time-to-live) of the records in the record set.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<Double> ttl;

    /**
     * @return The TTL (time-to-live) of the records in the record set.
     * 
     */
    public Optional<Output<Double>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    /**
     * The list of TXT records in the record set.
     * 
     */
    @Import(name="txtRecords")
    private @Nullable Output<List<TxtRecordArgs>> txtRecords;

    /**
     * @return The list of TXT records in the record set.
     * 
     */
    public Optional<Output<List<TxtRecordArgs>>> txtRecords() {
        return Optional.ofNullable(this.txtRecords);
    }

    private PrivateRecordSetArgs() {}

    private PrivateRecordSetArgs(PrivateRecordSetArgs $) {
        this.aRecords = $.aRecords;
        this.aaaaRecords = $.aaaaRecords;
        this.cnameRecord = $.cnameRecord;
        this.metadata = $.metadata;
        this.mxRecords = $.mxRecords;
        this.privateZoneName = $.privateZoneName;
        this.ptrRecords = $.ptrRecords;
        this.recordType = $.recordType;
        this.relativeRecordSetName = $.relativeRecordSetName;
        this.resourceGroupName = $.resourceGroupName;
        this.soaRecord = $.soaRecord;
        this.srvRecords = $.srvRecords;
        this.ttl = $.ttl;
        this.txtRecords = $.txtRecords;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateRecordSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateRecordSetArgs $;

        public Builder() {
            $ = new PrivateRecordSetArgs();
        }

        public Builder(PrivateRecordSetArgs defaults) {
            $ = new PrivateRecordSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aRecords The list of A records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder aRecords(@Nullable Output<List<ARecordArgs>> aRecords) {
            $.aRecords = aRecords;
            return this;
        }

        /**
         * @param aRecords The list of A records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder aRecords(List<ARecordArgs> aRecords) {
            return aRecords(Output.of(aRecords));
        }

        /**
         * @param aRecords The list of A records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder aRecords(ARecordArgs... aRecords) {
            return aRecords(List.of(aRecords));
        }

        /**
         * @param aaaaRecords The list of AAAA records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder aaaaRecords(@Nullable Output<List<AaaaRecordArgs>> aaaaRecords) {
            $.aaaaRecords = aaaaRecords;
            return this;
        }

        /**
         * @param aaaaRecords The list of AAAA records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder aaaaRecords(List<AaaaRecordArgs> aaaaRecords) {
            return aaaaRecords(Output.of(aaaaRecords));
        }

        /**
         * @param aaaaRecords The list of AAAA records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder aaaaRecords(AaaaRecordArgs... aaaaRecords) {
            return aaaaRecords(List.of(aaaaRecords));
        }

        /**
         * @param cnameRecord The CNAME record in the record set.
         * 
         * @return builder
         * 
         */
        public Builder cnameRecord(@Nullable Output<CnameRecordArgs> cnameRecord) {
            $.cnameRecord = cnameRecord;
            return this;
        }

        /**
         * @param cnameRecord The CNAME record in the record set.
         * 
         * @return builder
         * 
         */
        public Builder cnameRecord(CnameRecordArgs cnameRecord) {
            return cnameRecord(Output.of(cnameRecord));
        }

        /**
         * @param metadata The metadata attached to the record set.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata The metadata attached to the record set.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param mxRecords The list of MX records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder mxRecords(@Nullable Output<List<MxRecordArgs>> mxRecords) {
            $.mxRecords = mxRecords;
            return this;
        }

        /**
         * @param mxRecords The list of MX records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder mxRecords(List<MxRecordArgs> mxRecords) {
            return mxRecords(Output.of(mxRecords));
        }

        /**
         * @param mxRecords The list of MX records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder mxRecords(MxRecordArgs... mxRecords) {
            return mxRecords(List.of(mxRecords));
        }

        /**
         * @param privateZoneName The name of the Private DNS zone (without a terminating dot).
         * 
         * @return builder
         * 
         */
        public Builder privateZoneName(Output<String> privateZoneName) {
            $.privateZoneName = privateZoneName;
            return this;
        }

        /**
         * @param privateZoneName The name of the Private DNS zone (without a terminating dot).
         * 
         * @return builder
         * 
         */
        public Builder privateZoneName(String privateZoneName) {
            return privateZoneName(Output.of(privateZoneName));
        }

        /**
         * @param ptrRecords The list of PTR records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder ptrRecords(@Nullable Output<List<PtrRecordArgs>> ptrRecords) {
            $.ptrRecords = ptrRecords;
            return this;
        }

        /**
         * @param ptrRecords The list of PTR records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder ptrRecords(List<PtrRecordArgs> ptrRecords) {
            return ptrRecords(Output.of(ptrRecords));
        }

        /**
         * @param ptrRecords The list of PTR records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder ptrRecords(PtrRecordArgs... ptrRecords) {
            return ptrRecords(List.of(ptrRecords));
        }

        /**
         * @param recordType The type of DNS record in this record set. Record sets of type SOA can be updated but not created (they are created when the Private DNS zone is created).
         * 
         * @return builder
         * 
         */
        public Builder recordType(Output<String> recordType) {
            $.recordType = recordType;
            return this;
        }

        /**
         * @param recordType The type of DNS record in this record set. Record sets of type SOA can be updated but not created (they are created when the Private DNS zone is created).
         * 
         * @return builder
         * 
         */
        public Builder recordType(String recordType) {
            return recordType(Output.of(recordType));
        }

        /**
         * @param relativeRecordSetName The name of the record set, relative to the name of the zone.
         * 
         * @return builder
         * 
         */
        public Builder relativeRecordSetName(@Nullable Output<String> relativeRecordSetName) {
            $.relativeRecordSetName = relativeRecordSetName;
            return this;
        }

        /**
         * @param relativeRecordSetName The name of the record set, relative to the name of the zone.
         * 
         * @return builder
         * 
         */
        public Builder relativeRecordSetName(String relativeRecordSetName) {
            return relativeRecordSetName(Output.of(relativeRecordSetName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param soaRecord The SOA record in the record set.
         * 
         * @return builder
         * 
         */
        public Builder soaRecord(@Nullable Output<SoaRecordArgs> soaRecord) {
            $.soaRecord = soaRecord;
            return this;
        }

        /**
         * @param soaRecord The SOA record in the record set.
         * 
         * @return builder
         * 
         */
        public Builder soaRecord(SoaRecordArgs soaRecord) {
            return soaRecord(Output.of(soaRecord));
        }

        /**
         * @param srvRecords The list of SRV records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder srvRecords(@Nullable Output<List<SrvRecordArgs>> srvRecords) {
            $.srvRecords = srvRecords;
            return this;
        }

        /**
         * @param srvRecords The list of SRV records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder srvRecords(List<SrvRecordArgs> srvRecords) {
            return srvRecords(Output.of(srvRecords));
        }

        /**
         * @param srvRecords The list of SRV records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder srvRecords(SrvRecordArgs... srvRecords) {
            return srvRecords(List.of(srvRecords));
        }

        /**
         * @param ttl The TTL (time-to-live) of the records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<Double> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl The TTL (time-to-live) of the records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder ttl(Double ttl) {
            return ttl(Output.of(ttl));
        }

        /**
         * @param txtRecords The list of TXT records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder txtRecords(@Nullable Output<List<TxtRecordArgs>> txtRecords) {
            $.txtRecords = txtRecords;
            return this;
        }

        /**
         * @param txtRecords The list of TXT records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder txtRecords(List<TxtRecordArgs> txtRecords) {
            return txtRecords(Output.of(txtRecords));
        }

        /**
         * @param txtRecords The list of TXT records in the record set.
         * 
         * @return builder
         * 
         */
        public Builder txtRecords(TxtRecordArgs... txtRecords) {
            return txtRecords(List.of(txtRecords));
        }

        public PrivateRecordSetArgs build() {
            $.privateZoneName = Objects.requireNonNull($.privateZoneName, "expected parameter 'privateZoneName' to be non-null");
            $.recordType = Objects.requireNonNull($.recordType, "expected parameter 'recordType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
