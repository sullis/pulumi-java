// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Analytics.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Analytics.inputs.GetAnalyticsInstancesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAnalyticsInstancesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAnalyticsInstancesPlainArgs Empty = new GetAnalyticsInstancesPlainArgs();

    /**
     * A filter to only return resources matching the capacity type enum. Values are case-insensitive.
     * 
     */
    @Import(name="capacityType")
    private @Nullable String capacityType;

    /**
     * @return A filter to only return resources matching the capacity type enum. Values are case-insensitive.
     * 
     */
    public Optional<String> capacityType() {
        return Optional.ofNullable(this.capacityType);
    }

    /**
     * The OCID of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The OCID of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * A filter to only return resources matching the feature set. Values are case-insensitive.
     * 
     */
    @Import(name="featureSet")
    private @Nullable String featureSet;

    /**
     * @return A filter to only return resources matching the feature set. Values are case-insensitive.
     * 
     */
    public Optional<String> featureSet() {
        return Optional.ofNullable(this.featureSet);
    }

    @Import(name="filters")
    private @Nullable List<GetAnalyticsInstancesFilter> filters;

    public Optional<List<GetAnalyticsInstancesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only resources that match the given name exactly.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return A filter to return only resources that match the given name exactly.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A filter to only return resources matching the lifecycle state. The state value is case-insensitive.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to only return resources matching the lifecycle state. The state value is case-insensitive.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetAnalyticsInstancesPlainArgs() {}

    private GetAnalyticsInstancesPlainArgs(GetAnalyticsInstancesPlainArgs $) {
        this.capacityType = $.capacityType;
        this.compartmentId = $.compartmentId;
        this.featureSet = $.featureSet;
        this.filters = $.filters;
        this.name = $.name;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAnalyticsInstancesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAnalyticsInstancesPlainArgs $;

        public Builder() {
            $ = new GetAnalyticsInstancesPlainArgs();
        }

        public Builder(GetAnalyticsInstancesPlainArgs defaults) {
            $ = new GetAnalyticsInstancesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacityType A filter to only return resources matching the capacity type enum. Values are case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder capacityType(@Nullable String capacityType) {
            $.capacityType = capacityType;
            return this;
        }

        /**
         * @param compartmentId The OCID of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param featureSet A filter to only return resources matching the feature set. Values are case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder featureSet(@Nullable String featureSet) {
            $.featureSet = featureSet;
            return this;
        }

        public Builder filters(@Nullable List<GetAnalyticsInstancesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetAnalyticsInstancesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param name A filter to return only resources that match the given name exactly.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param state A filter to only return resources matching the lifecycle state. The state value is case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetAnalyticsInstancesPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
