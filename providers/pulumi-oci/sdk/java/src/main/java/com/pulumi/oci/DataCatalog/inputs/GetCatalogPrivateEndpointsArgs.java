// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataCatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataCatalog.inputs.GetCatalogPrivateEndpointsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCatalogPrivateEndpointsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCatalogPrivateEndpointsArgs Empty = new GetCatalogPrivateEndpointsArgs();

    /**
     * The OCID of the compartment where you want to list resources.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The OCID of the compartment where you want to list resources.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetCatalogPrivateEndpointsFilterArgs>> filters;

    public Optional<Output<List<GetCatalogPrivateEndpointsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private GetCatalogPrivateEndpointsArgs() {}

    private GetCatalogPrivateEndpointsArgs(GetCatalogPrivateEndpointsArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCatalogPrivateEndpointsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCatalogPrivateEndpointsArgs $;

        public Builder() {
            $ = new GetCatalogPrivateEndpointsArgs();
        }

        public Builder(GetCatalogPrivateEndpointsArgs defaults) {
            $ = new GetCatalogPrivateEndpointsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of the compartment where you want to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The OCID of the compartment where you want to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param displayName A filter to return only resources that match the entire display name given. The match is not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the entire display name given. The match is not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder filters(@Nullable Output<List<GetCatalogPrivateEndpointsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetCatalogPrivateEndpointsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetCatalogPrivateEndpointsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param state A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public GetCatalogPrivateEndpointsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
