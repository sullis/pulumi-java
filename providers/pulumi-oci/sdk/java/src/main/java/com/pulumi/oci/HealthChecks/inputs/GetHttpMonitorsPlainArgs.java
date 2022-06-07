// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.HealthChecks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.HealthChecks.inputs.GetHttpMonitorsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHttpMonitorsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHttpMonitorsPlainArgs Empty = new GetHttpMonitorsPlainArgs();

    /**
     * Filters results by compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return Filters results by compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * Filters results that exactly match the `displayName` field.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return Filters results that exactly match the `displayName` field.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetHttpMonitorsFilter> filters;

    public Optional<List<GetHttpMonitorsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Filters results that match the `homeRegion`.
     * 
     */
    @Import(name="homeRegion")
    private @Nullable String homeRegion;

    /**
     * @return Filters results that match the `homeRegion`.
     * 
     */
    public Optional<String> homeRegion() {
        return Optional.ofNullable(this.homeRegion);
    }

    private GetHttpMonitorsPlainArgs() {}

    private GetHttpMonitorsPlainArgs(GetHttpMonitorsPlainArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.homeRegion = $.homeRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHttpMonitorsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHttpMonitorsPlainArgs $;

        public Builder() {
            $ = new GetHttpMonitorsPlainArgs();
        }

        public Builder(GetHttpMonitorsPlainArgs defaults) {
            $ = new GetHttpMonitorsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId Filters results by compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName Filters results that exactly match the `displayName` field.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetHttpMonitorsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetHttpMonitorsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param homeRegion Filters results that match the `homeRegion`.
         * 
         * @return builder
         * 
         */
        public Builder homeRegion(@Nullable String homeRegion) {
            $.homeRegion = homeRegion;
            return this;
        }

        public GetHttpMonitorsPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
