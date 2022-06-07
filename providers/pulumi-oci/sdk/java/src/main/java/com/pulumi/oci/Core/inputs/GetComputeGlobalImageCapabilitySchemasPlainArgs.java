// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.GetComputeGlobalImageCapabilitySchemasFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetComputeGlobalImageCapabilitySchemasPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetComputeGlobalImageCapabilitySchemasPlainArgs Empty = new GetComputeGlobalImageCapabilitySchemasPlainArgs();

    /**
     * A filter to return only resources that match the given compartment OCID exactly.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable String compartmentId;

    /**
     * @return A filter to return only resources that match the given compartment OCID exactly.
     * 
     */
    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * A filter to return only resources that match the given display name exactly.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only resources that match the given display name exactly.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetComputeGlobalImageCapabilitySchemasFilter> filters;

    public Optional<List<GetComputeGlobalImageCapabilitySchemasFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetComputeGlobalImageCapabilitySchemasPlainArgs() {}

    private GetComputeGlobalImageCapabilitySchemasPlainArgs(GetComputeGlobalImageCapabilitySchemasPlainArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetComputeGlobalImageCapabilitySchemasPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetComputeGlobalImageCapabilitySchemasPlainArgs $;

        public Builder() {
            $ = new GetComputeGlobalImageCapabilitySchemasPlainArgs();
        }

        public Builder(GetComputeGlobalImageCapabilitySchemasPlainArgs defaults) {
            $ = new GetComputeGlobalImageCapabilitySchemasPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId A filter to return only resources that match the given compartment OCID exactly.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the given display name exactly.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetComputeGlobalImageCapabilitySchemasFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetComputeGlobalImageCapabilitySchemasFilter... filters) {
            return filters(List.of(filters));
        }

        public GetComputeGlobalImageCapabilitySchemasPlainArgs build() {
            return $;
        }
    }

}
