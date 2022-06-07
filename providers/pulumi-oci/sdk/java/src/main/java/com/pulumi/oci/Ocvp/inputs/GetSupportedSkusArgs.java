// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Ocvp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Ocvp.inputs.GetSupportedSkusFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSupportedSkusArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSupportedSkusArgs Empty = new GetSupportedSkusArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable Output<List<GetSupportedSkusFilterArgs>> filters;

    public Optional<Output<List<GetSupportedSkusFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetSupportedSkusArgs() {}

    private GetSupportedSkusArgs(GetSupportedSkusArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSupportedSkusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSupportedSkusArgs $;

        public Builder() {
            $ = new GetSupportedSkusArgs();
        }

        public Builder(GetSupportedSkusArgs defaults) {
            $ = new GetSupportedSkusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        public Builder filters(@Nullable Output<List<GetSupportedSkusFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetSupportedSkusFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetSupportedSkusFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public GetSupportedSkusArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
