// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.codeartifact;

import com.pulumi.awsnative.codeartifact.inputs.RepositoryTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryArgs Empty = new RepositoryArgs();

    /**
     * A text description of the repository.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A text description of the repository.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A list of external connections associated with the repository.
     * 
     */
    @Import(name="externalConnections")
    private @Nullable Output<List<String>> externalConnections;

    /**
     * @return A list of external connections associated with the repository.
     * 
     */
    public Optional<Output<List<String>>> externalConnections() {
        return Optional.ofNullable(this.externalConnections);
    }

    /**
     * The access control resource policy on the provided repository.
     * 
     */
    @Import(name="permissionsPolicyDocument")
    private @Nullable Output<Object> permissionsPolicyDocument;

    /**
     * @return The access control resource policy on the provided repository.
     * 
     */
    public Optional<Output<Object>> permissionsPolicyDocument() {
        return Optional.ofNullable(this.permissionsPolicyDocument);
    }

    /**
     * The name of the repository.
     * 
     */
    @Import(name="repositoryName")
    private @Nullable Output<String> repositoryName;

    /**
     * @return The name of the repository.
     * 
     */
    public Optional<Output<String>> repositoryName() {
        return Optional.ofNullable(this.repositoryName);
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<RepositoryTagArgs>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Optional<Output<List<RepositoryTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A list of upstream repositories associated with the repository.
     * 
     */
    @Import(name="upstreams")
    private @Nullable Output<List<String>> upstreams;

    /**
     * @return A list of upstream repositories associated with the repository.
     * 
     */
    public Optional<Output<List<String>>> upstreams() {
        return Optional.ofNullable(this.upstreams);
    }

    private RepositoryArgs() {}

    private RepositoryArgs(RepositoryArgs $) {
        this.description = $.description;
        this.externalConnections = $.externalConnections;
        this.permissionsPolicyDocument = $.permissionsPolicyDocument;
        this.repositoryName = $.repositoryName;
        this.tags = $.tags;
        this.upstreams = $.upstreams;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryArgs $;

        public Builder() {
            $ = new RepositoryArgs();
        }

        public Builder(RepositoryArgs defaults) {
            $ = new RepositoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A text description of the repository.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A text description of the repository.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param externalConnections A list of external connections associated with the repository.
         * 
         * @return builder
         * 
         */
        public Builder externalConnections(@Nullable Output<List<String>> externalConnections) {
            $.externalConnections = externalConnections;
            return this;
        }

        /**
         * @param externalConnections A list of external connections associated with the repository.
         * 
         * @return builder
         * 
         */
        public Builder externalConnections(List<String> externalConnections) {
            return externalConnections(Output.of(externalConnections));
        }

        /**
         * @param externalConnections A list of external connections associated with the repository.
         * 
         * @return builder
         * 
         */
        public Builder externalConnections(String... externalConnections) {
            return externalConnections(List.of(externalConnections));
        }

        /**
         * @param permissionsPolicyDocument The access control resource policy on the provided repository.
         * 
         * @return builder
         * 
         */
        public Builder permissionsPolicyDocument(@Nullable Output<Object> permissionsPolicyDocument) {
            $.permissionsPolicyDocument = permissionsPolicyDocument;
            return this;
        }

        /**
         * @param permissionsPolicyDocument The access control resource policy on the provided repository.
         * 
         * @return builder
         * 
         */
        public Builder permissionsPolicyDocument(Object permissionsPolicyDocument) {
            return permissionsPolicyDocument(Output.of(permissionsPolicyDocument));
        }

        /**
         * @param repositoryName The name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder repositoryName(@Nullable Output<String> repositoryName) {
            $.repositoryName = repositoryName;
            return this;
        }

        /**
         * @param repositoryName The name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder repositoryName(String repositoryName) {
            return repositoryName(Output.of(repositoryName));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<RepositoryTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<RepositoryTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(RepositoryTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param upstreams A list of upstream repositories associated with the repository.
         * 
         * @return builder
         * 
         */
        public Builder upstreams(@Nullable Output<List<String>> upstreams) {
            $.upstreams = upstreams;
            return this;
        }

        /**
         * @param upstreams A list of upstream repositories associated with the repository.
         * 
         * @return builder
         * 
         */
        public Builder upstreams(List<String> upstreams) {
            return upstreams(Output.of(upstreams));
        }

        /**
         * @param upstreams A list of upstream repositories associated with the repository.
         * 
         * @return builder
         * 
         */
        public Builder upstreams(String... upstreams) {
            return upstreams(List.of(upstreams));
        }

        public RepositoryArgs build() {
            return $;
        }
    }

}
