// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codeartifact.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepositoryEndpointArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepositoryEndpointArgs Empty = new GetRepositoryEndpointArgs();

    /**
     * The name of the domain that contains the repository.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return The name of the domain that contains the repository.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     * The account number of the AWS account that owns the domain.
     * 
     */
    @Import(name="domainOwner")
    private @Nullable Output<String> domainOwner;

    /**
     * @return The account number of the AWS account that owns the domain.
     * 
     */
    public Optional<Output<String>> domainOwner() {
        return Optional.ofNullable(this.domainOwner);
    }

    /**
     * Which endpoint of a repository to return. A repository has one endpoint for each package format: `npm`, `pypi`, `maven`, and `nuget`.
     * 
     */
    @Import(name="format", required=true)
    private Output<String> format;

    /**
     * @return Which endpoint of a repository to return. A repository has one endpoint for each package format: `npm`, `pypi`, `maven`, and `nuget`.
     * 
     */
    public Output<String> format() {
        return this.format;
    }

    /**
     * The name of the repository.
     * 
     */
    @Import(name="repository", required=true)
    private Output<String> repository;

    /**
     * @return The name of the repository.
     * 
     */
    public Output<String> repository() {
        return this.repository;
    }

    private GetRepositoryEndpointArgs() {}

    private GetRepositoryEndpointArgs(GetRepositoryEndpointArgs $) {
        this.domain = $.domain;
        this.domainOwner = $.domainOwner;
        this.format = $.format;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepositoryEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepositoryEndpointArgs $;

        public Builder() {
            $ = new GetRepositoryEndpointArgs();
        }

        public Builder(GetRepositoryEndpointArgs defaults) {
            $ = new GetRepositoryEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The name of the domain that contains the repository.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The name of the domain that contains the repository.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param domainOwner The account number of the AWS account that owns the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainOwner(@Nullable Output<String> domainOwner) {
            $.domainOwner = domainOwner;
            return this;
        }

        /**
         * @param domainOwner The account number of the AWS account that owns the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainOwner(String domainOwner) {
            return domainOwner(Output.of(domainOwner));
        }

        /**
         * @param format Which endpoint of a repository to return. A repository has one endpoint for each package format: `npm`, `pypi`, `maven`, and `nuget`.
         * 
         * @return builder
         * 
         */
        public Builder format(Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Which endpoint of a repository to return. A repository has one endpoint for each package format: `npm`, `pypi`, `maven`, and `nuget`.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param repository The name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder repository(Output<String> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository The name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        public GetRepositoryEndpointArgs build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            $.format = Objects.requireNonNull($.format, "expected parameter 'format' to be non-null");
            $.repository = Objects.requireNonNull($.repository, "expected parameter 'repository' to be non-null");
            return $;
        }
    }

}
