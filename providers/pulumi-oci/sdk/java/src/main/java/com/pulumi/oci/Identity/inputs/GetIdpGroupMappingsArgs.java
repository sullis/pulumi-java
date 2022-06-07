// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Identity.inputs.GetIdpGroupMappingsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIdpGroupMappingsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIdpGroupMappingsArgs Empty = new GetIdpGroupMappingsArgs();

    @Import(name="filters")
    private @Nullable Output<List<GetIdpGroupMappingsFilterArgs>> filters;

    public Optional<Output<List<GetIdpGroupMappingsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The OCID of the identity provider.
     * 
     */
    @Import(name="identityProviderId", required=true)
    private Output<String> identityProviderId;

    /**
     * @return The OCID of the identity provider.
     * 
     */
    public Output<String> identityProviderId() {
        return this.identityProviderId;
    }

    private GetIdpGroupMappingsArgs() {}

    private GetIdpGroupMappingsArgs(GetIdpGroupMappingsArgs $) {
        this.filters = $.filters;
        this.identityProviderId = $.identityProviderId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIdpGroupMappingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIdpGroupMappingsArgs $;

        public Builder() {
            $ = new GetIdpGroupMappingsArgs();
        }

        public Builder(GetIdpGroupMappingsArgs defaults) {
            $ = new GetIdpGroupMappingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable Output<List<GetIdpGroupMappingsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetIdpGroupMappingsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetIdpGroupMappingsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param identityProviderId The OCID of the identity provider.
         * 
         * @return builder
         * 
         */
        public Builder identityProviderId(Output<String> identityProviderId) {
            $.identityProviderId = identityProviderId;
            return this;
        }

        /**
         * @param identityProviderId The OCID of the identity provider.
         * 
         * @return builder
         * 
         */
        public Builder identityProviderId(String identityProviderId) {
            return identityProviderId(Output.of(identityProviderId));
        }

        public GetIdpGroupMappingsArgs build() {
            $.identityProviderId = Objects.requireNonNull($.identityProviderId, "expected parameter 'identityProviderId' to be non-null");
            return $;
        }
    }

}
