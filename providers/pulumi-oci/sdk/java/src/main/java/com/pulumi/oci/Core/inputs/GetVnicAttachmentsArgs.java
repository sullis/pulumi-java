// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.GetVnicAttachmentsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVnicAttachmentsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVnicAttachmentsArgs Empty = new GetVnicAttachmentsArgs();

    /**
     * The name of the availability domain.  Example: `Uocm:PHX-AD-1`
     * 
     */
    @Import(name="availabilityDomain")
    private @Nullable Output<String> availabilityDomain;

    /**
     * @return The name of the availability domain.  Example: `Uocm:PHX-AD-1`
     * 
     */
    public Optional<Output<String>> availabilityDomain() {
        return Optional.ofNullable(this.availabilityDomain);
    }

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
    private @Nullable Output<List<GetVnicAttachmentsFilterArgs>> filters;

    public Optional<Output<List<GetVnicAttachmentsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The OCID of the instance.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The OCID of the instance.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The OCID of the VNIC.
     * 
     */
    @Import(name="vnicId")
    private @Nullable Output<String> vnicId;

    /**
     * @return The OCID of the VNIC.
     * 
     */
    public Optional<Output<String>> vnicId() {
        return Optional.ofNullable(this.vnicId);
    }

    private GetVnicAttachmentsArgs() {}

    private GetVnicAttachmentsArgs(GetVnicAttachmentsArgs $) {
        this.availabilityDomain = $.availabilityDomain;
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.instanceId = $.instanceId;
        this.vnicId = $.vnicId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVnicAttachmentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVnicAttachmentsArgs $;

        public Builder() {
            $ = new GetVnicAttachmentsArgs();
        }

        public Builder(GetVnicAttachmentsArgs defaults) {
            $ = new GetVnicAttachmentsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityDomain The name of the availability domain.  Example: `Uocm:PHX-AD-1`
         * 
         * @return builder
         * 
         */
        public Builder availabilityDomain(@Nullable Output<String> availabilityDomain) {
            $.availabilityDomain = availabilityDomain;
            return this;
        }

        /**
         * @param availabilityDomain The name of the availability domain.  Example: `Uocm:PHX-AD-1`
         * 
         * @return builder
         * 
         */
        public Builder availabilityDomain(String availabilityDomain) {
            return availabilityDomain(Output.of(availabilityDomain));
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

        public Builder filters(@Nullable Output<List<GetVnicAttachmentsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetVnicAttachmentsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetVnicAttachmentsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param instanceId The OCID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The OCID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param vnicId The OCID of the VNIC.
         * 
         * @return builder
         * 
         */
        public Builder vnicId(@Nullable Output<String> vnicId) {
            $.vnicId = vnicId;
            return this;
        }

        /**
         * @param vnicId The OCID of the VNIC.
         * 
         * @return builder
         * 
         */
        public Builder vnicId(String vnicId) {
            return vnicId(Output.of(vnicId));
        }

        public GetVnicAttachmentsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
