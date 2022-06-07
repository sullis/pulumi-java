// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.GetBootVolumesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBootVolumesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBootVolumesPlainArgs Empty = new GetBootVolumesPlainArgs();

    /**
     * The name of the availability domain.  Example: `Uocm:PHX-AD-1`
     * 
     */
    @Import(name="availabilityDomain", required=true)
    private String availabilityDomain;

    /**
     * @return The name of the availability domain.  Example: `Uocm:PHX-AD-1`
     * 
     */
    public String availabilityDomain() {
        return this.availabilityDomain;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable List<GetBootVolumesFilter> filters;

    public Optional<List<GetBootVolumesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The OCID of the volume group.
     * 
     */
    @Import(name="volumeGroupId")
    private @Nullable String volumeGroupId;

    /**
     * @return The OCID of the volume group.
     * 
     */
    public Optional<String> volumeGroupId() {
        return Optional.ofNullable(this.volumeGroupId);
    }

    private GetBootVolumesPlainArgs() {}

    private GetBootVolumesPlainArgs(GetBootVolumesPlainArgs $) {
        this.availabilityDomain = $.availabilityDomain;
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.volumeGroupId = $.volumeGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBootVolumesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBootVolumesPlainArgs $;

        public Builder() {
            $ = new GetBootVolumesPlainArgs();
        }

        public Builder(GetBootVolumesPlainArgs defaults) {
            $ = new GetBootVolumesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityDomain The name of the availability domain.  Example: `Uocm:PHX-AD-1`
         * 
         * @return builder
         * 
         */
        public Builder availabilityDomain(String availabilityDomain) {
            $.availabilityDomain = availabilityDomain;
            return this;
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder filters(@Nullable List<GetBootVolumesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetBootVolumesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param volumeGroupId The OCID of the volume group.
         * 
         * @return builder
         * 
         */
        public Builder volumeGroupId(@Nullable String volumeGroupId) {
            $.volumeGroupId = volumeGroupId;
            return this;
        }

        public GetBootVolumesPlainArgs build() {
            $.availabilityDomain = Objects.requireNonNull($.availabilityDomain, "expected parameter 'availabilityDomain' to be non-null");
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
