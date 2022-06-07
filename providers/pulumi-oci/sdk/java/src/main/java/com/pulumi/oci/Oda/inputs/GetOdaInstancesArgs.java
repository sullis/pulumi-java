// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Oda.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Oda.inputs.GetOdaInstancesFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOdaInstancesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOdaInstancesArgs Empty = new GetOdaInstancesArgs();

    /**
     * List the Digital Assistant instances that belong to this compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return List the Digital Assistant instances that belong to this compartment.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * List only the information for the Digital Assistant instance with this user-friendly name. These names don&#39;t have to be unique and may change.  Example: `My new resource`
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return List only the information for the Digital Assistant instance with this user-friendly name. These names don&#39;t have to be unique and may change.  Example: `My new resource`
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetOdaInstancesFilterArgs>> filters;

    public Optional<Output<List<GetOdaInstancesFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * List only the Digital Assistant instances that are in this lifecycle state.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return List only the Digital Assistant instances that are in this lifecycle state.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private GetOdaInstancesArgs() {}

    private GetOdaInstancesArgs(GetOdaInstancesArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOdaInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOdaInstancesArgs $;

        public Builder() {
            $ = new GetOdaInstancesArgs();
        }

        public Builder(GetOdaInstancesArgs defaults) {
            $ = new GetOdaInstancesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId List the Digital Assistant instances that belong to this compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId List the Digital Assistant instances that belong to this compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param displayName List only the information for the Digital Assistant instance with this user-friendly name. These names don&#39;t have to be unique and may change.  Example: `My new resource`
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName List only the information for the Digital Assistant instance with this user-friendly name. These names don&#39;t have to be unique and may change.  Example: `My new resource`
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder filters(@Nullable Output<List<GetOdaInstancesFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetOdaInstancesFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetOdaInstancesFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param state List only the Digital Assistant instances that are in this lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state List only the Digital Assistant instances that are in this lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public GetOdaInstancesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
