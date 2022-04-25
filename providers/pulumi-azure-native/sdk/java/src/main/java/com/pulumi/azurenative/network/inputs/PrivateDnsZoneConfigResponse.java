// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.RecordSetResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PrivateDnsZoneConfig resource.
 * 
 */
public final class PrivateDnsZoneConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateDnsZoneConfigResponse Empty = new PrivateDnsZoneConfigResponse();

    /**
     * Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource id of the private dns zone.
     * 
     */
    @Import(name="privateDnsZoneId")
    private @Nullable String privateDnsZoneId;

    /**
     * @return The resource id of the private dns zone.
     * 
     */
    public Optional<String> privateDnsZoneId() {
        return Optional.ofNullable(this.privateDnsZoneId);
    }

    /**
     * A collection of information regarding a recordSet, holding information to identify private resources.
     * 
     */
    @Import(name="recordSets", required=true)
    private List<RecordSetResponse> recordSets;

    /**
     * @return A collection of information regarding a recordSet, holding information to identify private resources.
     * 
     */
    public List<RecordSetResponse> recordSets() {
        return this.recordSets;
    }

    private PrivateDnsZoneConfigResponse() {}

    private PrivateDnsZoneConfigResponse(PrivateDnsZoneConfigResponse $) {
        this.name = $.name;
        this.privateDnsZoneId = $.privateDnsZoneId;
        this.recordSets = $.recordSets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateDnsZoneConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateDnsZoneConfigResponse $;

        public Builder() {
            $ = new PrivateDnsZoneConfigResponse();
        }

        public Builder(PrivateDnsZoneConfigResponse defaults) {
            $ = new PrivateDnsZoneConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param privateDnsZoneId The resource id of the private dns zone.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsZoneId(@Nullable String privateDnsZoneId) {
            $.privateDnsZoneId = privateDnsZoneId;
            return this;
        }

        /**
         * @param recordSets A collection of information regarding a recordSet, holding information to identify private resources.
         * 
         * @return builder
         * 
         */
        public Builder recordSets(List<RecordSetResponse> recordSets) {
            $.recordSets = recordSets;
            return this;
        }

        /**
         * @param recordSets A collection of information regarding a recordSet, holding information to identify private resources.
         * 
         * @return builder
         * 
         */
        public Builder recordSets(RecordSetResponse... recordSets) {
            return recordSets(List.of(recordSets));
        }

        public PrivateDnsZoneConfigResponse build() {
            $.recordSets = Objects.requireNonNull($.recordSets, "expected parameter 'recordSets' to be non-null");
            return $;
        }
    }

}
