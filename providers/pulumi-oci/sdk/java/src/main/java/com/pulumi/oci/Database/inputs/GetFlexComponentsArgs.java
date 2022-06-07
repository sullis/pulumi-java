// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.GetFlexComponentsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFlexComponentsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFlexComponentsArgs Empty = new GetFlexComponentsArgs();

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable Output<List<GetFlexComponentsFilterArgs>> filters;

    public Optional<Output<List<GetFlexComponentsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only resources that match the entire name given. The match is not case sensitive.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A filter to return only resources that match the entire name given. The match is not case sensitive.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetFlexComponentsArgs() {}

    private GetFlexComponentsArgs(GetFlexComponentsArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFlexComponentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFlexComponentsArgs $;

        public Builder() {
            $ = new GetFlexComponentsArgs();
        }

        public Builder(GetFlexComponentsArgs defaults) {
            $ = new GetFlexComponentsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        public Builder filters(@Nullable Output<List<GetFlexComponentsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetFlexComponentsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetFlexComponentsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param name A filter to return only resources that match the entire name given. The match is not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A filter to return only resources that match the entire name given. The match is not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetFlexComponentsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
