// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Identity.inputs.GetAuthTokensFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAuthTokensArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuthTokensArgs Empty = new GetAuthTokensArgs();

    @Import(name="filters")
    private @Nullable Output<List<GetAuthTokensFilterArgs>> filters;

    public Optional<Output<List<GetAuthTokensFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The OCID of the user.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return The OCID of the user.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private GetAuthTokensArgs() {}

    private GetAuthTokensArgs(GetAuthTokensArgs $) {
        this.filters = $.filters;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuthTokensArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuthTokensArgs $;

        public Builder() {
            $ = new GetAuthTokensArgs();
        }

        public Builder(GetAuthTokensArgs defaults) {
            $ = new GetAuthTokensArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable Output<List<GetAuthTokensFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetAuthTokensFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetAuthTokensFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param userId The OCID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The OCID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public GetAuthTokensArgs build() {
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
