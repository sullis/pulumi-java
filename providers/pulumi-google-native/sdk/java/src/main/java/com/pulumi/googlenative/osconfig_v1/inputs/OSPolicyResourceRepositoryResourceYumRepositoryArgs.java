// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a single yum package repository. These are added to a repo file that is managed at `/etc/yum.repos.d/google_osconfig.repo`.
 * 
 */
public final class OSPolicyResourceRepositoryResourceYumRepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceRepositoryResourceYumRepositoryArgs Empty = new OSPolicyResourceRepositoryResourceYumRepositoryArgs();

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
     * A one word, unique name for this repository. This is the `repo id` in the yum config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for resource conflicts.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return A one word, unique name for this repository. This is the `repo id` in the yum config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for resource conflicts.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private OSPolicyResourceRepositoryResourceYumRepositoryArgs() {}

    private OSPolicyResourceRepositoryResourceYumRepositoryArgs(OSPolicyResourceRepositoryResourceYumRepositoryArgs $) {
        this.baseUrl = $.baseUrl;
        this.displayName = $.displayName;
        this.gpgKeys = $.gpgKeys;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourceRepositoryResourceYumRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceRepositoryResourceYumRepositoryArgs $;

        public Builder() {
            $ = new OSPolicyResourceRepositoryResourceYumRepositoryArgs();
        }

        public Builder(OSPolicyResourceRepositoryResourceYumRepositoryArgs defaults) {
            $ = new OSPolicyResourceRepositoryResourceYumRepositoryArgs(Objects.requireNonNull(defaults));
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
         * @param id A one word, unique name for this repository. This is the `repo id` in the yum config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for resource conflicts.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id A one word, unique name for this repository. This is the `repo id` in the yum config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for resource conflicts.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public OSPolicyResourceRepositoryResourceYumRepositoryArgs build() {
            $.baseUrl = Objects.requireNonNull($.baseUrl, "expected parameter 'baseUrl' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
