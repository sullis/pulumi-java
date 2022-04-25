// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DomainNameApiAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainNameApiAssociationArgs Empty = new DomainNameApiAssociationArgs();

    /**
     * The API ID.
     * 
     */
    @Import(name="apiId", required=true)
    private Output<String> apiId;

    /**
     * @return The API ID.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * The Appsync domain name.
     * 
     */
    @Import(name="domainName", required=true)
    private Output<String> domainName;

    /**
     * @return The Appsync domain name.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    private DomainNameApiAssociationArgs() {}

    private DomainNameApiAssociationArgs(DomainNameApiAssociationArgs $) {
        this.apiId = $.apiId;
        this.domainName = $.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainNameApiAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainNameApiAssociationArgs $;

        public Builder() {
            $ = new DomainNameApiAssociationArgs();
        }

        public Builder(DomainNameApiAssociationArgs defaults) {
            $ = new DomainNameApiAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId The API ID.
         * 
         * @return builder
         * 
         */
        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId The API ID.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param domainName The Appsync domain name.
         * 
         * @return builder
         * 
         */
        public Builder domainName(Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The Appsync domain name.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        public DomainNameApiAssociationArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            return $;
        }
    }

}
