// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.GetShapesFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetShapesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetShapesArgs Empty = new GetShapesArgs();

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
    private @Nullable Output<List<GetShapesFilterArgs>> filters;

    public Optional<Output<List<GetShapesFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an image.
     * 
     */
    @Import(name="imageId")
    private @Nullable Output<String> imageId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an image.
     * 
     */
    public Optional<Output<String>> imageId() {
        return Optional.ofNullable(this.imageId);
    }

    private GetShapesArgs() {}

    private GetShapesArgs(GetShapesArgs $) {
        this.availabilityDomain = $.availabilityDomain;
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.imageId = $.imageId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetShapesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetShapesArgs $;

        public Builder() {
            $ = new GetShapesArgs();
        }

        public Builder(GetShapesArgs defaults) {
            $ = new GetShapesArgs(Objects.requireNonNull(defaults));
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

        public Builder filters(@Nullable Output<List<GetShapesFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetShapesFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetShapesFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param imageId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an image.
         * 
         * @return builder
         * 
         */
        public Builder imageId(@Nullable Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an image.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        public GetShapesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
