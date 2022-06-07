// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRecordSetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRecordSetArgs Empty = new GetRecordSetArgs();

    /**
     * The type of DNS record in this record set.
     * 
     */
    @Import(name="recordType", required=true)
    private Output<String> recordType;

    /**
     * @return The type of DNS record in this record set.
     * 
     */
    public Output<String> recordType() {
        return this.recordType;
    }

    /**
     * The name of the record set, relative to the name of the zone.
     * 
     */
    @Import(name="relativeRecordSetName", required=true)
    private Output<String> relativeRecordSetName;

    /**
     * @return The name of the record set, relative to the name of the zone.
     * 
     */
    public Output<String> relativeRecordSetName() {
        return this.relativeRecordSetName;
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
     * The name of the DNS zone (without a terminating dot).
     * 
     */
    @Import(name="zoneName", required=true)
    private Output<String> zoneName;

    /**
     * @return The name of the DNS zone (without a terminating dot).
     * 
     */
    public Output<String> zoneName() {
        return this.zoneName;
    }

    private GetRecordSetArgs() {}

    private GetRecordSetArgs(GetRecordSetArgs $) {
        this.recordType = $.recordType;
        this.relativeRecordSetName = $.relativeRecordSetName;
        this.resourceGroupName = $.resourceGroupName;
        this.zoneName = $.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRecordSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRecordSetArgs $;

        public Builder() {
            $ = new GetRecordSetArgs();
        }

        public Builder(GetRecordSetArgs defaults) {
            $ = new GetRecordSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param recordType The type of DNS record in this record set.
         * 
         * @return builder
         * 
         */
        public Builder recordType(Output<String> recordType) {
            $.recordType = recordType;
            return this;
        }

        /**
         * @param recordType The type of DNS record in this record set.
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
        public Builder relativeRecordSetName(Output<String> relativeRecordSetName) {
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
         * @param zoneName The name of the DNS zone (without a terminating dot).
         * 
         * @return builder
         * 
         */
        public Builder zoneName(Output<String> zoneName) {
            $.zoneName = zoneName;
            return this;
        }

        /**
         * @param zoneName The name of the DNS zone (without a terminating dot).
         * 
         * @return builder
         * 
         */
        public Builder zoneName(String zoneName) {
            return zoneName(Output.of(zoneName));
        }

        public GetRecordSetArgs build() {
            $.recordType = Objects.requireNonNull($.recordType, "expected parameter 'recordType' to be non-null");
            $.relativeRecordSetName = Objects.requireNonNull($.relativeRecordSetName, "expected parameter 'relativeRecordSetName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.zoneName = Objects.requireNonNull($.zoneName, "expected parameter 'zoneName' to be non-null");
            return $;
        }
    }

}
