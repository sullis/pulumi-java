// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataSafe.inputs.GetLibraryMaskingFormatsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLibraryMaskingFormatsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLibraryMaskingFormatsPlainArgs Empty = new GetLibraryMaskingFormatsPlainArgs();

    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
     * 
     */
    @Import(name="accessLevel")
    private @Nullable String accessLevel;

    /**
     * @return Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
     * 
     */
    public Optional<String> accessLevel() {
        return Optional.ofNullable(this.accessLevel);
    }

    /**
     * A filter to return only resources that match the specified compartment OCID.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return A filter to return only resources that match the specified compartment OCID.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the &#39;accessLevel&#39; setting.
     * 
     */
    @Import(name="compartmentIdInSubtree")
    private @Nullable Boolean compartmentIdInSubtree;

    /**
     * @return Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the &#39;accessLevel&#39; setting.
     * 
     */
    public Optional<Boolean> compartmentIdInSubtree() {
        return Optional.ofNullable(this.compartmentIdInSubtree);
    }

    /**
     * A filter to return only resources that match the specified display name.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only resources that match the specified display name.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetLibraryMaskingFormatsFilter> filters;

    public Optional<List<GetLibraryMaskingFormatsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only the resources that match the specified library masking format OCID.
     * 
     */
    @Import(name="libraryMaskingFormatId")
    private @Nullable String libraryMaskingFormatId;

    /**
     * @return A filter to return only the resources that match the specified library masking format OCID.
     * 
     */
    public Optional<String> libraryMaskingFormatId() {
        return Optional.ofNullable(this.libraryMaskingFormatId);
    }

    /**
     * A filter to return the library masking format resources based on the value of their source attribute.
     * 
     */
    @Import(name="libraryMaskingFormatSource")
    private @Nullable String libraryMaskingFormatSource;

    /**
     * @return A filter to return the library masking format resources based on the value of their source attribute.
     * 
     */
    public Optional<String> libraryMaskingFormatSource() {
        return Optional.ofNullable(this.libraryMaskingFormatSource);
    }

    /**
     * A filter to return only the resources that match the specified lifecycle states.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to return only the resources that match the specified lifecycle states.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * A filter to return only the resources that were created after the specified date and time, as defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Using TimeCreatedGreaterThanOrEqualToQueryParam parameter retrieves all resources created after that date.
     * 
     */
    @Import(name="timeCreatedGreaterThanOrEqualTo")
    private @Nullable String timeCreatedGreaterThanOrEqualTo;

    /**
     * @return A filter to return only the resources that were created after the specified date and time, as defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Using TimeCreatedGreaterThanOrEqualToQueryParam parameter retrieves all resources created after that date.
     * 
     */
    public Optional<String> timeCreatedGreaterThanOrEqualTo() {
        return Optional.ofNullable(this.timeCreatedGreaterThanOrEqualTo);
    }

    /**
     * Search for resources that were created before a specific date. Specifying this parameter corresponding `timeCreatedLessThan` parameter will retrieve all resources created before the specified created date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by RFC 3339.
     * 
     */
    @Import(name="timeCreatedLessThan")
    private @Nullable String timeCreatedLessThan;

    /**
     * @return Search for resources that were created before a specific date. Specifying this parameter corresponding `timeCreatedLessThan` parameter will retrieve all resources created before the specified created date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by RFC 3339.
     * 
     */
    public Optional<String> timeCreatedLessThan() {
        return Optional.ofNullable(this.timeCreatedLessThan);
    }

    private GetLibraryMaskingFormatsPlainArgs() {}

    private GetLibraryMaskingFormatsPlainArgs(GetLibraryMaskingFormatsPlainArgs $) {
        this.accessLevel = $.accessLevel;
        this.compartmentId = $.compartmentId;
        this.compartmentIdInSubtree = $.compartmentIdInSubtree;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.libraryMaskingFormatId = $.libraryMaskingFormatId;
        this.libraryMaskingFormatSource = $.libraryMaskingFormatSource;
        this.state = $.state;
        this.timeCreatedGreaterThanOrEqualTo = $.timeCreatedGreaterThanOrEqualTo;
        this.timeCreatedLessThan = $.timeCreatedLessThan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLibraryMaskingFormatsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLibraryMaskingFormatsPlainArgs $;

        public Builder() {
            $ = new GetLibraryMaskingFormatsPlainArgs();
        }

        public Builder(GetLibraryMaskingFormatsPlainArgs defaults) {
            $ = new GetLibraryMaskingFormatsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLevel Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
         * 
         * @return builder
         * 
         */
        public Builder accessLevel(@Nullable String accessLevel) {
            $.accessLevel = accessLevel;
            return this;
        }

        /**
         * @param compartmentId A filter to return only resources that match the specified compartment OCID.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentIdInSubtree Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the &#39;accessLevel&#39; setting.
         * 
         * @return builder
         * 
         */
        public Builder compartmentIdInSubtree(@Nullable Boolean compartmentIdInSubtree) {
            $.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the specified display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetLibraryMaskingFormatsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetLibraryMaskingFormatsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param libraryMaskingFormatId A filter to return only the resources that match the specified library masking format OCID.
         * 
         * @return builder
         * 
         */
        public Builder libraryMaskingFormatId(@Nullable String libraryMaskingFormatId) {
            $.libraryMaskingFormatId = libraryMaskingFormatId;
            return this;
        }

        /**
         * @param libraryMaskingFormatSource A filter to return the library masking format resources based on the value of their source attribute.
         * 
         * @return builder
         * 
         */
        public Builder libraryMaskingFormatSource(@Nullable String libraryMaskingFormatSource) {
            $.libraryMaskingFormatSource = libraryMaskingFormatSource;
            return this;
        }

        /**
         * @param state A filter to return only the resources that match the specified lifecycle states.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param timeCreatedGreaterThanOrEqualTo A filter to return only the resources that were created after the specified date and time, as defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Using TimeCreatedGreaterThanOrEqualToQueryParam parameter retrieves all resources created after that date.
         * 
         * @return builder
         * 
         */
        public Builder timeCreatedGreaterThanOrEqualTo(@Nullable String timeCreatedGreaterThanOrEqualTo) {
            $.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * @param timeCreatedLessThan Search for resources that were created before a specific date. Specifying this parameter corresponding `timeCreatedLessThan` parameter will retrieve all resources created before the specified created date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by RFC 3339.
         * 
         * @return builder
         * 
         */
        public Builder timeCreatedLessThan(@Nullable String timeCreatedLessThan) {
            $.timeCreatedLessThan = timeCreatedLessThan;
            return this;
        }

        public GetLibraryMaskingFormatsPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
