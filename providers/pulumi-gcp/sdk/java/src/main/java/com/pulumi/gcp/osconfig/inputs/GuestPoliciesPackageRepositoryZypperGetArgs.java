// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GuestPoliciesPackageRepositoryZypperGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesPackageRepositoryZypperGetArgs Empty = new GuestPoliciesPackageRepositoryZypperGetArgs();

    /**
     * The location of the repository directory.
     * 
     */
    @Import(name="baseUrl", required=true)
    private Output<String> baseUrl;

    /**
     * @return The location of the repository directory.
     * 
     */
    public Output<String> baseUrl() {
        return this.baseUrl;
    }

    /**
     * The display name of the repository.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name of the repository.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * URIs of GPG keys.
     * 
     */
    @Import(name="gpgKeys")
    private @Nullable Output<List<String>> gpgKeys;

    /**
     * @return URIs of GPG keys.
     * 
     */
    public Optional<Output<List<String>>> gpgKeys() {
        return Optional.ofNullable(this.gpgKeys);
    }

    /**
     * Id of the artifact, which the installation and update steps of this recipe can reference.
     * Artifacts in a recipe cannot have the same id.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Id of the artifact, which the installation and update steps of this recipe can reference.
     * Artifacts in a recipe cannot have the same id.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GuestPoliciesPackageRepositoryZypperGetArgs() {}

    private GuestPoliciesPackageRepositoryZypperGetArgs(GuestPoliciesPackageRepositoryZypperGetArgs $) {
        this.baseUrl = $.baseUrl;
        this.displayName = $.displayName;
        this.gpgKeys = $.gpgKeys;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuestPoliciesPackageRepositoryZypperGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuestPoliciesPackageRepositoryZypperGetArgs $;

        public Builder() {
            $ = new GuestPoliciesPackageRepositoryZypperGetArgs();
        }

        public Builder(GuestPoliciesPackageRepositoryZypperGetArgs defaults) {
            $ = new GuestPoliciesPackageRepositoryZypperGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseUrl The location of the repository directory.
         * 
         * @return builder
         * 
         */
        public Builder baseUrl(Output<String> baseUrl) {
            $.baseUrl = baseUrl;
            return this;
        }

        /**
         * @param baseUrl The location of the repository directory.
         * 
         * @return builder
         * 
         */
        public Builder baseUrl(String baseUrl) {
            return baseUrl(Output.of(baseUrl));
        }

        /**
         * @param displayName The display name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param gpgKeys URIs of GPG keys.
         * 
         * @return builder
         * 
         */
        public Builder gpgKeys(@Nullable Output<List<String>> gpgKeys) {
            $.gpgKeys = gpgKeys;
            return this;
        }

        /**
         * @param gpgKeys URIs of GPG keys.
         * 
         * @return builder
         * 
         */
        public Builder gpgKeys(List<String> gpgKeys) {
            return gpgKeys(Output.of(gpgKeys));
        }

        /**
         * @param gpgKeys URIs of GPG keys.
         * 
         * @return builder
         * 
         */
        public Builder gpgKeys(String... gpgKeys) {
            return gpgKeys(List.of(gpgKeys));
        }

        /**
         * @param id Id of the artifact, which the installation and update steps of this recipe can reference.
         * Artifacts in a recipe cannot have the same id.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Id of the artifact, which the installation and update steps of this recipe can reference.
         * Artifacts in a recipe cannot have the same id.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GuestPoliciesPackageRepositoryZypperGetArgs build() {
            $.baseUrl = Objects.requireNonNull($.baseUrl, "expected parameter 'baseUrl' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
