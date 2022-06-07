// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApmSynthetics.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.ApmSynthetics.inputs.GetScriptsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetScriptsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScriptsPlainArgs Empty = new GetScriptsPlainArgs();

    /**
     * The APM domain ID the request is intended for.
     * 
     */
    @Import(name="apmDomainId", required=true)
    private String apmDomainId;

    /**
     * @return The APM domain ID the request is intended for.
     * 
     */
    public String apmDomainId() {
        return this.apmDomainId;
    }

    /**
     * A filter to return only resources that match the content type given.
     * 
     */
    @Import(name="contentType")
    private @Nullable String contentType;

    /**
     * @return A filter to return only resources that match the content type given.
     * 
     */
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * A filter to return only resources that match the entire display name given.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only resources that match the entire display name given.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetScriptsFilter> filters;

    public Optional<List<GetScriptsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetScriptsPlainArgs() {}

    private GetScriptsPlainArgs(GetScriptsPlainArgs $) {
        this.apmDomainId = $.apmDomainId;
        this.contentType = $.contentType;
        this.displayName = $.displayName;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScriptsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScriptsPlainArgs $;

        public Builder() {
            $ = new GetScriptsPlainArgs();
        }

        public Builder(GetScriptsPlainArgs defaults) {
            $ = new GetScriptsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apmDomainId The APM domain ID the request is intended for.
         * 
         * @return builder
         * 
         */
        public Builder apmDomainId(String apmDomainId) {
            $.apmDomainId = apmDomainId;
            return this;
        }

        /**
         * @param contentType A filter to return only resources that match the content type given.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable String contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the entire display name given.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetScriptsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetScriptsFilter... filters) {
            return filters(List.of(filters));
        }

        public GetScriptsPlainArgs build() {
            $.apmDomainId = Objects.requireNonNull($.apmDomainId, "expected parameter 'apmDomainId' to be non-null");
            return $;
        }
    }

}
