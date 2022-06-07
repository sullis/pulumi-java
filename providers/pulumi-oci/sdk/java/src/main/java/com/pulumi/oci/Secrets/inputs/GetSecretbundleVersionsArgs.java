// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Secrets.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Secrets.inputs.GetSecretbundleVersionsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretbundleVersionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretbundleVersionsArgs Empty = new GetSecretbundleVersionsArgs();

    @Import(name="filters")
    private @Nullable Output<List<GetSecretbundleVersionsFilterArgs>> filters;

    public Optional<Output<List<GetSecretbundleVersionsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The OCID of the secret.
     * 
     */
    @Import(name="secretId", required=true)
    private Output<String> secretId;

    /**
     * @return The OCID of the secret.
     * 
     */
    public Output<String> secretId() {
        return this.secretId;
    }

    private GetSecretbundleVersionsArgs() {}

    private GetSecretbundleVersionsArgs(GetSecretbundleVersionsArgs $) {
        this.filters = $.filters;
        this.secretId = $.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretbundleVersionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretbundleVersionsArgs $;

        public Builder() {
            $ = new GetSecretbundleVersionsArgs();
        }

        public Builder(GetSecretbundleVersionsArgs defaults) {
            $ = new GetSecretbundleVersionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable Output<List<GetSecretbundleVersionsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetSecretbundleVersionsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetSecretbundleVersionsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param secretId The OCID of the secret.
         * 
         * @return builder
         * 
         */
        public Builder secretId(Output<String> secretId) {
            $.secretId = secretId;
            return this;
        }

        /**
         * @param secretId The OCID of the secret.
         * 
         * @return builder
         * 
         */
        public Builder secretId(String secretId) {
            return secretId(Output.of(secretId));
        }

        public GetSecretbundleVersionsArgs build() {
            $.secretId = Objects.requireNonNull($.secretId, "expected parameter 'secretId' to be non-null");
            return $;
        }
    }

}
