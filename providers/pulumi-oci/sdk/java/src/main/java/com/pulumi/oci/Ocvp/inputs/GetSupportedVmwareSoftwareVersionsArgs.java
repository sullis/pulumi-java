// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Ocvp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Ocvp.inputs.GetSupportedVmwareSoftwareVersionsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSupportedVmwareSoftwareVersionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSupportedVmwareSoftwareVersionsArgs Empty = new GetSupportedVmwareSoftwareVersionsArgs();

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
    private @Nullable Output<List<GetSupportedVmwareSoftwareVersionsFilterArgs>> filters;

    public Optional<Output<List<GetSupportedVmwareSoftwareVersionsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetSupportedVmwareSoftwareVersionsArgs() {}

    private GetSupportedVmwareSoftwareVersionsArgs(GetSupportedVmwareSoftwareVersionsArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSupportedVmwareSoftwareVersionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSupportedVmwareSoftwareVersionsArgs $;

        public Builder() {
            $ = new GetSupportedVmwareSoftwareVersionsArgs();
        }

        public Builder(GetSupportedVmwareSoftwareVersionsArgs defaults) {
            $ = new GetSupportedVmwareSoftwareVersionsArgs(Objects.requireNonNull(defaults));
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

        public Builder filters(@Nullable Output<List<GetSupportedVmwareSoftwareVersionsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetSupportedVmwareSoftwareVersionsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetSupportedVmwareSoftwareVersionsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public GetSupportedVmwareSoftwareVersionsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
