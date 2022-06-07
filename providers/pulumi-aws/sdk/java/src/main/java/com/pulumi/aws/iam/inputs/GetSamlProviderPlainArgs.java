// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSamlProviderPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSamlProviderPlainArgs Empty = new GetSamlProviderPlainArgs();

    /**
     * The ARN assigned by AWS for the provider.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return The ARN assigned by AWS for the provider.
     * 
     */
    public String arn() {
        return this.arn;
    }

    /**
     * The tags attached to the SAML provider.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return The tags attached to the SAML provider.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetSamlProviderPlainArgs() {}

    private GetSamlProviderPlainArgs(GetSamlProviderPlainArgs $) {
        this.arn = $.arn;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSamlProviderPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSamlProviderPlainArgs $;

        public Builder() {
            $ = new GetSamlProviderPlainArgs();
        }

        public Builder(GetSamlProviderPlainArgs defaults) {
            $ = new GetSamlProviderPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN assigned by AWS for the provider.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param tags The tags attached to the SAML provider.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetSamlProviderPlainArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
