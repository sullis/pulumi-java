// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Blockchain.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Blockchain.inputs.GetBlockchainPlatformPatchesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBlockchainPlatformPatchesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBlockchainPlatformPatchesPlainArgs Empty = new GetBlockchainPlatformPatchesPlainArgs();

    /**
     * Unique service identifier.
     * 
     */
    @Import(name="blockchainPlatformId", required=true)
    private String blockchainPlatformId;

    /**
     * @return Unique service identifier.
     * 
     */
    public String blockchainPlatformId() {
        return this.blockchainPlatformId;
    }

    @Import(name="filters")
    private @Nullable List<GetBlockchainPlatformPatchesFilter> filters;

    public Optional<List<GetBlockchainPlatformPatchesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetBlockchainPlatformPatchesPlainArgs() {}

    private GetBlockchainPlatformPatchesPlainArgs(GetBlockchainPlatformPatchesPlainArgs $) {
        this.blockchainPlatformId = $.blockchainPlatformId;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBlockchainPlatformPatchesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBlockchainPlatformPatchesPlainArgs $;

        public Builder() {
            $ = new GetBlockchainPlatformPatchesPlainArgs();
        }

        public Builder(GetBlockchainPlatformPatchesPlainArgs defaults) {
            $ = new GetBlockchainPlatformPatchesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockchainPlatformId Unique service identifier.
         * 
         * @return builder
         * 
         */
        public Builder blockchainPlatformId(String blockchainPlatformId) {
            $.blockchainPlatformId = blockchainPlatformId;
            return this;
        }

        public Builder filters(@Nullable List<GetBlockchainPlatformPatchesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetBlockchainPlatformPatchesFilter... filters) {
            return filters(List.of(filters));
        }

        public GetBlockchainPlatformPatchesPlainArgs build() {
            $.blockchainPlatformId = Objects.requireNonNull($.blockchainPlatformId, "expected parameter 'blockchainPlatformId' to be non-null");
            return $;
        }
    }

}
