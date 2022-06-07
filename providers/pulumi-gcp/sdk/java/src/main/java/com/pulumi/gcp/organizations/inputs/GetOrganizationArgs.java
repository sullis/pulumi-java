// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOrganizationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationArgs Empty = new GetOrganizationArgs();

    /**
     * The domain name of the Organization.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The domain name of the Organization.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * The Organization&#39;s numeric ID, including an optional `organizations/` prefix.
     * 
     */
    @Import(name="organization")
    private @Nullable Output<String> organization;

    /**
     * @return The Organization&#39;s numeric ID, including an optional `organizations/` prefix.
     * 
     */
    public Optional<Output<String>> organization() {
        return Optional.ofNullable(this.organization);
    }

    private GetOrganizationArgs() {}

    private GetOrganizationArgs(GetOrganizationArgs $) {
        this.domain = $.domain;
        this.organization = $.organization;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationArgs $;

        public Builder() {
            $ = new GetOrganizationArgs();
        }

        public Builder(GetOrganizationArgs defaults) {
            $ = new GetOrganizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The domain name of the Organization.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain name of the Organization.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param organization The Organization&#39;s numeric ID, including an optional `organizations/` prefix.
         * 
         * @return builder
         * 
         */
        public Builder organization(@Nullable Output<String> organization) {
            $.organization = organization;
            return this;
        }

        /**
         * @param organization The Organization&#39;s numeric ID, including an optional `organizations/` prefix.
         * 
         * @return builder
         * 
         */
        public Builder organization(String organization) {
            return organization(Output.of(organization));
        }

        public GetOrganizationArgs build() {
            return $;
        }
    }

}
